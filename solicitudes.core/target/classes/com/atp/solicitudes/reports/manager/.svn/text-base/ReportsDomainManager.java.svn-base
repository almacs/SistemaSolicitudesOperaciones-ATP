package com.atp.solicitudes.reports.manager;

import java.util.List;

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

public interface ReportsDomainManager
{
	String BEAN_NAME = "domainManager_reports";

	// Contenedores llenos ultimo desembarque
	DaoResult<ContenedoresLlenos_UltimoDesembarque> getContenedoresLlenos_UltimoDesembarque(String digitoVerificador) throws Exception;
	
	// Contenedores llenos ultimo embarque
	DaoResult<ContenedoresLlenos_UltimoEmbarque> getContenedoresLlenos_UltimoEmbarque(String digitoVerificador) throws Exception;
	
	// Contenedores llenos recepcion por puerta
	DaoResult<ContenedoresLlenos_RecepcionPorPuerta> getContenedoresLlenos_RecepcionPorPuerta(String digitoVerificador) throws Exception;
	
	// Contenedores llenos entrega por puerta
	DaoResult<ContenedoresLlenos_EntregaPorPuerta> getContenedoresLlenos_EntregaPorPuerta(String digitoVerificador) throws Exception;
	
	// Consulta Operativo Importacion y Exportacion
	DaoResult<ConsultaOperativo> getConsultaOperativoImportacion(String buqueViaje) throws Exception;
	DaoResult<ConsultaOperativo> getConsultaOperativoExportacion() throws Exception;
	DaoResult<BuqueViaje> getBuqueViajeForConsultaOperativo() throws Exception;
	
	// Consulta Booking
	DaoResult<ConsultaBooking> getConsultaBooking(String booking) throws Exception;
	
	// Consulta BL
	DaoResult<ConsultaBL> getConsultaBL(String bl) throws Exception;
	
	// Arrived Time
	DaoResult<ArrivalTimeLlegadaAlCentroRegulador> getArrivalTimeLlegadaAlCentroRegulador(String paseDeEntrada) throws Exception;
	DaoResult<ArrivalTimeContenedor> getArrivalTimeContenedor(String paseDeEntrada) throws Exception;	
	DaoResult<ArrivalTimeHoraEntradaTerminal> getArrivalTimeHoraEntradaTerminal(String paseDeEntrada) throws Exception;
	
	// Etas y Cierres de Buques
	DaoResult<Etas_CierresBuques> getConsultaEtasCierreBuques(String buqueViaje) throws Exception;
	DaoResult<BuqueViaje> getBuqueViajeForEtasCierresBuques() throws Exception;

	// PaseDeEntradaReport
	PaseDeEntradaReport getPaseDeEntradaReport(Integer paseDeEntrada) throws Exception;
	List <PaseDeEntradaReport> getPaseDeEntradaReportHazard (Integer hazard) throws Exception;
}
