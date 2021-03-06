/**
 */
package de.dfki.cos.basys.platform.model.domain.processinstance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.domain.processinstance.ProcessinstancePackage
 * @generated
 */
public interface ProcessinstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessinstanceFactory eINSTANCE = de.dfki.cos.basys.platform.model.domain.processinstance.impl.ProcessinstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Process Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Instance</em>'.
	 * @generated
	 */
	ProcessInstance createProcessInstance();

	/**
	 * Returns a new object of class '<em>Task Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Instance</em>'.
	 * @generated
	 */
	TaskInstance createTaskInstance();

	/**
	 * Returns a new object of class '<em>Process Instance Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Instance Store</em>'.
	 * @generated
	 */
	ProcessInstanceStore createProcessInstanceStore();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProcessinstancePackage getProcessinstancePackage();

} //ProcessinstanceFactory
