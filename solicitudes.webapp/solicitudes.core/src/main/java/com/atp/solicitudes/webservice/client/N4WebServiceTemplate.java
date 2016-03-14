package com.atp.solicitudes.webservice.client;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.WebServiceMessageFactory;

import com.navis.argo.GateWebserviceResponseType;
import com.navis.argo.webservice.types.v1.GenericInvokeResponseWsType;
import com.navis.argo.webservice.types.v1.MessageType;
import com.navis.argo.webservice.types.v1.QueryResultType;
import com.navis.argo.webservice.types.v1.ResponseType;
import com.navis.argo.webservice.types.v1.ScopeCoordinateIdsWsType;
import com.navis.services.argoservice.GenericInvoke;
import com.navis.services.argoservice.GenericInvokeResponse;
import com.objectwave.webservice.client.ObjectWaveWebServiceTemplate;

public class N4WebServiceTemplate extends ObjectWaveWebServiceTemplate
{
	protected static Logger logger = LoggerFactory.getLogger(N4WebServiceTemplate.class);

	static final String MESSAGE_OK = "0";
	static final String MESSAGE_INFO = "1";
	static final String MESSAGE_WARNING = "2";
	static final String MESSAGE_SEVERE = "3";

	private String operatorId;
	private String facilityId;
	private String complexId;
	private String yardId;
	private String externalUserId;

	public N4WebServiceTemplate(WebServiceMessageFactory messageFactory)
	{
		super(messageFactory);
	}

	public GenericInvokeResponse execute(Object obj) throws Exception
	{
		GenericInvoke invoke = new GenericInvoke();
		invoke.setScopeCoordinateIdsWsType(getDefaultScopeCoordinateIdsWsType());

		String xmlSource = marshallObject(obj);
		logger.debug("Contained XML {}", xmlSource);
		invoke.setXmlDoc(xmlSource);

		return (GenericInvokeResponse) marshalSendAndReceive(invoke);
	}

	public Boolean isOK(ResponseType response)
	{
		return MESSAGE_OK.equalsIgnoreCase(response.getStatus());
	}

	public Boolean isInfo(ResponseType response)
	{
		return MESSAGE_INFO.equalsIgnoreCase(response.getStatus());
	}

	public Boolean isWarning(ResponseType response)
	{
		return MESSAGE_WARNING.equalsIgnoreCase(response.getStatus());
	}

	public Boolean isError(ResponseType response)
	{
		return MESSAGE_SEVERE.equalsIgnoreCase(response.getStatus());
	}

	public ResponseType getResponseTypeFrom(GenericInvokeResponse response) throws Exception
	{
		GenericInvokeResponseWsType genericInvokeResponse = response.getGenericInvokeResponse();

		return genericInvokeResponse.getCommonResponse();
	}
	
	private String getSeverityLevelFrom(String level)
	{
		String severityLevel = "OK";
		
		switch (level.charAt(0))
		{
			case '1':
				severityLevel = "OK";
			case '2':
				severityLevel = "WARNING";
			case '3':
				severityLevel = "SEVERE";
		}

		return severityLevel;
	}

	public MessageType getFirstMessageFrom(GenericInvokeResponse response) throws Exception
	{
		ResponseType respType = getResponseTypeFrom(response);

		String respTypeStatus = getSeverityLevelFrom(respType.getStatus());

		List<MessageType> col = getMessagesFrom(response);

		MessageType message = null;

		for (MessageType eachMesg : col)
		{
			if (respTypeStatus.equalsIgnoreCase(eachMesg.getSeverityLevel()))
			{
				message = eachMesg;
				break;
			}
		}
		
		return message;
	}

	public List<MessageType> getMessagesFrom(GenericInvokeResponse response) throws Exception
	{
		GenericInvokeResponseWsType genericInvokeResponse = response.getGenericInvokeResponse();

		ResponseType respType = genericInvokeResponse.getCommonResponse();

		return respType.getMessageCollector().getMessages();
	}

	public GateWebserviceResponseType getGateWebServiceResposeTypeFrom(GenericInvokeResponse response) throws Exception
	{
		GenericInvokeResponseWsType genericInvokeResponse = response.getGenericInvokeResponse();

		ResponseType respType = genericInvokeResponse.getCommonResponse();

		logger.debug("Response Status - {}", respType.getStatus());
		logger.debug("Response Description - {}", respType.getStatusDescription());

		for (MessageType eachMsg : respType.getMessageCollector().getMessages())
		{
			logger.debug("MessageType SEV LEV: {} - {}", eachMsg.getSeverityLevel(), eachMsg.getMessage());
		}

		Object result = null;

		for (QueryResultType eachQuery : respType.getQueryResults())
		{
			String queryResult = eachQuery.getResult();
			logger.debug("QueryResultType String Result - {}", queryResult);
			
			result = unmarshallObject(queryResult);
		}

		return (GateWebserviceResponseType) result;
	}

	// helper method to prepare a proper ScopeCoordinateIdsWsType
	public ScopeCoordinateIdsWsType getDefaultScopeCoordinateIdsWsType()
	{
		ScopeCoordinateIdsWsType scope = new ScopeCoordinateIdsWsType();
		scope.setOperatorId(getOperatorId());
		scope.setFacilityId(getFacilityId());
		scope.setComplexId(getComplexId());
		scope.setYardId(getYardId());
		scope.setExternalUserId(getExternalUserId());

		return scope;
	}
	
	private DatatypeFactory getDatatypeFactory() throws Exception
	{
		return DatatypeFactory.newInstance();
	}

	// helper for retrieving XML Calendars
	public XMLGregorianCalendar getXMLCalendarDateForDate(Date date) throws Exception
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		return getXMLCalendarDateForDate(
			cal.get(Calendar.YEAR),
			cal.get(Calendar.MONTH) + 1,
			cal.get(Calendar.DAY_OF_MONTH));
	}
	
	// helper for retrieving XML Calendars
	public XMLGregorianCalendar getXMLCalendarDateForTime(Date date) throws Exception
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		return getXMLCalendarDateForTime(
			cal.get(Calendar.HOUR_OF_DAY),
			cal.get(Calendar.MINUTE),
			cal.get(Calendar.SECOND));
	}

	// helper for retrieving XML Calendars
	public XMLGregorianCalendar getXMLCalendarDateForDate(Integer year, Integer month, Integer day) throws Exception
	{
		XMLGregorianCalendar xmlCal = getDatatypeFactory().newXMLGregorianCalendarDate
			(year, month, day, DatatypeConstants.FIELD_UNDEFINED);
		
		return xmlCal;
	}

	// helper for retrieving XML Calendars
	public XMLGregorianCalendar getXMLCalendarDateForTime(Integer hour, Integer minute, Integer second) throws Exception
	{
		XMLGregorianCalendar xmlCal = getDatatypeFactory().newXMLGregorianCalendarTime
			(hour, minute, second, DatatypeConstants.FIELD_UNDEFINED);

		return xmlCal;
	}

	/*
	 * Getters and setters
	 */
	public String getComplexId()
	{
		return complexId;
	}

	public void setComplexId(String complexId)
	{
		this.complexId = complexId;
	}

	public String getOperatorId()
	{
		return operatorId;
	}

	public void setOperatorId(String operatorId)
	{
		this.operatorId = operatorId;
	}

	public String getFacilityId()
	{
		return facilityId;
	}

	public void setFacilityId(String facilityId)
	{
		this.facilityId = facilityId;
	}

	public String getYardId()
	{
		return yardId;
	}

	public void setYardId(String yardId)
	{
		this.yardId = yardId;
	}

	public String getExternalUserId()
	{
		return externalUserId;
	}

	public void setExternalUserId(String externalUserId)
	{
		this.externalUserId = externalUserId;
	}
}
