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
 *   <li>{@link gcml.Call#getConnections <em>Connections</em>}</li>
 *   <li>{@link gcml.Call#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link gcml.Call#getToBoundary <em>To Boundary</em>}</li>
 *   <li>{@link gcml.Call#getFromCall <em>From Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getCall()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Call extends Activity {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see gcml.GcmlPackage#getCall_Connections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' attribute.
	 * @see #setOutcome(int)
	 * @see gcml.GcmlPackage#getCall_Outcome()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getOutcome();

	/**
	 * Sets the value of the '{@link gcml.Call#getOutcome <em>Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' attribute.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(int value);

	/**
	 * Returns the value of the '<em><b>To Boundary</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gcml.Boundary#getToCall <em>To Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Boundary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Boundary</em>' reference.
	 * @see #setToBoundary(Boundary)
	 * @see gcml.GcmlPackage#getCall_ToBoundary()
	 * @see gcml.Boundary#getToCall
	 * @model opposite="toCall"
	 * @generated
	 */
	Boundary getToBoundary();

	/**
	 * Sets the value of the '{@link gcml.Call#getToBoundary <em>To Boundary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Boundary</em>' reference.
	 * @see #getToBoundary()
	 * @generated
	 */
	void setToBoundary(Boundary value);

	/**
	 * Returns the value of the '<em><b>From Call</b></em>' reference list.
	 * The list contents are of type {@link gcml.Decision}.
	 * It is bidirectional and its opposite is '{@link gcml.Decision#getFromDecision <em>From Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Call</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Call</em>' reference list.
	 * @see gcml.GcmlPackage#getCall_FromCall()
	 * @see gcml.Decision#getFromDecision
	 * @model opposite="fromDecision" upper="2"
	 * @generated
	 */
	EList<Decision> getFromCall();

} // Call
