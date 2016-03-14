package com.objectwave.webservice;

import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.stream.StreamResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.objectwave.controller.BaseController;
import com.objectwave.dao.utils.DaoOrder;
import com.objectwave.dao.utils.DaoQuery;

@Controller
public class BaseService extends BaseController
{
	@Autowired
    @Qualifier(value="jaxbMarshaller")
    private Jaxb2Marshaller marshaller;

	/*
	 * returns the XML representation of the object argument
	 */
	protected String xmlResponse(Object object)
	{
		StringWriter out = new StringWriter(1024);
		marshaller.marshal(object, new StreamResult(out));
		
		return out.toString();
	}

	/*
	 * returns a String escaped to html code
	 */
	protected String htmlEscape(String aString)
	{
		return HtmlUtils.htmlEscape(aString);
	}

	/*
	 * injects sort orders from the sort parameter
	 * useful for RESTfull web services
	 */
	protected void injectSortOrders(DaoOrder order, HttpServletRequest request)
	{
		String sort = request.getParameter("sort");

		if (sort != null)
		{
			String[] fields = sort.split(",");
			
			int c = fields.length;
			for (int i = 0; i < c; i++)
			{
				String fieldName = fields[i];
				
				if (fieldName.charAt(0) == '-')
				{
					fieldName = fieldName.substring(1);
					order.sort(fieldName, DaoOrder.DESC);
				}
				else
					order.sort(fieldName, DaoOrder.ASC);
			}
		}
	}
	
	/*
	 * injects field filters from the a finite filter list
	 * useful for RESTfull web services
	 */
	protected void injectFilterQueries(String[] filters, DaoQuery query, HttpServletRequest request)
	{
		int c = filters.length;
		for (int i = 0; i < c; i++)
		{
			String filterName = filters[i];
			
			String paramValue = request.getParameter(filterName);
			
			if (paramValue != null)
				query.filter(filterName, paramValue);
		}
	}
	
	/*
	 * injects pagination (page, rows) parameters
	 * useful for RESTfull web services
	 */
	protected void injectPaginationParameters(DaoQuery query, HttpServletRequest request)
	{
		String val = request.getParameter("_page"); 
		if (val != null)
			query.setPageNumber(Integer.parseInt(val));

		val = request.getParameter("_rows"); 
		if (val != null)
			query.setNumberOfRows(Integer.parseInt(val));
	}
}
