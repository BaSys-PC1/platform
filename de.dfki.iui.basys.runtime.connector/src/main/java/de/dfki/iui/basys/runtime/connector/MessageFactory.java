package de.dfki.iui.basys.runtime.connector;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

public class MessageFactory {
	
	private Session session;
	
	public MessageFactory(Session session) {
		this.session = session;
	}


	public TextMessage createMSG(String atsMsgType, String resourceId, String payload) {
		TextMessage msg = null;

		try {
			msg = session.createTextMessage();
			msg.setStringProperty("ATSMsgType", atsMsgType);
			msg.setStringProperty("ResourceId", resourceId);
			msg.setText(payload);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return msg;
	}

	public TextMessage createMSG(String atsMsgType, String resourceId) {
		String text = "<Message><Parameter name=\"reserve\" value=\"0\" /></Message>";
		TextMessage msg = createMSG(atsMsgType, resourceId, text);
		return msg;
	}

	public TextMessage createMSG10(String resourceId, int functionId, int capType) {
		String text = 
				"<Message>"
				+ "<Parameter name=\"functionID\" value=\"" + functionId + "\" />"
				+ "<Parameter name=\"capType\" value=\"" + capType + "\" />"
				//+ "<Parameter name=\"matNr\" value=\"?\" /> "
				//+ "<Parameter name=\"serialNr\" value=\"?\" /> "
				//+ "<Parameter name=\"orderNr\" value=\"?\" />"
				+ "</Message>";
		TextMessage msg = createMSG("MSG10", resourceId, text);
		return msg;
	}

	public TextMessage createMSG11(String resourceId) {
		TextMessage msg = createMSG("MSG11", resourceId);
		return msg;
	}

	public TextMessage createMSG12(String resourceId, int jobStatus, int jobErrorCode) {
		String text = 
				"<Message>"
				+ "<Parameter name=\"jobStatus\" value=\"" + jobStatus + "\" />"
				+ "<Parameter name=\"jobErrorCode\" value=\"" + jobErrorCode + "\" />"
				+ "</Message>";
		TextMessage msg = createMSG("MSG12", resourceId, text);
		return msg;
	}

	public TextMessage createMSG13(String resourceId, int jobStatus, int jobErrorCode) {
		String text = 
				"<Message>"
				+ "<Parameter name=\"jobStatus\" value=\"" + jobStatus + "\" />"
				+ "<Parameter name=\"jobErrorCode\" value=\"" + jobErrorCode + "\" />"
				+ "</Message>";
		TextMessage msg = createMSG("MSG13", resourceId, text);
		return msg;
	}

	public TextMessage createMSG16(String resourceId) {
		TextMessage msg = createMSG("MSG16", resourceId);
		return msg;
	}

	public TextMessage createMSG17(String resourceId) {
		TextMessage msg = createMSG("MSG17", resourceId);
		return msg;
	}

	public TextMessage createMSG18(String resourceId) {
		TextMessage msg = createMSG("MSG18", resourceId);
		return msg;
	}

	public TextMessage createMSG19(String resourceId) {
		TextMessage msg = createMSG("MSG19", resourceId);
		return msg;
	}
	
}
