/**
 */
package org.tud.inf.st.smags.model.smags;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.tud.inf.st.smags.model.smags.SmagsFactory
 * @model kind="package"
 * @generated
 */
public interface SmagsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smags";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tu-dresden.de/smags";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smags";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmagsPackage eINSTANCE = org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.MetaArchitectureElementImpl <em>Meta Architecture Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.MetaArchitectureElementImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getMetaArchitectureElement()
	 * @generated
	 */
	int META_ARCHITECTURE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ARCHITECTURE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Meta Architecture Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ARCHITECTURE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Meta Architecture Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ARCHITECTURE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.ComponentTypeImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = META_ARCHITECTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PROVIDES = META_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = META_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = META_ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.PortTypeImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__NAME = META_ARCHITECTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__ELEMENTS = META_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = META_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION_COUNT = META_ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.RoleModelImpl <em>Role Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.RoleModelImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getRoleModel()
	 * @generated
	 */
	int ROLE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL__NAME = META_ARCHITECTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL__INITIALIZATION = META_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL__SLOTS = META_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_FEATURE_COUNT = META_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Role Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_OPERATION_COUNT = META_ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.RoleModelSlotImpl <em>Role Model Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.RoleModelSlotImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getRoleModelSlot()
	 * @generated
	 */
	int ROLE_MODEL_SLOT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_SLOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_SLOT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Role Model Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_SLOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role Model Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.SmagsElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsElementImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getSmagsElement()
	 * @generated
	 */
	int SMAGS_ELEMENT = 18;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMAGS_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMAGS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.MetaArchitectureImpl <em>Meta Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.MetaArchitectureImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getMetaArchitecture()
	 * @generated
	 */
	int META_ARCHITECTURE = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ARCHITECTURE__ELEMENTS = SMAGS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ARCHITECTURE__NAME = SMAGS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ARCHITECTURE__TYPES = SMAGS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ARCHITECTURE__NAMESPACE = SMAGS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Meta Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ARCHITECTURE_FEATURE_COUNT = SMAGS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Meta Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ARCHITECTURE_OPERATION_COUNT = SMAGS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.PortTypeElementImpl <em>Port Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.PortTypeElementImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getPortTypeElement()
	 * @generated
	 */
	int PORT_TYPE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Port Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.MethodImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = PORT_TYPE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = PORT_TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ARGS = PORT_TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = PORT_TYPE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = PORT_TYPE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.TypeImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.VariableImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = PORT_TYPE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = PORT_TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = PORT_TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = PORT_TYPE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.ArchitectureElementImpl <em>Architecture Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.ArchitectureElementImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getArchitectureElement()
	 * @generated
	 */
	int ARCHITECTURE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Architecture Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Architecture Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.ComponentImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ARCHITECTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.PortImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = ARCHITECTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.ArchitectureImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 12;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__ELEMENTS = SMAGS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__TYPE = SMAGS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAME = SMAGS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__TYPE_BINDINGS = SMAGS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAMESPACE = SMAGS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = SMAGS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_OPERATION_COUNT = SMAGS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.ComponentInstanceImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.CompositionOperatorImpl <em>Composition Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.CompositionOperatorImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getCompositionOperator()
	 * @generated
	 */
	int COMPOSITION_OPERATOR = 15;

	/**
	 * The number of structural features of the '<em>Composition Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Composition Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.BindOperatorImpl <em>Bind Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.BindOperatorImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getBindOperator()
	 * @generated
	 */
	int BIND_OPERATOR = 16;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_OPERATOR__SLOT = COMPOSITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_OPERATOR__TO = COMPOSITION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bind Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_OPERATOR_FEATURE_COUNT = COMPOSITION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bind Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_OPERATOR_OPERATION_COUNT = COMPOSITION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.SmagsModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsModelImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getSmagsModel()
	 * @generated
	 */
	int SMAGS_MODEL = 17;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMAGS_MODEL__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMAGS_MODEL__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMAGS_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMAGS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.ImportImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 19;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.TypeBindingImpl <em>Type Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.TypeBindingImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getTypeBinding()
	 * @generated
	 */
	int TYPE_BINDING = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BINDING__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BINDING__IMPLEMENTATION = 1;

	/**
	 * The number of structural features of the '<em>Type Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.TypeUse <em>Type Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.TypeUse
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getTypeUse()
	 * @generated
	 */
	int TYPE_USE = 21;

	/**
	 * The number of structural features of the '<em>Type Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_USE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_USE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.PrimitiveUseImpl <em>Primitive Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.PrimitiveUseImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getPrimitiveUse()
	 * @generated
	 */
	int PRIMITIVE_USE = 22;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_USE__TYPE = TYPE_USE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_USE_FEATURE_COUNT = TYPE_USE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_USE_OPERATION_COUNT = TYPE_USE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.GenericUseImpl <em>Generic Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.GenericUseImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getGenericUse()
	 * @generated
	 */
	int GENERIC_USE = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_USE__TYPE = TYPE_USE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_USE_FEATURE_COUNT = TYPE_USE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generic Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_USE_OPERATION_COUNT = TYPE_USE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.DeploymentOperatorImpl <em>Deployment Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.DeploymentOperatorImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getDeploymentOperator()
	 * @generated
	 */
	int DEPLOYMENT_OPERATOR = 24;

	/**
	 * The number of structural features of the '<em>Deployment Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Deployment Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.DeploymentImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = ARCHITECTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SCRIPT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.CreateInstanceOperatorImpl <em>Create Instance Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.CreateInstanceOperatorImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getCreateInstanceOperator()
	 * @generated
	 */
	int CREATE_INSTANCE_OPERATOR = 26;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_OPERATOR__INSTANCE = DEPLOYMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Instance Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_OPERATOR_FEATURE_COUNT = DEPLOYMENT_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Instance Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_OPERATOR_OPERATION_COUNT = DEPLOYMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.smags.model.smags.impl.ActivateRoleModelOperatorImpl <em>Activate Role Model Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.smags.model.smags.impl.ActivateRoleModelOperatorImpl
	 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getActivateRoleModelOperator()
	 * @generated
	 */
	int ACTIVATE_ROLE_MODEL_OPERATOR = 27;

	/**
	 * The feature id for the '<em><b>Role Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_ROLE_MODEL_OPERATOR__ROLE_MODEL = DEPLOYMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_ROLE_MODEL_OPERATOR__ARGS = DEPLOYMENT_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activate Role Model Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_ROLE_MODEL_OPERATOR_FEATURE_COUNT = DEPLOYMENT_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activate Role Model Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_ROLE_MODEL_OPERATOR_OPERATION_COUNT = DEPLOYMENT_OPERATOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the reference list '{@link org.tud.inf.st.smags.model.smags.ComponentType#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides</em>'.
	 * @see org.tud.inf.st.smags.model.smags.ComponentType#getProvides()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Provides();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.smags.model.smags.PortType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.tud.inf.st.smags.model.smags.PortType#getElements()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Elements();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.RoleModel <em>Role Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Model</em>'.
	 * @see org.tud.inf.st.smags.model.smags.RoleModel
	 * @generated
	 */
	EClass getRoleModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.smags.model.smags.RoleModel#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initialization</em>'.
	 * @see org.tud.inf.st.smags.model.smags.RoleModel#getInitialization()
	 * @see #getRoleModel()
	 * @generated
	 */
	EReference getRoleModel_Initialization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.smags.model.smags.RoleModel#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see org.tud.inf.st.smags.model.smags.RoleModel#getSlots()
	 * @see #getRoleModel()
	 * @generated
	 */
	EReference getRoleModel_Slots();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.RoleModelSlot <em>Role Model Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Model Slot</em>'.
	 * @see org.tud.inf.st.smags.model.smags.RoleModelSlot
	 * @generated
	 */
	EClass getRoleModelSlot();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.RoleModelSlot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.inf.st.smags.model.smags.RoleModelSlot#getName()
	 * @see #getRoleModelSlot()
	 * @generated
	 */
	EAttribute getRoleModelSlot_Name();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.smags.model.smags.RoleModelSlot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.RoleModelSlot#getType()
	 * @see #getRoleModelSlot()
	 * @generated
	 */
	EReference getRoleModelSlot_Type();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.MetaArchitecture <em>Meta Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Architecture</em>'.
	 * @see org.tud.inf.st.smags.model.smags.MetaArchitecture
	 * @generated
	 */
	EClass getMetaArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.smags.model.smags.MetaArchitecture#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.tud.inf.st.smags.model.smags.MetaArchitecture#getElements()
	 * @see #getMetaArchitecture()
	 * @generated
	 */
	EReference getMetaArchitecture_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.MetaArchitecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.inf.st.smags.model.smags.MetaArchitecture#getName()
	 * @see #getMetaArchitecture()
	 * @generated
	 */
	EAttribute getMetaArchitecture_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.smags.model.smags.MetaArchitecture#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.tud.inf.st.smags.model.smags.MetaArchitecture#getTypes()
	 * @see #getMetaArchitecture()
	 * @generated
	 */
	EReference getMetaArchitecture_Types();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.MetaArchitecture#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.tud.inf.st.smags.model.smags.MetaArchitecture#getNamespace()
	 * @see #getMetaArchitecture()
	 * @generated
	 */
	EAttribute getMetaArchitecture_Namespace();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.MetaArchitectureElement <em>Meta Architecture Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Architecture Element</em>'.
	 * @see org.tud.inf.st.smags.model.smags.MetaArchitectureElement
	 * @generated
	 */
	EClass getMetaArchitectureElement();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.MetaArchitectureElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.inf.st.smags.model.smags.MetaArchitectureElement#getName()
	 * @see #getMetaArchitectureElement()
	 * @generated
	 */
	EAttribute getMetaArchitectureElement_Name();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.smags.model.smags.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.smags.model.smags.Method#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Method#getArgs()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Args();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.smags.model.smags.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.PortTypeElement <em>Port Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Element</em>'.
	 * @see org.tud.inf.st.smags.model.smags.PortTypeElement
	 * @generated
	 */
	EClass getPortTypeElement();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.PortTypeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.inf.st.smags.model.smags.PortTypeElement#getName()
	 * @see #getPortTypeElement()
	 * @generated
	 */
	EAttribute getPortTypeElement_Name();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.smags.model.smags.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Type();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.smags.model.smags.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Type();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.smags.model.smags.Architecture#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Architecture#getElements()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.smags.model.smags.Architecture#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Architecture#getType()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.Architecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Architecture#getName()
	 * @see #getArchitecture()
	 * @generated
	 */
	EAttribute getArchitecture_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.smags.model.smags.Architecture#getTypeBindings <em>Type Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Bindings</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Architecture#getTypeBindings()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_TypeBindings();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.Architecture#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Architecture#getNamespace()
	 * @see #getArchitecture()
	 * @generated
	 */
	EAttribute getArchitecture_Namespace();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.ArchitectureElement <em>Architecture Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Element</em>'.
	 * @see org.tud.inf.st.smags.model.smags.ArchitectureElement
	 * @generated
	 */
	EClass getArchitectureElement();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.ArchitectureElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.inf.st.smags.model.smags.ArchitectureElement#getName()
	 * @see #getArchitectureElement()
	 * @generated
	 */
	EAttribute getArchitectureElement_Name();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see org.tud.inf.st.smags.model.smags.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.ComponentInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.inf.st.smags.model.smags.ComponentInstance#getName()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.smags.model.smags.ComponentInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.ComponentInstance#getType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Type();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.CompositionOperator <em>Composition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Operator</em>'.
	 * @see org.tud.inf.st.smags.model.smags.CompositionOperator
	 * @generated
	 */
	EClass getCompositionOperator();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.BindOperator <em>Bind Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bind Operator</em>'.
	 * @see org.tud.inf.st.smags.model.smags.BindOperator
	 * @generated
	 */
	EClass getBindOperator();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.smags.model.smags.BindOperator#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slot</em>'.
	 * @see org.tud.inf.st.smags.model.smags.BindOperator#getSlot()
	 * @see #getBindOperator()
	 * @generated
	 */
	EReference getBindOperator_Slot();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.smags.model.smags.BindOperator#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.tud.inf.st.smags.model.smags.BindOperator#getTo()
	 * @see #getBindOperator()
	 * @generated
	 */
	EReference getBindOperator_To();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.SmagsModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.tud.inf.st.smags.model.smags.SmagsModel
	 * @generated
	 */
	EClass getSmagsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.smags.model.smags.SmagsModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.tud.inf.st.smags.model.smags.SmagsModel#getElements()
	 * @see #getSmagsModel()
	 * @generated
	 */
	EReference getSmagsModel_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.smags.model.smags.SmagsModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.tud.inf.st.smags.model.smags.SmagsModel#getImports()
	 * @see #getSmagsModel()
	 * @generated
	 */
	EReference getSmagsModel_Imports();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.SmagsElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.tud.inf.st.smags.model.smags.SmagsElement
	 * @generated
	 */
	EClass getSmagsElement();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.TypeBinding <em>Type Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Binding</em>'.
	 * @see org.tud.inf.st.smags.model.smags.TypeBinding
	 * @generated
	 */
	EClass getTypeBinding();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.smags.model.smags.TypeBinding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.TypeBinding#getType()
	 * @see #getTypeBinding()
	 * @generated
	 */
	EReference getTypeBinding_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.TypeBinding#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.tud.inf.st.smags.model.smags.TypeBinding#getImplementation()
	 * @see #getTypeBinding()
	 * @generated
	 */
	EAttribute getTypeBinding_Implementation();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.TypeUse <em>Type Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Use</em>'.
	 * @see org.tud.inf.st.smags.model.smags.TypeUse
	 * @generated
	 */
	EClass getTypeUse();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.PrimitiveUse <em>Primitive Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Use</em>'.
	 * @see org.tud.inf.st.smags.model.smags.PrimitiveUse
	 * @generated
	 */
	EClass getPrimitiveUse();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.smags.model.smags.PrimitiveUse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.PrimitiveUse#getType()
	 * @see #getPrimitiveUse()
	 * @generated
	 */
	EAttribute getPrimitiveUse_Type();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.GenericUse <em>Generic Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Use</em>'.
	 * @see org.tud.inf.st.smags.model.smags.GenericUse
	 * @generated
	 */
	EClass getGenericUse();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.smags.model.smags.GenericUse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.tud.inf.st.smags.model.smags.GenericUse#getType()
	 * @see #getGenericUse()
	 * @generated
	 */
	EReference getGenericUse_Type();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.DeploymentOperator <em>Deployment Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Operator</em>'.
	 * @see org.tud.inf.st.smags.model.smags.DeploymentOperator
	 * @generated
	 */
	EClass getDeploymentOperator();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.smags.model.smags.Deployment#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see org.tud.inf.st.smags.model.smags.Deployment#getScript()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Script();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.CreateInstanceOperator <em>Create Instance Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Instance Operator</em>'.
	 * @see org.tud.inf.st.smags.model.smags.CreateInstanceOperator
	 * @generated
	 */
	EClass getCreateInstanceOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.smags.model.smags.CreateInstanceOperator#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance</em>'.
	 * @see org.tud.inf.st.smags.model.smags.CreateInstanceOperator#getInstance()
	 * @see #getCreateInstanceOperator()
	 * @generated
	 */
	EReference getCreateInstanceOperator_Instance();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator <em>Activate Role Model Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activate Role Model Operator</em>'.
	 * @see org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator
	 * @generated
	 */
	EClass getActivateRoleModelOperator();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator#getRoleModel <em>Role Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Model</em>'.
	 * @see org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator#getRoleModel()
	 * @see #getActivateRoleModelOperator()
	 * @generated
	 */
	EReference getActivateRoleModelOperator_RoleModel();

	/**
	 * Returns the meta object for the reference list '{@link org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Args</em>'.
	 * @see org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator#getArgs()
	 * @see #getActivateRoleModelOperator()
	 * @generated
	 */
	EReference getActivateRoleModelOperator_Args();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmagsFactory getSmagsFactory();

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
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.ComponentTypeImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PROVIDES = eINSTANCE.getComponentType_Provides();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.PortTypeImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__ELEMENTS = eINSTANCE.getPortType_Elements();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.RoleModelImpl <em>Role Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.RoleModelImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getRoleModel()
		 * @generated
		 */
		EClass ROLE_MODEL = eINSTANCE.getRoleModel();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODEL__INITIALIZATION = eINSTANCE.getRoleModel_Initialization();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODEL__SLOTS = eINSTANCE.getRoleModel_Slots();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.RoleModelSlotImpl <em>Role Model Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.RoleModelSlotImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getRoleModelSlot()
		 * @generated
		 */
		EClass ROLE_MODEL_SLOT = eINSTANCE.getRoleModelSlot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_MODEL_SLOT__NAME = eINSTANCE.getRoleModelSlot_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODEL_SLOT__TYPE = eINSTANCE.getRoleModelSlot_Type();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.MetaArchitectureImpl <em>Meta Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.MetaArchitectureImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getMetaArchitecture()
		 * @generated
		 */
		EClass META_ARCHITECTURE = eINSTANCE.getMetaArchitecture();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_ARCHITECTURE__ELEMENTS = eINSTANCE.getMetaArchitecture_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_ARCHITECTURE__NAME = eINSTANCE.getMetaArchitecture_Name();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_ARCHITECTURE__TYPES = eINSTANCE.getMetaArchitecture_Types();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_ARCHITECTURE__NAMESPACE = eINSTANCE.getMetaArchitecture_Namespace();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.MetaArchitectureElementImpl <em>Meta Architecture Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.MetaArchitectureElementImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getMetaArchitectureElement()
		 * @generated
		 */
		EClass META_ARCHITECTURE_ELEMENT = eINSTANCE.getMetaArchitectureElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_ARCHITECTURE_ELEMENT__NAME = eINSTANCE.getMetaArchitectureElement_Name();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.MethodImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__ARGS = eINSTANCE.getMethod_Args();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.TypeImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.VariableImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.PortTypeElementImpl <em>Port Type Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.PortTypeElementImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getPortTypeElement()
		 * @generated
		 */
		EClass PORT_TYPE_ELEMENT = eINSTANCE.getPortTypeElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE_ELEMENT__NAME = eINSTANCE.getPortTypeElement_Name();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.ComponentImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.PortImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.ArchitectureImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__ELEMENTS = eINSTANCE.getArchitecture_Elements();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__TYPE = eINSTANCE.getArchitecture_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE__NAME = eINSTANCE.getArchitecture_Name();

		/**
		 * The meta object literal for the '<em><b>Type Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__TYPE_BINDINGS = eINSTANCE.getArchitecture_TypeBindings();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE__NAMESPACE = eINSTANCE.getArchitecture_Namespace();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.ArchitectureElementImpl <em>Architecture Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.ArchitectureElementImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getArchitectureElement()
		 * @generated
		 */
		EClass ARCHITECTURE_ELEMENT = eINSTANCE.getArchitectureElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_ELEMENT__NAME = eINSTANCE.getArchitectureElement_Name();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.ComponentInstanceImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__NAME = eINSTANCE.getComponentInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__TYPE = eINSTANCE.getComponentInstance_Type();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.CompositionOperatorImpl <em>Composition Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.CompositionOperatorImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getCompositionOperator()
		 * @generated
		 */
		EClass COMPOSITION_OPERATOR = eINSTANCE.getCompositionOperator();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.BindOperatorImpl <em>Bind Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.BindOperatorImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getBindOperator()
		 * @generated
		 */
		EClass BIND_OPERATOR = eINSTANCE.getBindOperator();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_OPERATOR__SLOT = eINSTANCE.getBindOperator_Slot();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_OPERATOR__TO = eINSTANCE.getBindOperator_To();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.SmagsModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsModelImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getSmagsModel()
		 * @generated
		 */
		EClass SMAGS_MODEL = eINSTANCE.getSmagsModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMAGS_MODEL__ELEMENTS = eINSTANCE.getSmagsModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMAGS_MODEL__IMPORTS = eINSTANCE.getSmagsModel_Imports();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.SmagsElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsElementImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getSmagsElement()
		 * @generated
		 */
		EClass SMAGS_ELEMENT = eINSTANCE.getSmagsElement();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.ImportImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.TypeBindingImpl <em>Type Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.TypeBindingImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getTypeBinding()
		 * @generated
		 */
		EClass TYPE_BINDING = eINSTANCE.getTypeBinding();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_BINDING__TYPE = eINSTANCE.getTypeBinding_Type();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_BINDING__IMPLEMENTATION = eINSTANCE.getTypeBinding_Implementation();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.TypeUse <em>Type Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.TypeUse
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getTypeUse()
		 * @generated
		 */
		EClass TYPE_USE = eINSTANCE.getTypeUse();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.PrimitiveUseImpl <em>Primitive Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.PrimitiveUseImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getPrimitiveUse()
		 * @generated
		 */
		EClass PRIMITIVE_USE = eINSTANCE.getPrimitiveUse();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_USE__TYPE = eINSTANCE.getPrimitiveUse_Type();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.GenericUseImpl <em>Generic Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.GenericUseImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getGenericUse()
		 * @generated
		 */
		EClass GENERIC_USE = eINSTANCE.getGenericUse();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_USE__TYPE = eINSTANCE.getGenericUse_Type();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.DeploymentOperatorImpl <em>Deployment Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.DeploymentOperatorImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getDeploymentOperator()
		 * @generated
		 */
		EClass DEPLOYMENT_OPERATOR = eINSTANCE.getDeploymentOperator();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.DeploymentImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__SCRIPT = eINSTANCE.getDeployment_Script();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.CreateInstanceOperatorImpl <em>Create Instance Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.CreateInstanceOperatorImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getCreateInstanceOperator()
		 * @generated
		 */
		EClass CREATE_INSTANCE_OPERATOR = eINSTANCE.getCreateInstanceOperator();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INSTANCE_OPERATOR__INSTANCE = eINSTANCE.getCreateInstanceOperator_Instance();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.smags.model.smags.impl.ActivateRoleModelOperatorImpl <em>Activate Role Model Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.smags.model.smags.impl.ActivateRoleModelOperatorImpl
		 * @see org.tud.inf.st.smags.model.smags.impl.SmagsPackageImpl#getActivateRoleModelOperator()
		 * @generated
		 */
		EClass ACTIVATE_ROLE_MODEL_OPERATOR = eINSTANCE.getActivateRoleModelOperator();

		/**
		 * The meta object literal for the '<em><b>Role Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATE_ROLE_MODEL_OPERATOR__ROLE_MODEL = eINSTANCE.getActivateRoleModelOperator_RoleModel();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATE_ROLE_MODEL_OPERATOR__ARGS = eINSTANCE.getActivateRoleModelOperator_Args();

	}

} //SmagsPackage
