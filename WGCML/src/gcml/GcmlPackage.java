/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gcml.GcmlFactory
 * @model kind="package"
 *        annotation="http://java.sun.com/xml/ns/jaxb version='2.0'"
 * @generated
 */
public interface GcmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gcml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gcml.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GcmlPackage eINSTANCE = gcml.impl.GcmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link gcml.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.ConnectionImpl
	 * @see gcml.impl.GcmlPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BANDWIDTH = 0;

	/**
	 * The feature id for the '<em><b>From Device</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Connection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_ID = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gcml.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.DeviceImpl
	 * @see gcml.impl.GcmlPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Device Capability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICE_CAPABILITY = 0;

	/**
	 * The feature id for the '<em><b>From Is Attached</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__FROM_IS_ATTACHED = 1;

	/**
	 * The feature id for the '<em><b>Is Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__IS_LOCAL = 2;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__IS_VIRTUAL = 3;

	/**
	 * The feature id for the '<em><b>To Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TO_CONNECTION = 4;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link gcml.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.FormImpl
	 * @see gcml.impl.GcmlPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Form Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__FORM_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Form Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__FORM_NAME = 2;

	/**
	 * The feature id for the '<em><b>Suggested Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SUGGESTED_APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>To Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TO_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>To Parent Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TO_PARENT_FORM = 5;

	/**
	 * The feature id for the '<em><b>Voice Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VOICE_COMMAND = 6;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link gcml.impl.wgcmlImpl <em>wgcml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.wgcmlImpl
	 * @see gcml.impl.GcmlPackageImpl#getwgcml()
	 * @generated
	 */
	int WGCML = 3;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGCML__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Medium</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGCML__MEDIUM = 1;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGCML__FORM = 2;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGCML__PERSON = 3;

	/**
	 * The feature id for the '<em><b>Is Attached</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGCML__IS_ATTACHED = 4;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGCML__DEVICE = 5;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGCML__ACTIVITIES = 6;

	/**
	 * The number of structural features of the '<em>wgcml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGCML_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link gcml.impl.IsAttachedImpl <em>Is Attached</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.IsAttachedImpl
	 * @see gcml.impl.GcmlPackageImpl#getIsAttached()
	 * @generated
	 */
	int IS_ATTACHED = 4;

	/**
	 * The feature id for the '<em><b>From Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTACHED__FROM_PERSON = 0;

	/**
	 * The feature id for the '<em><b>To Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTACHED__TO_DEVICE = 1;

	/**
	 * The number of structural features of the '<em>Is Attached</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTACHED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gcml.impl.MediumImpl <em>Medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.MediumImpl
	 * @see gcml.impl.GcmlPackageImpl#getMedium()
	 * @generated
	 */
	int MEDIUM = 5;

	/**
	 * The feature id for the '<em><b>Medium Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__MEDIUM_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Medium Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__MEDIUM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Suggested Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__SUGGESTED_APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>To Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__TO_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>To Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__TO_FORM = 4;

	/**
	 * The feature id for the '<em><b>Voice Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__VOICE_COMMAND = 5;

	/**
	 * The number of structural features of the '<em>Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link gcml.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.PersonImpl
	 * @see gcml.impl.GcmlPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 6;

	/**
	 * The feature id for the '<em><b>Person ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_ID = 0;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_NAME = 1;

	/**
	 * The feature id for the '<em><b>Person Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_ROLE = 2;

	/**
	 * The feature id for the '<em><b>To Is Attached</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TO_IS_ATTACHED = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link gcml.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.ActivityImpl
	 * @see gcml.impl.GcmlPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIVITY_ID = 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gcml.impl.BoundaryImpl <em>Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.BoundaryImpl
	 * @see gcml.impl.GcmlPackageImpl#getBoundary()
	 * @generated
	 */
	int BOUNDARY = 8;

	/**
	 * The feature id for the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__ACTIVITY_ID = ACTIVITY__ACTIVITY_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__NAME = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__OUTCOME = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__TYPE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__TO_CALL = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__TO_DECISION = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link gcml.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.CallImpl
	 * @see gcml.impl.GcmlPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 9;

	/**
	 * The feature id for the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ACTIVITY_ID = ACTIVITY__ACTIVITY_ID;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__CONNECTIONS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__OUTCOME = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Boundary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__TO_BOUNDARY = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Call</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__FROM_CALL = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link gcml.impl.ActivitiesImpl <em>Activities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.ActivitiesImpl
	 * @see gcml.impl.GcmlPackageImpl#getActivities()
	 * @generated
	 */
	int ACTIVITIES = 10;

	/**
	 * The feature id for the '<em><b>Activity Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITIES__ACTIVITY_ITEM = 0;

	/**
	 * The number of structural features of the '<em>Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gcml.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.DecisionImpl
	 * @see gcml.impl.GcmlPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 11;

	/**
	 * The feature id for the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ACTIVITY_ID = ACTIVITY__ACTIVITY_ID;

	/**
	 * The feature id for the '<em><b>Source Activity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__SOURCE_ACTIVITY_ID = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Success Path ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__SUCCESS_PATH_ID = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alternate Path ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ALTERNATE_PATH_ID = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OUTCOME = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From Decision To Boudary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__FROM_DECISION_TO_BOUDARY = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__FROM_DECISION = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link gcml.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.Action
	 * @see gcml.impl.GcmlPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 12;

	/**
	 * The meta object id for the '{@link gcml.Capability <em>Capability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.Capability
	 * @see gcml.impl.GcmlPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 13;

	/**
	 * The meta object id for the '{@link gcml.BoundaryType <em>Boundary Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.BoundaryType
	 * @see gcml.impl.GcmlPackageImpl#getBoundaryType()
	 * @generated
	 */
	int BOUNDARY_TYPE = 14;

	/**
	 * The meta object id for the '<em>Action Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.Action
	 * @see gcml.impl.GcmlPackageImpl#getActionObject()
	 * @generated
	 */
	int ACTION_OBJECT = 15;

	/**
	 * The meta object id for the '<em>Capability Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.Capability
	 * @see gcml.impl.GcmlPackageImpl#getCapabilityObject()
	 * @generated
	 */
	int CAPABILITY_OBJECT = 16;

	/**
	 * The meta object id for the '<em>Boundary Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.BoundaryType
	 * @see gcml.impl.GcmlPackageImpl#getBoundaryTypeObject()
	 * @generated
	 */
	int BOUNDARY_TYPE_OBJECT = 17;


	/**
	 * Returns the meta object for class '{@link gcml.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see gcml.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Connection#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth</em>'.
	 * @see gcml.Connection#getBandwidth()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Bandwidth();

	/**
	 * Returns the meta object for the reference list '{@link gcml.Connection#getFromDevice <em>From Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Device</em>'.
	 * @see gcml.Connection#getFromDevice()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_FromDevice();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Connection#getConnectionID <em>Connection ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection ID</em>'.
	 * @see gcml.Connection#getConnectionID()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionID();

	/**
	 * Returns the meta object for class '{@link gcml.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see gcml.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute list '{@link gcml.Device#getDeviceCapability <em>Device Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Device Capability</em>'.
	 * @see gcml.Device#getDeviceCapability()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DeviceCapability();

	/**
	 * Returns the meta object for the reference '{@link gcml.Device#getFromIsAttached <em>From Is Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Is Attached</em>'.
	 * @see gcml.Device#getFromIsAttached()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_FromIsAttached();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Device#isIsLocal <em>Is Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Local</em>'.
	 * @see gcml.Device#isIsLocal()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_IsLocal();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Device#isIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see gcml.Device#isIsVirtual()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_IsVirtual();

	/**
	 * Returns the meta object for the reference list '{@link gcml.Device#getToConnection <em>To Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Connection</em>'.
	 * @see gcml.Device#getToConnection()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_ToConnection();

	/**
	 * Returns the meta object for class '{@link gcml.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see gcml.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Form#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see gcml.Form#getAction()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Action();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Form#getFormDataType <em>Form Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Data Type</em>'.
	 * @see gcml.Form#getFormDataType()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_FormDataType();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Form#getFormName <em>Form Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Name</em>'.
	 * @see gcml.Form#getFormName()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_FormName();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Form#getSuggestedApplication <em>Suggested Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suggested Application</em>'.
	 * @see gcml.Form#getSuggestedApplication()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_SuggestedApplication();

	/**
	 * Returns the meta object for the reference '{@link gcml.Form#getToConnection <em>To Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Connection</em>'.
	 * @see gcml.Form#getToConnection()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_ToConnection();

	/**
	 * Returns the meta object for the reference '{@link gcml.Form#getToParentForm <em>To Parent Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Parent Form</em>'.
	 * @see gcml.Form#getToParentForm()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_ToParentForm();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Form#getVoiceCommand <em>Voice Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voice Command</em>'.
	 * @see gcml.Form#getVoiceCommand()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_VoiceCommand();

	/**
	 * Returns the meta object for class '{@link gcml.wgcml <em>wgcml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>wgcml</em>'.
	 * @see gcml.wgcml
	 * @generated
	 */
	EClass getwgcml();

	/**
	 * Returns the meta object for the containment reference list '{@link gcml.wgcml#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see gcml.wgcml#getConnection()
	 * @see #getwgcml()
	 * @generated
	 */
	EReference getwgcml_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link gcml.wgcml#getMedium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medium</em>'.
	 * @see gcml.wgcml#getMedium()
	 * @see #getwgcml()
	 * @generated
	 */
	EReference getwgcml_Medium();

	/**
	 * Returns the meta object for the containment reference list '{@link gcml.wgcml#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form</em>'.
	 * @see gcml.wgcml#getForm()
	 * @see #getwgcml()
	 * @generated
	 */
	EReference getwgcml_Form();

	/**
	 * Returns the meta object for the containment reference list '{@link gcml.wgcml#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see gcml.wgcml#getPerson()
	 * @see #getwgcml()
	 * @generated
	 */
	EReference getwgcml_Person();

	/**
	 * Returns the meta object for the containment reference list '{@link gcml.wgcml#getIsAttached <em>Is Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Attached</em>'.
	 * @see gcml.wgcml#getIsAttached()
	 * @see #getwgcml()
	 * @generated
	 */
	EReference getwgcml_IsAttached();

	/**
	 * Returns the meta object for the containment reference list '{@link gcml.wgcml#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device</em>'.
	 * @see gcml.wgcml#getDevice()
	 * @see #getwgcml()
	 * @generated
	 */
	EReference getwgcml_Device();

	/**
	 * Returns the meta object for the containment reference '{@link gcml.wgcml#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activities</em>'.
	 * @see gcml.wgcml#getActivities()
	 * @see #getwgcml()
	 * @generated
	 */
	EReference getwgcml_Activities();

	/**
	 * Returns the meta object for class '{@link gcml.IsAttached <em>Is Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Attached</em>'.
	 * @see gcml.IsAttached
	 * @generated
	 */
	EClass getIsAttached();

	/**
	 * Returns the meta object for the reference '{@link gcml.IsAttached#getFromPerson <em>From Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Person</em>'.
	 * @see gcml.IsAttached#getFromPerson()
	 * @see #getIsAttached()
	 * @generated
	 */
	EReference getIsAttached_FromPerson();

	/**
	 * Returns the meta object for the reference '{@link gcml.IsAttached#getToDevice <em>To Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Device</em>'.
	 * @see gcml.IsAttached#getToDevice()
	 * @see #getIsAttached()
	 * @generated
	 */
	EReference getIsAttached_ToDevice();

	/**
	 * Returns the meta object for class '{@link gcml.Medium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medium</em>'.
	 * @see gcml.Medium
	 * @generated
	 */
	EClass getMedium();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Medium#getMediumDataType <em>Medium Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Data Type</em>'.
	 * @see gcml.Medium#getMediumDataType()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_MediumDataType();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Medium#getMediumName <em>Medium Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Name</em>'.
	 * @see gcml.Medium#getMediumName()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_MediumName();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Medium#getSuggestedApplication <em>Suggested Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suggested Application</em>'.
	 * @see gcml.Medium#getSuggestedApplication()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_SuggestedApplication();

	/**
	 * Returns the meta object for the reference '{@link gcml.Medium#getToConnection <em>To Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Connection</em>'.
	 * @see gcml.Medium#getToConnection()
	 * @see #getMedium()
	 * @generated
	 */
	EReference getMedium_ToConnection();

	/**
	 * Returns the meta object for the reference '{@link gcml.Medium#getToForm <em>To Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Form</em>'.
	 * @see gcml.Medium#getToForm()
	 * @see #getMedium()
	 * @generated
	 */
	EReference getMedium_ToForm();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Medium#getVoiceCommand <em>Voice Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voice Command</em>'.
	 * @see gcml.Medium#getVoiceCommand()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_VoiceCommand();

	/**
	 * Returns the meta object for class '{@link gcml.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see gcml.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Person#getPersonID <em>Person ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person ID</em>'.
	 * @see gcml.Person#getPersonID()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonID();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Person#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Name</em>'.
	 * @see gcml.Person#getPersonName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonName();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Person#getPersonRole <em>Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Role</em>'.
	 * @see gcml.Person#getPersonRole()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonRole();

	/**
	 * Returns the meta object for the reference '{@link gcml.Person#getToIsAttached <em>To Is Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Is Attached</em>'.
	 * @see gcml.Person#getToIsAttached()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_ToIsAttached();

	/**
	 * Returns the meta object for class '{@link gcml.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see gcml.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Activity#getActivityId <em>Activity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Id</em>'.
	 * @see gcml.Activity#getActivityId()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ActivityId();

	/**
	 * Returns the meta object for class '{@link gcml.Boundary <em>Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary</em>'.
	 * @see gcml.Boundary
	 * @generated
	 */
	EClass getBoundary();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Boundary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gcml.Boundary#getName()
	 * @see #getBoundary()
	 * @generated
	 */
	EAttribute getBoundary_Name();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Boundary#getOutcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outcome</em>'.
	 * @see gcml.Boundary#getOutcome()
	 * @see #getBoundary()
	 * @generated
	 */
	EAttribute getBoundary_Outcome();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Boundary#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gcml.Boundary#getType()
	 * @see #getBoundary()
	 * @generated
	 */
	EAttribute getBoundary_Type();

	/**
	 * Returns the meta object for the reference '{@link gcml.Boundary#getToCall <em>To Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Call</em>'.
	 * @see gcml.Boundary#getToCall()
	 * @see #getBoundary()
	 * @generated
	 */
	EReference getBoundary_ToCall();

	/**
	 * Returns the meta object for the reference '{@link gcml.Boundary#getToDecision <em>To Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Decision</em>'.
	 * @see gcml.Boundary#getToDecision()
	 * @see #getBoundary()
	 * @generated
	 */
	EReference getBoundary_ToDecision();

	/**
	 * Returns the meta object for class '{@link gcml.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see gcml.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the containment reference list '{@link gcml.Call#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see gcml.Call#getConnections()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Connections();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Call#getOutcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outcome</em>'.
	 * @see gcml.Call#getOutcome()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_Outcome();

	/**
	 * Returns the meta object for the reference '{@link gcml.Call#getToBoundary <em>To Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Boundary</em>'.
	 * @see gcml.Call#getToBoundary()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_ToBoundary();

	/**
	 * Returns the meta object for the reference list '{@link gcml.Call#getFromCall <em>From Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Call</em>'.
	 * @see gcml.Call#getFromCall()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_FromCall();

	/**
	 * Returns the meta object for class '{@link gcml.Activities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activities</em>'.
	 * @see gcml.Activities
	 * @generated
	 */
	EClass getActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link gcml.Activities#getActivityItem <em>Activity Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity Item</em>'.
	 * @see gcml.Activities#getActivityItem()
	 * @see #getActivities()
	 * @generated
	 */
	EReference getActivities_ActivityItem();

	/**
	 * Returns the meta object for class '{@link gcml.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see gcml.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Decision#getSourceActivityID <em>Source Activity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Activity ID</em>'.
	 * @see gcml.Decision#getSourceActivityID()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_SourceActivityID();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Decision#getSuccessPathID <em>Success Path ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Path ID</em>'.
	 * @see gcml.Decision#getSuccessPathID()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_SuccessPathID();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Decision#getAlternatePathID <em>Alternate Path ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternate Path ID</em>'.
	 * @see gcml.Decision#getAlternatePathID()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_AlternatePathID();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Decision#isOutcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outcome</em>'.
	 * @see gcml.Decision#isOutcome()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Outcome();

	/**
	 * Returns the meta object for the reference '{@link gcml.Decision#getFromDecisionToBoudary <em>From Decision To Boudary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Decision To Boudary</em>'.
	 * @see gcml.Decision#getFromDecisionToBoudary()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_FromDecisionToBoudary();

	/**
	 * Returns the meta object for the reference '{@link gcml.Decision#getFromDecision <em>From Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Decision</em>'.
	 * @see gcml.Decision#getFromDecision()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_FromDecision();

	/**
	 * Returns the meta object for enum '{@link gcml.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see gcml.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the meta object for enum '{@link gcml.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capability</em>'.
	 * @see gcml.Capability
	 * @generated
	 */
	EEnum getCapability();

	/**
	 * Returns the meta object for enum '{@link gcml.BoundaryType <em>Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boundary Type</em>'.
	 * @see gcml.BoundaryType
	 * @generated
	 */
	EEnum getBoundaryType();

	/**
	 * Returns the meta object for data type '{@link gcml.Action <em>Action Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Action Object</em>'.
	 * @see gcml.Action
	 * @model instanceClass="gcml.Action"
	 *        extendedMetaData="name='Action:Object' baseType='Action'"
	 * @generated
	 */
	EDataType getActionObject();

	/**
	 * Returns the meta object for data type '{@link gcml.Capability <em>Capability Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Capability Object</em>'.
	 * @see gcml.Capability
	 * @model instanceClass="gcml.Capability"
	 *        extendedMetaData="name='Capability:Object' baseType='Capability'"
	 * @generated
	 */
	EDataType getCapabilityObject();

	/**
	 * Returns the meta object for data type '{@link gcml.BoundaryType <em>Boundary Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boundary Type Object</em>'.
	 * @see gcml.BoundaryType
	 * @model instanceClass="gcml.BoundaryType"
	 *        extendedMetaData="name='BoundaryType:Object' baseType='BoundaryType'"
	 * @generated
	 */
	EDataType getBoundaryTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GcmlFactory getGcmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gcml.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.ConnectionImpl
		 * @see gcml.impl.GcmlPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__BANDWIDTH = eINSTANCE.getConnection_Bandwidth();

		/**
		 * The meta object literal for the '<em><b>From Device</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FROM_DEVICE = eINSTANCE.getConnection_FromDevice();

		/**
		 * The meta object literal for the '<em><b>Connection ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONNECTION_ID = eINSTANCE.getConnection_ConnectionID();

		/**
		 * The meta object literal for the '{@link gcml.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.DeviceImpl
		 * @see gcml.impl.GcmlPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Device Capability</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEVICE_CAPABILITY = eINSTANCE.getDevice_DeviceCapability();

		/**
		 * The meta object literal for the '<em><b>From Is Attached</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__FROM_IS_ATTACHED = eINSTANCE.getDevice_FromIsAttached();

		/**
		 * The meta object literal for the '<em><b>Is Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__IS_LOCAL = eINSTANCE.getDevice_IsLocal();

		/**
		 * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__IS_VIRTUAL = eINSTANCE.getDevice_IsVirtual();

		/**
		 * The meta object literal for the '<em><b>To Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__TO_CONNECTION = eINSTANCE.getDevice_ToConnection();

		/**
		 * The meta object literal for the '{@link gcml.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.FormImpl
		 * @see gcml.impl.GcmlPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__ACTION = eINSTANCE.getForm_Action();

		/**
		 * The meta object literal for the '<em><b>Form Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__FORM_DATA_TYPE = eINSTANCE.getForm_FormDataType();

		/**
		 * The meta object literal for the '<em><b>Form Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__FORM_NAME = eINSTANCE.getForm_FormName();

		/**
		 * The meta object literal for the '<em><b>Suggested Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SUGGESTED_APPLICATION = eINSTANCE.getForm_SuggestedApplication();

		/**
		 * The meta object literal for the '<em><b>To Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__TO_CONNECTION = eINSTANCE.getForm_ToConnection();

		/**
		 * The meta object literal for the '<em><b>To Parent Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__TO_PARENT_FORM = eINSTANCE.getForm_ToParentForm();

		/**
		 * The meta object literal for the '<em><b>Voice Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__VOICE_COMMAND = eINSTANCE.getForm_VoiceCommand();

		/**
		 * The meta object literal for the '{@link gcml.impl.wgcmlImpl <em>wgcml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.wgcmlImpl
		 * @see gcml.impl.GcmlPackageImpl#getwgcml()
		 * @generated
		 */
		EClass WGCML = eINSTANCE.getwgcml();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WGCML__CONNECTION = eINSTANCE.getwgcml_Connection();

		/**
		 * The meta object literal for the '<em><b>Medium</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WGCML__MEDIUM = eINSTANCE.getwgcml_Medium();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WGCML__FORM = eINSTANCE.getwgcml_Form();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WGCML__PERSON = eINSTANCE.getwgcml_Person();

		/**
		 * The meta object literal for the '<em><b>Is Attached</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WGCML__IS_ATTACHED = eINSTANCE.getwgcml_IsAttached();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WGCML__DEVICE = eINSTANCE.getwgcml_Device();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WGCML__ACTIVITIES = eINSTANCE.getwgcml_Activities();

		/**
		 * The meta object literal for the '{@link gcml.impl.IsAttachedImpl <em>Is Attached</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.IsAttachedImpl
		 * @see gcml.impl.GcmlPackageImpl#getIsAttached()
		 * @generated
		 */
		EClass IS_ATTACHED = eINSTANCE.getIsAttached();

		/**
		 * The meta object literal for the '<em><b>From Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ATTACHED__FROM_PERSON = eINSTANCE.getIsAttached_FromPerson();

		/**
		 * The meta object literal for the '<em><b>To Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ATTACHED__TO_DEVICE = eINSTANCE.getIsAttached_ToDevice();

		/**
		 * The meta object literal for the '{@link gcml.impl.MediumImpl <em>Medium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.MediumImpl
		 * @see gcml.impl.GcmlPackageImpl#getMedium()
		 * @generated
		 */
		EClass MEDIUM = eINSTANCE.getMedium();

		/**
		 * The meta object literal for the '<em><b>Medium Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__MEDIUM_DATA_TYPE = eINSTANCE.getMedium_MediumDataType();

		/**
		 * The meta object literal for the '<em><b>Medium Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__MEDIUM_NAME = eINSTANCE.getMedium_MediumName();

		/**
		 * The meta object literal for the '<em><b>Suggested Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__SUGGESTED_APPLICATION = eINSTANCE.getMedium_SuggestedApplication();

		/**
		 * The meta object literal for the '<em><b>To Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIUM__TO_CONNECTION = eINSTANCE.getMedium_ToConnection();

		/**
		 * The meta object literal for the '<em><b>To Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIUM__TO_FORM = eINSTANCE.getMedium_ToForm();

		/**
		 * The meta object literal for the '<em><b>Voice Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__VOICE_COMMAND = eINSTANCE.getMedium_VoiceCommand();

		/**
		 * The meta object literal for the '{@link gcml.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.PersonImpl
		 * @see gcml.impl.GcmlPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Person ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSON_ID = eINSTANCE.getPerson_PersonID();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSON_NAME = eINSTANCE.getPerson_PersonName();

		/**
		 * The meta object literal for the '<em><b>Person Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSON_ROLE = eINSTANCE.getPerson_PersonRole();

		/**
		 * The meta object literal for the '<em><b>To Is Attached</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__TO_IS_ATTACHED = eINSTANCE.getPerson_ToIsAttached();

		/**
		 * The meta object literal for the '{@link gcml.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.ActivityImpl
		 * @see gcml.impl.GcmlPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Activity Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACTIVITY_ID = eINSTANCE.getActivity_ActivityId();

		/**
		 * The meta object literal for the '{@link gcml.impl.BoundaryImpl <em>Boundary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.BoundaryImpl
		 * @see gcml.impl.GcmlPackageImpl#getBoundary()
		 * @generated
		 */
		EClass BOUNDARY = eINSTANCE.getBoundary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY__NAME = eINSTANCE.getBoundary_Name();

		/**
		 * The meta object literal for the '<em><b>Outcome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY__OUTCOME = eINSTANCE.getBoundary_Outcome();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY__TYPE = eINSTANCE.getBoundary_Type();

		/**
		 * The meta object literal for the '<em><b>To Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDARY__TO_CALL = eINSTANCE.getBoundary_ToCall();

		/**
		 * The meta object literal for the '<em><b>To Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDARY__TO_DECISION = eINSTANCE.getBoundary_ToDecision();

		/**
		 * The meta object literal for the '{@link gcml.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.CallImpl
		 * @see gcml.impl.GcmlPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__CONNECTIONS = eINSTANCE.getCall_Connections();

		/**
		 * The meta object literal for the '<em><b>Outcome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__OUTCOME = eINSTANCE.getCall_Outcome();

		/**
		 * The meta object literal for the '<em><b>To Boundary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__TO_BOUNDARY = eINSTANCE.getCall_ToBoundary();

		/**
		 * The meta object literal for the '<em><b>From Call</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__FROM_CALL = eINSTANCE.getCall_FromCall();

		/**
		 * The meta object literal for the '{@link gcml.impl.ActivitiesImpl <em>Activities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.ActivitiesImpl
		 * @see gcml.impl.GcmlPackageImpl#getActivities()
		 * @generated
		 */
		EClass ACTIVITIES = eINSTANCE.getActivities();

		/**
		 * The meta object literal for the '<em><b>Activity Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITIES__ACTIVITY_ITEM = eINSTANCE.getActivities_ActivityItem();

		/**
		 * The meta object literal for the '{@link gcml.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.DecisionImpl
		 * @see gcml.impl.GcmlPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Source Activity ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__SOURCE_ACTIVITY_ID = eINSTANCE.getDecision_SourceActivityID();

		/**
		 * The meta object literal for the '<em><b>Success Path ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__SUCCESS_PATH_ID = eINSTANCE.getDecision_SuccessPathID();

		/**
		 * The meta object literal for the '<em><b>Alternate Path ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__ALTERNATE_PATH_ID = eINSTANCE.getDecision_AlternatePathID();

		/**
		 * The meta object literal for the '<em><b>Outcome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__OUTCOME = eINSTANCE.getDecision_Outcome();

		/**
		 * The meta object literal for the '<em><b>From Decision To Boudary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__FROM_DECISION_TO_BOUDARY = eINSTANCE.getDecision_FromDecisionToBoudary();

		/**
		 * The meta object literal for the '<em><b>From Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__FROM_DECISION = eINSTANCE.getDecision_FromDecision();

		/**
		 * The meta object literal for the '{@link gcml.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.Action
		 * @see gcml.impl.GcmlPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link gcml.Capability <em>Capability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.Capability
		 * @see gcml.impl.GcmlPackageImpl#getCapability()
		 * @generated
		 */
		EEnum CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '{@link gcml.BoundaryType <em>Boundary Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.BoundaryType
		 * @see gcml.impl.GcmlPackageImpl#getBoundaryType()
		 * @generated
		 */
		EEnum BOUNDARY_TYPE = eINSTANCE.getBoundaryType();

		/**
		 * The meta object literal for the '<em>Action Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.Action
		 * @see gcml.impl.GcmlPackageImpl#getActionObject()
		 * @generated
		 */
		EDataType ACTION_OBJECT = eINSTANCE.getActionObject();

		/**
		 * The meta object literal for the '<em>Capability Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.Capability
		 * @see gcml.impl.GcmlPackageImpl#getCapabilityObject()
		 * @generated
		 */
		EDataType CAPABILITY_OBJECT = eINSTANCE.getCapabilityObject();

		/**
		 * The meta object literal for the '<em>Boundary Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.BoundaryType
		 * @see gcml.impl.GcmlPackageImpl#getBoundaryTypeObject()
		 * @generated
		 */
		EDataType BOUNDARY_TYPE_OBJECT = eINSTANCE.getBoundaryTypeObject();

	}

} //GcmlPackage
