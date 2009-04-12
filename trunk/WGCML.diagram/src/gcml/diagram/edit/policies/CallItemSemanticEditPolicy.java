package gcml.diagram.edit.policies;

import gcml.diagram.edit.commands.BoundaryToCallCreateCommand;
import gcml.diagram.edit.commands.BoundaryToCallReorientCommand;
import gcml.diagram.edit.commands.CallConnectionsCreateCommand;
import gcml.diagram.edit.commands.CallConnectionsReorientCommand;
import gcml.diagram.edit.commands.CallFromCallCreateCommand;
import gcml.diagram.edit.commands.CallFromCallReorientCommand;
import gcml.diagram.edit.commands.CallToBoundaryCreateCommand;
import gcml.diagram.edit.commands.CallToBoundaryReorientCommand;
import gcml.diagram.edit.commands.DecisionFromDecisionCreateCommand;
import gcml.diagram.edit.commands.DecisionFromDecisionReorientCommand;
import gcml.diagram.edit.parts.BoundaryToCallEditPart;
import gcml.diagram.edit.parts.CallConnectionsEditPart;
import gcml.diagram.edit.parts.CallFromCallEditPart;
import gcml.diagram.edit.parts.CallToBoundaryEditPart;
import gcml.diagram.edit.parts.DecisionFromDecisionEditPart;
import gcml.diagram.providers.WgcmlElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CallItemSemanticEditPolicy extends WgcmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WgcmlElementTypes.DecisionFromDecision_4012 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.CallToBoundary_4013 == req.getElementType()) {
			return getGEFWrapper(new CallToBoundaryCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.CallFromCall_4014 == req.getElementType()) {
			return getGEFWrapper(new CallFromCallCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.BoundaryToCall_4015 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.CallConnections_4017 == req.getElementType()) {
			return getGEFWrapper(new CallConnectionsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WgcmlElementTypes.DecisionFromDecision_4012 == req.getElementType()) {
			return getGEFWrapper(new DecisionFromDecisionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.CallToBoundary_4013 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.CallFromCall_4014 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.BoundaryToCall_4015 == req.getElementType()) {
			return getGEFWrapper(new BoundaryToCallCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.CallConnections_4017 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DecisionFromDecisionEditPart.VISUAL_ID:
			return getGEFWrapper(new DecisionFromDecisionReorientCommand(req));
		case CallToBoundaryEditPart.VISUAL_ID:
			return getGEFWrapper(new CallToBoundaryReorientCommand(req));
		case CallFromCallEditPart.VISUAL_ID:
			return getGEFWrapper(new CallFromCallReorientCommand(req));
		case BoundaryToCallEditPart.VISUAL_ID:
			return getGEFWrapper(new BoundaryToCallReorientCommand(req));
		case CallConnectionsEditPart.VISUAL_ID:
			return getGEFWrapper(new CallConnectionsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
