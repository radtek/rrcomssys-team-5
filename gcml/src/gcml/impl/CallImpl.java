/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Boundary;
import gcml.Call;
import gcml.Connection;
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
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.CallImpl#isOutcome <em>Outcome</em>}</li>
 *   <li>{@link gcml.impl.CallImpl#getCallToConnection <em>Call To Connection</em>}</li>
 *   <li>{@link gcml.impl.CallImpl#getCallToDecision <em>Call To Decision</em>}</li>
 *   <li>{@link gcml.impl.CallImpl#getCallToBoundary <em>Call To Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends ActivityImpl implements Call {
	/**
	 * The default value of the '{@link #isOutcome() <em>Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutcome()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTCOME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutcome() <em>Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutcome()
	 * @generated
	 * @ordered
	 */
	protected boolean outcome = OUTCOME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCallToConnection() <em>Call To Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallToConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> callToConnection;

	/**
	 * The cached value of the '{@link #getCallToDecision() <em>Call To Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallToDecision()
	 * @generated
	 * @ordered
	 */
	protected Decision callToDecision;

	/**
	 * The cached value of the '{@link #getCallToBoundary() <em>Call To Boundary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallToBoundary()
	 * @generated
	 * @ordered
	 */
	protected Boundary callToBoundary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(boolean newOutcome) {
		boolean oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.CALL__OUTCOME, oldOutcome, outcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getCallToConnection() {
		if (callToConnection == null) {
			callToConnection = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this, GcmlPackage.CALL__CALL_TO_CONNECTION, GcmlPackage.CONNECTION__CONNECTION_TO_CALL);
		}
		return callToConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision getCallToDecision() {
		if (callToDecision != null && callToDecision.eIsProxy()) {
			InternalEObject oldCallToDecision = (InternalEObject)callToDecision;
			callToDecision = (Decision)eResolveProxy(oldCallToDecision);
			if (callToDecision != oldCallToDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.CALL__CALL_TO_DECISION, oldCallToDecision, callToDecision));
			}
		}
		return callToDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision basicGetCallToDecision() {
		return callToDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallToDecision(Decision newCallToDecision, NotificationChain msgs) {
		Decision oldCallToDecision = callToDecision;
		callToDecision = newCallToDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GcmlPackage.CALL__CALL_TO_DECISION, oldCallToDecision, newCallToDecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallToDecision(Decision newCallToDecision) {
		if (newCallToDecision != callToDecision) {
			NotificationChain msgs = null;
			if (callToDecision != null)
				msgs = ((InternalEObject)callToDecision).eInverseRemove(this, GcmlPackage.DECISION__DECISION_TO_CALL, Decision.class, msgs);
			if (newCallToDecision != null)
				msgs = ((InternalEObject)newCallToDecision).eInverseAdd(this, GcmlPackage.DECISION__DECISION_TO_CALL, Decision.class, msgs);
			msgs = basicSetCallToDecision(newCallToDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.CALL__CALL_TO_DECISION, newCallToDecision, newCallToDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary getCallToBoundary() {
		if (callToBoundary != null && callToBoundary.eIsProxy()) {
			InternalEObject oldCallToBoundary = (InternalEObject)callToBoundary;
			callToBoundary = (Boundary)eResolveProxy(oldCallToBoundary);
			if (callToBoundary != oldCallToBoundary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.CALL__CALL_TO_BOUNDARY, oldCallToBoundary, callToBoundary));
			}
		}
		return callToBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary basicGetCallToBoundary() {
		return callToBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallToBoundary(Boundary newCallToBoundary) {
		Boundary oldCallToBoundary = callToBoundary;
		callToBoundary = newCallToBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.CALL__CALL_TO_BOUNDARY, oldCallToBoundary, callToBoundary));
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
			case GcmlPackage.CALL__CALL_TO_CONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallToConnection()).basicAdd(otherEnd, msgs);
			case GcmlPackage.CALL__CALL_TO_DECISION:
				if (callToDecision != null)
					msgs = ((InternalEObject)callToDecision).eInverseRemove(this, GcmlPackage.DECISION__DECISION_TO_CALL, Decision.class, msgs);
				return basicSetCallToDecision((Decision)otherEnd, msgs);
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
			case GcmlPackage.CALL__CALL_TO_CONNECTION:
				return ((InternalEList<?>)getCallToConnection()).basicRemove(otherEnd, msgs);
			case GcmlPackage.CALL__CALL_TO_DECISION:
				return basicSetCallToDecision(null, msgs);
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
			case GcmlPackage.CALL__OUTCOME:
				return isOutcome() ? Boolean.TRUE : Boolean.FALSE;
			case GcmlPackage.CALL__CALL_TO_CONNECTION:
				return getCallToConnection();
			case GcmlPackage.CALL__CALL_TO_DECISION:
				if (resolve) return getCallToDecision();
				return basicGetCallToDecision();
			case GcmlPackage.CALL__CALL_TO_BOUNDARY:
				if (resolve) return getCallToBoundary();
				return basicGetCallToBoundary();
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
			case GcmlPackage.CALL__OUTCOME:
				setOutcome(((Boolean)newValue).booleanValue());
				return;
			case GcmlPackage.CALL__CALL_TO_CONNECTION:
				getCallToConnection().clear();
				getCallToConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case GcmlPackage.CALL__CALL_TO_DECISION:
				setCallToDecision((Decision)newValue);
				return;
			case GcmlPackage.CALL__CALL_TO_BOUNDARY:
				setCallToBoundary((Boundary)newValue);
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
			case GcmlPackage.CALL__OUTCOME:
				setOutcome(OUTCOME_EDEFAULT);
				return;
			case GcmlPackage.CALL__CALL_TO_CONNECTION:
				getCallToConnection().clear();
				return;
			case GcmlPackage.CALL__CALL_TO_DECISION:
				setCallToDecision((Decision)null);
				return;
			case GcmlPackage.CALL__CALL_TO_BOUNDARY:
				setCallToBoundary((Boundary)null);
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
			case GcmlPackage.CALL__OUTCOME:
				return outcome != OUTCOME_EDEFAULT;
			case GcmlPackage.CALL__CALL_TO_CONNECTION:
				return callToConnection != null && !callToConnection.isEmpty();
			case GcmlPackage.CALL__CALL_TO_DECISION:
				return callToDecision != null;
			case GcmlPackage.CALL__CALL_TO_BOUNDARY:
				return callToBoundary != null;
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
		result.append(" (outcome: ");
		result.append(outcome);
		result.append(')');
		return result.toString();
	}

} //CallImpl
