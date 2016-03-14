/*
  (c) 2013 Copyright - Citlali Labs - All Rights Reserved
  $Id$;
*/
package com.objectwave.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * A base class that implements the ApplicationContextAware, which allows a class to retrieve any Spring Framework
 * bean defined.
 * Useful for Control classes an other beans that may required to access the Spring Bean Context 
 */
public class AppContextProvider implements ApplicationContextAware
{
	
	/** The application context. */
	@Autowired
	private ApplicationContext applicationContext;

	/**
	 * Gets the bean.
	 *
	 * @param beanName the bean name
	 * @return the bean
	 */
	public Object getBean(String beanName)
	{
		return getApplicationContext().getBean(beanName);
	}

	/*
	 * getters and setters
	 */
	/**
	 * Gets the application context.
	 *
	 * @return the application context
	 */
	public ApplicationContext getApplicationContext()
	{
		return applicationContext;
	}

	/*
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	public void setApplicationContext(ApplicationContext applicationContext)
	{
		this.applicationContext = applicationContext;
	}
}
