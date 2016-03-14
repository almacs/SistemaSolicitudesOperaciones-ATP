package com.atp.solicitudes.reports.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
 
import com.atp.solicitudes.reports.dao.EtasCierresBuquesDao;
import com.atp.solicitudes.reports.model.BuqueViaje;
import com.atp.solicitudes.reports.model.Etas_CierresBuques;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class EtasCierresBuquesDaoMyBatis extends MyBatisDaoTemplate implements EtasCierresBuquesDao
{

	public EtasCierresBuquesDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}

	public DaoResult<Etas_CierresBuques> getConsultaEtasCierreBuquesWithBuqueViaje(String buqueViaje) throws Exception
	{
		DaoResult<Etas_CierresBuques> result = new DaoResult<Etas_CierresBuques>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("buque_viaje", buqueViaje);
		
		List<Etas_CierresBuques> col = this.<Etas_CierresBuques> selectList("mybatis.reports.EtasCierresBuquesMapper.selectConsultaEtas", map, new RowBounds());
		result.setCollection(col);

		return result;
	}
	
	public DaoResult<BuqueViaje> getBuqueViaje() throws Exception
	{
		DaoResult<BuqueViaje> result = new DaoResult<BuqueViaje>();
		
		List<BuqueViaje> col = this.<BuqueViaje> selectList("mybatis.reports.EtasCierresBuquesMapper.selectBuqueViaje");
		result.setCollection(col);
		
		return result;
	}
	
}
