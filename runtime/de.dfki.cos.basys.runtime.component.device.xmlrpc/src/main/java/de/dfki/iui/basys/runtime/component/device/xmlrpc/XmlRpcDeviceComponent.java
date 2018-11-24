package de.dfki.iui.basys.runtime.component.device.xmlrpc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.device.DeviceComponent;


public abstract class XmlRpcDeviceComponent extends DeviceComponent {

	protected XmlRpcClient client;
	
	public XmlRpcDeviceComponent(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public void connectToExternal() throws ComponentException {
		client = new XmlRpcClient();
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        try {
            config.setServerURL(new URL(getConfig().getExternalConnectionString()));
            client.setConfig(config);
        } catch (MalformedURLException ex) {
           LOGGER.error("Exception occurred: {}", ex.toString());
        }		
	}

//	@Override
//	public void disconnectFromExternal() {
//	}
	
}
