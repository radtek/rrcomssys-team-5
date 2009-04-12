/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Attached</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.IsAttached#getFromPerson <em>From Person</em>}</li>
 *   <li>{@link gcml.IsAttached#getToDevice <em>To Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getIsAttached()
 * @model extendedMetaData="name='IsAttached' kind='empty'"
 * @extends CDOObject
 * @generated
 */
public interface IsAttached extends CDOObject {
	/**
	 * Returns the value of the '<em><b>From Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gcml.Person#getToIsAttached <em>To Is Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Person</em>' reference.
	 * @see #setFromPerson(Person)
	 * @see gcml.GcmlPackage#getIsAttached_FromPerson()
	 * @see gcml.Person#getToIsAttached
	 * @model opposite="toIsAttached" required="true"
	 *        extendedMetaData="kind='attribute' name='fromPerson'"
	 * @generated
	 */
	Person getFromPerson();

	/**
	 * Sets the value of the '{@link gcml.IsAttached#getFromPerson <em>From Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Person</em>' reference.
	 * @see #getFromPerson()
	 * @generated
	 */
	void setFromPerson(Person value);

	/**
	 * Returns the value of the '<em><b>To Device</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gcml.Device#getFromIsAttached <em>From Is Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Device</em>' reference.
	 * @see #setToDevice(Device)
	 * @see gcml.GcmlPackage#getIsAttached_ToDevice()
	 * @see gcml.Device#getFromIsAttached
	 * @model opposite="fromIsAttached" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='toDevice'"
	 * @generated
	 */
	Device getToDevice();

	/**
	 * Sets the value of the '{@link gcml.IsAttached#getToDevice <em>To Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Device</em>' reference.
	 * @see #getToDevice()
	 * @generated
	 */
	void setToDevice(Device value);

} // IsAttached
