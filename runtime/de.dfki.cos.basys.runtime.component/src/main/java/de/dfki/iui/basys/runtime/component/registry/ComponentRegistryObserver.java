package de.dfki.iui.basys.runtime.component.registry;

import de.dfki.iui.basys.model.runtime.component.ComponentInfo;

public interface ComponentRegistryObserver {

	void handleComponentAdded(ComponentInfo info);

	void handleComponentUpdated(ComponentInfo info);

	void handleComponentRemoved(ComponentInfo info);
}