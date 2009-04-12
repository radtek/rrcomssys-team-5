package gcml.diagram.edit.policies;

import gcml.diagram.edit.commands.DeviceFromIsAttachedCreateCommand;
import gcml.diagram.edit.commands.DeviceFromIsAttachedReorientCommand;
import gcml.diagram.edit.commands.IsAttachedFromPersonCreateCommand;
import gcml.diagram.edit.commands.IsAttachedFromPersonReorientCommand;
import gcml.diagram.edit.commands.IsAttachedToDeviceCreateCommand;
import gcml.diagram.edit.commands.IsAttachedToDeviceReorientCommand;
import gcml.diagram.edit.commands.PersonToIsAttachedCreateCommand;
import gcml.diagram.edit.commands.PersonToIsAttachedReorientCommand;
import gcml.diagram.edit.parts.DeviceFromIsAttachedEditPart;
import gcml.diagram.edit.parts.IsAttachedFromPersonEditPart;
import gcml.diagram.edit.parts.IsAttachedToDeviceEditPart;
import gcml.diagram.edit.parts.PersonToIsAttachedEditPart;
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
public class IsAttachedItemSemanticEditPolicy extends
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
		if (WgcmlElementTypes.PersonToIsAttached_4001 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.DeviceFromIsAttached_4003 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.IsAttachedFromPerson_4007 == req.getElementType()) {
			return getGEFWrapper(new IsAttachedFromPersonCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.IsAttachedToDevice_4008 == req.getElementType()) {
			return getGEFWrapper(new IsAttachedToDeviceCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WgcmlElementTypes.PersonToIsAttached_4001 == req.getElementType()) {
			return getGEFWrapper(new PersonToIsAttachedCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.DeviceFromIsAttached_4003 == req.getElementType()) {
			return getGEFWrapper(new DeviceFromIsAttachedCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WgcmlElementTypes.IsAttachedFromPerson_4007 == req.getElementType()) {
			return null;
		}
		if (WgcmlElementTypes.IsAttachedToDevice_4008 == req.getElementType()) {
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
		case PersonToIsAttachedEditPart.VISUAL_ID:
			return getGEFWrapper(new PersonToIsAttachedReorientCommand(req));
		case DeviceFromIsAttachedEditPart.VISUAL_ID:
			return getGEFWrapper(new DeviceFromIsAttachedReorientCommand(req));
		case IsAttachedFromPersonEditPart.VISUAL_ID:
			return getGEFWrapper(new IsAttachedFromPersonReorientCommand(req));
		case IsAttachedToDeviceEditPart.VISUAL_ID:
			return getGEFWrapper(new IsAttachedToDeviceReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
