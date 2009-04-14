package gcml.diagram.edit.policies;

import gcml.diagram.edit.commands.BoundaryBoundaryToCallCreateCommand;
import gcml.diagram.edit.commands.BoundaryBoundaryToCallReorientCommand;
import gcml.diagram.edit.commands.CallCallToBoundaryCreateCommand;
import gcml.diagram.edit.commands.CallCallToBoundaryReorientCommand;
import gcml.diagram.edit.commands.DecisionDecisionToBoundaryCreateCommand;
import gcml.diagram.edit.commands.DecisionDecisionToBoundaryReorientCommand;
import gcml.diagram.edit.parts.BoundaryBoundaryToCallEditPart;
import gcml.diagram.edit.parts.CallCallToBoundaryEditPart;
import gcml.diagram.edit.parts.DecisionDecisionToBoundaryEditPart;
import gcml.diagram.providers.GcmlElementTypes;

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
		GcmlBaseItemSemanticEditPolicy {

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
		if (GcmlElementTypes.BoundaryBoundaryToCall_4005 == req
				.getElementType()) {
			return getGEFWrapper(new BoundaryBoundaryToCallCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GcmlElementTypes.CallCallToBoundary_4011 == req.getElementType()) {
			return null;
		}
		if (GcmlElementTypes.DecisionDecisionToBoundary_4013 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GcmlElementTypes.BoundaryBoundaryToCall_4005 == req
				.getElementType()) {
			return null;
		}
		if (GcmlElementTypes.CallCallToBoundary_4011 == req.getElementType()) {
			return getGEFWrapper(new CallCallToBoundaryCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GcmlElementTypes.DecisionDecisionToBoundary_4013 == req
				.getElementType()) {
			return getGEFWrapper(new DecisionDecisionToBoundaryCreateCommand(
					req, req.getSource(), req.getTarget()));
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
		case BoundaryBoundaryToCallEditPart.VISUAL_ID:
			return getGEFWrapper(new BoundaryBoundaryToCallReorientCommand(req));
		case CallCallToBoundaryEditPart.VISUAL_ID:
			return getGEFWrapper(new CallCallToBoundaryReorientCommand(req));
		case DecisionDecisionToBoundaryEditPart.VISUAL_ID:
			return getGEFWrapper(new DecisionDecisionToBoundaryReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
