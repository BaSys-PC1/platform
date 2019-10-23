package de.dfki.cos.basys.platform.runtime.services.v2.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.linebalancing.LineBalancingAssignment;
import de.dfki.cos.basys.platform.model.domain.order.Order;
import de.dfki.cos.basys.platform.model.domain.order.OrderPackage;
import de.dfki.cos.basys.platform.model.domain.order.OrderStore;
import de.dfki.cos.basys.platform.runtime.component.v2.emf.EmfBasysComponent;
import de.dfki.cos.basys.platform.runtime.services.OrderManager;

public class OrderManagerImpl extends EmfBasysComponent implements OrderManager {
	
	public OrderManagerImpl(Properties config) {
		super(config);
	}
	
	@Override
	public OrderStore getOrderStore() {
		OrderStore store = client.getFirstEntity(OrderPackage.eINSTANCE.getOrderStore());
		return store;
	}

	@Override
	public Order getOrder(String id) {
		return client.getEntity(id);
	}

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LineBalancingAssignment getOrderAssignment(String id) {
		// TODO Auto-generated method stub
		return null;
	}


}
