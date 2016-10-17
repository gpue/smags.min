/**
 */
package org.tud.inf.st.smags.model.smags;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Instance Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.CreateInstanceOperator#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getCreateInstanceOperator()
 * @model
 * @generated
 */
public interface CreateInstanceOperator extends DeploymentOperator {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see #setInstance(ComponentInstance)
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getCreateInstanceOperator_Instance()
	 * @model containment="true"
	 * @generated
	 */
	ComponentInstance getInstance();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.smags.model.smags.CreateInstanceOperator#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(ComponentInstance value);

} // CreateInstanceOperator
