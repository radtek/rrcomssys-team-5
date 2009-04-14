package gcml.diagram.part;

import gcml.diagram.providers.GcmlElementTypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class GcmlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGcml1Group());
	}

	/**
	 * Creates "gcml" palette tool group
	 * @generated
	 */
	private PaletteContainer createGcml1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Gcml1Group_title);
		paletteContainer.add(createConnection1CreationTool());
		paletteContainer.add(createDevice2CreationTool());
		paletteContainer.add(createForm3CreationTool());
		paletteContainer.add(createIsAttached4CreationTool());
		paletteContainer.add(createMedium5CreationTool());
		paletteContainer.add(createPerson6CreationTool());
		paletteContainer.add(createCall7CreationTool());
		paletteContainer.add(createDecision8CreationTool());
		paletteContainer.add(createBoundary9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GcmlElementTypes.Connection_2009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Connection1CreationTool_title,
				Messages.Connection1CreationTool_desc, types);
		entry
				.setSmallIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Connection_16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Connection_32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GcmlElementTypes.Device_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Device2CreationTool_title,
				Messages.Device2CreationTool_desc, types);
		entry
				.setSmallIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Device_32x32.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Device_16x16.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForm3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GcmlElementTypes.Form_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Form3CreationTool_title,
				Messages.Form3CreationTool_desc, types);
		entry
				.setSmallIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Form_16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Form_32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIsAttached4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GcmlElementTypes.IsAttached_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IsAttached4CreationTool_title,
				Messages.IsAttached4CreationTool_desc, types);
		entry
				.setSmallIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/IsAttached_16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/IsAttached_32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMedium5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GcmlElementTypes.Medium_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Medium5CreationTool_title,
				Messages.Medium5CreationTool_desc, types);
		entry
				.setSmallIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Medium_16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Medium_32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPerson6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GcmlElementTypes.Person_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Person6CreationTool_title,
				Messages.Person6CreationTool_desc, types);
		entry
				.setSmallIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Person_16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Person_32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCall7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GcmlElementTypes.Call_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Call7CreationTool_title,
				Messages.Call7CreationTool_desc, types);
		entry
				.setSmallIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Call_16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Call_32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecision8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GcmlElementTypes.Decision_2008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Decision8CreationTool_title,
				Messages.Decision8CreationTool_desc, types);
		entry
				.setSmallIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Decision_16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Decision_32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBoundary9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GcmlElementTypes.Boundary_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Boundary9CreationTool_title,
				Messages.Boundary9CreationTool_desc, types);
		entry
				.setSmallIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Boundary_16x16.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(GcmlDiagramEditorPlugin
						.findImageDescriptor("/gcml.edit/icons/full/obj16/Boundary_32x32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
