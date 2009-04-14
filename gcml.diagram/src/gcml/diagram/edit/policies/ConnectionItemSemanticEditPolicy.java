package gcml.diagram.edit.policies;

import gcml.diagram.edit.commands.CallCallToConnectionCreateCommand;
import gcml.diagram.edit.commands.CallCallToConnectionReorientCommand;
import gcml.diagram.edit.commands.ConnectionConnectionToCallCreateCommand;
import gcml.diagram.edit.commands.ConnectionConnectionToCallReorientCommand;
import gcml.diagram.edit.commands.ConnectionFromDeviceCreateCommand;
import gcml.diagram.edit.commands.ConnectionFromDeviceReorientCommand;
import gcml.diagram.edit.commands.DeviceToConnectionCreateCommand;
import gcml.diagram.edit.commands.DeviceToConnectionReorientCommand;
import gcml.diagram.edit.commands.FormToConnectionCreateCommand;
import gcml.diagram.edit.commands.FormToConnectionReorientCommand;
import gcml.diagram.edit.commands.MediumToConnectionCreateCommand;
import gcml.diagram.edit.commands.MediumToConnectionReorientCommand;
import gcml.diagram.edit.parts.CallCallToConnectionEditPart;
import gcml.diagram.edit.parts.ConnectionConnectionToCallEditPart;
import gcml.diagram.edit.parts.ConnectionFromDeviceEditPart;
import gcml.diagram.edit.parts.DeviceToConnectionEditPart;
import gcml.diagram.edit.parts.FormToConnectionEditPart;
import gcml.diagram.edit.parts.MediumToConnectionEditPart;
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
public class ConnectionItemSemanticEditPolicy extends
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
		if (GcmlElementTypes.ConnectionConnectionToCall_4007 == req
				.getElementType()) {
			return getGEFWrapper(new ConnectionConnectionToCallCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GcmlElementTypes.ConnectionFromDevice_4008 == req.getElementType()) {
			return getGEFWrapper(new ConnectionFromDeviceCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GcmlElementTypes.FormToConnection_4009 == req.getElementType()) {
			return null;
		}
		if (GcmlElementTypes.DeviceToConnection_4010 == req.getElementType()) {
			return null;
		}
		if (GcmlElementTypes.CallCallToConnection_4012 == req.getElementType()) {
			return null;
		}
		if (GcmlElementTypes.MediumToConnection_4016 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GcmlElementTypes.ConnectionConnectionToCall_4007 == req
				.getElementType()) {
			return null;
		}
		if (GcmlElementTypes.ConnectionFromDevice_4008 == req.getElementType()) {
			return null;
		}
		if (GcmlElementTypes.FormToConnection_4009 == req.getElementType()) {
			return getGEFWrapper(new FormToConnectionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GcmlElementTypes.DeviceToConnection_4010 == req.getElementType()) {
			return getGEFWrapper(new DeviceToConnectionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GcmlElementTypes.CallCallToConnection_4012 == req.getElementType()) {
			return getGEFWrapper(new CallCallToConnectionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GcmlElementTypes.MediumToConnection_4016 == req.getElementType()) {
			return getGEFWrapper(new MediumToConnectionCreateCommand(req, req
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
		case ConnectionConnectionToCallEditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectionConnectionToCallReorientCommand(
					req));
		case ConnectionFromDeviceEditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectionFromDeviceReorientCommand(req));
		case FormToConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new FormToConnectionReorientCommand(req));
		case DeviceToConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new DeviceToConnectionReorientCommand(req));
		case CallCallToConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new CallCallToConnectionReorientCommand(req));
		case MediumToConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new MediumToConnectionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
