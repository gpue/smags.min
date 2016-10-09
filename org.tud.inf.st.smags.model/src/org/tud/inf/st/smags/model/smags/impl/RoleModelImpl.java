/**
 */
package org.tud.inf.st.smags.model.smags.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.smags.model.smags.CompositionOperator;
import org.tud.inf.st.smags.model.smags.RoleModel;
import org.tud.inf.st.smags.model.smags.RoleModelSlot;
import org.tud.inf.st.smags.model.smags.SmagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.impl.RoleModelImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.impl.RoleModelImpl#getSlots <em>Slots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleModelImpl extends MetaArchitectureElementImpl implements RoleModel {
	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionOperator> initialization;

	/**
	 * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleModelSlot> slots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmagsPackage.Literals.ROLE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionOperator> getInitialization() {
		if (initialization == null) {
			initialization = new EObjectContainmentEList<CompositionOperator>(CompositionOperator.class, this, SmagsPackage.ROLE_MODEL__INITIALIZATION);
		}
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleModelSlot> getSlots() {
		if (slots == null) {
			slots = new EObjectContainmentEList<RoleModelSlot>(RoleModelSlot.class, this, SmagsPackage.ROLE_MODEL__SLOTS);
		}
		return slots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmagsPackage.ROLE_MODEL__INITIALIZATION:
				return ((InternalEList<?>)getInitialization()).basicRemove(otherEnd, msgs);
			case SmagsPackage.ROLE_MODEL__SLOTS:
				return ((InternalEList<?>)getSlots()).basicRemove(otherEnd, msgs);
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
			case SmagsPackage.ROLE_MODEL__INITIALIZATION:
				return getInitialization();
			case SmagsPackage.ROLE_MODEL__SLOTS:
				return getSlots();
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
			case SmagsPackage.ROLE_MODEL__INITIALIZATION:
				getInitialization().clear();
				getInitialization().addAll((Collection<? extends CompositionOperator>)newValue);
				return;
			case SmagsPackage.ROLE_MODEL__SLOTS:
				getSlots().clear();
				getSlots().addAll((Collection<? extends RoleModelSlot>)newValue);
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
			case SmagsPackage.ROLE_MODEL__INITIALIZATION:
				getInitialization().clear();
				return;
			case SmagsPackage.ROLE_MODEL__SLOTS:
				getSlots().clear();
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
			case SmagsPackage.ROLE_MODEL__INITIALIZATION:
				return initialization != null && !initialization.isEmpty();
			case SmagsPackage.ROLE_MODEL__SLOTS:
				return slots != null && !slots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleModelImpl
