/**
 */
package org.tud.inf.st.smags.model.smags;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.MetaArchitecture#getElements <em>Elements</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.MetaArchitecture#getName <em>Name</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.MetaArchitecture#getTypes <em>Types</em>}</li>
 *   <li>{@link org.tud.inf.st.smags.model.smags.MetaArchitecture#getInitialRoleModel <em>Initial Role Model</em>}</li>
 * </ul>
 *
 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getMetaArchitecture()
 * @model
 * @generated
 */
public interface MetaArchitecture extends SmagsElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.smags.model.smags.MetaArchitectureElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getMetaArchitecture_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaArchitectureElement> getElements();

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
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getMetaArchitecture_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.smags.model.smags.MetaArchitecture#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.smags.model.smags.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getMetaArchitecture_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Initial Role Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Role Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Role Model</em>' reference.
	 * @see #setInitialRoleModel(RoleModel)
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getMetaArchitecture_InitialRoleModel()
	 * @model
	 * @generated
	 */
	RoleModel getInitialRoleModel();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.smags.model.smags.MetaArchitecture#getInitialRoleModel <em>Initial Role Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Role Model</em>' reference.
	 * @see #getInitialRoleModel()
	 * @generated
	 */
	void setInitialRoleModel(RoleModel value);

} // MetaArchitecture
