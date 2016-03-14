package com.objectwave.dao.hibernate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.objectwave.dao.SystemPropertyDao;
import com.objectwave.dao.utils.DaoOrder;
import com.objectwave.dao.utils.DaoQuery;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.model.SystemProperty;

public class SystemPropertyDaoHibernate extends HibernateDaoSupport implements SystemPropertyDao
{
	/*
	 * Proper criteria for object
	 */
	private Criteria getCriteria()
	{
		return getSession().createCriteria(SystemProperty.class);
	}

	@SuppressWarnings("unchecked")
	public List<SystemProperty> getAll()
	{
		Criteria criteria = getCriteria();

		criteria.addOrder(Order.asc("name"));

		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<SystemProperty> getWithNames(String[] names)
	{
		Criteria criteria = getCriteria();

		criteria.add(Restrictions.in("name", names));

		return criteria.list();
	}

	public SystemProperty getWithName(String name)
	{
		Criteria criteria = getCriteria();

		criteria.add(Restrictions.eq("name", name));

		@SuppressWarnings("unchecked")
		List<SystemProperty> col = criteria.list();

		if (col.size() == 0)
			return null;
		else
			return col.get(0);
	}
	
	public SystemProperty getWithId(Integer id)
	{
		Criteria criteria =  getCriteria();

		// restriction to query by id
		criteria.add(Restrictions.eq("id", id));

		// get the collection
		@SuppressWarnings("unchecked")
		List<SystemProperty> col = criteria.list();

		// if no elements found, return null
		// otherwise, return the first object found
		if (col.size() == 0)
			return null;
		else
			return col.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<SystemProperty> getWithNamePattern(String patterName) throws Exception
	{
		Criteria criteria = getCriteria();

		criteria.add(Restrictions.eq("like", patterName));

		return criteria.list();
	}
	
	public DaoResult<SystemProperty> query(DaoQuery query, DaoOrder order) throws Exception
	{
		Criteria criteria = getCriteria();

		// reusable object to hold param values
		Object val = null;

		// add possible like searches
		val = query.get("name");
		if (val != null)
			criteria.add(Restrictions.ilike("name", "%" + val.toString().trim() + "%"));

		DaoResult<SystemProperty> result = new DaoResult<SystemProperty>();

		result.processWith(query, order, criteria);

		// return the result
		return result;
	}
	
	public List<String> getColumnPropertyValues(String column, String match, int maxResults) throws Exception
	{
		Query query = getSession().createQuery("select distinct p." + column + " from SystemProperty p where p." + column + " like ? order by p." + column);
		query.setString(0, match);
		
		if(maxResults != 0)
			query.setMaxResults(maxResults);
		
		@SuppressWarnings("unchecked")
		List<String> queryResult = query.list();
		
		return queryResult;
	}

	public Map<String,SystemProperty> getMap()
	{
		Criteria criteria = getSession().createCriteria(SystemProperty.class);

		@SuppressWarnings("unchecked")
		List<SystemProperty> col = criteria.list();
		
		Map<String, SystemProperty> map = new HashMap<String,SystemProperty>();
		
		for (SystemProperty eachProp : col)
			map.put(eachProp.getName(), eachProp);
		
		return map;
	}

	public Map<String,SystemProperty> getMapWithNames(String[] names)
	{
		Criteria criteria = getSession().createCriteria(SystemProperty.class);

		criteria.add(Restrictions.in("name", names));
		
		@SuppressWarnings("unchecked")
		List<SystemProperty> col = criteria.list();
		
		Map<String, SystemProperty> map = new HashMap<String,SystemProperty>();
		
		for (SystemProperty eachProp : col)
			map.put(eachProp.getName(), eachProp);
		
		return map;
	}

	public void update(SystemProperty object)
	{
		getHibernateTemplate().update(object);
	}
	
	public void save(SystemProperty object)
	{
		getHibernateTemplate().saveOrUpdate(object);
	}
	
	public void delete(SystemProperty object)
	{
		getHibernateTemplate().delete(object);
	}
}
