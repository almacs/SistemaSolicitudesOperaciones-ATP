package com.objectwave.utils;

import java.util.Date;
import java.util.Calendar;

public class DateUtils 
{
	public static int getDaysBetweenDates(Date oldDate, Date newDate)
	{
		final Calendar calendar1 = Calendar.getInstance();
		final Calendar calendar2 = Calendar.getInstance();
		
		calendar1.setTime(oldDate);
		calendar2.setTime(newDate);
		
		long elapsedTime = calendar2.getTimeInMillis() - calendar1.getTimeInMillis();

		// milliseconds * seconds in one hours * hours in a day
		return (int) (elapsedTime / (1000 * 3600 * 24));
	}
	
	public static int getMinutesBetweenDates(Date currentDate, Date dateScheduled)
	{
		final Calendar calendar1 = Calendar.getInstance();
		final Calendar calendar2 = Calendar.getInstance();
		
		calendar1.setTime(currentDate);
		calendar2.setTime(dateScheduled);
		
		long elapsedTime = calendar2.getTimeInMillis() - calendar1.getTimeInMillis();

		return (int) (elapsedTime / (60000));
	}
	
	
}
