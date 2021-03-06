/**
 */
package de.dfki.cos.basys.platform.model.domain.topology;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.dfki.cos.basys.platform.model.base.BasePackage;

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
 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyFactory
 * @model kind="package"
 * @generated
 */
public interface TopologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "topology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/topology";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "topology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopologyPackage eINSTANCE = de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.TopologyElement <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyElement
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getTopologyElement()
	 * @generated
	 */
	int TOPOLOGY_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ELEMENT__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ELEMENT__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ELEMENT__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ELEMENT__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ELEMENT_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ELEMENT_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.EnterpriseImpl <em>Enterprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.EnterpriseImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getEnterprise()
	 * @generated
	 */
	int ENTERPRISE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__BINDING = TOPOLOGY_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__ID = TOPOLOGY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__NAME = TOPOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__METADATA = TOPOLOGY_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>Sites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__SITES = TOPOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_FEATURE_COUNT = TOPOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_OPERATION_COUNT = TOPOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.SiteImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__BINDING = TOPOLOGY_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__ID = TOPOLOGY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = TOPOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__METADATA = TOPOLOGY_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__AREAS = TOPOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = TOPOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = TOPOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.AreaImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__BINDING = TOPOLOGY_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ID = TOPOLOGY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NAME = TOPOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__METADATA = TOPOLOGY_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>Work Centers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__WORK_CENTERS = TOPOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__EQUIPMENT_MODULES = TOPOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = TOPOLOGY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = TOPOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.WorkCenterImpl <em>Work Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.WorkCenterImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getWorkCenter()
	 * @generated
	 */
	int WORK_CENTER = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__BINDING = TOPOLOGY_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__ID = TOPOLOGY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__NAME = TOPOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__METADATA = TOPOLOGY_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER__EQUIPMENT_MODULES = TOPOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER_FEATURE_COUNT = TOPOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CENTER_OPERATION_COUNT = TOPOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ProcessCellImpl <em>Process Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.ProcessCellImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getProcessCell()
	 * @generated
	 */
	int PROCESS_CELL = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__BINDING = WORK_CENTER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__NAME = WORK_CENTER__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__METADATA = WORK_CENTER__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__EQUIPMENT_MODULES = WORK_CENTER__EQUIPMENT_MODULES;

	/**
	 * The feature id for the '<em><b>Process Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL__PROCESS_UNITS = WORK_CENTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL_FEATURE_COUNT = WORK_CENTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Process Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CELL_OPERATION_COUNT = WORK_CENTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ProductionUnitImpl <em>Production Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.ProductionUnitImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getProductionUnit()
	 * @generated
	 */
	int PRODUCTION_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__BINDING = WORK_CENTER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__NAME = WORK_CENTER__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__METADATA = WORK_CENTER__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__EQUIPMENT_MODULES = WORK_CENTER__EQUIPMENT_MODULES;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT__UNITS = WORK_CENTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Production Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT_FEATURE_COUNT = WORK_CENTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Production Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_UNIT_OPERATION_COUNT = WORK_CENTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ProductionLineImpl <em>Production Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.ProductionLineImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getProductionLine()
	 * @generated
	 */
	int PRODUCTION_LINE = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__BINDING = WORK_CENTER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__NAME = WORK_CENTER__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__METADATA = WORK_CENTER__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__EQUIPMENT_MODULES = WORK_CENTER__EQUIPMENT_MODULES;

	/**
	 * The feature id for the '<em><b>Work Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE__WORK_CELLS = WORK_CENTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Production Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_FEATURE_COUNT = WORK_CENTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Production Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_OPERATION_COUNT = WORK_CENTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.StorageZoneImpl <em>Storage Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.StorageZoneImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getStorageZone()
	 * @generated
	 */
	int STORAGE_ZONE = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__BINDING = WORK_CENTER__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__ID = WORK_CENTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__NAME = WORK_CENTER__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__METADATA = WORK_CENTER__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__EQUIPMENT_MODULES = WORK_CENTER__EQUIPMENT_MODULES;

	/**
	 * The feature id for the '<em><b>Storage Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE__STORAGE_UNITS = WORK_CENTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE_FEATURE_COUNT = WORK_CENTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Storage Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ZONE_OPERATION_COUNT = WORK_CENTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.WorkUnitImpl <em>Work Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.WorkUnitImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getWorkUnit()
	 * @generated
	 */
	int WORK_UNIT = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__BINDING = TOPOLOGY_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__ID = TOPOLOGY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__NAME = TOPOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__METADATA = TOPOLOGY_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__EQUIPMENT_MODULES = TOPOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT_FEATURE_COUNT = TOPOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT_OPERATION_COUNT = TOPOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.UnitImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__BINDING = WORK_UNIT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ID = WORK_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__METADATA = WORK_UNIT__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__EQUIPMENT_MODULES = WORK_UNIT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = WORK_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.WorkCellImpl <em>Work Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.WorkCellImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getWorkCell()
	 * @generated
	 */
	int WORK_CELL = 13;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.StorageUnitImpl <em>Storage Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.StorageUnitImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getStorageUnit()
	 * @generated
	 */
	int STORAGE_UNIT = 12;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.EquipmentModuleImpl <em>Equipment Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.EquipmentModuleImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getEquipmentModule()
	 * @generated
	 */
	int EQUIPMENT_MODULE = 14;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ControlModuleImpl <em>Control Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.ControlModuleImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getControlModule()
	 * @generated
	 */
	int CONTROL_MODULE = 15;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.StationImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 16;

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.TopologyElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyElement
	 * @generated
	 */
	EClass getTopologyElement();

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ProcessUnitImpl <em>Process Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.ProcessUnitImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getProcessUnit()
	 * @generated
	 */
	int PROCESS_UNIT = 11;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT__BINDING = WORK_UNIT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT__ID = WORK_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT__METADATA = WORK_UNIT__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT__EQUIPMENT_MODULES = WORK_UNIT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Process Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_UNIT_OPERATION_COUNT = WORK_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__BINDING = WORK_UNIT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__ID = WORK_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__METADATA = WORK_UNIT__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__EQUIPMENT_MODULES = WORK_UNIT__EQUIPMENT_MODULES;

	/**
	 * The number of structural features of the '<em>Storage Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT_OPERATION_COUNT = WORK_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__BINDING = WORK_UNIT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__ID = WORK_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__METADATA = WORK_UNIT__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__EQUIPMENT_MODULES = WORK_UNIT__EQUIPMENT_MODULES;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL__STATIONS = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_CELL_OPERATION_COUNT = WORK_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__BINDING = TOPOLOGY_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__ID = TOPOLOGY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__NAME = TOPOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__METADATA = TOPOLOGY_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__CONTROL_MODULES = TOPOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__EQUIPMENT_MODULES = TOPOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT = TOPOLOGY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assigned Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__ASSIGNED_RESOURCE_TYPE = TOPOLOGY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assigned Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE = TOPOLOGY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE_FEATURE_COUNT = TOPOLOGY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Equipment Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_MODULE_OPERATION_COUNT = TOPOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__BINDING = TOPOLOGY_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__ID = TOPOLOGY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__NAME = TOPOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__METADATA = TOPOLOGY_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE__CONTROL_MODULES = TOPOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE_FEATURE_COUNT = TOPOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MODULE_OPERATION_COUNT = TOPOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__BINDING = TOPOLOGY_ELEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__ID = TOPOLOGY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = TOPOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__METADATA = TOPOLOGY_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__EQUIPMENT_MODULES = TOPOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = TOPOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = TOPOLOGY_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.AGVStationImpl <em>AGV Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.AGVStationImpl
	 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getAGVStation()
	 * @generated
	 */
	int AGV_STATION = 17;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_STATION__BINDING = EQUIPMENT_MODULE__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_STATION__ID = EQUIPMENT_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_STATION__NAME = EQUIPMENT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_STATION__METADATA = EQUIPMENT_MODULE__METADATA;

	/**
	 * The feature id for the '<em><b>Control Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_STATION__CONTROL_MODULES = EQUIPMENT_MODULE__CONTROL_MODULES;

	/**
	 * The feature id for the '<em><b>Equipment Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_STATION__EQUIPMENT_MODULES = EQUIPMENT_MODULE__EQUIPMENT_MODULES;

	/**
	 * The feature id for the '<em><b>Capability Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_STATION__CAPABILITY_REQUIREMENT = EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Assigned Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_STATION__ASSIGNED_RESOURCE_TYPE = EQUIPMENT_MODULE__ASSIGNED_RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Assigned Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_STATION__ASSIGNED_RESOURCE_INSTANCE = EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE;

	/**
	 * The number of structural features of the '<em>AGV Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_STATION_FEATURE_COUNT = EQUIPMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AGV Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_STATION_OPERATION_COUNT = EQUIPMENT_MODULE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.Enterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.Enterprise
	 * @generated
	 */
	EClass getEnterprise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.Enterprise#getSites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sites</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.Enterprise#getSites()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_Sites();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.Site#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.Site#getAreas()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Areas();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.Area#getWorkCenters <em>Work Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Centers</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.Area#getWorkCenters()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_WorkCenters();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.Area#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.Area#getEquipmentModules()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.WorkCenter <em>Work Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Center</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.WorkCenter
	 * @generated
	 */
	EClass getWorkCenter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.WorkCenter#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.WorkCenter#getEquipmentModules()
	 * @see #getWorkCenter()
	 * @generated
	 */
	EReference getWorkCenter_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.ProcessCell <em>Process Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Cell</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.ProcessCell
	 * @generated
	 */
	EClass getProcessCell();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.ProcessCell#getProcessUnits <em>Process Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Units</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.ProcessCell#getProcessUnits()
	 * @see #getProcessCell()
	 * @generated
	 */
	EReference getProcessCell_ProcessUnits();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.ProductionUnit <em>Production Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Unit</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.ProductionUnit
	 * @generated
	 */
	EClass getProductionUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.ProductionUnit#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.ProductionUnit#getUnits()
	 * @see #getProductionUnit()
	 * @generated
	 */
	EReference getProductionUnit_Units();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.ProductionLine <em>Production Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Line</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.ProductionLine
	 * @generated
	 */
	EClass getProductionLine();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.ProductionLine#getWorkCells <em>Work Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Cells</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.ProductionLine#getWorkCells()
	 * @see #getProductionLine()
	 * @generated
	 */
	EReference getProductionLine_WorkCells();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.StorageZone <em>Storage Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Zone</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.StorageZone
	 * @generated
	 */
	EClass getStorageZone();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.StorageZone#getStorageUnits <em>Storage Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storage Units</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.StorageZone#getStorageUnits()
	 * @see #getStorageZone()
	 * @generated
	 */
	EReference getStorageZone_StorageUnits();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.WorkUnit <em>Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Unit</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.WorkUnit
	 * @generated
	 */
	EClass getWorkUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.WorkUnit#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.WorkUnit#getEquipmentModules()
	 * @see #getWorkUnit()
	 * @generated
	 */
	EReference getWorkUnit_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.WorkCell <em>Work Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Cell</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.WorkCell
	 * @generated
	 */
	EClass getWorkCell();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.WorkCell#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.WorkCell#getStations()
	 * @see #getWorkCell()
	 * @generated
	 */
	EReference getWorkCell_Stations();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.StorageUnit <em>Storage Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Unit</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.StorageUnit
	 * @generated
	 */
	EClass getStorageUnit();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule <em>Equipment Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment Module</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule
	 * @generated
	 */
	EClass getEquipmentModule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getControlModules <em>Control Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Modules</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getControlModules()
	 * @see #getEquipmentModule()
	 * @generated
	 */
	EReference getEquipmentModule_ControlModules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getEquipmentModules()
	 * @see #getEquipmentModule()
	 * @generated
	 */
	EReference getEquipmentModule_EquipmentModules();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getCapabilityRequirement <em>Capability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Requirement</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getCapabilityRequirement()
	 * @see #getEquipmentModule()
	 * @generated
	 */
	EReference getEquipmentModule_CapabilityRequirement();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getAssignedResourceType <em>Assigned Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Resource Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getAssignedResourceType()
	 * @see #getEquipmentModule()
	 * @generated
	 */
	EReference getEquipmentModule_AssignedResourceType();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getAssignedResourceInstance <em>Assigned Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Resource Instance</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.EquipmentModule#getAssignedResourceInstance()
	 * @see #getEquipmentModule()
	 * @generated
	 */
	EReference getEquipmentModule_AssignedResourceInstance();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.ControlModule <em>Control Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Module</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.ControlModule
	 * @generated
	 */
	EClass getControlModule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.ControlModule#getControlModules <em>Control Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Modules</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.ControlModule#getControlModules()
	 * @see #getControlModule()
	 * @generated
	 */
	EReference getControlModule_ControlModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.domain.topology.Station#getEquipmentModules <em>Equipment Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment Modules</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.Station#getEquipmentModules()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_EquipmentModules();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.AGVStation <em>AGV Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AGV Station</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.AGVStation
	 * @generated
	 */
	EClass getAGVStation();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.domain.topology.ProcessUnit <em>Process Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Unit</em>'.
	 * @see de.dfki.cos.basys.platform.model.domain.topology.ProcessUnit
	 * @generated
	 */
	EClass getProcessUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TopologyFactory getTopologyFactory();

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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.TopologyElement <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.TopologyElement
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getTopologyElement()
		 * @generated
		 */
		EClass TOPOLOGY_ELEMENT = eINSTANCE.getTopologyElement();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.EnterpriseImpl <em>Enterprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.EnterpriseImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getEnterprise()
		 * @generated
		 */
		EClass ENTERPRISE = eINSTANCE.getEnterprise();

		/**
		 * The meta object literal for the '<em><b>Sites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE__SITES = eINSTANCE.getEnterprise_Sites();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.SiteImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__AREAS = eINSTANCE.getSite_Areas();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.AreaImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Work Centers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__WORK_CENTERS = eINSTANCE.getArea_WorkCenters();

		/**
		 * The meta object literal for the '<em><b>Equipment Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__EQUIPMENT_MODULES = eINSTANCE.getArea_EquipmentModules();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.WorkCenterImpl <em>Work Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.WorkCenterImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getWorkCenter()
		 * @generated
		 */
		EClass WORK_CENTER = eINSTANCE.getWorkCenter();

		/**
		 * The meta object literal for the '<em><b>Equipment Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_CENTER__EQUIPMENT_MODULES = eINSTANCE.getWorkCenter_EquipmentModules();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ProcessCellImpl <em>Process Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.ProcessCellImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getProcessCell()
		 * @generated
		 */
		EClass PROCESS_CELL = eINSTANCE.getProcessCell();

		/**
		 * The meta object literal for the '<em><b>Process Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_CELL__PROCESS_UNITS = eINSTANCE.getProcessCell_ProcessUnits();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ProductionUnitImpl <em>Production Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.ProductionUnitImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getProductionUnit()
		 * @generated
		 */
		EClass PRODUCTION_UNIT = eINSTANCE.getProductionUnit();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_UNIT__UNITS = eINSTANCE.getProductionUnit_Units();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ProductionLineImpl <em>Production Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.ProductionLineImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getProductionLine()
		 * @generated
		 */
		EClass PRODUCTION_LINE = eINSTANCE.getProductionLine();

		/**
		 * The meta object literal for the '<em><b>Work Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE__WORK_CELLS = eINSTANCE.getProductionLine_WorkCells();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.StorageZoneImpl <em>Storage Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.StorageZoneImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getStorageZone()
		 * @generated
		 */
		EClass STORAGE_ZONE = eINSTANCE.getStorageZone();

		/**
		 * The meta object literal for the '<em><b>Storage Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_ZONE__STORAGE_UNITS = eINSTANCE.getStorageZone_StorageUnits();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.WorkUnitImpl <em>Work Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.WorkUnitImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getWorkUnit()
		 * @generated
		 */
		EClass WORK_UNIT = eINSTANCE.getWorkUnit();

		/**
		 * The meta object literal for the '<em><b>Equipment Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_UNIT__EQUIPMENT_MODULES = eINSTANCE.getWorkUnit_EquipmentModules();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.UnitImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.WorkCellImpl <em>Work Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.WorkCellImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getWorkCell()
		 * @generated
		 */
		EClass WORK_CELL = eINSTANCE.getWorkCell();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_CELL__STATIONS = eINSTANCE.getWorkCell_Stations();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.StorageUnitImpl <em>Storage Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.StorageUnitImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getStorageUnit()
		 * @generated
		 */
		EClass STORAGE_UNIT = eINSTANCE.getStorageUnit();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.EquipmentModuleImpl <em>Equipment Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.EquipmentModuleImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getEquipmentModule()
		 * @generated
		 */
		EClass EQUIPMENT_MODULE = eINSTANCE.getEquipmentModule();

		/**
		 * The meta object literal for the '<em><b>Control Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_MODULE__CONTROL_MODULES = eINSTANCE.getEquipmentModule_ControlModules();

		/**
		 * The meta object literal for the '<em><b>Equipment Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_MODULE__EQUIPMENT_MODULES = eINSTANCE.getEquipmentModule_EquipmentModules();

		/**
		 * The meta object literal for the '<em><b>Capability Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_MODULE__CAPABILITY_REQUIREMENT = eINSTANCE.getEquipmentModule_CapabilityRequirement();

		/**
		 * The meta object literal for the '<em><b>Assigned Resource Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_MODULE__ASSIGNED_RESOURCE_TYPE = eINSTANCE.getEquipmentModule_AssignedResourceType();

		/**
		 * The meta object literal for the '<em><b>Assigned Resource Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_MODULE__ASSIGNED_RESOURCE_INSTANCE = eINSTANCE.getEquipmentModule_AssignedResourceInstance();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ControlModuleImpl <em>Control Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.ControlModuleImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getControlModule()
		 * @generated
		 */
		EClass CONTROL_MODULE = eINSTANCE.getControlModule();

		/**
		 * The meta object literal for the '<em><b>Control Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_MODULE__CONTROL_MODULES = eINSTANCE.getControlModule_ControlModules();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.StationImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Equipment Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__EQUIPMENT_MODULES = eINSTANCE.getStation_EquipmentModules();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.AGVStationImpl <em>AGV Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.AGVStationImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getAGVStation()
		 * @generated
		 */
		EClass AGV_STATION = eINSTANCE.getAGVStation();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.domain.topology.impl.ProcessUnitImpl <em>Process Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.ProcessUnitImpl
		 * @see de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl#getProcessUnit()
		 * @generated
		 */
		EClass PROCESS_UNIT = eINSTANCE.getProcessUnit();

	}

} //TopologyPackage
