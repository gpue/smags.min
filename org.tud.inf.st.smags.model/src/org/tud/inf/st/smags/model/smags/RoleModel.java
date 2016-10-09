/**
 */
package org.tud.inf.st.smags.model.smags;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.RoleModel#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.RoleModel#getSlots <em>Slots</em>}</li>
 * </ul>
 *
 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getRoleModel()
 * @model
 * @generated
 */
public interface RoleModel extends MetaArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.smags.model.smags.CompositionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference list.
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getRoleModel_Initialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositionOperator> getInitialization();

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.smags.model.smags.RoleModelSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' containment reference list.
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getRoleModel_Slots()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleModelSlot> getSlots();

} // RoleModel
