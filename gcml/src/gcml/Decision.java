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
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Decision#getSourceActivityID <em>Source Activity ID</em>}</li>
 *   <li>{@link gcml.Decision#getSuccessPathID <em>Success Path ID</em>}</li>
 *   <li>{@link gcml.Decision#getFailPathID <em>Fail Path ID</em>}</li>
 *   <li>{@link gcml.Decision#getDecisionToCall <em>Decision To Call</em>}</li>
 *   <li>{@link gcml.Decision#getDecisionToBoundary <em>Decision To Boundary</em>}</li>
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
	 * @see #setSourceActivityID(String)
	 * @see gcml.GcmlPackage#getDecision_SourceActivityID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSourceActivityID();

	/**
	 * Sets the value of the '{@link gcml.Decision#getSourceActivityID <em>Source Activity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Activity ID</em>' attribute.
	 * @see #getSourceActivityID()
	 * @generated
	 */
	void setSourceActivityID(String value);

	/**
	 * Returns the value of the '<em><b>Success Path ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Path ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Path ID</em>' attribute.
	 * @see #setSuccessPathID(String)
	 * @see gcml.GcmlPackage#getDecision_SuccessPathID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSuccessPathID();

	/**
	 * Sets the value of the '{@link gcml.Decision#getSuccessPathID <em>Success Path ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Path ID</em>' attribute.
	 * @see #getSuccessPathID()
	 * @generated
	 */
	void setSuccessPathID(String value);

	/**
	 * Returns the value of the '<em><b>Fail Path ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail Path ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Path ID</em>' attribute.
	 * @see #setFailPathID(String)
	 * @see gcml.GcmlPackage#getDecision_FailPathID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFailPathID();

	/**
	 * Sets the value of the '{@link gcml.Decision#getFailPathID <em>Fail Path ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Path ID</em>' attribute.
	 * @see #getFailPathID()
	 * @generated
	 */
	void setFailPathID(String value);

	/**
	 * Returns the value of the '<em><b>Decision To Call</b></em>' reference list.
	 * The list contents are of type {@link gcml.Call}.
	 * It is bidirectional and its opposite is '{@link gcml.Call#getCallToDecision <em>Call To Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision To Call</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision To Call</em>' reference list.
	 * @see gcml.GcmlPackage#getDecision_DecisionToCall()
	 * @see gcml.Call#getCallToDecision
	 * @model opposite="CallToDecision" upper="2"
	 * @generated
	 */
	EList<Call> getDecisionToCall();

	/**
	 * Returns the value of the '<em><b>Decision To Boundary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision To Boundary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision To Boundary</em>' reference.
	 * @see #setDecisionToBoundary(Boundary)
	 * @see gcml.GcmlPackage#getDecision_DecisionToBoundary()
	 * @model
	 * @generated
	 */
	Boundary getDecisionToBoundary();

	/**
	 * Sets the value of the '{@link gcml.Decision#getDecisionToBoundary <em>Decision To Boundary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision To Boundary</em>' reference.
	 * @see #getDecisionToBoundary()
	 * @generated
	 */
	void setDecisionToBoundary(Boundary value);

} // Decision
