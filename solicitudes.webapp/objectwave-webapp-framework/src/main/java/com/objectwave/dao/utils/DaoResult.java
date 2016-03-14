/*
  (c) 2013 Copyright - Citlali Labs - All Rights Reserved
  $Id$;
*/
package com.objectwave.dao.utils;

import java.util.Collections;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;

/**
 * Object which represents a result of querying model objects from a database
 * 
 */
public class DaoResult<E>
{
	/**
	 * Field collection, contains resulting objects
	 */
	List<E> collection = Collections.emptyList();

	/**
	 * Field numberOfRows, from the query
	 */
	private Integer numberOfRows = 0;
	/**
	 * Field pageNumber, from the query
	 */
	private Integer pageNumber = 0;
	/**
	 * Field totalRows, from the query
	 */
	private Long totalRows = 0l;

	/**
	 * Method processWith.
	 * 
	 * Process and executes a DaoQuery and a Hibernate Criteria to perform a database query
	 * 
	 * @param query DaoQuery
	 * @param criteria Criteria
	 */
	public void processWith(DaoQuery query, Criteria criteria)
	{
		processWith(query, null, criteria);
	}

	@SuppressWarnings("unchecked")
	public void processWith(DaoQuery query, DaoOrder order, Criteria criteria)
	{
		if (query != null)
		{
			setCursorPropertiesFrom(query);
	
			if (query.getRequestTotalRows())
			{
				Long count = 0l;
	
				criteria.setProjection(Projections.rowCount());
				count = (Long) criteria.uniqueResult();
			    
				setTotalRows(count);
	
			    criteria.setProjection(null);
			    criteria.setResultTransformer(Criteria.ROOT_ENTITY);
			}
	
		    query.applyCursorPropertiesToCriteria(criteria);
		}

		if (order != null)
			order.applyToCriteria(criteria);

		setCollection(criteria.list());

		if (query != null)
		{
			if (!query.getRequestTotalRows())
				setTotalRows((new Long(getCollection().size())));
		}
	}

	/**
	 * Method setCursorPropertiesFrom.
	 * 
	 * Set the cursor properties information to the DaoResult, from the DaoQuery object
	 * 
	 * @param query DaoQuery
	 */
	public void setCursorPropertiesFrom(DaoQuery query)
	{
		setNumberOfRows(query.getNumberOfRows());
		setPageNumber(query.getPageNumber());
	}

	/**
	 * Method getCollection.
	 * @return List<E>
	 */
	public List<E> getCollection()
	{
		return collection;
	}

	/**
	 * Method setCollection.
	 * @param result List<E>
	 */
	public void setCollection(List<E> result)
	{
		this.collection = result;
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
	 * Method getTotalRows.
	 * @return Long
	 */
	public Long getTotalRows()
	{
		return totalRows;
	}

	/**
	 * Method setTotalRows.
	 * @param totalRows Long
	 */
	public void setTotalRows(Long totalRows)
	{
		this.totalRows = totalRows;
	}
}
