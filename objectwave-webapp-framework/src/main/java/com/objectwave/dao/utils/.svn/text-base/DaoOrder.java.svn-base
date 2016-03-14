/*
  (c) 2013 Copyright - Citlali Labs - All Rights Reserved
  $Id$;
*/
package com.objectwave.dao.utils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

/**
 * DaoOrder contains the information that defines the order on how objects will be sorted when retrieved
 * from the database. Used with the Hibernate framework
 * 
 * @see org.hibernate.Criteria
 * 
 */
public class DaoOrder
{
	
	/** The Constant ASC. */
	public static final String ASC = "asc";
	
	/** The Constant DESC. */
	public static final String DESC = "desc";

	/** The map. */
	LinkedHashMap<String,String> map;
	
	/**
	 * Method withSort.
	 * 
	 * Shortcut to create a DaoOrder with an already set field and order
	 *
	 * @param field the field
	 * @param order the order
	 * @return the dao order
	 */
	public static DaoOrder withSort(String field, String order)
	{
		DaoOrder daoOrder = new DaoOrder();
		daoOrder.sort(field, order);
		return daoOrder;
	}

	/**
	 * Default DaoOrder constructor
	 */
	public DaoOrder()
	{
		map = new LinkedHashMap<String,String>();
	}
	
	/**
	 * Method sort.
	 * 
	 * Adds or overwrites a field with a specific order
	 *
	 * @param field the field
	 * @param order the order
	 */
	public void sort(String field, String order)
	{
		map.put(field, order);
	}
	
	/**
	 * Method get.
	 * 
	 * Returns the order applied to a particular field
	 *
	 * @param field the field
	 * @return the string
	 */
	public String get(String field)
	{
		return map.get(field);
	}

	/**
	 * Method hasSort.
	 * 
	 * Indicates if the DaoOrder contains a sort for the field
	 *
	 * @param field the field
	 * @return true, if successful
	 */
	public boolean hasSort(String field)
	{
		return map.containsKey(field);
	}

	/**
	 * Method applyToCriteria.
	 * 
	 * Applies the sort information to the Hibernate criteria object
	 *
	 * @param criteria the criteria
	 */
	public void applyToCriteria(Criteria criteria, DaoQuery query)
	{
		for (String key : getOrderFields())
		{
			String order = get(key);
			
			String realKey = query.getFieldAliasFromPath(key, criteria);

			if (order.equals("asc"))
				criteria.addOrder(Order.asc(realKey));
			else
				criteria.addOrder(Order.desc(realKey));
		}
	}

	public Set<String> getOrderFields()
	{
		return map.keySet();
	}

	public void applyToCriteria(Criteria criteria)
	{
		applyToCriteria(criteria, new DaoQuery());
	}
	
	public Map<String,String> getMap()
	{
		return this.map;
	}
}
