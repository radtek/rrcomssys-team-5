/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Capability;
import gcml.Connection;
import gcml.Device;
import gcml.GcmlPackage;
import gcml.IsAttached;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.DeviceImpl#isIsLocal <em>Is Local</em>}</li>
 *   <li>{@link gcml.impl.DeviceImpl#getDeviceCapability <em>Device Capability</em>}</li>
 *   <li>{@link gcml.impl.DeviceImpl#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link gcml.impl.DeviceImpl#getToConnection <em>To Connection</em>}</li>
 *   <li>{@link gcml.impl.DeviceImpl#getFromIsAttached <em>From Is Attached</em>}</li>
 *   <li>{@link gcml.impl.DeviceImpl#getDeviceID <em>Device ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends EObjectImpl implements Device {
	/**
	 * The default value of the '{@link #isIsLocal() <em>Is Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocal() <em>Is Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocal()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocal = IS_LOCAL_EDEFAULT;

	/**
	 * This is true if the Is Local attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isLocalESet;

	/**
	 * The cached value of the '{@link #getDeviceCapability() <em>Device Capability</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> deviceCapability;

	/**
	 * The default value of the '{@link #isIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VIRTUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected boolean isVirtual = IS_VIRTUAL_EDEFAULT;

	/**
	 * This is true if the Is Virtual attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isVirtualESet;

	/**
	 * The cached value of the '{@link #getToConnection() <em>To Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> toConnection;

	/**
	 * The cached value of the '{@link #getFromIsAttached() <em>From Is Attached</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIsAttached()
	 * @generated
	 * @ordered
	 */
	protected EList<IsAttached> fromIsAttached;

	/**
	 * The default value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String deviceID = DEVICE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getDeviceCapability() {
		if (deviceCapability == null) {
			deviceCapability = new EDataTypeEList<Capability>(Capability.class, this, GcmlPackage.DEVICE__DEVICE_CAPABILITY);
		}
		return deviceCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLocal() {
		return isLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocal(boolean newIsLocal) {
		boolean oldIsLocal = isLocal;
		isLocal = newIsLocal;
		boolean oldIsLocalESet = isLocalESet;
		isLocalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.DEVICE__IS_LOCAL, oldIsLocal, isLocal, !oldIsLocalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsLocal() {
		boolean oldIsLocal = isLocal;
		boolean oldIsLocalESet = isLocalESet;
		isLocal = IS_LOCAL_EDEFAULT;
		isLocalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GcmlPackage.DEVICE__IS_LOCAL, oldIsLocal, IS_LOCAL_EDEFAULT, oldIsLocalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsLocal() {
		return isLocalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVirtual() {
		return isVirtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVirtual(boolean newIsVirtual) {
		boolean oldIsVirtual = isVirtual;
		isVirtual = newIsVirtual;
		boolean oldIsVirtualESet = isVirtualESet;
		isVirtualESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.DEVICE__IS_VIRTUAL, oldIsVirtual, isVirtual, !oldIsVirtualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsVirtual() {
		boolean oldIsVirtual = isVirtual;
		boolean oldIsVirtualESet = isVirtualESet;
		isVirtual = IS_VIRTUAL_EDEFAULT;
		isVirtualESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GcmlPackage.DEVICE__IS_VIRTUAL, oldIsVirtual, IS_VIRTUAL_EDEFAULT, oldIsVirtualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsVirtual() {
		return isVirtualESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getToConnection() {
		if (toConnection == null) {
			toConnection = new EObjectWithInverseResolvingEList.ManyInverse<Connection>(Connection.class, this, GcmlPackage.DEVICE__TO_CONNECTION, GcmlPackage.CONNECTION__FROM_DEVICE);
		}
		return toConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IsAttached> getFromIsAttached() {
		if (fromIsAttached == null) {
			fromIsAttached = new EObjectWithInverseResolvingEList<IsAttached>(IsAttached.class, this, GcmlPackage.DEVICE__FROM_IS_ATTACHED, GcmlPackage.IS_ATTACHED__TO_DEVICE);
		}
		return fromIsAttached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceID() {
		return deviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceID(String newDeviceID) {
		String oldDeviceID = deviceID;
		deviceID = newDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.DEVICE__DEVICE_ID, oldDeviceID, deviceID));
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
			case GcmlPackage.DEVICE__TO_CONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToConnection()).basicAdd(otherEnd, msgs);
			case GcmlPackage.DEVICE__FROM_IS_ATTACHED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromIsAttached()).basicAdd(otherEnd, msgs);
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
			case GcmlPackage.DEVICE__TO_CONNECTION:
				return ((InternalEList<?>)getToConnection()).basicRemove(otherEnd, msgs);
			case GcmlPackage.DEVICE__FROM_IS_ATTACHED:
				return ((InternalEList<?>)getFromIsAttached()).basicRemove(otherEnd, msgs);
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
			case GcmlPackage.DEVICE__IS_LOCAL:
				return isIsLocal() ? Boolean.TRUE : Boolean.FALSE;
			case GcmlPackage.DEVICE__DEVICE_CAPABILITY:
				return getDeviceCapability();
			case GcmlPackage.DEVICE__IS_VIRTUAL:
				return isIsVirtual() ? Boolean.TRUE : Boolean.FALSE;
			case GcmlPackage.DEVICE__TO_CONNECTION:
				return getToConnection();
			case GcmlPackage.DEVICE__FROM_IS_ATTACHED:
				return getFromIsAttached();
			case GcmlPackage.DEVICE__DEVICE_ID:
				return getDeviceID();
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
			case GcmlPackage.DEVICE__IS_LOCAL:
				setIsLocal(((Boolean)newValue).booleanValue());
				return;
			case GcmlPackage.DEVICE__DEVICE_CAPABILITY:
				getDeviceCapability().clear();
				getDeviceCapability().addAll((Collection<? extends Capability>)newValue);
				return;
			case GcmlPackage.DEVICE__IS_VIRTUAL:
				setIsVirtual(((Boolean)newValue).booleanValue());
				return;
			case GcmlPackage.DEVICE__TO_CONNECTION:
				getToConnection().clear();
				getToConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case GcmlPackage.DEVICE__FROM_IS_ATTACHED:
				getFromIsAttached().clear();
				getFromIsAttached().addAll((Collection<? extends IsAttached>)newValue);
				return;
			case GcmlPackage.DEVICE__DEVICE_ID:
				setDeviceID((String)newValue);
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
			case GcmlPackage.DEVICE__IS_LOCAL:
				unsetIsLocal();
				return;
			case GcmlPackage.DEVICE__DEVICE_CAPABILITY:
				getDeviceCapability().clear();
				return;
			case GcmlPackage.DEVICE__IS_VIRTUAL:
				unsetIsVirtual();
				return;
			case GcmlPackage.DEVICE__TO_CONNECTION:
				getToConnection().clear();
				return;
			case GcmlPackage.DEVICE__FROM_IS_ATTACHED:
				getFromIsAttached().clear();
				return;
			case GcmlPackage.DEVICE__DEVICE_ID:
				setDeviceID(DEVICE_ID_EDEFAULT);
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
			case GcmlPackage.DEVICE__IS_LOCAL:
				return isSetIsLocal();
			case GcmlPackage.DEVICE__DEVICE_CAPABILITY:
				return deviceCapability != null && !deviceCapability.isEmpty();
			case GcmlPackage.DEVICE__IS_VIRTUAL:
				return isSetIsVirtual();
			case GcmlPackage.DEVICE__TO_CONNECTION:
				return toConnection != null && !toConnection.isEmpty();
			case GcmlPackage.DEVICE__FROM_IS_ATTACHED:
				return fromIsAttached != null && !fromIsAttached.isEmpty();
			case GcmlPackage.DEVICE__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceID != null : !DEVICE_ID_EDEFAULT.equals(deviceID);
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
		result.append(" (isLocal: ");
		if (isLocalESet) result.append(isLocal); else result.append("<unset>");
		result.append(", deviceCapability: ");
		result.append(deviceCapability);
		result.append(", isVirtual: ");
		if (isVirtualESet) result.append(isVirtual); else result.append("<unset>");
		result.append(", deviceID: ");
		result.append(deviceID);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
