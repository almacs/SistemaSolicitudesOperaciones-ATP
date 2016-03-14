package com.atp.solicitudes.reports.dao;

import com.atp.solicitudes.reports.model.ContenedoresLlenos_UltimoDesembarque;
import com.objectwave.dao.utils.DaoResult;

public interface ContenedoresLlenos_UltimoDesembarqueDao 
{
	DaoResult<ContenedoresLlenos_UltimoDesembarque> getWithDigitoVerificador(String digitoVerificador) throws Exception;
}
