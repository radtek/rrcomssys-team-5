package gcml.diagram.providers;

import gcml.GcmlPackage;
import gcml.diagram.part.WgcmlDiagramEditorPlugin;

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
public class WgcmlElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private WgcmlElementTypes() {
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
	public static final IElementType Wgcml_1000 = getElementType("WGCML.diagram.Wgcml_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_2001 = getElementType("WGCML.diagram.Connection_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Person_2002 = getElementType("WGCML.diagram.Person_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Medium_2003 = getElementType("WGCML.diagram.Medium_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsAttached_2004 = getElementType("WGCML.diagram.IsAttached_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Device_2005 = getElementType("WGCML.diagram.Device_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Form_2006 = getElementType("WGCML.diagram.Form_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Call_2010 = getElementType("WGCML.diagram.Call_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Boundary_2011 = getElementType("WGCML.diagram.Boundary_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Decision_2012 = getElementType("WGCML.diagram.Decision_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PersonToIsAttached_4001 = getElementType("WGCML.diagram.PersonToIsAttached_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeviceFromIsAttached_4003 = getElementType("WGCML.diagram.DeviceFromIsAttached_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeviceToConnection_4010 = getElementType("WGCML.diagram.DeviceToConnection_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MediumToConnection_4004 = getElementType("WGCML.diagram.MediumToConnection_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MediumToForm_4006 = getElementType("WGCML.diagram.MediumToForm_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionFromDevice_4005 = getElementType("WGCML.diagram.ConnectionFromDevice_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsAttachedFromPerson_4007 = getElementType("WGCML.diagram.IsAttachedFromPerson_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsAttachedToDevice_4008 = getElementType("WGCML.diagram.IsAttachedToDevice_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FormToConnection_4002 = getElementType("WGCML.diagram.FormToConnection_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FormToParentForm_4009 = getElementType("WGCML.diagram.FormToParentForm_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DecisionFromDecisionToBoudary_4011 = getElementType("WGCML.diagram.DecisionFromDecisionToBoudary_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DecisionFromDecision_4012 = getElementType("WGCML.diagram.DecisionFromDecision_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CallToBoundary_4013 = getElementType("WGCML.diagram.CallToBoundary_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CallFromCall_4014 = getElementType("WGCML.diagram.CallFromCall_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BoundaryToCall_4015 = getElementType("WGCML.diagram.BoundaryToCall_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BoundaryToDecision_4016 = getElementType("WGCML.diagram.BoundaryToDecision_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CallConnections_4017 = getElementType("WGCML.diagram.CallConnections_4017"); //$NON-NLS-1$

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
				return WgcmlDiagramEditorPlugin.getInstance()
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

			elements.put(Wgcml_1000, GcmlPackage.eINSTANCE.getwgcml());

			elements
					.put(Connection_2001, GcmlPackage.eINSTANCE.getConnection());

			elements.put(Person_2002, GcmlPackage.eINSTANCE.getPerson());

			elements.put(Medium_2003, GcmlPackage.eINSTANCE.getMedium());

			elements
					.put(IsAttached_2004, GcmlPackage.eINSTANCE.getIsAttached());

			elements.put(Device_2005, GcmlPackage.eINSTANCE.getDevice());

			elements.put(Form_2006, GcmlPackage.eINSTANCE.getForm());

			elements.put(Call_2010, GcmlPackage.eINSTANCE.getCall());

			elements.put(Boundary_2011, GcmlPackage.eINSTANCE.getBoundary());

			elements.put(Decision_2012, GcmlPackage.eINSTANCE.getDecision());

			elements.put(PersonToIsAttached_4001, GcmlPackage.eINSTANCE
					.getPerson_ToIsAttached());

			elements.put(DeviceFromIsAttached_4003, GcmlPackage.eINSTANCE
					.getDevice_FromIsAttached());

			elements.put(DeviceToConnection_4010, GcmlPackage.eINSTANCE
					.getDevice_ToConnection());

			elements.put(MediumToConnection_4004, GcmlPackage.eINSTANCE
					.getMedium_ToConnection());

			elements.put(MediumToForm_4006, GcmlPackage.eINSTANCE
					.getMedium_ToForm());

			elements.put(ConnectionFromDevice_4005, GcmlPackage.eINSTANCE
					.getConnection_FromDevice());

			elements.put(IsAttachedFromPerson_4007, GcmlPackage.eINSTANCE
					.getIsAttached_FromPerson());

			elements.put(IsAttachedToDevice_4008, GcmlPackage.eINSTANCE
					.getIsAttached_ToDevice());

			elements.put(FormToConnection_4002, GcmlPackage.eINSTANCE
					.getForm_ToConnection());

			elements.put(FormToParentForm_4009, GcmlPackage.eINSTANCE
					.getForm_ToParentForm());

			elements.put(DecisionFromDecisionToBoudary_4011,
					GcmlPackage.eINSTANCE.getDecision_FromDecisionToBoudary());

			elements.put(DecisionFromDecision_4012, GcmlPackage.eINSTANCE
					.getDecision_FromDecision());

			elements.put(CallToBoundary_4013, GcmlPackage.eINSTANCE
					.getCall_ToBoundary());

			elements.put(CallFromCall_4014, GcmlPackage.eINSTANCE
					.getCall_FromCall());

			elements.put(BoundaryToCall_4015, GcmlPackage.eINSTANCE
					.getBoundary_ToCall());

			elements.put(BoundaryToDecision_4016, GcmlPackage.eINSTANCE
					.getBoundary_ToDecision());

			elements.put(CallConnections_4017, GcmlPackage.eINSTANCE
					.getCall_Connections());
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
			KNOWN_ELEMENT_TYPES.add(Wgcml_1000);
			KNOWN_ELEMENT_TYPES.add(Connection_2001);
			KNOWN_ELEMENT_TYPES.add(Person_2002);
			KNOWN_ELEMENT_TYPES.add(Medium_2003);
			KNOWN_ELEMENT_TYPES.add(IsAttached_2004);
			KNOWN_ELEMENT_TYPES.add(Device_2005);
			KNOWN_ELEMENT_TYPES.add(Form_2006);
			KNOWN_ELEMENT_TYPES.add(Call_2010);
			KNOWN_ELEMENT_TYPES.add(Boundary_2011);
			KNOWN_ELEMENT_TYPES.add(Decision_2012);
			KNOWN_ELEMENT_TYPES.add(PersonToIsAttached_4001);
			KNOWN_ELEMENT_TYPES.add(DeviceFromIsAttached_4003);
			KNOWN_ELEMENT_TYPES.add(DeviceToConnection_4010);
			KNOWN_ELEMENT_TYPES.add(MediumToConnection_4004);
			KNOWN_ELEMENT_TYPES.add(MediumToForm_4006);
			KNOWN_ELEMENT_TYPES.add(ConnectionFromDevice_4005);
			KNOWN_ELEMENT_TYPES.add(IsAttachedFromPerson_4007);
			KNOWN_ELEMENT_TYPES.add(IsAttachedToDevice_4008);
			KNOWN_ELEMENT_TYPES.add(FormToConnection_4002);
			KNOWN_ELEMENT_TYPES.add(FormToParentForm_4009);
			KNOWN_ELEMENT_TYPES.add(DecisionFromDecisionToBoudary_4011);
			KNOWN_ELEMENT_TYPES.add(DecisionFromDecision_4012);
			KNOWN_ELEMENT_TYPES.add(CallToBoundary_4013);
			KNOWN_ELEMENT_TYPES.add(CallFromCall_4014);
			KNOWN_ELEMENT_TYPES.add(BoundaryToCall_4015);
			KNOWN_ELEMENT_TYPES.add(BoundaryToDecision_4016);
			KNOWN_ELEMENT_TYPES.add(CallConnections_4017);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
