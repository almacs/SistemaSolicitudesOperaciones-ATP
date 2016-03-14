package com.atp.solicitudes.reports.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atp.solicitudes.reports.dao.ArrivalTimeLlegadaAlCentroReguladorDao;
import com.atp.solicitudes.reports.model.ArrivalTimeLlegadaAlCentroRegulador;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class ArrivalTimeLlegadaAlCentroReguladorDaoMyBatis extends MyBatisDaoTemplate implements ArrivalTimeLlegadaAlCentroReguladorDao
{
	public ArrivalTimeLlegadaAlCentroReguladorDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}

	public DaoResult<ArrivalTimeLlegadaAlCentroRegulador> getArrivalTimeLlegadaAlCentroRegulador(String paseDeEntrada) throws Exception
	{
		DaoResult<ArrivalTimeLlegadaAlCentroRegulador> result = new DaoResult<ArrivalTimeLlegadaAlCentroRegulador>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("paseDeEntrada", paseDeEntrada);
		
		List<ArrivalTimeLlegadaAlCentroRegulador> col = 
				this.<ArrivalTimeLlegadaAlCentroRegulador> selectList("mybatis.reports.ArrivalTimeLlegadaAlCentroReguladorMapper.selectArrivalTimeLlegadaAlCentroRegulador", map, new RowBounds()); 
		result.setCollection(col);
		
		return result;
	}
		
}
