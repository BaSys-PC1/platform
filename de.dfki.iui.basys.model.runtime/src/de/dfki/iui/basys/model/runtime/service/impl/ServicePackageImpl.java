/**
 */
package de.dfki.iui.basys.model.runtime.service.impl;

import de.dfki.iui.basys.model.base.BasePackage;

import de.dfki.iui.basys.model.domain.capability.CapabilityPackage;

import de.dfki.iui.basys.model.pattern.PatternPackage;

import de.dfki.iui.basys.model.runtime.communication.CommunicationPackage;

import de.dfki.iui.basys.model.runtime.communication.impl.CommunicationPackageImpl;

import de.dfki.iui.basys.model.runtime.service.EntityOperationEnum;
import de.dfki.iui.basys.model.runtime.service.ManagedEntity;
import de.dfki.iui.basys.model.runtime.service.Operation;
import de.dfki.iui.basys.model.runtime.service.Property;
import de.dfki.iui.basys.model.runtime.service.Publication;
import de.dfki.iui.basys.model.runtime.service.ServiceDescription;
import de.dfki.iui.basys.model.runtime.service.ServiceFactory;
import de.dfki.iui.basys.model.runtime.service.ServicePackage;
import de.dfki.iui.basys.model.runtime.service.ServiceTypeEnum;
import de.dfki.iui.basys.model.runtime.service.Subscription;

import de.dfki.iui.basys.model.runtime.service.util.ServiceValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicePackageImpl extends EPackageImpl implements ServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityOperationEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceTypeEnumEEnum = null;

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
	 * @see de.dfki.iui.basys.model.runtime.service.ServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicePackageImpl() {
		super(eNS_URI, ServiceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicePackage init() {
		if (isInited) return (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Obtain or create and register package
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		CapabilityPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) : CommunicationPackage.eINSTANCE);

		// Create package meta-data objects
		theServicePackage.createPackageContents();
		theCommunicationPackage.createPackageContents();

		// Initialize created meta-data
		theServicePackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theServicePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ServiceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theServicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicePackage.eNS_URI, theServicePackage);
		return theServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescription() {
		return serviceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_Version() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_ServiceType() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_Properties() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_Operations() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_Publications() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_Subscriptions() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_Dependencies() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_ManagedEntities() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Capabilities() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Capabilities() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublication() {
		return publicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublication_Capabilities() {
		return (EReference)publicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscription() {
		return subscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Capabilities() {
		return (EReference)subscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagedEntity() {
		return managedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedEntity_SupportedOperations() {
		return (EAttribute)managedEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityOperationEnum() {
		return entityOperationEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceTypeEnum() {
		return serviceTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFactory getServiceFactory() {
		return (ServiceFactory)getEFactoryInstance();
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
		serviceDescriptionEClass = createEClass(SERVICE_DESCRIPTION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__VERSION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_TYPE);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__PROPERTIES);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__OPERATIONS);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__PUBLICATIONS);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SUBSCRIPTIONS);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__DEPENDENCIES);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__MANAGED_ENTITIES);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__CAPABILITIES);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__CAPABILITIES);

		publicationEClass = createEClass(PUBLICATION);
		createEReference(publicationEClass, PUBLICATION__CAPABILITIES);

		subscriptionEClass = createEClass(SUBSCRIPTION);
		createEReference(subscriptionEClass, SUBSCRIPTION__CAPABILITIES);

		managedEntityEClass = createEClass(MANAGED_ENTITY);
		createEAttribute(managedEntityEClass, MANAGED_ENTITY__SUPPORTED_OPERATIONS);

		// Create enums
		entityOperationEnumEEnum = createEEnum(ENTITY_OPERATION_ENUM);
		serviceTypeEnumEEnum = createEEnum(SERVICE_TYPE_ENUM);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CapabilityPackage theCapabilityPackage = (CapabilityPackage)EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceDescriptionEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		propertyEClass.getESuperTypes().add(theEcorePackage.getETypedElement());
		operationEClass.getESuperTypes().add(theEcorePackage.getEOperation());
		publicationEClass.getESuperTypes().add(theEcorePackage.getETypedElement());
		subscriptionEClass.getESuperTypes().add(theEcorePackage.getETypedElement());
		managedEntityEClass.getESuperTypes().add(theEcorePackage.getETypedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceDescriptionEClass, ServiceDescription.class, "ServiceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDescription_Version(), theEcorePackage.getEString(), "version", "", 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescription_ServiceType(), this.getServiceTypeEnum(), "serviceType", "DIGITAL_SERVICE", 1, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_Properties(), this.getProperty(), null, "properties", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_Operations(), this.getOperation(), null, "operations", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_Publications(), this.getPublication(), null, "publications", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_Subscriptions(), this.getSubscription(), null, "subscriptions", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_Dependencies(), this.getServiceDescription(), null, "dependencies", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_ManagedEntities(), this.getManagedEntity(), null, "managedEntities", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Capabilities(), theCapabilityPackage.getCapability(), null, "capabilities", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Capabilities(), theCapabilityPackage.getCapabilityAssertion(), null, "capabilities", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicationEClass, Publication.class, "Publication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublication_Capabilities(), theCapabilityPackage.getCapability(), null, "capabilities", null, 0, -1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptionEClass, Subscription.class, "Subscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscription_Capabilities(), theCapabilityPackage.getCapability(), null, "capabilities", null, 0, -1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managedEntityEClass, ManagedEntity.class, "ManagedEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagedEntity_SupportedOperations(), this.getEntityOperationEnum(), "supportedOperations", null, 0, -1, ManagedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(entityOperationEnumEEnum, EntityOperationEnum.class, "EntityOperationEnum");
		addEEnumLiteral(entityOperationEnumEEnum, EntityOperationEnum.CREATE);
		addEEnumLiteral(entityOperationEnumEEnum, EntityOperationEnum.RETRIEVE);
		addEEnumLiteral(entityOperationEnumEEnum, EntityOperationEnum.UPDATE);
		addEEnumLiteral(entityOperationEnumEEnum, EntityOperationEnum.DELETE);

		initEEnum(serviceTypeEnumEEnum, ServiceTypeEnum.class, "ServiceTypeEnum");
		addEEnumLiteral(serviceTypeEnumEEnum, ServiceTypeEnum.DIGITAL_SERVICE);
		addEEnumLiteral(serviceTypeEnumEEnum, ServiceTypeEnum.PHYSICAL_SERVICE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
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
		addAnnotation
		  (serviceDescriptionEClass, 
		   source, 
		   new String[] {
			 "constraints", "noSelfDependency"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (serviceDescriptionEClass, 
		   source, 
		   new String[] {
			 "noSelfDependency", "not dependencies->includes(self)"
		   });
	}

} //ServicePackageImpl
