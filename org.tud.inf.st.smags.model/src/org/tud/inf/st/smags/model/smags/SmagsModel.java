/**
 */
package org.tud.inf.st.smags.model.smags;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.SmagsModel#getElements <em>Elements</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.SmagsModel#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getSmagsModel()
 * @model
 * @generated
 */
public interface SmagsModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.smags.model.smags.SmagsElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getSmagsModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmagsElement> getElements();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.smags.model.smags.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getSmagsModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // SmagsModel
