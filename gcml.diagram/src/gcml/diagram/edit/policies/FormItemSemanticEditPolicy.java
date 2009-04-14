package gcml.diagram.edit.policies;

import gcml.diagram.edit.commands.FormToConnectionCreateCommand;
import gcml.diagram.edit.commands.FormToConnectionReorientCommand;
import gcml.diagram.edit.commands.FormToParentFormCreateCommand;
import gcml.diagram.edit.commands.FormToParentFormReorientCommand;
import gcml.diagram.edit.parts.FormToConnectionEditPart;
import gcml.diagram.edit.parts.FormToParentFormEditPart;
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
public class FormItemSemanticEditPolicy extends GcmlBaseItemSemanticEditPolicy {

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
		if (GcmlElementTypes.FormToParentForm_4004 == req.getElementType()) {
			return getGEFWrapper(new FormToParentFormCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GcmlElementTypes.FormToConnection_4009 == req.getElementType()) {
			return getGEFWrapper(new FormToConnectionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GcmlElementTypes.FormToParentForm_4004 == req.getElementType()) {
			return getGEFWrapper(new FormToParentFormCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GcmlElementTypes.FormToConnection_4009 == req.getElementType()) {
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
		case FormToParentFormEditPart.VISUAL_ID:
			return getGEFWrapper(new FormToParentFormReorientCommand(req));
		case FormToConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new FormToConnectionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
