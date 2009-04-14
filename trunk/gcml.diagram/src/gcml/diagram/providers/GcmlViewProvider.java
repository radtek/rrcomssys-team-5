package gcml.diagram.providers;

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
import gcml.diagram.part.GcmlVisualIDRegistry;
import gcml.diagram.view.factories.BoundaryBoundaryToCallViewFactory;
import gcml.diagram.view.factories.BoundaryViewFactory;
import gcml.diagram.view.factories.CallCallToBoundaryViewFactory;
import gcml.diagram.view.factories.CallCallToConnectionViewFactory;
import gcml.diagram.view.factories.CallCallToDecisionViewFactory;
import gcml.diagram.view.factories.CallViewFactory;
import gcml.diagram.view.factories.ConnectionConnectionToCallViewFactory;
import gcml.diagram.view.factories.ConnectionFromDeviceViewFactory;
import gcml.diagram.view.factories.ConnectionViewFactory;
import gcml.diagram.view.factories.DecisionDecisionToBoundaryViewFactory;
import gcml.diagram.view.factories.DecisionDecisionToCallViewFactory;
import gcml.diagram.view.factories.DecisionViewFactory;
import gcml.diagram.view.factories.DeviceFromIsAttachedViewFactory;
import gcml.diagram.view.factories.DeviceToConnectionViewFactory;
import gcml.diagram.view.factories.DeviceViewFactory;
import gcml.diagram.view.factories.FormToConnectionViewFactory;
import gcml.diagram.view.factories.FormToParentFormViewFactory;
import gcml.diagram.view.factories.FormViewFactory;
import gcml.diagram.view.factories.GcmlViewFactory;
import gcml.diagram.view.factories.IsAttachedFromPersonViewFactory;
import gcml.diagram.view.factories.IsAttachedToDeviceViewFactory;
import gcml.diagram.view.factories.IsAttachedViewFactory;
import gcml.diagram.view.factories.MediumToConnectionViewFactory;
import gcml.diagram.view.factories.MediumViewFactory;
import gcml.diagram.view.factories.PersonToIsAttachedViewFactory;
import gcml.diagram.view.factories.PersonViewFactory;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GcmlViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (GcmlEditPart.MODEL_ID.equals(diagramKind)
				&& GcmlVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return GcmlViewFactory.class;
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
			visualID = GcmlVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = GcmlVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!GcmlElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != GcmlVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!GcmlEditPart.MODEL_ID.equals(GcmlVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case DeviceEditPart.VISUAL_ID:
				case FormEditPart.VISUAL_ID:
				case MediumEditPart.VISUAL_ID:
				case CallEditPart.VISUAL_ID:
				case BoundaryEditPart.VISUAL_ID:
				case PersonEditPart.VISUAL_ID:
				case IsAttachedEditPart.VISUAL_ID:
				case DecisionEditPart.VISUAL_ID:
				case ConnectionEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != GcmlVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
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
				|| !GcmlVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case DeviceEditPart.VISUAL_ID:
			return DeviceViewFactory.class;
		case FormEditPart.VISUAL_ID:
			return FormViewFactory.class;
		case MediumEditPart.VISUAL_ID:
			return MediumViewFactory.class;
		case CallEditPart.VISUAL_ID:
			return CallViewFactory.class;
		case BoundaryEditPart.VISUAL_ID:
			return BoundaryViewFactory.class;
		case PersonEditPart.VISUAL_ID:
			return PersonViewFactory.class;
		case IsAttachedEditPart.VISUAL_ID:
			return IsAttachedViewFactory.class;
		case DecisionEditPart.VISUAL_ID:
			return DecisionViewFactory.class;
		case ConnectionEditPart.VISUAL_ID:
			return ConnectionViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!GcmlElementTypes.isKnownElementType(elementType)
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
		int visualID = GcmlVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != GcmlVisualIDRegistry
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
		case IsAttachedToDeviceEditPart.VISUAL_ID:
			return IsAttachedToDeviceViewFactory.class;
		case DecisionDecisionToCallEditPart.VISUAL_ID:
			return DecisionDecisionToCallViewFactory.class;
		case FormToParentFormEditPart.VISUAL_ID:
			return FormToParentFormViewFactory.class;
		case BoundaryBoundaryToCallEditPart.VISUAL_ID:
			return BoundaryBoundaryToCallViewFactory.class;
		case IsAttachedFromPersonEditPart.VISUAL_ID:
			return IsAttachedFromPersonViewFactory.class;
		case ConnectionConnectionToCallEditPart.VISUAL_ID:
			return ConnectionConnectionToCallViewFactory.class;
		case ConnectionFromDeviceEditPart.VISUAL_ID:
			return ConnectionFromDeviceViewFactory.class;
		case FormToConnectionEditPart.VISUAL_ID:
			return FormToConnectionViewFactory.class;
		case DeviceToConnectionEditPart.VISUAL_ID:
			return DeviceToConnectionViewFactory.class;
		case CallCallToBoundaryEditPart.VISUAL_ID:
			return CallCallToBoundaryViewFactory.class;
		case CallCallToConnectionEditPart.VISUAL_ID:
			return CallCallToConnectionViewFactory.class;
		case DecisionDecisionToBoundaryEditPart.VISUAL_ID:
			return DecisionDecisionToBoundaryViewFactory.class;
		case DeviceFromIsAttachedEditPart.VISUAL_ID:
			return DeviceFromIsAttachedViewFactory.class;
		case CallCallToDecisionEditPart.VISUAL_ID:
			return CallCallToDecisionViewFactory.class;
		case MediumToConnectionEditPart.VISUAL_ID:
			return MediumToConnectionViewFactory.class;
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
