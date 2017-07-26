/**
 */
package de.dfki.iui.basys.model.service.provider;

import de.dfki.iui.basys.model.service.util.ServiceAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceItemProviderAdapterFactory extends ServiceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.service.ServiceDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDescriptionItemProvider serviceDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.service.ServiceDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceDescriptionAdapter() {
		if (serviceDescriptionItemProvider == null) {
			serviceDescriptionItemProvider = new ServiceDescriptionItemProvider(this);
		}

		return serviceDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.service.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.service.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.service.Publication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationItemProvider publicationItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.service.Publication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPublicationAdapter() {
		if (publicationItemProvider == null) {
			publicationItemProvider = new PublicationItemProvider(this);
		}

		return publicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.service.Subscription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionItemProvider subscriptionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.service.Subscription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubscriptionAdapter() {
		if (subscriptionItemProvider == null) {
			subscriptionItemProvider = new SubscriptionItemProvider(this);
		}

		return subscriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.service.ServiceImplementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImplementationItemProvider serviceImplementationItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.service.ServiceImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceImplementationAdapter() {
		if (serviceImplementationItemProvider == null) {
			serviceImplementationItemProvider = new ServiceImplementationItemProvider(this);
		}

		return serviceImplementationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.service.ServiceInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInstanceItemProvider serviceInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.service.ServiceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceInstanceAdapter() {
		if (serviceInstanceItemProvider == null) {
			serviceInstanceItemProvider = new ServiceInstanceItemProvider(this);
		}

		return serviceInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.service.ServiceEndpoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceEndpointItemProvider serviceEndpointItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.service.ServiceEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceEndpointAdapter() {
		if (serviceEndpointItemProvider == null) {
			serviceEndpointItemProvider = new ServiceEndpointItemProvider(this);
		}

		return serviceEndpointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.service.RestEndpoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestEndpointItemProvider restEndpointItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.service.RestEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRestEndpointAdapter() {
		if (restEndpointItemProvider == null) {
			restEndpointItemProvider = new RestEndpointItemProvider(this);
		}

		return restEndpointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.service.SoapEndpoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoapEndpointItemProvider soapEndpointItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.service.SoapEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoapEndpointAdapter() {
		if (soapEndpointItemProvider == null) {
			soapEndpointItemProvider = new SoapEndpointItemProvider(this);
		}

		return soapEndpointItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (serviceDescriptionItemProvider != null) serviceDescriptionItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (publicationItemProvider != null) publicationItemProvider.dispose();
		if (subscriptionItemProvider != null) subscriptionItemProvider.dispose();
		if (serviceImplementationItemProvider != null) serviceImplementationItemProvider.dispose();
		if (serviceInstanceItemProvider != null) serviceInstanceItemProvider.dispose();
		if (serviceEndpointItemProvider != null) serviceEndpointItemProvider.dispose();
		if (restEndpointItemProvider != null) restEndpointItemProvider.dispose();
		if (soapEndpointItemProvider != null) soapEndpointItemProvider.dispose();
	}

}
