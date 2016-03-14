package com.atp.solicitudes.reports.dao;

import com.atp.solicitudes.reports.model.ContenedoresLlenos_RecepcionPorPuerta;
import com.objectwave.dao.utils.DaoResult;

public interface ContenedoresLlenos_RecepcionPorPuertaDao
{
	DaoResult<ContenedoresLlenos_RecepcionPorPuerta> getWithDigitoVerificador(String digitoVerificador) throws Exception;
}
