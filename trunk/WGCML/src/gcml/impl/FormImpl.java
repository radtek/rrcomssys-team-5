/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Action;
import gcml.Connection;
import gcml.Form;
import gcml.GcmlPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.FormImpl#getAction <em>Action</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getFormDataType <em>Form Data Type</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getFormName <em>Form Name</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getSuggestedApplication <em>Suggested Application</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getToConnection <em>To Connection</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getToParentForm <em>To Parent Form</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getVoiceCommand <em>Voice Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends CDOObjectImpl implements Form {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return (Action)eGet(GcmlPackage.Literals.FORM__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		eSet(GcmlPackage.Literals.FORM__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAction() {
		eUnset(GcmlPackage.Literals.FORM__ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAction() {
		return eIsSet(GcmlPackage.Literals.FORM__ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormDataType() {
		return (String)eGet(GcmlPackage.Literals.FORM__FORM_DATA_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormDataType(String newFormDataType) {
		eSet(GcmlPackage.Literals.FORM__FORM_DATA_TYPE, newFormDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormName() {
		return (String)eGet(GcmlPackage.Literals.FORM__FORM_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormName(String newFormName) {
		eSet(GcmlPackage.Literals.FORM__FORM_NAME, newFormName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuggestedApplication() {
		return (String)eGet(GcmlPackage.Literals.FORM__SUGGESTED_APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuggestedApplication(String newSuggestedApplication) {
		eSet(GcmlPackage.Literals.FORM__SUGGESTED_APPLICATION, newSuggestedApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getToConnection() {
		return (Connection)eGet(GcmlPackage.Literals.FORM__TO_CONNECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToConnection(Connection newToConnection) {
		eSet(GcmlPackage.Literals.FORM__TO_CONNECTION, newToConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getToParentForm() {
		return (Form)eGet(GcmlPackage.Literals.FORM__TO_PARENT_FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToParentForm(Form newToParentForm) {
		eSet(GcmlPackage.Literals.FORM__TO_PARENT_FORM, newToParentForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoiceCommand() {
		return (String)eGet(GcmlPackage.Literals.FORM__VOICE_COMMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoiceCommand(String newVoiceCommand) {
		eSet(GcmlPackage.Literals.FORM__VOICE_COMMAND, newVoiceCommand);
	}

} //FormImpl
