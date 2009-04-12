/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Activities;
import gcml.Connection;
import gcml.Device;
import gcml.Form;
import gcml.GcmlPackage;
import gcml.IsAttached;
import gcml.Medium;
import gcml.Person;
import gcml.wgcml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>wgcml</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.wgcmlImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link gcml.impl.wgcmlImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link gcml.impl.wgcmlImpl#getForm <em>Form</em>}</li>
 *   <li>{@link gcml.impl.wgcmlImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gcml.impl.wgcmlImpl#getIsAttached <em>Is Attached</em>}</li>
 *   <li>{@link gcml.impl.wgcmlImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link gcml.impl.wgcmlImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class wgcmlImpl extends CDOObjectImpl implements wgcml {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected wgcmlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.WGCML;
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
	@SuppressWarnings("unchecked")
	public EList<Connection> getConnection() {
		return (EList<Connection>)eGet(GcmlPackage.Literals.WGCML__CONNECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Medium> getMedium() {
		return (EList<Medium>)eGet(GcmlPackage.Literals.WGCML__MEDIUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Form> getForm() {
		return (EList<Form>)eGet(GcmlPackage.Literals.WGCML__FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Person> getPerson() {
		return (EList<Person>)eGet(GcmlPackage.Literals.WGCML__PERSON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IsAttached> getIsAttached() {
		return (EList<IsAttached>)eGet(GcmlPackage.Literals.WGCML__IS_ATTACHED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Device> getDevice() {
		return (EList<Device>)eGet(GcmlPackage.Literals.WGCML__DEVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activities getActivities() {
		return (Activities)eGet(GcmlPackage.Literals.WGCML__ACTIVITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivities(Activities newActivities) {
		eSet(GcmlPackage.Literals.WGCML__ACTIVITIES, newActivities);
	}

} //wgcmlImpl
