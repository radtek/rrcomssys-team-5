/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import java.math.BigInteger;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Activity#getActivityId <em>Activity Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getActivity()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Activity extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Id</em>' attribute.
	 * @see #setActivityId(BigInteger)
	 * @see gcml.GcmlPackage#getActivity_ActivityId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getActivityId();

	/**
	 * Sets the value of the '{@link gcml.Activity#getActivityId <em>Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Id</em>' attribute.
	 * @see #getActivityId()
	 * @generated
	 */
	void setActivityId(BigInteger value);

} // Activity
