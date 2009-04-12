package gcml.diagram.part;

import gcml.diagram.providers.WgcmlElementTypes;

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
public class WgcmlPaletteFactory {

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
		paletteContainer.add(createBoundary7CreationTool());
		paletteContainer.add(createCall8CreationTool());
		paletteContainer.add(createActivities9CreationTool());
		paletteContainer.add(createDecision10CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WgcmlElementTypes.Connection_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Connection1CreationTool_title,
				Messages.Connection1CreationTool_desc, types);
		entry.setSmallIcon(WgcmlElementTypes
				.getImageDescriptor(WgcmlElementTypes.Connection_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WgcmlElementTypes.FormToConnection_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Device2CreationTool_title,
				Messages.Device2CreationTool_desc, types);
		entry.setSmallIcon(WgcmlElementTypes
				.getImageDescriptor(WgcmlElementTypes.FormToConnection_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForm3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WgcmlElementTypes.Person_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Form3CreationTool_title,
				Messages.Form3CreationTool_desc, types);
		entry.setSmallIcon(WgcmlElementTypes
				.getImageDescriptor(WgcmlElementTypes.Person_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIsAttached4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WgcmlElementTypes.Medium_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IsAttached4CreationTool_title,
				Messages.IsAttached4CreationTool_desc, types);
		entry.setSmallIcon(WgcmlElementTypes
				.getImageDescriptor(WgcmlElementTypes.Medium_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMedium5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WgcmlElementTypes.IsAttached_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Medium5CreationTool_title,
				Messages.Medium5CreationTool_desc, types);
		entry.setSmallIcon(WgcmlElementTypes
				.getImageDescriptor(WgcmlElementTypes.IsAttached_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPerson6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WgcmlElementTypes.Device_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Person6CreationTool_title,
				Messages.Person6CreationTool_desc, types);
		entry.setSmallIcon(WgcmlElementTypes
				.getImageDescriptor(WgcmlElementTypes.Device_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBoundary7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WgcmlElementTypes.Form_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Boundary7CreationTool_title,
				Messages.Boundary7CreationTool_desc, types);
		entry.setSmallIcon(WgcmlElementTypes
				.getImageDescriptor(WgcmlElementTypes.Form_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCall8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WgcmlElementTypes.Call_2010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Call8CreationTool_title,
				Messages.Call8CreationTool_desc, types);
		entry.setSmallIcon(WgcmlElementTypes
				.getImageDescriptor(WgcmlElementTypes.Call_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivities9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WgcmlElementTypes.Boundary_2011);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Activities9CreationTool_title,
				Messages.Activities9CreationTool_desc, types);
		entry.setSmallIcon(WgcmlElementTypes
				.getImageDescriptor(WgcmlElementTypes.Boundary_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecision10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WgcmlElementTypes.Decision_2012);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Decision10CreationTool_title,
				Messages.Decision10CreationTool_desc, types);
		entry.setSmallIcon(WgcmlElementTypes
				.getImageDescriptor(WgcmlElementTypes.Decision_2012));
		entry.setLargeIcon(entry.getSmallIcon());
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
