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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.DecisionImpl#getSourceActivityID <em>Source Activity ID</em>}</li>
 *   <li>{@link gcml.impl.DecisionImpl#getSuccessPathID <em>Success Path ID</em>}</li>
 *   <li>{@link gcml.impl.DecisionImpl#getAlternatePathID <em>Alternate Path ID</em>}</li>
 *   <li>{@link gcml.impl.DecisionImpl#isOutcome <em>Outcome</em>}</li>
 *   <li>{@link gcml.impl.DecisionImpl#getFromDecisionToBoudary <em>From Decision To Boudary</em>}</li>
 *   <li>{@link gcml.impl.DecisionImpl#getFromDecision <em>From Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionImpl extends ActivityImpl implements Decision {
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
	public BigInteger getSourceActivityID() {
		return (BigInteger)eGet(GcmlPackage.Literals.DECISION__SOURCE_ACTIVITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceActivityID(BigInteger newSourceActivityID) {
		eSet(GcmlPackage.Literals.DECISION__SOURCE_ACTIVITY_ID, newSourceActivityID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSuccessPathID() {
		return (BigInteger)eGet(GcmlPackage.Literals.DECISION__SUCCESS_PATH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessPathID(BigInteger newSuccessPathID) {
		eSet(GcmlPackage.Literals.DECISION__SUCCESS_PATH_ID, newSuccessPathID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAlternatePathID() {
		return (BigInteger)eGet(GcmlPackage.Literals.DECISION__ALTERNATE_PATH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternatePathID(BigInteger newAlternatePathID) {
		eSet(GcmlPackage.Literals.DECISION__ALTERNATE_PATH_ID, newAlternatePathID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutcome() {
		return ((Boolean)eGet(GcmlPackage.Literals.DECISION__OUTCOME, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(boolean newOutcome) {
		eSet(GcmlPackage.Literals.DECISION__OUTCOME, new Boolean(newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary getFromDecisionToBoudary() {
		return (Boundary)eGet(GcmlPackage.Literals.DECISION__FROM_DECISION_TO_BOUDARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDecisionToBoudary(Boundary newFromDecisionToBoudary) {
		eSet(GcmlPackage.Literals.DECISION__FROM_DECISION_TO_BOUDARY, newFromDecisionToBoudary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call getFromDecision() {
		return (Call)eGet(GcmlPackage.Literals.DECISION__FROM_DECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDecision(Call newFromDecision) {
		eSet(GcmlPackage.Literals.DECISION__FROM_DECISION, newFromDecision);
	}

} //DecisionImpl
