/**
 */
package de.dfki.iui.basys.model.domain.roletopology.impl;

import de.dfki.iui.basys.model.base.impl.EntityImpl;

import de.dfki.iui.basys.model.domain.roletopology.DiscreteManufacturingEquipmentModule;
import de.dfki.iui.basys.model.domain.roletopology.RoletopologyPackage;
import de.dfki.iui.basys.model.domain.roletopology.Station;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.basys.model.domain.roletopology.impl.StationImpl#getEquipmentModules <em>Equipment Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StationImpl extends EntityImpl implements Station {
	/**
	 * The cached value of the '{@link #getEquipmentModules() <em>Equipment Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipmentModules()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteManufacturingEquipmentModule> equipmentModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoletopologyPackage.Literals.STATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteManufacturingEquipmentModule> getEquipmentModules() {
		if (equipmentModules == null) {
			equipmentModules = new EObjectContainmentEList<DiscreteManufacturingEquipmentModule>(DiscreteManufacturingEquipmentModule.class, this, RoletopologyPackage.STATION__EQUIPMENT_MODULES);
		}
		return equipmentModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoletopologyPackage.STATION__EQUIPMENT_MODULES:
				return ((InternalEList<?>)getEquipmentModules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoletopologyPackage.STATION__EQUIPMENT_MODULES:
				return getEquipmentModules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RoletopologyPackage.STATION__EQUIPMENT_MODULES:
				getEquipmentModules().clear();
				getEquipmentModules().addAll((Collection<? extends DiscreteManufacturingEquipmentModule>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RoletopologyPackage.STATION__EQUIPMENT_MODULES:
				getEquipmentModules().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RoletopologyPackage.STATION__EQUIPMENT_MODULES:
				return equipmentModules != null && !equipmentModules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StationImpl
