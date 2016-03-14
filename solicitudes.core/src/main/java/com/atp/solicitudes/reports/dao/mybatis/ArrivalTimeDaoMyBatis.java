package com.atp.solicitudes.reports.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atp.solicitudes.reports.dao.ArrivalTimeDao;
import com.atp.solicitudes.reports.model.ArrivalTimeContenedor;
import com.atp.solicitudes.reports.model.ArrivalTimeHoraEntradaTerminal;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class ArrivalTimeDaoMyBatis extends MyBatisDaoTemplate implements ArrivalTimeDao
{
	public ArrivalTimeDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}

	public DaoResult<ArrivalTimeContenedor> getArrivalTimeContenedor(String paseDeEntrada) throws Exception
	{
		DaoResult<ArrivalTimeContenedor> result = new DaoResult<ArrivalTimeContenedor>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("paseDeEntrada", paseDeEntrada);
		
		List<ArrivalTimeContenedor> col = 
				this.<ArrivalTimeContenedor> selectList("mybatis.reports.ArrivalTimeMapper.selectArrivalTimeContenedor", map, new RowBounds()); 
		result.setCollection(col);
		
		return result;
	}
	
	public DaoResult<ArrivalTimeHoraEntradaTerminal> getArrivalTimeHoraEntradaTerminal(String paseDeEntrada) throws Exception
	{
		DaoResult<ArrivalTimeHoraEntradaTerminal> result = new DaoResult<ArrivalTimeHoraEntradaTerminal>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("paseDeEntrada", paseDeEntrada);
		
		List<ArrivalTimeHoraEntradaTerminal> col = 
				this.<ArrivalTimeHoraEntradaTerminal> selectList("mybatis.reports.ArrivalTimeMapper.selectArrivalTimeHoraEntradaTerminal", map, new RowBounds()); 
		result.setCollection(col);
		
		return result;
	}
		
}
