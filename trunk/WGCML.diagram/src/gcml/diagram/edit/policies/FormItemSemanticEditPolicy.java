package gcml.diagram.edit.policies;

import gcml.diagram.edit.commands.FormToConnectionCreateCommand;
import gcml.diagram.edit.commands.FormToConnectionReorientCommand;
import gcml.diagram.edit.commands.FormToParentFormCreateCommand;
import gcml.diagram.edit.commands.FormToParentFormReorientCommand;
import gcml.diagram.edit.commands.MediumToFormCreateCommand;
import gcml.diagram.edit.commands.MediumToFormReorientCommand;
import gcml.diagram.edit.parts.FormToConnectionEditPart;
import gcml.diagram.edit.parts.FormToParentFormEditPart;
import gcml.diagram.edit.parts.MediumToFormEditPart;
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
public class FormItemSemanticEditPolicy extends WgcmlBaseItemSemanticEditPolicy {

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
		if (WgcmlElementTypes.MediumToForm_4006 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.FormToConnection_4002 == req.getElementType()) {
			return getGEFWrapper(new FormToConnectionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.FormToParentForm_4009 == req.getElementType()) {
			return getGEFWrapper(new FormToParentFormCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WgcmlElementTypes.MediumToForm_4006 == req.getElementType()) {
			return getGEFWrapper(new MediumToFormCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.FormToConnection_4002 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.FormToParentForm_4009 == req.getElementType()) {
			return getGEFWrapper(new FormToParentFormCreateCommand(req, req
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
		case MediumToFormEditPart.VISUAL_ID:
			return getGEFWrapper(new MediumToFormReorientCommand(req));
		case FormToConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new FormToConnectionReorientCommand(req));
		case FormToParentFormEditPart.VISUAL_ID:
			return getGEFWrapper(new FormToParentFormReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
