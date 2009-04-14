/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Device;
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
 * An implementation of the model object '<em><b>Is Attached</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.IsAttachedImpl#getToDevice <em>To Device</em>}</li>
 *   <li>{@link gcml.impl.IsAttachedImpl#getFromPerson <em>From Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsAttachedImpl extends EObjectImpl implements IsAttached {
	/**
	 * The cached value of the '{@link #getToDevice() <em>To Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDevice()
	 * @generated
	 * @ordered
	 */
	protected Device toDevice;

	/**
	 * The cached value of the '{@link #getFromPerson() <em>From Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPerson()
	 * @generated
	 * @ordered
	 */
	protected Person fromPerson;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsAttachedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.IS_ATTACHED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getToDevice() {
		return toDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToDevice(Device newToDevice, NotificationChain msgs) {
		Device oldToDevice = toDevice;
		toDevice = newToDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GcmlPackage.IS_ATTACHED__TO_DEVICE, oldToDevice, newToDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDevice(Device newToDevice) {
		if (newToDevice != toDevice) {
			NotificationChain msgs = null;
			if (toDevice != null)
				msgs = ((InternalEObject)toDevice).eInverseRemove(this, GcmlPackage.DEVICE__FROM_IS_ATTACHED, Device.class, msgs);
			if (newToDevice != null)
				msgs = ((InternalEObject)newToDevice).eInverseAdd(this, GcmlPackage.DEVICE__FROM_IS_ATTACHED, Device.class, msgs);
			msgs = basicSetToDevice(newToDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.IS_ATTACHED__TO_DEVICE, newToDevice, newToDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getFromPerson() {
		if (fromPerson != null && fromPerson.eIsProxy()) {
			InternalEObject oldFromPerson = (InternalEObject)fromPerson;
			fromPerson = (Person)eResolveProxy(oldFromPerson);
			if (fromPerson != oldFromPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.IS_ATTACHED__FROM_PERSON, oldFromPerson, fromPerson));
			}
		}
		return fromPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetFromPerson() {
		return fromPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromPerson(Person newFromPerson, NotificationChain msgs) {
		Person oldFromPerson = fromPerson;
		fromPerson = newFromPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GcmlPackage.IS_ATTACHED__FROM_PERSON, oldFromPerson, newFromPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPerson(Person newFromPerson) {
		if (newFromPerson != fromPerson) {
			NotificationChain msgs = null;
			if (fromPerson != null)
				msgs = ((InternalEObject)fromPerson).eInverseRemove(this, GcmlPackage.PERSON__TO_IS_ATTACHED, Person.class, msgs);
			if (newFromPerson != null)
				msgs = ((InternalEObject)newFromPerson).eInverseAdd(this, GcmlPackage.PERSON__TO_IS_ATTACHED, Person.class, msgs);
			msgs = basicSetFromPerson(newFromPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.IS_ATTACHED__FROM_PERSON, newFromPerson, newFromPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GcmlPackage.IS_ATTACHED__TO_DEVICE:
				if (toDevice != null)
					msgs = ((InternalEObject)toDevice).eInverseRemove(this, GcmlPackage.DEVICE__FROM_IS_ATTACHED, Device.class, msgs);
				return basicSetToDevice((Device)otherEnd, msgs);
			case GcmlPackage.IS_ATTACHED__FROM_PERSON:
				if (fromPerson != null)
					msgs = ((InternalEObject)fromPerson).eInverseRemove(this, GcmlPackage.PERSON__TO_IS_ATTACHED, Person.class, msgs);
				return basicSetFromPerson((Person)otherEnd, msgs);
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
			case GcmlPackage.IS_ATTACHED__TO_DEVICE:
				return basicSetToDevice(null, msgs);
			case GcmlPackage.IS_ATTACHED__FROM_PERSON:
				return basicSetFromPerson(null, msgs);
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
			case GcmlPackage.IS_ATTACHED__TO_DEVICE:
				return getToDevice();
			case GcmlPackage.IS_ATTACHED__FROM_PERSON:
				if (resolve) return getFromPerson();
				return basicGetFromPerson();
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
			case GcmlPackage.IS_ATTACHED__TO_DEVICE:
				setToDevice((Device)newValue);
				return;
			case GcmlPackage.IS_ATTACHED__FROM_PERSON:
				setFromPerson((Person)newValue);
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
			case GcmlPackage.IS_ATTACHED__TO_DEVICE:
				setToDevice((Device)null);
				return;
			case GcmlPackage.IS_ATTACHED__FROM_PERSON:
				setFromPerson((Person)null);
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
			case GcmlPackage.IS_ATTACHED__TO_DEVICE:
				return toDevice != null;
			case GcmlPackage.IS_ATTACHED__FROM_PERSON:
				return fromPerson != null;
		}
		return super.eIsSet(featureID);
	}

} //IsAttachedImpl
