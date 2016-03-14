package com.atp.solicitudes.reports.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atp.solicitudes.reports.dao.ConsultaBLDao;
import com.atp.solicitudes.reports.model.ConsultaBL;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class ConsultaBLDaoMyBatis extends MyBatisDaoTemplate implements ConsultaBLDao
{
	public ConsultaBLDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}

	public DaoResult<ConsultaBL> getConsultaWithBooking(String bl) throws Exception
	{
		DaoResult<ConsultaBL> result = new DaoResult<ConsultaBL>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bl", bl);
		
		List<ConsultaBL> col = this.<ConsultaBL> selectList("mybatis.reports.ConsultaBlMapper.selectConsultaBL", map, new RowBounds()); 
		result.setCollection(col);
		
		return result;
	}
		
}
