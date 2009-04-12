/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Decision#getSourceActivityID <em>Source Activity ID</em>}</li>
 *   <li>{@link gcml.Decision#getSuccessPathID <em>Success Path ID</em>}</li>
 *   <li>{@link gcml.Decision#getAlternatePathID <em>Alternate Path ID</em>}</li>
 *   <li>{@link gcml.Decision#isOutcome <em>Outcome</em>}</li>
 *   <li>{@link gcml.Decision#getFromDecisionToBoudary <em>From Decision To Boudary</em>}</li>
 *   <li>{@link gcml.Decision#getFromDecision <em>From Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends Activity {
	/**
	 * Returns the value of the '<em><b>Source Activity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Activity ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Activity ID</em>' attribute.
	 * @see #setSourceActivityID(BigInteger)
	 * @see gcml.GcmlPackage#getDecision_SourceActivityID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getSourceActivityID();

	/**
	 * Sets the value of the '{@link gcml.Decision#getSourceActivityID <em>Source Activity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Activity ID</em>' attribute.
	 * @see #getSourceActivityID()
	 * @generated
	 */
	void setSourceActivityID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Success Path ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Path ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Path ID</em>' attribute.
	 * @see #setSuccessPathID(BigInteger)
	 * @see gcml.GcmlPackage#getDecision_SuccessPathID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getSuccessPathID();

	/**
	 * Sets the value of the '{@link gcml.Decision#getSuccessPathID <em>Success Path ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Path ID</em>' attribute.
	 * @see #getSuccessPathID()
	 * @generated
	 */
	void setSuccessPathID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Alternate Path ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternate Path ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternate Path ID</em>' attribute.
	 * @see #setAlternatePathID(BigInteger)
	 * @see gcml.GcmlPackage#getDecision_AlternatePathID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getAlternatePathID();

	/**
	 * Sets the value of the '{@link gcml.Decision#getAlternatePathID <em>Alternate Path ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternate Path ID</em>' attribute.
	 * @see #getAlternatePathID()
	 * @generated
	 */
	void setAlternatePathID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' attribute.
	 * @see #setOutcome(boolean)
	 * @see gcml.GcmlPackage#getDecision_Outcome()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isOutcome();

	/**
	 * Sets the value of the '{@link gcml.Decision#isOutcome <em>Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' attribute.
	 * @see #isOutcome()
	 * @generated
	 */
	void setOutcome(boolean value);

	/**
	 * Returns the value of the '<em><b>From Decision To Boudary</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gcml.Boundary#getToDecision <em>To Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Decision To Boudary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Decision To Boudary</em>' reference.
	 * @see #setFromDecisionToBoudary(Boundary)
	 * @see gcml.GcmlPackage#getDecision_FromDecisionToBoudary()
	 * @see gcml.Boundary#getToDecision
	 * @model opposite="toDecision"
	 * @generated
	 */
	Boundary getFromDecisionToBoudary();

	/**
	 * Sets the value of the '{@link gcml.Decision#getFromDecisionToBoudary <em>From Decision To Boudary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Decision To Boudary</em>' reference.
	 * @see #getFromDecisionToBoudary()
	 * @generated
	 */
	void setFromDecisionToBoudary(Boundary value);

	/**
	 * Returns the value of the '<em><b>From Decision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gcml.Call#getFromCall <em>From Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Decision</em>' reference.
	 * @see #setFromDecision(Call)
	 * @see gcml.GcmlPackage#getDecision_FromDecision()
	 * @see gcml.Call#getFromCall
	 * @model opposite="fromCall"
	 * @generated
	 */
	Call getFromDecision();

	/**
	 * Sets the value of the '{@link gcml.Decision#getFromDecision <em>From Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Decision</em>' reference.
	 * @see #getFromDecision()
	 * @generated
	 */
	void setFromDecision(Call value);

} // Decision
