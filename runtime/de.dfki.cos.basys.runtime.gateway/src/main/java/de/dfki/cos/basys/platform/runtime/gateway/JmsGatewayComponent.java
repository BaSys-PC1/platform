package de.dfki.cos.basys.platform.runtime.gateway;

import java.util.Properties;
import java.util.function.Supplier;

import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;

public class JmsGatewayComponent extends AbstractGatewayComponent {

	public JmsGatewayComponent(Properties config) {
		super(config, new JmsGateway(config));
	}

}
