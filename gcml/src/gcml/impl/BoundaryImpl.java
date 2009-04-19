/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Boundary;
import gcml.BoundaryType;
import gcml.Call;
import gcml.GcmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.BoundaryImpl#getType <em>Type</em>}</li>
 *   <li>{@link gcml.impl.BoundaryImpl#getBoundaryToCall <em>Boundary To Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundaryImpl extends ActivityImpl implements Boundary {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BoundaryType TYPE_EDEFAULT = BoundaryType.START;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BoundaryType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBoundaryToCall() <em>Boundary To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryToCall()
	 * @generated
	 * @ordered
	 */
	protected Call boundaryToCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.BOUNDARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BoundaryType newType) {
		BoundaryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.BOUNDARY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call getBoundaryToCall() {
		if (boundaryToCall != null && boundaryToCall.eIsProxy()) {
			InternalEObject oldBoundaryToCall = (InternalEObject)boundaryToCall;
			boundaryToCall = (Call)eResolveProxy(oldBoundaryToCall);
			if (boundaryToCall != oldBoundaryToCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.BOUNDARY__BOUNDARY_TO_CALL, oldBoundaryToCall, boundaryToCall));
			}
		}
		return boundaryToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call basicGetBoundaryToCall() {
		return boundaryToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundaryToCall(Call newBoundaryToCall, NotificationChain msgs) {
		Call oldBoundaryToCall = boundaryToCall;
		boundaryToCall = newBoundaryToCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GcmlPackage.BOUNDARY__BOUNDARY_TO_CALL, oldBoundaryToCall, newBoundaryToCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundaryToCall(Call newBoundaryToCall) {
		if (newBoundaryToCall != boundaryToCall) {
			NotificationChain msgs = null;
			if (boundaryToCall != null)
				msgs = ((InternalEObject)boundaryToCall).eInverseRemove(this, GcmlPackage.CALL__CALL_TO_BOUNDARY, Call.class, msgs);
			if (newBoundaryToCall != null)
				msgs = ((InternalEObject)newBoundaryToCall).eInverseAdd(this, GcmlPackage.CALL__CALL_TO_BOUNDARY, Call.class, msgs);
			msgs = basicSetBoundaryToCall(newBoundaryToCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.BOUNDARY__BOUNDARY_TO_CALL, newBoundaryToCall, newBoundaryToCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GcmlPackage.BOUNDARY__BOUNDARY_TO_CALL:
				if (boundaryToCall != null)
					msgs = ((InternalEObject)boundaryToCall).eInverseRemove(this, GcmlPackage.CALL__CALL_TO_BOUNDARY, Call.class, msgs);
				return basicSetBoundaryToCall((Call)otherEnd, msgs);
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
			case GcmlPackage.BOUNDARY__BOUNDARY_TO_CALL:
				return basicSetBoundaryToCall(null, msgs);
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
			case GcmlPackage.BOUNDARY__TYPE:
				return getType();
			case GcmlPackage.BOUNDARY__BOUNDARY_TO_CALL:
				if (resolve) return getBoundaryToCall();
				return basicGetBoundaryToCall();
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
			case GcmlPackage.BOUNDARY__TYPE:
				setType((BoundaryType)newValue);
				return;
			case GcmlPackage.BOUNDARY__BOUNDARY_TO_CALL:
				setBoundaryToCall((Call)newValue);
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
			case GcmlPackage.BOUNDARY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GcmlPackage.BOUNDARY__BOUNDARY_TO_CALL:
				setBoundaryToCall((Call)null);
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
			case GcmlPackage.BOUNDARY__TYPE:
				return type != TYPE_EDEFAULT;
			case GcmlPackage.BOUNDARY__BOUNDARY_TO_CALL:
				return boundaryToCall != null;
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
		result.append(" (Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //BoundaryImpl
