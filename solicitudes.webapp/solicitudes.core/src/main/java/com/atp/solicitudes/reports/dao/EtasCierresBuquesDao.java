package com.atp.solicitudes.reports.dao;

import com.atp.solicitudes.reports.model.BuqueViaje;
import com.atp.solicitudes.reports.model.Etas_CierresBuques;
import com.objectwave.dao.utils.DaoResult;

public interface EtasCierresBuquesDao
{
	DaoResult<Etas_CierresBuques> getConsultaEtasCierreBuquesWithBuqueViaje(String buqueViaje) throws Exception;
	DaoResult<BuqueViaje> getBuqueViaje() throws Exception;

}
