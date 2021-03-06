package de.dfki.cos.basys.platform.runtime.communication.provider;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelListener;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;

public class TestChannelListener implements ChannelListener {

	private Logger LOGGER = LoggerFactory.getLogger(TestChannelListener.class.getName());

	boolean success;
	String expectedMessage;


	CountDownLatch counter = new CountDownLatch(1);
	
	public TestChannelListener() {

	}

	public TestChannelListener(String msg) {
		expectedMessage = msg;
	}

	public boolean isSuccess() {			
		try {
			counter.await(10,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}

	public String getExpectedMessage() {
		return expectedMessage;
	}

	public void setExpectedMessage(String expectedMessage) {
		this.expectedMessage = expectedMessage;
	}

	@Override
	public void handleMessage(Channel channel, String msg) {
		LOGGER.info("handleMessage: " + msg);
		if (msg.equals(expectedMessage))
			success = true;
		
		counter.countDown();
	}

	@Override
	public void handleNotification(Channel channel, de.dfki.cos.basys.platform.model.runtime.communication.Notification not) {
		LOGGER.info("handleNotification: " + not.getPayload());
		if (not.getPayload().equals(expectedMessage))
			success = true;
		
		counter.countDown();
	}

	@Override
	public Response handleRequest(Channel channel, Request req) {
		LOGGER.info("handleRequest: " + req.getPayload());
		if (req.getPayload().equals(expectedMessage))
			success = true;

		counter.countDown();
		
		Response response = CommFactory.getInstance().createResponse(req.getId(), expectedMessage.toUpperCase());
		return response;
	}

}
