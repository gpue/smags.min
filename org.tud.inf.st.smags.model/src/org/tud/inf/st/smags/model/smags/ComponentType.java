/**
 */
package org.tud.inf.st.smags.model.smags;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tud.inf.st.smags.model.smags.ComponentType#getProvides <em>Provides</em>}</li>
 * </ul>
 *
 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends MetaArchitectureElement {

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference list.
	 * The list contents are of type {@link org.tud.inf.st.smags.model.smags.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference list.
	 * @see org.tud.inf.st.smags.model.smags.SmagsPackage#getComponentType_Provides()
	 * @model
	 * @generated
	 */
	EList<PortType> getProvides();
} // ComponentType
