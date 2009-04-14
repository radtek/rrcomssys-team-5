package gcml.diagram.providers;

import gcml.diagram.edit.parts.BoundaryEditPart;
import gcml.diagram.edit.parts.CallEditPart;
import gcml.diagram.edit.parts.ConnectionEditPart;
import gcml.diagram.edit.parts.DecisionEditPart;
import gcml.diagram.edit.parts.DeviceEditPart;
import gcml.diagram.edit.parts.FormEditPart;
import gcml.diagram.edit.parts.GcmlEditPart;
import gcml.diagram.edit.parts.IsAttachedEditPart;
import gcml.diagram.edit.parts.MediumEditPart;
import gcml.diagram.edit.parts.PersonEditPart;
import gcml.diagram.part.GcmlDiagramEditorPlugin;
import gcml.diagram.part.Messages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class GcmlModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof GcmlEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.Device_2001);
			types.add(GcmlElementTypes.Form_2002);
			types.add(GcmlElementTypes.Medium_2003);
			types.add(GcmlElementTypes.Call_2004);
			types.add(GcmlElementTypes.Boundary_2005);
			types.add(GcmlElementTypes.Person_2006);
			types.add(GcmlElementTypes.IsAttached_2007);
			types.add(GcmlElementTypes.Decision_2008);
			types.add(GcmlElementTypes.Connection_2009);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.DeviceToConnection_4010);
			types.add(GcmlElementTypes.DeviceFromIsAttached_4014);
			return types;
		}
		if (sourceEditPart instanceof FormEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.FormToParentForm_4004);
			types.add(GcmlElementTypes.FormToConnection_4009);
			return types;
		}
		if (sourceEditPart instanceof MediumEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.MediumToConnection_4016);
			return types;
		}
		if (sourceEditPart instanceof CallEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.CallCallToBoundary_4011);
			types.add(GcmlElementTypes.CallCallToConnection_4012);
			types.add(GcmlElementTypes.CallCallToDecision_4015);
			return types;
		}
		if (sourceEditPart instanceof BoundaryEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.BoundaryBoundaryToCall_4005);
			return types;
		}
		if (sourceEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.PersonToIsAttached_4001);
			return types;
		}
		if (sourceEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.IsAttachedToDevice_4002);
			types.add(GcmlElementTypes.IsAttachedFromPerson_4006);
			return types;
		}
		if (sourceEditPart instanceof DecisionEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.DecisionDecisionToCall_4003);
			types.add(GcmlElementTypes.DecisionDecisionToBoundary_4013);
			return types;
		}
		if (sourceEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.ConnectionConnectionToCall_4007);
			types.add(GcmlElementTypes.ConnectionFromDevice_4008);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.IsAttachedToDevice_4002);
			types.add(GcmlElementTypes.ConnectionFromDevice_4008);
			return types;
		}
		if (targetEditPart instanceof FormEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.FormToParentForm_4004);
			return types;
		}
		if (targetEditPart instanceof CallEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.DecisionDecisionToCall_4003);
			types.add(GcmlElementTypes.BoundaryBoundaryToCall_4005);
			types.add(GcmlElementTypes.ConnectionConnectionToCall_4007);
			return types;
		}
		if (targetEditPart instanceof BoundaryEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.CallCallToBoundary_4011);
			types.add(GcmlElementTypes.DecisionDecisionToBoundary_4013);
			return types;
		}
		if (targetEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.IsAttachedFromPerson_4006);
			return types;
		}
		if (targetEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.PersonToIsAttached_4001);
			types.add(GcmlElementTypes.DeviceFromIsAttached_4014);
			return types;
		}
		if (targetEditPart instanceof DecisionEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.CallCallToDecision_4015);
			return types;
		}
		if (targetEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			types.add(GcmlElementTypes.FormToConnection_4009);
			types.add(GcmlElementTypes.DeviceToConnection_4010);
			types.add(GcmlElementTypes.CallCallToConnection_4012);
			types.add(GcmlElementTypes.MediumToConnection_4016);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ConnectionEditPart) {
				types.add(GcmlElementTypes.DeviceToConnection_4010);
			}
			if (targetEditPart instanceof IsAttachedEditPart) {
				types.add(GcmlElementTypes.DeviceFromIsAttached_4014);
			}
			return types;
		}
		if (sourceEditPart instanceof FormEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof FormEditPart) {
				types.add(GcmlElementTypes.FormToParentForm_4004);
			}
			if (targetEditPart instanceof ConnectionEditPart) {
				types.add(GcmlElementTypes.FormToConnection_4009);
			}
			return types;
		}
		if (sourceEditPart instanceof MediumEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ConnectionEditPart) {
				types.add(GcmlElementTypes.MediumToConnection_4016);
			}
			return types;
		}
		if (sourceEditPart instanceof CallEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof BoundaryEditPart) {
				types.add(GcmlElementTypes.CallCallToBoundary_4011);
			}
			if (targetEditPart instanceof ConnectionEditPart) {
				types.add(GcmlElementTypes.CallCallToConnection_4012);
			}
			if (targetEditPart instanceof DecisionEditPart) {
				types.add(GcmlElementTypes.CallCallToDecision_4015);
			}
			return types;
		}
		if (sourceEditPart instanceof BoundaryEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof CallEditPart) {
				types.add(GcmlElementTypes.BoundaryBoundaryToCall_4005);
			}
			return types;
		}
		if (sourceEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof IsAttachedEditPart) {
				types.add(GcmlElementTypes.PersonToIsAttached_4001);
			}
			return types;
		}
		if (sourceEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof DeviceEditPart) {
				types.add(GcmlElementTypes.IsAttachedToDevice_4002);
			}
			if (targetEditPart instanceof PersonEditPart) {
				types.add(GcmlElementTypes.IsAttachedFromPerson_4006);
			}
			return types;
		}
		if (sourceEditPart instanceof DecisionEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof CallEditPart) {
				types.add(GcmlElementTypes.DecisionDecisionToCall_4003);
			}
			if (targetEditPart instanceof BoundaryEditPart) {
				types.add(GcmlElementTypes.DecisionDecisionToBoundary_4013);
			}
			return types;
		}
		if (sourceEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof CallEditPart) {
				types.add(GcmlElementTypes.ConnectionConnectionToCall_4007);
			}
			if (targetEditPart instanceof DeviceEditPart) {
				types.add(GcmlElementTypes.ConnectionFromDevice_4008);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.IsAttachedToDevice_4002) {
				types.add(GcmlElementTypes.IsAttached_2007);
			}
			if (relationshipType == GcmlElementTypes.ConnectionFromDevice_4008) {
				types.add(GcmlElementTypes.Connection_2009);
			}
			return types;
		}
		if (targetEditPart instanceof FormEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.FormToParentForm_4004) {
				types.add(GcmlElementTypes.Form_2002);
			}
			return types;
		}
		if (targetEditPart instanceof CallEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.DecisionDecisionToCall_4003) {
				types.add(GcmlElementTypes.Decision_2008);
			}
			if (relationshipType == GcmlElementTypes.BoundaryBoundaryToCall_4005) {
				types.add(GcmlElementTypes.Boundary_2005);
			}
			if (relationshipType == GcmlElementTypes.ConnectionConnectionToCall_4007) {
				types.add(GcmlElementTypes.Connection_2009);
			}
			return types;
		}
		if (targetEditPart instanceof BoundaryEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.CallCallToBoundary_4011) {
				types.add(GcmlElementTypes.Call_2004);
			}
			if (relationshipType == GcmlElementTypes.DecisionDecisionToBoundary_4013) {
				types.add(GcmlElementTypes.Decision_2008);
			}
			return types;
		}
		if (targetEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.IsAttachedFromPerson_4006) {
				types.add(GcmlElementTypes.IsAttached_2007);
			}
			return types;
		}
		if (targetEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.PersonToIsAttached_4001) {
				types.add(GcmlElementTypes.Person_2006);
			}
			if (relationshipType == GcmlElementTypes.DeviceFromIsAttached_4014) {
				types.add(GcmlElementTypes.Device_2001);
			}
			return types;
		}
		if (targetEditPart instanceof DecisionEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.CallCallToDecision_4015) {
				types.add(GcmlElementTypes.Call_2004);
			}
			return types;
		}
		if (targetEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.FormToConnection_4009) {
				types.add(GcmlElementTypes.Form_2002);
			}
			if (relationshipType == GcmlElementTypes.DeviceToConnection_4010) {
				types.add(GcmlElementTypes.Device_2001);
			}
			if (relationshipType == GcmlElementTypes.CallCallToConnection_4012) {
				types.add(GcmlElementTypes.Call_2004);
			}
			if (relationshipType == GcmlElementTypes.MediumToConnection_4016) {
				types.add(GcmlElementTypes.Medium_2003);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.DeviceToConnection_4010) {
				types.add(GcmlElementTypes.Connection_2009);
			}
			if (relationshipType == GcmlElementTypes.DeviceFromIsAttached_4014) {
				types.add(GcmlElementTypes.IsAttached_2007);
			}
			return types;
		}
		if (sourceEditPart instanceof FormEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.FormToParentForm_4004) {
				types.add(GcmlElementTypes.Form_2002);
			}
			if (relationshipType == GcmlElementTypes.FormToConnection_4009) {
				types.add(GcmlElementTypes.Connection_2009);
			}
			return types;
		}
		if (sourceEditPart instanceof MediumEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.MediumToConnection_4016) {
				types.add(GcmlElementTypes.Connection_2009);
			}
			return types;
		}
		if (sourceEditPart instanceof CallEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.CallCallToBoundary_4011) {
				types.add(GcmlElementTypes.Boundary_2005);
			}
			if (relationshipType == GcmlElementTypes.CallCallToConnection_4012) {
				types.add(GcmlElementTypes.Connection_2009);
			}
			if (relationshipType == GcmlElementTypes.CallCallToDecision_4015) {
				types.add(GcmlElementTypes.Decision_2008);
			}
			return types;
		}
		if (sourceEditPart instanceof BoundaryEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.BoundaryBoundaryToCall_4005) {
				types.add(GcmlElementTypes.Call_2004);
			}
			return types;
		}
		if (sourceEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.PersonToIsAttached_4001) {
				types.add(GcmlElementTypes.IsAttached_2007);
			}
			return types;
		}
		if (sourceEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.IsAttachedToDevice_4002) {
				types.add(GcmlElementTypes.Device_2001);
			}
			if (relationshipType == GcmlElementTypes.IsAttachedFromPerson_4006) {
				types.add(GcmlElementTypes.Person_2006);
			}
			return types;
		}
		if (sourceEditPart instanceof DecisionEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.DecisionDecisionToCall_4003) {
				types.add(GcmlElementTypes.Call_2004);
			}
			if (relationshipType == GcmlElementTypes.DecisionDecisionToBoundary_4013) {
				types.add(GcmlElementTypes.Boundary_2005);
			}
			return types;
		}
		if (sourceEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			if (relationshipType == GcmlElementTypes.ConnectionConnectionToCall_4007) {
				types.add(GcmlElementTypes.Call_2004);
			}
			if (relationshipType == GcmlElementTypes.ConnectionFromDevice_4008) {
				types.add(GcmlElementTypes.Device_2001);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				GcmlDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.GcmlModelingAssistantProviderMessage);
		dialog.setTitle(Messages.GcmlModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
