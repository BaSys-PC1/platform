/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.dfki.cos.basys.platform.model.domain.capability.Capability;
import de.dfki.cos.basys.platform.model.domain.productdefinition.BOMEntry;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ManufacturingCapabilityVariant;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manufacturing Capability Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ManufacturingCapabilityVariantImpl extends CapabilityVariantImpl<BOMEntry, Capability> implements ManufacturingCapabilityVariant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingCapabilityVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceinstancePackage.Literals.MANUFACTURING_CAPABILITY_VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<BOMEntry> getAppliedOn() {
		if (appliedOn == null) {
			appliedOn = new EObjectResolvingEList<BOMEntry>(BOMEntry.class, this, ResourceinstancePackage.MANUFACTURING_CAPABILITY_VARIANT__APPLIED_ON);
		}
		return appliedOn;
	}

} //ManufacturingCapabilityVariantImpl
