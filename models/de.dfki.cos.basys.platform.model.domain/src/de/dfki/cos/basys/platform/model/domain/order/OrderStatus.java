/**
 */
package de.dfki.cos.basys.platform.model.domain.order;

import de.dfki.cos.basys.platform.model.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO: Überarbeiten
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.OrderStatus#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.OrderStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.domain.order.OrderStatus#getPieceCount <em>Piece Count</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.domain.order.OrderPackage#getOrderStatus()
 * @model
 * @generated
 */
public interface OrderStatus extends Entity {
	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see de.dfki.cos.basys.platform.model.domain.order.OrderPackage#getOrderStatus_OrderId()
	 * @model
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.order.OrderStatus#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.domain.order.OrderStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.order.OrderStatusEnum
	 * @see #setStatus(OrderStatusEnum)
	 * @see de.dfki.cos.basys.platform.model.domain.order.OrderPackage#getOrderStatus_Status()
	 * @model
	 * @generated
	 */
	OrderStatusEnum getStatus();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.order.OrderStatus#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.domain.order.OrderStatusEnum
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(OrderStatusEnum value);

	/**
	 * Returns the value of the '<em><b>Piece Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Piece Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece Count</em>' attribute.
	 * @see #setPieceCount(int)
	 * @see de.dfki.cos.basys.platform.model.domain.order.OrderPackage#getOrderStatus_PieceCount()
	 * @model
	 * @generated
	 */
	int getPieceCount();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.domain.order.OrderStatus#getPieceCount <em>Piece Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piece Count</em>' attribute.
	 * @see #getPieceCount()
	 * @generated
	 */
	void setPieceCount(int value);

} // OrderStatus
