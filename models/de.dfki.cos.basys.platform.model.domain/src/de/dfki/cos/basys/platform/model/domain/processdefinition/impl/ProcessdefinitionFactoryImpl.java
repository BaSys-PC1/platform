/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.cos.basys.platform.model.domain.processdefinition.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessdefinitionFactoryImpl extends EFactoryImpl implements ProcessdefinitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessdefinitionFactory init() {
		try {
			ProcessdefinitionFactory theProcessdefinitionFactory = (ProcessdefinitionFactory)EPackage.Registry.INSTANCE.getEFactory(ProcessdefinitionPackage.eNS_URI);
			if (theProcessdefinitionFactory != null) {
				return theProcessdefinitionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcessdefinitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessdefinitionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProcessdefinitionPackage.PROCESS_DEFINITION: return createProcessDefinition();
			case ProcessdefinitionPackage.TASK_FLOW: return createTaskFlow();
			case ProcessdefinitionPackage.TASK_DEPENDENCY: return createTaskDependency();
			case ProcessdefinitionPackage.GATEWAY: return createGateway();
			case ProcessdefinitionPackage.TASK: return createTask();
			case ProcessdefinitionPackage.DATA_FLOW: return createDataFlow();
			case ProcessdefinitionPackage.DATA: return createData();
			case ProcessdefinitionPackage.DATA_MAPPING: return createDataMapping();
			case ProcessdefinitionPackage.DATA_TRANSFORMATION: return createDataTransformation();
			case ProcessdefinitionPackage.TASK_INACTIVE: return createTaskInactive();
			case ProcessdefinitionPackage.TASK_ACTIVE: return createTaskActive();
			case ProcessdefinitionPackage.TASK_PAUSED: return createTaskPaused();
			case ProcessdefinitionPackage.TASK_EXECUTING: return createTaskExecuting();
			case ProcessdefinitionPackage.TASK_FINISHED: return createTaskFinished();
			case ProcessdefinitionPackage.TASK_SUCCESSFUL: return createTaskSuccessful();
			case ProcessdefinitionPackage.TASK_FAILED: return createTaskFailed();
			case ProcessdefinitionPackage.TASK_CANCELLED: return createTaskCancelled();
			case ProcessdefinitionPackage.USED_MATERIAL: return createUsedMaterial();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProcessdefinitionPackage.GATEWAY_TYPE_ENUM:
				return createGatewayTypeEnumFromString(eDataType, initialValue);
			case ProcessdefinitionPackage.TASK_STATE_ENUM:
				return createTaskStateEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProcessdefinitionPackage.GATEWAY_TYPE_ENUM:
				return convertGatewayTypeEnumToString(eDataType, instanceValue);
			case ProcessdefinitionPackage.TASK_STATE_ENUM:
				return convertTaskStateEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDefinition createProcessDefinition() {
		ProcessDefinitionImpl processDefinition = new ProcessDefinitionImpl();
		return processDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFlow createTaskFlow() {
		TaskFlowImpl taskFlow = new TaskFlowImpl();
		return taskFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDependency createTaskDependency() {
		TaskDependencyImpl taskDependency = new TaskDependencyImpl();
		return taskDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMapping createDataMapping() {
		DataMappingImpl dataMapping = new DataMappingImpl();
		return dataMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransformation createDataTransformation() {
		DataTransformationImpl dataTransformation = new DataTransformationImpl();
		return dataTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInactive createTaskInactive() {
		TaskInactiveImpl taskInactive = new TaskInactiveImpl();
		return taskInactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskActive createTaskActive() {
		TaskActiveImpl taskActive = new TaskActiveImpl();
		return taskActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPaused createTaskPaused() {
		TaskPausedImpl taskPaused = new TaskPausedImpl();
		return taskPaused;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskExecuting createTaskExecuting() {
		TaskExecutingImpl taskExecuting = new TaskExecutingImpl();
		return taskExecuting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFinished createTaskFinished() {
		TaskFinishedImpl taskFinished = new TaskFinishedImpl();
		return taskFinished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSuccessful createTaskSuccessful() {
		TaskSuccessfulImpl taskSuccessful = new TaskSuccessfulImpl();
		return taskSuccessful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFailed createTaskFailed() {
		TaskFailedImpl taskFailed = new TaskFailedImpl();
		return taskFailed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCancelled createTaskCancelled() {
		TaskCancelledImpl taskCancelled = new TaskCancelledImpl();
		return taskCancelled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedMaterial createUsedMaterial() {
		UsedMaterialImpl usedMaterial = new UsedMaterialImpl();
		return usedMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayTypeEnum createGatewayTypeEnumFromString(EDataType eDataType, String initialValue) {
		GatewayTypeEnum result = GatewayTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGatewayTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateEnum createTaskStateEnumFromString(EDataType eDataType, String initialValue) {
		TaskStateEnum result = TaskStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessdefinitionPackage getProcessdefinitionPackage() {
		return (ProcessdefinitionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessdefinitionPackage getPackage() {
		return ProcessdefinitionPackage.eINSTANCE;
	}

} //ProcessdefinitionFactoryImpl
