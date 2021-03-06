package de.dfki.cos.basys.platform.runtime.processcontrol.impl;

import java.util.Properties;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.platform.runtime.component.BasysComponent;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentRequest;
import de.dfki.cos.basys.platform.runtime.component.model.ComponentResponse;
import de.dfki.cos.basys.platform.runtime.processcontrol.ComponentRequestExecutionManager;
import de.dfki.cos.basys.platform.runtime.processcontrol.ComponentRequestIssuer;

public class ComponentRequestExecutionManagerImpl extends AbstractComponentRequestExecutionManager {

	public ComponentRequestExecutionManagerImpl(Properties config) {
		super(config);

//		ControlComponentWorker serviceProvider = new ControlComponentWorker(config);
//		serviceManager = new ServiceManagerImpl<ComponentRequestIssuer>(config, serviceProvider);		
	}
	
	@Override
	public CompletableFuture<ComponentResponse> executeComponentRequest(ComponentRequest request) {
		LOGGER.debug("executeComponentRequest");
		ComponentRequestExecutor executor = new ComponentRequestExecutor(request);
		CompletableFuture<ComponentResponse> cf = CompletableFuture.supplyAsync(() -> {
			executor.execute(context);
			return executor.getResponse();
		}, context.getScheduledExecutorService()).thenApply((response) -> {
			getService().handleComponentResponse(response);
			return response;
		}).handle((response, ex) -> {
			if (ex != null) {
				LOGGER.error(ex.getMessage(), ex);
			}
			return response;
		});

		return cf;
	}

//	@Override
//	public void executeComponentRequest(ComponentRequest request, long delay) {
//		context.getScheduledExecutorService().schedule(new Runnable() {
//			@Override
//			public void run() {
//				executeComponentRequest(request);
//			}
//		}, delay, TimeUnit.MILLISECONDS);
//	}

//	@Override
//	public Response handleRequest(Channel channel, Request req) {
//		String payload = req.getPayload();
//		Response res = null;
//		try {
//			ComponentRequest request = JsonUtils.fromString(payload, ComponentRequest.class);
//			ComponentResponse response = scheduleTask(new TaskDescription(request)).get();
//			res = CommFactory.getInstance().createResponse(req.getId(), context.getObjectMapper().writeValueAsString(response));
//		} catch (IOException | InterruptedException | ExecutionException e) {			
//			e.printStackTrace();
//			res.setPayload(e.getMessage());
//		}
//		return res;
//	}
//
//	@Override
//	public void handleNotification(Channel channel, Notification not) {
//		try {
//			EObject payload = JsonUtils.fromString(not.getPayload(), EObject.class);		
//			
//			if (ComponentPackage.eINSTANCE.getComponentRequest().isSuperTypeOf(payload.eClass())) {
//				ComponentRequest request = (ComponentRequest)payload;
//				if (request.getCorrelationId() == null) {
//					request.setCorrelationId(UUID.randomUUID().toString());
//				}
//				scheduleTask(new TaskDescription(request));
//			} 
////			else if (payload.eClass().equals(ComponentPackage.eINSTANCE.getProcessRequest())) {
////				ProcessRequest request = (ProcessRequest)payload;
////				startProcessInstance(request);				
////			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
