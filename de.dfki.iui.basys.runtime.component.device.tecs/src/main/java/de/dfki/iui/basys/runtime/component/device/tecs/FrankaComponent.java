package de.dfki.iui.basys.runtime.component.device.tecs;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;

import de.dfki.iui.basys.model.runtime.component.CapabilityRequest;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.packml.UnitConfiguration;
import de.dfki.iui.hrc.franka.ActionException;
import de.dfki.iui.hrc.franka.Franka;
import de.dfki.iui.hrc.franka.FrankaConstants;
import de.dfki.iui.hrc.franka.FrankaState;
import de.dfki.iui.hrc.franka.FrankaStatus;
import de.dfki.iui.hrc.franka.LoadException;
import de.dfki.iui.hrc.franka.MoveException;
import de.dfki.iui.hrc.general3d.TransformationMatrix;
import de.dfki.iui.hrc.hybritcommand.CommandResponse;
import de.dfki.tecs.Event;

public class FrankaComponent extends TecsDeviceComponent{
	
	private FrankaTECS client;
	
	protected enum ACTION{
		// fill enums here
		;
		
		private final String action;
		
		private ACTION(String a) {
			action = a;
		}
		
		@Override
		public String toString() {
			return action;
		}
	}
	
	protected enum OBJECT_ID{
		// fill enums here
		;
		
		private final String objectId;
		
		private OBJECT_ID(String id) {
			objectId = id;
		}
		
		@Override
		public String toString() {
			return objectId;
		}
	}
	
	protected enum POSITION{
		//fill here
		;
		
		private final String position;
		
		private POSITION(String p) {
			position = p;
		}
		
		@Override
		public String toString() {
			return position;
		}
	}
	
	public FrankaComponent(ComponentConfiguration config) {
		super(config);
	}
	
	@Override
	public void connectToExternal() throws ComponentException {
		super.connectToExternal();
		client = new FrankaTECS(protocol);
	}

	@Override
	protected UnitConfiguration translateCapabilityRequest(CapabilityRequest req) {
		UnitConfiguration config = new UnitConfiguration();

		// TODO: translate
		int positionIndex = 0;
		config.setRecipe(positionIndex);

		return config;
	}
	
	@Override
	public void onResetting() {
		close();
		try {
			open();
			client.MoveToKnownPosition(FrankaConstants.KNOWN_POSE_1);
			onExecute(); // block until in KnownPose1
		} catch (TException e) {
			e.printStackTrace();
			setErrorCode(1);
			stop();
		}
	}

	@Override
	public void onStarting() {
		try {
			client.MoveToKnownPosition(FrankaConstants.KNOWN_POSE_2);
		} catch (TException e) {
			e.printStackTrace();
			setErrorCode(1);
			stop();
		}
	}

	@Override
	public void onExecute() {
		try {
			boolean executing = true;
			while(executing) {
				CommandResponse cr = client.getCommandState();
				FrankaState fs = client.getState();
				
				if (fs == FrankaState.Error || fs == FrankaState.Manual) {
					executing = false;
					setErrorCode(1);
					stop();
					break;
				}
				
				switch(cr.state) {
				case ACCEPTED: 
					// wait
					break;
				case ABORTED: 
					executing= false;
					setErrorCode(1);
					stop();
					break;
				case EXECUTING:
					// wait
					break;
				case FINISHED: 
					executing=false;
					break;
				case PAUSED: 
					//?
					break;
				case READY: 
					//?
					break;
				case REJECTED: 
					executing=false;
					setErrorCode(2);
					stop();
					break;
				default: break;
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (TException e) {
			e.printStackTrace();
			setErrorCode(3);
			stop();
		}
	}

	@Override
	public void onCompleting() {}

	@Override
	public void onStopping() {}

	@Override
	public void onAborting() {}

	@Override
	public void onClearing() {
		// perform reconecct
		close();
		try {
			open();
		} catch (TTransportException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onHolding() {}

	@Override
	public void onUnholding() {}

	@Override
	public void onSuspending() {}

	@Override
	public void onUnsuspending() {}

	private class FrankaTECS extends Franka.Client{

		private TProtocol protocol;
		
		public FrankaTECS(TProtocol prot) {
			super(prot);
			protocol = prot;
		}
		
		@Override
		public TransformationMatrix requestM() throws TException {
			return super.requestM();
		}
		
		@Override
		public FrankaStatus getStatus() throws TException {
			return super.getStatus();
		}
		
		@Override
		public FrankaState getState() throws TException {
			return super.getState();
		}
		
		@Override
		public CommandResponse getCommandState() throws TException {
			return super.getCommandState();
		}
		
		@Override
		public CommandResponse Load(String targetPosition) throws LoadException, TException {
			return super.Load(targetPosition);
		}
		
		@Override
		public CommandResponse MoveToKnownPosition(String knownPosition) throws MoveException, TException {
			return super.MoveToKnownPosition(knownPosition);
		}
		
		@Override
		public CommandResponse Recover(String action) throws ActionException, TException {
			return super.Recover(action);
		}
		
		@Override
		public CommandResponse EnterTeachMode(String action) throws TException {
			return super.EnterTeachMode(action);
		}
		
		@Override
		public CommandResponse ExitTeachMode(String action) throws TException {
			return super.ExitTeachMode(action);
		}		
	}

	@Override
	protected void handleTecsEvent(Event event) {}

}
