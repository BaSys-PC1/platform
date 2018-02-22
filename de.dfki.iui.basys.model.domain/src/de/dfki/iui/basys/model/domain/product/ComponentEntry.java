/**
 */
package de.dfki.iui.basys.model.domain.product;

import de.dfki.iui.basys.model.domain.material.Material;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.product.ComponentEntry#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getComponentEntry()
 * @model
 * @generated
 */
public interface ComponentEntry extends BOMEntry {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' reference.
	 * @see #setMaterial(Material)
	 * @see de.dfki.iui.basys.model.domain.product.ProductPackage#getComponentEntry_Material()
	 * @model required="true"
	 * @generated
	 */
	Material getMaterial();

	/**
	 * Sets the value of the '{@link de.dfki.iui.basys.model.domain.product.ComponentEntry#getMaterial <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(Material value);

} // ComponentEntry
