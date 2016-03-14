package com.atp.solicitudes.reports.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atp.solicitudes.reports.dao.ArrivalTimeDao;
import com.atp.solicitudes.reports.dao.ArrivalTimeLlegadaAlCentroReguladorDao;
import com.atp.solicitudes.reports.dao.ConsultaBLDao;
import com.atp.solicitudes.reports.dao.ConsultaBookingDao;
import com.atp.solicitudes.reports.dao.ConsultaOperativoDao;
import com.atp.solicitudes.reports.dao.ContenedoresLlenos_EntregaPorPuertaDao;
import com.atp.solicitudes.reports.dao.ContenedoresLlenos_RecepcionPorPuertaDao;
import com.atp.solicitudes.reports.dao.ContenedoresLlenos_UltimoDesembarqueDao;
import com.atp.solicitudes.reports.dao.ContenedoresLlenos_UltimoEmbarqueDao;
import com.atp.solicitudes.reports.dao.EtasCierresBuquesDao;
import com.atp.solicitudes.reports.dao.PaseDeEntradaReportDao;
import com.atp.solicitudes.reports.manager.ReportsDomainManager;
import com.atp.solicitudes.reports.model.ArrivalTimeContenedor;
import com.atp.solicitudes.reports.model.ArrivalTimeHoraEntradaTerminal;
import com.atp.solicitudes.reports.model.ArrivalTimeLlegadaAlCentroRegulador;
import com.atp.solicitudes.reports.model.BuqueViaje;
import com.atp.solicitudes.reports.model.ConsultaBL;
import com.atp.solicitudes.reports.model.ConsultaBooking;
import com.atp.solicitudes.reports.model.ConsultaOperativo;
import com.atp.solicitudes.reports.model.ContenedoresLlenos_EntregaPorPuerta;
import com.atp.solicitudes.reports.model.ContenedoresLlenos_RecepcionPorPuerta;
import com.atp.solicitudes.reports.model.ContenedoresLlenos_UltimoDesembarque;
import com.atp.solicitudes.reports.model.ContenedoresLlenos_UltimoEmbarque;
import com.atp.solicitudes.reports.model.Etas_CierresBuques;
import com.atp.solicitudes.reports.model.PaseDeEntradaReport;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.utils.AppContextProvider;

@Service
@Transactional(readOnly = true)
public class ReportsDomainManagerImpl extends AppContextProvider implements ReportsDomainManager
{
	private ContenedoresLlenos_UltimoDesembarqueDao contenedoresLlenos_UltimoDesembarqueDao;
	private ContenedoresLlenos_UltimoEmbarqueDao contenedoresLlenos_UltimoEmbarqueDao;
	private ContenedoresLlenos_RecepcionPorPuertaDao contenedoresLlenos_RecepcionPorPuertaDao;
	private ContenedoresLlenos_EntregaPorPuertaDao contenedoresLlenos_EntregaPorPuertaDao;
	private ConsultaOperativoDao consultaOperativoDao;
	private ConsultaBookingDao consultaBookingDao;
	private ConsultaBLDao consultaBLDao;
	private ArrivalTimeLlegadaAlCentroReguladorDao arrivalTimeLlegadaAlCentroReguladorDao;
	private ArrivalTimeDao arrivalTimeDao;
	private EtasCierresBuquesDao etasCierresBuquesDao;
	private PaseDeEntradaReportDao paseDeEntradaReportDao;
	
	// Consulta BL

	public DaoResult<ConsultaBL> getConsultaBL(String bl) throws Exception
	{
		return consultaBLDao.getConsultaWithBooking(bl);
	}

	// Contenedores llenos ultimo desembarque

	public DaoResult<ContenedoresLlenos_UltimoDesembarque> getContenedoresLlenos_UltimoDesembarque(String digitoVerificador)
			throws Exception
	{
		return contenedoresLlenos_UltimoDesembarqueDao.getWithDigitoVerificador(digitoVerificador);
	}

	// Contenedores llenos ultimo embarque

