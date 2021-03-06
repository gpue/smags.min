/**
 */
package org.tud.inf.st.smags.model.smags.provider;

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

import org.tud.inf.st.smags.model.smags.util.SmagsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SmagsItemProviderAdapterFactory extends SmagsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public SmagsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.ComponentType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeItemProvider componentTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentTypeAdapter() {
		if (componentTypeItemProvider == null) {
			componentTypeItemProvider = new ComponentTypeItemProvider(this);
		}

		return componentTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.PortType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeItemProvider portTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.PortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortTypeAdapter() {
		if (portTypeItemProvider == null) {
			portTypeItemProvider = new PortTypeItemProvider(this);
		}

		return portTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.RoleModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleModelItemProvider roleModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.RoleModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleModelAdapter() {
		if (roleModelItemProvider == null) {
			roleModelItemProvider = new RoleModelItemProvider(this);
		}

		return roleModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.RoleModelSlot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleModelSlotItemProvider roleModelSlotItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.RoleModelSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleModelSlotAdapter() {
		if (roleModelSlotItemProvider == null) {
			roleModelSlotItemProvider = new RoleModelSlotItemProvider(this);
		}

		return roleModelSlotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.MetaArchitecture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaArchitectureItemProvider metaArchitectureItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.MetaArchitecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetaArchitectureAdapter() {
		if (metaArchitectureItemProvider == null) {
			metaArchitectureItemProvider = new MetaArchitectureItemProvider(this);
		}

		return metaArchitectureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.Method} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodItemProvider methodItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodAdapter() {
		if (methodItemProvider == null) {
			methodItemProvider = new MethodItemProvider(this);
		}

		return methodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.Port} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortItemProvider portItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortAdapter() {
		if (portItemProvider == null) {
			portItemProvider = new PortItemProvider(this);
		}

		return portItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.Architecture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureItemProvider architectureItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.Architecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArchitectureAdapter() {
		if (architectureItemProvider == null) {
			architectureItemProvider = new ArchitectureItemProvider(this);
		}

		return architectureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.ComponentInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceItemProvider componentInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInstanceAdapter() {
		if (componentInstanceItemProvider == null) {
			componentInstanceItemProvider = new ComponentInstanceItemProvider(this);
		}

		return componentInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.BindOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindOperatorItemProvider bindOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.BindOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindOperatorAdapter() {
		if (bindOperatorItemProvider == null) {
			bindOperatorItemProvider = new BindOperatorItemProvider(this);
		}

		return bindOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.SmagsModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmagsModelItemProvider smagsModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.SmagsModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSmagsModelAdapter() {
		if (smagsModelItemProvider == null) {
			smagsModelItemProvider = new SmagsModelItemProvider(this);
		}

		return smagsModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.Import} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportItemProvider importItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImportAdapter() {
		if (importItemProvider == null) {
			importItemProvider = new ImportItemProvider(this);
		}

		return importItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.TypeBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBindingItemProvider typeBindingItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.TypeBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeBindingAdapter() {
		if (typeBindingItemProvider == null) {
			typeBindingItemProvider = new TypeBindingItemProvider(this);
		}

		return typeBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.PrimitiveUse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveUseItemProvider primitiveUseItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.PrimitiveUse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveUseAdapter() {
		if (primitiveUseItemProvider == null) {
			primitiveUseItemProvider = new PrimitiveUseItemProvider(this);
		}

		return primitiveUseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.GenericUse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericUseItemProvider genericUseItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.GenericUse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenericUseAdapter() {
		if (genericUseItemProvider == null) {
			genericUseItemProvider = new GenericUseItemProvider(this);
		}

		return genericUseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.Deployment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentItemProvider deploymentItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.Deployment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeploymentAdapter() {
		if (deploymentItemProvider == null) {
			deploymentItemProvider = new DeploymentItemProvider(this);
		}

		return deploymentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.CreateInstanceOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateInstanceOperatorItemProvider createInstanceOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.CreateInstanceOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateInstanceOperatorAdapter() {
		if (createInstanceOperatorItemProvider == null) {
			createInstanceOperatorItemProvider = new CreateInstanceOperatorItemProvider(this);
		}

		return createInstanceOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivateRoleModelOperatorItemProvider activateRoleModelOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivateRoleModelOperatorAdapter() {
		if (activateRoleModelOperatorItemProvider == null) {
			activateRoleModelOperatorItemProvider = new ActivateRoleModelOperatorItemProvider(this);
		}

		return activateRoleModelOperatorItemProvider;
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
		if (componentTypeItemProvider != null) componentTypeItemProvider.dispose();
		if (portTypeItemProvider != null) portTypeItemProvider.dispose();
		if (roleModelItemProvider != null) roleModelItemProvider.dispose();
		if (roleModelSlotItemProvider != null) roleModelSlotItemProvider.dispose();
		if (metaArchitectureItemProvider != null) metaArchitectureItemProvider.dispose();
		if (methodItemProvider != null) methodItemProvider.dispose();
		if (typeItemProvider != null) typeItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (portItemProvider != null) portItemProvider.dispose();
		if (architectureItemProvider != null) architectureItemProvider.dispose();
		if (componentInstanceItemProvider != null) componentInstanceItemProvider.dispose();
		if (bindOperatorItemProvider != null) bindOperatorItemProvider.dispose();
		if (smagsModelItemProvider != null) smagsModelItemProvider.dispose();
		if (importItemProvider != null) importItemProvider.dispose();
		if (typeBindingItemProvider != null) typeBindingItemProvider.dispose();
		if (primitiveUseItemProvider != null) primitiveUseItemProvider.dispose();
		if (genericUseItemProvider != null) genericUseItemProvider.dispose();
		if (deploymentItemProvider != null) deploymentItemProvider.dispose();
		if (createInstanceOperatorItemProvider != null) createInstanceOperatorItemProvider.dispose();
		if (activateRoleModelOperatorItemProvider != null) activateRoleModelOperatorItemProvider.dispose();
	}

}
