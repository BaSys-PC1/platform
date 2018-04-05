package de.dfki.iui.basys.runtime.component.manager;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.dfki.iui.basys.runtime.component.BaseComponent;
import de.dfki.iui.basys.runtime.component.Component;
import de.dfki.iui.basys.runtime.component.ComponentConfiguration;

public class ComponentManagerImpl extends BaseComponent implements ComponentManager {

	private Map<String, Component> components = new HashMap<>();
	
	public ComponentManagerImpl(ComponentConfiguration config) {
		super(config);
	}

	@Override
	public List<Component> getLocalComponents() {
		return new ArrayList<Component>(components.values());
	}


	@Override
	public Component getLocalComponentById(String id) {
		return components.get(id);
	}


	@Override
	public Component getLocalComponentByName(String name) {
		for (Component component : components.values()) {
			if (component.getName().equals(name))
				return component;
		}		
		return null;
	}


	@Override
	public void createLocalComponent(ComponentConfiguration config) throws ComponentManagerException {
		Class c = null;
		try {
			c = Class.forName(config.getComponentImplementationJavaClass());
		} catch (ClassNotFoundException e) {
			throw new ComponentManagerException(e);
		}

		Component component = null;

		try {
			Constructor<Component> constructor = c.getConstructor(ComponentConfiguration.class);
			component = constructor.newInstance(config);
			components.put(component.getId(), component);				
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			throw new ComponentManagerException(e);
		}

		component.activate(context);		
	}


	@Override
	public void deleteLocalComponent(String id) throws ComponentManagerException {
		Component c = components.remove(id);
		if (c != null)
			c.deactivate();
		else 
			throw new ComponentManagerException(String.format("No component registered with id %s", id));
	}

}
