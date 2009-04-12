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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Attached</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.IsAttachedImpl#getFromPerson <em>From Person</em>}</li>
 *   <li>{@link gcml.impl.IsAttachedImpl#getToDevice <em>To Device</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsAttachedImpl extends CDOObjectImpl implements IsAttached {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getFromPerson() {
		return (Person)eGet(GcmlPackage.Literals.IS_ATTACHED__FROM_PERSON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPerson(Person newFromPerson) {
		eSet(GcmlPackage.Literals.IS_ATTACHED__FROM_PERSON, newFromPerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getToDevice() {
		return (Device)eGet(GcmlPackage.Literals.IS_ATTACHED__TO_DEVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDevice(Device newToDevice) {
		eSet(GcmlPackage.Literals.IS_ATTACHED__TO_DEVICE, newToDevice);
	}

} //IsAttachedImpl
