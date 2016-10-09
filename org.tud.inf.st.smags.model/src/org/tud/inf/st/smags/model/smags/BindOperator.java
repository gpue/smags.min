/**
 */
package org.tud.inf.st.smags.model.smags;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.BindOperator#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.BindOperator#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getBindOperator()
 * @model
 * @generated
 */
public interface BindOperator extends CompositionOperator {
	/**
	 * Returns the value of the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' reference.
	 * @see #setSlot(RoleModelSlot)
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getBindOperator_Slot()
	 * @model
	 * @generated
	 */
	RoleModelSlot getSlot();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.smags.model.smags.BindOperator#getSlot <em>Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(RoleModelSlot value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(PortType)
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getBindOperator_To()
	 * @model
	 * @generated
	 */
	PortType getTo();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.smags.model.smags.BindOperator#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(PortType value);

} // BindOperator
