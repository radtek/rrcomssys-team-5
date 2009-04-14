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
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Connection#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link gcml.Connection#getFromDevice <em>From Device</em>}</li>
 *   <li>{@link gcml.Connection#getConnectionToCall <em>Connection To Call</em>}</li>
 *   <li>{@link gcml.Connection#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth</em>' attribute.
	 * @see #setBandwidth(String)
	 * @see gcml.GcmlPackage#getConnection_Bandwidth()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getBandwidth();

	/**
	 * Sets the value of the '{@link gcml.Connection#getBandwidth <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' attribute.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(String value);

	/**
	 * Returns the value of the '<em><b>From Device</b></em>' reference list.
	 * The list contents are of type {@link gcml.Device}.
	 * It is bidirectional and its opposite is '{@link gcml.Device#getToConnection <em>To Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Device</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Device</em>' reference list.
	 * @see gcml.GcmlPackage#getConnection_FromDevice()
	 * @see gcml.Device#getToConnection
	 * @model opposite="toConnection" required="true"
	 * @generated
	 */
	EList<Device> getFromDevice();

	/**
	 * Returns the value of the '<em><b>Connection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection ID</em>' attribute.
	 * @see #setConnectionID(String)
	 * @see gcml.GcmlPackage#getConnection_ConnectionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getConnectionID();

	/**
	 * Sets the value of the '{@link gcml.Connection#getConnectionID <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection ID</em>' attribute.
	 * @see #getConnectionID()
	 * @generated
	 */
	void setConnectionID(String value);

	/**
	 * Returns the value of the '<em><b>Connection To Call</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gcml.Call#getCallToConnection <em>Call To Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection To Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection To Call</em>' reference.
	 * @see #setConnectionToCall(Call)
	 * @see gcml.GcmlPackage#getConnection_ConnectionToCall()
	 * @see gcml.Call#getCallToConnection
	 * @model opposite="CallToConnection"
	 * @generated
	 */
	Call getConnectionToCall();

	/**
	 * Sets the value of the '{@link gcml.Connection#getConnectionToCall <em>Connection To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection To Call</em>' reference.
	 * @see #getConnectionToCall()
	 * @generated
	 */
	void setConnectionToCall(Call value);

} // Connection
