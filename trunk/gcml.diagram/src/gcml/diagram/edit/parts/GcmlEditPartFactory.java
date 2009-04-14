package gcml.diagram.edit.parts;

import gcml.diagram.part.GcmlVisualIDRegistry;

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
public class GcmlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GcmlVisualIDRegistry.getVisualID(view)) {

			case GcmlEditPart.VISUAL_ID:
				return new GcmlEditPart(view);

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

			case FormFormTypeNameEditPart.VISUAL_ID:
				return new FormFormTypeNameEditPart(view);

			case FormMediumDataTypeEditPart.VISUAL_ID:
				return new FormMediumDataTypeEditPart(view);

			case FormSuggestedApplicationEditPart.VISUAL_ID:
				return new FormSuggestedApplicationEditPart(view);

			case FormVoiceCommandEditPart.VISUAL_ID:
				return new FormVoiceCommandEditPart(view);

			case MediumEditPart.VISUAL_ID:
				return new MediumEditPart(view);

			case MediumDerivedFromBuiltInTypeEditPart.VISUAL_ID:
				return new MediumDerivedFromBuiltInTypeEditPart(view);

			case MediumMediumTypeNameEditPart.VISUAL_ID:
				return new MediumMediumTypeNameEditPart(view);

			case MediumSuggestedApplicationEditPart.VISUAL_ID:
				return new MediumSuggestedApplicationEditPart(view);

			case MediumVoiceCommandEditPart.VISUAL_ID:
				return new MediumVoiceCommandEditPart(view);

			case CallEditPart.VISUAL_ID:
				return new CallEditPart(view);

			case CallActivityIDEditPart.VISUAL_ID:
				return new CallActivityIDEditPart(view);

			case CallOutcomeEditPart.VISUAL_ID:
				return new CallOutcomeEditPart(view);

			case BoundaryEditPart.VISUAL_ID:
				return new BoundaryEditPart(view);

			case BoundaryActivityIDEditPart.VISUAL_ID:
				return new BoundaryActivityIDEditPart(view);

			case BoundaryTypeEditPart.VISUAL_ID:
				return new BoundaryTypeEditPart(view);

			case PersonEditPart.VISUAL_ID:
				return new PersonEditPart(view);

			case PersonPersonIDEditPart.VISUAL_ID:
				return new PersonPersonIDEditPart(view);

			case PersonPersonNameEditPart.VISUAL_ID:
				return new PersonPersonNameEditPart(view);

			case PersonPersonRoleEditPart.VISUAL_ID:
				return new PersonPersonRoleEditPart(view);

			case IsAttachedEditPart.VISUAL_ID:
				return new IsAttachedEditPart(view);

			case DecisionEditPart.VISUAL_ID:
				return new DecisionEditPart(view);

			case DecisionActivityIDEditPart.VISUAL_ID:
				return new DecisionActivityIDEditPart(view);

			case DecisionFailPathIDEditPart.VISUAL_ID:
				return new DecisionFailPathIDEditPart(view);

			case DecisionSourceActivityIDEditPart.VISUAL_ID:
				return new DecisionSourceActivityIDEditPart(view);

			case DecisionSuccessPathIDEditPart.VISUAL_ID:
				return new DecisionSuccessPathIDEditPart(view);

			case ConnectionEditPart.VISUAL_ID:
				return new ConnectionEditPart(view);

			case ConnectionBandwidthEditPart.VISUAL_ID:
				return new ConnectionBandwidthEditPart(view);

			case ConnectionConnectionIDEditPart.VISUAL_ID:
				return new ConnectionConnectionIDEditPart(view);

			case PersonToIsAttachedEditPart.VISUAL_ID:
				return new PersonToIsAttachedEditPart(view);

			case IsAttachedToDeviceEditPart.VISUAL_ID:
				return new IsAttachedToDeviceEditPart(view);

			case DecisionDecisionToCallEditPart.VISUAL_ID:
				return new DecisionDecisionToCallEditPart(view);

			case FormToParentFormEditPart.VISUAL_ID:
				return new FormToParentFormEditPart(view);

			case BoundaryBoundaryToCallEditPart.VISUAL_ID:
				return new BoundaryBoundaryToCallEditPart(view);

			case IsAttachedFromPersonEditPart.VISUAL_ID:
				return new IsAttachedFromPersonEditPart(view);

			case ConnectionConnectionToCallEditPart.VISUAL_ID:
				return new ConnectionConnectionToCallEditPart(view);

			case ConnectionFromDeviceEditPart.VISUAL_ID:
				return new ConnectionFromDeviceEditPart(view);

			case FormToConnectionEditPart.VISUAL_ID:
				return new FormToConnectionEditPart(view);

			case DeviceToConnectionEditPart.VISUAL_ID:
				return new DeviceToConnectionEditPart(view);

			case CallCallToBoundaryEditPart.VISUAL_ID:
				return new CallCallToBoundaryEditPart(view);

			case CallCallToConnectionEditPart.VISUAL_ID:
				return new CallCallToConnectionEditPart(view);

			case DecisionDecisionToBoundaryEditPart.VISUAL_ID:
				return new DecisionDecisionToBoundaryEditPart(view);

			case DeviceFromIsAttachedEditPart.VISUAL_ID:
				return new DeviceFromIsAttachedEditPart(view);

			case CallCallToDecisionEditPart.VISUAL_ID:
				return new CallCallToDecisionEditPart(view);

			case MediumToConnectionEditPart.VISUAL_ID:
				return new MediumToConnectionEditPart(view);
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
