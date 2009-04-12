package gcml.diagram.part;

import gcml.Boundary;
import gcml.Call;
import gcml.Connection;
import gcml.Decision;
import gcml.Device;
import gcml.Form;
import gcml.GcmlPackage;
import gcml.IsAttached;
import gcml.Medium;
import gcml.Person;
import gcml.diagram.edit.parts.BoundaryEditPart;
import gcml.diagram.edit.parts.BoundaryToCallEditPart;
import gcml.diagram.edit.parts.BoundaryToDecisionEditPart;
import gcml.diagram.edit.parts.CallConnectionsEditPart;
import gcml.diagram.edit.parts.CallEditPart;
import gcml.diagram.edit.parts.CallFromCallEditPart;
import gcml.diagram.edit.parts.CallToBoundaryEditPart;
import gcml.diagram.edit.parts.ConnectionEditPart;
import gcml.diagram.edit.parts.ConnectionFromDeviceEditPart;
import gcml.diagram.edit.parts.DecisionEditPart;
import gcml.diagram.edit.parts.DecisionFromDecisionEditPart;
import gcml.diagram.edit.parts.DecisionFromDecisionToBoudaryEditPart;
import gcml.diagram.edit.parts.DeviceEditPart;
import gcml.diagram.edit.parts.DeviceFromIsAttachedEditPart;
import gcml.diagram.edit.parts.DeviceToConnectionEditPart;
import gcml.diagram.edit.parts.FormEditPart;
import gcml.diagram.edit.parts.FormToConnectionEditPart;
import gcml.diagram.edit.parts.FormToParentFormEditPart;
import gcml.diagram.edit.parts.IsAttachedEditPart;
import gcml.diagram.edit.parts.IsAttachedFromPersonEditPart;
import gcml.diagram.edit.parts.IsAttachedToDeviceEditPart;
import gcml.diagram.edit.parts.MediumEditPart;
import gcml.diagram.edit.parts.MediumToConnectionEditPart;
import gcml.diagram.edit.parts.MediumToFormEditPart;
import gcml.diagram.edit.parts.PersonEditPart;
import gcml.diagram.edit.parts.PersonToIsAttachedEditPart;
import gcml.diagram.edit.parts.WgcmlEditPart;
import gcml.diagram.providers.WgcmlElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WgcmlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (WgcmlVisualIDRegistry.getVisualID(view)) {
		case WgcmlEditPart.VISUAL_ID:
			return getWgcml_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWgcml_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		gcml.wgcml modelElement = (gcml.wgcml) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getConnection().iterator(); it
				.hasNext();) {
			Connection childElement = (Connection) it.next();
			int visualID = WgcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectionEditPart.VISUAL_ID) {
				result.add(new WgcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getPerson().iterator(); it.hasNext();) {
			Person childElement = (Person) it.next();
			int visualID = WgcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PersonEditPart.VISUAL_ID) {
				result.add(new WgcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMedium().iterator(); it.hasNext();) {
			Medium childElement = (Medium) it.next();
			int visualID = WgcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MediumEditPart.VISUAL_ID) {
				result.add(new WgcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getIsAttached().iterator(); it
				.hasNext();) {
			IsAttached childElement = (IsAttached) it.next();
			int visualID = WgcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IsAttachedEditPart.VISUAL_ID) {
				result.add(new WgcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getDevice().iterator(); it.hasNext();) {
			Device childElement = (Device) it.next();
			int visualID = WgcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DeviceEditPart.VISUAL_ID) {
				result.add(new WgcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getForm().iterator(); it.hasNext();) {
			Form childElement = (Form) it.next();
			int visualID = WgcmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FormEditPart.VISUAL_ID) {
				result.add(new WgcmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		Resource resource = modelElement.eResource();
		for (Iterator semanticIterator = getPhantomNodesIterator(resource); semanticIterator
				.hasNext();) {
			EObject childElement = (EObject) semanticIterator.next();
			if (childElement == modelElement) {
				continue;
			}
			if (WgcmlVisualIDRegistry.getNodeVisualID(view, childElement) == CallEditPart.VISUAL_ID) {
				result.add(new WgcmlNodeDescriptor(childElement,
						CallEditPart.VISUAL_ID));
				continue;
			}
			if (WgcmlVisualIDRegistry.getNodeVisualID(view, childElement) == BoundaryEditPart.VISUAL_ID) {
				result.add(new WgcmlNodeDescriptor(childElement,
						BoundaryEditPart.VISUAL_ID));
				continue;
			}
			if (WgcmlVisualIDRegistry.getNodeVisualID(view, childElement) == DecisionEditPart.VISUAL_ID) {
				result.add(new WgcmlNodeDescriptor(childElement,
						DecisionEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (WgcmlVisualIDRegistry.getVisualID(view)) {
		case WgcmlEditPart.VISUAL_ID:
			return getWgcml_1000ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2001ContainedLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_2002ContainedLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2003ContainedLinks(view);
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_2004ContainedLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2005ContainedLinks(view);
		case FormEditPart.VISUAL_ID:
			return getForm_2006ContainedLinks(view);
		case CallEditPart.VISUAL_ID:
			return getCall_2010ContainedLinks(view);
		case BoundaryEditPart.VISUAL_ID:
			return getBoundary_2011ContainedLinks(view);
		case DecisionEditPart.VISUAL_ID:
			return getDecision_2012ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (WgcmlVisualIDRegistry.getVisualID(view)) {
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2001IncomingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_2002IncomingLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2003IncomingLinks(view);
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_2004IncomingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2005IncomingLinks(view);
		case FormEditPart.VISUAL_ID:
			return getForm_2006IncomingLinks(view);
		case CallEditPart.VISUAL_ID:
			return getCall_2010IncomingLinks(view);
		case BoundaryEditPart.VISUAL_ID:
			return getBoundary_2011IncomingLinks(view);
		case DecisionEditPart.VISUAL_ID:
			return getDecision_2012IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (WgcmlVisualIDRegistry.getVisualID(view)) {
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2001OutgoingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_2002OutgoingLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2003OutgoingLinks(view);
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_2004OutgoingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2005OutgoingLinks(view);
		case FormEditPart.VISUAL_ID:
			return getForm_2006OutgoingLinks(view);
		case CallEditPart.VISUAL_ID:
			return getCall_2010OutgoingLinks(view);
		case BoundaryEditPart.VISUAL_ID:
			return getBoundary_2011OutgoingLinks(view);
		case DecisionEditPart.VISUAL_ID:
			return getDecision_2012OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWgcml_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConnection_2001ContainedLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_FromDevice_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2002ContainedLinks(View view) {
		Person modelElement = (Person) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Person_ToIsAttached_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMedium_2003ContainedLinks(View view) {
		Medium modelElement = (Medium) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Medium_ToConnection_4004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Medium_ToForm_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_2004ContainedLinks(View view) {
		IsAttached modelElement = (IsAttached) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_FromPerson_4007(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_ToDevice_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDevice_2005ContainedLinks(View view) {
		Device modelElement = (Device) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_FromIsAttached_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_ToConnection_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForm_2006ContainedLinks(View view) {
		Form modelElement = (Form) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Form_ToConnection_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Form_ToParentForm_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCall_2010ContainedLinks(View view) {
		Call modelElement = (Call) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_ToBoundary_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_FromCall_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_Connections_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBoundary_2011ContainedLinks(View view) {
		Boundary modelElement = (Boundary) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Boundary_ToCall_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Boundary_ToDecision_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDecision_2012ContainedLinks(View view) {
		Decision modelElement = (Decision) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Decision_FromDecisionToBoudary_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Decision_FromDecision_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_2001IncomingLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Device_ToConnection_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Medium_ToConnection_4004(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Form_ToConnection_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Call_Connections_4017(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2002IncomingLinks(View view) {
		Person modelElement = (Person) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_IsAttached_FromPerson_4007(
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
	public static List getIsAttached_2004IncomingLinks(View view) {
		IsAttached modelElement = (IsAttached) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Person_ToIsAttached_4001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Device_FromIsAttached_4003(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDevice_2005IncomingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Connection_FromDevice_4005(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_IsAttached_ToDevice_4008(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForm_2006IncomingLinks(View view) {
		Form modelElement = (Form) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Medium_ToForm_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Form_ToParentForm_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCall_2010IncomingLinks(View view) {
		Call modelElement = (Call) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Decision_FromDecision_4012(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Boundary_ToCall_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBoundary_2011IncomingLinks(View view) {
		Boundary modelElement = (Boundary) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Decision_FromDecisionToBoudary_4011(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Call_ToBoundary_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDecision_2012IncomingLinks(View view) {
		Decision modelElement = (Decision) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Call_FromCall_4014(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Boundary_ToDecision_4016(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_2001OutgoingLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_FromDevice_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2002OutgoingLinks(View view) {
		Person modelElement = (Person) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Person_ToIsAttached_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMedium_2003OutgoingLinks(View view) {
		Medium modelElement = (Medium) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Medium_ToConnection_4004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Medium_ToForm_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_2004OutgoingLinks(View view) {
		IsAttached modelElement = (IsAttached) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_FromPerson_4007(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_ToDevice_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDevice_2005OutgoingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_FromIsAttached_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_ToConnection_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForm_2006OutgoingLinks(View view) {
		Form modelElement = (Form) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Form_ToConnection_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Form_ToParentForm_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCall_2010OutgoingLinks(View view) {
		Call modelElement = (Call) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_ToBoundary_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_FromCall_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Call_Connections_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBoundary_2011OutgoingLinks(View view) {
		Boundary modelElement = (Boundary) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Boundary_ToCall_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Boundary_ToDecision_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDecision_2012OutgoingLinks(View view) {
		Decision modelElement = (Decision) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Decision_FromDecisionToBoudary_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Decision_FromDecision_4012(modelElement));
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
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.PersonToIsAttached_4001,
						PersonToIsAttachedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Device_FromIsAttached_4003(
			IsAttached target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getDevice_FromIsAttached()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.DeviceFromIsAttached_4003,
						DeviceFromIsAttachedEditPart.VISUAL_ID));
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
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.DeviceToConnection_4010,
						DeviceToConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Medium_ToConnection_4004(
			Connection target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getMedium_ToConnection()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.MediumToConnection_4004,
						MediumToConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Medium_ToForm_4006(
			Form target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getMedium_ToForm()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.MediumToForm_4006,
						MediumToFormEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Connection_FromDevice_4005(
			Device target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getConnection_FromDevice()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.ConnectionFromDevice_4005,
						ConnectionFromDeviceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IsAttached_FromPerson_4007(
			Person target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getIsAttached_FromPerson()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.IsAttachedFromPerson_4007,
						IsAttachedFromPersonEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IsAttached_ToDevice_4008(
			Device target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getIsAttached_ToDevice()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.IsAttachedToDevice_4008,
						IsAttachedToDeviceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Form_ToConnection_4002(
			Connection target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getForm_ToConnection()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.FormToConnection_4002,
						FormToConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Form_ToParentForm_4009(
			Form target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getForm_ToParentForm()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.FormToParentForm_4009,
						FormToParentFormEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Decision_FromDecisionToBoudary_4011(
			Boundary target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getDecision_FromDecisionToBoudary()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target,
						WgcmlElementTypes.DecisionFromDecisionToBoudary_4011,
						DecisionFromDecisionToBoudaryEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Decision_FromDecision_4012(
			Call target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getDecision_FromDecision()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.DecisionFromDecision_4012,
						DecisionFromDecisionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Call_ToBoundary_4013(
			Boundary target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getCall_ToBoundary()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.CallToBoundary_4013,
						CallToBoundaryEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Call_FromCall_4014(
			Decision target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getCall_FromCall()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.CallFromCall_4014,
						CallFromCallEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Boundary_ToCall_4015(
			Call target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getBoundary_ToCall()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.BoundaryToCall_4015,
						BoundaryToCallEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Boundary_ToDecision_4016(
			Decision target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getBoundary_ToDecision()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.BoundaryToDecision_4016,
						BoundaryToDecisionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Call_Connections_4017(
			Connection target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getCall_Connections()) {
				result.add(new WgcmlLinkDescriptor(setting.getEObject(),
						target, WgcmlElementTypes.CallConnections_4017,
						CallConnectionsEditPart.VISUAL_ID));
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
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.PersonToIsAttached_4001,
				PersonToIsAttachedEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Device_FromIsAttached_4003(
			Device source) {
		Collection result = new LinkedList();
		IsAttached destination = source.getFromIsAttached();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.DeviceFromIsAttached_4003,
				DeviceFromIsAttachedEditPart.VISUAL_ID));
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
			result.add(new WgcmlLinkDescriptor(source, destination,
					WgcmlElementTypes.DeviceToConnection_4010,
					DeviceToConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Medium_ToConnection_4004(
			Medium source) {
		Collection result = new LinkedList();
		Connection destination = source.getToConnection();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.MediumToConnection_4004,
				MediumToConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Medium_ToForm_4006(
			Medium source) {
		Collection result = new LinkedList();
		Form destination = source.getToForm();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.MediumToForm_4006,
				MediumToFormEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Connection_FromDevice_4005(
			Connection source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getFromDevice().iterator(); destinations
				.hasNext();) {
			Device destination = (Device) destinations.next();
			result.add(new WgcmlLinkDescriptor(source, destination,
					WgcmlElementTypes.ConnectionFromDevice_4005,
					ConnectionFromDeviceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IsAttached_FromPerson_4007(
			IsAttached source) {
		Collection result = new LinkedList();
		Person destination = source.getFromPerson();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.IsAttachedFromPerson_4007,
				IsAttachedFromPersonEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IsAttached_ToDevice_4008(
			IsAttached source) {
		Collection result = new LinkedList();
		Device destination = source.getToDevice();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.IsAttachedToDevice_4008,
				IsAttachedToDeviceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Form_ToConnection_4002(
			Form source) {
		Collection result = new LinkedList();
		Connection destination = source.getToConnection();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.FormToConnection_4002,
				FormToConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Form_ToParentForm_4009(
			Form source) {
		Collection result = new LinkedList();
		Form destination = source.getToParentForm();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.FormToParentForm_4009,
				FormToParentFormEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Decision_FromDecisionToBoudary_4011(
			Decision source) {
		Collection result = new LinkedList();
		Boundary destination = source.getFromDecisionToBoudary();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.DecisionFromDecisionToBoudary_4011,
				DecisionFromDecisionToBoudaryEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Decision_FromDecision_4012(
			Decision source) {
		Collection result = new LinkedList();
		Call destination = source.getFromDecision();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.DecisionFromDecision_4012,
				DecisionFromDecisionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Call_ToBoundary_4013(
			Call source) {
		Collection result = new LinkedList();
		Boundary destination = source.getToBoundary();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.CallToBoundary_4013,
				CallToBoundaryEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Call_FromCall_4014(
			Call source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getFromCall().iterator(); destinations
				.hasNext();) {
			Decision destination = (Decision) destinations.next();
			result.add(new WgcmlLinkDescriptor(source, destination,
					WgcmlElementTypes.CallFromCall_4014,
					CallFromCallEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Boundary_ToCall_4015(
			Boundary source) {
		Collection result = new LinkedList();
		Call destination = source.getToCall();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.BoundaryToCall_4015,
				BoundaryToCallEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Boundary_ToDecision_4016(
			Boundary source) {
		Collection result = new LinkedList();
		Decision destination = source.getToDecision();
		if (destination == null) {
			return result;
		}
		result.add(new WgcmlLinkDescriptor(source, destination,
				WgcmlElementTypes.BoundaryToDecision_4016,
				BoundaryToDecisionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Call_Connections_4017(
			Call source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getConnections().iterator(); destinations
				.hasNext();) {
			Connection destination = (Connection) destinations.next();
			result.add(new WgcmlLinkDescriptor(source, destination,
					WgcmlElementTypes.CallConnections_4017,
					CallConnectionsEditPart.VISUAL_ID));
		}
		return result;
	}

}
