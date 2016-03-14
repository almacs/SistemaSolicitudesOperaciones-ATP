package com.atp.solicitudes.reports.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atp.solicitudes.reports.dao.ContenedoresLlenos_EntregaPorPuertaDao;
import com.atp.solicitudes.reports.model.ContenedoresLlenos_EntregaPorPuerta;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class ContenedoresLlenos_EntregaPorPuertaDaoMyBatis extends MyBatisDaoTemplate implements ContenedoresLlenos_EntregaPorPuertaDao
{
	public ContenedoresLlenos_EntregaPorPuertaDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}
	
	public DaoResult<ContenedoresLlenos_EntregaPorPuerta> getWithDigitoVerificador(String digitoVerificador) throws Exception
	{
		DaoResult<ContenedoresLlenos_EntregaPorPuerta> result = new DaoResult<ContenedoresLlenos_EntregaPorPuerta>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("digito_verificador", digitoVerificador);

		List<ContenedoresLlenos_EntregaPorPuerta> col = this.<ContenedoresLlenos_EntregaPorPuerta> selectList("mybatis.reports.ContenedoresLlenos_EntregaPorPuertaMapper.selectByDigitoVerificador", map, new RowBounds());
		result.setCollection(col);

		return result;
	}
}
