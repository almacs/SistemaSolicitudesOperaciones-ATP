package com.atp.solicitudes.reports.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atp.solicitudes.reports.dao.ContenedoresLlenos_UltimoDesembarqueDao;
import com.atp.solicitudes.reports.model.ContenedoresLlenos_UltimoDesembarque;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class ContenedoresLlenos_UltimoDesembarqueDaoMyBatis extends MyBatisDaoTemplate implements ContenedoresLlenos_UltimoDesembarqueDao
{

	public ContenedoresLlenos_UltimoDesembarqueDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}

	public DaoResult<ContenedoresLlenos_UltimoDesembarque> getWithDigitoVerificador(String digitoVerificador) throws Exception
	{
		DaoResult<ContenedoresLlenos_UltimoDesembarque> result = new DaoResult<ContenedoresLlenos_UltimoDesembarque>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("digito_verificador", digitoVerificador);

		List<ContenedoresLlenos_UltimoDesembarque> col = this.<ContenedoresLlenos_UltimoDesembarque> selectList("mybatis.reports.ContenedoresLlenos_UltimoDesembarqueMapper.selectByDigitoVerificador", map, new RowBounds());
		result.setCollection(col);

		return result;

	}
}
