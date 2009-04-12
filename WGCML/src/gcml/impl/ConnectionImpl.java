/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Connection;
import gcml.Device;
import gcml.GcmlPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.ConnectionImpl#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link gcml.impl.ConnectionImpl#getFromDevice <em>From Device</em>}</li>
 *   <li>{@link gcml.impl.ConnectionImpl#getConnectionID <em>Connection ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends CDOObjectImpl implements Connection {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBandwidth() {
		return (String)eGet(GcmlPackage.Literals.CONNECTION__BANDWIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidth(String newBandwidth) {
		eSet(GcmlPackage.Literals.CONNECTION__BANDWIDTH, newBandwidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Device> getFromDevice() {
		return (EList<Device>)eGet(GcmlPackage.Literals.CONNECTION__FROM_DEVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectionID() {
		return (String)eGet(GcmlPackage.Literals.CONNECTION__CONNECTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionID(String newConnectionID) {
		eSet(GcmlPackage.Literals.CONNECTION__CONNECTION_ID, newConnectionID);
	}

} //ConnectionImpl
