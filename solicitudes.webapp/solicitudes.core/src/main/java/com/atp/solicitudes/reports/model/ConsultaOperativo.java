package com.atp.solicitudes.reports.model;

import java.util.Date;

public class ConsultaOperativo
{
	private String contenedor;
	private String buqueViaje;
	private Date fechaOperativo;
	private String estatus;
	private Date fechaLiberado;

	public String getContenedor()
	{
		return contenedor;
	}

	public void setContenedor(String contenedor)
	{
		this.contenedor = contenedor;
	}

	public String getBuqueViaje()
	{
		return buqueViaje;
	}

	public void setBuqueViaje(String buqueViaje)
	{
		this.buqueViaje = buqueViaje;
	}

	public Date getFechaOperativo()
	{
		return fechaOperativo;
	}

	public void setFechaOperativo(Date fechaOperativo)
	{
		this.fechaOperativo = fechaOperativo;
	}

	public String getEstatus()
	{
		return estatus;
	}

	public void setEstatus(String estatus)
	{
		this.estatus = estatus;
	}

	public Date getFechaLiberado()
	{
		return fechaLiberado;
	}

	public void setFechaLiberado(Date fechaLiberado)
	{
		this.fechaLiberado = fechaLiberado;
	}

}
