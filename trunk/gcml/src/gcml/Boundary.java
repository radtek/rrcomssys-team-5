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
	 * The default value is <code>""</code>.
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
	 * @model default="" required="true"
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
	 * Returns the value of the '<em><b>Boundary To Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary To Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary To Call</em>' reference.
	 * @see #setBoundaryToCall(Call)
	 * @see gcml.GcmlPackage#getBoundary_BoundaryToCall()
	 * @model
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
