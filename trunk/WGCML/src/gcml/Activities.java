/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Activities#getActivityItem <em>Activity Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getActivities()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Activities extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Activity Item</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Item</em>' containment reference list.
	 * @see gcml.GcmlPackage#getActivities_ActivityItem()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Activity> getActivityItem();

} // Activities
