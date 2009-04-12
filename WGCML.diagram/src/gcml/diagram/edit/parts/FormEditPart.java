package gcml.diagram.edit.parts;

import gcml.diagram.edit.policies.FormCanonicalEditPolicy;
import gcml.diagram.edit.policies.FormItemSemanticEditPolicy;
import gcml.diagram.part.WgcmlVisualIDRegistry;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FormEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public FormEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new FormItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new FormCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		FormFigure figure = new FormFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public FormFigure getPrimaryShape() {
		return (FormFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FormActionEditPart) {
			((FormActionEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureFormActionFigure());
			return true;
		}
		if (childEditPart instanceof FormFormDataTypeEditPart) {
			((FormFormDataTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFormFormDataTypeFigure());
			return true;
		}
		if (childEditPart instanceof FormFormNameEditPart) {
			((FormFormNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureFormFormNameFigure());
			return true;
		}
		if (childEditPart instanceof FormSuggestedApplicationEditPart) {
			((FormSuggestedApplicationEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFormSuggestedApplicationFigure());
			return true;
		}
		if (childEditPart instanceof FormVoiceCommandEditPart) {
			((FormVoiceCommandEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFormVoiceCommandFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(40), getMapMode().DPtoLP(40));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(WgcmlVisualIDRegistry
				.getType(FormActionEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class FormFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormActionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormFormDataTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormFormNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormSuggestedApplicationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormVoiceCommandFigure;

		/**
		 * @generated
		 */
		public FormFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureFormActionFigure = new WrappingLabel();
			fFigureFormActionFigure.setText("<...>");

			this.add(fFigureFormActionFigure);

			fFigureFormFormDataTypeFigure = new WrappingLabel();
			fFigureFormFormDataTypeFigure.setText("<...>");

			this.add(fFigureFormFormDataTypeFigure);

			fFigureFormFormNameFigure = new WrappingLabel();
			fFigureFormFormNameFigure.setText("<...>");

			this.add(fFigureFormFormNameFigure);

			fFigureFormSuggestedApplicationFigure = new WrappingLabel();
			fFigureFormSuggestedApplicationFigure.setText("<...>");

			this.add(fFigureFormSuggestedApplicationFigure);

			fFigureFormVoiceCommandFigure = new WrappingLabel();
			fFigureFormVoiceCommandFigure.setText("<...>");

			this.add(fFigureFormVoiceCommandFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormActionFigure() {
			return fFigureFormActionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormFormDataTypeFigure() {
			return fFigureFormFormDataTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormFormNameFigure() {
			return fFigureFormFormNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormSuggestedApplicationFigure() {
			return fFigureFormSuggestedApplicationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormVoiceCommandFigure() {
			return fFigureFormVoiceCommandFigure;
		}

	}

}
