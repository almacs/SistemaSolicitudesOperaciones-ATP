package com.objectwave.dao.utils;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;

public class MyBatisDaoTemplate extends SqlSessionTemplate 
{
	public MyBatisDaoTemplate(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}
	
	public RowBounds getRowBoundsFrom(DaoQuery query)
	{
		RowBounds rowBounds = new RowBounds();

		if (query.getNumberOfRows() != null)
		{
			Integer rowIndex = 0;
	
			if (query.getPageNumber() != null)
			{
				rowIndex = (query.getPageNumber() - 1) * query.getNumberOfRows();
			}
	
			rowBounds = new RowBounds(rowIndex, query.getNumberOfRows());
		}
		
		return rowBounds;
	}

	public void registerTimestampRange(String fieldName, DaoQuery query, Map<String,Object> map)
	{
		String fullFieldName = null;

		fullFieldName = fieldName + "_initial"; 
		if (query.hasFilter(fullFieldName))
		{
			map.put(fullFieldName, query.get(fullFieldName));
		}

		fullFieldName = fieldName + "_final"; 
		if (query.hasFilter(fullFieldName))
		{
			map.put(fullFieldName, query.get(fullFieldName));
		}
	}

	public void registerLikePaths(String[] paths, DaoQuery query, Map<String,Object> map)
	{
		for (String eachPath : Arrays.asList(paths))
		{
			Object val = query.get(eachPath);

			if (val != null)
			{
				map.put(eachPath, val + "%");
			}
		}
	}
	
	public void registerFullLikePaths(String[] paths, DaoQuery query, Map<String,Object> map)
	{
		for (String eachPath : Arrays.asList(paths))
		{
			Object val = query.get(eachPath);

			if (val != null)
			{
				map.put(eachPath, "%" + val.toString().trim() + "%");
			}
		}
	}
	
	public void registerEqPaths(String[] paths, DaoQuery query, Map<String,Object> map)
	{
		for (String eachPath : Arrays.asList(paths))
		{
			Object val = query.get(eachPath);

			if (val != null)
			{
				map.put(eachPath, val);
			}
		}
	}
	
	public void registerOrder(DaoOrder order, Map<String,Object> map)
	{
		if (order != null)
		{
			map.put("_orderInfo", order.getMap());
		}
	}
	
	public void registerMultipleOrder(DaoOrder order, Map<String,Object> map)
	{
		if (order == null)
			return;

		StringBuilder builder = new StringBuilder(64);
		
		Set<String> orders = order.getOrderFields();

		for (String fieldName : orders)
		{
			if (builder.length() > 0)
				builder.append(", ");

			builder.append(fieldName);
			builder.append(" ");
			builder.append(order.get(fieldName));
		}

		map.put("_multipleOrderInfo", builder.toString());
	}
}
