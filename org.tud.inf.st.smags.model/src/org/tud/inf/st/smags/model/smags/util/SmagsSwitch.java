/**
 */
package org.tud.inf.st.smags.model.smags.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tud.inf.st.smags.model.smags.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.smags.model.smags.SmagsPackage
 * @generated
 */
public class SmagsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmagsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmagsSwitch() {
		if (modelPackage == null) {
			modelPackage = SmagsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SmagsPackage.COMPONENT_TYPE: {
				ComponentType componentType = (ComponentType)theEObject;
				T result = caseComponentType(componentType);
				if (result == null) result = caseMetaArchitectureElement(componentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.PORT_TYPE: {
				PortType portType = (PortType)theEObject;
				T result = casePortType(portType);
				if (result == null) result = caseMetaArchitectureElement(portType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.ROLE_MODEL: {
				RoleModel roleModel = (RoleModel)theEObject;
				T result = caseRoleModel(roleModel);
				if (result == null) result = caseMetaArchitectureElement(roleModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.ROLE_MODEL_SLOT: {
				RoleModelSlot roleModelSlot = (RoleModelSlot)theEObject;
				T result = caseRoleModelSlot(roleModelSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.META_ARCHITECTURE: {
				MetaArchitecture metaArchitecture = (MetaArchitecture)theEObject;
				T result = caseMetaArchitecture(metaArchitecture);
				if (result == null) result = caseSmagsElement(metaArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.META_ARCHITECTURE_ELEMENT: {
				MetaArchitectureElement metaArchitectureElement = (MetaArchitectureElement)theEObject;
				T result = caseMetaArchitectureElement(metaArchitectureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = casePortTypeElement(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = casePortTypeElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.PORT_TYPE_ELEMENT: {
				PortTypeElement portTypeElement = (PortTypeElement)theEObject;
				T result = casePortTypeElement(portTypeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseArchitectureElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseArchitectureElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.ARCHITECTURE: {
				Architecture architecture = (Architecture)theEObject;
				T result = caseArchitecture(architecture);
				if (result == null) result = caseSmagsElement(architecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.ARCHITECTURE_ELEMENT: {
				ArchitectureElement architectureElement = (ArchitectureElement)theEObject;
				T result = caseArchitectureElement(architectureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T result = caseComponentInstance(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.COMPOSITION_OPERATOR: {
				CompositionOperator compositionOperator = (CompositionOperator)theEObject;
				T result = caseCompositionOperator(compositionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.BIND_OPERATOR: {
				BindOperator bindOperator = (BindOperator)theEObject;
				T result = caseBindOperator(bindOperator);
				if (result == null) result = caseCompositionOperator(bindOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.SMAGS_MODEL: {
				SmagsModel smagsModel = (SmagsModel)theEObject;
				T result = caseSmagsModel(smagsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.SMAGS_ELEMENT: {
				SmagsElement smagsElement = (SmagsElement)theEObject;
				T result = caseSmagsElement(smagsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.TYPE_BINDING: {
				TypeBinding typeBinding = (TypeBinding)theEObject;
				T result = caseTypeBinding(typeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.TYPE_USE: {
				TypeUse typeUse = (TypeUse)theEObject;
				T result = caseTypeUse(typeUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.PRIMITIVE_USE: {
				PrimitiveUse primitiveUse = (PrimitiveUse)theEObject;
				T result = casePrimitiveUse(primitiveUse);
				if (result == null) result = caseTypeUse(primitiveUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.GENERIC_USE: {
				GenericUse genericUse = (GenericUse)theEObject;
				T result = caseGenericUse(genericUse);
				if (result == null) result = caseTypeUse(genericUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.DEPLOYMENT_OPERATOR: {
				DeploymentOperator deploymentOperator = (DeploymentOperator)theEObject;
				T result = caseDeploymentOperator(deploymentOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.DEPLOYMENT: {
				Deployment deployment = (Deployment)theEObject;
				T result = caseDeployment(deployment);
				if (result == null) result = caseArchitectureElement(deployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.CREATE_INSTANCE_OPERATOR: {
				CreateInstanceOperator createInstanceOperator = (CreateInstanceOperator)theEObject;
				T result = caseCreateInstanceOperator(createInstanceOperator);
				if (result == null) result = caseDeploymentOperator(createInstanceOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR: {
				ActivateRoleModelOperator activateRoleModelOperator = (ActivateRoleModelOperator)theEObject;
				T result = caseActivateRoleModelOperator(activateRoleModelOperator);
				if (result == null) result = caseDeploymentOperator(activateRoleModelOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortType(PortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleModel(RoleModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Model Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Model Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleModelSlot(RoleModelSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaArchitecture(MetaArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Architecture Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Architecture Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaArchitectureElement(MetaArchitectureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortTypeElement(PortTypeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecture(Architecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitectureElement(ArchitectureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionOperator(CompositionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bind Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bind Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindOperator(BindOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmagsModel(SmagsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmagsElement(SmagsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBinding(TypeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUse(TypeUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveUse(PrimitiveUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericUse(GenericUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentOperator(DeploymentOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Instance Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Instance Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateInstanceOperator(CreateInstanceOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activate Role Model Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activate Role Model Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivateRoleModelOperator(ActivateRoleModelOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SmagsSwitch
