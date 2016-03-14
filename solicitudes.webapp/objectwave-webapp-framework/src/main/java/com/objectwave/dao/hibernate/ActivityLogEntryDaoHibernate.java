package com.objectwave.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

import com.objectwave.dao.ActivityLogEntryDao;
import com.objectwave.dao.utils.DaoOrder;
import com.objectwave.dao.utils.DaoQuery;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.HibernateDaoTemplate;
import com.objectwave.model.ActivityLogEntry;

public class ActivityLogEntryDaoHibernate extends HibernateDaoTemplate implements ActivityLogEntryDao
{
	/*
	 * Proper criteria for object
	 */
	private Criteria getCriteria()
	{
		return getSession().createCriteria(ActivityLogEntry.class);
	}

	public ActivityLogEntry getWithId(Integer aValue) throws Exception
	{
		Criteria criteria = getCriteria();

		// restriction for query specific id
		criteria.add(Restrictions.eq("id", aValue));

		// get the collection
		@SuppressWarnings("unchecked")
		List<ActivityLogEntry> col = criteria.list();

		// if no elements found, return null
		// otherwise, return the first object found
		if (col.size() == 0)
			return null;
		else
			return col.get(0);
	}

	public DaoResult<ActivityLogEntry> query(DaoQuery query, DaoOrder order) throws Exception
	{
		Criteria criteria = getCriteria();
		// fetch mode with user attribute will ensure a join between the ActivityLogEntry and User tables
		// is perform, so both Log and User objects will be fetched on the same database record
		// avoiding to retrieve each user object later, what would imply another query to the database for
		// each user access
		criteria.setFetchMode("user", FetchMode.JOIN);

		// add date ranges
		query.applyConjunctionDateRange("timestamp", criteria);

		String[] likes = {"module", "action", "data"};
		registerFullLikePaths(likes, query, criteria);

		// create the result object
		DaoResult<ActivityLogEntry> result = new DaoResult<ActivityLogEntry>();
	
		// process it
		result.processWith(query, order, criteria);

		return result;
	}

	public List<String> getColumnPropertyValues(String column, String match, int maxResults) throws Exception
	{
		Query query = getSession().createQuery("select distinct p." + column + " from ActivityLogEntry p where p." + column + " like ? order by p." + column);
		query.setString(0, match);
		
		if(maxResults != 0)
			query.setMaxResults(maxResults);
		
		@SuppressWarnings("unchecked")
		List<String> queryResult = query.list();
		
		return queryResult;
	}	

	public void insert(ActivityLogEntry object)
	{
		String dataMsg = object.getData();
		
		// trunks the data log size info
		if (dataMsg != null && dataMsg.length() > ActivityLogEntry.DATA_LENGTH)
		{
			String newDataString = dataMsg.substring(0, ActivityLogEntry.DATA_LENGTH -1);
			object.setData(newDataString);
		}
		
		getHibernateTemplate().save(object);
	}
}
