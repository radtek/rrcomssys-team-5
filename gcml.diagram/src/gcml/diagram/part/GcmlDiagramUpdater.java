package gcml.diagram.part;

import gcml.Activity;
import gcml.Boundary;
import gcml.Call;
import gcml.Connection;
import gcml.Decision;
import gcml.Device;
import gcml.Form;
import gcml.Gcml;
import gcml.GcmlPackage;
import gcml.IsAttached;
import gcml.Medium;
import gcml.Person;
import gcml.diagram.edit.parts.BoundaryBoundaryToCallEditPart;
import gcml.diagram.edit.parts.BoundaryEditPart;
import gcml.diagram.edit.parts.CallCallToBoundaryEditPart;
import gcml.diagram.edit.parts.CallCallToConnectionEditPart;
import gcml.diagram.edit.parts.CallCallToDecisionEditPart;
import gcml.diagram.edit.parts.CallEditPart;
import gcml.diagram.edit.parts.ConnectionConnectionToCallEditPart;
import gcml.diagram.edit.parts.ConnectionEditPart;
import gcml.diagram.edit.parts.ConnectionFromDeviceEditPart;
import gcml.diagram.edit.parts.DecisionDecisionToBoundaryEditPart;
import gcml.diagram.edit.parts.DecisionDecisionToCallEditPart;
import gcml.diagram.edit.parts.DecisionEditPart;
import gcml.diagram.edit.parts.DeviceEditPart;
import gcml.diagram.edit.parts.DeviceFromIsAttachedEditPart;
import gcml.diagram.edit.parts.DeviceToConnectionEditPart;
import gcml.diagram.edit.parts.FormEditPart;
import gcml.diagram.edit.parts.FormToConnectionEditPart;
import gcml.diagram.edit.parts.FormToParentFormEditPart;
import gcml.diagram.edit.parts.GcmlEditPart;
import gcml.diagram.edit.parts.IsAttachedEditPart;
import gcml.diagram.edit.parts.IsAttachedFromPersonEditPart;
import gcml.diagram.edit.parts.IsAttachedToDeviceEditPart;
import gcml.diagram.edit.parts.MediumEditPart;
import gcml.diagram.edit.parts.MediumToConnectionEditPart;
import gcml.diagram.edit.parts.PersonEditPart;
import gcml.diagram.edit.parts.PersonToIsAttachedEditPart;
import gcml.diagram.providers.GcmlElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GcmlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (GcmlVisualIDRegistry.getVisualID(view)) {
		case GcmlEditPart.VISUAL_ID:
			return getGcml_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGcml_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Gcml modelElement = (Gcml) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getDevice().iterator(); it.hasNext();) {
			Device childElement = (Device) it.next();
			int visualID = GcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DeviceEditPart.VISUAL_ID) {
				result.add(new GcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getForm().iterator(); it.hasNext();) {
			Form childElement = (Form) it.next();
			int visualID = GcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FormEditPart.VISUAL_ID) {
				result.add(new GcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMedium().iterator(); it.hasNext();) {
			Medium childElement = (Medium) it.next();
			int visualID = GcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MediumEditPart.VISUAL_ID) {
				result.add(new GcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = GcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CallEditPart.VISUAL_ID) {
				result.add(new GcmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BoundaryEditPart.VISUAL_ID) {
				result.add(new GcmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DecisionEditPart.VISUAL_ID) {
				result.add(new GcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getPerson().iterator(); it.hasNext();) {
			Person childElement = (Person) it.next();
			int visualID = GcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PersonEditPart.VISUAL_ID) {
				result.add(new GcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getIsAttached().iterator(); it
				.hasNext();) {
			IsAttached childElement = (IsAttached) it.next();
			int visualID = GcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IsAttachedEditPart.VISUAL_ID) {
				result.add(new GcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getConnection().iterator(); it
				.hasNext();) {
			Connection childElement = (Connection) it.next();
			int visualID = GcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectionEditPart.VISUAL_ID) {
				result.add(new GcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (GcmlVisualIDRegistry.getVisualID(view)) {
		case GcmlEditPart.VISUAL_ID:
			return getGcml_1000ContainedLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2001ContainedLinks(view);
		case FormEditPart.VISUAL_ID:
			return getForm_2002ContainedLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2003ContainedLinks(view);
		case CallEditPart.VISUAL_ID:
			return getCall_2004ContainedLinks(view);
		case BoundaryEditPart.VISUAL_ID:
			return getBoundary_2005ContainedLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_2006ContainedLinks(view);
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_2007ContainedLinks(view);
		case DecisionEditPart.VISUAL_ID:
			return getDecision_2008ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2009ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (GcmlVisualIDRegistry.getVisualID(view)) {
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2001IncomingLinks(view);
		case FormEditPart.VISUAL_ID:
			return getForm_2002IncomingLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2003IncomingLinks(view);
		case CallEditPart.VISUAL_ID:
			return getCall_2004IncomingLinks(view);
		case BoundaryEditPart.VISUAL_ID:
			return getBoundary_2005IncomingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_2006IncomingLinks(view);
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_2007IncomingLinks(view);
		case DecisionEditPart.VISUAL_ID:
			return getDecision_2008IncomingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2009IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (GcmlVisualIDRegistry.getVisualID(view)) {
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2001OutgoingLinks(view);
		case FormEditPart.VISUAL_ID:
			return getForm_2002OutgoingLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2003OutgoingLinks(view);
		case CallEditPart.VISUAL_ID:
			return getCall_2004OutgoingLinks(view);
		case BoundaryEditPart.VISUAL_ID:
			return getBoundary_2005OutgoingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_2006OutgoingLinks(view);
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_2007OutgoingLinks(view);
		case DecisionEditPart.VISUAL_ID:
			return getDecision_2008OutgoingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2009OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGcml_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDevice_2001ContainedLinks(View view) {
		Device modelElement = (Device) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_ToConnection_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_FromIsAttached_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForm_2002ContainedLinks(View view) {
		Form modelElement = (Form) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Form_ToParentForm_4004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Form_ToConnection_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMedium_2003ContainedLinks(View view) {
		Medium modelElement = (Medium) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Medium_ToConnection_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCall_2004ContainedLinks(View view) {
		Call modelElement = (Call) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_CallToBoundary_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_CallToConnection_4012(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_CallToDecision_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBoundary_2005ContainedLinks(View view) {
		Boundary modelElement = (Boundary) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Boundary_BoundaryToCall_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2006ContainedLinks(View view) {
		Person modelElement = (Person) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Person_ToIsAttached_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_2007ContainedLinks(View view) {
		IsAttached modelElement = (IsAttached) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_ToDevice_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_FromPerson_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDecision_2008ContainedLinks(View view) {
		Decision modelElement = (Decision) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Decision_DecisionToCall_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Decision_DecisionToBoundary_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_2009ContainedLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_ConnectionToCall_4007(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_FromDevice_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDevice_2001IncomingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_IsAttached_ToDevice_4002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Connection_FromDevice_4008(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForm_2002IncomingLinks(View view) {
		Form modelElement = (Form) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Form_ToParentForm_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMedium_2003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCall_2004IncomingLinks(View view) {
		Call modelElement = (Call) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Decision_DecisionToCall_4003(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Boundary_BoundaryToCall_4005(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Connection_ConnectionToCall_4007(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBoundary_2005IncomingLinks(View view) {
		Boundary modelElement = (Boundary) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Call_CallToBoundary_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Decision_DecisionToBoundary_4013(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2006IncomingLinks(View view) {
		Person modelElement = (Person) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_IsAttached_FromPerson_4006(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_2007IncomingLinks(View view) {
		IsAttached modelElement = (IsAttached) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Person_ToIsAttached_4001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Device_FromIsAttached_4014(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDecision_2008IncomingLinks(View view) {
		Decision modelElement = (Decision) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Call_CallToDecision_4015(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_2009IncomingLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Form_ToConnection_4009(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Device_ToConnection_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Call_CallToConnection_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Medium_ToConnection_4016(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDevice_2001OutgoingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_ToConnection_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_FromIsAttached_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForm_2002OutgoingLinks(View view) {
		Form modelElement = (Form) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Form_ToParentForm_4004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Form_ToConnection_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMedium_2003OutgoingLinks(View view) {
		Medium modelElement = (Medium) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Medium_ToConnection_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCall_2004OutgoingLinks(View view) {
		Call modelElement = (Call) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_CallToBoundary_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_CallToConnection_4012(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_CallToDecision_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBoundary_2005OutgoingLinks(View view) {
		Boundary modelElement = (Boundary) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Boundary_BoundaryToCall_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2006OutgoingLinks(View view) {
		Person modelElement = (Person) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Person_ToIsAttached_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_2007OutgoingLinks(View view) {
		IsAttached modelElement = (IsAttached) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_ToDevice_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_FromPerson_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDecision_2008OutgoingLinks(View view) {
		Decision modelElement = (Decision) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Decision_DecisionToCall_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Decision_DecisionToBoundary_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_2009OutgoingLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_ConnectionToCall_4007(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_FromDevice_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Person_ToIsAttached_4001(
			IsAttached target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getPerson_ToIsAttached()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.PersonToIsAttached_4001,
						PersonToIsAttachedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IsAttached_ToDevice_4002(
			Device target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getIsAttached_ToDevice()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.IsAttachedToDevice_4002,
						IsAttachedToDeviceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Decision_DecisionToCall_4003(
			Call target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getDecision_DecisionToCall()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.DecisionDecisionToCall_4003,
						DecisionDecisionToCallEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Form_ToParentForm_4004(
			Form target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getForm_ToParentForm()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.FormToParentForm_4004,
						FormToParentFormEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Boundary_BoundaryToCall_4005(
			Call target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getBoundary_BoundaryToCall()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.BoundaryBoundaryToCall_4005,
						BoundaryBoundaryToCallEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IsAttached_FromPerson_4006(
			Person target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getIsAttached_FromPerson()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.IsAttachedFromPerson_4006,
						IsAttachedFromPersonEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Connection_ConnectionToCall_4007(
			Call target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getConnection_ConnectionToCall()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.ConnectionConnectionToCall_4007,
						ConnectionConnectionToCallEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Connection_FromDevice_4008(
			Device target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getConnection_FromDevice()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.ConnectionFromDevice_4008,
						ConnectionFromDeviceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Form_ToConnection_4009(
			Connection target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getForm_ToConnection()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.FormToConnection_4009,
						FormToConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Device_ToConnection_4010(
			Connection target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getDevice_ToConnection()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.DeviceToConnection_4010,
						DeviceToConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Call_CallToBoundary_4011(
			Boundary target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getCall_CallToBoundary()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.CallCallToBoundary_4011,
						CallCallToBoundaryEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Call_CallToConnection_4012(
			Connection target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getCall_CallToConnection()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.CallCallToConnection_4012,
						CallCallToConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Decision_DecisionToBoundary_4013(
			Boundary target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getDecision_DecisionToBoundary()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.DecisionDecisionToBoundary_4013,
						DecisionDecisionToBoundaryEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Device_FromIsAttached_4014(
			IsAttached target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getDevice_FromIsAttached()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.DeviceFromIsAttached_4014,
						DeviceFromIsAttachedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Call_CallToDecision_4015(
			Decision target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getCall_CallToDecision()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.CallCallToDecision_4015,
						CallCallToDecisionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Medium_ToConnection_4016(
			Connection target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getMedium_ToConnection()) {
				result.add(new GcmlLinkDescriptor(setting.getEObject(), target,
						GcmlElementTypes.MediumToConnection_4016,
						MediumToConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Person_ToIsAttached_4001(
			Person source) {
		Collection result = new LinkedList();
		IsAttached destination = source.getToIsAttached();
		if (destination == null) {
			return result;
		}
		result.add(new GcmlLinkDescriptor(source, destination,
				GcmlElementTypes.PersonToIsAttached_4001,
				PersonToIsAttachedEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IsAttached_ToDevice_4002(
			IsAttached source) {
		Collection result = new LinkedList();
		Device destination = source.getToDevice();
		if (destination == null) {
			return result;
		}
		result.add(new GcmlLinkDescriptor(source, destination,
				GcmlElementTypes.IsAttachedToDevice_4002,
				IsAttachedToDeviceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Decision_DecisionToCall_4003(
			Decision source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getDecisionToCall().iterator(); destinations
				.hasNext();) {
			Call destination = (Call) destinations.next();
			result.add(new GcmlLinkDescriptor(source, destination,
					GcmlElementTypes.DecisionDecisionToCall_4003,
					DecisionDecisionToCallEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Form_ToParentForm_4004(
			Form source) {
		Collection result = new LinkedList();
		Form destination = source.getToParentForm();
		if (destination == null) {
			return result;
		}
		result.add(new GcmlLinkDescriptor(source, destination,
				GcmlElementTypes.FormToParentForm_4004,
				FormToParentFormEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Boundary_BoundaryToCall_4005(
			Boundary source) {
		Collection result = new LinkedList();
		Call destination = source.getBoundaryToCall();
		if (destination == null) {
			return result;
		}
		result.add(new GcmlLinkDescriptor(source, destination,
				GcmlElementTypes.BoundaryBoundaryToCall_4005,
				BoundaryBoundaryToCallEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IsAttached_FromPerson_4006(
			IsAttached source) {
		Collection result = new LinkedList();
		Person destination = source.getFromPerson();
		if (destination == null) {
			return result;
		}
		result.add(new GcmlLinkDescriptor(source, destination,
				GcmlElementTypes.IsAttachedFromPerson_4006,
				IsAttachedFromPersonEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Connection_ConnectionToCall_4007(
			Connection source) {
		Collection result = new LinkedList();
		Call destination = source.getConnectionToCall();
		if (destination == null) {
			return result;
		}
		result.add(new GcmlLinkDescriptor(source, destination,
				GcmlElementTypes.ConnectionConnectionToCall_4007,
				ConnectionConnectionToCallEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Connection_FromDevice_4008(
			Connection source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getFromDevice().iterator(); destinations
				.hasNext();) {
			Device destination = (Device) destinations.next();
			result.add(new GcmlLinkDescriptor(source, destination,
					GcmlElementTypes.ConnectionFromDevice_4008,
					ConnectionFromDeviceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Form_ToConnection_4009(
			Form source) {
		Collection result = new LinkedList();
		Connection destination = source.getToConnection();
		if (destination == null) {
			return result;
		}
		result.add(new GcmlLinkDescriptor(source, destination,
				GcmlElementTypes.FormToConnection_4009,
				FormToConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Device_ToConnection_4010(
			Device source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getToConnection().iterator(); destinations
				.hasNext();) {
			Connection destination = (Connection) destinations.next();
			result.add(new GcmlLinkDescriptor(source, destination,
					GcmlElementTypes.DeviceToConnection_4010,
					DeviceToConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Call_CallToBoundary_4011(
			Call source) {
		Collection result = new LinkedList();
		Boundary destination = source.getCallToBoundary();
		if (destination == null) {
			return result;
		}
		result.add(new GcmlLinkDescriptor(source, destination,
				GcmlElementTypes.CallCallToBoundary_4011,
				CallCallToBoundaryEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Call_CallToConnection_4012(
			Call source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getCallToConnection().iterator(); destinations
				.hasNext();) {
			Connection destination = (Connection) destinations.next();
			result.add(new GcmlLinkDescriptor(source, destination,
					GcmlElementTypes.CallCallToConnection_4012,
					CallCallToConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Decision_DecisionToBoundary_4013(
			Decision source) {
		Collection result = new LinkedList();
		Boundary destination = source.getDecisionToBoundary();
		if (destination == null) {
			return result;
		}
		result.add(new GcmlLinkDescriptor(source, destination,
				GcmlElementTypes.DecisionDecisionToBoundary_4013,
				DecisionDecisionToBoundaryEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Device_FromIsAttached_4014(
			Device source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getFromIsAttached().iterator(); destinations
				.hasNext();) {
			IsAttached destination = (IsAttached) destinations.next();
			result.add(new GcmlLinkDescriptor(source, destination,
					GcmlElementTypes.DeviceFromIsAttached_4014,
					DeviceFromIsAttachedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Call_CallToDecision_4015(
			Call source) {
		Collection result = new LinkedList();
		Decision destination = source.getCallToDecision();
		if (destination == null) {
			return result;
		}
		result.add(new GcmlLinkDescriptor(source, destination,
				GcmlElementTypes.CallCallToDecision_4015,
				CallCallToDecisionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Medium_ToConnection_4016(
			Medium source) {
		Collection result = new LinkedList();
		Connection destination = source.getToConnection();
		if (destination == null) {
			return result;
		}
		result.add(new GcmlLinkDescriptor(source, destination,
				GcmlElementTypes.MediumToConnection_4016,
				MediumToConnectionEditPart.VISUAL_ID));
		return result;
	}

}
