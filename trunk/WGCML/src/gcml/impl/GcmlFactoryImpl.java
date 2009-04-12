/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GcmlFactoryImpl extends EFactoryImpl implements GcmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GcmlFactory init() {
		try {
			GcmlFactory theGcmlFactory = (GcmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://gcml.model"); 
			if (theGcmlFactory != null) {
				return theGcmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GcmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GcmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GcmlPackage.CONNECTION: return (EObject)createConnection();
			case GcmlPackage.DEVICE: return (EObject)createDevice();
			case GcmlPackage.FORM: return (EObject)createForm();
			case GcmlPackage.WGCML: return (EObject)createwgcml();
			case GcmlPackage.IS_ATTACHED: return (EObject)createIsAttached();
			case GcmlPackage.MEDIUM: return (EObject)createMedium();
			case GcmlPackage.PERSON: return (EObject)createPerson();
			case GcmlPackage.BOUNDARY: return (EObject)createBoundary();
			case GcmlPackage.CALL: return (EObject)createCall();
			case GcmlPackage.ACTIVITIES: return (EObject)createActivities();
			case GcmlPackage.DECISION: return (EObject)createDecision();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GcmlPackage.ACTION:
				return createActionFromString(eDataType, initialValue);
			case GcmlPackage.CAPABILITY:
				return createCapabilityFromString(eDataType, initialValue);
			case GcmlPackage.BOUNDARY_TYPE:
				return createBoundaryTypeFromString(eDataType, initialValue);
			case GcmlPackage.ACTION_OBJECT:
				return createActionObjectFromString(eDataType, initialValue);
			case GcmlPackage.CAPABILITY_OBJECT:
				return createCapabilityObjectFromString(eDataType, initialValue);
			case GcmlPackage.BOUNDARY_TYPE_OBJECT:
				return createBoundaryTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GcmlPackage.ACTION:
				return convertActionToString(eDataType, instanceValue);
			case GcmlPackage.CAPABILITY:
				return convertCapabilityToString(eDataType, instanceValue);
			case GcmlPackage.BOUNDARY_TYPE:
				return convertBoundaryTypeToString(eDataType, instanceValue);
			case GcmlPackage.ACTION_OBJECT:
				return convertActionObjectToString(eDataType, instanceValue);
			case GcmlPackage.CAPABILITY_OBJECT:
				return convertCapabilityObjectToString(eDataType, instanceValue);
			case GcmlPackage.BOUNDARY_TYPE_OBJECT:
				return convertBoundaryTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wgcml createwgcml() {
		wgcmlImpl wgcml = new wgcmlImpl();
		return wgcml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAttached createIsAttached() {
		IsAttachedImpl isAttached = new IsAttachedImpl();
		return isAttached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medium createMedium() {
		MediumImpl medium = new MediumImpl();
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary createBoundary() {
		BoundaryImpl boundary = new BoundaryImpl();
		return boundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activities createActivities() {
		ActivitiesImpl activities = new ActivitiesImpl();
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createActionFromString(EDataType eDataType, String initialValue) {
		Action result = Action.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapabilityFromString(EDataType eDataType, String initialValue) {
		Capability result = Capability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryType createBoundaryTypeFromString(EDataType eDataType, String initialValue) {
		BoundaryType result = BoundaryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoundaryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createActionObjectFromString(EDataType eDataType, String initialValue) {
		return createActionFromString(GcmlPackage.Literals.ACTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionToString(GcmlPackage.Literals.ACTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapabilityObjectFromString(EDataType eDataType, String initialValue) {
		return createCapabilityFromString(GcmlPackage.Literals.CAPABILITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCapabilityToString(GcmlPackage.Literals.CAPABILITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryType createBoundaryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBoundaryTypeFromString(GcmlPackage.Literals.BOUNDARY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoundaryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBoundaryTypeToString(GcmlPackage.Literals.BOUNDARY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GcmlPackage getGcmlPackage() {
		return (GcmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GcmlPackage getPackage() {
		return GcmlPackage.eINSTANCE;
	}

} //GcmlFactoryImpl
