package com.atp.solicitudes.reports.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atp.solicitudes.reports.dao.ConsultaOperativoDao;
import com.atp.solicitudes.reports.model.BuqueViaje;
import com.atp.solicitudes.reports.model.ConsultaOperativo;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class ConsultaOperativoDaoMyBatis extends MyBatisDaoTemplate implements ConsultaOperativoDao
{
	public ConsultaOperativoDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}

	public DaoResult<ConsultaOperativo> getConsultaImportacionWithBuqueViaje(String buqueViaje) throws Exception
	{
		DaoResult<ConsultaOperativo> result = new DaoResult<ConsultaOperativo>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("buque_viaje", buqueViaje);
		
		List<ConsultaOperativo> col = this.<ConsultaOperativo> selectList("mybatis.reports.ConsultaOperativoMapper.selectConsultaOperativoImportacion", map, new RowBounds());
		result.setCollection(col);

		return result;
	}
	
	public DaoResult<ConsultaOperativo> getConsultaExportacion() throws Exception
	{
		DaoResult<ConsultaOperativo> result = new DaoResult<ConsultaOperativo>();
				
		List<ConsultaOperativo> col = this.<ConsultaOperativo> selectList("mybatis.reports.ConsultaOperativoMapper.selectConsultaOperativoExportacion");
		result.setCollection(col);
		
		return result;
	}

	public DaoResult<BuqueViaje> getBuqueViaje() throws Exception
	{
		DaoResult<BuqueViaje> result = new DaoResult<BuqueViaje>();
		
		List<BuqueViaje> col = this.<BuqueViaje> selectList("mybatis.reports.ConsultaOperativoMapper.selectBuqueViaje");
		result.setCollection(col);
		
		return result;
	}
		
}
