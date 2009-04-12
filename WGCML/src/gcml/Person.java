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
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Person#getPersonID <em>Person ID</em>}</li>
 *   <li>{@link gcml.Person#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link gcml.Person#getPersonRole <em>Person Role</em>}</li>
 *   <li>{@link gcml.Person#getToIsAttached <em>To Is Attached</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getPerson()
 * @model extendedMetaData="name='Person' kind='empty'"
 * @extends CDOObject
 * @generated
 */
public interface Person extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Person ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person ID</em>' attribute.
	 * @see #setPersonID(String)
	 * @see gcml.GcmlPackage#getPerson_PersonID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='personID'"
	 * @generated
	 */
	String getPersonID();

	/**
	 * Sets the value of the '{@link gcml.Person#getPersonID <em>Person ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person ID</em>' attribute.
	 * @see #getPersonID()
	 * @generated
	 */
	void setPersonID(String value);

	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Name</em>' attribute.
	 * @see #setPersonName(String)
	 * @see gcml.GcmlPackage#getPerson_PersonName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='personName'"
	 * @generated
	 */
	String getPersonName();

	/**
	 * Sets the value of the '{@link gcml.Person#getPersonName <em>Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name</em>' attribute.
	 * @see #getPersonName()
	 * @generated
	 */
	void setPersonName(String value);

	/**
	 * Returns the value of the '<em><b>Person Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Role</em>' attribute.
	 * @see #setPersonRole(String)
	 * @see gcml.GcmlPackage#getPerson_PersonRole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='personRole'"
	 * @generated
	 */
	String getPersonRole();

	/**
	 * Sets the value of the '{@link gcml.Person#getPersonRole <em>Person Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Role</em>' attribute.
	 * @see #getPersonRole()
	 * @generated
	 */
	void setPersonRole(String value);

	/**
	 * Returns the value of the '<em><b>To Is Attached</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gcml.IsAttached#getFromPerson <em>From Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Is Attached</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Is Attached</em>' reference.
	 * @see #setToIsAttached(IsAttached)
	 * @see gcml.GcmlPackage#getPerson_ToIsAttached()
	 * @see gcml.IsAttached#getFromPerson
	 * @model opposite="fromPerson" required="true"
	 *        extendedMetaData="kind='attribute' name='toIsAttached'"
	 * @generated
	 */
	IsAttached getToIsAttached();

	/**
	 * Sets the value of the '{@link gcml.Person#getToIsAttached <em>To Is Attached</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Is Attached</em>' reference.
	 * @see #getToIsAttached()
	 * @generated
	 */
	void setToIsAttached(IsAttached value);

} // Person
