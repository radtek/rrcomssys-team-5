/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gcml</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Gcml#getConnection <em>Connection</em>}</li>
 *   <li>{@link gcml.Gcml#getMedium <em>Medium</em>}</li>
 *   <li>{@link gcml.Gcml#getForm <em>Form</em>}</li>
 *   <li>{@link gcml.Gcml#getPerson <em>Person</em>}</li>
 *   <li>{@link gcml.Gcml#getIsAttached <em>Is Attached</em>}</li>
 *   <li>{@link gcml.Gcml#getDevice <em>Device</em>}</li>
 *   <li>{@link gcml.Gcml#getCall <em>Call</em>}</li>
 *   <li>{@link gcml.Gcml#getDecision <em>Decision</em>}</li>
 *   <li>{@link gcml.Gcml#getBoundary <em>Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getGcml()
 * @model
 * @generated
 */
public interface Gcml extends EObject {
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
	 * @see gcml.GcmlPackage#getGcml_Connection()
	 * @model containment="true"
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
	 * @see gcml.GcmlPackage#getGcml_Medium()
	 * @model containment="true"
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
	 * @see gcml.GcmlPackage#getGcml_Form()
	 * @model containment="true"
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
	 * @see gcml.GcmlPackage#getGcml_Person()
	 * @model containment="true"
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
	 * @see gcml.GcmlPackage#getGcml_IsAttached()
	 * @model containment="true"
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
	 * @see gcml.GcmlPackage#getGcml_Device()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevice();

	/**
	 * Returns the value of the '<em><b>Call</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.Call}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call</em>' containment reference list.
	 * @see gcml.GcmlPackage#getGcml_Call()
	 * @model containment="true"
	 * @generated
	 */
	EList<Call> getCall();

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.Decision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' containment reference list.
	 * @see gcml.GcmlPackage#getGcml_Decision()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decision> getDecision();

	/**
	 * Returns the value of the '<em><b>Boundary</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.Boundary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary</em>' containment reference list.
	 * @see gcml.GcmlPackage#getGcml_Boundary()
	 * @model containment="true"
	 * @generated
	 */
	EList<Boundary> getBoundary();

} // Gcml
