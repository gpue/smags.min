/**
 */
package org.tud.inf.st.smags.model.smags.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.smags.model.smags.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmagsFactoryImpl extends EFactoryImpl implements SmagsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmagsFactory init() {
		try {
			SmagsFactory theSmagsFactory = (SmagsFactory)EPackage.Registry.INSTANCE.getEFactory(SmagsPackage.eNS_URI);
			if (theSmagsFactory != null) {
				return theSmagsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmagsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmagsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmagsPackage.COMPONENT_TYPE: return createComponentType();
			case SmagsPackage.PORT_TYPE: return createPortType();
			case SmagsPackage.ROLE_MODEL: return createRoleModel();
			case SmagsPackage.ROLE_MODEL_SLOT: return createRoleModelSlot();
			case SmagsPackage.META_ARCHITECTURE: return createMetaArchitecture();
			case SmagsPackage.METHOD: return createMethod();
			case SmagsPackage.TYPE: return createType();
			case SmagsPackage.VARIABLE: return createVariable();
			case SmagsPackage.COMPONENT: return createComponent();
			case SmagsPackage.PORT: return createPort();
			case SmagsPackage.ARCHITECTURE: return createArchitecture();
			case SmagsPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case SmagsPackage.BIND_OPERATOR: return createBindOperator();
			case SmagsPackage.SMAGS_MODEL: return createSmagsModel();
			case SmagsPackage.IMPORT: return createImport();
			case SmagsPackage.TYPE_BINDING: return createTypeBinding();
			case SmagsPackage.PRIMITIVE_USE: return createPrimitiveUse();
			case SmagsPackage.GENERIC_USE: return createGenericUse();
			case SmagsPackage.DEPLOYMENT: return createDeployment();
			case SmagsPackage.CREATE_INSTANCE_OPERATOR: return createCreateInstanceOperator();
			case SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR: return createActivateRoleModelOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleModel createRoleModel() {
		RoleModelImpl roleModel = new RoleModelImpl();
		return roleModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleModelSlot createRoleModelSlot() {
		RoleModelSlotImpl roleModelSlot = new RoleModelSlotImpl();
		return roleModelSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaArchitecture createMetaArchitecture() {
		MetaArchitectureImpl metaArchitecture = new MetaArchitectureImpl();
		return metaArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture createArchitecture() {
		ArchitectureImpl architecture = new ArchitectureImpl();
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindOperator createBindOperator() {
		BindOperatorImpl bindOperator = new BindOperatorImpl();
		return bindOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmagsModel createSmagsModel() {
		SmagsModelImpl smagsModel = new SmagsModelImpl();
		return smagsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeBinding createTypeBinding() {
		TypeBindingImpl typeBinding = new TypeBindingImpl();
		return typeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveUse createPrimitiveUse() {
		PrimitiveUseImpl primitiveUse = new PrimitiveUseImpl();
		return primitiveUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericUse createGenericUse() {
		GenericUseImpl genericUse = new GenericUseImpl();
		return genericUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateInstanceOperator createCreateInstanceOperator() {
		CreateInstanceOperatorImpl createInstanceOperator = new CreateInstanceOperatorImpl();
		return createInstanceOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateRoleModelOperator createActivateRoleModelOperator() {
		ActivateRoleModelOperatorImpl activateRoleModelOperator = new ActivateRoleModelOperatorImpl();
		return activateRoleModelOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmagsPackage getSmagsPackage() {
		return (SmagsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmagsPackage getPackage() {
		return SmagsPackage.eINSTANCE;
	}

} //SmagsFactoryImpl
