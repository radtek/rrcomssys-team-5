/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.tests;

import gcml.Boundary;
import gcml.GcmlFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boundary</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundaryTest extends ActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoundaryTest.class);
	}

	/**
	 * Constructs a new Boundary test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boundary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Boundary getFixture() {
		return (Boundary)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GcmlFactory.eINSTANCE.createBoundary());
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

} //BoundaryTest
