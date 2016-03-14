package com.objectwave.report;

import java.util.Date;

public interface Report
{
	String getName();	
	Date getTimestamp();
	String getTitle();
	
	String getUsername();
	void setUsername(String username);

	// Attributes
	Object getAttribute(String attributeName);
	void setAttribute(String attributeName, Object object);
	
	// Parameters
	void setParameter(String parameterName, Object value);
	
	// execute report logic to generate information to be exploided
	void execute();
}
