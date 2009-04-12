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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.CallImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link gcml.impl.CallImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link gcml.impl.CallImpl#getToBoundary <em>To Boundary</em>}</li>
 *   <li>{@link gcml.impl.CallImpl#getFromCall <em>From Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends ActivityImpl implements Call {
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
	@SuppressWarnings("unchecked")
	public EList<Connection> getConnections() {
		return (EList<Connection>)eGet(GcmlPackage.Literals.CALL__CONNECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutcome() {
		return ((Integer)eGet(GcmlPackage.Literals.CALL__OUTCOME, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(int newOutcome) {
		eSet(GcmlPackage.Literals.CALL__OUTCOME, new Integer(newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary getToBoundary() {
		return (Boundary)eGet(GcmlPackage.Literals.CALL__TO_BOUNDARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBoundary(Boundary newToBoundary) {
		eSet(GcmlPackage.Literals.CALL__TO_BOUNDARY, newToBoundary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Decision> getFromCall() {
		return (EList<Decision>)eGet(GcmlPackage.Literals.CALL__FROM_CALL, true);
	}

} //CallImpl
