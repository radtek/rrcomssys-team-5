package gcml.diagram.edit.parts;

import gcml.diagram.edit.policies.MediumCanonicalEditPolicy;
import gcml.diagram.edit.policies.MediumItemSemanticEditPolicy;
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
public class MediumEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

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
	public MediumEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MediumItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new MediumCanonicalEditPolicy());
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
		MediumFigure figure = new MediumFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public MediumFigure getPrimaryShape() {
		return (MediumFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MediumMediumDataTypeEditPart) {
			((MediumMediumDataTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediumMediumDataTypeFigure());
			return true;
		}
		if (childEditPart instanceof MediumMediumNameEditPart) {
			((MediumMediumNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediumMediumNameFigure());
			return true;
		}
		if (childEditPart instanceof MediumSuggestedApplicationEditPart) {
			((MediumSuggestedApplicationEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediumSuggestedApplicationFigure());
			return true;
		}
		if (childEditPart instanceof MediumVoiceCommandEditPart) {
			((MediumVoiceCommandEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediumVoiceCommandFigure());
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
				.getType(MediumMediumDataTypeEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class MediumFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediumMediumDataTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediumMediumNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediumSuggestedApplicationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediumVoiceCommandFigure;

		/**
		 * @generated
		 */
		public MediumFigure() {

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

			fFigureMediumMediumDataTypeFigure = new WrappingLabel();
			fFigureMediumMediumDataTypeFigure.setText("<...>");

			this.add(fFigureMediumMediumDataTypeFigure);

			fFigureMediumMediumNameFigure = new WrappingLabel();
			fFigureMediumMediumNameFigure.setText("<...>");

			this.add(fFigureMediumMediumNameFigure);

			fFigureMediumSuggestedApplicationFigure = new WrappingLabel();
			fFigureMediumSuggestedApplicationFigure.setText("<...>");

			this.add(fFigureMediumSuggestedApplicationFigure);

			fFigureMediumVoiceCommandFigure = new WrappingLabel();
			fFigureMediumVoiceCommandFigure.setText("<...>");

			this.add(fFigureMediumVoiceCommandFigure);

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
		public WrappingLabel getFigureMediumMediumDataTypeFigure() {
			return fFigureMediumMediumDataTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediumMediumNameFigure() {
			return fFigureMediumMediumNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediumSuggestedApplicationFigure() {
			return fFigureMediumSuggestedApplicationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediumVoiceCommandFigure() {
			return fFigureMediumVoiceCommandFigure;
		}

	}

}
