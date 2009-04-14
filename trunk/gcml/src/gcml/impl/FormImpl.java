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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.FormImpl#getFormTypeName <em>Form Type Name</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getAction <em>Action</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getMediumDataType <em>Medium Data Type</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getSuggestedApplication <em>Suggested Application</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getVoiceCommand <em>Voice Command</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getToConnection <em>To Connection</em>}</li>
 *   <li>{@link gcml.impl.FormImpl#getToParentForm <em>To Parent Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends EObjectImpl implements Form {
	/**
	 * The default value of the '{@link #getFormTypeName() <em>Form Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_TYPE_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFormTypeName() <em>Form Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormTypeName()
	 * @generated
	 * @ordered
	 */
	protected String formTypeName = FORM_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Action ACTION_EDEFAULT = Action.SEND;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action = ACTION_EDEFAULT;

	/**
	 * This is true if the Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actionESet;

	/**
	 * The cached value of the '{@link #getMediumDataType() <em>Medium Data Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mediumDataType;

	/**
	 * The default value of the '{@link #getSuggestedApplication() <em>Suggested Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuggestedApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String SUGGESTED_APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuggestedApplication() <em>Suggested Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuggestedApplication()
	 * @generated
	 * @ordered
	 */
	protected String suggestedApplication = SUGGESTED_APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoiceCommand() <em>Voice Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoiceCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String VOICE_COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoiceCommand() <em>Voice Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoiceCommand()
	 * @generated
	 * @ordered
	 */
	protected String voiceCommand = VOICE_COMMAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToConnection() <em>To Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection toConnection;

	/**
	 * The cached value of the '{@link #getToParentForm() <em>To Parent Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToParentForm()
	 * @generated
	 * @ordered
	 */
	protected Form toParentForm;

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
	public String getFormTypeName() {
		return formTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormTypeName(String newFormTypeName) {
		String oldFormTypeName = formTypeName;
		formTypeName = newFormTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.FORM__FORM_TYPE_NAME, oldFormTypeName, formTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		boolean oldActionESet = actionESet;
		actionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.FORM__ACTION, oldAction, action, !oldActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAction() {
		Action oldAction = action;
		boolean oldActionESet = actionESet;
		action = ACTION_EDEFAULT;
		actionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GcmlPackage.FORM__ACTION, oldAction, ACTION_EDEFAULT, oldActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAction() {
		return actionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMediumDataType() {
		if (mediumDataType == null) {
			mediumDataType = new EDataTypeUniqueEList<String>(String.class, this, GcmlPackage.FORM__MEDIUM_DATA_TYPE);
		}
		return mediumDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuggestedApplication() {
		return suggestedApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuggestedApplication(String newSuggestedApplication) {
		String oldSuggestedApplication = suggestedApplication;
		suggestedApplication = newSuggestedApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.FORM__SUGGESTED_APPLICATION, oldSuggestedApplication, suggestedApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoiceCommand() {
		return voiceCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoiceCommand(String newVoiceCommand) {
		String oldVoiceCommand = voiceCommand;
		voiceCommand = newVoiceCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.FORM__VOICE_COMMAND, oldVoiceCommand, voiceCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getToConnection() {
		if (toConnection != null && toConnection.eIsProxy()) {
			InternalEObject oldToConnection = (InternalEObject)toConnection;
			toConnection = (Connection)eResolveProxy(oldToConnection);
			if (toConnection != oldToConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.FORM__TO_CONNECTION, oldToConnection, toConnection));
			}
		}
		return toConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetToConnection() {
		return toConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToConnection(Connection newToConnection) {
		Connection oldToConnection = toConnection;
		toConnection = newToConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.FORM__TO_CONNECTION, oldToConnection, toConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getToParentForm() {
		if (toParentForm != null && toParentForm.eIsProxy()) {
			InternalEObject oldToParentForm = (InternalEObject)toParentForm;
			toParentForm = (Form)eResolveProxy(oldToParentForm);
			if (toParentForm != oldToParentForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.FORM__TO_PARENT_FORM, oldToParentForm, toParentForm));
			}
		}
		return toParentForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form basicGetToParentForm() {
		return toParentForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToParentForm(Form newToParentForm) {
		Form oldToParentForm = toParentForm;
		toParentForm = newToParentForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.FORM__TO_PARENT_FORM, oldToParentForm, toParentForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcmlPackage.FORM__FORM_TYPE_NAME:
				return getFormTypeName();
			case GcmlPackage.FORM__ACTION:
				return getAction();
			case GcmlPackage.FORM__MEDIUM_DATA_TYPE:
				return getMediumDataType();
			case GcmlPackage.FORM__SUGGESTED_APPLICATION:
				return getSuggestedApplication();
			case GcmlPackage.FORM__VOICE_COMMAND:
				return getVoiceCommand();
			case GcmlPackage.FORM__TO_CONNECTION:
				if (resolve) return getToConnection();
				return basicGetToConnection();
			case GcmlPackage.FORM__TO_PARENT_FORM:
				if (resolve) return getToParentForm();
				return basicGetToParentForm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GcmlPackage.FORM__FORM_TYPE_NAME:
				setFormTypeName((String)newValue);
				return;
			case GcmlPackage.FORM__ACTION:
				setAction((Action)newValue);
				return;
			case GcmlPackage.FORM__MEDIUM_DATA_TYPE:
				getMediumDataType().clear();
				getMediumDataType().addAll((Collection<? extends String>)newValue);
				return;
			case GcmlPackage.FORM__SUGGESTED_APPLICATION:
				setSuggestedApplication((String)newValue);
				return;
			case GcmlPackage.FORM__VOICE_COMMAND:
				setVoiceCommand((String)newValue);
				return;
			case GcmlPackage.FORM__TO_CONNECTION:
				setToConnection((Connection)newValue);
				return;
			case GcmlPackage.FORM__TO_PARENT_FORM:
				setToParentForm((Form)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GcmlPackage.FORM__FORM_TYPE_NAME:
				setFormTypeName(FORM_TYPE_NAME_EDEFAULT);
				return;
			case GcmlPackage.FORM__ACTION:
				unsetAction();
				return;
			case GcmlPackage.FORM__MEDIUM_DATA_TYPE:
				getMediumDataType().clear();
				return;
			case GcmlPackage.FORM__SUGGESTED_APPLICATION:
				setSuggestedApplication(SUGGESTED_APPLICATION_EDEFAULT);
				return;
			case GcmlPackage.FORM__VOICE_COMMAND:
				setVoiceCommand(VOICE_COMMAND_EDEFAULT);
				return;
			case GcmlPackage.FORM__TO_CONNECTION:
				setToConnection((Connection)null);
				return;
			case GcmlPackage.FORM__TO_PARENT_FORM:
				setToParentForm((Form)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GcmlPackage.FORM__FORM_TYPE_NAME:
				return FORM_TYPE_NAME_EDEFAULT == null ? formTypeName != null : !FORM_TYPE_NAME_EDEFAULT.equals(formTypeName);
			case GcmlPackage.FORM__ACTION:
				return isSetAction();
			case GcmlPackage.FORM__MEDIUM_DATA_TYPE:
				return mediumDataType != null && !mediumDataType.isEmpty();
			case GcmlPackage.FORM__SUGGESTED_APPLICATION:
				return SUGGESTED_APPLICATION_EDEFAULT == null ? suggestedApplication != null : !SUGGESTED_APPLICATION_EDEFAULT.equals(suggestedApplication);
			case GcmlPackage.FORM__VOICE_COMMAND:
				return VOICE_COMMAND_EDEFAULT == null ? voiceCommand != null : !VOICE_COMMAND_EDEFAULT.equals(voiceCommand);
			case GcmlPackage.FORM__TO_CONNECTION:
				return toConnection != null;
			case GcmlPackage.FORM__TO_PARENT_FORM:
				return toParentForm != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (formTypeName: ");
		result.append(formTypeName);
		result.append(", action: ");
		if (actionESet) result.append(action); else result.append("<unset>");
		result.append(", mediumDataType: ");
		result.append(mediumDataType);
		result.append(", suggestedApplication: ");
		result.append(suggestedApplication);
		result.append(", voiceCommand: ");
		result.append(voiceCommand);
		result.append(')');
		return result.toString();
	}

} //FormImpl
