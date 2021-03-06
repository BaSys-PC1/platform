package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.List;
import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition;
import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.cos.basys.platform.runtime.services.ProcessDefinitionManager;

public class ProcessDefinitionManagerImpl extends EmfBasysComponent implements ProcessDefinitionManager {

	public ProcessDefinitionManagerImpl(Properties config) {
		super(config);
	}

	@Override
	public ProcessDefinition getProcessDefinition(String id) {
		return getService().getEntity(id);
	}

	@Override
	public ProcessDefinition getProcessDefinitionByProductVariant(String productVariantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessDefinition> getAllProcessDefinitions() {
		return getService().getAllEntities(ProcessdefinitionPackage.eINSTANCE.getProcessDefinition(), false);
	}

}
