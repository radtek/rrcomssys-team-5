/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.GcmlPackage;
import gcml.IsAttached;
import gcml.Person;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.PersonImpl#getPersonID <em>Person ID</em>}</li>
 *   <li>{@link gcml.impl.PersonImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link gcml.impl.PersonImpl#getPersonRole <em>Person Role</em>}</li>
 *   <li>{@link gcml.impl.PersonImpl#getToIsAttached <em>To Is Attached</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends CDOObjectImpl implements Person {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonID() {
		return (String)eGet(GcmlPackage.Literals.PERSON__PERSON_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonID(String newPersonID) {
		eSet(GcmlPackage.Literals.PERSON__PERSON_ID, newPersonID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonName() {
		return (String)eGet(GcmlPackage.Literals.PERSON__PERSON_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonName(String newPersonName) {
		eSet(GcmlPackage.Literals.PERSON__PERSON_NAME, newPersonName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonRole() {
		return (String)eGet(GcmlPackage.Literals.PERSON__PERSON_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonRole(String newPersonRole) {
		eSet(GcmlPackage.Literals.PERSON__PERSON_ROLE, newPersonRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAttached getToIsAttached() {
		return (IsAttached)eGet(GcmlPackage.Literals.PERSON__TO_IS_ATTACHED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToIsAttached(IsAttached newToIsAttached) {
		eSet(GcmlPackage.Literals.PERSON__TO_IS_ATTACHED, newToIsAttached);
	}

} //PersonImpl