	public DaoResult<ContenedoresLlenos_UltimoEmbarque> getContenedoresLlenos_UltimoEmbarque(String digitoVerificador)
			throws Exception
	{
		return contenedoresLlenos_UltimoEmbarqueDao.getWithDigitoVerificador(digitoVerificador);
	}

	// Contenedores llenos recepcion por puerta

	public DaoResult<ContenedoresLlenos_RecepcionPorPuerta> getContenedoresLlenos_RecepcionPorPuerta(String digitoVerificador)
			throws Exception
	{
		return contenedoresLlenos_RecepcionPorPuertaDao.getWithDigitoVerificador(digitoVerificador);
	}

	// Contenedores llenos entrega por puerta

	public DaoResult<ContenedoresLlenos_EntregaPorPuerta> getContenedoresLlenos_EntregaPorPuerta(String digitoVerificador)
			throws Exception
	{
		return contenedoresLlenos_EntregaPorPuertaDao.getWithDigitoVerificador(digitoVerificador);
	}

	// Consulta operativo Importacion y Exportacion

	public DaoResult<ConsultaOperativo> getConsultaOperativoImportacion(String buqueViaje) throws Exception
	{
		return consultaOperativoDao.getConsultaImportacionWithBuqueViaje(buqueViaje);
	}

	public DaoResult<ConsultaOperativo> getConsultaOperativoExportacion() throws Exception
	{
		return consultaOperativoDao.getConsultaExportacion();
	}

	public DaoResult<BuqueViaje> getBuqueViajeForConsultaOperativo() throws Exception
	{
		return consultaOperativoDao.getBuqueViaje();
	}

	// Consulta Booking

	public DaoResult<ConsultaBooking> getConsultaBooking(String booking) throws Exception
	{
		return consultaBookingDao.getConsultaWithBooking(booking);
	}

	// Consulta Arrived Time

	public DaoResult<ArrivalTimeLlegadaAlCentroRegulador> getArrivalTimeLlegadaAlCentroRegulador(String paseDeEntrada)
			throws Exception
	{
		return arrivalTimeLlegadaAlCentroReguladorDao.getArrivalTimeLlegadaAlCentroRegulador(paseDeEntrada);
	}

	public DaoResult<ArrivalTimeContenedor> getArrivalTimeContenedor(String paseDeEntrada) throws Exception
	{
		return arrivalTimeDao.getArrivalTimeContenedor(paseDeEntrada);
	}

	public DaoResult<ArrivalTimeHoraEntradaTerminal> getArrivalTimeHoraEntradaTerminal(String paseDeEntrada) throws Exception
	{
		return arrivalTimeDao.getArrivalTimeHoraEntradaTerminal(paseDeEntrada);
	}

	// Consulta Etas y Cierre de Buques

	public DaoResult<Etas_CierresBuques> getConsultaEtasCierreBuques(String buqueViaje) throws Exception
	{
		return etasCierresBuquesDao.getConsultaEtasCierreBuquesWithBuqueViaje(buqueViaje);
	}
	
	public DaoResult<BuqueViaje> getBuqueViajeForEtasCierresBuques() throws Exception
	{
		return etasCierresBuquesDao.getBuqueViaje();
	}
	
	// Reporte de Pase de Entrada
	
	public PaseDeEntradaReport getPaseDeEntradaReport(Integer paseDeEntrada) throws Exception
	{
		return paseDeEntradaReportDao.getPaseDeEntradaReport(paseDeEntrada);
	}

	public List <PaseDeEntradaReport> getPaseDeEntradaReportHazard (Integer hazard) throws Exception
	{
		return paseDeEntradaReportDao.getPaseDeEntradaReportHazard(hazard);
	}

	/*
	 * Getters and setters
	 */

	public ConsultaBLDao getConsultaBLDao()
	{
		return consultaBLDao;
	}

	public void setConsultaBLDao(ConsultaBLDao consultaBLDao)
	{
		this.consultaBLDao = consultaBLDao;
	}

	public ContenedoresLlenos_UltimoDesembarqueDao getContenedoresLlenos_UltimoDesembarqueDao()
	{
		return contenedoresLlenos_UltimoDesembarqueDao;
	}

