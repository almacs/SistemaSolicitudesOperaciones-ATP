package com.objectwave.report;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.objectwave.utils.AppContextProvider;


public class BaseReport extends AppContextProvider implements Report
{
	protected Logger logger = LoggerFactory.getLogger(getClass());

	String name;	
	Date timestamp;
	String username;
	String title;
	
	Map<String,Object> attributes;
	Map<String,Object> parameters;
	
	// Constructor
	public BaseReport()
	{
		super();
		this.timestamp = new Date();
		this.parameters = new HashMap<String,Object>();
		this.attributes = new HashMap<String,Object>();
	}

	public void execute()
	{
		// implemented y subclass
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(Date timestamp)
	{
		this.timestamp = timestamp;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	// Attributes
	public Object getAttribute(String attributeName)
	{
		return attributes.get(attributeName);
	}

	public void setAttribute(String attributeName, Object value)
	{
		attributes.put(attributeName, value);
	}

	public Map<String,Object> getAttributes()
	{
		return attributes;
	}

	// Parameters
	public Object getParameter(String parameterName)
	{
		return parameters.get(parameterName);
	}

	public void setParameter(String parameterName, Object value)
	{
		parameters.put(parameterName, value);
	}
}
