/*
  (c) 2013 Copyright - Citlali Labs - All Rights Reserved
  $Id$;
*/
package com.objectwave.dao.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Junction;
import org.hibernate.criterion.Restrictions;

/**
 * DaoQuery contains the information related to how an object will be queried and/or filtered from a database.
 * Information includes the number of rows and page number of the full set recovered, useful for pagination
 * 
 * @see org.hibernate.Criteria
 * @see org.hibernate.criterion.Restrictions
 * @see org.hibernate.criterion.Junction
 * @see org.hibernate.criterion.Conjunction
 * 
 */
public class DaoQuery
{
	/**
	 * Field map.
	 */
	Hashtable<String,Object> map;
	
	HashSet<String> aliases;
	
	HashMap<String,FetchMode> fetching;
	
	/**
	 * Field numberOfRows.
	 */
	private Integer numberOfRows;

	/**
	 * Field pageNumber.
	 */
	private Integer pageNumber;

	/**
	 * Field requestTotalRows.
	 */
	private Boolean requestTotalRows = false;

	/**
	 * Method withFilter.
	 * 
	 * Shortcut to create a DaoQuery with a filtered field and a value
	 * 
	 * @param field String
	 * @param value Object
	 * @return DaoQuery
	 */
	public static DaoQuery withFilter(String field, Object value)
	{
		DaoQuery daoOrder = new DaoQuery();
		daoOrder.filter(field, value);
		return daoOrder;
	}

	/**
	 * Constructor for DaoQuery.
	 */
	public DaoQuery()
	{
		map = new Hashtable<String,Object>();
		aliases = new HashSet<String>();
		fetching = new HashMap<String,FetchMode>();
	}

	/**
	 * Method filter.
	 * 
	 * Adds or overwrites a field filter with the value
	 * 
	 * @param field String
	 * @param value Object
	 */
	public void filter(String field, Object value)
	{
		if (value != null)
			map.put(field, value);
	}

	public void fetchEAGER(String field)
	{
		fetch(field, FetchMode.JOIN);
	}

	public void fetchLAZY(String field)
	{
		fetch(field, FetchMode.SELECT);
	}

	public void fetch(String field, FetchMode value)
	{
		fetching.put(field, value);
	}

	/**
	 * Method applyCursorPropertiesToCriteria.
	 * 
	 * Applies the DaoQuery information to the Hibernate Criteria object
	 * 
	 * @param criteria Criteria
	 */
	public void applyCursorPropertiesToCriteria(Criteria criteria)
	{
		if (getNumberOfRows() != null)
		{
			if (getPageNumber() != null)
			{
				Integer rowIndex = (getPageNumber() - 1) * getNumberOfRows();
					criteria.setFirstResult(rowIndex);
			}

			criteria.setMaxResults(getNumberOfRows());
		}
	}

	public void applyFetchingToCriteria(Criteria criteria)
	{
		for (String key : fetching.keySet())
		{
			FetchMode fetchMode = fetching.get(key);
			
			criteria.setFetchMode(key, fetchMode);
		}
	}

	/**
	 * Method applyConjunctionDateRange.
	 * 
	 * Used in conjunction with applyDateRange
	 * 
	 * @param fieldName String
	 * @param criteria Criteria
	 */
	public void applyConjunctionDateRange(String fieldName, Criteria criteria)
	{
		Conjunction con = Restrictions.conjunction();
		applyDateRange(fieldName, con);
		criteria.add(con);
	}

	/**
	 * Method applyDateRange.
	 * 
	 * Applies a Conjunction Date range values. Useful for initial date <= field <= final date query pattern
	 *  
	 * @param fieldName String
	 * @param junction Junction
	 */
	public void applyDateRange(String fieldName, Junction junction)
	{
		Object val = get(fieldName + "_" + "initial");
		if (val != null)
			junction.add(Restrictions.ge(fieldName, (Date) val));

		val = get(fieldName + "_" + "final");
		if (val != null)
			junction.add(Restrictions.le(fieldName, (Date) val));
	}

	public String getFieldAliasFromPath(String path, Criteria rootCriteria)
	{
		if (path.contains("."))
		{
			String[] splitOrder = path.split("\\.");

			String currentPath = "";
			String aliasPath = "";

			int len = splitOrder.length - 1;

			for (int i = 0; i < len; i++)
			{
				if (aliasPath.length() > 0)
				{
					currentPath = aliasPath + "_alias." + splitOrder[i];
					aliasPath += "_" + splitOrder[i];
				}
				else
				{
					currentPath = splitOrder[i];
					aliasPath += splitOrder[i];
				}

				if (!aliases.contains(aliasPath))
				{
					rootCriteria.createAlias(currentPath, aliasPath + "_alias");
					aliases.add(aliasPath);
				}
			}

			return aliasPath + "_alias." + splitOrder[len];
		}
		else
			return path;
	}

	/**
	 * Method get.
	 * 
	 * Returns a filter value from a particular field name
	 * 
	 * @param name String
	 * @return Object
	 */
	public Object get(String fieldName)
	{
		return map.get(fieldName);
	}

	/**
	 * Method hasFilter.
	 * 
	 * If there is an existing filter for the fieldName
	 * 
	 * @param name String
	 * @return boolean
	 */
	public boolean hasFilter(String fieldName)
	{
		return map.containsKey(fieldName);
	}

	/**
	 * Method getNumberOfRows.
	 * @return Integer
	 */
	public Integer getNumberOfRows()
	{
		return numberOfRows;
	}

	/**
	 * Method setNumberOfRows.
	 * @param numberOfRows Integer
	 */
	public void setNumberOfRows(Integer numberOfRows)
	{
		this.numberOfRows = numberOfRows;
	}

	/**
	 * Method getPageNumber.
	 * @return Integer
	 */
	public Integer getPageNumber()
	{
		return pageNumber;
	}

	/**
	 * Method setPageNumber.
	 * @param pageNumber Integer
	 */
	public void setPageNumber(Integer pageNumber)
	{
		this.pageNumber = pageNumber;
	}

	/**
	 * Method getRequestTotalRows.
	 * @return Boolean
	 */
	public Boolean getRequestTotalRows()
	{
		return requestTotalRows;
	}

	/**
	 * Method setRequestTotalRows.
	 * @param requestTotalRows Boolean
	 */
	public void setRequestTotalRows(Boolean requestTotalRows)
	{
		this.requestTotalRows = requestTotalRows;
	}
	
	/**
	 * Method getFilters.
	 * @return Set<String>
	 */
	public Set<String> getFilters()
	{
	    return this.map.keySet();
	}
}
