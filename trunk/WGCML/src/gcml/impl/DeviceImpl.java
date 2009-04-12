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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.DeviceImpl#getDeviceCapability <em>Device Capability</em>}</li>
 *   <li>{@link gcml.impl.DeviceImpl#getFromIsAttached <em>From Is Attached</em>}</li>
 *   <li>{@link gcml.impl.DeviceImpl#isIsLocal <em>Is Local</em>}</li>
 *   <li>{@link gcml.impl.DeviceImpl#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link gcml.impl.DeviceImpl#getToConnection <em>To Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends CDOObjectImpl implements Device {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Capability> getDeviceCapability() {
		return (EList<Capability>)eGet(GcmlPackage.Literals.DEVICE__DEVICE_CAPABILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAttached getFromIsAttached() {
		return (IsAttached)eGet(GcmlPackage.Literals.DEVICE__FROM_IS_ATTACHED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIsAttached(IsAttached newFromIsAttached) {
		eSet(GcmlPackage.Literals.DEVICE__FROM_IS_ATTACHED, newFromIsAttached);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLocal() {
		return ((Boolean)eGet(GcmlPackage.Literals.DEVICE__IS_LOCAL, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocal(boolean newIsLocal) {
		eSet(GcmlPackage.Literals.DEVICE__IS_LOCAL, new Boolean(newIsLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsLocal() {
		eUnset(GcmlPackage.Literals.DEVICE__IS_LOCAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsLocal() {
		return eIsSet(GcmlPackage.Literals.DEVICE__IS_LOCAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVirtual() {
		return ((Boolean)eGet(GcmlPackage.Literals.DEVICE__IS_VIRTUAL, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVirtual(boolean newIsVirtual) {
		eSet(GcmlPackage.Literals.DEVICE__IS_VIRTUAL, new Boolean(newIsVirtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsVirtual() {
		eUnset(GcmlPackage.Literals.DEVICE__IS_VIRTUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsVirtual() {
		return eIsSet(GcmlPackage.Literals.DEVICE__IS_VIRTUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connection> getToConnection() {
		return (EList<Connection>)eGet(GcmlPackage.Literals.DEVICE__TO_CONNECTION, true);
	}

} //DeviceImpl
