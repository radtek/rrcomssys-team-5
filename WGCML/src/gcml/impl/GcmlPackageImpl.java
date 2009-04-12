/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Action;
import gcml.Activities;
import gcml.Activity;
import gcml.Boundary;
import gcml.BoundaryType;
import gcml.Call;
import gcml.Capability;
import gcml.Connection;
import gcml.Decision;
import gcml.Device;
import gcml.Form;
import gcml.GcmlFactory;
import gcml.GcmlPackage;
import gcml.IsAttached;
import gcml.Medium;
import gcml.Person;
import gcml.wgcml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GcmlPackageImpl extends EPackageImpl implements GcmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wgcmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isAttachedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum capabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum boundaryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType actionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType capabilityObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType boundaryTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gcml.GcmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GcmlPackageImpl() {
		super(eNS_URI, GcmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GcmlPackage init() {
		if (isInited) return (GcmlPackage)EPackage.Registry.INSTANCE.getEPackage(GcmlPackage.eNS_URI);

		// Obtain or create and register package
		GcmlPackageImpl theGcmlPackage = (GcmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof GcmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new GcmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGcmlPackage.createPackageContents();

		// Initialize created meta-data
		theGcmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGcmlPackage.freeze();

		return theGcmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Bandwidth() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_FromDevice() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_ConnectionID() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_DeviceCapability() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_FromIsAttached() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_IsLocal() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_IsVirtual() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_ToConnection() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Action() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_FormDataType() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_FormName() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_SuggestedApplication() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_ToConnection() {
		return (EReference)formEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_ToParentForm() {
		return (EReference)formEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_VoiceCommand() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwgcml() {
		return wgcmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwgcml_Connection() {
		return (EReference)wgcmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwgcml_Medium() {
		return (EReference)wgcmlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwgcml_Form() {
		return (EReference)wgcmlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwgcml_Person() {
		return (EReference)wgcmlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwgcml_IsAttached() {
		return (EReference)wgcmlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwgcml_Device() {
		return (EReference)wgcmlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwgcml_Activities() {
		return (EReference)wgcmlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsAttached() {
		return isAttachedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsAttached_FromPerson() {
		return (EReference)isAttachedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsAttached_ToDevice() {
		return (EReference)isAttachedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedium() {
		return mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_MediumDataType() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_MediumName() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_SuggestedApplication() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedium_ToConnection() {
		return (EReference)mediumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedium_ToForm() {
		return (EReference)mediumEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_VoiceCommand() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PersonID() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PersonName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PersonRole() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_ToIsAttached() {
		return (EReference)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_ActivityId() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundary() {
		return boundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundary_Name() {
		return (EAttribute)boundaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundary_Outcome() {
		return (EAttribute)boundaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundary_Type() {
		return (EAttribute)boundaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundary_ToCall() {
		return (EReference)boundaryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundary_ToDecision() {
		return (EReference)boundaryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_Connections() {
		return (EReference)callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCall_Outcome() {
		return (EAttribute)callEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_ToBoundary() {
		return (EReference)callEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_FromCall() {
		return (EReference)callEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivities() {
		return activitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivities_ActivityItem() {
		return (EReference)activitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_SourceActivityID() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_SuccessPathID() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_AlternatePathID() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Outcome() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_FromDecisionToBoudary() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_FromDecision() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAction() {
		return actionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCapability() {
		return capabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBoundaryType() {
		return boundaryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActionObject() {
		return actionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCapabilityObject() {
		return capabilityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoundaryTypeObject() {
		return boundaryTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GcmlFactory getGcmlFactory() {
		return (GcmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__BANDWIDTH);
		createEReference(connectionEClass, CONNECTION__FROM_DEVICE);
		createEAttribute(connectionEClass, CONNECTION__CONNECTION_ID);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__DEVICE_CAPABILITY);
		createEReference(deviceEClass, DEVICE__FROM_IS_ATTACHED);
		createEAttribute(deviceEClass, DEVICE__IS_LOCAL);
		createEAttribute(deviceEClass, DEVICE__IS_VIRTUAL);
		createEReference(deviceEClass, DEVICE__TO_CONNECTION);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__ACTION);
		createEAttribute(formEClass, FORM__FORM_DATA_TYPE);
		createEAttribute(formEClass, FORM__FORM_NAME);
		createEAttribute(formEClass, FORM__SUGGESTED_APPLICATION);
		createEReference(formEClass, FORM__TO_CONNECTION);
		createEReference(formEClass, FORM__TO_PARENT_FORM);
		createEAttribute(formEClass, FORM__VOICE_COMMAND);

		wgcmlEClass = createEClass(WGCML);
		createEReference(wgcmlEClass, WGCML__CONNECTION);
		createEReference(wgcmlEClass, WGCML__MEDIUM);
		createEReference(wgcmlEClass, WGCML__FORM);
		createEReference(wgcmlEClass, WGCML__PERSON);
		createEReference(wgcmlEClass, WGCML__IS_ATTACHED);
		createEReference(wgcmlEClass, WGCML__DEVICE);
		createEReference(wgcmlEClass, WGCML__ACTIVITIES);

		isAttachedEClass = createEClass(IS_ATTACHED);
		createEReference(isAttachedEClass, IS_ATTACHED__FROM_PERSON);
		createEReference(isAttachedEClass, IS_ATTACHED__TO_DEVICE);

		mediumEClass = createEClass(MEDIUM);
		createEAttribute(mediumEClass, MEDIUM__MEDIUM_DATA_TYPE);
		createEAttribute(mediumEClass, MEDIUM__MEDIUM_NAME);
		createEAttribute(mediumEClass, MEDIUM__SUGGESTED_APPLICATION);
		createEReference(mediumEClass, MEDIUM__TO_CONNECTION);
		createEReference(mediumEClass, MEDIUM__TO_FORM);
		createEAttribute(mediumEClass, MEDIUM__VOICE_COMMAND);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__PERSON_ID);
		createEAttribute(personEClass, PERSON__PERSON_NAME);
		createEAttribute(personEClass, PERSON__PERSON_ROLE);
		createEReference(personEClass, PERSON__TO_IS_ATTACHED);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__ACTIVITY_ID);

		boundaryEClass = createEClass(BOUNDARY);
		createEAttribute(boundaryEClass, BOUNDARY__NAME);
		createEAttribute(boundaryEClass, BOUNDARY__OUTCOME);
		createEAttribute(boundaryEClass, BOUNDARY__TYPE);
		createEReference(boundaryEClass, BOUNDARY__TO_CALL);
		createEReference(boundaryEClass, BOUNDARY__TO_DECISION);

		callEClass = createEClass(CALL);
		createEReference(callEClass, CALL__CONNECTIONS);
		createEAttribute(callEClass, CALL__OUTCOME);
		createEReference(callEClass, CALL__TO_BOUNDARY);
		createEReference(callEClass, CALL__FROM_CALL);

		activitiesEClass = createEClass(ACTIVITIES);
		createEReference(activitiesEClass, ACTIVITIES__ACTIVITY_ITEM);

		decisionEClass = createEClass(DECISION);
		createEAttribute(decisionEClass, DECISION__SOURCE_ACTIVITY_ID);
		createEAttribute(decisionEClass, DECISION__SUCCESS_PATH_ID);
		createEAttribute(decisionEClass, DECISION__ALTERNATE_PATH_ID);
		createEAttribute(decisionEClass, DECISION__OUTCOME);
		createEReference(decisionEClass, DECISION__FROM_DECISION_TO_BOUDARY);
		createEReference(decisionEClass, DECISION__FROM_DECISION);

		// Create enums
		actionEEnum = createEEnum(ACTION);
		capabilityEEnum = createEEnum(CAPABILITY);
		boundaryTypeEEnum = createEEnum(BOUNDARY_TYPE);

		// Create data types
		actionObjectEDataType = createEDataType(ACTION_OBJECT);
		capabilityObjectEDataType = createEDataType(CAPABILITY_OBJECT);
		boundaryTypeObjectEDataType = createEDataType(BOUNDARY_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boundaryEClass.getESuperTypes().add(this.getActivity());
		callEClass.getESuperTypes().add(this.getActivity());
		decisionEClass.getESuperTypes().add(this.getActivity());

		// Initialize classes and features; add operations and parameters
		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Bandwidth(), theXMLTypePackage.getString(), "bandwidth", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_FromDevice(), this.getDevice(), this.getDevice_ToConnection(), "fromDevice", null, 1, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_ConnectionID(), theXMLTypePackage.getString(), "connectionID", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_DeviceCapability(), this.getCapability(), "deviceCapability", "TextFile", 1, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_FromIsAttached(), this.getIsAttached(), this.getIsAttached_ToDevice(), "fromIsAttached", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_IsLocal(), theXMLTypePackage.getBoolean(), "isLocal", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_IsVirtual(), theXMLTypePackage.getBoolean(), "isVirtual", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_ToConnection(), this.getConnection(), this.getConnection_FromDevice(), "toConnection", null, 1, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Action(), this.getAction(), "action", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_FormDataType(), theXMLTypePackage.getString(), "formDataType", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_FormName(), theXMLTypePackage.getString(), "formName", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_SuggestedApplication(), theXMLTypePackage.getString(), "suggestedApplication", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_ToConnection(), this.getConnection(), null, "toConnection", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_ToParentForm(), this.getForm(), null, "toParentForm", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_VoiceCommand(), theXMLTypePackage.getString(), "voiceCommand", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wgcmlEClass, wgcml.class, "wgcml", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getwgcml_Connection(), this.getConnection(), null, "connection", null, 0, -1, wgcml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwgcml_Medium(), this.getMedium(), null, "medium", null, 0, -1, wgcml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwgcml_Form(), this.getForm(), null, "form", null, 0, -1, wgcml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwgcml_Person(), this.getPerson(), null, "person", null, 0, -1, wgcml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwgcml_IsAttached(), this.getIsAttached(), null, "isAttached", null, 0, -1, wgcml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwgcml_Device(), this.getDevice(), null, "device", null, 0, -1, wgcml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwgcml_Activities(), this.getActivities(), null, "activities", null, 1, 1, wgcml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isAttachedEClass, IsAttached.class, "IsAttached", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsAttached_FromPerson(), this.getPerson(), this.getPerson_ToIsAttached(), "fromPerson", null, 1, 1, IsAttached.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsAttached_ToDevice(), this.getDevice(), this.getDevice_FromIsAttached(), "toDevice", null, 1, 1, IsAttached.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediumEClass, Medium.class, "Medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedium_MediumDataType(), this.getCapability(), "mediumDataType", "", 1, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedium_MediumName(), theXMLTypePackage.getString(), "mediumName", null, 0, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedium_SuggestedApplication(), theXMLTypePackage.getString(), "suggestedApplication", null, 0, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedium_ToConnection(), this.getConnection(), null, "toConnection", null, 0, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedium_ToForm(), this.getForm(), null, "toForm", null, 0, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedium_VoiceCommand(), theXMLTypePackage.getString(), "voiceCommand", null, 0, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_PersonID(), theXMLTypePackage.getString(), "personID", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PersonName(), theXMLTypePackage.getString(), "personName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PersonRole(), theXMLTypePackage.getString(), "personRole", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_ToIsAttached(), this.getIsAttached(), this.getIsAttached_FromPerson(), "toIsAttached", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_ActivityId(), theXMLTypePackage.getInteger(), "ActivityId", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundaryEClass, Boundary.class, "Boundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundary_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Boundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundary_Outcome(), theXMLTypePackage.getInteger(), "outcome", null, 0, 1, Boundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundary_Type(), this.getBoundaryType(), "type", null, 0, 1, Boundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundary_ToCall(), this.getCall(), this.getCall_ToBoundary(), "toCall", null, 0, 1, Boundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundary_ToDecision(), this.getDecision(), this.getDecision_FromDecisionToBoudary(), "toDecision", null, 0, 1, Boundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCall_Connections(), this.getConnection(), null, "connections", null, 1, -1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCall_Outcome(), theXMLTypePackage.getInt(), "outcome", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCall_ToBoundary(), this.getBoundary(), this.getBoundary_ToCall(), "toBoundary", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCall_FromCall(), this.getDecision(), this.getDecision_FromDecision(), "fromCall", null, 0, 2, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitiesEClass, Activities.class, "Activities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivities_ActivityItem(), this.getActivity(), null, "ActivityItem", null, 2, -1, Activities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecision_SourceActivityID(), theXMLTypePackage.getInteger(), "sourceActivityID", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_SuccessPathID(), theXMLTypePackage.getInteger(), "successPathID", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_AlternatePathID(), theXMLTypePackage.getInteger(), "alternatePathID", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Outcome(), theXMLTypePackage.getBoolean(), "outcome", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_FromDecisionToBoudary(), this.getBoundary(), this.getBoundary_ToDecision(), "fromDecisionToBoudary", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_FromDecision(), this.getCall(), this.getCall_FromCall(), "fromDecision", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(actionEEnum, Action.class, "Action");
		addEEnumLiteral(actionEEnum, Action.SEND);
		addEEnumLiteral(actionEEnum, Action.DO_NOT_SEND);
		addEEnumLiteral(actionEEnum, Action.START);

		initEEnum(capabilityEEnum, Capability.class, "Capability");
		addEEnumLiteral(capabilityEEnum, Capability.TEXT_FILE);
		addEEnumLiteral(capabilityEEnum, Capability.BINARY_FILE);
		addEEnumLiteral(capabilityEEnum, Capability.STREAM_FILE);
		addEEnumLiteral(capabilityEEnum, Capability.NON_STREAM_FILE);
		addEEnumLiteral(capabilityEEnum, Capability.AUDIO_FILE);
		addEEnumLiteral(capabilityEEnum, Capability.VIDEO_FILE);
		addEEnumLiteral(capabilityEEnum, Capability.AV_FILE);
		addEEnumLiteral(capabilityEEnum, Capability.TEXT);
		addEEnumLiteral(capabilityEEnum, Capability.LIVE_STREAM);
		addEEnumLiteral(capabilityEEnum, Capability.LIVE_AUDIO);
		addEEnumLiteral(capabilityEEnum, Capability.LIVE_VIDEO);
		addEEnumLiteral(capabilityEEnum, Capability.LIVE_AV);

		initEEnum(boundaryTypeEEnum, BoundaryType.class, "BoundaryType");
		addEEnumLiteral(boundaryTypeEEnum, BoundaryType.START);
		addEEnumLiteral(boundaryTypeEEnum, BoundaryType.END);

		// Initialize data types
		initEDataType(actionObjectEDataType, Action.class, "ActionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(capabilityObjectEDataType, Capability.class, "CapabilityObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(boundaryTypeObjectEDataType, BoundaryType.class, "BoundaryTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://java.sun.com/xml/ns/jaxb
		createJaxbAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://java.sun.com/xml/ns/jaxb</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJaxbAnnotations() {
		String source = "http://java.sun.com/xml/ns/jaxb";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "version", "2.0"
		   });																																														
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (actionEEnum, 
		   source, 
		   new String[] {
			 "name", "Action"
		   });		
		addAnnotation
		  (actionObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Action:Object",
			 "baseType", "Action"
		   });		
		addAnnotation
		  (capabilityEEnum, 
		   source, 
		   new String[] {
			 "name", "Capability"
		   });		
		addAnnotation
		  (capabilityObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Capability:Object",
			 "baseType", "Capability"
		   });		
		addAnnotation
		  (connectionEClass, 
		   source, 
		   new String[] {
			 "name", "Connection",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getConnection_Bandwidth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bandwidth"
		   });		
		addAnnotation
		  (getConnection_FromDevice(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromDevice"
		   });		
		addAnnotation
		  (deviceEClass, 
		   source, 
		   new String[] {
			 "name", "Device",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDevice_DeviceCapability(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deviceCapability"
		   });		
		addAnnotation
		  (getDevice_FromIsAttached(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromIsAttached"
		   });		
		addAnnotation
		  (getDevice_IsLocal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isLocal"
		   });		
		addAnnotation
		  (getDevice_IsVirtual(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isVirtual"
		   });		
		addAnnotation
		  (getDevice_ToConnection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toConnection"
		   });		
		addAnnotation
		  (formEClass, 
		   source, 
		   new String[] {
			 "name", "Form",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getForm_Action(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "action"
		   });		
		addAnnotation
		  (getForm_FormDataType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "formDataType"
		   });		
		addAnnotation
		  (getForm_FormName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "formName"
		   });		
		addAnnotation
		  (getForm_SuggestedApplication(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "suggestedApplication"
		   });		
		addAnnotation
		  (getForm_ToConnection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toConnection"
		   });		
		addAnnotation
		  (getForm_ToParentForm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toParentForm"
		   });		
		addAnnotation
		  (getForm_VoiceCommand(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "voiceCommand"
		   });		
		addAnnotation
		  (wgcmlEClass, 
		   source, 
		   new String[] {
			 "name", "Gcml",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getwgcml_Connection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connection"
		   });		
		addAnnotation
		  (getwgcml_Medium(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "medium"
		   });		
		addAnnotation
		  (getwgcml_Form(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "form"
		   });		
		addAnnotation
		  (getwgcml_Person(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "person"
		   });		
		addAnnotation
		  (getwgcml_IsAttached(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isAttached"
		   });		
		addAnnotation
		  (getwgcml_Device(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "device"
		   });		
		addAnnotation
		  (isAttachedEClass, 
		   source, 
		   new String[] {
			 "name", "IsAttached",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getIsAttached_FromPerson(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromPerson"
		   });		
		addAnnotation
		  (getIsAttached_ToDevice(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toDevice"
		   });		
		addAnnotation
		  (mediumEClass, 
		   source, 
		   new String[] {
			 "name", "Medium",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMedium_MediumDataType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mediumDataType"
		   });		
		addAnnotation
		  (getMedium_MediumName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mediumName"
		   });		
		addAnnotation
		  (getMedium_SuggestedApplication(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "suggestedApplication"
		   });		
		addAnnotation
		  (getMedium_ToConnection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toConnection"
		   });		
		addAnnotation
		  (getMedium_ToForm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toForm"
		   });		
		addAnnotation
		  (getMedium_VoiceCommand(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "voiceCommand"
		   });		
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "name", "Person",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPerson_PersonID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "personID"
		   });		
		addAnnotation
		  (getPerson_PersonName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "personName"
		   });		
		addAnnotation
		  (getPerson_PersonRole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "personRole"
		   });		
		addAnnotation
		  (getPerson_ToIsAttached(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toIsAttached"
		   });		
		addAnnotation
		  (callEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (boundaryTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "BoundaryType:Object",
			 "baseType", "BoundaryType"
		   });		
		addAnnotation
		  (boundaryTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "BoundaryType"
		   });
	}

} //GcmlPackageImpl
