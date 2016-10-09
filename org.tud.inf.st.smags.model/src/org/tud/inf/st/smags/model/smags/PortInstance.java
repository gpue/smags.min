/**
 */
package org.tud.inf.st.smags.model.smags;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.PortInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.PortInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getPortInstance()
 * @model
 * @generated
 */
public interface PortInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getPortInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.smags.model.smags.PortInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Port)
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getPortInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	Port getType();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.smags.model.smags.PortInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Port value);

} // PortInstance
