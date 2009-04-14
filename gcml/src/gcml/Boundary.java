/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Boundary#getType <em>Type</em>}</li>
 *   <li>{@link gcml.Boundary#isOutcome <em>Outcome</em>}</li>
 *   <li>{@link gcml.Boundary#getBoundaryToCall <em>Boundary To Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getBoundary()
 * @model
 * @generated
 */
public interface Boundary extends Activity {
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
	 * Returns the value of the '<em><b>Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' attribute.
	 * @see #setOutcome(boolean)
	 * @see gcml.GcmlPackage#getBoundary_Outcome()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isOutcome();

	/**
	 * Sets the value of the '{@link gcml.Boundary#isOutcome <em>Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' attribute.
	 * @see #isOutcome()
	 * @generated
	 */
	void setOutcome(boolean value);

	/**
	 * Returns the value of the '<em><b>Boundary To Call</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gcml.Call#getCallToBoundary <em>Call To Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary To Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary To Call</em>' reference.
	 * @see #setBoundaryToCall(Call)
	 * @see gcml.GcmlPackage#getBoundary_BoundaryToCall()
	 * @see gcml.Call#getCallToBoundary
	 * @model opposite="CallToBoundary"
	 * @generated
	 */
	Call getBoundaryToCall();

	/**
	 * Sets the value of the '{@link gcml.Boundary#getBoundaryToCall <em>Boundary To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary To Call</em>' reference.
	 * @see #getBoundaryToCall()
	 * @generated
	 */
	void setBoundaryToCall(Call value);

} // Boundary
