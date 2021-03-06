/**
 */
package de.dfki.cos.basys.platform.model.domain.productinstance.impl;

import de.dfki.cos.basys.platform.model.base.BasePackage;
import de.dfki.cos.basys.platform.model.data.DataPackage;
import de.dfki.cos.basys.platform.model.domain.capability.CapabilityPackage;
import de.dfki.cos.basys.platform.model.domain.capability.impl.CapabilityPackageImpl;
import de.dfki.cos.basys.platform.model.domain.linebalancing.LinebalancingPackage;
import de.dfki.cos.basys.platform.model.domain.linebalancing.impl.LinebalancingPackageImpl;
import de.dfki.cos.basys.platform.model.domain.material.MaterialPackage;
import de.dfki.cos.basys.platform.model.domain.material.impl.MaterialPackageImpl;
import de.dfki.cos.basys.platform.model.domain.order.OrderPackage;
import de.dfki.cos.basys.platform.model.domain.order.impl.OrderPackageImpl;
import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.processdefinition.impl.ProcessdefinitionPackageImpl;
import de.dfki.cos.basys.platform.model.domain.processinstance.ProcessinstancePackage;
import de.dfki.cos.basys.platform.model.domain.processinstance.impl.ProcessinstancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.productdefinition.ProductdefinitionPackage;
import de.dfki.cos.basys.platform.model.domain.productdefinition.impl.ProductdefinitionPackageImpl;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceDetectionEnum;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceLocation;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceLocationChangeEvent;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatus;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatusChangeEvent;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatusEnum;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStore;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstanceFactory;
import de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.ResourceinstancePackage;
import de.dfki.cos.basys.platform.model.domain.resourceinstance.impl.ResourceinstancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.resourcetype.ResourcetypePackage;
import de.dfki.cos.basys.platform.model.domain.resourcetype.impl.ResourcetypePackageImpl;
import de.dfki.cos.basys.platform.model.domain.staff.StaffPackage;
import de.dfki.cos.basys.platform.model.domain.staff.impl.StaffPackageImpl;
import de.dfki.cos.basys.platform.model.domain.topology.TopologyPackage;
import de.dfki.cos.basys.platform.model.domain.topology.impl.TopologyPackageImpl;
import de.dfki.cos.basys.platform.model.domain.workerguidance.WorkerguidancePackage;
import de.dfki.cos.basys.platform.model.domain.workerguidance.impl.WorkerguidancePackageImpl;
import de.dfki.cos.basys.platform.model.domain.workforce.WorkforcePackage;
import de.dfki.cos.basys.platform.model.domain.workforce.impl.WorkforcePackageImpl;
import de.dfki.cos.basys.platform.model.domain.workplan.WorkplanPackage;
import de.dfki.cos.basys.platform.model.domain.workplan.impl.WorkplanPackageImpl;
import de.dfki.cos.basys.platform.model.pattern.PatternPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductinstancePackageImpl extends EPackageImpl implements ProductinstancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceStatusChangeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceLocationChangeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productInstanceDetectionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productInstanceStatusEnumEEnum = null;

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
	 * @see de.dfki.cos.basys.platform.model.domain.productinstance.ProductinstancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductinstancePackageImpl() {
		super(eNS_URI, ProductinstanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProductinstancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProductinstancePackage init() {
		if (isInited) return (ProductinstancePackage)EPackage.Registry.INSTANCE.getEPackage(ProductinstancePackage.eNS_URI);

		// Obtain or create and register package
		ProductinstancePackageImpl theProductinstancePackage = (ProductinstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProductinstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProductinstancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) instanceof OrderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) : OrderPackage.eINSTANCE);
		ProductdefinitionPackageImpl theProductdefinitionPackage = (ProductdefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductdefinitionPackage.eNS_URI) instanceof ProductdefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductdefinitionPackage.eNS_URI) : ProductdefinitionPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		WorkerguidancePackageImpl theWorkerguidancePackage = (WorkerguidancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) instanceof WorkerguidancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkerguidancePackage.eNS_URI) : WorkerguidancePackage.eINSTANCE);
		WorkplanPackageImpl theWorkplanPackage = (WorkplanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) instanceof WorkplanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkplanPackage.eNS_URI) : WorkplanPackage.eINSTANCE);
		LinebalancingPackageImpl theLinebalancingPackage = (LinebalancingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) instanceof LinebalancingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinebalancingPackage.eNS_URI) : LinebalancingPackage.eINSTANCE);
		CapabilityPackageImpl theCapabilityPackage = (CapabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI) instanceof CapabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI) : CapabilityPackage.eINSTANCE);
		ProcessdefinitionPackageImpl theProcessdefinitionPackage = (ProcessdefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessdefinitionPackage.eNS_URI) instanceof ProcessdefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessdefinitionPackage.eNS_URI) : ProcessdefinitionPackage.eINSTANCE);
		ProcessinstancePackageImpl theProcessinstancePackage = (ProcessinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) instanceof ProcessinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessinstancePackage.eNS_URI) : ProcessinstancePackage.eINSTANCE);
		WorkforcePackageImpl theWorkforcePackage = (WorkforcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) instanceof WorkforcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkforcePackage.eNS_URI) : WorkforcePackage.eINSTANCE);
		MaterialPackageImpl theMaterialPackage = (MaterialPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI) instanceof MaterialPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI) : MaterialPackage.eINSTANCE);
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) instanceof ResourcetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) : ResourcetypePackage.eINSTANCE);
		ResourceinstancePackageImpl theResourceinstancePackage = (ResourceinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI) instanceof ResourceinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourceinstancePackage.eNS_URI) : ResourceinstancePackage.eINSTANCE);

		// Create package meta-data objects
		theProductinstancePackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theProductdefinitionPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theTopologyPackage.createPackageContents();
		theWorkerguidancePackage.createPackageContents();
		theWorkplanPackage.createPackageContents();
		theLinebalancingPackage.createPackageContents();
		theCapabilityPackage.createPackageContents();
		theProcessdefinitionPackage.createPackageContents();
		theProcessinstancePackage.createPackageContents();
		theWorkforcePackage.createPackageContents();
		theMaterialPackage.createPackageContents();
		theResourcetypePackage.createPackageContents();
		theResourceinstancePackage.createPackageContents();

		// Initialize created meta-data
		theProductinstancePackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theProductdefinitionPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();
		theWorkerguidancePackage.initializePackageContents();
		theWorkplanPackage.initializePackageContents();
		theLinebalancingPackage.initializePackageContents();
		theCapabilityPackage.initializePackageContents();
		theProcessdefinitionPackage.initializePackageContents();
		theProcessinstancePackage.initializePackageContents();
		theWorkforcePackage.initializePackageContents();
		theMaterialPackage.initializePackageContents();
		theResourcetypePackage.initializePackageContents();
		theResourceinstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductinstancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProductinstancePackage.eNS_URI, theProductinstancePackage);
		return theProductinstancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstance() {
		return productInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductInstance_ManufacturedComponent() {
		return (EReference)productInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductInstance_Order() {
		return (EReference)productInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstance_SerialNumber() {
		return (EAttribute)productInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstanceStatus() {
		return productInstanceStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceStatus_ProductInstanceId() {
		return (EAttribute)productInstanceStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceStatus_Status() {
		return (EAttribute)productInstanceStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstanceStatusChangeEvent() {
		return productInstanceStatusChangeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceStatusChangeEvent_Timestamp() {
		return (EAttribute)productInstanceStatusChangeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstanceLocation() {
		return productInstanceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceLocation_DetectionType() {
		return (EAttribute)productInstanceLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceLocation_ProductInstanceId() {
		return (EAttribute)productInstanceLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceLocation_ComponentId() {
		return (EAttribute)productInstanceLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstanceLocationChangeEvent() {
		return productInstanceLocationChangeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductInstanceLocationChangeEvent_Timestamp() {
		return (EAttribute)productInstanceLocationChangeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstanceStore() {
		return productInstanceStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductInstanceStore_ProductInstances() {
		return (EReference)productInstanceStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductInstanceDetectionEnum() {
		return productInstanceDetectionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductInstanceStatusEnum() {
		return productInstanceStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductinstanceFactory getProductinstanceFactory() {
		return (ProductinstanceFactory)getEFactoryInstance();
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
		productInstanceEClass = createEClass(PRODUCT_INSTANCE);
		createEReference(productInstanceEClass, PRODUCT_INSTANCE__MANUFACTURED_COMPONENT);
		createEReference(productInstanceEClass, PRODUCT_INSTANCE__ORDER);
		createEAttribute(productInstanceEClass, PRODUCT_INSTANCE__SERIAL_NUMBER);

		productInstanceStatusEClass = createEClass(PRODUCT_INSTANCE_STATUS);
		createEAttribute(productInstanceStatusEClass, PRODUCT_INSTANCE_STATUS__PRODUCT_INSTANCE_ID);
		createEAttribute(productInstanceStatusEClass, PRODUCT_INSTANCE_STATUS__STATUS);

		productInstanceStatusChangeEventEClass = createEClass(PRODUCT_INSTANCE_STATUS_CHANGE_EVENT);
		createEAttribute(productInstanceStatusChangeEventEClass, PRODUCT_INSTANCE_STATUS_CHANGE_EVENT__TIMESTAMP);

		productInstanceLocationEClass = createEClass(PRODUCT_INSTANCE_LOCATION);
		createEAttribute(productInstanceLocationEClass, PRODUCT_INSTANCE_LOCATION__DETECTION_TYPE);
		createEAttribute(productInstanceLocationEClass, PRODUCT_INSTANCE_LOCATION__PRODUCT_INSTANCE_ID);
		createEAttribute(productInstanceLocationEClass, PRODUCT_INSTANCE_LOCATION__COMPONENT_ID);

		productInstanceLocationChangeEventEClass = createEClass(PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT);
		createEAttribute(productInstanceLocationChangeEventEClass, PRODUCT_INSTANCE_LOCATION_CHANGE_EVENT__TIMESTAMP);

		productInstanceStoreEClass = createEClass(PRODUCT_INSTANCE_STORE);
		createEReference(productInstanceStoreEClass, PRODUCT_INSTANCE_STORE__PRODUCT_INSTANCES);

		// Create enums
		productInstanceDetectionEnumEEnum = createEEnum(PRODUCT_INSTANCE_DETECTION_ENUM);
		productInstanceStatusEnumEEnum = createEEnum(PRODUCT_INSTANCE_STATUS_ENUM);
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
		ProductdefinitionPackage theProductdefinitionPackage = (ProductdefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(ProductdefinitionPackage.eNS_URI);
		OrderPackage theOrderPackage = (OrderPackage)EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		productInstanceEClass.getESuperTypes().add(theBasePackage.getEntity());
		productInstanceStatusEClass.getESuperTypes().add(theBasePackage.getEntity());
		productInstanceStatusChangeEventEClass.getESuperTypes().add(this.getProductInstanceStatus());
		productInstanceLocationEClass.getESuperTypes().add(theBasePackage.getEntity());
		productInstanceLocationChangeEventEClass.getESuperTypes().add(this.getProductInstanceLocation());

		// Initialize classes, features, and operations; add parameters
		initEClass(productInstanceEClass, ProductInstance.class, "ProductInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductInstance_ManufacturedComponent(), theProductdefinitionPackage.getManufacturedComponent(), null, "manufacturedComponent", null, 1, 1, ProductInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductInstance_Order(), theOrderPackage.getOrder(), null, "order", null, 1, 1, ProductInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductInstance_SerialNumber(), ecorePackage.getEString(), "serialNumber", null, 0, 1, ProductInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productInstanceStatusEClass, ProductInstanceStatus.class, "ProductInstanceStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductInstanceStatus_ProductInstanceId(), ecorePackage.getEString(), "productInstanceId", null, 0, 1, ProductInstanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductInstanceStatus_Status(), this.getProductInstanceStatusEnum(), "status", null, 0, 1, ProductInstanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productInstanceStatusChangeEventEClass, ProductInstanceStatusChangeEvent.class, "ProductInstanceStatusChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductInstanceStatusChangeEvent_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, ProductInstanceStatusChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productInstanceLocationEClass, ProductInstanceLocation.class, "ProductInstanceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductInstanceLocation_DetectionType(), this.getProductInstanceDetectionEnum(), "detectionType", null, 0, 1, ProductInstanceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductInstanceLocation_ProductInstanceId(), ecorePackage.getEString(), "productInstanceId", null, 0, 1, ProductInstanceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductInstanceLocation_ComponentId(), ecorePackage.getEString(), "componentId", null, 0, 1, ProductInstanceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productInstanceLocationChangeEventEClass, ProductInstanceLocationChangeEvent.class, "ProductInstanceLocationChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductInstanceLocationChangeEvent_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, ProductInstanceLocationChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productInstanceStoreEClass, ProductInstanceStore.class, "ProductInstanceStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductInstanceStore_ProductInstances(), this.getProductInstance(), null, "productInstances", null, 0, -1, ProductInstanceStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(productInstanceDetectionEnumEEnum, ProductInstanceDetectionEnum.class, "ProductInstanceDetectionEnum");
		addEEnumLiteral(productInstanceDetectionEnumEEnum, ProductInstanceDetectionEnum.UNKNOWN);
		addEEnumLiteral(productInstanceDetectionEnumEEnum, ProductInstanceDetectionEnum.PRESENT);
		addEEnumLiteral(productInstanceDetectionEnumEEnum, ProductInstanceDetectionEnum.IN_TRANSIT);

		initEEnum(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.class, "ProductInstanceStatusEnum");
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.UNKNOWN);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IN_PRODUCTION);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.WAITING);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IN_TEST);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.NIO);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IN_REPAIR);
		addEEnumLiteral(productInstanceStatusEnumEEnum, ProductInstanceStatusEnum.IO);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://de.dfki.iui.mmds/CoreModel
		createCoreModelAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://de.dfki.iui.mmds/CoreModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCoreModelAnnotations() {
		String source = "http://de.dfki.iui.mmds/CoreModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

} //ProductinstancePackageImpl
