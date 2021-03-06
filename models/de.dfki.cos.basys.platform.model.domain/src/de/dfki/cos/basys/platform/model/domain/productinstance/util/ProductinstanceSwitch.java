/**
 */
package de.dfki.cos.basys.platform.model.domain.productinstance.util;

import de.dfki.cos.basys.platform.model.base.BObject;
import de.dfki.cos.basys.platform.model.base.Entity;
import de.dfki.cos.basys.platform.model.domain.productinstance.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage
 * @generated
 */
public class ProductinstanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductinstancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductinstanceSwitch() {
		if (modelPackage == null) {
			modelPackage = ProductinstancePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProductinstancePackage.PRODUCT_INSTANCE: {
				ProductInstance productInstance = (ProductInstance)theEObject;
				T result = caseProductInstance(productInstance);
				if (result == null) result = caseEntity(productInstance);
				if (result == null) result = caseBObject(productInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS: {
				ProductInstanceStatus productInstanceStatus = (ProductInstanceStatus)theEObject;
				T result = caseProductInstanceStatus(productInstanceStatus);
				if (result == null) result = caseEntity(productInstanceStatus);
				if (result == null) result = caseBObject(productInstanceStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductinstancePackage.PRODUCT_INSTANCE_STATUS_CHANGE_EVENT: {
				ProductInstanceStatusChangeEvent productInstanceStatusChangeEvent = (ProductInstanceStatusChangeEvent)theEObject;
				T result = caseProductInstanceStatusChangeEvent(productInstanceStatusChangeEvent);
				if (result == null) result = caseProductInstanceStatus(productInstanceStatusChangeEvent);
				if (result == null) result = caseEntity(productInstanceStatusChangeEvent);
				if (result == null) result = caseBObject(productInstanceStatusChangeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductinstancePackage.PRODUCT_INSTANCE_LOCATION: {
				ProductInstanceLocation productInstanceLocation = (ProductInstanceLocation)theEObject;
				T result = caseProductInstanceLocation(productInstanceLocation);
				if (result == null) result = caseEntity(productInstanceLocation);
				if (result == null) result = caseBObject(productInstanceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductinstancePackage.PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT: {
				ProductInstanceLocationChangeEvent productInstanceLocationChangeEvent = (ProductInstanceLocationChangeEvent)theEObject;
				T result = caseProductInstanceLocationChangeEvent(productInstanceLocationChangeEvent);
				if (result == null) result = caseProductInstanceLocation(productInstanceLocationChangeEvent);
				if (result == null) result = caseEntity(productInstanceLocationChangeEvent);
				if (result == null) result = caseBObject(productInstanceLocationChangeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductinstancePackage.PRODUCT_INSTANCE_STORE: {
				ProductInstanceStore productInstanceStore = (ProductInstanceStore)theEObject;
				T result = caseProductInstanceStore(productInstanceStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstance(ProductInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstanceStatus(ProductInstanceStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance Status Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance Status Change Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstanceStatusChangeEvent(ProductInstanceStatusChangeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstanceLocation(ProductInstanceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance Location Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance Location Change Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstanceLocationChangeEvent(ProductInstanceLocationChangeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstanceStore(ProductInstanceStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProductinstanceSwitch
