package com.atp.solicitudes.reports.model;

import java.util.Date;

public class ArrivalTime
{
	private String paseDeEntrada;
	private String contenedor;
	private Date llegadaAlCentroRegulador;
	private Date horaEntradaTerminal;

	public String getPaseDeEntrada()
	{
		return paseDeEntrada;
	}

	public void setPaseDeEntrada(String paseDeEntrada)
	{
		this.paseDeEntrada = paseDeEntrada;
	}

	public String getContenedor()
	{
		return contenedor;
	}

	public void setContenedor(String contenedor)
	{
		this.contenedor = contenedor;
	}

	public Date getLlegadaAlCentroRegulador()
	{
		return llegadaAlCentroRegulador;
	}

	public void setLlegadaAlCentroRegulador(Date llegadaAlCentroRegulador)
	{
		this.llegadaAlCentroRegulador = llegadaAlCentroRegulador;
	}

	public Date getHoraEntradaTerminal()
	{
		return horaEntradaTerminal;
	}

	public void setHoraEntradaTerminal(Date horaEntradaTerminal)
	{
		this.horaEntradaTerminal = horaEntradaTerminal;
	}

}
