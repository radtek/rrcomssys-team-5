package gcml.diagram.providers;

import gcml.GcmlPackage;
import gcml.diagram.edit.parts.BoundaryActivityIDEditPart;
import gcml.diagram.edit.parts.BoundaryTypeEditPart;
import gcml.diagram.edit.parts.CallActivityIDEditPart;
import gcml.diagram.edit.parts.CallOutcomeEditPart;
import gcml.diagram.edit.parts.ConnectionBandwidthEditPart;
import gcml.diagram.edit.parts.ConnectionConnectionIDEditPart;
import gcml.diagram.edit.parts.DecisionActivityIDEditPart;
import gcml.diagram.edit.parts.DecisionFailPathIDEditPart;
import gcml.diagram.edit.parts.DecisionSourceActivityIDEditPart;
import gcml.diagram.edit.parts.DecisionSuccessPathIDEditPart;
import gcml.diagram.edit.parts.DeviceDeviceCapabilityEditPart;
import gcml.diagram.edit.parts.DeviceIsLocalEditPart;
import gcml.diagram.edit.parts.DeviceIsVirtualEditPart;
import gcml.diagram.edit.parts.FormActionEditPart;
import gcml.diagram.edit.parts.FormFormTypeNameEditPart;
import gcml.diagram.edit.parts.FormMediumDataTypeEditPart;
import gcml.diagram.edit.parts.FormSuggestedApplicationEditPart;
import gcml.diagram.edit.parts.FormVoiceCommandEditPart;
import gcml.diagram.edit.parts.MediumDerivedFromBuiltInTypeEditPart;
import gcml.diagram.edit.parts.MediumMediumTypeNameEditPart;
import gcml.diagram.edit.parts.MediumSuggestedApplicationEditPart;
import gcml.diagram.edit.parts.MediumVoiceCommandEditPart;
import gcml.diagram.edit.parts.PersonPersonIDEditPart;
import gcml.diagram.edit.parts.PersonPersonNameEditPart;
import gcml.diagram.edit.parts.PersonPersonRoleEditPart;
import gcml.diagram.parsers.MessageFormatParser;
import gcml.diagram.part.GcmlVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GcmlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser deviceDeviceCapability_5001Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceDeviceCapability_5001Parser() {
		if (deviceDeviceCapability_5001Parser == null) {
			deviceDeviceCapability_5001Parser = createDeviceDeviceCapability_5001Parser();
		}
		return deviceDeviceCapability_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeviceDeviceCapability_5001Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDevice_DeviceCapability(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceIsLocal_5002Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceIsLocal_5002Parser() {
		if (deviceIsLocal_5002Parser == null) {
			deviceIsLocal_5002Parser = createDeviceIsLocal_5002Parser();
		}
		return deviceIsLocal_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeviceIsLocal_5002Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDevice_IsLocal(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceIsVirtual_5003Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceIsVirtual_5003Parser() {
		if (deviceIsVirtual_5003Parser == null) {
			deviceIsVirtual_5003Parser = createDeviceIsVirtual_5003Parser();
		}
		return deviceIsVirtual_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeviceIsVirtual_5003Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDevice_IsVirtual(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formAction_5004Parser;

	/**
	 * @generated
	 */
	private IParser getFormAction_5004Parser() {
		if (formAction_5004Parser == null) {
			formAction_5004Parser = createFormAction_5004Parser();
		}
		return formAction_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormAction_5004Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getForm_Action(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formFormTypeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getFormFormTypeName_5005Parser() {
		if (formFormTypeName_5005Parser == null) {
			formFormTypeName_5005Parser = createFormFormTypeName_5005Parser();
		}
		return formFormTypeName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormFormTypeName_5005Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getForm_FormTypeName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formMediumDataType_5006Parser;

	/**
	 * @generated
	 */
	private IParser getFormMediumDataType_5006Parser() {
		if (formMediumDataType_5006Parser == null) {
			formMediumDataType_5006Parser = createFormMediumDataType_5006Parser();
		}
		return formMediumDataType_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormMediumDataType_5006Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getForm_MediumDataType(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formSuggestedApplication_5007Parser;

	/**
	 * @generated
	 */
	private IParser getFormSuggestedApplication_5007Parser() {
		if (formSuggestedApplication_5007Parser == null) {
			formSuggestedApplication_5007Parser = createFormSuggestedApplication_5007Parser();
		}
		return formSuggestedApplication_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormSuggestedApplication_5007Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getForm_SuggestedApplication(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formVoiceCommand_5008Parser;

	/**
	 * @generated
	 */
	private IParser getFormVoiceCommand_5008Parser() {
		if (formVoiceCommand_5008Parser == null) {
			formVoiceCommand_5008Parser = createFormVoiceCommand_5008Parser();
		}
		return formVoiceCommand_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormVoiceCommand_5008Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getForm_VoiceCommand(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumDerivedFromBuiltInType_5009Parser;

	/**
	 * @generated
	 */
	private IParser getMediumDerivedFromBuiltInType_5009Parser() {
		if (mediumDerivedFromBuiltInType_5009Parser == null) {
			mediumDerivedFromBuiltInType_5009Parser = createMediumDerivedFromBuiltInType_5009Parser();
		}
		return mediumDerivedFromBuiltInType_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediumDerivedFromBuiltInType_5009Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getMedium_DerivedFromBuiltInType(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumMediumTypeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getMediumMediumTypeName_5010Parser() {
		if (mediumMediumTypeName_5010Parser == null) {
			mediumMediumTypeName_5010Parser = createMediumMediumTypeName_5010Parser();
		}
		return mediumMediumTypeName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediumMediumTypeName_5010Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getMedium_MediumTypeName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumSuggestedApplication_5011Parser;

	/**
	 * @generated
	 */
	private IParser getMediumSuggestedApplication_5011Parser() {
		if (mediumSuggestedApplication_5011Parser == null) {
			mediumSuggestedApplication_5011Parser = createMediumSuggestedApplication_5011Parser();
		}
		return mediumSuggestedApplication_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediumSuggestedApplication_5011Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getMedium_SuggestedApplication(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumVoiceCommand_5012Parser;

	/**
	 * @generated
	 */
	private IParser getMediumVoiceCommand_5012Parser() {
		if (mediumVoiceCommand_5012Parser == null) {
			mediumVoiceCommand_5012Parser = createMediumVoiceCommand_5012Parser();
		}
		return mediumVoiceCommand_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediumVoiceCommand_5012Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getMedium_VoiceCommand(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callActivityID_5013Parser;

	/**
	 * @generated
	 */
	private IParser getCallActivityID_5013Parser() {
		if (callActivityID_5013Parser == null) {
			callActivityID_5013Parser = createCallActivityID_5013Parser();
		}
		return callActivityID_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallActivityID_5013Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getActivity_ActivityID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callOutcome_5014Parser;

	/**
	 * @generated
	 */
	private IParser getCallOutcome_5014Parser() {
		if (callOutcome_5014Parser == null) {
			callOutcome_5014Parser = createCallOutcome_5014Parser();
		}
		return callOutcome_5014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallOutcome_5014Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getCall_Outcome(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser boundaryActivityID_5015Parser;

	/**
	 * @generated
	 */
	private IParser getBoundaryActivityID_5015Parser() {
		if (boundaryActivityID_5015Parser == null) {
			boundaryActivityID_5015Parser = createBoundaryActivityID_5015Parser();
		}
		return boundaryActivityID_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBoundaryActivityID_5015Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getActivity_ActivityID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser boundaryType_5016Parser;

	/**
	 * @generated
	 */
	private IParser getBoundaryType_5016Parser() {
		if (boundaryType_5016Parser == null) {
			boundaryType_5016Parser = createBoundaryType_5016Parser();
		}
		return boundaryType_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBoundaryType_5016Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getBoundary_Type(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonID_5017Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonID_5017Parser() {
		if (personPersonID_5017Parser == null) {
			personPersonID_5017Parser = createPersonPersonID_5017Parser();
		}
		return personPersonID_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonID_5017Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getPerson_PersonID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonName_5018Parser() {
		if (personPersonName_5018Parser == null) {
			personPersonName_5018Parser = createPersonPersonName_5018Parser();
		}
		return personPersonName_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonName_5018Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getPerson_PersonName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonRole_5019Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonRole_5019Parser() {
		if (personPersonRole_5019Parser == null) {
			personPersonRole_5019Parser = createPersonPersonRole_5019Parser();
		}
		return personPersonRole_5019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonRole_5019Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getPerson_PersonRole(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionActivityID_5020Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionActivityID_5020Parser() {
		if (decisionActivityID_5020Parser == null) {
			decisionActivityID_5020Parser = createDecisionActivityID_5020Parser();
		}
		return decisionActivityID_5020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDecisionActivityID_5020Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getActivity_ActivityID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionFailPathID_5021Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionFailPathID_5021Parser() {
		if (decisionFailPathID_5021Parser == null) {
			decisionFailPathID_5021Parser = createDecisionFailPathID_5021Parser();
		}
		return decisionFailPathID_5021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDecisionFailPathID_5021Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDecision_FailPathID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionSourceActivityID_5022Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionSourceActivityID_5022Parser() {
		if (decisionSourceActivityID_5022Parser == null) {
			decisionSourceActivityID_5022Parser = createDecisionSourceActivityID_5022Parser();
		}
		return decisionSourceActivityID_5022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDecisionSourceActivityID_5022Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDecision_SourceActivityID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionSuccessPathID_5023Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionSuccessPathID_5023Parser() {
		if (decisionSuccessPathID_5023Parser == null) {
			decisionSuccessPathID_5023Parser = createDecisionSuccessPathID_5023Parser();
		}
		return decisionSuccessPathID_5023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDecisionSuccessPathID_5023Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDecision_SuccessPathID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionBandwidth_5024Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionBandwidth_5024Parser() {
		if (connectionBandwidth_5024Parser == null) {
			connectionBandwidth_5024Parser = createConnectionBandwidth_5024Parser();
		}
		return connectionBandwidth_5024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConnectionBandwidth_5024Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getConnection_Bandwidth(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionConnectionID_5025Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionConnectionID_5025Parser() {
		if (connectionConnectionID_5025Parser == null) {
			connectionConnectionID_5025Parser = createConnectionConnectionID_5025Parser();
		}
		return connectionConnectionID_5025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConnectionConnectionID_5025Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getConnection_ConnectionID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DeviceDeviceCapabilityEditPart.VISUAL_ID:
			return getDeviceDeviceCapability_5001Parser();
		case DeviceIsLocalEditPart.VISUAL_ID:
			return getDeviceIsLocal_5002Parser();
		case DeviceIsVirtualEditPart.VISUAL_ID:
			return getDeviceIsVirtual_5003Parser();
		case FormActionEditPart.VISUAL_ID:
			return getFormAction_5004Parser();
		case FormFormTypeNameEditPart.VISUAL_ID:
			return getFormFormTypeName_5005Parser();
		case FormMediumDataTypeEditPart.VISUAL_ID:
			return getFormMediumDataType_5006Parser();
		case FormSuggestedApplicationEditPart.VISUAL_ID:
			return getFormSuggestedApplication_5007Parser();
		case FormVoiceCommandEditPart.VISUAL_ID:
			return getFormVoiceCommand_5008Parser();
		case MediumDerivedFromBuiltInTypeEditPart.VISUAL_ID:
			return getMediumDerivedFromBuiltInType_5009Parser();
		case MediumMediumTypeNameEditPart.VISUAL_ID:
			return getMediumMediumTypeName_5010Parser();
		case MediumSuggestedApplicationEditPart.VISUAL_ID:
			return getMediumSuggestedApplication_5011Parser();
		case MediumVoiceCommandEditPart.VISUAL_ID:
			return getMediumVoiceCommand_5012Parser();
		case CallActivityIDEditPart.VISUAL_ID:
			return getCallActivityID_5013Parser();
		case CallOutcomeEditPart.VISUAL_ID:
			return getCallOutcome_5014Parser();
		case BoundaryActivityIDEditPart.VISUAL_ID:
			return getBoundaryActivityID_5015Parser();
		case BoundaryTypeEditPart.VISUAL_ID:
			return getBoundaryType_5016Parser();
		case PersonPersonIDEditPart.VISUAL_ID:
			return getPersonPersonID_5017Parser();
		case PersonPersonNameEditPart.VISUAL_ID:
			return getPersonPersonName_5018Parser();
		case PersonPersonRoleEditPart.VISUAL_ID:
			return getPersonPersonRole_5019Parser();
		case DecisionActivityIDEditPart.VISUAL_ID:
			return getDecisionActivityID_5020Parser();
		case DecisionFailPathIDEditPart.VISUAL_ID:
			return getDecisionFailPathID_5021Parser();
		case DecisionSourceActivityIDEditPart.VISUAL_ID:
			return getDecisionSourceActivityID_5022Parser();
		case DecisionSuccessPathIDEditPart.VISUAL_ID:
			return getDecisionSuccessPathID_5023Parser();
		case ConnectionBandwidthEditPart.VISUAL_ID:
			return getConnectionBandwidth_5024Parser();
		case ConnectionConnectionIDEditPart.VISUAL_ID:
			return getConnectionConnectionID_5025Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GcmlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GcmlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GcmlElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
