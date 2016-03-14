package com.objectwave.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.objectwave.logger.ActivityLogAppender;

@Entity
@Table(name = "activity_log")
public class ActivityLogEntry implements Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String DEFAULT_MODULE = "WEB";
	public static final String MOBILE_MODULE = "MOBILE";

	public static final String USER_LOGGED_IN = "UserLoggedIn";
	public static final String INVALID_LOGIN_TRY = "InvalidLoginTry";
	public static final String NEW_USER_CREATED = "NewUserCreated";
	public static final String USER_UPDATED = "UserUpdated";
	public static final String USER_DELETED = "UserDeleted";
	public static final String USER_CANCELLED = "UserCancelled";	
	
	public static final int DATA_LENGTH = 255;	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	Long id;

	@Column(name = "timestamp", nullable = false)
	Date timestamp;

	@Column(name = "username", nullable = true)
	String username;

	@Column(name = "module", nullable = true)
	String module;

	@Column(name = "action", nullable = true)
	String action;

	@Column(name = "data", nullable = true, length = DATA_LENGTH)
	String data;
	
	@Column(name = "accessed_from", nullable = true)
	String accessed_from;


	public static ActivityLogEntry createForActionAndAppender(String action, ActivityLogAppender appender)
	{
		ActivityLogEntry entry = new ActivityLogEntry();
		
		StringBuilder builder = new StringBuilder();
		appender.appendToActivityLog(builder);
		
		entry.setAction(action);
		entry.setData(builder.toString());

		return entry;
	}

	public static ActivityLogEntry createForActionAndData(String action, String data)
	{
		ActivityLogEntry entry = new ActivityLogEntry();
		
		entry.setAction(action);
		entry.setData(data);

		return entry;
	}

	public ActivityLogEntry()
	{
		timestamp = new Date();
	}
	
	public ActivityLogEntry(String a, String m, String d, Integer uId, String uname, String ip)
	{
		action = a;
		module = m;
		data = d;
		username = uname;
		accessed_from = ip;
		
		timestamp = new Date();
	}
	
	public boolean equals(Object anObject)
	{
		if (anObject == null)
			return false;

		if (this == anObject)
			return true;

		ActivityLogEntry realObject = (ActivityLogEntry) anObject;

		return this.getId().equals(realObject.getId());
	}

	public int hashCode()
	{
		return getId() == null ? 0 : getId().intValue();
	}

	public Date getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(Date date)
	{
		this.timestamp = date;
	}

	public String getModule()
	{
		return module;
	}

	public void setModule(String module)
	{
		this.module = module;
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	public String getData()
	{
		return data;
	}

	public void setData(String data)
	{
		this.data = data;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getAccessed_from() 
	{
		return accessed_from;
	}

	public void setAccessed_from(String accessed_from)
	{
		this.accessed_from = accessed_from;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}
}
