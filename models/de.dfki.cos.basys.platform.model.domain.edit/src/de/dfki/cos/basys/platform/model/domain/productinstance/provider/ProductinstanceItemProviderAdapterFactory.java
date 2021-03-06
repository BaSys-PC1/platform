/**
 */
package de.dfki.cos.basys.platform.model.domain.productinstance.provider;

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

import de.dfki.cos.basys.platform.model.domain.productinstance.util.ProductinstanceAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductinstanceItemProviderAdapterFactory extends ProductinstanceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ProductinstanceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceItemProvider productInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductInstanceAdapter() {
		if (productInstanceItemProvider == null) {
			productInstanceItemProvider = new ProductInstanceItemProvider(this);
		}

		return productInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceStatusItemProvider productInstanceStatusItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductInstanceStatusAdapter() {
		if (productInstanceStatusItemProvider == null) {
			productInstanceStatusItemProvider = new ProductInstanceStatusItemProvider(this);
		}

		return productInstanceStatusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatusChangeEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceStatusChangeEventItemProvider productInstanceStatusChangeEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStatusChangeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductInstanceStatusChangeEventAdapter() {
		if (productInstanceStatusChangeEventItemProvider == null) {
			productInstanceStatusChangeEventItemProvider = new ProductInstanceStatusChangeEventItemProvider(this);
		}

		return productInstanceStatusChangeEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceLocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceLocationItemProvider productInstanceLocationItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductInstanceLocationAdapter() {
		if (productInstanceLocationItemProvider == null) {
			productInstanceLocationItemProvider = new ProductInstanceLocationItemProvider(this);
		}

		return productInstanceLocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceLocationChangeEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceLocationChangeEventItemProvider productInstanceLocationChangeEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceLocationChangeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductInstanceLocationChangeEventAdapter() {
		if (productInstanceLocationChangeEventItemProvider == null) {
			productInstanceLocationChangeEventItemProvider = new ProductInstanceLocationChangeEventItemProvider(this);
		}

		return productInstanceLocationChangeEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceStoreItemProvider productInstanceStoreItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.cos.basys.platform.model.domain.productinstance.ProductInstanceStore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductInstanceStoreAdapter() {
		if (productInstanceStoreItemProvider == null) {
			productInstanceStoreItemProvider = new ProductInstanceStoreItemProvider(this);
		}

		return productInstanceStoreItemProvider;
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
		if (productInstanceItemProvider != null) productInstanceItemProvider.dispose();
		if (productInstanceStatusItemProvider != null) productInstanceStatusItemProvider.dispose();
		if (productInstanceStatusChangeEventItemProvider != null) productInstanceStatusChangeEventItemProvider.dispose();
		if (productInstanceLocationItemProvider != null) productInstanceLocationItemProvider.dispose();
		if (productInstanceLocationChangeEventItemProvider != null) productInstanceLocationChangeEventItemProvider.dispose();
		if (productInstanceStoreItemProvider != null) productInstanceStoreItemProvider.dispose();
	}

}
