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
 * A representation of the model object '<em><b>Medium</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Medium#getDerivedFromBuiltInType <em>Derived From Built In Type</em>}</li>
 *   <li>{@link gcml.Medium#getMediumTypeName <em>Medium Type Name</em>}</li>
 *   <li>{@link gcml.Medium#getSuggestedApplication <em>Suggested Application</em>}</li>
 *   <li>{@link gcml.Medium#getVoiceCommand <em>Voice Command</em>}</li>
 *   <li>{@link gcml.Medium#getToConnection <em>To Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getMedium()
 * @model
 * @generated
 */
public interface Medium extends EObject {
	/**
	 * Returns the value of the '<em><b>Derived From Built In Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link gcml.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From Built In Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From Built In Type</em>' attribute.
	 * @see gcml.Capability
	 * @see #isSetDerivedFromBuiltInType()
	 * @see #unsetDerivedFromBuiltInType()
	 * @see #setDerivedFromBuiltInType(Capability)
	 * @see gcml.GcmlPackage#getMedium_DerivedFromBuiltInType()
	 * @model default="" unsettable="true"
	 * @generated
	 */
	Capability getDerivedFromBuiltInType();

	/**
	 * Sets the value of the '{@link gcml.Medium#getDerivedFromBuiltInType <em>Derived From Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From Built In Type</em>' attribute.
	 * @see gcml.Capability
	 * @see #isSetDerivedFromBuiltInType()
	 * @see #unsetDerivedFromBuiltInType()
	 * @see #getDerivedFromBuiltInType()
	 * @generated
	 */
	void setDerivedFromBuiltInType(Capability value);

	/**
	 * Unsets the value of the '{@link gcml.Medium#getDerivedFromBuiltInType <em>Derived From Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDerivedFromBuiltInType()
	 * @see #getDerivedFromBuiltInType()
	 * @see #setDerivedFromBuiltInType(Capability)
	 * @generated
	 */
	void unsetDerivedFromBuiltInType();

	/**
	 * Returns whether the value of the '{@link gcml.Medium#getDerivedFromBuiltInType <em>Derived From Built In Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Derived From Built In Type</em>' attribute is set.
	 * @see #unsetDerivedFromBuiltInType()
	 * @see #getDerivedFromBuiltInType()
	 * @see #setDerivedFromBuiltInType(Capability)
	 * @generated
	 */
	boolean isSetDerivedFromBuiltInType();

	/**
	 * Returns the value of the '<em><b>Medium Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Type Name</em>' attribute.
	 * @see #setMediumTypeName(String)
	 * @see gcml.GcmlPackage#getMedium_MediumTypeName()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getMediumTypeName();

	/**
	 * Sets the value of the '{@link gcml.Medium#getMediumTypeName <em>Medium Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Type Name</em>' attribute.
	 * @see #getMediumTypeName()
	 * @generated
	 */
	void setMediumTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Suggested Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suggested Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suggested Application</em>' attribute.
	 * @see #setSuggestedApplication(String)
	 * @see gcml.GcmlPackage#getMedium_SuggestedApplication()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSuggestedApplication();

	/**
	 * Sets the value of the '{@link gcml.Medium#getSuggestedApplication <em>Suggested Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suggested Application</em>' attribute.
	 * @see #getSuggestedApplication()
	 * @generated
	 */
	void setSuggestedApplication(String value);

	/**
	 * Returns the value of the '<em><b>Voice Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voice Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voice Command</em>' attribute.
	 * @see #setVoiceCommand(String)
	 * @see gcml.GcmlPackage#getMedium_VoiceCommand()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getVoiceCommand();

	/**
	 * Sets the value of the '{@link gcml.Medium#getVoiceCommand <em>Voice Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voice Command</em>' attribute.
	 * @see #getVoiceCommand()
	 * @generated
	 */
	void setVoiceCommand(String value);

	/**
	 * Returns the value of the '<em><b>To Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Connection</em>' reference.
	 * @see #setToConnection(Connection)
	 * @see gcml.GcmlPackage#getMedium_ToConnection()
	 * @model required="true"
	 * @generated
	 */
	Connection getToConnection();

	/**
	 * Sets the value of the '{@link gcml.Medium#getToConnection <em>To Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Connection</em>' reference.
	 * @see #getToConnection()
	 * @generated
	 */
	void setToConnection(Connection value);

} // Medium
