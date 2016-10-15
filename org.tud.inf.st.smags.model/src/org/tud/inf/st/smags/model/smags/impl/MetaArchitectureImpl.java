/**
 */
package org.tud.inf.st.smags.model.smags.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.smags.model.smags.MetaArchitecture;
import org.tud.inf.st.smags.model.smags.MetaArchitectureElement;
import org.tud.inf.st.smags.model.smags.RoleModel;
import org.tud.inf.st.smags.model.smags.SmagsPackage;
import org.tud.inf.st.smags.model.smags.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.impl.MetaArchitectureImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.impl.MetaArchitectureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.impl.MetaArchitectureImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.impl.MetaArchitectureImpl#getInitialRoleModel <em>Initial Role Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaArchitectureImpl extends SmagsElementImpl implements MetaArchitecture {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaArchitectureElement> elements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getInitialRoleModel() <em>Initial Role Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialRoleModel()
	 * @generated
	 * @ordered
	 */
	protected RoleModel initialRoleModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmagsPackage.Literals.META_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaArchitectureElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<MetaArchitectureElement>(MetaArchitectureElement.class, this, SmagsPackage.META_ARCHITECTURE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmagsPackage.META_ARCHITECTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, SmagsPackage.META_ARCHITECTURE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleModel getInitialRoleModel() {
		if (initialRoleModel != null && initialRoleModel.eIsProxy()) {
			InternalEObject oldInitialRoleModel = (InternalEObject)initialRoleModel;
			initialRoleModel = (RoleModel)eResolveProxy(oldInitialRoleModel);
			if (initialRoleModel != oldInitialRoleModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmagsPackage.META_ARCHITECTURE__INITIAL_ROLE_MODEL, oldInitialRoleModel, initialRoleModel));
			}
		}
		return initialRoleModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleModel basicGetInitialRoleModel() {
		return initialRoleModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialRoleModel(RoleModel newInitialRoleModel) {
		RoleModel oldInitialRoleModel = initialRoleModel;
		initialRoleModel = newInitialRoleModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmagsPackage.META_ARCHITECTURE__INITIAL_ROLE_MODEL, oldInitialRoleModel, initialRoleModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmagsPackage.META_ARCHITECTURE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case SmagsPackage.META_ARCHITECTURE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmagsPackage.META_ARCHITECTURE__ELEMENTS:
				return getElements();
			case SmagsPackage.META_ARCHITECTURE__NAME:
				return getName();
			case SmagsPackage.META_ARCHITECTURE__TYPES:
				return getTypes();
			case SmagsPackage.META_ARCHITECTURE__INITIAL_ROLE_MODEL:
				if (resolve) return getInitialRoleModel();
				return basicGetInitialRoleModel();
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
			case SmagsPackage.META_ARCHITECTURE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends MetaArchitectureElement>)newValue);
				return;
			case SmagsPackage.META_ARCHITECTURE__NAME:
				setName((String)newValue);
				return;
			case SmagsPackage.META_ARCHITECTURE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case SmagsPackage.META_ARCHITECTURE__INITIAL_ROLE_MODEL:
				setInitialRoleModel((RoleModel)newValue);
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
			case SmagsPackage.META_ARCHITECTURE__ELEMENTS:
				getElements().clear();
				return;
			case SmagsPackage.META_ARCHITECTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmagsPackage.META_ARCHITECTURE__TYPES:
				getTypes().clear();
				return;
			case SmagsPackage.META_ARCHITECTURE__INITIAL_ROLE_MODEL:
				setInitialRoleModel((RoleModel)null);
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
			case SmagsPackage.META_ARCHITECTURE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case SmagsPackage.META_ARCHITECTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmagsPackage.META_ARCHITECTURE__TYPES:
				return types != null && !types.isEmpty();
			case SmagsPackage.META_ARCHITECTURE__INITIAL_ROLE_MODEL:
				return initialRoleModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MetaArchitectureImpl
