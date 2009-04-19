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
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Device#isIsLocal <em>Is Local</em>}</li>
 *   <li>{@link gcml.Device#getDeviceCapability <em>Device Capability</em>}</li>
 *   <li>{@link gcml.Device#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link gcml.Device#getToConnection <em>To Connection</em>}</li>
 *   <li>{@link gcml.Device#getFromIsAttached <em>From Is Attached</em>}</li>
 *   <li>{@link gcml.Device#getDeviceID <em>Device ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Capability</b></em>' attribute list.
	 * The list contents are of type {@link gcml.Capability}.
	 * The literals are from the enumeration {@link gcml.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Capability</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Capability</em>' attribute list.
	 * @see gcml.Capability
	 * @see gcml.GcmlPackage#getDevice_DeviceCapability()
	 * @model default="" unique="false" required="true"
	 * @generated
	 */
	EList<Capability> getDeviceCapability();

	/**
	 * Returns the value of the '<em><b>Is Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Local</em>' attribute.
	 * @see #isSetIsLocal()
	 * @see #unsetIsLocal()
	 * @see #setIsLocal(boolean)
	 * @see gcml.GcmlPackage#getDevice_IsLocal()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsLocal();

	/**
	 * Sets the value of the '{@link gcml.Device#isIsLocal <em>Is Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Local</em>' attribute.
	 * @see #isSetIsLocal()
	 * @see #unsetIsLocal()
	 * @see #isIsLocal()
	 * @generated
	 */
	void setIsLocal(boolean value);

	/**
	 * Unsets the value of the '{@link gcml.Device#isIsLocal <em>Is Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLocal()
	 * @see #isIsLocal()
	 * @see #setIsLocal(boolean)
	 * @generated
	 */
	void unsetIsLocal();

	/**
	 * Returns whether the value of the '{@link gcml.Device#isIsLocal <em>Is Local</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Local</em>' attribute is set.
	 * @see #unsetIsLocal()
	 * @see #isIsLocal()
	 * @see #setIsLocal(boolean)
	 * @generated
	 */
	boolean isSetIsLocal();

	/**
	 * Returns the value of the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Virtual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Virtual</em>' attribute.
	 * @see #isSetIsVirtual()
	 * @see #unsetIsVirtual()
	 * @see #setIsVirtual(boolean)
	 * @see gcml.GcmlPackage#getDevice_IsVirtual()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsVirtual();

	/**
	 * Sets the value of the '{@link gcml.Device#isIsVirtual <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Virtual</em>' attribute.
	 * @see #isSetIsVirtual()
	 * @see #unsetIsVirtual()
	 * @see #isIsVirtual()
	 * @generated
	 */
	void setIsVirtual(boolean value);

	/**
	 * Unsets the value of the '{@link gcml.Device#isIsVirtual <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsVirtual()
	 * @see #isIsVirtual()
	 * @see #setIsVirtual(boolean)
	 * @generated
	 */
	void unsetIsVirtual();

	/**
	 * Returns whether the value of the '{@link gcml.Device#isIsVirtual <em>Is Virtual</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Virtual</em>' attribute is set.
	 * @see #unsetIsVirtual()
	 * @see #isIsVirtual()
	 * @see #setIsVirtual(boolean)
	 * @generated
	 */
	boolean isSetIsVirtual();

	/**
	 * Returns the value of the '<em><b>To Connection</b></em>' reference list.
	 * The list contents are of type {@link gcml.Connection}.
	 * It is bidirectional and its opposite is '{@link gcml.Connection#getFromDevice <em>From Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Connection</em>' reference list.
	 * @see gcml.GcmlPackage#getDevice_ToConnection()
	 * @see gcml.Connection#getFromDevice
	 * @model opposite="fromDevice" required="true"
	 * @generated
	 */
	EList<Connection> getToConnection();

	/**
	 * Returns the value of the '<em><b>From Is Attached</b></em>' reference list.
	 * The list contents are of type {@link gcml.IsAttached}.
	 * It is bidirectional and its opposite is '{@link gcml.IsAttached#getToDevice <em>To Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Is Attached</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Is Attached</em>' reference list.
	 * @see gcml.GcmlPackage#getDevice_FromIsAttached()
	 * @see gcml.IsAttached#getToDevice
	 * @model opposite="toDevice" required="true"
	 * @generated
	 */
	EList<IsAttached> getFromIsAttached();

	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device ID</em>' attribute.
	 * @see #setDeviceID(String)
	 * @see gcml.GcmlPackage#getDevice_DeviceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getDeviceID();

	/**
	 * Sets the value of the '{@link gcml.Device#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(String value);

} // Device
