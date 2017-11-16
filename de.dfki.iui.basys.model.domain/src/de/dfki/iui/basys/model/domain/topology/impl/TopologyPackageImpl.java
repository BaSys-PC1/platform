/**
 */
package de.dfki.iui.basys.model.domain.topology.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.domain.linebalancing.LinebalancingPackage;

import de.dfki.iui.basys.model.domain.linebalancing.impl.LinebalancingPackageImpl;

import de.dfki.iui.basys.model.domain.order.OrderPackage;

import de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl;

import de.dfki.iui.basys.model.domain.product.ProductPackage;

import de.dfki.iui.basys.model.domain.product.impl.ProductPackageImpl;

import de.dfki.iui.basys.model.domain.staff.StaffPackage;

import de.dfki.iui.basys.model.domain.staff.impl.StaffPackageImpl;

import de.dfki.iui.basys.model.domain.topology.Area;
import de.dfki.iui.basys.model.domain.topology.AssemblyStation;
import de.dfki.iui.basys.model.domain.topology.BufferStation;
import de.dfki.iui.basys.model.domain.topology.ControlModule;
import de.dfki.iui.basys.model.domain.topology.Enterprise;
import de.dfki.iui.basys.model.domain.topology.EquipmentModule;
import de.dfki.iui.basys.model.domain.topology.ProcessCell;
import de.dfki.iui.basys.model.domain.topology.ProductionLine;
import de.dfki.iui.basys.model.domain.topology.ProductionLineSection;
import de.dfki.iui.basys.model.domain.topology.ProductionUnit;
import de.dfki.iui.basys.model.domain.topology.Site;
import de.dfki.iui.basys.model.domain.topology.Station;
import de.dfki.iui.basys.model.domain.topology.StorageUnit;
import de.dfki.iui.basys.model.domain.topology.StorageZone;
import de.dfki.iui.basys.model.domain.topology.TopologyFactory;
import de.dfki.iui.basys.model.domain.topology.TopologyPackage;
import de.dfki.iui.basys.model.domain.topology.Transition;
import de.dfki.iui.basys.model.domain.topology.Unit;
import de.dfki.iui.basys.model.domain.topology.WorkCell;
import de.dfki.iui.basys.model.domain.topology.WorkCenter;
import de.dfki.iui.basys.model.domain.topology.WorkUnit;

import de.dfki.iui.basys.model.domain.workerguidance.WorkerguidancePackage;

import de.dfki.iui.basys.model.domain.workerguidance.impl.WorkerguidancePackageImpl;

import de.dfki.iui.basys.model.domain.workplan.WorkplanPackage;

