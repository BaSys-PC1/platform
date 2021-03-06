/**
 */
package de.dfki.cos.basys.platform.model.domain.resourceinstance.impl;

import de.dfki.cos.basys.platform.model.base.impl.EntityImpl;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.CapabilityApplication;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceInstance;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourceType;
import de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.ResourceInstanceImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.ResourceInstanceImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.ResourceInstanceImpl#getCapabilityApplications <em>Capability Applications</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.ResourceInstanceImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceInstanceImpl extends EntityImpl implements ResourceInstance {
	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType resourceType;

	/**
	 * The cached value of the '{@link #getCapabilityApplications() <em>Capability Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityApplication> capabilityApplications;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EquipmentModule role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceinstancePackage.Literals.RESOURCE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceinstancePackage.RESOURCE_INSTANCE__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType getResourceType() {
		if (resourceType != null && resourceType.eIsProxy()) {
			InternalEObject oldResourceType = (InternalEObject)resourceType;
			resourceType = (ResourceType)eResolveProxy(oldResourceType);
			if (resourceType != oldResourceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE, oldResourceType, resourceType));
			}
		}
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceType(ResourceType newResourceType) {
		ResourceType oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE, oldResourceType, resourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityApplication> getCapabilityApplications() {
		if (capabilityApplications == null) {
			capabilityApplications = new EObjectContainmentEList<CapabilityApplication>(CapabilityApplication.class, this, ResourceinstancePackage.RESOURCE_INSTANCE__CAPABILITY_APPLICATIONS);
		}
		return capabilityApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentModule getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (EquipmentModule)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourceinstancePackage.RESOURCE_INSTANCE__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentModule basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(EquipmentModule newRole) {
		EquipmentModule oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceinstancePackage.RESOURCE_INSTANCE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceinstancePackage.RESOURCE_INSTANCE__CAPABILITY_APPLICATIONS:
				return ((InternalEList<?>)getCapabilityApplications()).basicRemove(otherEnd, msgs);
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
			case ResourceinstancePackage.RESOURCE_INSTANCE__SERIAL_NUMBER:
				return getSerialNumber();
			case ResourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE:
				if (resolve) return getResourceType();
				return basicGetResourceType();
			case ResourceinstancePackage.RESOURCE_INSTANCE__CAPABILITY_APPLICATIONS:
				return getCapabilityApplications();
			case ResourceinstancePackage.RESOURCE_INSTANCE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
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
			case ResourceinstancePackage.RESOURCE_INSTANCE__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case ResourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE:
				setResourceType((ResourceType)newValue);
				return;
			case ResourceinstancePackage.RESOURCE_INSTANCE__CAPABILITY_APPLICATIONS:
				getCapabilityApplications().clear();
				getCapabilityApplications().addAll((Collection<? extends CapabilityApplication>)newValue);
				return;
			case ResourceinstancePackage.RESOURCE_INSTANCE__ROLE:
				setRole((EquipmentModule)newValue);
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
			case ResourceinstancePackage.RESOURCE_INSTANCE__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case ResourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE:
				setResourceType((ResourceType)null);
				return;
			case ResourceinstancePackage.RESOURCE_INSTANCE__CAPABILITY_APPLICATIONS:
				getCapabilityApplications().clear();
				return;
			case ResourceinstancePackage.RESOURCE_INSTANCE__ROLE:
				setRole((EquipmentModule)null);
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
			case ResourceinstancePackage.RESOURCE_INSTANCE__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case ResourceinstancePackage.RESOURCE_INSTANCE__RESOURCE_TYPE:
				return resourceType != null;
			case ResourceinstancePackage.RESOURCE_INSTANCE__CAPABILITY_APPLICATIONS:
				return capabilityApplications != null && !capabilityApplications.isEmpty();
			case ResourceinstancePackage.RESOURCE_INSTANCE__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (serialNumber: ");
		result.append(serialNumber);
		result.append(')');
		return result.toString();
	}

} //ResourceInstanceImpl
