package gcml.diagram.providers;

import gcml.diagram.edit.parts.BoundaryEditPart;
import gcml.diagram.edit.parts.CallEditPart;
import gcml.diagram.edit.parts.ConnectionEditPart;
import gcml.diagram.edit.parts.DecisionEditPart;
import gcml.diagram.edit.parts.DeviceEditPart;
import gcml.diagram.edit.parts.FormEditPart;
import gcml.diagram.edit.parts.IsAttachedEditPart;
import gcml.diagram.edit.parts.MediumEditPart;
import gcml.diagram.edit.parts.PersonEditPart;
import gcml.diagram.edit.parts.WgcmlEditPart;
import gcml.diagram.part.Messages;
import gcml.diagram.part.WgcmlDiagramEditorPlugin;

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
public class WgcmlModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof WgcmlEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.Connection_2001);
			types.add(WgcmlElementTypes.Person_2002);
			types.add(WgcmlElementTypes.Medium_2003);
			types.add(WgcmlElementTypes.IsAttached_2004);
			types.add(WgcmlElementTypes.Device_2005);
			types.add(WgcmlElementTypes.Form_2006);
			types.add(WgcmlElementTypes.Call_2010);
			types.add(WgcmlElementTypes.Boundary_2011);
			types.add(WgcmlElementTypes.Decision_2012);
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
		if (sourceEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.ConnectionFromDevice_4005);
			return types;
		}
		if (sourceEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.PersonToIsAttached_4001);
			return types;
		}
		if (sourceEditPart instanceof MediumEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.MediumToConnection_4004);
			types.add(WgcmlElementTypes.MediumToForm_4006);
			return types;
		}
		if (sourceEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.IsAttachedFromPerson_4007);
			types.add(WgcmlElementTypes.IsAttachedToDevice_4008);
			return types;
		}
		if (sourceEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.DeviceFromIsAttached_4003);
			types.add(WgcmlElementTypes.DeviceToConnection_4010);
			return types;
		}
		if (sourceEditPart instanceof FormEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.FormToConnection_4002);
			types.add(WgcmlElementTypes.FormToParentForm_4009);
			return types;
		}
		if (sourceEditPart instanceof CallEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.CallToBoundary_4013);
			types.add(WgcmlElementTypes.CallFromCall_4014);
			types.add(WgcmlElementTypes.CallConnections_4017);
			return types;
		}
		if (sourceEditPart instanceof BoundaryEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.BoundaryToCall_4015);
			types.add(WgcmlElementTypes.BoundaryToDecision_4016);
			return types;
		}
		if (sourceEditPart instanceof DecisionEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.DecisionFromDecisionToBoudary_4011);
			types.add(WgcmlElementTypes.DecisionFromDecision_4012);
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
		if (targetEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.DeviceToConnection_4010);
			types.add(WgcmlElementTypes.MediumToConnection_4004);
			types.add(WgcmlElementTypes.FormToConnection_4002);
			types.add(WgcmlElementTypes.CallConnections_4017);
			return types;
		}
		if (targetEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.IsAttachedFromPerson_4007);
			return types;
		}
		if (targetEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.PersonToIsAttached_4001);
			types.add(WgcmlElementTypes.DeviceFromIsAttached_4003);
			return types;
		}
		if (targetEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.ConnectionFromDevice_4005);
			types.add(WgcmlElementTypes.IsAttachedToDevice_4008);
			return types;
		}
		if (targetEditPart instanceof FormEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.MediumToForm_4006);
			types.add(WgcmlElementTypes.FormToParentForm_4009);
			return types;
		}
		if (targetEditPart instanceof CallEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.DecisionFromDecision_4012);
			types.add(WgcmlElementTypes.BoundaryToCall_4015);
			return types;
		}
		if (targetEditPart instanceof BoundaryEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.DecisionFromDecisionToBoudary_4011);
			types.add(WgcmlElementTypes.CallToBoundary_4013);
			return types;
		}
		if (targetEditPart instanceof DecisionEditPart) {
			List types = new ArrayList();
			types.add(WgcmlElementTypes.CallFromCall_4014);
			types.add(WgcmlElementTypes.BoundaryToDecision_4016);
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
		if (sourceEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof DeviceEditPart) {
				types.add(WgcmlElementTypes.ConnectionFromDevice_4005);
			}
			return types;
		}
		if (sourceEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof IsAttachedEditPart) {
				types.add(WgcmlElementTypes.PersonToIsAttached_4001);
			}
			return types;
		}
		if (sourceEditPart instanceof MediumEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ConnectionEditPart) {
				types.add(WgcmlElementTypes.MediumToConnection_4004);
			}
			if (targetEditPart instanceof FormEditPart) {
				types.add(WgcmlElementTypes.MediumToForm_4006);
			}
			return types;
		}
		if (sourceEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof PersonEditPart) {
				types.add(WgcmlElementTypes.IsAttachedFromPerson_4007);
			}
			if (targetEditPart instanceof DeviceEditPart) {
				types.add(WgcmlElementTypes.IsAttachedToDevice_4008);
			}
			return types;
		}
		if (sourceEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof IsAttachedEditPart) {
				types.add(WgcmlElementTypes.DeviceFromIsAttached_4003);
			}
			if (targetEditPart instanceof ConnectionEditPart) {
				types.add(WgcmlElementTypes.DeviceToConnection_4010);
			}
			return types;
		}
		if (sourceEditPart instanceof FormEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ConnectionEditPart) {
				types.add(WgcmlElementTypes.FormToConnection_4002);
			}
			if (targetEditPart instanceof FormEditPart) {
				types.add(WgcmlElementTypes.FormToParentForm_4009);
			}
			return types;
		}
		if (sourceEditPart instanceof CallEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof BoundaryEditPart) {
				types.add(WgcmlElementTypes.CallToBoundary_4013);
			}
			if (targetEditPart instanceof DecisionEditPart) {
				types.add(WgcmlElementTypes.CallFromCall_4014);
			}
			if (targetEditPart instanceof ConnectionEditPart) {
				types.add(WgcmlElementTypes.CallConnections_4017);
			}
			return types;
		}
		if (sourceEditPart instanceof BoundaryEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof CallEditPart) {
				types.add(WgcmlElementTypes.BoundaryToCall_4015);
			}
			if (targetEditPart instanceof DecisionEditPart) {
				types.add(WgcmlElementTypes.BoundaryToDecision_4016);
			}
			return types;
		}
		if (sourceEditPart instanceof DecisionEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof BoundaryEditPart) {
				types.add(WgcmlElementTypes.DecisionFromDecisionToBoudary_4011);
			}
			if (targetEditPart instanceof CallEditPart) {
				types.add(WgcmlElementTypes.DecisionFromDecision_4012);
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
		if (targetEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.DeviceToConnection_4010) {
				types.add(WgcmlElementTypes.Device_2005);
			}
			if (relationshipType == WgcmlElementTypes.MediumToConnection_4004) {
				types.add(WgcmlElementTypes.Medium_2003);
			}
			if (relationshipType == WgcmlElementTypes.FormToConnection_4002) {
				types.add(WgcmlElementTypes.Form_2006);
			}
			if (relationshipType == WgcmlElementTypes.CallConnections_4017) {
				types.add(WgcmlElementTypes.Call_2010);
			}
			return types;
		}
		if (targetEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.IsAttachedFromPerson_4007) {
				types.add(WgcmlElementTypes.IsAttached_2004);
			}
			return types;
		}
		if (targetEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.PersonToIsAttached_4001) {
				types.add(WgcmlElementTypes.Person_2002);
			}
			if (relationshipType == WgcmlElementTypes.DeviceFromIsAttached_4003) {
				types.add(WgcmlElementTypes.Device_2005);
			}
			return types;
		}
		if (targetEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.ConnectionFromDevice_4005) {
				types.add(WgcmlElementTypes.Connection_2001);
			}
			if (relationshipType == WgcmlElementTypes.IsAttachedToDevice_4008) {
				types.add(WgcmlElementTypes.IsAttached_2004);
			}
			return types;
		}
		if (targetEditPart instanceof FormEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.MediumToForm_4006) {
				types.add(WgcmlElementTypes.Medium_2003);
			}
			if (relationshipType == WgcmlElementTypes.FormToParentForm_4009) {
				types.add(WgcmlElementTypes.Form_2006);
			}
			return types;
		}
		if (targetEditPart instanceof CallEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.DecisionFromDecision_4012) {
				types.add(WgcmlElementTypes.Decision_2012);
			}
			if (relationshipType == WgcmlElementTypes.BoundaryToCall_4015) {
				types.add(WgcmlElementTypes.Boundary_2011);
			}
			return types;
		}
		if (targetEditPart instanceof BoundaryEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.DecisionFromDecisionToBoudary_4011) {
				types.add(WgcmlElementTypes.Decision_2012);
			}
			if (relationshipType == WgcmlElementTypes.CallToBoundary_4013) {
				types.add(WgcmlElementTypes.Call_2010);
			}
			return types;
		}
		if (targetEditPart instanceof DecisionEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.CallFromCall_4014) {
				types.add(WgcmlElementTypes.Call_2010);
			}
			if (relationshipType == WgcmlElementTypes.BoundaryToDecision_4016) {
				types.add(WgcmlElementTypes.Boundary_2011);
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
		if (sourceEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.ConnectionFromDevice_4005) {
				types.add(WgcmlElementTypes.Device_2005);
			}
			return types;
		}
		if (sourceEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.PersonToIsAttached_4001) {
				types.add(WgcmlElementTypes.IsAttached_2004);
			}
			return types;
		}
		if (sourceEditPart instanceof MediumEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.MediumToConnection_4004) {
				types.add(WgcmlElementTypes.Connection_2001);
			}
			if (relationshipType == WgcmlElementTypes.MediumToForm_4006) {
				types.add(WgcmlElementTypes.Form_2006);
			}
			return types;
		}
		if (sourceEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.IsAttachedFromPerson_4007) {
				types.add(WgcmlElementTypes.Person_2002);
			}
			if (relationshipType == WgcmlElementTypes.IsAttachedToDevice_4008) {
				types.add(WgcmlElementTypes.Device_2005);
			}
			return types;
		}
		if (sourceEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.DeviceFromIsAttached_4003) {
				types.add(WgcmlElementTypes.IsAttached_2004);
			}
			if (relationshipType == WgcmlElementTypes.DeviceToConnection_4010) {
				types.add(WgcmlElementTypes.Connection_2001);
			}
			return types;
		}
		if (sourceEditPart instanceof FormEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.FormToConnection_4002) {
				types.add(WgcmlElementTypes.Connection_2001);
			}
			if (relationshipType == WgcmlElementTypes.FormToParentForm_4009) {
				types.add(WgcmlElementTypes.Form_2006);
			}
			return types;
		}
		if (sourceEditPart instanceof CallEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.CallToBoundary_4013) {
				types.add(WgcmlElementTypes.Boundary_2011);
			}
			if (relationshipType == WgcmlElementTypes.CallFromCall_4014) {
				types.add(WgcmlElementTypes.Decision_2012);
			}
			if (relationshipType == WgcmlElementTypes.CallConnections_4017) {
				types.add(WgcmlElementTypes.Connection_2001);
			}
			return types;
		}
		if (sourceEditPart instanceof BoundaryEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.BoundaryToCall_4015) {
				types.add(WgcmlElementTypes.Call_2010);
			}
			if (relationshipType == WgcmlElementTypes.BoundaryToDecision_4016) {
				types.add(WgcmlElementTypes.Decision_2012);
			}
			return types;
		}
		if (sourceEditPart instanceof DecisionEditPart) {
			List types = new ArrayList();
			if (relationshipType == WgcmlElementTypes.DecisionFromDecisionToBoudary_4011) {
				types.add(WgcmlElementTypes.Boundary_2011);
			}
			if (relationshipType == WgcmlElementTypes.DecisionFromDecision_4012) {
				types.add(WgcmlElementTypes.Call_2010);
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
				WgcmlDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.WgcmlModelingAssistantProviderMessage);
		dialog.setTitle(Messages.WgcmlModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
