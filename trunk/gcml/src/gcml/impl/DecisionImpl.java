/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Boundary;
import gcml.Call;
import gcml.Decision;
import gcml.GcmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.DecisionImpl#getSourceActivityID <em>Source Activity ID</em>}</li>
 *   <li>{@link gcml.impl.DecisionImpl#getSuccessPathID <em>Success Path ID</em>}</li>
 *   <li>{@link gcml.impl.DecisionImpl#getFailPathID <em>Fail Path ID</em>}</li>
 *   <li>{@link gcml.impl.DecisionImpl#getDecisionToCall <em>Decision To Call</em>}</li>
 *   <li>{@link gcml.impl.DecisionImpl#getDecisionToBoundary <em>Decision To Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionImpl extends ActivityImpl implements Decision {
	/**
	 * The default value of the '{@link #getSourceActivityID() <em>Source Activity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceActivityID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ACTIVITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceActivityID() <em>Source Activity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceActivityID()
	 * @generated
	 * @ordered
	 */
	protected String sourceActivityID = SOURCE_ACTIVITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuccessPathID() <em>Success Path ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessPathID()
	 * @generated
	 * @ordered
	 */
	protected static final String SUCCESS_PATH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuccessPathID() <em>Success Path ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessPathID()
	 * @generated
	 * @ordered
	 */
	protected String successPathID = SUCCESS_PATH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailPathID() <em>Fail Path ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailPathID()
	 * @generated
	 * @ordered
	 */
	protected static final String FAIL_PATH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailPathID() <em>Fail Path ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailPathID()
	 * @generated
	 * @ordered
	 */
	protected String failPathID = FAIL_PATH_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecisionToCall() <em>Decision To Call</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionToCall()
	 * @generated
	 * @ordered
	 */
	protected EList<Call> decisionToCall;

	/**
	 * The cached value of the '{@link #getDecisionToBoundary() <em>Decision To Boundary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionToBoundary()
	 * @generated
	 * @ordered
	 */
	protected Boundary decisionToBoundary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceActivityID() {
		return sourceActivityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceActivityID(String newSourceActivityID) {
		String oldSourceActivityID = sourceActivityID;
		sourceActivityID = newSourceActivityID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.DECISION__SOURCE_ACTIVITY_ID, oldSourceActivityID, sourceActivityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuccessPathID() {
		return successPathID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessPathID(String newSuccessPathID) {
		String oldSuccessPathID = successPathID;
		successPathID = newSuccessPathID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.DECISION__SUCCESS_PATH_ID, oldSuccessPathID, successPathID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFailPathID() {
		return failPathID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailPathID(String newFailPathID) {
		String oldFailPathID = failPathID;
		failPathID = newFailPathID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.DECISION__FAIL_PATH_ID, oldFailPathID, failPathID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Call> getDecisionToCall() {
		if (decisionToCall == null) {
			decisionToCall = new EObjectWithInverseResolvingEList<Call>(Call.class, this, GcmlPackage.DECISION__DECISION_TO_CALL, GcmlPackage.CALL__CALL_TO_DECISION);
		}
		return decisionToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary getDecisionToBoundary() {
		if (decisionToBoundary != null && decisionToBoundary.eIsProxy()) {
			InternalEObject oldDecisionToBoundary = (InternalEObject)decisionToBoundary;
			decisionToBoundary = (Boundary)eResolveProxy(oldDecisionToBoundary);
			if (decisionToBoundary != oldDecisionToBoundary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.DECISION__DECISION_TO_BOUNDARY, oldDecisionToBoundary, decisionToBoundary));
			}
		}
		return decisionToBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary basicGetDecisionToBoundary() {
		return decisionToBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionToBoundary(Boundary newDecisionToBoundary) {
		Boundary oldDecisionToBoundary = decisionToBoundary;
		decisionToBoundary = newDecisionToBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.DECISION__DECISION_TO_BOUNDARY, oldDecisionToBoundary, decisionToBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GcmlPackage.DECISION__DECISION_TO_CALL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecisionToCall()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GcmlPackage.DECISION__DECISION_TO_CALL:
				return ((InternalEList<?>)getDecisionToCall()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcmlPackage.DECISION__SOURCE_ACTIVITY_ID:
				return getSourceActivityID();
			case GcmlPackage.DECISION__SUCCESS_PATH_ID:
				return getSuccessPathID();
			case GcmlPackage.DECISION__FAIL_PATH_ID:
				return getFailPathID();
			case GcmlPackage.DECISION__DECISION_TO_CALL:
				return getDecisionToCall();
			case GcmlPackage.DECISION__DECISION_TO_BOUNDARY:
				if (resolve) return getDecisionToBoundary();
				return basicGetDecisionToBoundary();
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
			case GcmlPackage.DECISION__SOURCE_ACTIVITY_ID:
				setSourceActivityID((String)newValue);
				return;
			case GcmlPackage.DECISION__SUCCESS_PATH_ID:
				setSuccessPathID((String)newValue);
				return;
			case GcmlPackage.DECISION__FAIL_PATH_ID:
				setFailPathID((String)newValue);
				return;
			case GcmlPackage.DECISION__DECISION_TO_CALL:
				getDecisionToCall().clear();
				getDecisionToCall().addAll((Collection<? extends Call>)newValue);
				return;
			case GcmlPackage.DECISION__DECISION_TO_BOUNDARY:
				setDecisionToBoundary((Boundary)newValue);
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
			case GcmlPackage.DECISION__SOURCE_ACTIVITY_ID:
				setSourceActivityID(SOURCE_ACTIVITY_ID_EDEFAULT);
				return;
			case GcmlPackage.DECISION__SUCCESS_PATH_ID:
				setSuccessPathID(SUCCESS_PATH_ID_EDEFAULT);
				return;
			case GcmlPackage.DECISION__FAIL_PATH_ID:
				setFailPathID(FAIL_PATH_ID_EDEFAULT);
				return;
			case GcmlPackage.DECISION__DECISION_TO_CALL:
				getDecisionToCall().clear();
				return;
			case GcmlPackage.DECISION__DECISION_TO_BOUNDARY:
				setDecisionToBoundary((Boundary)null);
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
			case GcmlPackage.DECISION__SOURCE_ACTIVITY_ID:
				return SOURCE_ACTIVITY_ID_EDEFAULT == null ? sourceActivityID != null : !SOURCE_ACTIVITY_ID_EDEFAULT.equals(sourceActivityID);
			case GcmlPackage.DECISION__SUCCESS_PATH_ID:
				return SUCCESS_PATH_ID_EDEFAULT == null ? successPathID != null : !SUCCESS_PATH_ID_EDEFAULT.equals(successPathID);
			case GcmlPackage.DECISION__FAIL_PATH_ID:
				return FAIL_PATH_ID_EDEFAULT == null ? failPathID != null : !FAIL_PATH_ID_EDEFAULT.equals(failPathID);
			case GcmlPackage.DECISION__DECISION_TO_CALL:
				return decisionToCall != null && !decisionToCall.isEmpty();
			case GcmlPackage.DECISION__DECISION_TO_BOUNDARY:
				return decisionToBoundary != null;
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
		result.append(" (sourceActivityID: ");
		result.append(sourceActivityID);
		result.append(", successPathID: ");
		result.append(successPathID);
		result.append(", failPathID: ");
		result.append(failPathID);
		result.append(')');
		return result.toString();
	}

} //DecisionImpl
