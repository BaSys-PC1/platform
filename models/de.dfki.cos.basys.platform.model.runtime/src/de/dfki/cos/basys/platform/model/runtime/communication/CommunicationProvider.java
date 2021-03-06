/**
 */
package de.dfki.cos.basys.platform.model.runtime.communication;

import de.dfki.cos.basys.platform.model.runtime.communication.exceptions.ProviderException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.cos.basys.platform.model.runtime.communication.CommunicationPackage#getCommunicationProvider()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface CommunicationProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ProviderException"
	 * @generated
	 */
	void doConnect(ChannelPool pool) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ProviderException"
	 * @generated
	 */
	void doDisconnect(ChannelPool pool) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ProviderException"
	 * @generated
	 */
	void doOpenChannel(Channel channel) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ProviderException"
	 * @generated
	 */
	void doCloseChannel(Channel channel) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ProviderException"
	 * @generated
	 */
	void doSendMessage(Channel channel, String msg) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ProviderException"
	 * @generated
	 */
	void doSendRequest(Channel channel, Request req, ResponseCallback cb) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ProviderException"
	 * @generated
	 */
	Response doSendRequest(Channel channel, Request req) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.cos.basys.platform.model.runtime.communication.ProviderException"
	 * @generated
	 */
	void doSendNotification(Channel channel, Notification not) throws ProviderException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean supportQueuedChannels();

} // CommunicationProvider
