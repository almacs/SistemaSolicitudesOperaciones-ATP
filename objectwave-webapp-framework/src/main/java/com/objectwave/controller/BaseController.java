/**
 * (c) 2013 Copyright - Deluxe Corporation - All Rights Reserved
 * @version $Id: BaseController.java 40223 2013-07-18 18:48:39Z fdeutsch@objectwave.com $;
 */
package com.objectwave.controller;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.objectwave.dao.utils.DaoOrder;
import com.objectwave.dao.utils.DaoQuery;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.session.SessionModelImpl;
import com.objectwave.session.SessionModel;
import com.objectwave.utils.AppContextProvider;
import com.objectwave.utils.ObjectWithIdResolver;
import com.objectwave.webservice.model.ServerResponse;

/**
 * This base class contains "help" methods commonly used on the controllers
 * 
 * @author  Fernando Deutsch - fdeutsch@objectwave.com
 * 			Jesus Juarez - jesus.juarez@objectwave.com
 * @version 1.0;
 * 
 */
public class BaseController extends AppContextProvider
{
	private static final String RECORDS_TABLE_PARAM = "records";
	private static final String TOTAL_TABLE_PARAM = "total";
	protected static final String ROWS_PARAMETER = "rows";
	protected static final String PAGE_PARAMETER = "page";
	protected static final String CALLBACK_FUNCTION_NAME_PARAMETER = "_callbackFunctionName";

	/**
	 * Field logger.
	 */
	protected static Logger logger = LoggerFactory.getLogger(BaseController.class);

	public Boolean hasAuthorization(String authorizationName)
	{
    	@SuppressWarnings("unchecked")
		Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
    	
    	Boolean authFound = false;

    	for (SimpleGrantedAuthority eachAuth : authorities)
    	{
    		if (eachAuth.getAuthority().equals(authorizationName))
    		{
    			authFound = true;
    			break;
    		}
    	}
    	
    	return authFound;
	}

	/**
	 * Method setModelSession
	 * 
	 * Tool method implemented by subclasses so each controller can assign their context to the HttpSession object
	 *
	 * @param session the session
	 * @param model the model
	 */
	public void setModelSession(HttpSession session, Map<String, Object> model)
	{
		SessionModel obj = getSessionModel(session);
		model.put(SessionModelImpl.SLOT_NAME, obj);
	}
 
	public SessionModel getSessionModel(HttpSession session)
	{
		return (SessionModel) session.getAttribute(SessionModel.SLOT_NAME);
	}

	/**
	 * Method getMessageSource.
	 * 
	 * Gets the message source -> get the MessageSource object from the application context.
	 * MessageSource is a bean associated to a language properties file 
	 *
	 * @return the message source
	 * @see org.springframework.context.MessageSource
	 */
	public MessageSource getMessageSource()
	{
		return (MessageSource) getBean ("messageSource");
	}

	/**
	 * Method getMessageFromResource.
	 * 
	 * Gets the message from resource -> gets a String resource from the messageCode value
	 *
	 * @param messageCode the message code
	 * @return the String message from resource
	 */
	public String getMessageFromResource(String messageCode)
	{
		return getMessageFromResource(messageCode, null);
	}

	/**
	 * Method getMessageFromResource.
	 * 
	 * Gets the message from resource -> gets a String resource from the messageCode value with Object params
	 * to be used to replace message parts
	 *
	 * @param messageCode the message code
	 * @param Object collection used to replace message parts
	 * @return the message from resource
	 */
	public String getMessageFromResource(String messageCode, Object[] params)
	{
		return getMessageSource().getMessage(messageCode, params, "?" + messageCode + "?", null);
	}

	/**
	 * Method populateModelForIFrame.
	 * 
	 * Helper method to update a HTML iframe with information on what Javascript function to execute with the model as parameters
	 *   
	 * @param functionName String
	 * @param object Object
	 * @param model Map<String,Object>
	 * @throws Exception
	 */
	public void populateModelForIFrame(String functionName, Object object, Map<String,Object> model) throws Exception
    {
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = "";

        jsonStr = mapper.writeValueAsString(object);

        model.put("functionName", functionName);
        model.put("parameter", jsonStr);
    }
	
	public String getCallbackFunctionNameFrom(HttpServletRequest request)
	{
		return request.getParameter(CALLBACK_FUNCTION_NAME_PARAMETER);
	}
	
	/**
	 * Method getQuotedStringOrNull.
	 * 
	 * Helper method to assign values to a view model (*.jsp) file
	 * 
	 * @param str String
	 * @return String
	 */
	protected String getQuotedStringOrNull(String str)
	{
		return str == null ? "null" : "\"" + str + "\"";
	}

	/**
	 * Method getValueOrNull.
	 * 
	 * Helper method to assign values to a view model (*.jsp) file
	 * 
	 * @param str Object
	 * @return String
	 */
	protected String getValueOrNull(Object str)
	{
		return str == null ? "null" : str.toString();
	}

	/**
	 * Method getValueOrNull.
	 * 
	 * Helper method to assign values to a view model (*.jsp) file
	 * 
	 * @param str String
	 * @return String
	 */
	protected String getValueOrNull(String str)
	{
		return str == null || str.length() == 0 ? "null" : str;
	}

	/**
	 * Method getValueOrEmptyObject.
	 * 
	 * Helper method to assign values to a view model (*.jsp) file
	 * 
	 * @param obj JsonNode
	 * @return String
	 */
	protected String getValueOrEmptyObject(JsonNode obj)
	{
		return obj == null ? "{}" : obj.toString();
	}

