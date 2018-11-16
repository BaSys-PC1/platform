package de.dfki.iui.basys.runtime.services.impl;

import de.dfki.iui.basys.model.domain.productinstance.ProductInstance;
import de.dfki.iui.basys.model.domain.productinstance.ProductInstanceStore;
import de.dfki.iui.basys.model.domain.productinstance.ProductinstancePackage;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.component.service.EmfServiceComponent;
import de.dfki.iui.basys.runtime.services.ProductInstanceManager;

public class ProductInstanceManagerImpl extends EmfServiceComponent implements ProductInstanceManager {

	public ProductInstanceManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public ProductInstance getProductInstance(String id) {
		return getEntity(id);
	}

	@Override
	public ProductInstanceStore getProductInstanceStore() {
		ProductInstanceStore store = getFirstEntity(ProductinstancePackage.eINSTANCE.getProductInstanceStore());
		return store;
	}

	@Override
	public void addProductInstance(ProductInstance productInstance) {
		ProductInstanceStore store = getProductInstanceStore();
		//TODO: support multiple products at a time
		store.getProductInstances().clear();
		store.getProductInstances().add(productInstance);
	}

}