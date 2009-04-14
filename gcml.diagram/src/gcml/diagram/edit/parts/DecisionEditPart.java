package gcml.diagram.edit.parts;

import gcml.diagram.edit.policies.DecisionItemSemanticEditPolicy;

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
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DecisionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2008;

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
	public DecisionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DecisionItemSemanticEditPolicy());
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
		DecisionFigure figure = new DecisionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public DecisionFigure getPrimaryShape() {
		return (DecisionFigure) primaryShape;
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
	public class DecisionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDecisionActivityIDFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDecisionSourceActivityIDFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDecisionSuccessPathIDFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDecisionFailPathIDFigure;

		/**
		 * @generated
		 */
		public DecisionFigure() {

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

			fFigureDecisionActivityIDFigure = new WrappingLabel();
			fFigureDecisionActivityIDFigure.setText("<...>");

			this.add(fFigureDecisionActivityIDFigure);

			fFigureDecisionSourceActivityIDFigure = new WrappingLabel();
			fFigureDecisionSourceActivityIDFigure.setText("<...>");

			this.add(fFigureDecisionSourceActivityIDFigure);

			fFigureDecisionSuccessPathIDFigure = new WrappingLabel();
			fFigureDecisionSuccessPathIDFigure.setText("<...>");

			this.add(fFigureDecisionSuccessPathIDFigure);

			fFigureDecisionFailPathIDFigure = new WrappingLabel();
			fFigureDecisionFailPathIDFigure.setText("<...>");

			this.add(fFigureDecisionFailPathIDFigure);

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
		public WrappingLabel getFigureDecisionActivityIDFigure() {
			return fFigureDecisionActivityIDFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDecisionSourceActivityIDFigure() {
			return fFigureDecisionSourceActivityIDFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDecisionSuccessPathIDFigure() {
			return fFigureDecisionSuccessPathIDFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDecisionFailPathIDFigure() {
			return fFigureDecisionFailPathIDFigure;
		}

	}

}
