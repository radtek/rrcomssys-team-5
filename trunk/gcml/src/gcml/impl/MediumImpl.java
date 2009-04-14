/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Capability;
import gcml.Connection;
import gcml.GcmlPackage;
import gcml.Medium;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medium</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.MediumImpl#getDerivedFromBuiltInType <em>Derived From Built In Type</em>}</li>
 *   <li>{@link gcml.impl.MediumImpl#getMediumTypeName <em>Medium Type Name</em>}</li>
 *   <li>{@link gcml.impl.MediumImpl#getSuggestedApplication <em>Suggested Application</em>}</li>
 *   <li>{@link gcml.impl.MediumImpl#getVoiceCommand <em>Voice Command</em>}</li>
 *   <li>{@link gcml.impl.MediumImpl#getToConnection <em>To Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediumImpl extends EObjectImpl implements Medium {
	/**
	 * The default value of the '{@link #getDerivedFromBuiltInType() <em>Derived From Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFromBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected static final Capability DERIVED_FROM_BUILT_IN_TYPE_EDEFAULT = Capability.TEXT_FILE;

	/**
	 * The cached value of the '{@link #getDerivedFromBuiltInType() <em>Derived From Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFromBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected Capability derivedFromBuiltInType = DERIVED_FROM_BUILT_IN_TYPE_EDEFAULT;

	/**
	 * This is true if the Derived From Built In Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean derivedFromBuiltInTypeESet;

	/**
	 * The default value of the '{@link #getMediumTypeName() <em>Medium Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIUM_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediumTypeName() <em>Medium Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumTypeName()
	 * @generated
	 * @ordered
	 */
	protected String mediumTypeName = MEDIUM_TYPE_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.MEDIUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getDerivedFromBuiltInType() {
		return derivedFromBuiltInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedFromBuiltInType(Capability newDerivedFromBuiltInType) {
		Capability oldDerivedFromBuiltInType = derivedFromBuiltInType;
		derivedFromBuiltInType = newDerivedFromBuiltInType == null ? DERIVED_FROM_BUILT_IN_TYPE_EDEFAULT : newDerivedFromBuiltInType;
		boolean oldDerivedFromBuiltInTypeESet = derivedFromBuiltInTypeESet;
		derivedFromBuiltInTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.MEDIUM__DERIVED_FROM_BUILT_IN_TYPE, oldDerivedFromBuiltInType, derivedFromBuiltInType, !oldDerivedFromBuiltInTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDerivedFromBuiltInType() {
		Capability oldDerivedFromBuiltInType = derivedFromBuiltInType;
		boolean oldDerivedFromBuiltInTypeESet = derivedFromBuiltInTypeESet;
		derivedFromBuiltInType = DERIVED_FROM_BUILT_IN_TYPE_EDEFAULT;
		derivedFromBuiltInTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GcmlPackage.MEDIUM__DERIVED_FROM_BUILT_IN_TYPE, oldDerivedFromBuiltInType, DERIVED_FROM_BUILT_IN_TYPE_EDEFAULT, oldDerivedFromBuiltInTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDerivedFromBuiltInType() {
		return derivedFromBuiltInTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMediumTypeName() {
		return mediumTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumTypeName(String newMediumTypeName) {
		String oldMediumTypeName = mediumTypeName;
		mediumTypeName = newMediumTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.MEDIUM__MEDIUM_TYPE_NAME, oldMediumTypeName, mediumTypeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.MEDIUM__SUGGESTED_APPLICATION, oldSuggestedApplication, suggestedApplication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.MEDIUM__VOICE_COMMAND, oldVoiceCommand, voiceCommand));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.MEDIUM__TO_CONNECTION, oldToConnection, toConnection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.MEDIUM__TO_CONNECTION, oldToConnection, toConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcmlPackage.MEDIUM__DERIVED_FROM_BUILT_IN_TYPE:
				return getDerivedFromBuiltInType();
			case GcmlPackage.MEDIUM__MEDIUM_TYPE_NAME:
				return getMediumTypeName();
			case GcmlPackage.MEDIUM__SUGGESTED_APPLICATION:
				return getSuggestedApplication();
			case GcmlPackage.MEDIUM__VOICE_COMMAND:
				return getVoiceCommand();
			case GcmlPackage.MEDIUM__TO_CONNECTION:
				if (resolve) return getToConnection();
				return basicGetToConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GcmlPackage.MEDIUM__DERIVED_FROM_BUILT_IN_TYPE:
				setDerivedFromBuiltInType((Capability)newValue);
				return;
			case GcmlPackage.MEDIUM__MEDIUM_TYPE_NAME:
				setMediumTypeName((String)newValue);
				return;
			case GcmlPackage.MEDIUM__SUGGESTED_APPLICATION:
				setSuggestedApplication((String)newValue);
				return;
			case GcmlPackage.MEDIUM__VOICE_COMMAND:
				setVoiceCommand((String)newValue);
				return;
			case GcmlPackage.MEDIUM__TO_CONNECTION:
				setToConnection((Connection)newValue);
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
			case GcmlPackage.MEDIUM__DERIVED_FROM_BUILT_IN_TYPE:
				unsetDerivedFromBuiltInType();
				return;
			case GcmlPackage.MEDIUM__MEDIUM_TYPE_NAME:
				setMediumTypeName(MEDIUM_TYPE_NAME_EDEFAULT);
				return;
			case GcmlPackage.MEDIUM__SUGGESTED_APPLICATION:
				setSuggestedApplication(SUGGESTED_APPLICATION_EDEFAULT);
				return;
			case GcmlPackage.MEDIUM__VOICE_COMMAND:
				setVoiceCommand(VOICE_COMMAND_EDEFAULT);
				return;
			case GcmlPackage.MEDIUM__TO_CONNECTION:
				setToConnection((Connection)null);
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
			case GcmlPackage.MEDIUM__DERIVED_FROM_BUILT_IN_TYPE:
				return isSetDerivedFromBuiltInType();
			case GcmlPackage.MEDIUM__MEDIUM_TYPE_NAME:
				return MEDIUM_TYPE_NAME_EDEFAULT == null ? mediumTypeName != null : !MEDIUM_TYPE_NAME_EDEFAULT.equals(mediumTypeName);
			case GcmlPackage.MEDIUM__SUGGESTED_APPLICATION:
				return SUGGESTED_APPLICATION_EDEFAULT == null ? suggestedApplication != null : !SUGGESTED_APPLICATION_EDEFAULT.equals(suggestedApplication);
			case GcmlPackage.MEDIUM__VOICE_COMMAND:
				return VOICE_COMMAND_EDEFAULT == null ? voiceCommand != null : !VOICE_COMMAND_EDEFAULT.equals(voiceCommand);
			case GcmlPackage.MEDIUM__TO_CONNECTION:
				return toConnection != null;
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
		result.append(" (derivedFromBuiltInType: ");
		if (derivedFromBuiltInTypeESet) result.append(derivedFromBuiltInType); else result.append("<unset>");
		result.append(", mediumTypeName: ");
		result.append(mediumTypeName);
		result.append(", suggestedApplication: ");
		result.append(suggestedApplication);
		result.append(", voiceCommand: ");
		result.append(voiceCommand);
		result.append(')');
		return result.toString();
	}

} //MediumImpl
