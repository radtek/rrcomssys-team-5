/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.tests;

import gcml.GcmlFactory;
import gcml.wgcml;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>wgcml</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class wgcmlTest extends TestCase {

	/**
	 * The fixture for this wgcml test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected wgcml fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(wgcmlTest.class);
	}

	/**
	 * Constructs a new wgcml test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wgcmlTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this wgcml test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(wgcml fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this wgcml test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected wgcml getFixture() {
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
		setFixture(GcmlFactory.eINSTANCE.createwgcml());
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

} //wgcmlTest
