package com.objectwave.dao;

import java.util.List;
import java.util.Map;

import com.objectwave.dao.utils.DaoOrder;
import com.objectwave.dao.utils.DaoQuery;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.model.SystemProperty;

public interface SystemPropertyDao
{
	List<SystemProperty> getAll() throws Exception;
	List<SystemProperty> getWithNames(String[] names) throws Exception;
	List<SystemProperty> getWithNamePattern(String patterName) throws Exception;
	DaoResult<SystemProperty> query(DaoQuery query, DaoOrder order) throws Exception;
	List<String> getColumnPropertyValues(String column, String match, int maxResults) throws Exception;
	Map<String,SystemProperty> getMap();
	Map<String,SystemProperty> getMapWithNames(String[] names);
	SystemProperty getWithName(String name) throws Exception;
	SystemProperty getWithId(Integer id) throws Exception;
	void update(SystemProperty obj) throws Exception;
	void save(SystemProperty obj) throws Exception;
	void delete(SystemProperty obj) throws Exception;
}
