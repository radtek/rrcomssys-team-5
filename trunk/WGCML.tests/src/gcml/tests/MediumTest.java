/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.tests;

import gcml.GcmlFactory;
import gcml.Medium;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Medium</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MediumTest extends TestCase {

	/**
	 * The fixture for this Medium test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Medium fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MediumTest.class);
	}

	/**
	 * Constructs a new Medium test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Medium test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Medium fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Medium test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Medium getFixture() {
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
		setFixture(GcmlFactory.eINSTANCE.createMedium());
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

} //MediumTest
