package com.atp.solicitudes.reports.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atp.solicitudes.reports.dao.ConsultaBookingDao;
import com.atp.solicitudes.reports.model.ConsultaBooking;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class ConsultaBookingDaoMyBatis extends MyBatisDaoTemplate implements ConsultaBookingDao
{
	public ConsultaBookingDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}

	public DaoResult<ConsultaBooking> getConsultaWithBooking(String booking) throws Exception
	{
		DaoResult<ConsultaBooking> result = new DaoResult<ConsultaBooking>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("booking", booking);
		
		List<ConsultaBooking> col = this.<ConsultaBooking> selectList("mybatis.reports.ConsultaBookingMapper.selectConsultaBooking", map, new RowBounds()); 
		result.setCollection(col);
		
		return result;
	}
		
}
