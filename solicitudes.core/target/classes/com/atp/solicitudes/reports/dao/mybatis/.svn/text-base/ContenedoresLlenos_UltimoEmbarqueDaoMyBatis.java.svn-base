package com.atp.solicitudes.reports.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atp.solicitudes.reports.dao.ContenedoresLlenos_UltimoEmbarqueDao;
import com.atp.solicitudes.reports.model.ContenedoresLlenos_UltimoEmbarque;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class ContenedoresLlenos_UltimoEmbarqueDaoMyBatis  extends MyBatisDaoTemplate implements ContenedoresLlenos_UltimoEmbarqueDao
{
	public ContenedoresLlenos_UltimoEmbarqueDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}

	public DaoResult<ContenedoresLlenos_UltimoEmbarque> getWithDigitoVerificador(String digitoVerificador) throws Exception
	{
		DaoResult<ContenedoresLlenos_UltimoEmbarque> result = new DaoResult<ContenedoresLlenos_UltimoEmbarque>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("digito_verificador", digitoVerificador);

		List<ContenedoresLlenos_UltimoEmbarque> col = 
				this.<ContenedoresLlenos_UltimoEmbarque>selectList("mybatis.reports.ContenedoresLlenos_UltimoEmbarqueMapper.selectByDigitoVerificador", map, new RowBounds());
		result.setCollection(col);

		return result;

	}
}
