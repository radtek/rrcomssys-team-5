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
 * A representation of the model object '<em><b>Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Boundary#getName <em>Name</em>}</li>
 *   <li>{@link gcml.Boundary#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link gcml.Boundary#getType <em>Type</em>}</li>
 *   <li>{@link gcml.Boundary#getToCall <em>To Call</em>}</li>
 *   <li>{@link gcml.Boundary#getToDecision <em>To Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getBoundary()
 * @model
 * @generated
 */
public interface Boundary extends Activity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gcml.GcmlPackage#getBoundary_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gcml.Boundary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' attribute.
	 * @see #setOutcome(BigInteger)
	 * @see gcml.GcmlPackage#getBoundary_Outcome()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getOutcome();

	/**
	 * Sets the value of the '{@link gcml.Boundary#getOutcome <em>Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' attribute.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gcml.BoundaryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gcml.BoundaryType
	 * @see #setType(BoundaryType)
	 * @see gcml.GcmlPackage#getBoundary_Type()
	 * @model
	 * @generated
	 */
	BoundaryType getType();

	/**
	 * Sets the value of the '{@link gcml.Boundary#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gcml.BoundaryType
	 * @see #getType()
	 * @generated
	 */
	void setType(BoundaryType value);

	/**
	 * Returns the value of the '<em><b>To Call</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gcml.Call#getToBoundary <em>To Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Call</em>' reference.
	 * @see #setToCall(Call)
	 * @see gcml.GcmlPackage#getBoundary_ToCall()
	 * @see gcml.Call#getToBoundary
	 * @model opposite="toBoundary"
	 * @generated
	 */
	Call getToCall();

	/**
	 * Sets the value of the '{@link gcml.Boundary#getToCall <em>To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Call</em>' reference.
	 * @see #getToCall()
	 * @generated
	 */
	void setToCall(Call value);

	/**
	 * Returns the value of the '<em><b>To Decision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gcml.Decision#getFromDecisionToBoudary <em>From Decision To Boudary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Decision</em>' reference.
	 * @see #setToDecision(Decision)
	 * @see gcml.GcmlPackage#getBoundary_ToDecision()
	 * @see gcml.Decision#getFromDecisionToBoudary
	 * @model opposite="fromDecisionToBoudary"
	 * @generated
	 */
	Decision getToDecision();

	/**
	 * Sets the value of the '{@link gcml.Boundary#getToDecision <em>To Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Decision</em>' reference.
	 * @see #getToDecision()
	 * @generated
	 */
	void setToDecision(Decision value);

} // Boundary
