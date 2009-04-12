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
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Connection#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link gcml.Connection#getFromDevice <em>From Device</em>}</li>
 *   <li>{@link gcml.Connection#getConnectionID <em>Connection ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getConnection()
 * @model extendedMetaData="name='Connection' kind='empty'"
 * @extends CDOObject
 * @generated
 */
public interface Connection extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth</em>' attribute.
	 * @see #setBandwidth(String)
	 * @see gcml.GcmlPackage#getConnection_Bandwidth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bandwidth'"
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
	 *        extendedMetaData="kind='attribute' name='fromDevice'"
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

} // Connection
