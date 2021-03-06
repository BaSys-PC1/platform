package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStore;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage;
import de.dfki.cos.basys.platform.runtime.services.ProductInstanceManager;

public class ProductInstanceManagerImpl extends EmfBasysComponent implements ProductInstanceManager {

	public ProductInstanceManagerImpl(Properties config) {
		super(config);
	}

	@Override
	public ProductInstance getProductInstance(String id) {
		return getService().getEntity(id);
	}

	@Override
	public ProductInstanceStore getProductInstanceStore() {
		ProductInstanceStore store = getService().getFirstEntity(ProductinstancePackage.eINSTANCE.getProductInstanceStore());
		return store;
	}

	@Override
	public void addProductInstance(ProductInstance productInstance) {
		ProductInstanceStore store = getProductInstanceStore();
		//TODO: support multiple products at a time
		//FIXME: why clear?
		store.getProductInstances().clear();
		store.getProductInstances().add(productInstance);
	}

}
