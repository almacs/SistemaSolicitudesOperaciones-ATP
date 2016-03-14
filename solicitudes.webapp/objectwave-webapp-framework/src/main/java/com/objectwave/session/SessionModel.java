package com.objectwave.session;

public interface SessionModel
{
	static public final String SLOT_NAME = "_SessionModel";

	boolean isLoggedIn();

	SessionModelUser getLoggedUser();
	void setLoggedUser(SessionModelUser user);

	String getIpAddress();
	void setIpAddress(String ip);
}