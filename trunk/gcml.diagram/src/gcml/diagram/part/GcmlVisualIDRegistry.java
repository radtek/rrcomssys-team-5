package gcml.diagram.part;

import gcml.Gcml;
import gcml.GcmlPackage;
import gcml.diagram.edit.parts.BoundaryActivityIDEditPart;
import gcml.diagram.edit.parts.BoundaryEditPart;
import gcml.diagram.edit.parts.BoundaryTypeEditPart;
import gcml.diagram.edit.parts.CallActivityIDEditPart;
import gcml.diagram.edit.parts.CallEditPart;
import gcml.diagram.edit.parts.CallOutcomeEditPart;
import gcml.diagram.edit.parts.ConnectionBandwidthEditPart;
import gcml.diagram.edit.parts.ConnectionConnectionIDEditPart;
import gcml.diagram.edit.parts.ConnectionEditPart;
import gcml.diagram.edit.parts.DecisionActivityIDEditPart;
import gcml.diagram.edit.parts.DecisionEditPart;
import gcml.diagram.edit.parts.DecisionFailPathIDEditPart;
import gcml.diagram.edit.parts.DecisionSourceActivityIDEditPart;
import gcml.diagram.edit.parts.DecisionSuccessPathIDEditPart;
import gcml.diagram.edit.parts.DeviceDeviceCapabilityEditPart;
import gcml.diagram.edit.parts.DeviceEditPart;
import gcml.diagram.edit.parts.DeviceIsLocalEditPart;
import gcml.diagram.edit.parts.DeviceIsVirtualEditPart;
import gcml.diagram.edit.parts.FormActionEditPart;
import gcml.diagram.edit.parts.FormEditPart;
import gcml.diagram.edit.parts.FormFormTypeNameEditPart;
import gcml.diagram.edit.parts.FormMediumDataTypeEditPart;
import gcml.diagram.edit.parts.FormSuggestedApplicationEditPart;
import gcml.diagram.edit.parts.FormVoiceCommandEditPart;
import gcml.diagram.edit.parts.GcmlEditPart;
import gcml.diagram.edit.parts.IsAttachedEditPart;
import gcml.diagram.edit.parts.MediumDerivedFromBuiltInTypeEditPart;
import gcml.diagram.edit.parts.MediumEditPart;
import gcml.diagram.edit.parts.MediumMediumTypeNameEditPart;
import gcml.diagram.edit.parts.MediumSuggestedApplicationEditPart;
import gcml.diagram.edit.parts.MediumVoiceCommandEditPart;
import gcml.diagram.edit.parts.PersonEditPart;

import gcml.diagram.edit.parts.PersonPersonIDEditPart;
import gcml.diagram.edit.parts.PersonPersonNameEditPart;
import gcml.diagram.edit.parts.PersonPersonRoleEditPart;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GcmlVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "gcml.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GcmlEditPart.MODEL_ID.equals(view.getType())) {
				return GcmlEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return gcml.diagram.part.GcmlVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GcmlDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GcmlPackage.eINSTANCE.getGcml().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Gcml) domainElement)) {
			return GcmlEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = gcml.diagram.part.GcmlVisualIDRegistry
				.getModelID(containerView);
		if (!GcmlEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (GcmlEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gcml.diagram.part.GcmlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GcmlEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GcmlEditPart.VISUAL_ID:
			if (GcmlPackage.eINSTANCE.getDevice().isSuperTypeOf(
					domainElement.eClass())) {
				return DeviceEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getForm().isSuperTypeOf(
					domainElement.eClass())) {
				return FormEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getMedium().isSuperTypeOf(
					domainElement.eClass())) {
				return MediumEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getCall().isSuperTypeOf(
					domainElement.eClass())) {
				return CallEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getBoundary().isSuperTypeOf(
					domainElement.eClass())) {
				return BoundaryEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getPerson().isSuperTypeOf(
					domainElement.eClass())) {
				return PersonEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getIsAttached().isSuperTypeOf(
					domainElement.eClass())) {
				return IsAttachedEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getDecision().isSuperTypeOf(
					domainElement.eClass())) {
				return DecisionEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getConnection().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = gcml.diagram.part.GcmlVisualIDRegistry
				.getModelID(containerView);
		if (!GcmlEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (GcmlEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gcml.diagram.part.GcmlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GcmlEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DeviceEditPart.VISUAL_ID:
			if (DeviceDeviceCapabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceIsLocalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceIsVirtualEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormEditPart.VISUAL_ID:
			if (FormActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormFormTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormMediumDataTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormSuggestedApplicationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormVoiceCommandEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediumEditPart.VISUAL_ID:
			if (MediumDerivedFromBuiltInTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediumMediumTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediumSuggestedApplicationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediumVoiceCommandEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallEditPart.VISUAL_ID:
			if (CallActivityIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOutcomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BoundaryEditPart.VISUAL_ID:
			if (BoundaryActivityIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BoundaryTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PersonEditPart.VISUAL_ID:
			if (PersonPersonIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PersonPersonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PersonPersonRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DecisionEditPart.VISUAL_ID:
			if (DecisionActivityIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionFailPathIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionSourceActivityIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionSuccessPathIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionEditPart.VISUAL_ID:
			if (ConnectionBandwidthEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionConnectionIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GcmlEditPart.VISUAL_ID:
			if (DeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediumEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BoundaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PersonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IsAttachedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Gcml element) {
		return true;
	}

}