	/**
	 * Method getValueOrEmptyObject.
	 * 
	 * Helper method to assign values to a view model (*.jsp) file
	 * 
	 * @param str String
	 * @return String
	 */
	protected String getValueOrEmptyObject(String str)
	{
		return str == null ? "{}" : str;
	}
	
	/*
	 * jqGrid Table support
	 */
	protected DaoOrder getTableOrder(HttpServletRequest request)
	{
		// map for order properties
		DaoOrder order = new DaoOrder();	

		// request parameters that defines the order
		String name = request.getParameter("sidx");
		String value = request.getParameter("sord");

		// bail out if no sidx parameter exists
		if (name == null)
			return order;

		if (name.length() == 0)		
			order.sort("id", DaoOrder.DESC);
		else
			order.sort(name, value);

		return order;
	}
	
	protected void addObjectParameterToQuery(DaoQuery queryMap, JsonNode paramsNode, String parameterName, String pathName, ObjectWithIdResolver resolver)
	{
		if (!paramsNode.has(parameterName))
			return;

		String paramValue = paramsNode.get(parameterName).asText();
		
		if (paramValue.length() > 0)
			queryMap.filter(pathName, resolver.getWithId(Integer.parseInt(paramValue)));
	}

	protected void addStringParameterToQuery(DaoQuery queryMap, JsonNode paramsNode, String parameterName, String pathName)
	{
		if (!paramsNode.has(parameterName))
			return;

		String paramValue = paramsNode.get(parameterName).asText();

		if (paramValue.length() > 0)
			queryMap.filter(pathName, paramValue);
	}

	protected void addIntegerParameterToQuery(DaoQuery queryMap, JsonNode paramsNode, String parameterName, String pathName)
	{
		if (!paramsNode.has(parameterName))
			return;
		
		String paramValue = paramsNode.get(parameterName).asText();

		if (paramValue.length() > 0)
			queryMap.filter(pathName, Integer.parseInt(paramValue));
	}

	protected final ObjectNode getTableMainNode(@SuppressWarnings("rawtypes") DaoResult result)
	{
		// create a JSON object
		ObjectNode object = new ObjectNode(JsonNodeFactory.instance);

		// set info properties
		object.put(PAGE_PARAMETER, result.getPageNumber());
		object.put(RECORDS_TABLE_PARAM, result.getTotalRows());
		object.put(TOTAL_TABLE_PARAM, getTotalPages(result.getNumberOfRows(), result.getTotalRows()));

		return object;
	}

	protected final ObjectNode getTableMainNode(Integer pageNumber, int records, int pageSize, long totalRows)
	{
		// create a JSON object
		ObjectNode object = new ObjectNode(JsonNodeFactory.instance);

		// set default empty properties
		object.put(PAGE_PARAMETER, 0);
		object.put(TOTAL_TABLE_PARAM, 0);
		object.put(RECORDS_TABLE_PARAM, 0);

		// set info properties
		object.put(PAGE_PARAMETER, pageNumber);
		object.put(RECORDS_TABLE_PARAM, totalRows);
		object.put(TOTAL_TABLE_PARAM, getTotalPages(pageSize, totalRows));
		
		return object;
	}
	
	protected final void injectTablePaginationParameters(DaoQuery query, HttpServletRequest request)
	{
		// request parameters that defines the page and number of rows to get
		Integer pageNumber = Integer.parseInt(request.getParameter(PAGE_PARAMETER));
		Integer numberOfRows = Integer.parseInt(request.getParameter(ROWS_PARAMETER));

		query.setPageNumber(pageNumber);
		query.setNumberOfRows(numberOfRows);
	}
	
	private int getTotalPages(int pageSize, long totalRows)
	{
		//int totalPages = (int) Math.ceil(totalRows / pageSize) + 1; // this does not work, try 20 elements, with a 10 page size

		if (pageSize == 0)
			return 0;

		int totalPages = (int) (totalRows + pageSize - 1) / pageSize;

		return totalPages;
	}

	// returns a String message if a validation fails for the Object argument
	// The object would contain validation constrains annotations
	public String getValidationMessageFromObject(Object obj)
	{
		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();  

		Set<ConstraintViolation<Object>> errors;

		errors = validator.validate(obj);
		
		if (errors.size() == 0)
			return null;

		@SuppressWarnings("rawtypes")
		ConstraintViolation cons = errors.toArray(new ConstraintViolation[0])[0];
		
		String message = cons.getPropertyPath() + " " + cons.getMessage();

		return message;
	}

	// returns a String message if a validation fails for the Object argument
	// The object would contain validation constrains annotations
	public String getValidationMessageFrom(Object obj)
	{
		// get the validator bean
		LocalValidatorFactoryBean val = (LocalValidatorFactoryBean) getBean("validator");
		
		// bind the object name with the object
		BindException errors = new BindException(obj, obj.getClass().getSimpleName());

		// run the validator
		val.validate(obj, errors);
		
		// get the result
		BindingResult res = errors.getBindingResult();

		// if errors found, return the first error message code 
		if (res.hasErrors())
		{
			ObjectError err = res.getAllErrors().get(0);
			return getMessageFromResource(err.getCodes()[0]);
		}

		// no validation errors
		return null;
	}
	
	/*
	 * returns an instance of a ServerResponse set as error with the message specified
	 */
	protected ServerResponse createServerResponseWithError(String msg)
	{
		ServerResponse resp = new ServerResponse();

		resp.setError(true);
		resp.setMessage(msg);
		
		return resp;
	}
}
