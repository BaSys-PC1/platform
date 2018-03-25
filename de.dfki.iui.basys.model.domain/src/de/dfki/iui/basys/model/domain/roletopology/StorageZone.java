/**
 */
package de.dfki.iui.basys.model.domain.roletopology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.StorageZone#getStorageUnits <em>Storage Units</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getStorageZone()
 * @model
 * @generated
 */
public interface StorageZone extends WorkCenter {
	/**
	 * Returns the value of the '<em><b>Storage Units</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.basys.model.domain.roletopology.StorageUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Units</em>' containment reference list.
	 * @see de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage#getStorageZone_StorageUnits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StorageUnit> getStorageUnits();

} // StorageZone
