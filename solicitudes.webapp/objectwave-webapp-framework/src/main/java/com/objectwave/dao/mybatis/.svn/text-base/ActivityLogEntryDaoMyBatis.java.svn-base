package com.objectwave.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;

import com.objectwave.dao.ActivityLogEntryDao;
import com.objectwave.model.ActivityLogEntry;
import com.objectwave.dao.utils.DaoOrder;
import com.objectwave.dao.utils.DaoQuery;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class ActivityLogEntryDaoMyBatis extends MyBatisDaoTemplate implements ActivityLogEntryDao
{
	public ActivityLogEntryDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}

	public ActivityLogEntry getWithId(Integer aValue) throws Exception
	{
		return (ActivityLogEntry) selectOne("mybatis.ActivityLogEntryMapper.selectById", aValue);
	}

	public DaoResult<ActivityLogEntry> query(DaoQuery query, DaoOrder order) throws Exception
	{
		DaoResult<ActivityLogEntry> result = new DaoResult<ActivityLogEntry>();
		result.setCursorPropertiesFrom(query);

		Map<String,Object> map = new HashMap<String,Object>();

		String[] likes = {"module", "action", "data"};
		registerFullLikePaths(likes, query, map);

		String[] equals = {"id"};
		registerEqPaths(equals, query, map);

		registerTimestampRange("timestamp", query, map);

		if (query.getRequestTotalRows())
		{
			Long totalRows = selectOne("mybatis.ActivityLogEntryMapper.selectCount", map);
			result.setTotalRows(new Long(totalRows));
		}

		registerOrder(order, map);

		List<ActivityLogEntry> col = this.<ActivityLogEntry> selectList("mybatis.ActivityLogEntryMapper.select", map, getRowBoundsFrom(query));
		result.setCollection(col);

		return result;
	}

	public List<String> getColumnPropertyValues(String column, String match, int maxResults) throws Exception
	{
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("columnName", column);
		map.put("columnValue", match);

		RowBounds rowBounds = new RowBounds(0, maxResults);

		List<String> col = selectList("mybatis.ActivityLogEntryMapper.selectColumnValue", map, rowBounds);

		return col;
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
		
		insert("mybatis.ActivityLogEntryMapper.insert", object);
	}
}
