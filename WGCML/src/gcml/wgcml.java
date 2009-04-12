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
 * A representation of the model object '<em><b>wgcml</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.wgcml#getConnection <em>Connection</em>}</li>
 *   <li>{@link gcml.wgcml#getMedium <em>Medium</em>}</li>
 *   <li>{@link gcml.wgcml#getForm <em>Form</em>}</li>
 *   <li>{@link gcml.wgcml#getPerson <em>Person</em>}</li>
 *   <li>{@link gcml.wgcml#getIsAttached <em>Is Attached</em>}</li>
 *   <li>{@link gcml.wgcml#getDevice <em>Device</em>}</li>
 *   <li>{@link gcml.wgcml#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getwgcml()
 * @model extendedMetaData="name='Gcml' kind='elementOnly'"
 * @extends CDOObject
 * @generated
 */
public interface wgcml extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see gcml.GcmlPackage#getwgcml_Connection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connection'"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.Medium}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium</em>' containment reference list.
	 * @see gcml.GcmlPackage#getwgcml_Medium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medium'"
	 * @generated
	 */
	EList<Medium> getMedium();

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.Form}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference list.
	 * @see gcml.GcmlPackage#getwgcml_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form'"
	 * @generated
	 */
	EList<Form> getForm();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see gcml.GcmlPackage#getwgcml_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='person'"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Is Attached</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.IsAttached}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attached</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attached</em>' containment reference list.
	 * @see gcml.GcmlPackage#getwgcml_IsAttached()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isAttached'"
	 * @generated
	 */
	EList<IsAttached> getIsAttached();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see gcml.GcmlPackage#getwgcml_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device'"
	 * @generated
	 */
	EList<Device> getDevice();

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference.
	 * @see #setActivities(Activities)
	 * @see gcml.GcmlPackage#getwgcml_Activities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Activities getActivities();

	/**
	 * Sets the value of the '{@link gcml.wgcml#getActivities <em>Activities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activities</em>' containment reference.
	 * @see #getActivities()
	 * @generated
	 */
	void setActivities(Activities value);

} // wgcml
