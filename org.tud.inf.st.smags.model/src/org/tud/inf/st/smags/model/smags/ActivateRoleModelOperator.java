/**
 */
package org.tud.inf.st.smags.model.smags;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activate Role Model Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator#getRoleModel <em>Role Model</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getActivateRoleModelOperator()
 * @model
 * @generated
 */
public interface ActivateRoleModelOperator extends DeploymentOperator {
	/**
	 * Returns the value of the '<em><b>Role Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Model</em>' reference.
	 * @see #setRoleModel(RoleModel)
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getActivateRoleModelOperator_RoleModel()
	 * @model required="true"
	 * @generated
	 */
	RoleModel getRoleModel();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator#getRoleModel <em>Role Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Model</em>' reference.
	 * @see #getRoleModel()
	 * @generated
	 */
	void setRoleModel(RoleModel value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' reference list.
	 * The list contents are of type {@link org.tud.inf.st.smags.model.smags.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' reference list.
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getActivateRoleModelOperator_Args()
	 * @model
	 * @generated
	 */
	EList<ComponentInstance> getArgs();

} // ActivateRoleModelOperator
