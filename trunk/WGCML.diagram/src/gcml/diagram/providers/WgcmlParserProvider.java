package gcml.diagram.providers;

import gcml.GcmlPackage;
import gcml.diagram.edit.parts.BoundaryActivityIdEditPart;
import gcml.diagram.edit.parts.BoundaryNameEditPart;
import gcml.diagram.edit.parts.BoundaryOutcomeEditPart;
import gcml.diagram.edit.parts.BoundaryTypeEditPart;
import gcml.diagram.edit.parts.CallActivityIdEditPart;
import gcml.diagram.edit.parts.CallOutcomeEditPart;
import gcml.diagram.edit.parts.ConnectionBandwidthEditPart;
import gcml.diagram.edit.parts.ConnectionConnectionIDEditPart;
import gcml.diagram.edit.parts.DecisionActivityIdEditPart;
import gcml.diagram.edit.parts.DecisionAlternatePathIDEditPart;
import gcml.diagram.edit.parts.DecisionOutcomeEditPart;
import gcml.diagram.edit.parts.DecisionSourceActivityIDEditPart;
import gcml.diagram.edit.parts.DecisionSuccessPathIDEditPart;
import gcml.diagram.edit.parts.DeviceDeviceCapabilityEditPart;
import gcml.diagram.edit.parts.DeviceIsLocalEditPart;
import gcml.diagram.edit.parts.DeviceIsVirtualEditPart;
import gcml.diagram.edit.parts.FormActionEditPart;
import gcml.diagram.edit.parts.FormFormDataTypeEditPart;
import gcml.diagram.edit.parts.FormFormNameEditPart;
import gcml.diagram.edit.parts.FormSuggestedApplicationEditPart;
import gcml.diagram.edit.parts.FormVoiceCommandEditPart;
import gcml.diagram.edit.parts.MediumMediumDataTypeEditPart;
import gcml.diagram.edit.parts.MediumMediumNameEditPart;
import gcml.diagram.edit.parts.MediumSuggestedApplicationEditPart;
import gcml.diagram.edit.parts.MediumVoiceCommandEditPart;
import gcml.diagram.edit.parts.PersonPersonIDEditPart;
import gcml.diagram.edit.parts.PersonPersonNameEditPart;
import gcml.diagram.edit.parts.PersonPersonRoleEditPart;
import gcml.diagram.parsers.MessageFormatParser;
import gcml.diagram.part.WgcmlVisualIDRegistry;

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
public class WgcmlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser connectionBandwidth_5001Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionBandwidth_5001Parser() {
		if (connectionBandwidth_5001Parser == null) {
			connectionBandwidth_5001Parser = createConnectionBandwidth_5001Parser();
		}
		return connectionBandwidth_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConnectionBandwidth_5001Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getConnection_Bandwidth(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionConnectionID_5002Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionConnectionID_5002Parser() {
		if (connectionConnectionID_5002Parser == null) {
			connectionConnectionID_5002Parser = createConnectionConnectionID_5002Parser();
		}
		return connectionConnectionID_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConnectionConnectionID_5002Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getConnection_ConnectionID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonName_5003Parser() {
		if (personPersonName_5003Parser == null) {
			personPersonName_5003Parser = createPersonPersonName_5003Parser();
		}
		return personPersonName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonName_5003Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getPerson_PersonName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonID_5004Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonID_5004Parser() {
		if (personPersonID_5004Parser == null) {
			personPersonID_5004Parser = createPersonPersonID_5004Parser();
		}
		return personPersonID_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonID_5004Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getPerson_PersonID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonRole_5005Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonRole_5005Parser() {
		if (personPersonRole_5005Parser == null) {
			personPersonRole_5005Parser = createPersonPersonRole_5005Parser();
		}
		return personPersonRole_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonRole_5005Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getPerson_PersonRole(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumMediumDataType_5006Parser;

	/**
	 * @generated
	 */
	private IParser getMediumMediumDataType_5006Parser() {
		if (mediumMediumDataType_5006Parser == null) {
			mediumMediumDataType_5006Parser = createMediumMediumDataType_5006Parser();
		}
		return mediumMediumDataType_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediumMediumDataType_5006Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getMedium_MediumDataType(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumMediumName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getMediumMediumName_5007Parser() {
		if (mediumMediumName_5007Parser == null) {
			mediumMediumName_5007Parser = createMediumMediumName_5007Parser();
		}
		return mediumMediumName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediumMediumName_5007Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getMedium_MediumName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumSuggestedApplication_5008Parser;

	/**
	 * @generated
	 */
	private IParser getMediumSuggestedApplication_5008Parser() {
		if (mediumSuggestedApplication_5008Parser == null) {
			mediumSuggestedApplication_5008Parser = createMediumSuggestedApplication_5008Parser();
		}
		return mediumSuggestedApplication_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediumSuggestedApplication_5008Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getMedium_SuggestedApplication(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumVoiceCommand_5009Parser;

	/**
	 * @generated
	 */
	private IParser getMediumVoiceCommand_5009Parser() {
		if (mediumVoiceCommand_5009Parser == null) {
			mediumVoiceCommand_5009Parser = createMediumVoiceCommand_5009Parser();
		}
		return mediumVoiceCommand_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediumVoiceCommand_5009Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getMedium_VoiceCommand(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceDeviceCapability_5010Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceDeviceCapability_5010Parser() {
		if (deviceDeviceCapability_5010Parser == null) {
			deviceDeviceCapability_5010Parser = createDeviceDeviceCapability_5010Parser();
		}
		return deviceDeviceCapability_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeviceDeviceCapability_5010Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDevice_DeviceCapability(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceIsLocal_5011Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceIsLocal_5011Parser() {
		if (deviceIsLocal_5011Parser == null) {
			deviceIsLocal_5011Parser = createDeviceIsLocal_5011Parser();
		}
		return deviceIsLocal_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeviceIsLocal_5011Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDevice_IsLocal(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceIsVirtual_5012Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceIsVirtual_5012Parser() {
		if (deviceIsVirtual_5012Parser == null) {
			deviceIsVirtual_5012Parser = createDeviceIsVirtual_5012Parser();
		}
		return deviceIsVirtual_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeviceIsVirtual_5012Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDevice_IsVirtual(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formAction_5013Parser;

	/**
	 * @generated
	 */
	private IParser getFormAction_5013Parser() {
		if (formAction_5013Parser == null) {
			formAction_5013Parser = createFormAction_5013Parser();
		}
		return formAction_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormAction_5013Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getForm_Action(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formFormDataType_5014Parser;

	/**
	 * @generated
	 */
	private IParser getFormFormDataType_5014Parser() {
		if (formFormDataType_5014Parser == null) {
			formFormDataType_5014Parser = createFormFormDataType_5014Parser();
		}
		return formFormDataType_5014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormFormDataType_5014Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getForm_FormDataType(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formFormName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getFormFormName_5015Parser() {
		if (formFormName_5015Parser == null) {
			formFormName_5015Parser = createFormFormName_5015Parser();
		}
		return formFormName_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormFormName_5015Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getForm_FormName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formSuggestedApplication_5016Parser;

	/**
	 * @generated
	 */
	private IParser getFormSuggestedApplication_5016Parser() {
		if (formSuggestedApplication_5016Parser == null) {
			formSuggestedApplication_5016Parser = createFormSuggestedApplication_5016Parser();
		}
		return formSuggestedApplication_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormSuggestedApplication_5016Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getForm_SuggestedApplication(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser formVoiceCommand_5028Parser;

	/**
	 * @generated
	 */
	private IParser getFormVoiceCommand_5028Parser() {
		if (formVoiceCommand_5028Parser == null) {
			formVoiceCommand_5028Parser = createFormVoiceCommand_5028Parser();
		}
		return formVoiceCommand_5028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFormVoiceCommand_5028Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getForm_VoiceCommand(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callActivityId_5029Parser;

	/**
	 * @generated
	 */
	private IParser getCallActivityId_5029Parser() {
		if (callActivityId_5029Parser == null) {
			callActivityId_5029Parser = createCallActivityId_5029Parser();
		}
		return callActivityId_5029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallActivityId_5029Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getActivity_ActivityId(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callOutcome_5030Parser;

	/**
	 * @generated
	 */
	private IParser getCallOutcome_5030Parser() {
		if (callOutcome_5030Parser == null) {
			callOutcome_5030Parser = createCallOutcome_5030Parser();
		}
		return callOutcome_5030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallOutcome_5030Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getCall_Outcome(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser boundaryActivityId_5031Parser;

	/**
	 * @generated
	 */
	private IParser getBoundaryActivityId_5031Parser() {
		if (boundaryActivityId_5031Parser == null) {
			boundaryActivityId_5031Parser = createBoundaryActivityId_5031Parser();
		}
		return boundaryActivityId_5031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBoundaryActivityId_5031Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getActivity_ActivityId(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser boundaryName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getBoundaryName_5032Parser() {
		if (boundaryName_5032Parser == null) {
			boundaryName_5032Parser = createBoundaryName_5032Parser();
		}
		return boundaryName_5032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBoundaryName_5032Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getBoundary_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser boundaryOutcome_5033Parser;

	/**
	 * @generated
	 */
	private IParser getBoundaryOutcome_5033Parser() {
		if (boundaryOutcome_5033Parser == null) {
			boundaryOutcome_5033Parser = createBoundaryOutcome_5033Parser();
		}
		return boundaryOutcome_5033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBoundaryOutcome_5033Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getBoundary_Outcome(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser boundaryType_5034Parser;

	/**
	 * @generated
	 */
	private IParser getBoundaryType_5034Parser() {
		if (boundaryType_5034Parser == null) {
			boundaryType_5034Parser = createBoundaryType_5034Parser();
		}
		return boundaryType_5034Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBoundaryType_5034Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getBoundary_Type(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionSourceActivityID_5035Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionSourceActivityID_5035Parser() {
		if (decisionSourceActivityID_5035Parser == null) {
			decisionSourceActivityID_5035Parser = createDecisionSourceActivityID_5035Parser();
		}
		return decisionSourceActivityID_5035Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDecisionSourceActivityID_5035Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDecision_SourceActivityID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionActivityId_5036Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionActivityId_5036Parser() {
		if (decisionActivityId_5036Parser == null) {
			decisionActivityId_5036Parser = createDecisionActivityId_5036Parser();
		}
		return decisionActivityId_5036Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDecisionActivityId_5036Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getActivity_ActivityId(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionAlternatePathID_5037Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionAlternatePathID_5037Parser() {
		if (decisionAlternatePathID_5037Parser == null) {
			decisionAlternatePathID_5037Parser = createDecisionAlternatePathID_5037Parser();
		}
		return decisionAlternatePathID_5037Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDecisionAlternatePathID_5037Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDecision_AlternatePathID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionSuccessPathID_5038Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionSuccessPathID_5038Parser() {
		if (decisionSuccessPathID_5038Parser == null) {
			decisionSuccessPathID_5038Parser = createDecisionSuccessPathID_5038Parser();
		}
		return decisionSuccessPathID_5038Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDecisionSuccessPathID_5038Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDecision_SuccessPathID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionOutcome_5039Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionOutcome_5039Parser() {
		if (decisionOutcome_5039Parser == null) {
			decisionOutcome_5039Parser = createDecisionOutcome_5039Parser();
		}
		return decisionOutcome_5039Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDecisionOutcome_5039Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDecision_Outcome(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ConnectionBandwidthEditPart.VISUAL_ID:
			return getConnectionBandwidth_5001Parser();
		case ConnectionConnectionIDEditPart.VISUAL_ID:
			return getConnectionConnectionID_5002Parser();
		case PersonPersonNameEditPart.VISUAL_ID:
			return getPersonPersonName_5003Parser();
		case PersonPersonIDEditPart.VISUAL_ID:
			return getPersonPersonID_5004Parser();
		case PersonPersonRoleEditPart.VISUAL_ID:
			return getPersonPersonRole_5005Parser();
		case MediumMediumDataTypeEditPart.VISUAL_ID:
			return getMediumMediumDataType_5006Parser();
		case MediumMediumNameEditPart.VISUAL_ID:
			return getMediumMediumName_5007Parser();
		case MediumSuggestedApplicationEditPart.VISUAL_ID:
			return getMediumSuggestedApplication_5008Parser();
		case MediumVoiceCommandEditPart.VISUAL_ID:
			return getMediumVoiceCommand_5009Parser();
		case DeviceDeviceCapabilityEditPart.VISUAL_ID:
			return getDeviceDeviceCapability_5010Parser();
		case DeviceIsLocalEditPart.VISUAL_ID:
			return getDeviceIsLocal_5011Parser();
		case DeviceIsVirtualEditPart.VISUAL_ID:
			return getDeviceIsVirtual_5012Parser();
		case FormActionEditPart.VISUAL_ID:
			return getFormAction_5013Parser();
		case FormFormDataTypeEditPart.VISUAL_ID:
			return getFormFormDataType_5014Parser();
		case FormFormNameEditPart.VISUAL_ID:
			return getFormFormName_5015Parser();
		case FormSuggestedApplicationEditPart.VISUAL_ID:
			return getFormSuggestedApplication_5016Parser();
		case FormVoiceCommandEditPart.VISUAL_ID:
			return getFormVoiceCommand_5028Parser();
		case CallActivityIdEditPart.VISUAL_ID:
			return getCallActivityId_5029Parser();
		case CallOutcomeEditPart.VISUAL_ID:
			return getCallOutcome_5030Parser();
		case BoundaryActivityIdEditPart.VISUAL_ID:
			return getBoundaryActivityId_5031Parser();
		case BoundaryNameEditPart.VISUAL_ID:
			return getBoundaryName_5032Parser();
		case BoundaryOutcomeEditPart.VISUAL_ID:
			return getBoundaryOutcome_5033Parser();
		case BoundaryTypeEditPart.VISUAL_ID:
			return getBoundaryType_5034Parser();
		case DecisionSourceActivityIDEditPart.VISUAL_ID:
			return getDecisionSourceActivityID_5035Parser();
		case DecisionActivityIdEditPart.VISUAL_ID:
			return getDecisionActivityId_5036Parser();
		case DecisionAlternatePathIDEditPart.VISUAL_ID:
			return getDecisionAlternatePathID_5037Parser();
		case DecisionSuccessPathIDEditPart.VISUAL_ID:
			return getDecisionSuccessPathID_5038Parser();
		case DecisionOutcomeEditPart.VISUAL_ID:
			return getDecisionOutcome_5039Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WgcmlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WgcmlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WgcmlElementTypes.getElement(hint) == null) {
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
