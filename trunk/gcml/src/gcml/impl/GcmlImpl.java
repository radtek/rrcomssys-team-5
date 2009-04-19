/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Boundary;
import gcml.Call;
import gcml.Activity;
import gcml.Connection;
import gcml.Decision;
import gcml.Device;
import gcml.Form;
import gcml.Gcml;
import gcml.GcmlPackage;
import gcml.IsAttached;
import gcml.Medium;
import gcml.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gcml</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.GcmlImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link gcml.impl.GcmlImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link gcml.impl.GcmlImpl#getForm <em>Form</em>}</li>
 *   <li>{@link gcml.impl.GcmlImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gcml.impl.GcmlImpl#getIsAttached <em>Is Attached</em>}</li>
 *   <li>{@link gcml.impl.GcmlImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link gcml.impl.GcmlImpl#getCall <em>Call</em>}</li>
 *   <li>{@link gcml.impl.GcmlImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link gcml.impl.GcmlImpl#getBoundary <em>Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GcmlImpl extends EObjectImpl implements Gcml {
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The cached value of the '{@link #getMedium() <em>Medium</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected EList<Medium> medium;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> form;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> person;

	/**
	 * The cached value of the '{@link #getIsAttached() <em>Is Attached</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAttached()
	 * @generated
	 * @ordered
	 */
	protected EList<IsAttached> isAttached;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> device;

	/**
	 * The cached value of the '{@link #getCall() <em>Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCall()
	 * @generated
	 * @ordered
	 */
	protected EList<Call> call;

	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<Decision> decision;

	/**
	 * The cached value of the '{@link #getBoundary() <em>Boundary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected EList<Boundary> boundary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GcmlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.GCML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, GcmlPackage.GCML__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Medium> getMedium() {
		if (medium == null) {
			medium = new EObjectContainmentEList<Medium>(Medium.class, this, GcmlPackage.GCML__MEDIUM);
		}
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getForm() {
		if (form == null) {
			form = new EObjectContainmentEList<Form>(Form.class, this, GcmlPackage.GCML__FORM);
		}
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<Person>(Person.class, this, GcmlPackage.GCML__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IsAttached> getIsAttached() {
		if (isAttached == null) {
			isAttached = new EObjectContainmentEList<IsAttached>(IsAttached.class, this, GcmlPackage.GCML__IS_ATTACHED);
		}
		return isAttached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Device>(Device.class, this, GcmlPackage.GCML__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Call> getCall() {
		if (call == null) {
			call = new EObjectContainmentEList<Call>(Call.class, this, GcmlPackage.GCML__CALL);
		}
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decision> getDecision() {
		if (decision == null) {
			decision = new EObjectContainmentEList<Decision>(Decision.class, this, GcmlPackage.GCML__DECISION);
		}
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boundary> getBoundary() {
		if (boundary == null) {
			boundary = new EObjectContainmentEList<Boundary>(Boundary.class, this, GcmlPackage.GCML__BOUNDARY);
		}
		return boundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GcmlPackage.GCML__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case GcmlPackage.GCML__MEDIUM:
				return ((InternalEList<?>)getMedium()).basicRemove(otherEnd, msgs);
			case GcmlPackage.GCML__FORM:
				return ((InternalEList<?>)getForm()).basicRemove(otherEnd, msgs);
			case GcmlPackage.GCML__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case GcmlPackage.GCML__IS_ATTACHED:
				return ((InternalEList<?>)getIsAttached()).basicRemove(otherEnd, msgs);
			case GcmlPackage.GCML__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case GcmlPackage.GCML__CALL:
				return ((InternalEList<?>)getCall()).basicRemove(otherEnd, msgs);
			case GcmlPackage.GCML__DECISION:
				return ((InternalEList<?>)getDecision()).basicRemove(otherEnd, msgs);
			case GcmlPackage.GCML__BOUNDARY:
				return ((InternalEList<?>)getBoundary()).basicRemove(otherEnd, msgs);
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
			case GcmlPackage.GCML__CONNECTION:
				return getConnection();
			case GcmlPackage.GCML__MEDIUM:
				return getMedium();
			case GcmlPackage.GCML__FORM:
				return getForm();
			case GcmlPackage.GCML__PERSON:
				return getPerson();
			case GcmlPackage.GCML__IS_ATTACHED:
				return getIsAttached();
			case GcmlPackage.GCML__DEVICE:
				return getDevice();
			case GcmlPackage.GCML__CALL:
				return getCall();
			case GcmlPackage.GCML__DECISION:
				return getDecision();
			case GcmlPackage.GCML__BOUNDARY:
				return getBoundary();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GcmlPackage.GCML__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case GcmlPackage.GCML__MEDIUM:
				getMedium().clear();
				getMedium().addAll((Collection<? extends Medium>)newValue);
				return;
			case GcmlPackage.GCML__FORM:
				getForm().clear();
				getForm().addAll((Collection<? extends Form>)newValue);
				return;
			case GcmlPackage.GCML__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends Person>)newValue);
				return;
			case GcmlPackage.GCML__IS_ATTACHED:
				getIsAttached().clear();
				getIsAttached().addAll((Collection<? extends IsAttached>)newValue);
				return;
			case GcmlPackage.GCML__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends Device>)newValue);
				return;
			case GcmlPackage.GCML__CALL:
				getCall().clear();
				getCall().addAll((Collection<? extends Call>)newValue);
				return;
			case GcmlPackage.GCML__DECISION:
				getDecision().clear();
				getDecision().addAll((Collection<? extends Decision>)newValue);
				return;
			case GcmlPackage.GCML__BOUNDARY:
				getBoundary().clear();
				getBoundary().addAll((Collection<? extends Boundary>)newValue);
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
			case GcmlPackage.GCML__CONNECTION:
				getConnection().clear();
				return;
			case GcmlPackage.GCML__MEDIUM:
				getMedium().clear();
				return;
			case GcmlPackage.GCML__FORM:
				getForm().clear();
				return;
			case GcmlPackage.GCML__PERSON:
				getPerson().clear();
				return;
			case GcmlPackage.GCML__IS_ATTACHED:
				getIsAttached().clear();
				return;
			case GcmlPackage.GCML__DEVICE:
				getDevice().clear();
				return;
			case GcmlPackage.GCML__CALL:
				getCall().clear();
				return;
			case GcmlPackage.GCML__DECISION:
				getDecision().clear();
				return;
			case GcmlPackage.GCML__BOUNDARY:
				getBoundary().clear();
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
			case GcmlPackage.GCML__CONNECTION:
				return connection != null && !connection.isEmpty();
			case GcmlPackage.GCML__MEDIUM:
				return medium != null && !medium.isEmpty();
			case GcmlPackage.GCML__FORM:
				return form != null && !form.isEmpty();
			case GcmlPackage.GCML__PERSON:
				return person != null && !person.isEmpty();
			case GcmlPackage.GCML__IS_ATTACHED:
				return isAttached != null && !isAttached.isEmpty();
			case GcmlPackage.GCML__DEVICE:
				return device != null && !device.isEmpty();
			case GcmlPackage.GCML__CALL:
				return call != null && !call.isEmpty();
			case GcmlPackage.GCML__DECISION:
				return decision != null && !decision.isEmpty();
			case GcmlPackage.GCML__BOUNDARY:
				return boundary != null && !boundary.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GcmlImpl