import de.dfki.iui.basys.model.domain.workplan.impl.WorkplanPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyPackageImpl extends EPackageImpl implements TopologyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionLineSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyStationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferStationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.iui.basys.model.domain.topology.TopologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TopologyPackageImpl() {
		super(eNS_URI, TopologyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TopologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TopologyPackage init() {
		if (isInited) return (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);

		// Obtain or create and register package
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TopologyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) instanceof OrderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) : OrderPackage.eINSTANCE);
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) : ProductPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		WorkerguidancePackageImpl theWorkerguidancePackage = (WorkerguidancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) instanceof WorkerguidancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) : WorkerguidancePackage.eINSTANCE);
		WorkplanPackageImpl theWorkplanPackage = (WorkplanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) instanceof WorkplanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) : WorkplanPackage.eINSTANCE);
		LinebalancingPackageImpl theLinebalancingPackage = (LinebalancingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) instanceof LinebalancingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) : LinebalancingPackage.eINSTANCE);

		// Create package meta-data objects
		theTopologyPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theProductPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();
		theWorkplanPackage.createPackageContents();
		theLinebalancingPackage.createPackageContents();

		// Initialize created meta-data
		theTopologyPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theProductPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();
		theWorkplanPackage.initializePackageContents();
		theLinebalancingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTopologyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TopologyPackage.eNS_URI, theTopologyPackage);
		return theTopologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnterprise() {
		return enterpriseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterprise_Sites() {
		return (EReference)enterpriseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSite() {
		return siteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSite_Areas() {
		return (EReference)siteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_WorkCenters() {
		return (EReference)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkCenter() {
		return workCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessCell() {
		return processCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessCell_Units() {
		return (EReference)processCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductionUnit() {
		return productionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionUnit_Units() {
		return (EReference)productionUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductionLine() {
		return productionLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLine_WorkCells() {
		return (EReference)productionLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageZone() {
		return storageZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorageZone_StorageUnits() {
		return (EReference)storageZoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkUnit() {
		return workUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkUnit_EquipmentModules() {
		return (EReference)workUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkCell() {
		return workCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCell_Stations() {
		return (EReference)workCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageUnit() {
		return storageUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipmentModule() {
		return equipmentModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipmentModule_ControlModules() {
		return (EReference)equipmentModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipmentModule_EquipmentModules() {
		return (EReference)equipmentModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlModule() {
		return controlModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlModule_ControlModules() {
		return (EReference)controlModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductionLineSection() {
		return productionLineSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStation() {
		return stationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStation_EquipmentModules() {
		return (EReference)stationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_ComponentId_src() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_ComponentId_target() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Distance() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyStation() {
		return assemblyStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferStation() {
		return bufferStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBufferStation_Capacity() {
		return (EAttribute)bufferStationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyFactory getTopologyFactory() {
		return (TopologyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		enterpriseEClass = createEClass(ENTERPRISE);
		createEReference(enterpriseEClass, ENTERPRISE__SITES);

		siteEClass = createEClass(SITE);
		createEReference(siteEClass, SITE__AREAS);

		areaEClass = createEClass(AREA);
		createEReference(areaEClass, AREA__WORK_CENTERS);

		workCenterEClass = createEClass(WORK_CENTER);

		processCellEClass = createEClass(PROCESS_CELL);
		createEReference(processCellEClass, PROCESS_CELL__UNITS);

		productionUnitEClass = createEClass(PRODUCTION_UNIT);
		createEReference(productionUnitEClass, PRODUCTION_UNIT__UNITS);

		productionLineEClass = createEClass(PRODUCTION_LINE);
		createEReference(productionLineEClass, PRODUCTION_LINE__WORK_CELLS);

		storageZoneEClass = createEClass(STORAGE_ZONE);
		createEReference(storageZoneEClass, STORAGE_ZONE__STORAGE_UNITS);

		workUnitEClass = createEClass(WORK_UNIT);
		createEReference(workUnitEClass, WORK_UNIT__EQUIPMENT_MODULES);

		unitEClass = createEClass(UNIT);

		workCellEClass = createEClass(WORK_CELL);
		createEReference(workCellEClass, WORK_CELL__STATIONS);

		storageUnitEClass = createEClass(STORAGE_UNIT);

		equipmentModuleEClass = createEClass(EQUIPMENT_MODULE);
		createEReference(equipmentModuleEClass, EQUIPMENT_MODULE__CONTROL_MODULES);
		createEReference(equipmentModuleEClass, EQUIPMENT_MODULE__EQUIPMENT_MODULES);

		controlModuleEClass = createEClass(CONTROL_MODULE);
		createEReference(controlModuleEClass, CONTROL_MODULE__CONTROL_MODULES);

		productionLineSectionEClass = createEClass(PRODUCTION_LINE_SECTION);

		stationEClass = createEClass(STATION);
		createEReference(stationEClass, STATION__EQUIPMENT_MODULES);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__COMPONENT_ID_SRC);
		createEAttribute(transitionEClass, TRANSITION__COMPONENT_ID_TARGET);
		createEAttribute(transitionEClass, TRANSITION__DISTANCE);

		assemblyStationEClass = createEClass(ASSEMBLY_STATION);

		bufferStationEClass = createEClass(BUFFER_STATION);
		createEAttribute(bufferStationEClass, BUFFER_STATION__CAPACITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		enterpriseEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		siteEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		areaEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		workCenterEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		processCellEClass.getESuperTypes().add(this.getWorkCenter());
		productionUnitEClass.getESuperTypes().add(this.getWorkCenter());
		productionLineEClass.getESuperTypes().add(this.getWorkCenter());
		storageZoneEClass.getESuperTypes().add(this.getWorkCenter());
		workUnitEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		unitEClass.getESuperTypes().add(this.getWorkUnit());
		workCellEClass.getESuperTypes().add(this.getWorkUnit());
		storageUnitEClass.getESuperTypes().add(this.getWorkUnit());
		equipmentModuleEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		controlModuleEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		stationEClass.getESuperTypes().add(theBasePackage.getIdentifiableEntity());
		assemblyStationEClass.getESuperTypes().add(this.getStation());
		bufferStationEClass.getESuperTypes().add(this.getStation());

		// Initialize classes, features, and operations; add parameters
		initEClass(enterpriseEClass, Enterprise.class, "Enterprise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnterprise_Sites(), this.getSite(), null, "sites", null, 1, -1, Enterprise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siteEClass, Site.class, "Site", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSite_Areas(), this.getArea(), null, "areas", null, 0, -1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_WorkCenters(), this.getWorkCenter(), null, "workCenters", null, 0, 1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workCenterEClass, WorkCenter.class, "WorkCenter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processCellEClass, ProcessCell.class, "ProcessCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessCell_Units(), this.getUnit(), null, "units", null, 1, -1, ProcessCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionUnitEClass, ProductionUnit.class, "ProductionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductionUnit_Units(), this.getUnit(), null, "units", null, 1, -1, ProductionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionLineEClass, ProductionLine.class, "ProductionLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductionLine_WorkCells(), this.getWorkCell(), null, "workCells", null, 1, -1, ProductionLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageZoneEClass, StorageZone.class, "StorageZone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorageZone_StorageUnits(), this.getStorageUnit(), null, "storageUnits", null, 1, -1, StorageZone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workUnitEClass, WorkUnit.class, "WorkUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkUnit_EquipmentModules(), this.getEquipmentModule(), null, "equipmentModules", null, 0, -1, WorkUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workCellEClass, WorkCell.class, "WorkCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkCell_Stations(), this.getStation(), null, "stations", null, 0, -1, WorkCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageUnitEClass, StorageUnit.class, "StorageUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equipmentModuleEClass, EquipmentModule.class, "EquipmentModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquipmentModule_ControlModules(), this.getControlModule(), null, "controlModules", null, 0, -1, EquipmentModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquipmentModule_EquipmentModules(), this.getEquipmentModule(), null, "equipmentModules", null, 0, -1, EquipmentModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlModuleEClass, ControlModule.class, "ControlModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlModule_ControlModules(), this.getControlModule(), null, "controlModules", null, 0, -1, ControlModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionLineSectionEClass, ProductionLineSection.class, "ProductionLineSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stationEClass, Station.class, "Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStation_EquipmentModules(), this.getEquipmentModule(), null, "equipmentModules", null, 0, -1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_ComponentId_src(), ecorePackage.getEString(), "componentId_src", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ComponentId_target(), ecorePackage.getEString(), "componentId_target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Distance(), ecorePackage.getEFloat(), "distance", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyStationEClass, AssemblyStation.class, "AssemblyStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bufferStationEClass, BufferStation.class, "BufferStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBufferStation_Capacity(), ecorePackage.getEInt(), "capacity", null, 0, 1, BufferStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TopologyPackageImpl
