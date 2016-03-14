package com.objectwave.logger;

import com.objectwave.model.ActivityLogEntry;

public interface ActivityLogEntryRegister
{
	void registerActivityLogEntry(ActivityLogEntry entry) throws Exception;
}
