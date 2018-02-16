/**
 */
package de.dfki.iui.basys.model.domain.order;

import de.dfki.iui.basys.model.base.BasePackage;

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
 * @see de.dfki.iui.basys.model.domain.order.OrderFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface OrderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "order";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/basys/model/order";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "order";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrderPackage eINSTANCE = de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.order.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.order.impl.OrderImpl
	 * @see de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Product Variant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRODUCT_VARIANT_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__START_DATE = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__END_DATE = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PIECES = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRIORITY = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__STATUS = BasePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.order.impl.OrderStatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.order.impl.OrderStatusImpl
	 * @see de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl#getOrderStatus()
	 * @generated
	 */
	int ORDER_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__BINDING = BasePackage.ENTITY__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__NAME = BasePackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__METADATA = BasePackage.ENTITY__METADATA;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__ORDER_ID = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__STATUS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Piece Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__PIECE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.order.impl.OrderStatusChangeEventImpl <em>Status Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.order.impl.OrderStatusChangeEventImpl
	 * @see de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl#getOrderStatusChangeEvent()
	 * @generated
	 */
	int ORDER_STATUS_CHANGE_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_CHANGE_EVENT__BINDING = ORDER_STATUS__BINDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_CHANGE_EVENT__ID = ORDER_STATUS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_CHANGE_EVENT__NAME = ORDER_STATUS__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_CHANGE_EVENT__METADATA = ORDER_STATUS__METADATA;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_CHANGE_EVENT__ORDER_ID = ORDER_STATUS__ORDER_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_CHANGE_EVENT__STATUS = ORDER_STATUS__STATUS;

	/**
	 * The feature id for the '<em><b>Piece Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_CHANGE_EVENT__PIECE_COUNT = ORDER_STATUS__PIECE_COUNT;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_CHANGE_EVENT__TIMESTAMP = ORDER_STATUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Status Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_CHANGE_EVENT_FEATURE_COUNT = ORDER_STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Status Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_CHANGE_EVENT_OPERATION_COUNT = ORDER_STATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.basys.model.domain.order.OrderStatusEnum <em>Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.basys.model.domain.order.OrderStatusEnum
	 * @see de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl#getOrderStatusEnum()
	 * @generated
	 */
	int ORDER_STATUS_ENUM = 3;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.order.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.order.Order#getProductVariantId <em>Product Variant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Variant Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.Order#getProductVariantId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_ProductVariantId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.order.Order#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.Order#getStartDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.order.Order#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.Order#getEndDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.order.Order#getPieces <em>Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pieces</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.Order#getPieces()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Pieces();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.order.Order#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.Order#getPriority()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.basys.model.domain.order.Order#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.Order#getStatus()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Status();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.order.OrderStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.OrderStatus
	 * @generated
	 */
	EClass getOrderStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.order.OrderStatus#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.OrderStatus#getOrderId()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EAttribute getOrderStatus_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.order.OrderStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.OrderStatus#getStatus()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EAttribute getOrderStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.order.OrderStatus#getPieceCount <em>Piece Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Piece Count</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.OrderStatus#getPieceCount()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EAttribute getOrderStatus_PieceCount();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.basys.model.domain.order.OrderStatusChangeEvent <em>Status Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Change Event</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.OrderStatusChangeEvent
	 * @generated
	 */
	EClass getOrderStatusChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.basys.model.domain.order.OrderStatusChangeEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.OrderStatusChangeEvent#getTimestamp()
	 * @see #getOrderStatusChangeEvent()
	 * @generated
	 */
	EAttribute getOrderStatusChangeEvent_Timestamp();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.basys.model.domain.order.OrderStatusEnum <em>Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Enum</em>'.
	 * @see de.dfki.iui.basys.model.domain.order.OrderStatusEnum
	 * @generated
	 */
	EEnum getOrderStatusEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrderFactory getOrderFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.order.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.order.impl.OrderImpl
		 * @see de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Product Variant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PRODUCT_VARIANT_ID = eINSTANCE.getOrder_ProductVariantId();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__START_DATE = eINSTANCE.getOrder_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__END_DATE = eINSTANCE.getOrder_EndDate();

		/**
		 * The meta object literal for the '<em><b>Pieces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PIECES = eINSTANCE.getOrder_Pieces();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PRIORITY = eINSTANCE.getOrder_Priority();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__STATUS = eINSTANCE.getOrder_Status();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.order.impl.OrderStatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.order.impl.OrderStatusImpl
		 * @see de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl#getOrderStatus()
		 * @generated
		 */
		EClass ORDER_STATUS = eINSTANCE.getOrderStatus();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_STATUS__ORDER_ID = eINSTANCE.getOrderStatus_OrderId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_STATUS__STATUS = eINSTANCE.getOrderStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Piece Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_STATUS__PIECE_COUNT = eINSTANCE.getOrderStatus_PieceCount();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.order.impl.OrderStatusChangeEventImpl <em>Status Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.order.impl.OrderStatusChangeEventImpl
		 * @see de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl#getOrderStatusChangeEvent()
		 * @generated
		 */
		EClass ORDER_STATUS_CHANGE_EVENT = eINSTANCE.getOrderStatusChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_STATUS_CHANGE_EVENT__TIMESTAMP = eINSTANCE.getOrderStatusChangeEvent_Timestamp();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.basys.model.domain.order.OrderStatusEnum <em>Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.basys.model.domain.order.OrderStatusEnum
		 * @see de.dfki.iui.basys.model.domain.order.impl.OrderPackageImpl#getOrderStatusEnum()
		 * @generated
		 */
		EEnum ORDER_STATUS_ENUM = eINSTANCE.getOrderStatusEnum();

	}

} //OrderPackage
