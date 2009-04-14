/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Call;
import gcml.Connection;
import gcml.Device;
import gcml.GcmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.ConnectionImpl#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link gcml.impl.ConnectionImpl#getFromDevice <em>From Device</em>}</li>
 *   <li>{@link gcml.impl.ConnectionImpl#getConnectionToCall <em>Connection To Call</em>}</li>
 *   <li>{@link gcml.impl.ConnectionImpl#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends EObjectImpl implements Connection {
	/**
	 * The default value of the '{@link #getConnectionID() <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionID() <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionID()
	 * @generated
	 * @ordered
	 */
	protected String connectionID = CONNECTION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromDevice() <em>From Device</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> fromDevice;

	/**
	 * The cached value of the '{@link #getConnectionToCall() <em>Connection To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionToCall()
	 * @generated
	 * @ordered
	 */
	protected Call connectionToCall;

	/**
	 * The default value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final String BANDWIDTH_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected String bandwidth = BANDWIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBandwidth() {
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidth(String newBandwidth) {
		String oldBandwidth = bandwidth;
		bandwidth = newBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.CONNECTION__BANDWIDTH, oldBandwidth, bandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getFromDevice() {
		if (fromDevice == null) {
			fromDevice = new EObjectWithInverseResolvingEList.ManyInverse<Device>(Device.class, this, GcmlPackage.CONNECTION__FROM_DEVICE, GcmlPackage.DEVICE__TO_CONNECTION);
		}
		return fromDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectionID() {
		return connectionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionID(String newConnectionID) {
		String oldConnectionID = connectionID;
		connectionID = newConnectionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.CONNECTION__CONNECTION_ID, oldConnectionID, connectionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call getConnectionToCall() {
		if (connectionToCall != null && connectionToCall.eIsProxy()) {
			InternalEObject oldConnectionToCall = (InternalEObject)connectionToCall;
			connectionToCall = (Call)eResolveProxy(oldConnectionToCall);
			if (connectionToCall != oldConnectionToCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.CONNECTION__CONNECTION_TO_CALL, oldConnectionToCall, connectionToCall));
			}
		}
		return connectionToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call basicGetConnectionToCall() {
		return connectionToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionToCall(Call newConnectionToCall, NotificationChain msgs) {
		Call oldConnectionToCall = connectionToCall;
		connectionToCall = newConnectionToCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GcmlPackage.CONNECTION__CONNECTION_TO_CALL, oldConnectionToCall, newConnectionToCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionToCall(Call newConnectionToCall) {
		if (newConnectionToCall != connectionToCall) {
			NotificationChain msgs = null;
			if (connectionToCall != null)
				msgs = ((InternalEObject)connectionToCall).eInverseRemove(this, GcmlPackage.CALL__CALL_TO_CONNECTION, Call.class, msgs);
			if (newConnectionToCall != null)
				msgs = ((InternalEObject)newConnectionToCall).eInverseAdd(this, GcmlPackage.CALL__CALL_TO_CONNECTION, Call.class, msgs);
			msgs = basicSetConnectionToCall(newConnectionToCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.CONNECTION__CONNECTION_TO_CALL, newConnectionToCall, newConnectionToCall));
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
			case GcmlPackage.CONNECTION__FROM_DEVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromDevice()).basicAdd(otherEnd, msgs);
			case GcmlPackage.CONNECTION__CONNECTION_TO_CALL:
				if (connectionToCall != null)
					msgs = ((InternalEObject)connectionToCall).eInverseRemove(this, GcmlPackage.CALL__CALL_TO_CONNECTION, Call.class, msgs);
				return basicSetConnectionToCall((Call)otherEnd, msgs);
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
			case GcmlPackage.CONNECTION__FROM_DEVICE:
				return ((InternalEList<?>)getFromDevice()).basicRemove(otherEnd, msgs);
			case GcmlPackage.CONNECTION__CONNECTION_TO_CALL:
				return basicSetConnectionToCall(null, msgs);
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
			case GcmlPackage.CONNECTION__CONNECTION_ID:
				return getConnectionID();
			case GcmlPackage.CONNECTION__FROM_DEVICE:
				return getFromDevice();
			case GcmlPackage.CONNECTION__CONNECTION_TO_CALL:
				if (resolve) return getConnectionToCall();
				return basicGetConnectionToCall();
			case GcmlPackage.CONNECTION__BANDWIDTH:
				return getBandwidth();
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
			case GcmlPackage.CONNECTION__CONNECTION_ID:
				setConnectionID((String)newValue);
				return;
			case GcmlPackage.CONNECTION__FROM_DEVICE:
				getFromDevice().clear();
				getFromDevice().addAll((Collection<? extends Device>)newValue);
				return;
			case GcmlPackage.CONNECTION__CONNECTION_TO_CALL:
				setConnectionToCall((Call)newValue);
				return;
			case GcmlPackage.CONNECTION__BANDWIDTH:
				setBandwidth((String)newValue);
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
			case GcmlPackage.CONNECTION__CONNECTION_ID:
				setConnectionID(CONNECTION_ID_EDEFAULT);
				return;
			case GcmlPackage.CONNECTION__FROM_DEVICE:
				getFromDevice().clear();
				return;
			case GcmlPackage.CONNECTION__CONNECTION_TO_CALL:
				setConnectionToCall((Call)null);
				return;
			case GcmlPackage.CONNECTION__BANDWIDTH:
				setBandwidth(BANDWIDTH_EDEFAULT);
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
			case GcmlPackage.CONNECTION__CONNECTION_ID:
				return CONNECTION_ID_EDEFAULT == null ? connectionID != null : !CONNECTION_ID_EDEFAULT.equals(connectionID);
			case GcmlPackage.CONNECTION__FROM_DEVICE:
				return fromDevice != null && !fromDevice.isEmpty();
			case GcmlPackage.CONNECTION__CONNECTION_TO_CALL:
				return connectionToCall != null;
			case GcmlPackage.CONNECTION__BANDWIDTH:
				return BANDWIDTH_EDEFAULT == null ? bandwidth != null : !BANDWIDTH_EDEFAULT.equals(bandwidth);
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
		result.append(" (connectionID: ");
		result.append(connectionID);
		result.append(", bandwidth: ");
		result.append(bandwidth);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
