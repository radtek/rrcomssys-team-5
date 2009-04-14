package gcml.diagram.providers;

import gcml.GcmlPackage;
import gcml.diagram.part.GcmlDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class GcmlElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private GcmlElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Gcml_1000 = getElementType("gcml.diagram.Gcml_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Device_2001 = getElementType("gcml.diagram.Device_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Form_2002 = getElementType("gcml.diagram.Form_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Medium_2003 = getElementType("gcml.diagram.Medium_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Call_2004 = getElementType("gcml.diagram.Call_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Boundary_2005 = getElementType("gcml.diagram.Boundary_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Person_2006 = getElementType("gcml.diagram.Person_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsAttached_2007 = getElementType("gcml.diagram.IsAttached_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Decision_2008 = getElementType("gcml.diagram.Decision_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Connection_2009 = getElementType("gcml.diagram.Connection_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PersonToIsAttached_4001 = getElementType("gcml.diagram.PersonToIsAttached_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IsAttachedToDevice_4002 = getElementType("gcml.diagram.IsAttachedToDevice_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DecisionDecisionToCall_4003 = getElementType("gcml.diagram.DecisionDecisionToCall_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FormToParentForm_4004 = getElementType("gcml.diagram.FormToParentForm_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BoundaryBoundaryToCall_4005 = getElementType("gcml.diagram.BoundaryBoundaryToCall_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IsAttachedFromPerson_4006 = getElementType("gcml.diagram.IsAttachedFromPerson_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConnectionConnectionToCall_4007 = getElementType("gcml.diagram.ConnectionConnectionToCall_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionFromDevice_4008 = getElementType("gcml.diagram.ConnectionFromDevice_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FormToConnection_4009 = getElementType("gcml.diagram.FormToConnection_4009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeviceToConnection_4010 = getElementType("gcml.diagram.DeviceToConnection_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallCallToBoundary_4011 = getElementType("gcml.diagram.CallCallToBoundary_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallCallToConnection_4012 = getElementType("gcml.diagram.CallCallToConnection_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DecisionDecisionToBoundary_4013 = getElementType("gcml.diagram.DecisionDecisionToBoundary_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeviceFromIsAttached_4014 = getElementType("gcml.diagram.DeviceFromIsAttached_4014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallCallToDecision_4015 = getElementType("gcml.diagram.CallCallToDecision_4015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MediumToConnection_4016 = getElementType("gcml.diagram.MediumToConnection_4016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return GcmlDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Gcml_1000, GcmlPackage.eINSTANCE.getGcml());

			elements.put(Device_2001, GcmlPackage.eINSTANCE.getDevice());

			elements.put(Form_2002, GcmlPackage.eINSTANCE.getForm());

			elements.put(Medium_2003, GcmlPackage.eINSTANCE.getMedium());

			elements.put(Call_2004, GcmlPackage.eINSTANCE.getCall());

			elements.put(Boundary_2005, GcmlPackage.eINSTANCE.getBoundary());

			elements.put(Person_2006, GcmlPackage.eINSTANCE.getPerson());

			elements
					.put(IsAttached_2007, GcmlPackage.eINSTANCE.getIsAttached());

			elements.put(Decision_2008, GcmlPackage.eINSTANCE.getDecision());

			elements
					.put(Connection_2009, GcmlPackage.eINSTANCE.getConnection());

			elements.put(PersonToIsAttached_4001, GcmlPackage.eINSTANCE
					.getPerson_ToIsAttached());

			elements.put(IsAttachedToDevice_4002, GcmlPackage.eINSTANCE
					.getIsAttached_ToDevice());

			elements.put(DecisionDecisionToCall_4003, GcmlPackage.eINSTANCE
					.getDecision_DecisionToCall());

			elements.put(FormToParentForm_4004, GcmlPackage.eINSTANCE
					.getForm_ToParentForm());

			elements.put(BoundaryBoundaryToCall_4005, GcmlPackage.eINSTANCE
					.getBoundary_BoundaryToCall());

			elements.put(IsAttachedFromPerson_4006, GcmlPackage.eINSTANCE
					.getIsAttached_FromPerson());

			elements.put(ConnectionConnectionToCall_4007, GcmlPackage.eINSTANCE
					.getConnection_ConnectionToCall());

			elements.put(ConnectionFromDevice_4008, GcmlPackage.eINSTANCE
					.getConnection_FromDevice());

			elements.put(FormToConnection_4009, GcmlPackage.eINSTANCE
					.getForm_ToConnection());

			elements.put(DeviceToConnection_4010, GcmlPackage.eINSTANCE
					.getDevice_ToConnection());

			elements.put(CallCallToBoundary_4011, GcmlPackage.eINSTANCE
					.getCall_CallToBoundary());

			elements.put(CallCallToConnection_4012, GcmlPackage.eINSTANCE
					.getCall_CallToConnection());

			elements.put(DecisionDecisionToBoundary_4013, GcmlPackage.eINSTANCE
					.getDecision_DecisionToBoundary());

			elements.put(DeviceFromIsAttached_4014, GcmlPackage.eINSTANCE
					.getDevice_FromIsAttached());

			elements.put(CallCallToDecision_4015, GcmlPackage.eINSTANCE
					.getCall_CallToDecision());

			elements.put(MediumToConnection_4016, GcmlPackage.eINSTANCE
					.getMedium_ToConnection());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Gcml_1000);
			KNOWN_ELEMENT_TYPES.add(Device_2001);
			KNOWN_ELEMENT_TYPES.add(Form_2002);
			KNOWN_ELEMENT_TYPES.add(Medium_2003);
			KNOWN_ELEMENT_TYPES.add(Call_2004);
			KNOWN_ELEMENT_TYPES.add(Boundary_2005);
			KNOWN_ELEMENT_TYPES.add(Person_2006);
			KNOWN_ELEMENT_TYPES.add(IsAttached_2007);
			KNOWN_ELEMENT_TYPES.add(Decision_2008);
			KNOWN_ELEMENT_TYPES.add(Connection_2009);
			KNOWN_ELEMENT_TYPES.add(PersonToIsAttached_4001);
			KNOWN_ELEMENT_TYPES.add(IsAttachedToDevice_4002);
			KNOWN_ELEMENT_TYPES.add(DecisionDecisionToCall_4003);
			KNOWN_ELEMENT_TYPES.add(FormToParentForm_4004);
			KNOWN_ELEMENT_TYPES.add(BoundaryBoundaryToCall_4005);
			KNOWN_ELEMENT_TYPES.add(IsAttachedFromPerson_4006);
			KNOWN_ELEMENT_TYPES.add(ConnectionConnectionToCall_4007);
			KNOWN_ELEMENT_TYPES.add(ConnectionFromDevice_4008);
			KNOWN_ELEMENT_TYPES.add(FormToConnection_4009);
			KNOWN_ELEMENT_TYPES.add(DeviceToConnection_4010);
			KNOWN_ELEMENT_TYPES.add(CallCallToBoundary_4011);
			KNOWN_ELEMENT_TYPES.add(CallCallToConnection_4012);
			KNOWN_ELEMENT_TYPES.add(DecisionDecisionToBoundary_4013);
			KNOWN_ELEMENT_TYPES.add(DeviceFromIsAttached_4014);
			KNOWN_ELEMENT_TYPES.add(CallCallToDecision_4015);
			KNOWN_ELEMENT_TYPES.add(MediumToConnection_4016);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
