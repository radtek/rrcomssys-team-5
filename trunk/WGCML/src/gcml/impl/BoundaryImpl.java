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
import gcml.Decision;
import gcml.GcmlPackage;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.BoundaryImpl#getName <em>Name</em>}</li>
 *   <li>{@link gcml.impl.BoundaryImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link gcml.impl.BoundaryImpl#getType <em>Type</em>}</li>
 *   <li>{@link gcml.impl.BoundaryImpl#getToCall <em>To Call</em>}</li>
 *   <li>{@link gcml.impl.BoundaryImpl#getToDecision <em>To Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundaryImpl extends ActivityImpl implements Boundary {
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
	public String getName() {
		return (String)eGet(GcmlPackage.Literals.BOUNDARY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(GcmlPackage.Literals.BOUNDARY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOutcome() {
		return (BigInteger)eGet(GcmlPackage.Literals.BOUNDARY__OUTCOME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(BigInteger newOutcome) {
		eSet(GcmlPackage.Literals.BOUNDARY__OUTCOME, newOutcome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryType getType() {
		return (BoundaryType)eGet(GcmlPackage.Literals.BOUNDARY__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BoundaryType newType) {
		eSet(GcmlPackage.Literals.BOUNDARY__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call getToCall() {
		return (Call)eGet(GcmlPackage.Literals.BOUNDARY__TO_CALL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToCall(Call newToCall) {
		eSet(GcmlPackage.Literals.BOUNDARY__TO_CALL, newToCall);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision getToDecision() {
		return (Decision)eGet(GcmlPackage.Literals.BOUNDARY__TO_DECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDecision(Decision newToDecision) {
		eSet(GcmlPackage.Literals.BOUNDARY__TO_DECISION, newToDecision);
	}

} //BoundaryImpl
