/*
  (c) 2013 Copyright - Citlali Labs - All Rights Reserved
  $Id$;
*/
package com.objectwave.webservice.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Object used as a ServerResponse to any AJAX request
 */
@XmlRootElement(name="ServerResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"code", "error", "message", "body"})
public class ServerResponse implements Serializable
{
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The code. */
	@XmlAttribute
	protected Integer code = 0;

	/** The error. */
	@XmlAttribute
	protected Boolean error = false;
	
	/** The message. */
	@XmlAttribute
	protected String message = "";
	
	/** The body. */
	@XmlElement
	protected Object body = null;
	
	/**
	 * Instantiates a new server response.
	 */
	public ServerResponse()
	{
	}

	/**
	 * Instantiates a new server response.
	 *
	 * @param obj the obj
	 */
	public ServerResponse(Object obj)
	{
		body = obj;
	}

	/*
	 * Sets a response message to represent a response error
	 * so sets the error property to true
	 */
	public void setErrorMessage(String msg)
	{
		setError(true);
		setMessage(msg);
	}

	/**
	 * Gets the error.
	 *
	 * @return the error
	 */
	public Boolean getError()
	{
		return error;
	}
	
	/**
	 * Sets the error.
	 *
	 * @param error the new error
	 */
	public void setError(Boolean error)
	{
		this.error = error;
	}
	
	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public Integer getCode()
	{
		return code;
	}
	
	/**
	 * Sets the code.
	 *
	 * @param code the new code
	 */
	public void setCode(Integer code)
	{
		this.code = code;
	}
	
	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage()
	{
		return message;
	}
	
	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	/**
	 * Gets the body.
	 *
	 * @return the body
	 */
	public Object getBody()
	{
		return body;
	}
	
	/**
	 * Sets the body.
	 *
	 * @param body the new body
	 */
	public void setBody(Object body)
	{
		this.body = body;
	}
}
