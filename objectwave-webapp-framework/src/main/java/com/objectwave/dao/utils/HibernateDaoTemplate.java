package com.objectwave.dao.utils;

import java.util.Arrays;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HibernateDaoTemplate extends HibernateDaoSupport
{
	public void registerLikePaths(String[] paths, DaoQuery query, Criteria criteria)
	{
		for (String eachPath : Arrays.asList(paths))
		{
			Object val = query.get(eachPath);

			if (val != null)
			{
				String alias = query.getFieldAliasFromPath(eachPath, criteria);
	
				criteria.add(Restrictions.ilike(alias, val + "%"));
			}
		}
	}
	
	public void registerFullLikePaths(String[] paths, DaoQuery query, Criteria criteria)
	{
		for (String eachPath : Arrays.asList(paths))
		{
			Object val = query.get(eachPath);

			if (val != null)
			{
				String alias = query.getFieldAliasFromPath(eachPath, criteria);
	
				criteria.add(Restrictions.ilike(alias, "%" + val.toString().trim() + "%"));
			}
		}
	}
	
	public void registerEqPaths(String[] paths, DaoQuery query, Criteria criteria)
	{
		for (String eachPath : Arrays.asList(paths))
		{
			Object val = query.get(eachPath);

			if (val != null)
			{
				String alias = query.getFieldAliasFromPath(eachPath, criteria);
	
				criteria.add(Restrictions.eq(alias, val));
			}
		}
	}
}
