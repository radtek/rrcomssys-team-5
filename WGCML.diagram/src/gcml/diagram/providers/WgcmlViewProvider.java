package gcml.diagram.providers;

import gcml.diagram.edit.parts.BoundaryActivityIdEditPart;
import gcml.diagram.edit.parts.BoundaryEditPart;
import gcml.diagram.edit.parts.BoundaryNameEditPart;
import gcml.diagram.edit.parts.BoundaryOutcomeEditPart;
import gcml.diagram.edit.parts.BoundaryToCallEditPart;
import gcml.diagram.edit.parts.BoundaryToDecisionEditPart;
import gcml.diagram.edit.parts.BoundaryTypeEditPart;
import gcml.diagram.edit.parts.CallActivityIdEditPart;
import gcml.diagram.edit.parts.CallConnectionsEditPart;
import gcml.diagram.edit.parts.CallEditPart;
import gcml.diagram.edit.parts.CallFromCallEditPart;
import gcml.diagram.edit.parts.CallOutcomeEditPart;
import gcml.diagram.edit.parts.CallToBoundaryEditPart;
import gcml.diagram.edit.parts.ConnectionBandwidthEditPart;
import gcml.diagram.edit.parts.ConnectionConnectionIDEditPart;
import gcml.diagram.edit.parts.ConnectionEditPart;
import gcml.diagram.edit.parts.ConnectionFromDeviceEditPart;
import gcml.diagram.edit.parts.DecisionActivityIdEditPart;
import gcml.diagram.edit.parts.DecisionAlternatePathIDEditPart;
import gcml.diagram.edit.parts.DecisionEditPart;
import gcml.diagram.edit.parts.DecisionFromDecisionEditPart;
import gcml.diagram.edit.parts.DecisionFromDecisionToBoudaryEditPart;
import gcml.diagram.edit.parts.DecisionOutcomeEditPart;
import gcml.diagram.edit.parts.DecisionSourceActivityIDEditPart;
import gcml.diagram.edit.parts.DecisionSuccessPathIDEditPart;
import gcml.diagram.edit.parts.DeviceDeviceCapabilityEditPart;
import gcml.diagram.edit.parts.DeviceEditPart;
import gcml.diagram.edit.parts.DeviceFromIsAttachedEditPart;
import gcml.diagram.edit.parts.DeviceIsLocalEditPart;
import gcml.diagram.edit.parts.DeviceIsVirtualEditPart;
import gcml.diagram.edit.parts.DeviceToConnectionEditPart;
import gcml.diagram.edit.parts.FormActionEditPart;
import gcml.diagram.edit.parts.FormEditPart;
import gcml.diagram.edit.parts.FormFormDataTypeEditPart;
import gcml.diagram.edit.parts.FormFormNameEditPart;
import gcml.diagram.edit.parts.FormSuggestedApplicationEditPart;
import gcml.diagram.edit.parts.FormToConnectionEditPart;
import gcml.diagram.edit.parts.FormToParentFormEditPart;
import gcml.diagram.edit.parts.FormVoiceCommandEditPart;
import gcml.diagram.edit.parts.IsAttachedEditPart;
import gcml.diagram.edit.parts.IsAttachedFromPersonEditPart;
import gcml.diagram.edit.parts.IsAttachedToDeviceEditPart;
import gcml.diagram.edit.parts.MediumEditPart;
import gcml.diagram.edit.parts.MediumMediumDataTypeEditPart;
import gcml.diagram.edit.parts.MediumMediumNameEditPart;
import gcml.diagram.edit.parts.MediumSuggestedApplicationEditPart;
import gcml.diagram.edit.parts.MediumToConnectionEditPart;
import gcml.diagram.edit.parts.MediumToFormEditPart;
import gcml.diagram.edit.parts.MediumVoiceCommandEditPart;
import gcml.diagram.edit.parts.PersonEditPart;
import gcml.diagram.edit.parts.PersonPersonIDEditPart;
import gcml.diagram.edit.parts.PersonPersonNameEditPart;
import gcml.diagram.edit.parts.PersonPersonRoleEditPart;
import gcml.diagram.edit.parts.PersonToIsAttachedEditPart;
import gcml.diagram.edit.parts.WgcmlEditPart;
import gcml.diagram.part.WgcmlVisualIDRegistry;
import gcml.diagram.view.factories.BoundaryActivityIdViewFactory;
import gcml.diagram.view.factories.BoundaryNameViewFactory;
import gcml.diagram.view.factories.BoundaryOutcomeViewFactory;
import gcml.diagram.view.factories.BoundaryToCallViewFactory;
import gcml.diagram.view.factories.BoundaryToDecisionViewFactory;
import gcml.diagram.view.factories.BoundaryTypeViewFactory;
import gcml.diagram.view.factories.BoundaryViewFactory;
import gcml.diagram.view.factories.CallActivityIdViewFactory;
import gcml.diagram.view.factories.CallConnectionsViewFactory;
import gcml.diagram.view.factories.CallFromCallViewFactory;
import gcml.diagram.view.factories.CallOutcomeViewFactory;
import gcml.diagram.view.factories.CallToBoundaryViewFactory;
import gcml.diagram.view.factories.CallViewFactory;
import gcml.diagram.view.factories.ConnectionBandwidthViewFactory;
import gcml.diagram.view.factories.ConnectionConnectionIDViewFactory;
import gcml.diagram.view.factories.ConnectionFromDeviceViewFactory;
import gcml.diagram.view.factories.ConnectionViewFactory;
import gcml.diagram.view.factories.DecisionActivityIdViewFactory;
import gcml.diagram.view.factories.DecisionAlternatePathIDViewFactory;
import gcml.diagram.view.factories.DecisionFromDecisionToBoudaryViewFactory;
import gcml.diagram.view.factories.DecisionFromDecisionViewFactory;
import gcml.diagram.view.factories.DecisionOutcomeViewFactory;
import gcml.diagram.view.factories.DecisionSourceActivityIDViewFactory;
import gcml.diagram.view.factories.DecisionSuccessPathIDViewFactory;
import gcml.diagram.view.factories.DecisionViewFactory;
import gcml.diagram.view.factories.DeviceDeviceCapabilityViewFactory;
import gcml.diagram.view.factories.DeviceFromIsAttachedViewFactory;
import gcml.diagram.view.factories.DeviceIsLocalViewFactory;
import gcml.diagram.view.factories.DeviceIsVirtualViewFactory;
import gcml.diagram.view.factories.DeviceToConnectionViewFactory;
import gcml.diagram.view.factories.DeviceViewFactory;
import gcml.diagram.view.factories.FormActionViewFactory;
import gcml.diagram.view.factories.FormFormDataTypeViewFactory;
import gcml.diagram.view.factories.FormFormNameViewFactory;
import gcml.diagram.view.factories.FormSuggestedApplicationViewFactory;
import gcml.diagram.view.factories.FormToConnectionViewFactory;
import gcml.diagram.view.factories.FormToParentFormViewFactory;
import gcml.diagram.view.factories.FormViewFactory;
import gcml.diagram.view.factories.FormVoiceCommandViewFactory;
import gcml.diagram.view.factories.IsAttachedFromPersonViewFactory;
import gcml.diagram.view.factories.IsAttachedToDeviceViewFactory;
import gcml.diagram.view.factories.IsAttachedViewFactory;
import gcml.diagram.view.factories.MediumMediumDataTypeViewFactory;
import gcml.diagram.view.factories.MediumMediumNameViewFactory;
import gcml.diagram.view.factories.MediumSuggestedApplicationViewFactory;
import gcml.diagram.view.factories.MediumToConnectionViewFactory;
import gcml.diagram.view.factories.MediumToFormViewFactory;
import gcml.diagram.view.factories.MediumViewFactory;
import gcml.diagram.view.factories.MediumVoiceCommandViewFactory;
import gcml.diagram.view.factories.PersonPersonIDViewFactory;
import gcml.diagram.view.factories.PersonPersonNameViewFactory;
import gcml.diagram.view.factories.PersonPersonRoleViewFactory;
import gcml.diagram.view.factories.PersonToIsAttachedViewFactory;
import gcml.diagram.view.factories.PersonViewFactory;
import gcml.diagram.view.factories.WgcmlViewFactory;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WgcmlViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (WgcmlEditPart.MODEL_ID.equals(diagramKind)
				&& WgcmlVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return WgcmlViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = WgcmlVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = WgcmlVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!WgcmlElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != WgcmlVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!WgcmlEditPart.MODEL_ID.equals(WgcmlVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case ConnectionEditPart.VISUAL_ID:
				case PersonEditPart.VISUAL_ID:
				case MediumEditPart.VISUAL_ID:
				case IsAttachedEditPart.VISUAL_ID:
				case DeviceEditPart.VISUAL_ID:
				case FormEditPart.VISUAL_ID:
				case CallEditPart.VISUAL_ID:
				case BoundaryEditPart.VISUAL_ID:
				case DecisionEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != WgcmlVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case ConnectionBandwidthEditPart.VISUAL_ID:
				case ConnectionConnectionIDEditPart.VISUAL_ID:
					if (ConnectionEditPart.VISUAL_ID != WgcmlVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PersonPersonNameEditPart.VISUAL_ID:
				case PersonPersonIDEditPart.VISUAL_ID:
				case PersonPersonRoleEditPart.VISUAL_ID:
					if (PersonEditPart.VISUAL_ID != WgcmlVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case MediumMediumDataTypeEditPart.VISUAL_ID:
				case MediumMediumNameEditPart.VISUAL_ID:
				case MediumSuggestedApplicationEditPart.VISUAL_ID:
				case MediumVoiceCommandEditPart.VISUAL_ID:
					if (MediumEditPart.VISUAL_ID != WgcmlVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DeviceDeviceCapabilityEditPart.VISUAL_ID:
				case DeviceIsLocalEditPart.VISUAL_ID:
				case DeviceIsVirtualEditPart.VISUAL_ID:
					if (DeviceEditPart.VISUAL_ID != WgcmlVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case FormActionEditPart.VISUAL_ID:
				case FormFormDataTypeEditPart.VISUAL_ID:
				case FormFormNameEditPart.VISUAL_ID:
				case FormSuggestedApplicationEditPart.VISUAL_ID:
				case FormVoiceCommandEditPart.VISUAL_ID:
					if (FormEditPart.VISUAL_ID != WgcmlVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallActivityIdEditPart.VISUAL_ID:
				case CallOutcomeEditPart.VISUAL_ID:
					if (CallEditPart.VISUAL_ID != WgcmlVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case BoundaryActivityIdEditPart.VISUAL_ID:
				case BoundaryNameEditPart.VISUAL_ID:
				case BoundaryOutcomeEditPart.VISUAL_ID:
				case BoundaryTypeEditPart.VISUAL_ID:
					if (BoundaryEditPart.VISUAL_ID != WgcmlVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DecisionSourceActivityIDEditPart.VISUAL_ID:
				case DecisionActivityIdEditPart.VISUAL_ID:
				case DecisionAlternatePathIDEditPart.VISUAL_ID:
				case DecisionSuccessPathIDEditPart.VISUAL_ID:
				case DecisionOutcomeEditPart.VISUAL_ID:
					if (DecisionEditPart.VISUAL_ID != WgcmlVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !WgcmlVisualIDRegistry
						.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case ConnectionEditPart.VISUAL_ID:
			return ConnectionViewFactory.class;
		case ConnectionBandwidthEditPart.VISUAL_ID:
			return ConnectionBandwidthViewFactory.class;
		case ConnectionConnectionIDEditPart.VISUAL_ID:
			return ConnectionConnectionIDViewFactory.class;
		case PersonEditPart.VISUAL_ID:
			return PersonViewFactory.class;
		case PersonPersonNameEditPart.VISUAL_ID:
			return PersonPersonNameViewFactory.class;
		case PersonPersonIDEditPart.VISUAL_ID:
			return PersonPersonIDViewFactory.class;
		case PersonPersonRoleEditPart.VISUAL_ID:
			return PersonPersonRoleViewFactory.class;
		case MediumEditPart.VISUAL_ID:
			return MediumViewFactory.class;
		case MediumMediumDataTypeEditPart.VISUAL_ID:
			return MediumMediumDataTypeViewFactory.class;
		case MediumMediumNameEditPart.VISUAL_ID:
			return MediumMediumNameViewFactory.class;
		case MediumSuggestedApplicationEditPart.VISUAL_ID:
			return MediumSuggestedApplicationViewFactory.class;
		case MediumVoiceCommandEditPart.VISUAL_ID:
			return MediumVoiceCommandViewFactory.class;
		case IsAttachedEditPart.VISUAL_ID:
			return IsAttachedViewFactory.class;
		case DeviceEditPart.VISUAL_ID:
			return DeviceViewFactory.class;
		case DeviceDeviceCapabilityEditPart.VISUAL_ID:
			return DeviceDeviceCapabilityViewFactory.class;
		case DeviceIsLocalEditPart.VISUAL_ID:
			return DeviceIsLocalViewFactory.class;
		case DeviceIsVirtualEditPart.VISUAL_ID:
			return DeviceIsVirtualViewFactory.class;
		case FormEditPart.VISUAL_ID:
			return FormViewFactory.class;
		case FormActionEditPart.VISUAL_ID:
			return FormActionViewFactory.class;
		case FormFormDataTypeEditPart.VISUAL_ID:
			return FormFormDataTypeViewFactory.class;
		case FormFormNameEditPart.VISUAL_ID:
			return FormFormNameViewFactory.class;
		case FormSuggestedApplicationEditPart.VISUAL_ID:
			return FormSuggestedApplicationViewFactory.class;
		case FormVoiceCommandEditPart.VISUAL_ID:
			return FormVoiceCommandViewFactory.class;
		case CallEditPart.VISUAL_ID:
			return CallViewFactory.class;
		case CallActivityIdEditPart.VISUAL_ID:
			return CallActivityIdViewFactory.class;
		case CallOutcomeEditPart.VISUAL_ID:
			return CallOutcomeViewFactory.class;
		case BoundaryEditPart.VISUAL_ID:
			return BoundaryViewFactory.class;
		case BoundaryActivityIdEditPart.VISUAL_ID:
			return BoundaryActivityIdViewFactory.class;
		case BoundaryNameEditPart.VISUAL_ID:
			return BoundaryNameViewFactory.class;
		case BoundaryOutcomeEditPart.VISUAL_ID:
			return BoundaryOutcomeViewFactory.class;
		case BoundaryTypeEditPart.VISUAL_ID:
			return BoundaryTypeViewFactory.class;
		case DecisionEditPart.VISUAL_ID:
			return DecisionViewFactory.class;
		case DecisionSourceActivityIDEditPart.VISUAL_ID:
			return DecisionSourceActivityIDViewFactory.class;
		case DecisionActivityIdEditPart.VISUAL_ID:
			return DecisionActivityIdViewFactory.class;
		case DecisionAlternatePathIDEditPart.VISUAL_ID:
			return DecisionAlternatePathIDViewFactory.class;
		case DecisionSuccessPathIDEditPart.VISUAL_ID:
			return DecisionSuccessPathIDViewFactory.class;
		case DecisionOutcomeEditPart.VISUAL_ID:
			return DecisionOutcomeViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!WgcmlElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = WgcmlVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != WgcmlVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case PersonToIsAttachedEditPart.VISUAL_ID:
			return PersonToIsAttachedViewFactory.class;
		case DeviceFromIsAttachedEditPart.VISUAL_ID:
			return DeviceFromIsAttachedViewFactory.class;
		case DeviceToConnectionEditPart.VISUAL_ID:
			return DeviceToConnectionViewFactory.class;
		case MediumToConnectionEditPart.VISUAL_ID:
			return MediumToConnectionViewFactory.class;
		case MediumToFormEditPart.VISUAL_ID:
			return MediumToFormViewFactory.class;
		case ConnectionFromDeviceEditPart.VISUAL_ID:
			return ConnectionFromDeviceViewFactory.class;
		case IsAttachedFromPersonEditPart.VISUAL_ID:
			return IsAttachedFromPersonViewFactory.class;
		case IsAttachedToDeviceEditPart.VISUAL_ID:
			return IsAttachedToDeviceViewFactory.class;
		case FormToConnectionEditPart.VISUAL_ID:
			return FormToConnectionViewFactory.class;
		case FormToParentFormEditPart.VISUAL_ID:
			return FormToParentFormViewFactory.class;
		case DecisionFromDecisionToBoudaryEditPart.VISUAL_ID:
			return DecisionFromDecisionToBoudaryViewFactory.class;
		case DecisionFromDecisionEditPart.VISUAL_ID:
			return DecisionFromDecisionViewFactory.class;
		case CallToBoundaryEditPart.VISUAL_ID:
			return CallToBoundaryViewFactory.class;
		case CallFromCallEditPart.VISUAL_ID:
			return CallFromCallViewFactory.class;
		case BoundaryToCallEditPart.VISUAL_ID:
			return BoundaryToCallViewFactory.class;
		case BoundaryToDecisionEditPart.VISUAL_ID:
			return BoundaryToDecisionViewFactory.class;
		case CallConnectionsEditPart.VISUAL_ID:
			return CallConnectionsViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
