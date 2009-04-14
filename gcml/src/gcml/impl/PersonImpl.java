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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getPersonID() <em>Person ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonID()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonID() <em>Person ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonID()
	 * @generated
	 * @ordered
	 */
	protected String personID = PERSON_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersonName() <em>Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonName()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonName() <em>Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonName()
	 * @generated
	 * @ordered
	 */
	protected String personName = PERSON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersonRole() <em>Person Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonRole()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonRole() <em>Person Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonRole()
	 * @generated
	 * @ordered
	 */
	protected String personRole = PERSON_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToIsAttached() <em>To Is Attached</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToIsAttached()
	 * @generated
	 * @ordered
	 */
	protected IsAttached toIsAttached;

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
	public String getPersonID() {
		return personID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonID(String newPersonID) {
		String oldPersonID = personID;
		personID = newPersonID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.PERSON__PERSON_ID, oldPersonID, personID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonName(String newPersonName) {
		String oldPersonName = personName;
		personName = newPersonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.PERSON__PERSON_NAME, oldPersonName, personName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonRole() {
		return personRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonRole(String newPersonRole) {
		String oldPersonRole = personRole;
		personRole = newPersonRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.PERSON__PERSON_ROLE, oldPersonRole, personRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAttached getToIsAttached() {
		if (toIsAttached != null && toIsAttached.eIsProxy()) {
			InternalEObject oldToIsAttached = (InternalEObject)toIsAttached;
			toIsAttached = (IsAttached)eResolveProxy(oldToIsAttached);
			if (toIsAttached != oldToIsAttached) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.PERSON__TO_IS_ATTACHED, oldToIsAttached, toIsAttached));
			}
		}
		return toIsAttached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAttached basicGetToIsAttached() {
		return toIsAttached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToIsAttached(IsAttached newToIsAttached, NotificationChain msgs) {
		IsAttached oldToIsAttached = toIsAttached;
		toIsAttached = newToIsAttached;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GcmlPackage.PERSON__TO_IS_ATTACHED, oldToIsAttached, newToIsAttached);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToIsAttached(IsAttached newToIsAttached) {
		if (newToIsAttached != toIsAttached) {
			NotificationChain msgs = null;
			if (toIsAttached != null)
				msgs = ((InternalEObject)toIsAttached).eInverseRemove(this, GcmlPackage.IS_ATTACHED__FROM_PERSON, IsAttached.class, msgs);
			if (newToIsAttached != null)
				msgs = ((InternalEObject)newToIsAttached).eInverseAdd(this, GcmlPackage.IS_ATTACHED__FROM_PERSON, IsAttached.class, msgs);
			msgs = basicSetToIsAttached(newToIsAttached, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.PERSON__TO_IS_ATTACHED, newToIsAttached, newToIsAttached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GcmlPackage.PERSON__TO_IS_ATTACHED:
				if (toIsAttached != null)
					msgs = ((InternalEObject)toIsAttached).eInverseRemove(this, GcmlPackage.IS_ATTACHED__FROM_PERSON, IsAttached.class, msgs);
				return basicSetToIsAttached((IsAttached)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GcmlPackage.PERSON__TO_IS_ATTACHED:
				return basicSetToIsAttached(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcmlPackage.PERSON__PERSON_ID:
				return getPersonID();
			case GcmlPackage.PERSON__PERSON_NAME:
				return getPersonName();
			case GcmlPackage.PERSON__PERSON_ROLE:
				return getPersonRole();
			case GcmlPackage.PERSON__TO_IS_ATTACHED:
				if (resolve) return getToIsAttached();
				return basicGetToIsAttached();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GcmlPackage.PERSON__PERSON_ID:
				setPersonID((String)newValue);
				return;
			case GcmlPackage.PERSON__PERSON_NAME:
				setPersonName((String)newValue);
				return;
			case GcmlPackage.PERSON__PERSON_ROLE:
				setPersonRole((String)newValue);
				return;
			case GcmlPackage.PERSON__TO_IS_ATTACHED:
				setToIsAttached((IsAttached)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GcmlPackage.PERSON__PERSON_ID:
				setPersonID(PERSON_ID_EDEFAULT);
				return;
			case GcmlPackage.PERSON__PERSON_NAME:
				setPersonName(PERSON_NAME_EDEFAULT);
				return;
			case GcmlPackage.PERSON__PERSON_ROLE:
				setPersonRole(PERSON_ROLE_EDEFAULT);
				return;
			case GcmlPackage.PERSON__TO_IS_ATTACHED:
				setToIsAttached((IsAttached)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GcmlPackage.PERSON__PERSON_ID:
				return PERSON_ID_EDEFAULT == null ? personID != null : !PERSON_ID_EDEFAULT.equals(personID);
			case GcmlPackage.PERSON__PERSON_NAME:
				return PERSON_NAME_EDEFAULT == null ? personName != null : !PERSON_NAME_EDEFAULT.equals(personName);
			case GcmlPackage.PERSON__PERSON_ROLE:
				return PERSON_ROLE_EDEFAULT == null ? personRole != null : !PERSON_ROLE_EDEFAULT.equals(personRole);
			case GcmlPackage.PERSON__TO_IS_ATTACHED:
				return toIsAttached != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (personID: ");
		result.append(personID);
		result.append(", personName: ");
		result.append(personName);
		result.append(", personRole: ");
		result.append(personRole);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
