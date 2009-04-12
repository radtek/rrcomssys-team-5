package gcml.diagram.edit.policies;

import gcml.GcmlPackage;
import gcml.diagram.edit.commands.BoundaryCreateCommand;
import gcml.diagram.edit.commands.CallCreateCommand;
import gcml.diagram.edit.commands.ConnectionCreateCommand;
import gcml.diagram.edit.commands.DecisionCreateCommand;
import gcml.diagram.edit.commands.DeviceCreateCommand;
import gcml.diagram.edit.commands.FormCreateCommand;
import gcml.diagram.edit.commands.IsAttachedCreateCommand;
import gcml.diagram.edit.commands.MediumCreateCommand;
import gcml.diagram.edit.commands.PersonCreateCommand;
import gcml.diagram.providers.WgcmlElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class WgcmlItemSemanticEditPolicy extends
		WgcmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WgcmlElementTypes.Connection_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getwgcml_Connection());
			}
			return getGEFWrapper(new ConnectionCreateCommand(req));
		}
		if (WgcmlElementTypes.Person_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getwgcml_Person());
			}
			return getGEFWrapper(new PersonCreateCommand(req));
		}
		if (WgcmlElementTypes.Medium_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getwgcml_Medium());
			}
			return getGEFWrapper(new MediumCreateCommand(req));
		}
		if (WgcmlElementTypes.IsAttached_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getwgcml_IsAttached());
			}
			return getGEFWrapper(new IsAttachedCreateCommand(req));
		}
		if (WgcmlElementTypes.Device_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getwgcml_Device());
			}
			return getGEFWrapper(new DeviceCreateCommand(req));
		}
		if (WgcmlElementTypes.Form_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(GcmlPackage.eINSTANCE
								.getwgcml_Form());
			}
			return getGEFWrapper(new FormCreateCommand(req));
		}
		if (WgcmlElementTypes.Call_2010 == req.getElementType()) {
			return getGEFWrapper(new CallCreateCommand(req));
		}
		if (WgcmlElementTypes.Boundary_2011 == req.getElementType()) {
			return getGEFWrapper(new BoundaryCreateCommand(req));
		}
		if (WgcmlElementTypes.Decision_2012 == req.getElementType()) {
			return getGEFWrapper(new DecisionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
