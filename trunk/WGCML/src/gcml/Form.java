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
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Form#getAction <em>Action</em>}</li>
 *   <li>{@link gcml.Form#getFormDataType <em>Form Data Type</em>}</li>
 *   <li>{@link gcml.Form#getFormName <em>Form Name</em>}</li>
 *   <li>{@link gcml.Form#getSuggestedApplication <em>Suggested Application</em>}</li>
 *   <li>{@link gcml.Form#getToConnection <em>To Connection</em>}</li>
 *   <li>{@link gcml.Form#getToParentForm <em>To Parent Form</em>}</li>
 *   <li>{@link gcml.Form#getVoiceCommand <em>Voice Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getForm()
 * @model extendedMetaData="name='Form' kind='empty'"
 * @extends CDOObject
 * @generated
 */
public interface Form extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link gcml.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see gcml.Action
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #setAction(Action)
	 * @see gcml.GcmlPackage#getForm_Action()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='action'"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link gcml.Form#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see gcml.Action
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Unsets the value of the '{@link gcml.Form#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAction()
	 * @see #getAction()
	 * @see #setAction(Action)
	 * @generated
	 */
	void unsetAction();

	/**
	 * Returns whether the value of the '{@link gcml.Form#getAction <em>Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action</em>' attribute is set.
	 * @see #unsetAction()
	 * @see #getAction()
	 * @see #setAction(Action)
	 * @generated
	 */
	boolean isSetAction();

	/**
	 * Returns the value of the '<em><b>Form Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Data Type</em>' attribute.
	 * @see #setFormDataType(String)
	 * @see gcml.GcmlPackage#getForm_FormDataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='formDataType'"
	 * @generated
	 */
	String getFormDataType();

	/**
	 * Sets the value of the '{@link gcml.Form#getFormDataType <em>Form Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Data Type</em>' attribute.
	 * @see #getFormDataType()
	 * @generated
	 */
	void setFormDataType(String value);

	/**
	 * Returns the value of the '<em><b>Form Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Name</em>' attribute.
	 * @see #setFormName(String)
	 * @see gcml.GcmlPackage#getForm_FormName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='formName'"
	 * @generated
	 */
	String getFormName();

	/**
	 * Sets the value of the '{@link gcml.Form#getFormName <em>Form Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Name</em>' attribute.
	 * @see #getFormName()
	 * @generated
	 */
	void setFormName(String value);

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
	 * @see gcml.GcmlPackage#getForm_SuggestedApplication()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='suggestedApplication'"
	 * @generated
	 */
	String getSuggestedApplication();

	/**
	 * Sets the value of the '{@link gcml.Form#getSuggestedApplication <em>Suggested Application</em>}' attribute.
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
	 * @see gcml.GcmlPackage#getForm_ToConnection()
	 * @model extendedMetaData="kind='attribute' name='toConnection'"
	 * @generated
	 */
	Connection getToConnection();

	/**
	 * Sets the value of the '{@link gcml.Form#getToConnection <em>To Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Connection</em>' reference.
	 * @see #getToConnection()
	 * @generated
	 */
	void setToConnection(Connection value);

	/**
	 * Returns the value of the '<em><b>To Parent Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Parent Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Parent Form</em>' reference.
	 * @see #setToParentForm(Form)
	 * @see gcml.GcmlPackage#getForm_ToParentForm()
	 * @model extendedMetaData="kind='attribute' name='toParentForm'"
	 * @generated
	 */
	Form getToParentForm();

	/**
	 * Sets the value of the '{@link gcml.Form#getToParentForm <em>To Parent Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Parent Form</em>' reference.
	 * @see #getToParentForm()
	 * @generated
	 */
	void setToParentForm(Form value);

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
	 * @see gcml.GcmlPackage#getForm_VoiceCommand()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='voiceCommand'"
	 * @generated
	 */
	String getVoiceCommand();

	/**
	 * Sets the value of the '{@link gcml.Form#getVoiceCommand <em>Voice Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voice Command</em>' attribute.
	 * @see #getVoiceCommand()
	 * @generated
	 */
	void setVoiceCommand(String value);

} // Form
