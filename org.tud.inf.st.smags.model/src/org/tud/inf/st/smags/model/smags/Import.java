/**
 */
package org.tud.inf.st.smags.model.smags;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.Import#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getImport_ImportURI()
	 * @model
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.smags.model.smags.Import#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

} // Import
