package gcml.diagram.edit.parts;

import gcml.diagram.part.WgcmlVisualIDRegistry;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class WgcmlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WgcmlVisualIDRegistry.getVisualID(view)) {

			case WgcmlEditPart.VISUAL_ID:
				return new WgcmlEditPart(view);

			case ConnectionEditPart.VISUAL_ID:
				return new ConnectionEditPart(view);

			case ConnectionBandwidthEditPart.VISUAL_ID:
				return new ConnectionBandwidthEditPart(view);

			case ConnectionConnectionIDEditPart.VISUAL_ID:
				return new ConnectionConnectionIDEditPart(view);

			case PersonEditPart.VISUAL_ID:
				return new PersonEditPart(view);

			case PersonPersonNameEditPart.VISUAL_ID:
				return new PersonPersonNameEditPart(view);

			case PersonPersonIDEditPart.VISUAL_ID:
				return new PersonPersonIDEditPart(view);

			case PersonPersonRoleEditPart.VISUAL_ID:
				return new PersonPersonRoleEditPart(view);

			case MediumEditPart.VISUAL_ID:
				return new MediumEditPart(view);

			case MediumMediumDataTypeEditPart.VISUAL_ID:
				return new MediumMediumDataTypeEditPart(view);

			case MediumMediumNameEditPart.VISUAL_ID:
				return new MediumMediumNameEditPart(view);

			case MediumSuggestedApplicationEditPart.VISUAL_ID:
				return new MediumSuggestedApplicationEditPart(view);

			case MediumVoiceCommandEditPart.VISUAL_ID:
				return new MediumVoiceCommandEditPart(view);

			case IsAttachedEditPart.VISUAL_ID:
				return new IsAttachedEditPart(view);

			case DeviceEditPart.VISUAL_ID:
				return new DeviceEditPart(view);

			case DeviceDeviceCapabilityEditPart.VISUAL_ID:
				return new DeviceDeviceCapabilityEditPart(view);

			case DeviceIsLocalEditPart.VISUAL_ID:
				return new DeviceIsLocalEditPart(view);

			case DeviceIsVirtualEditPart.VISUAL_ID:
				return new DeviceIsVirtualEditPart(view);

			case FormEditPart.VISUAL_ID:
				return new FormEditPart(view);

			case FormActionEditPart.VISUAL_ID:
				return new FormActionEditPart(view);

			case FormFormDataTypeEditPart.VISUAL_ID:
				return new FormFormDataTypeEditPart(view);

			case FormFormNameEditPart.VISUAL_ID:
				return new FormFormNameEditPart(view);

			case FormSuggestedApplicationEditPart.VISUAL_ID:
				return new FormSuggestedApplicationEditPart(view);

			case FormVoiceCommandEditPart.VISUAL_ID:
				return new FormVoiceCommandEditPart(view);

			case CallEditPart.VISUAL_ID:
				return new CallEditPart(view);

			case CallActivityIdEditPart.VISUAL_ID:
				return new CallActivityIdEditPart(view);

			case CallOutcomeEditPart.VISUAL_ID:
				return new CallOutcomeEditPart(view);

			case BoundaryEditPart.VISUAL_ID:
				return new BoundaryEditPart(view);

			case BoundaryActivityIdEditPart.VISUAL_ID:
				return new BoundaryActivityIdEditPart(view);

			case BoundaryNameEditPart.VISUAL_ID:
				return new BoundaryNameEditPart(view);

			case BoundaryOutcomeEditPart.VISUAL_ID:
				return new BoundaryOutcomeEditPart(view);

			case BoundaryTypeEditPart.VISUAL_ID:
				return new BoundaryTypeEditPart(view);

			case DecisionEditPart.VISUAL_ID:
				return new DecisionEditPart(view);

			case DecisionSourceActivityIDEditPart.VISUAL_ID:
				return new DecisionSourceActivityIDEditPart(view);

			case DecisionActivityIdEditPart.VISUAL_ID:
				return new DecisionActivityIdEditPart(view);

			case DecisionAlternatePathIDEditPart.VISUAL_ID:
				return new DecisionAlternatePathIDEditPart(view);

			case DecisionSuccessPathIDEditPart.VISUAL_ID:
				return new DecisionSuccessPathIDEditPart(view);

			case DecisionOutcomeEditPart.VISUAL_ID:
				return new DecisionOutcomeEditPart(view);

			case PersonToIsAttachedEditPart.VISUAL_ID:
				return new PersonToIsAttachedEditPart(view);

			case DeviceFromIsAttachedEditPart.VISUAL_ID:
				return new DeviceFromIsAttachedEditPart(view);

			case DeviceToConnectionEditPart.VISUAL_ID:
				return new DeviceToConnectionEditPart(view);

			case MediumToConnectionEditPart.VISUAL_ID:
				return new MediumToConnectionEditPart(view);

			case MediumToFormEditPart.VISUAL_ID:
				return new MediumToFormEditPart(view);

			case ConnectionFromDeviceEditPart.VISUAL_ID:
				return new ConnectionFromDeviceEditPart(view);

			case IsAttachedFromPersonEditPart.VISUAL_ID:
				return new IsAttachedFromPersonEditPart(view);

			case IsAttachedToDeviceEditPart.VISUAL_ID:
				return new IsAttachedToDeviceEditPart(view);

			case FormToConnectionEditPart.VISUAL_ID:
				return new FormToConnectionEditPart(view);

			case FormToParentFormEditPart.VISUAL_ID:
				return new FormToParentFormEditPart(view);

			case DecisionFromDecisionToBoudaryEditPart.VISUAL_ID:
				return new DecisionFromDecisionToBoudaryEditPart(view);

			case DecisionFromDecisionEditPart.VISUAL_ID:
				return new DecisionFromDecisionEditPart(view);

			case CallToBoundaryEditPart.VISUAL_ID:
				return new CallToBoundaryEditPart(view);

			case CallFromCallEditPart.VISUAL_ID:
				return new CallFromCallEditPart(view);

			case BoundaryToCallEditPart.VISUAL_ID:
				return new BoundaryToCallEditPart(view);

			case BoundaryToDecisionEditPart.VISUAL_ID:
				return new BoundaryToDecisionEditPart(view);

			case CallConnectionsEditPart.VISUAL_ID:
				return new CallConnectionsEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
