package de.dfki.cos.basys.platform.osgi.services.internal;

import java.util.List;
import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import de.dfki.cos.basys.common.component.manager.ComponentManager;
import de.dfki.cos.basys.common.component.manager.ComponentManagerException;
import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition;
import de.dfki.cos.basys.platform.osgi.services.OsgiComponentWrapper;
import de.dfki.cos.basys.platform.runtime.services.ProcessDefinitionManager;
import de.dfki.cos.basys.platform.runtime.services.impl.ProcessDefinitionManagerImpl;

@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public final class ProcessDefinitionManagerServiceImpl extends OsgiComponentWrapper implements ProcessDefinitionManager {

	ComponentManager componentManager;
	ProcessDefinitionManagerImpl impl;

	public ProcessDefinitionManagerServiceImpl() {
		LOGGER.info(getClass().getSimpleName() + " created");
	}

	@Override
	@Activate
	public void activate(ComponentContext context, Map<String, Object> properties) {
		super.activate(context, properties);

		impl = new ProcessDefinitionManagerImpl(config);
		try {
			componentManager.addComponent(impl);
		} catch (ComponentManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	@Modified
	public void modified(ComponentContext context, Map<String, Object> properties) {
		if (super.context == null)
			return;

		super.modified(context, properties);
	}

	@Override
	@Deactivate
	public void deactivate(ComponentContext context, int reason) {
		super.deactivate(context, reason);
	}

	@Reference
	void setComponentManager(ComponentManager componentManager) {
		this.componentManager = componentManager;
	}

	void unsetComponentManager(ComponentManager componentManager) {
		this.componentManager = null;
	}
	
	/*
	 * Service interface
	 */
	
	@Override
	public ProcessDefinition getProcessDefinition(String id) {
		return impl.getProcessDefinition(id);
	}

	@Override
	public ProcessDefinition getProcessDefinitionByProductVariant(String productVariantId) {
		return impl.getProcessDefinitionByProductVariant(productVariantId);
	}

	@Override
	public List<ProcessDefinition> getAllProcessDefinitions() {
		return impl.getAllProcessDefinitions();
	}

	
}
