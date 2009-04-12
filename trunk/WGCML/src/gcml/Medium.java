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
 * A representation of the model object '<em><b>Medium</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Medium#getMediumDataType <em>Medium Data Type</em>}</li>
 *   <li>{@link gcml.Medium#getMediumName <em>Medium Name</em>}</li>
 *   <li>{@link gcml.Medium#getSuggestedApplication <em>Suggested Application</em>}</li>
 *   <li>{@link gcml.Medium#getToConnection <em>To Connection</em>}</li>
 *   <li>{@link gcml.Medium#getToForm <em>To Form</em>}</li>
 *   <li>{@link gcml.Medium#getVoiceCommand <em>Voice Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getMedium()
 * @model extendedMetaData="name='Medium' kind='empty'"
 * @extends CDOObject
 * @generated
 */
public interface Medium extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Medium Data Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link gcml.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Data Type</em>' attribute.
	 * @see gcml.Capability
	 * @see #isSetMediumDataType()
	 * @see #unsetMediumDataType()
	 * @see #setMediumDataType(Capability)
	 * @see gcml.GcmlPackage#getMedium_MediumDataType()
	 * @model default="" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='mediumDataType'"
	 * @generated
	 */
	Capability getMediumDataType();

	/**
	 * Sets the value of the '{@link gcml.Medium#getMediumDataType <em>Medium Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Data Type</em>' attribute.
	 * @see gcml.Capability
	 * @see #isSetMediumDataType()
	 * @see #unsetMediumDataType()
	 * @see #getMediumDataType()
	 * @generated
	 */
	void setMediumDataType(Capability value);

	/**
	 * Unsets the value of the '{@link gcml.Medium#getMediumDataType <em>Medium Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMediumDataType()
	 * @see #getMediumDataType()
	 * @see #setMediumDataType(Capability)
	 * @generated
	 */
	void unsetMediumDataType();

	/**
	 * Returns whether the value of the '{@link gcml.Medium#getMediumDataType <em>Medium Data Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Medium Data Type</em>' attribute is set.
	 * @see #unsetMediumDataType()
	 * @see #getMediumDataType()
	 * @see #setMediumDataType(Capability)
	 * @generated
	 */
	boolean isSetMediumDataType();

	/**
	 * Returns the value of the '<em><b>Medium Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Name</em>' attribute.
	 * @see #setMediumName(String)
	 * @see gcml.GcmlPackage#getMedium_MediumName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mediumName'"
	 * @generated
	 */
	String getMediumName();

	/**
	 * Sets the value of the '{@link gcml.Medium#getMediumName <em>Medium Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Name</em>' attribute.
	 * @see #getMediumName()
	 * @generated
	 */
	void setMediumName(String value);

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
	 *        extendedMetaData="kind='attribute' name='suggestedApplication'"
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
	 * @model extendedMetaData="kind='attribute' name='toConnection'"
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

	/**
	 * Returns the value of the '<em><b>To Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Form</em>' reference.
	 * @see #setToForm(Form)
	 * @see gcml.GcmlPackage#getMedium_ToForm()
	 * @model extendedMetaData="kind='attribute' name='toForm'"
	 * @generated
	 */
	Form getToForm();

	/**
	 * Sets the value of the '{@link gcml.Medium#getToForm <em>To Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Form</em>' reference.
	 * @see #getToForm()
	 * @generated
	 */
	void setToForm(Form value);

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
	 *        extendedMetaData="kind='attribute' name='voiceCommand'"
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

} // Medium
