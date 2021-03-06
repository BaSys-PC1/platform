/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition;

import org.eclipse.emf.ecore.EObject;

import de.dfki.cos.basys.platform.model.domain.productdefinition.BOMEntry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Used Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial#getCount <em>Count</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial#getBomEntry <em>Bom Entry</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getUsedMaterial()
 * @model
 * @generated
 */
public interface UsedMaterial extends EObject {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getUsedMaterial_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Bom Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bom Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bom Entry</em>' reference.
	 * @see #setBomEntry(BOMEntry)
	 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage#getUsedMaterial_BomEntry()
	 * @model required="true"
	 * @generated
	 */
	BOMEntry getBomEntry();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.processdefinition.UsedMaterial#getBomEntry <em>Bom Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Entry</em>' reference.
	 * @see #getBomEntry()
	 * @generated
	 */
	void setBomEntry(BOMEntry value);

} // UsedMaterial
