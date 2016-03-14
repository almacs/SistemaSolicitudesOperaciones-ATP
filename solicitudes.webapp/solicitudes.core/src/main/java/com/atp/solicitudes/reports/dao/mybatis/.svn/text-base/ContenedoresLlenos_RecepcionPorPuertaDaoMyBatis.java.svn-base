package com.atp.solicitudes.reports.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atp.solicitudes.reports.dao.ContenedoresLlenos_RecepcionPorPuertaDao;
import com.atp.solicitudes.reports.model.ContenedoresLlenos_RecepcionPorPuerta;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class ContenedoresLlenos_RecepcionPorPuertaDaoMyBatis extends MyBatisDaoTemplate implements ContenedoresLlenos_RecepcionPorPuertaDao
{
	public ContenedoresLlenos_RecepcionPorPuertaDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}
	
	public DaoResult<ContenedoresLlenos_RecepcionPorPuerta> getWithDigitoVerificador(String digitoVerificador) throws Exception
	{
		DaoResult<ContenedoresLlenos_RecepcionPorPuerta> result = new DaoResult<ContenedoresLlenos_RecepcionPorPuerta>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("digito_verificador", digitoVerificador);

		List<ContenedoresLlenos_RecepcionPorPuerta> col = this.<ContenedoresLlenos_RecepcionPorPuerta> selectList("mybatis.reports.ContenedoresLlenos_RecepcionPorPuertaMapper.selectByDigitoVerificador", map, new RowBounds());
		result.setCollection(col);

		return result;
	}
}
