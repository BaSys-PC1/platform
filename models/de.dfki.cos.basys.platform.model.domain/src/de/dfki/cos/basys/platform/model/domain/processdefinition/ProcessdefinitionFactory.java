/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage
 * @generated
 */
public interface ProcessdefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessdefinitionFactory eINSTANCE = de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Definition</em>'.
	 * @generated
	 */
	ProcessDefinition createProcessDefinition();

	/**
	 * Returns a new object of class '<em>Task Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Flow</em>'.
	 * @generated
	 */
	TaskFlow createTaskFlow();

	/**
	 * Returns a new object of class '<em>Task Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Dependency</em>'.
	 * @generated
	 */
	TaskDependency createTaskDependency();

	/**
	 * Returns a new object of class '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway</em>'.
	 * @generated
	 */
	Gateway createGateway();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Data Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Mapping</em>'.
	 * @generated
	 */
	DataMapping createDataMapping();

	/**
	 * Returns a new object of class '<em>Data Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Transformation</em>'.
	 * @generated
	 */
	DataTransformation createDataTransformation();

	/**
	 * Returns a new object of class '<em>Task Inactive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Inactive</em>'.
	 * @generated
	 */
	TaskInactive createTaskInactive();

	/**
	 * Returns a new object of class '<em>Task Active</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Active</em>'.
	 * @generated
	 */
	TaskActive createTaskActive();

	/**
	 * Returns a new object of class '<em>Task Paused</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Paused</em>'.
	 * @generated
	 */
	TaskPaused createTaskPaused();

	/**
	 * Returns a new object of class '<em>Task Executing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Executing</em>'.
	 * @generated
	 */
	TaskExecuting createTaskExecuting();

	/**
	 * Returns a new object of class '<em>Task Finished</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Finished</em>'.
	 * @generated
	 */
	TaskFinished createTaskFinished();

	/**
	 * Returns a new object of class '<em>Task Successful</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Successful</em>'.
	 * @generated
	 */
	TaskSuccessful createTaskSuccessful();

	/**
	 * Returns a new object of class '<em>Task Failed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Failed</em>'.
	 * @generated
	 */
	TaskFailed createTaskFailed();

	/**
	 * Returns a new object of class '<em>Task Cancelled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Cancelled</em>'.
	 * @generated
	 */
	TaskCancelled createTaskCancelled();

	/**
	 * Returns a new object of class '<em>Used Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Used Material</em>'.
	 * @generated
	 */
	UsedMaterial createUsedMaterial();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProcessdefinitionPackage getProcessdefinitionPackage();

} //ProcessdefinitionFactory
