/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.tests;

import gcml.Activities;
import gcml.GcmlFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activities</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitiesTest extends TestCase {

	/**
	 * The fixture for this Activities test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activities fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivitiesTest.class);
	}

	/**
	 * Constructs a new Activities test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Activities test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Activities fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Activities test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activities getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GcmlFactory.eINSTANCE.createActivities());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ActivitiesTest
