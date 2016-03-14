package com.objectwave.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

import com.objectwave.model.ActivityLogEntry;
import com.objectwave.session.SessionModel;
import com.objectwave.utils.AppContextProvider;

/*
 * This class is used for listening all ActivityEvents that contains an ActivityLogEntry source
 */
public class ActivityLogger extends AppContextProvider implements ApplicationListener<ActivityEvent>
{
	/**
	 * Field logger.
	 */
	protected static Logger logger = LoggerFactory.getLogger(ActivityLogger.class);

	private SessionModel sessionModel;
	private String module;
	
	/**
	 * Bean to register the ActivityLogEntry
	 */
	private ActivityLogEntryRegister activityLogEntryRegister; 

	public void onApplicationEvent(ActivityEvent anEvent)
	{
		if (!(anEvent.getSource() instanceof ActivityLogEntry))
			return;

		// set a try and catch, to avoid any exception raise that could rollback
		// changes to any model object
		try
		{
			ActivityLogEntry entry = (ActivityLogEntry) anEvent.getSource();

			try
			{
				// get the session information
				SessionModel info = getSessionModel();

				// inject the session information on the entry
				entry.setUsername(info.getLoggedUser().getUsername());
				entry.setAccessed_from(info.getIpAddress());
			}
			catch (Exception ex)
			{
				// if no session model, fill empty
				entry.setUsername("NOT_IN_SESSION");
				entry.setAccessed_from("");
			}

			entry.setModule(getModule());

			// insert the activity log entry
			getActivityLogEntryRegister().registerActivityLogEntry(entry);
		}
		catch (Exception ex)
		{
			logger.error("error while registering ActivityLogEntry", ex);
		}
	}

	public String getModule()
	{
		return module;
	}

	public void setModule(String module)
	{
		this.module = module;
	}

	public SessionModel getSessionModel()
	{
		return sessionModel;
	}

	public void setSessionModel(SessionModel sessionModel)
	{
		this.sessionModel = sessionModel;
	}

	public ActivityLogEntryRegister getActivityLogEntryRegister()
	{
		return activityLogEntryRegister;
	}

	public void setActivityLogEntryRegister(ActivityLogEntryRegister activityLogEntryRegister)
	{
		this.activityLogEntryRegister = activityLogEntryRegister;
	}
}
