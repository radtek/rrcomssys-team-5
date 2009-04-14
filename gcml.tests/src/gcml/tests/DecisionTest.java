/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.tests;

import gcml.Decision;
import gcml.GcmlFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecisionTest extends ActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DecisionTest.class);
	}

	/**
	 * Constructs a new Decision test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Decision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Decision getFixture() {
		return (Decision)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GcmlFactory.eINSTANCE.createDecision());
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

} //DecisionTest
