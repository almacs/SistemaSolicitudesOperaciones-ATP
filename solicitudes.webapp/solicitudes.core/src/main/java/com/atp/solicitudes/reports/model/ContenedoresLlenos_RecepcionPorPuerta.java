package com.atp.solicitudes.reports.model;

import java.util.Date;

public class ContenedoresLlenos_RecepcionPorPuerta
{
	private String contenedor;
	private String tipo;
	private Date fechaDeIngreso;
	private String estatus;

	public String getContenedor()
	{
		return contenedor;
	}

	public void setContenedor(String contenedor)
	{
		this.contenedor = contenedor;
	}

	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public Date getFechaDeIngreso()
	{
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(Date fechadeIngreso)
	{
		this.fechaDeIngreso = fechadeIngreso;
	}

	public String getEstatus()
	{
		return estatus;
	}

	public void setEstatus(String estatus)
	{
		this.estatus = estatus;
	}
}
