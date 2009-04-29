/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Call#isOutcome <em>Outcome</em>}</li>
 *   <li>{@link gcml.Call#getCallToConnection <em>Call To Connection</em>}</li>
 *   <li>{@link gcml.Call#getCallToDecision <em>Call To Decision</em>}</li>
 *   <li>{@link gcml.Call#getCallToBoundary <em>Call To Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Activity {
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
	 * @see gcml.GcmlPackage#getCall_Outcome()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isOutcome();

	/**
	 * Sets the value of the '{@link gcml.Call#isOutcome <em>Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' attribute.
	 * @see #isOutcome()
	 * @generated
	 */
	void setOutcome(boolean value);

	/**
	 * Returns the value of the '<em><b>Call To Connection</b></em>' reference list.
	 * The list contents are of type {@link gcml.Connection}.
	 * It is bidirectional and its opposite is '{@link gcml.Connection#getConnectionToCall <em>Connection To Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call To Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call To Connection</em>' reference list.
	 * @see gcml.GcmlPackage#getCall_CallToConnection()
	 * @see gcml.Connection#getConnectionToCall
	 * @model opposite="ConnectionToCall" keys="connectionID"
	 * @generated
	 */
	EList<Connection> getCallToConnection();

	/**
	 * Returns the value of the '<em><b>Call To Decision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gcml.Decision#getDecisionToCall <em>Decision To Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call To Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call To Decision</em>' reference.
	 * @see #setCallToDecision(Decision)
	 * @see gcml.GcmlPackage#getCall_CallToDecision()
	 * @see gcml.Decision#getDecisionToCall
	 * @model opposite="DecisionToCall"
	 * @generated
	 */
	Decision getCallToDecision();

	/**
	 * Sets the value of the '{@link gcml.Call#getCallToDecision <em>Call To Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call To Decision</em>' reference.
	 * @see #getCallToDecision()
	 * @generated
	 */
	void setCallToDecision(Decision value);

	/**
	 * Returns the value of the '<em><b>Call To Boundary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call To Boundary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call To Boundary</em>' reference.
	 * @see #setCallToBoundary(Boundary)
	 * @see gcml.GcmlPackage#getCall_CallToBoundary()
	 * @model
	 * @generated
	 */
	Boundary getCallToBoundary();

	/**
	 * Sets the value of the '{@link gcml.Call#getCallToBoundary <em>Call To Boundary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call To Boundary</em>' reference.
	 * @see #getCallToBoundary()
	 * @generated
	 */
	void setCallToBoundary(Boundary value);

} // Call
