package gcml.diagram.edit.policies;

import gcml.Boundary;
import gcml.Call;
import gcml.Connection;
import gcml.Decision;
import gcml.Device;
import gcml.Form;
import gcml.IsAttached;
import gcml.Medium;
import gcml.Person;
import gcml.diagram.edit.helpers.GcmlBaseEditHelper;
import gcml.diagram.part.GcmlVisualIDRegistry;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IEditHelperContext;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GcmlBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * 
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(GcmlVisualIDRegistry
						.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * 
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Object editHelperContext = completedRequest.getEditHelperContext();
		if (editHelperContext instanceof View
				|| (editHelperContext instanceof IEditHelperContext && ((IEditHelperContext) editHelperContext)
						.getEObject() instanceof View)) {
			// no semantic commands are provided for pure design elements
			return null;
		}
		if (editHelperContext == null) {
			editHelperContext = ViewUtil
					.resolveSemanticElement((View) getHost().getModel());
		}
		IElementType elementType = ElementTypeRegistry.getInstance()
				.getElementType(editHelperContext);
		if (elementType == ElementTypeRegistry.getInstance().getType(
				"org.eclipse.gmf.runtime.emf.type.core.default")) { //$NON-NLS-1$ 
			elementType = null;
		}
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		if (elementType != null) {
			if (semanticCommand != null) {
				ICommand command = semanticCommand instanceof ICommandProxy ? ((ICommandProxy) semanticCommand)
						.getICommand()
						: new CommandProxy(semanticCommand);
				completedRequest.setParameter(
						GcmlBaseEditHelper.EDIT_POLICY_COMMAND, command);
			}
			ICommand command = elementType.getEditCommand(completedRequest);
			if (command != null) {
				if (!(command instanceof CompositeTransactionalCommand)) {
					TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
							.getEditingDomain();
					command = new CompositeTransactionalCommand(editingDomain,
							command.getLabel()).compose(command);
				}
				semanticCommand = new ICommandProxy(command);
			}
		}
		boolean shouldProceed = true;
		if (completedRequest instanceof DestroyRequest) {
			shouldProceed = shouldProceed((DestroyRequest) completedRequest);
		}
		if (shouldProceed) {
			if (completedRequest instanceof DestroyRequest) {
				TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
						.getEditingDomain();
				Command deleteViewCommand = new ICommandProxy(
						new DeleteCommand(editingDomain, (View) getHost()
								.getModel()));
				semanticCommand = semanticCommand == null ? deleteViewCommand
						: semanticCommand.chain(deleteViewCommand);
			}
			return semanticCommand;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * @deprecated use getGEFWrapper() instead
	 * @generated
	 */
	protected final Command getMSLWrapper(ICommand cmd) {
		// XXX deprecated: use getGEFWrapper() instead
		return getGEFWrapper(cmd);
	}

	/**
	 * @generated
	 */
	protected EObject getSemanticElement() {
		return ViewUtil.resolveSemanticElement((View) getHost().getModel());
	}

	/**
	 * Returns editing domain from the host edit part.
	 * 
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Creates command to destroy the link.
	 * 
	 * @generated
	 */
	protected Command getDestroyElementCommand(View view) {
		EditPart editPart = (EditPart) getHost().getViewer()
				.getEditPartRegistry().get(view);
		DestroyElementRequest request = new DestroyElementRequest(
				getEditingDomain(), false);
		return editPart.getCommand(new EditCommandRequestWrapper(request,
				Collections.EMPTY_MAP));
	}

	/**
	 * Creates commands to destroy all host incoming and outgoing links.
	 * 
	 * @generated
	 */
	protected CompoundCommand getDestroyEdgesCommand() {
		CompoundCommand cmd = new CompoundCommand();
		View view = (View) getHost().getModel();
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			cmd.add(getDestroyElementCommand((Edge) it.next()));
		}
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			cmd.add(getDestroyElementCommand((Edge) it.next()));
		}
		return cmd;
	}

	/**
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(CompoundCommand command) {
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			return;
		}
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			command.add(getDestroyElementCommand(nextView));
		}
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		public static boolean canCreatePersonToIsAttached_4001(Person source,
				IsAttached target) {
			if (source != null) {
				if (source.getToIsAttached() != null) {
					return false;
				}
			}
			return canExistPersonToIsAttached_4001(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateIsAttachedToDevice_4002(
				IsAttached source, Device target) {
			if (source != null) {
				if (source.getToDevice() != null) {
					return false;
				}
			}
			return canExistIsAttachedToDevice_4002(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateDecisionDecisionToCall_4003(
				Decision source, Call target) {
			if (source != null) {
				if (source.getDecisionToCall().size() >= 2
						|| source.getDecisionToCall().contains(target)) {
					return false;
				}
			}
			return canExistDecisionDecisionToCall_4003(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateFormToParentForm_4004(Form source,
				Form target) {
			if (source != null) {
				if (source.getToParentForm() != null) {
					return false;
				}
			}
			return canExistFormToParentForm_4004(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateBoundaryBoundaryToCall_4005(
				Boundary source, Call target) {
			if (source != null) {
				if (source.getBoundaryToCall() != null) {
					return false;
				}
			}
			return canExistBoundaryBoundaryToCall_4005(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateIsAttachedFromPerson_4006(
				IsAttached source, Person target) {
			if (source != null) {
				if (source.getFromPerson() != null) {
					return false;
				}
			}
			return canExistIsAttachedFromPerson_4006(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateConnectionConnectionToCall_4007(
				Connection source, Call target) {
			if (source != null) {
				if (source.getConnectionToCall() != null) {
					return false;
				}
			}
			return canExistConnectionConnectionToCall_4007(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateConnectionFromDevice_4008(
				Connection source, Device target) {
			if (source != null) {
				if (source.getFromDevice().contains(target)) {
					return false;
				}
			}
			return canExistConnectionFromDevice_4008(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateFormToConnection_4009(Form source,
				Connection target) {
			if (source != null) {
				if (source.getToConnection() != null) {
					return false;
				}
			}
			return canExistFormToConnection_4009(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateDeviceToConnection_4010(Device source,
				Connection target) {
			if (source != null) {
				if (source.getToConnection().contains(target)) {
					return false;
				}
			}
			return canExistDeviceToConnection_4010(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCallCallToBoundary_4011(Call source,
				Boundary target) {
			if (source != null) {
				if (source.getCallToBoundary() != null) {
					return false;
				}
			}
			return canExistCallCallToBoundary_4011(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCallCallToConnection_4012(Call source,
				Connection target) {
			if (source != null) {
				if (source.getCallToConnection().contains(target)) {
					return false;
				}
			}
			return canExistCallCallToConnection_4012(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateDecisionDecisionToBoundary_4013(
				Decision source, Boundary target) {
			if (source != null) {
				if (source.getDecisionToBoundary() != null) {
					return false;
				}
			}
			return canExistDecisionDecisionToBoundary_4013(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateDeviceFromIsAttached_4014(Device source,
				IsAttached target) {
			if (source != null) {
				if (source.getFromIsAttached().contains(target)) {
					return false;
				}
			}
			return canExistDeviceFromIsAttached_4014(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCallCallToDecision_4015(Call source,
				Decision target) {
			if (source != null) {
				if (source.getCallToDecision() != null) {
					return false;
				}
			}
			return canExistCallCallToDecision_4015(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateMediumToConnection_4016(Medium source,
				Connection target) {
			if (source != null) {
				if (source.getToConnection() != null) {
					return false;
				}
			}
			return canExistMediumToConnection_4016(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistPersonToIsAttached_4001(Person source,
				IsAttached target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistIsAttachedToDevice_4002(
				IsAttached source, Device target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistDecisionDecisionToCall_4003(
				Decision source, Call target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistFormToParentForm_4004(Form source,
				Form target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistBoundaryBoundaryToCall_4005(
				Boundary source, Call target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistIsAttachedFromPerson_4006(
				IsAttached source, Person target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistConnectionConnectionToCall_4007(
				Connection source, Call target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistConnectionFromDevice_4008(
				Connection source, Device target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistFormToConnection_4009(Form source,
				Connection target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistDeviceToConnection_4010(Device source,
				Connection target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCallCallToBoundary_4011(Call source,
				Boundary target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCallCallToConnection_4012(Call source,
				Connection target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistDecisionDecisionToBoundary_4013(
				Decision source, Boundary target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistDeviceFromIsAttached_4014(Device source,
				IsAttached target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCallCallToDecision_4015(Call source,
				Decision target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistMediumToConnection_4016(Medium source,
				Connection target) {

			return true;
		}
	}

}
