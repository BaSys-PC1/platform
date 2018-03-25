/**
 */
package de.dfki.iui.basys.model.domain.topology;

import de.dfki.iui.basys.model.base.Entity;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.topology.WorkCenter#getEquipmentModules <em>Equipment Modules</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getWorkCenter()
 * @model abstract="true"
 * @generated
 */
public interface WorkCenter extends Entity {

	/**
	 * Returns the value of the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.topology.EquipmentModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Modules</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#getWorkCenter_EquipmentModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<EquipmentModule> getEquipmentModules();
} // WorkCenter
