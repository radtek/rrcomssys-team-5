/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Capability;
import gcml.Connection;
import gcml.Form;
import gcml.GcmlPackage;
import gcml.Medium;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medium</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.MediumImpl#getMediumDataType <em>Medium Data Type</em>}</li>
 *   <li>{@link gcml.impl.MediumImpl#getMediumName <em>Medium Name</em>}</li>
 *   <li>{@link gcml.impl.MediumImpl#getSuggestedApplication <em>Suggested Application</em>}</li>
 *   <li>{@link gcml.impl.MediumImpl#getToConnection <em>To Connection</em>}</li>
 *   <li>{@link gcml.impl.MediumImpl#getToForm <em>To Form</em>}</li>
 *   <li>{@link gcml.impl.MediumImpl#getVoiceCommand <em>Voice Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediumImpl extends CDOObjectImpl implements Medium {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getMediumDataType() {
		return (Capability)eGet(GcmlPackage.Literals.MEDIUM__MEDIUM_DATA_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumDataType(Capability newMediumDataType) {
		eSet(GcmlPackage.Literals.MEDIUM__MEDIUM_DATA_TYPE, newMediumDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMediumDataType() {
		eUnset(GcmlPackage.Literals.MEDIUM__MEDIUM_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMediumDataType() {
		return eIsSet(GcmlPackage.Literals.MEDIUM__MEDIUM_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMediumName() {
		return (String)eGet(GcmlPackage.Literals.MEDIUM__MEDIUM_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumName(String newMediumName) {
		eSet(GcmlPackage.Literals.MEDIUM__MEDIUM_NAME, newMediumName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuggestedApplication() {
		return (String)eGet(GcmlPackage.Literals.MEDIUM__SUGGESTED_APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuggestedApplication(String newSuggestedApplication) {
		eSet(GcmlPackage.Literals.MEDIUM__SUGGESTED_APPLICATION, newSuggestedApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getToConnection() {
		return (Connection)eGet(GcmlPackage.Literals.MEDIUM__TO_CONNECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToConnection(Connection newToConnection) {
		eSet(GcmlPackage.Literals.MEDIUM__TO_CONNECTION, newToConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getToForm() {
		return (Form)eGet(GcmlPackage.Literals.MEDIUM__TO_FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToForm(Form newToForm) {
		eSet(GcmlPackage.Literals.MEDIUM__TO_FORM, newToForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoiceCommand() {
		return (String)eGet(GcmlPackage.Literals.MEDIUM__VOICE_COMMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoiceCommand(String newVoiceCommand) {
		eSet(GcmlPackage.Literals.MEDIUM__VOICE_COMMAND, newVoiceCommand);
	}

} //MediumImpl
