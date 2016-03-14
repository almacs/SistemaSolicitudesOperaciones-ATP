package com.objectwave.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockOptions;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.objectwave.dao.GenericBlobDao;
import com.objectwave.dao.GenericBlobDaoRetriever;
import com.objectwave.model.GenericBlob;

public class GenericBlobDaoHibernate extends HibernateDaoSupport implements GenericBlobDao
{
	/*
	 * Proper criteria for object
	 */
	private Criteria getCriteria()
	{
		return getSession().createCriteria(GenericBlob.class);
	}
	
	public GenericBlob getWithId(Integer id) throws Exception
	{
		Criteria criteria = getCriteria();

		criteria.add(Restrictions.eq("id", id));

		@SuppressWarnings("unchecked")
		List<GenericBlob> col = criteria.list();

		if (col.size() == 0)
			return null;
		else
			return col.get(0);
	}

	public void save(GenericBlob object) throws Exception
	{
		getHibernateTemplate().saveOrUpdate(object);
	}
	
	public void delete(GenericBlob object) throws Exception
	{
		getHibernateTemplate().delete(object);
	}
	
	public GenericBlob getFromDaoRetriever(GenericBlobDaoRetriever retriever) throws Exception
	{
		// do a none lock on the object that contains the blob
		getSession().buildLockRequest(LockOptions.NONE).lock(retriever.getOwner());

		// retrieve the blob from the retriever
		GenericBlob blob = retriever.getGenericBlob();
		
		// touch the proxy object so it gets the full contents of the GenericBlob
		blob.getId();
		
		return blob;
	}
}
