/**
 */
package org.tud.inf.st.smags.model.smags.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator;
import org.tud.inf.st.smags.model.smags.ComponentInstance;
import org.tud.inf.st.smags.model.smags.RoleModel;
import org.tud.inf.st.smags.model.smags.SmagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activate Role Model Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.impl.ActivateRoleModelOperatorImpl#getRoleModel <em>Role Model</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.impl.ActivateRoleModelOperatorImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivateRoleModelOperatorImpl extends DeploymentOperatorImpl implements ActivateRoleModelOperator {
	/**
	 * The cached value of the '{@link #getRoleModel() <em>Role Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleModel()
	 * @generated
	 * @ordered
	 */
	protected RoleModel roleModel;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> args;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivateRoleModelOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmagsPackage.Literals.ACTIVATE_ROLE_MODEL_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleModel getRoleModel() {
		if (roleModel != null && roleModel.eIsProxy()) {
			InternalEObject oldRoleModel = (InternalEObject)roleModel;
			roleModel = (RoleModel)eResolveProxy(oldRoleModel);
			if (roleModel != oldRoleModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR__ROLE_MODEL, oldRoleModel, roleModel));
			}
		}
		return roleModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleModel basicGetRoleModel() {
		return roleModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleModel(RoleModel newRoleModel) {
		RoleModel oldRoleModel = roleModel;
		roleModel = newRoleModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR__ROLE_MODEL, oldRoleModel, roleModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getArgs() {
		if (args == null) {
			args = new EObjectResolvingEList<ComponentInstance>(ComponentInstance.class, this, SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR__ROLE_MODEL:
				if (resolve) return getRoleModel();
				return basicGetRoleModel();
			case SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR__ARGS:
				return getArgs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR__ROLE_MODEL:
				setRoleModel((RoleModel)newValue);
				return;
			case SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR__ROLE_MODEL:
				setRoleModel((RoleModel)null);
				return;
			case SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR__ARGS:
				getArgs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR__ROLE_MODEL:
				return roleModel != null;
			case SmagsPackage.ACTIVATE_ROLE_MODEL_OPERATOR__ARGS:
				return args != null && !args.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivateRoleModelOperatorImpl
