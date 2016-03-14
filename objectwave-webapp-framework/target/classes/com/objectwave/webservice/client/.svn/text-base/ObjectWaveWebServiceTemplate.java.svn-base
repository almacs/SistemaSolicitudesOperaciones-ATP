package com.objectwave.webservice.client;

import java.io.ByteArrayOutputStream;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.xml.transform.StringSource;

/**
 * Description
 *
 * @author objectwave
 * @version 1.0
 *
 * This class is a wrapper to WebServiceTemplate which includes a quick fix to add the SoapAction header to the SoapRequest.
 * This is necesary for certain SOAP server implementations, like onces used on IIS based on .NET.
 * The idea is to provide a clean and transparent way to send and receive POJOs via the Web Services
 * 
 * @see
 * @since
 */
public class ObjectWaveWebServiceTemplate extends WebServiceTemplate
{
	public ObjectWaveWebServiceTemplate(WebServiceMessageFactory messageFactory)
	{
		super(messageFactory);
	}
	
	public String marshallObject(Object obj) throws Exception
	{
		Marshaller m = getMarshaller();
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();

		m.marshal(obj, new StreamResult(stream));
		
		String result = stream.toString();
		
		return result;
	}

	public Object unmarshallObject(String string) throws Exception
	{
		Unmarshaller m = getUnmarshaller();
		
		Object obj = m.unmarshal(new StringSource(string));
		
		return obj;
	}

	public Object unmarshallObject(Source source) throws Exception
	{
		Unmarshaller m = getUnmarshaller();
		
		Object obj = m.unmarshal(source);
		
		return obj;
	}
	
	// generic call for send an object which includes the SetSoapActionCallback
	public Object marshalSendAndReceive(Object request)
	{
		return marshalSendAndReceive(request, new SetSoapActionCallback(request));
	}

	// generic call for send an object which includes the SetSoapActionCallback
	public Object marshalSendAndReceive(String address, Object request)
	{
		return marshalSendAndReceive(address, request, new SetSoapActionCallback(request));
	}
	
	protected class SetSoapActionCallback implements WebServiceMessageCallback
	{
		private Object requestObj;

		public SetSoapActionCallback(Object obj)
		{
			requestObj = obj;
		}

		// get the SoapAction string to be set on the SoapAction header
		// this is taken from a POJO which contains XML oriented Annotations
		// check also that there should be a package-info.java file or other mechanism to set an annotation to the
		// package that contains all XML domain classes to be converted from/to XML
		private String getSoapActionStringFrom(Object obj)
		{
			XmlRootElement root = requestObj.getClass().getAnnotation(XmlRootElement.class);
			String rootName = root.name();

			XmlSchema schema = requestObj.getClass().getPackage().getAnnotation(XmlSchema.class);
			String namespace = schema.namespace();

			String action = namespace + "/" + rootName;
			
			return action;
		}

		// callback method to perform after the SoapMessage has being build and before sending the message
		public void doWithMessage(WebServiceMessage message)
		{
			String action = getSoapActionStringFrom(requestObj);

            ((SoapMessage) message).setSoapAction(action);
        }
	}
}
