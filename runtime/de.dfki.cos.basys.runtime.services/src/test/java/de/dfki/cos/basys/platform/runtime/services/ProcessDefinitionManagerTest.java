package de.dfki.cos.basys.platform.runtime.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessDefinition;
import de.dfki.cos.basys.platform.runtime.services.impl.ProcessDefinitionManagerImpl;

public class ProcessDefinitionManagerTest extends BaseComponentTest {

	ProcessDefinitionManager service = null;
	
	@Override
	@Before
	public void setUp() throws Exception {		
		super.setUp();
		service = (ProcessDefinitionManager) componentManager.getComponentById("process-definition-manager");
	}

	@Override
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetProcessDefinition() {
		String id = "_gDtzsFI-EeiyuY0zVI-6mg";
		ProcessDefinition processDefinition = service.getProcessDefinition(id);

		assertEquals(id, processDefinition.getId());
	}

	@Test
	public void testGetProcessDefinitionByProductVariant() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetAllProcessDefinitions() {
		List<ProcessDefinition> processDefinitions = service.getAllProcessDefinitions();
		assertNotNull(processDefinitions);
		List<String> ids = processDefinitions.stream().map(processDefinition -> processDefinition.getId()).sorted().collect(Collectors.toList());

		List<String> expectedIds = new LinkedList<>(Arrays.asList("_gDtzsFI-EeiyuY0zVI-6mg"));
		expectedIds = expectedIds.stream().sorted().collect(Collectors.toList());

		Assert.assertArrayEquals(expectedIds.toArray(), ids.toArray());
	}

}