	public void setContenedoresLlenos_UltimoDesembarqueDao(
			ContenedoresLlenos_UltimoDesembarqueDao contenedoresLlenos_UltimoDesembarqueDao)
	{
		this.contenedoresLlenos_UltimoDesembarqueDao = contenedoresLlenos_UltimoDesembarqueDao;
	}

	public ContenedoresLlenos_UltimoEmbarqueDao getContenedoresLlenos_UltimoEmbarqueDao()
	{
		return contenedoresLlenos_UltimoEmbarqueDao;
	}

	public void setContenedoresLlenos_UltimoEmbarqueDao(
			ContenedoresLlenos_UltimoEmbarqueDao contenedoresLlenos_UltimoEmbarqueDao)
	{
		this.contenedoresLlenos_UltimoEmbarqueDao = contenedoresLlenos_UltimoEmbarqueDao;
	}

	public ContenedoresLlenos_RecepcionPorPuertaDao getContenedoresLlenos_RecepcionPorPuertaDao()
	{
		return contenedoresLlenos_RecepcionPorPuertaDao;
	}

	public void setContenedoresLlenos_RecepcionPorPuertaDao(
			ContenedoresLlenos_RecepcionPorPuertaDao contenedoresLlenos_RecepcionPorPuertaDao)
	{
		this.contenedoresLlenos_RecepcionPorPuertaDao = contenedoresLlenos_RecepcionPorPuertaDao;
	}

	public ContenedoresLlenos_EntregaPorPuertaDao getContenedoresLlenos_EntregaPorPuertaDao()
	{
		return contenedoresLlenos_EntregaPorPuertaDao;
	}

	public void setContenedoresLlenos_EntregaPorPuertaDao(
			ContenedoresLlenos_EntregaPorPuertaDao contenedoresLlenos_EntregaPorPuertaDao)
	{
		this.contenedoresLlenos_EntregaPorPuertaDao = contenedoresLlenos_EntregaPorPuertaDao;
	}

	public ConsultaOperativoDao getConsultaOperativoDao()
	{
		return consultaOperativoDao;
	}

	public void setConsultaOperativoDao(ConsultaOperativoDao consultaOperativoDao)
	{
		this.consultaOperativoDao = consultaOperativoDao;
	}

	public ConsultaBookingDao getConsultaBookingDao()
	{
		return consultaBookingDao;
	}

	public void setConsultaBookingDao(ConsultaBookingDao consultaBookingDao)
	{
		this.consultaBookingDao = consultaBookingDao;
	}

	public ArrivalTimeLlegadaAlCentroReguladorDao getArrivalTimeLlegadaAlCentroReguladorDao()
	{
		return arrivalTimeLlegadaAlCentroReguladorDao;
	}

	public void setArrivalTimeLlegadaAlCentroReguladorDao(
			ArrivalTimeLlegadaAlCentroReguladorDao arrivalTimeLlegadaAlCentroReguladorDao)
	{
		this.arrivalTimeLlegadaAlCentroReguladorDao = arrivalTimeLlegadaAlCentroReguladorDao;
	}

	public ArrivalTimeDao getArrivalTimeDao()
	{
		return arrivalTimeDao;
	}

	public void setArrivalTimeDao(ArrivalTimeDao arrivalTimeDao)
	{
		this.arrivalTimeDao = arrivalTimeDao;
	}

	public EtasCierresBuquesDao getEtas_CierresBuquesDao()
	{
		return etasCierresBuquesDao;
	}

	public void setEtasCierresBuquesDao(EtasCierresBuquesDao etasCierresBuquesDao)
	{
		this.etasCierresBuquesDao = etasCierresBuquesDao;
	}

	public PaseDeEntradaReportDao getPaseDeEntradaReportDao()
	{
		return paseDeEntradaReportDao;
	}

	public void setPaseDeEntradaReportDao(PaseDeEntradaReportDao paseDeEntradaReportDao)
	{
		this.paseDeEntradaReportDao = paseDeEntradaReportDao;
	}

}
