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
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Form#getFormTypeName <em>Form Type Name</em>}</li>
 *   <li>{@link gcml.Form#getAction <em>Action</em>}</li>
 *   <li>{@link gcml.Form#getMediumDataType <em>Medium Data Type</em>}</li>
 *   <li>{@link gcml.Form#getSuggestedApplication <em>Suggested Application</em>}</li>
 *   <li>{@link gcml.Form#getVoiceCommand <em>Voice Command</em>}</li>
 *   <li>{@link gcml.Form#getToConnection <em>To Connection</em>}</li>
 *   <li>{@link gcml.Form#getToParentForm <em>To Parent Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Form Type Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Type Name</em>' attribute.
	 * @see #setFormTypeName(String)
	 * @see gcml.GcmlPackage#getForm_FormTypeName()
	 * @model default="" unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getFormTypeName();

	/**
	 * Sets the value of the '{@link gcml.Form#getFormTypeName <em>Form Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Type Name</em>' attribute.
	 * @see #getFormTypeName()
	 * @generated
	 */
	void setFormTypeName(String value);

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
	 * Returns the value of the '<em><b>Medium Data Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium Data Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Data Type</em>' attribute list.
	 * @see gcml.GcmlPackage#getForm_MediumDataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getMediumDataType();

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
	 * @model
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
	 * @model
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

} // Form
