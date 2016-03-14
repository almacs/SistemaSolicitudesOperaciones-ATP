package com.atp.solicitudes.reports.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atp.solicitudes.reports.dao.PaseDeEntradaReportDao;
import com.atp.solicitudes.reports.model.PaseDeEntradaReport;
import com.objectwave.dao.utils.MyBatisDaoTemplate;

public class PaseDeEntradaReportDaoMyBatis extends MyBatisDaoTemplate implements PaseDeEntradaReportDao
{
	public PaseDeEntradaReportDaoMyBatis(SqlSessionFactory sqlSessionFactory)
	{
		super(sqlSessionFactory);
	}

	public PaseDeEntradaReport getPaseDeEntradaReport(Integer paseDeEntrada) throws Exception
	{
		return (PaseDeEntradaReport) selectOne("mybatis.reports.PaseDeEntradaReportMapper.selectPaseDeEntradaReport", paseDeEntrada); 
	}
	
	public List <PaseDeEntradaReport> getPaseDeEntradaReportHazard (Integer hazard) throws Exception
	{
		List<PaseDeEntradaReport> col = this.<PaseDeEntradaReport> selectList("mybatis.reports.PaseDeEntradaReportMapper.selectPaseDeEntradaReportHazard", hazard, new RowBounds());
 
		return col;
	}
}
