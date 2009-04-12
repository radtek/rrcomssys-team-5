package gcml.diagram.edit.policies;

import gcml.diagram.edit.commands.BoundaryToCallCreateCommand;
import gcml.diagram.edit.commands.BoundaryToCallReorientCommand;
import gcml.diagram.edit.commands.BoundaryToDecisionCreateCommand;
import gcml.diagram.edit.commands.BoundaryToDecisionReorientCommand;
import gcml.diagram.edit.commands.CallToBoundaryCreateCommand;
import gcml.diagram.edit.commands.CallToBoundaryReorientCommand;
import gcml.diagram.edit.commands.DecisionFromDecisionToBoudaryCreateCommand;
import gcml.diagram.edit.commands.DecisionFromDecisionToBoudaryReorientCommand;
import gcml.diagram.edit.parts.BoundaryToCallEditPart;
import gcml.diagram.edit.parts.BoundaryToDecisionEditPart;
import gcml.diagram.edit.parts.CallToBoundaryEditPart;
import gcml.diagram.edit.parts.DecisionFromDecisionToBoudaryEditPart;
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
public class BoundaryItemSemanticEditPolicy extends
		WgcmlBaseItemSemanticEditPolicy {

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
		if (WgcmlElementTypes.DecisionFromDecisionToBoudary_4011 == req
				.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.CallToBoundary_4013 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.BoundaryToCall_4015 == req.getElementType()) {
			return getGEFWrapper(new BoundaryToCallCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.BoundaryToDecision_4016 == req.getElementType()) {
			return getGEFWrapper(new BoundaryToDecisionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WgcmlElementTypes.DecisionFromDecisionToBoudary_4011 == req
				.getElementType()) {
			return getGEFWrapper(new DecisionFromDecisionToBoudaryCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.CallToBoundary_4013 == req.getElementType()) {
			return getGEFWrapper(new CallToBoundaryCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.BoundaryToCall_4015 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.BoundaryToDecision_4016 == req.getElementType()) {
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
		case DecisionFromDecisionToBoudaryEditPart.VISUAL_ID:
			return getGEFWrapper(new DecisionFromDecisionToBoudaryReorientCommand(
					req));
		case CallToBoundaryEditPart.VISUAL_ID:
			return getGEFWrapper(new CallToBoundaryReorientCommand(req));
		case BoundaryToCallEditPart.VISUAL_ID:
			return getGEFWrapper(new BoundaryToCallReorientCommand(req));
		case BoundaryToDecisionEditPart.VISUAL_ID:
			return getGEFWrapper(new BoundaryToDecisionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
