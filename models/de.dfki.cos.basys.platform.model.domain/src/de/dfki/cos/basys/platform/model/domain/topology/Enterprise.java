/**
 */
package de.dfki.cos.basys.platform.model.domain.topology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.topology.Enterprise#getSites <em>Sites</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getEnterprise()
 * @model
 * @generated
 */
public interface Enterprise extends TopologyElement {
	/**
	 * Returns the value of the '<em><b>Sites</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.domain.topology.Site}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sites</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage#getEnterprise_Sites()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Site> getSites();

} // Enterprise
