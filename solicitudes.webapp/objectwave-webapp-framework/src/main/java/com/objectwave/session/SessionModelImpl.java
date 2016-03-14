package com.objectwave.session;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/*
 * Object to contain the model session information, such as logged user and maybe
 * some other information that would come handy to constantly keep on the session
 */
public class SessionModelImpl implements Serializable, SessionModel
{
	private static final long serialVersionUID = 1L;

	private SessionModelUser loggedUser;
	private Map<String,Object> properties;
	private String ipAddress;

	public SessionModelImpl()
	{
		properties = new HashMap<String,Object>();
	}

	/* (non-Javadoc)
	 * @see com.objectwave.session.SessionModelInterface#isLoggedIn()
	 */
	public boolean isLoggedIn()
	{
		return loggedUser != null;
	}
	
	public Object get(String key)
	{
		return properties.get(key);
	}
	
	public void set(String key, Object value)
	{
		properties.put(key, value);
	}
	
	public void remove(String key)
	{
		properties.remove(key);
	}

	public SessionModelUser getLoggedUser()
	{
		return loggedUser;
	}

	public void setLoggedUser(SessionModelUser loggedUser)
	{
		this.loggedUser = loggedUser;
	}

	public String getIpAddress()
	{
		return ipAddress;
	}

	public void setIpAddress(String ipAddress)
	{
		this.ipAddress = ipAddress;
	}
}
