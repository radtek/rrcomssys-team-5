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
import gcml.diagram.providers.GcmlElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class GcmlItemSemanticEditPolicy extends GcmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GcmlElementTypes.Device_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getGcml_Device());
			}
			return getGEFWrapper(new DeviceCreateCommand(req));
		}
		if (GcmlElementTypes.Form_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE.getGcml_Form());
			}
			return getGEFWrapper(new FormCreateCommand(req));
		}
		if (GcmlElementTypes.Medium_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getGcml_Medium());
			}
			return getGEFWrapper(new MediumCreateCommand(req));
		}
		if (GcmlElementTypes.Call_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getGcml_Activities());
			}
			return getGEFWrapper(new CallCreateCommand(req));
		}
		if (GcmlElementTypes.Boundary_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getGcml_Activities());
			}
			return getGEFWrapper(new BoundaryCreateCommand(req));
		}
		if (GcmlElementTypes.Person_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getGcml_Person());
			}
			return getGEFWrapper(new PersonCreateCommand(req));
		}
		if (GcmlElementTypes.IsAttached_2007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getGcml_IsAttached());
			}
			return getGEFWrapper(new IsAttachedCreateCommand(req));
		}
		if (GcmlElementTypes.Decision_2008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getGcml_Activities());
			}
			return getGEFWrapper(new DecisionCreateCommand(req));
		}
		if (GcmlElementTypes.Connection_2009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getGcml_Connection());
			}
			return getGEFWrapper(new ConnectionCreateCommand(req));
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
