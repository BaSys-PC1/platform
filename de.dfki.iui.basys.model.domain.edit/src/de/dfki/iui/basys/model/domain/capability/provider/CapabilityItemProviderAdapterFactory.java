/**
 */
package de.dfki.iui.basys.model.domain.capability.provider;

import de.dfki.iui.basys.model.domain.capability.util.CapabilityAdapterFactory;

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
public class CapabilityItemProviderAdapterFactory extends CapabilityAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public CapabilityItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.CapabilityAssertion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityAssertionItemProvider capabilityAssertionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.CapabilityAssertion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapabilityAssertionAdapter() {
		if (capabilityAssertionItemProvider == null) {
			capabilityAssertionItemProvider = new CapabilityAssertionItemProvider(this);
		}

		return capabilityAssertionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.Capability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityItemProvider capabilityItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapabilityAdapter() {
		if (capabilityItemProvider == null) {
			capabilityItemProvider = new CapabilityItemProvider(this);
		}

		return capabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.ManufacturingCapability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingCapabilityItemProvider manufacturingCapabilityItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.ManufacturingCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManufacturingCapabilityAdapter() {
		if (manufacturingCapabilityItemProvider == null) {
			manufacturingCapabilityItemProvider = new ManufacturingCapabilityItemProvider(this);
		}

		return manufacturingCapabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.Fügen} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FügenItemProvider fügenItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.Fügen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFügenAdapter() {
		if (fügenItemProvider == null) {
			fügenItemProvider = new FügenItemProvider(this);
		}

		return fügenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.Pressen} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PressenItemProvider pressenItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.Pressen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPressenAdapter() {
		if (pressenItemProvider == null) {
			pressenItemProvider = new PressenItemProvider(this);
		}

		return pressenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.QoSCapability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSCapabilityItemProvider qoSCapabilityItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.QoSCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQoSCapabilityAdapter() {
		if (qoSCapabilityItemProvider == null) {
			qoSCapabilityItemProvider = new QoSCapabilityItemProvider(this);
		}

		return qoSCapabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.Urformen} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UrformenItemProvider urformenItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.Urformen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUrformenAdapter() {
		if (urformenItemProvider == null) {
			urformenItemProvider = new UrformenItemProvider(this);
		}

		return urformenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.Umformen} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmformenItemProvider umformenItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.Umformen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUmformenAdapter() {
		if (umformenItemProvider == null) {
			umformenItemProvider = new UmformenItemProvider(this);
		}

		return umformenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.Trennen} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrennenItemProvider trennenItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.Trennen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrennenAdapter() {
		if (trennenItemProvider == null) {
			trennenItemProvider = new TrennenItemProvider(this);
		}

		return trennenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.Beschichten} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeschichtenItemProvider beschichtenItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.Beschichten}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBeschichtenAdapter() {
		if (beschichtenItemProvider == null) {
			beschichtenItemProvider = new BeschichtenItemProvider(this);
		}

		return beschichtenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.Stoffeigenschaften} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoffeigenschaftenItemProvider stoffeigenschaftenItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.Stoffeigenschaften}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoffeigenschaftenAdapter() {
		if (stoffeigenschaftenItemProvider == null) {
			stoffeigenschaftenItemProvider = new StoffeigenschaftenItemProvider(this);
		}

		return stoffeigenschaftenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.AnEinpressen} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnEinpressenItemProvider anEinpressenItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.AnEinpressen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnEinpressenAdapter() {
		if (anEinpressenItemProvider == null) {
			anEinpressenItemProvider = new AnEinpressenItemProvider(this);
		}

		return anEinpressenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.Schrauben} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchraubenItemProvider schraubenItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.Schrauben}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchraubenAdapter() {
		if (schraubenItemProvider == null) {
			schraubenItemProvider = new SchraubenItemProvider(this);
		}

		return schraubenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.InformationTransferCapability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationTransferCapabilityItemProvider informationTransferCapabilityItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.InformationTransferCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInformationTransferCapabilityAdapter() {
		if (informationTransferCapabilityItemProvider == null) {
			informationTransferCapabilityItemProvider = new InformationTransferCapabilityItemProvider(this);
		}

		return informationTransferCapabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.basys.model.domain.capability.ProvideInformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvideInformationItemProvider provideInformationItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.basys.model.domain.capability.ProvideInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvideInformationAdapter() {
		if (provideInformationItemProvider == null) {
			provideInformationItemProvider = new ProvideInformationItemProvider(this);
		}

		return provideInformationItemProvider;
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
		if (capabilityAssertionItemProvider != null) capabilityAssertionItemProvider.dispose();
		if (capabilityItemProvider != null) capabilityItemProvider.dispose();
		if (manufacturingCapabilityItemProvider != null) manufacturingCapabilityItemProvider.dispose();
		if (fügenItemProvider != null) fügenItemProvider.dispose();
		if (pressenItemProvider != null) pressenItemProvider.dispose();
		if (qoSCapabilityItemProvider != null) qoSCapabilityItemProvider.dispose();
		if (urformenItemProvider != null) urformenItemProvider.dispose();
		if (umformenItemProvider != null) umformenItemProvider.dispose();
		if (trennenItemProvider != null) trennenItemProvider.dispose();
		if (beschichtenItemProvider != null) beschichtenItemProvider.dispose();
		if (stoffeigenschaftenItemProvider != null) stoffeigenschaftenItemProvider.dispose();
		if (anEinpressenItemProvider != null) anEinpressenItemProvider.dispose();
		if (schraubenItemProvider != null) schraubenItemProvider.dispose();
		if (informationTransferCapabilityItemProvider != null) informationTransferCapabilityItemProvider.dispose();
		if (provideInformationItemProvider != null) provideInformationItemProvider.dispose();
	}

}
