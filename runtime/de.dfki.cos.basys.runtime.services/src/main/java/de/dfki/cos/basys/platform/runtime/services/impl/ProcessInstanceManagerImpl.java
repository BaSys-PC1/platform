package de.dfki.cos.basys.platform.runtime.services.impl;

import java.util.Properties;

import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstance;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessInstanceStore;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessinstancePackage;
import de.dfki.cos.basys.platform.runtime.services.ProcessInstanceManager;

public class ProcessInstanceManagerImpl extends EmfBasysComponent implements ProcessInstanceManager {

	public ProcessInstanceManagerImpl(Properties config) {
		super(config);
	}

	@Override
	public ProcessInstance getProcessInstance(String id) {
		return getService().getEntity(id);
	}

	@Override
	public ProcessInstance getProcessInstanceByProductInstance(String productInstanceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProcessInstanceStore getProcessInstanceStore() {
		ProcessInstanceStore store = getService().getFirstEntity(ProcessinstancePackage.eINSTANCE.getProcessInstanceStore());
		return store;
	}
	
}
