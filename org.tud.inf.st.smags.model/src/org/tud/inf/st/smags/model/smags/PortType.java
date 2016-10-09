/**
 */
package org.tud.inf.st.smags.model.smags;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.PortType#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getPortType()
 * @model
 * @generated
 */
public interface PortType extends MetaArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.smags.model.smags.PortTypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getPortType_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeElement> getElements();

} // PortType
