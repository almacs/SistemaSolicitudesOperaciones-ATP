package com.atp.solicitudes.forms;

public class UserAdminForm
{
	static public final String MODEL_NAME = "userAdminForm";

	private String userName;
	private String status;
	private String role;

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getRole()
	{
		return role;
	}

	public void setRole(String role)
	{
		this.role = role;
	}


}
