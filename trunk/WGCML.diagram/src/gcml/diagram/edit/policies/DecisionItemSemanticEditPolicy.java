package gcml.diagram.edit.policies;

import gcml.diagram.edit.commands.BoundaryToDecisionCreateCommand;
import gcml.diagram.edit.commands.BoundaryToDecisionReorientCommand;
import gcml.diagram.edit.commands.CallFromCallCreateCommand;
import gcml.diagram.edit.commands.CallFromCallReorientCommand;
import gcml.diagram.edit.commands.DecisionFromDecisionCreateCommand;
import gcml.diagram.edit.commands.DecisionFromDecisionReorientCommand;
import gcml.diagram.edit.commands.DecisionFromDecisionToBoudaryCreateCommand;
import gcml.diagram.edit.commands.DecisionFromDecisionToBoudaryReorientCommand;
import gcml.diagram.edit.parts.BoundaryToDecisionEditPart;
import gcml.diagram.edit.parts.CallFromCallEditPart;
import gcml.diagram.edit.parts.DecisionFromDecisionEditPart;
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
public class DecisionItemSemanticEditPolicy extends
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
			return getGEFWrapper(new DecisionFromDecisionToBoudaryCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.DecisionFromDecision_4012 == req.getElementType()) {
			return getGEFWrapper(new DecisionFromDecisionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.CallFromCall_4014 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.BoundaryToDecision_4016 == req.getElementType()) {
			return null;
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
			return null;
		}
		if (WgcmlElementTypes.DecisionFromDecision_4012 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.CallFromCall_4014 == req.getElementType()) {
			return getGEFWrapper(new CallFromCallCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.BoundaryToDecision_4016 == req.getElementType()) {
			return getGEFWrapper(new BoundaryToDecisionCreateCommand(req, req
					.getSource(), req.getTarget()));
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
		case DecisionFromDecisionEditPart.VISUAL_ID:
			return getGEFWrapper(new DecisionFromDecisionReorientCommand(req));
		case CallFromCallEditPart.VISUAL_ID:
			return getGEFWrapper(new CallFromCallReorientCommand(req));
		case BoundaryToDecisionEditPart.VISUAL_ID:
			return getGEFWrapper(new BoundaryToDecisionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
