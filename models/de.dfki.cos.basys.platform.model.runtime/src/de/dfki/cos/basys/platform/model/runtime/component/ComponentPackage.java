/**
 */
package de.dfki.cos.basys.platform.model.runtime.component;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentFactory
 * @model kind="package"
 *        annotation="http://de.dfki.iui.mmds/CoreModel"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ComponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "component";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/component";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "component";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentPackage eINSTANCE = de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestCollectionImpl <em>Request Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestCollectionImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequestCollection()
	 * @generated
	 */
	int COMPONENT_REQUEST_COLLECTION = 2;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequest()
	 * @generated
	 */
	int COMPONENT_REQUEST = 3;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl <em>Request Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequestStatus()
	 * @generated
	 */
	int COMPONENT_REQUEST_STATUS = 4;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.StatusRequestImpl <em>Status Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.StatusRequestImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getStatusRequest()
	 * @generated
	 */
	int STATUS_REQUEST = 5;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentResponse()
	 * @generated
	 */
	int COMPONENT_RESPONSE = 0;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__STATUS_CODE = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE__OUTPUT_PARAMETERS = 5;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.VariableImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Component Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS = 0;

	/**
	 * The number of structural features of the '<em>Request Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Request Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST__CORRELATION_ID = 1;

	/**
	 * The feature id for the '<em><b>Occupier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST__OCCUPIER_ID = 2;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_STATUS__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_STATUS__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_STATUS__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Request Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_STATUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Request Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUEST_STATUS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REQUEST__CORRELATION_ID = COMPONENT_REQUEST__CORRELATION_ID;

	/**
	 * The feature id for the '<em><b>Occupier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REQUEST__OCCUPIER_ID = COMPONENT_REQUEST__OCCUPIER_ID;

	/**
	 * The number of structural features of the '<em>Status Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REQUEST_FEATURE_COUNT = COMPONENT_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Status Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REQUEST_OPERATION_COUNT = COMPONENT_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.OccupationLevelRequestImpl <em>Occupation Level Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.OccupationLevelRequestImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getOccupationLevelRequest()
	 * @generated
	 */
	int OCCUPATION_LEVEL_REQUEST = 6;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_LEVEL_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_LEVEL_REQUEST__CORRELATION_ID = COMPONENT_REQUEST__CORRELATION_ID;

	/**
	 * The feature id for the '<em><b>Occupier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_LEVEL_REQUEST__OCCUPIER_ID = COMPONENT_REQUEST__OCCUPIER_ID;

	/**
	 * The feature id for the '<em><b>Occupation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_LEVEL_REQUEST__OCCUPATION_LEVEL = COMPONENT_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Occupation Level Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_LEVEL_REQUEST_FEATURE_COUNT = COMPONENT_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Occupation Level Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_LEVEL_REQUEST_OPERATION_COUNT = COMPONENT_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionModeRequestImpl <em>Execution Mode Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionModeRequestImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getExecutionModeRequest()
	 * @generated
	 */
	int EXECUTION_MODE_REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODE_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODE_REQUEST__CORRELATION_ID = COMPONENT_REQUEST__CORRELATION_ID;

	/**
	 * The feature id for the '<em><b>Occupier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODE_REQUEST__OCCUPIER_ID = COMPONENT_REQUEST__OCCUPIER_ID;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODE_REQUEST__EXECUTION_MODE = COMPONENT_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Mode Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODE_REQUEST_FEATURE_COUNT = COMPONENT_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execution Mode Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODE_REQUEST_OPERATION_COUNT = COMPONENT_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionCommandRequestImpl <em>Execution Command Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionCommandRequestImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getExecutionCommandRequest()
	 * @generated
	 */
	int EXECUTION_COMMAND_REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_COMMAND_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_COMMAND_REQUEST__CORRELATION_ID = COMPONENT_REQUEST__CORRELATION_ID;

	/**
	 * The feature id for the '<em><b>Occupier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_COMMAND_REQUEST__OCCUPIER_ID = COMPONENT_REQUEST__OCCUPIER_ID;

	/**
	 * The feature id for the '<em><b>Execution Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_COMMAND_REQUEST__EXECUTION_COMMAND = COMPONENT_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Command Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_COMMAND_REQUEST_FEATURE_COUNT = COMPONENT_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execution Command Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_COMMAND_REQUEST_OPERATION_COUNT = COMPONENT_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.OperationModeRequestImpl <em>Operation Mode Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.OperationModeRequestImpl
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getOperationModeRequest()
	 * @generated
	 */
	int OPERATION_MODE_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REQUEST__COMPONENT_ID = COMPONENT_REQUEST__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REQUEST__CORRELATION_ID = COMPONENT_REQUEST__CORRELATION_ID;

	/**
	 * The feature id for the '<em><b>Occupier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REQUEST__OCCUPIER_ID = COMPONENT_REQUEST__OCCUPIER_ID;

	/**
	 * The feature id for the '<em><b>Operation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REQUEST__OPERATION_MODE = COMPONENT_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REQUEST__INPUT_PARAMETERS = COMPONENT_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REQUEST__OUTPUT_PARAMETERS = COMPONENT_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Mode Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REQUEST_FEATURE_COUNT = COMPONENT_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation Mode Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_REQUEST_OPERATION_COUNT = COMPONENT_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.RequestStatus <em>Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.RequestStatus
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getRequestStatus()
	 * @generated
	 */
	int REQUEST_STATUS = 10;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus <em>Response Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getResponseStatus()
	 * @generated
	 */
	int RESPONSE_STATUS = 11;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.VariableType
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 12;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionState <em>Execution State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionState
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getExecutionState()
	 * @generated
	 */
	int EXECUTION_STATE = 13;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode <em>Execution Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getExecutionMode()
	 * @generated
	 */
	int EXECUTION_MODE = 14;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand <em>Execution Command</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getExecutionCommand()
	 * @generated
	 */
	int EXECUTION_COMMAND = 15;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel <em>Occupation Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel
	 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getOccupationLevel()
	 * @generated
	 */
	int OCCUPATION_LEVEL = 16;


	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection <em>Request Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Collection</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection
	 * @generated
	 */
	EClass getComponentRequestCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection#getComponentRequests <em>Component Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Requests</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestCollection#getComponentRequests()
	 * @see #getComponentRequestCollection()
	 * @generated
	 */
	EReference getComponentRequestCollection_ComponentRequests();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest
	 * @generated
	 */
	EClass getComponentRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getComponentId()
	 * @see #getComponentRequest()
	 * @generated
	 */
	EAttribute getComponentRequest_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getCorrelationId <em>Correlation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getCorrelationId()
	 * @see #getComponentRequest()
	 * @generated
	 */
	EAttribute getComponentRequest_CorrelationId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getOccupierId <em>Occupier Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupier Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest#getOccupierId()
	 * @see #getComponentRequest()
	 * @generated
	 */
	EAttribute getComponentRequest_OccupierId();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus <em>Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus
	 * @generated
	 */
	EClass getComponentRequestStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getComponentId()
	 * @see #getComponentRequestStatus()
	 * @generated
	 */
	EAttribute getComponentRequestStatus_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getStatus()
	 * @see #getComponentRequestStatus()
	 * @generated
	 */
	EAttribute getComponentRequestStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequestStatus#getMessage()
	 * @see #getComponentRequestStatus()
	 * @generated
	 */
	EAttribute getComponentRequestStatus_Message();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.StatusRequest <em>Status Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.StatusRequest
	 * @generated
	 */
	EClass getStatusRequest();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse
	 * @generated
	 */
	EClass getComponentResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getComponentId()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EAttribute getComponentResponse_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getStatus()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EAttribute getComponentResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Code</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getStatusCode()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EAttribute getComponentResponse_StatusCode();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getMessage()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EAttribute getComponentResponse_Message();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getRequest()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EReference getComponentResponse_Request();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getOutputParameters <em>Output Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameters</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentResponse#getOutputParameters()
	 * @see #getComponentResponse()
	 * @generated
	 */
	EReference getComponentResponse_OutputParameters();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest <em>Occupation Level Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupation Level Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest
	 * @generated
	 */
	EClass getOccupationLevelRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest#getOccupationLevel <em>Occupation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupation Level</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.OccupationLevelRequest#getOccupationLevel()
	 * @see #getOccupationLevelRequest()
	 * @generated
	 */
	EAttribute getOccupationLevelRequest_OccupationLevel();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest <em>Execution Mode Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Mode Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest
	 * @generated
	 */
	EClass getExecutionModeRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest#getExecutionMode <em>Execution Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Mode</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionModeRequest#getExecutionMode()
	 * @see #getExecutionModeRequest()
	 * @generated
	 */
	EAttribute getExecutionModeRequest_ExecutionMode();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest <em>Execution Command Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Command Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest
	 * @generated
	 */
	EClass getExecutionCommandRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest#getExecutionCommand <em>Execution Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Command</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommandRequest#getExecutionCommand()
	 * @see #getExecutionCommandRequest()
	 * @generated
	 */
	EAttribute getExecutionCommandRequest_ExecutionCommand();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest <em>Operation Mode Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Mode Request</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest
	 * @generated
	 */
	EClass getOperationModeRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest#getOperationMode <em>Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Mode</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest#getOperationMode()
	 * @see #getOperationModeRequest()
	 * @generated
	 */
	EAttribute getOperationModeRequest_OperationMode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameters</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest#getInputParameters()
	 * @see #getOperationModeRequest()
	 * @generated
	 */
	EReference getOperationModeRequest_InputParameters();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest#getOutputParameters <em>Output Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Parameters</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.OperationModeRequest#getOutputParameters()
	 * @see #getOperationModeRequest()
	 * @generated
	 */
	EAttribute getOperationModeRequest_OutputParameters();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.RequestStatus <em>Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.RequestStatus
	 * @generated
	 */
	EEnum getRequestStatus();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus <em>Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Status</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus
	 * @generated
	 */
	EEnum getResponseStatus();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionState <em>Execution State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution State</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionState
	 * @generated
	 */
	EEnum getExecutionState();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode <em>Execution Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Mode</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode
	 * @generated
	 */
	EEnum getExecutionMode();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand <em>Execution Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Command</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand
	 * @generated
	 */
	EEnum getExecutionCommand();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel <em>Occupation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Occupation Level</em>'.
	 * @see de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel
	 * @generated
	 */
	EEnum getOccupationLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentFactory getComponentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestCollectionImpl <em>Request Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestCollectionImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequestCollection()
		 * @generated
		 */
		EClass COMPONENT_REQUEST_COLLECTION = eINSTANCE.getComponentRequestCollection();

		/**
		 * The meta object literal for the '<em><b>Component Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REQUEST_COLLECTION__COMPONENT_REQUESTS = eINSTANCE.getComponentRequestCollection_ComponentRequests();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.ComponentRequest
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequest()
		 * @generated
		 */
		EClass COMPONENT_REQUEST = eINSTANCE.getComponentRequest();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUEST__COMPONENT_ID = eINSTANCE.getComponentRequest_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Correlation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUEST__CORRELATION_ID = eINSTANCE.getComponentRequest_CorrelationId();

		/**
		 * The meta object literal for the '<em><b>Occupier Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUEST__OCCUPIER_ID = eINSTANCE.getComponentRequest_OccupierId();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl <em>Request Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentRequestStatusImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentRequestStatus()
		 * @generated
		 */
		EClass COMPONENT_REQUEST_STATUS = eINSTANCE.getComponentRequestStatus();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUEST_STATUS__COMPONENT_ID = eINSTANCE.getComponentRequestStatus_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUEST_STATUS__STATUS = eINSTANCE.getComponentRequestStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUEST_STATUS__MESSAGE = eINSTANCE.getComponentRequestStatus_Message();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.StatusRequestImpl <em>Status Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.StatusRequestImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getStatusRequest()
		 * @generated
		 */
		EClass STATUS_REQUEST = eINSTANCE.getStatusRequest();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentResponseImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getComponentResponse()
		 * @generated
		 */
		EClass COMPONENT_RESPONSE = eINSTANCE.getComponentResponse();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RESPONSE__COMPONENT_ID = eINSTANCE.getComponentResponse_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RESPONSE__STATUS = eINSTANCE.getComponentResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RESPONSE__STATUS_CODE = eINSTANCE.getComponentResponse_StatusCode();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RESPONSE__MESSAGE = eINSTANCE.getComponentResponse_Message();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_RESPONSE__REQUEST = eINSTANCE.getComponentResponse_Request();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_RESPONSE__OUTPUT_PARAMETERS = eINSTANCE.getComponentResponse_OutputParameters();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.VariableImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.OccupationLevelRequestImpl <em>Occupation Level Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.OccupationLevelRequestImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getOccupationLevelRequest()
		 * @generated
		 */
		EClass OCCUPATION_LEVEL_REQUEST = eINSTANCE.getOccupationLevelRequest();

		/**
		 * The meta object literal for the '<em><b>Occupation Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPATION_LEVEL_REQUEST__OCCUPATION_LEVEL = eINSTANCE.getOccupationLevelRequest_OccupationLevel();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionModeRequestImpl <em>Execution Mode Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionModeRequestImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getExecutionModeRequest()
		 * @generated
		 */
		EClass EXECUTION_MODE_REQUEST = eINSTANCE.getExecutionModeRequest();

		/**
		 * The meta object literal for the '<em><b>Execution Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_MODE_REQUEST__EXECUTION_MODE = eINSTANCE.getExecutionModeRequest_ExecutionMode();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionCommandRequestImpl <em>Execution Command Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ExecutionCommandRequestImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getExecutionCommandRequest()
		 * @generated
		 */
		EClass EXECUTION_COMMAND_REQUEST = eINSTANCE.getExecutionCommandRequest();

		/**
		 * The meta object literal for the '<em><b>Execution Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_COMMAND_REQUEST__EXECUTION_COMMAND = eINSTANCE.getExecutionCommandRequest_ExecutionCommand();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.impl.OperationModeRequestImpl <em>Operation Mode Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.OperationModeRequestImpl
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getOperationModeRequest()
		 * @generated
		 */
		EClass OPERATION_MODE_REQUEST = eINSTANCE.getOperationModeRequest();

		/**
		 * The meta object literal for the '<em><b>Operation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_MODE_REQUEST__OPERATION_MODE = eINSTANCE.getOperationModeRequest_OperationMode();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_MODE_REQUEST__INPUT_PARAMETERS = eINSTANCE.getOperationModeRequest_InputParameters();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_MODE_REQUEST__OUTPUT_PARAMETERS = eINSTANCE.getOperationModeRequest_OutputParameters();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.RequestStatus <em>Request Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.RequestStatus
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getRequestStatus()
		 * @generated
		 */
		EEnum REQUEST_STATUS = eINSTANCE.getRequestStatus();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus <em>Response Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.ResponseStatus
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getResponseStatus()
		 * @generated
		 */
		EEnum RESPONSE_STATUS = eINSTANCE.getResponseStatus();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.VariableType
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionState <em>Execution State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionState
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getExecutionState()
		 * @generated
		 */
		EEnum EXECUTION_STATE = eINSTANCE.getExecutionState();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode <em>Execution Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionMode
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getExecutionMode()
		 * @generated
		 */
		EEnum EXECUTION_MODE = eINSTANCE.getExecutionMode();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand <em>Execution Command</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.ExecutionCommand
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getExecutionCommand()
		 * @generated
		 */
		EEnum EXECUTION_COMMAND = eINSTANCE.getExecutionCommand();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel <em>Occupation Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.runtime.component.OccupationLevel
		 * @see de.dfki.cos.basys.platform.model.runtime.component.impl.ComponentPackageImpl#getOccupationLevel()
		 * @generated
		 */
		EEnum OCCUPATION_LEVEL = eINSTANCE.getOccupationLevel();

	}

} //ComponentPackage
