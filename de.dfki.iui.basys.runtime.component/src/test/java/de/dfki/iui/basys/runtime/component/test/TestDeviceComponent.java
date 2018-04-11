package de.dfki.iui.basys.runtime.component.test;

import de.dfki.iui.basys.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;
import de.dfki.iui.basys.runtime.component.test.TestHandler.Path;
import de.dfki.iui.basys.runtime.component.ComponentException;

public class TestDeviceComponent extends DeviceComponent {

	enum Path {NORMAL, SUSPEND, HOLD, STOP_ON_ERROR, STOP_ON_EMERGENCY}
	
	public Path path = Path.NORMAL;
	
	public TestDeviceComponent(ComponentConfiguration config) {
		super(config);
	}
	
	@Override
	public void onResetting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStarting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onExecute() {
		
		
		
		switch (path) {
		case HOLD:
			hold();
			break;
		case SUSPEND:
			suspend();
			break;
		case STOP_ON_ERROR:
			stop();
			break;
		case STOP_ON_EMERGENCY:
			abort();
			break;
		case NORMAL:
		default:
			break;
		}

	}

	@Override
	public void onCompleting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onHolding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUnholding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSuspending() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUnsuspending() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAborting() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void onAborted() {
		// TODO Auto-generated method stub
		super.onAborted();
		clear();
	}

	@Override
	public void onClearing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStopping() {
		// TODO Auto-generated method stub

	}

}
