/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Activity#getActivityID <em>Activity ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity ID</em>' attribute.
	 * @see #setActivityID(String)
	 * @see gcml.GcmlPackage#getActivity_ActivityID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getActivityID();

	/**
	 * Sets the value of the '{@link gcml.Activity#getActivityID <em>Activity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity ID</em>' attribute.
	 * @see #getActivityID()
	 * @generated
	 */
	void setActivityID(String value);

} // Activity
