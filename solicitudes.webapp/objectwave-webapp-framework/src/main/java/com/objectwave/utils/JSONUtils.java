/*
  (c) 2013 Copyright - Citlali Labs - All Rights Reserved
  $Id$;
*/
package com.objectwave.utils;

import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Helper class with various util methods related to converting JSON from/to Java objects
 */
public class JSONUtils
{
	/**
	 * Field logger.
	 */
	protected static Logger logger = LoggerFactory.getLogger(JSONUtils.class);

	/**
	 * Method getJSONFromString.
	 * 
	 * Return a JsonNode object from its json string representation
	 *
	 * @param jsonString the json string
	
	 * @return the jSON from string * @throws Exception
	 */
	public static final JsonNode getJSONFromString(String jsonString) throws Exception
	{
		JsonNode obj = null;

		if (jsonString == null || jsonString.length() == 0)
			return obj;

		ObjectMapper mapper = new ObjectMapper();
		obj = mapper.readTree(jsonString);
		
		return obj;
	}

	/**
	 * Method getObjectFromJSONString.
	 * 
	 * Returns an object, casted to a class from a json string
	 *
	 * @param jsonString the json string
	 * @param aClass the a class
	
	 * @return the object from json string * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static final Object getObjectFromJSONString(String jsonString, Class aClass) throws Exception
	{
		Object obj = null;

		if (jsonString == null || jsonString.length() == 0)
			return obj;

		ObjectMapper mapper = new ObjectMapper();
		obj = mapper.readValue(jsonString, aClass);
		
		return obj;
	}

	/**
	 * Method getMapFromJSON.
	 * 
	 * Returns a Map<String,String> from the properties of a JsonNode.
	 * Only first level of properties are applied to the Map object
	 * 
	 * @param node JsonNode
	 * @return Map<String,String>
	 */
	public static Map<String,String> getMapFromJSON(JsonNode node)
	{
		Map<String,String> map = new HashMap<String,String>();

		Iterator<String> fieldIterator = node.getFieldNames();

		while (fieldIterator.hasNext())
		{
			String key = fieldIterator.next();
			
			map.put(key, node.get(key).asText());
		}

		return map;
	}

	/**
	 * Method getJSONFromUrl.
	 * 
	 * Gets a JsonNode from the contents of the URL
	 * 
	 * @param urlString String
	 * @return JsonNode
	 * @throws Exception
	 */
	public static JsonNode getJSONFromUrl(String urlString) throws Exception
	{
		InputStream inputStream = null;
		JsonNode object = null;

		try
		{
			URL url = new URL(urlString);
			inputStream = url.openStream();
			
			ObjectMapper mapper = new ObjectMapper();
			object = mapper.readTree(inputStream);
		}
		finally
		{
			if (inputStream != null)
				inputStream.close();
		}

		return object;
	}

	/**
	 * Method getJSONFromObject.
	 * 
	 * Gets a JsonNode from the contents of the URL
	 * 
	 * @param Object object
	 * @return JsonNode
	 * @throws Exception
	 */
	public static JsonNode getJSONFromObject(Object object) throws Exception
	{
		InputStream inputStream = null;
		JsonNode jsonNode = null;

		try
		{
			ObjectMapper mapper = new ObjectMapper();
			jsonNode = mapper.valueToTree(object);
		}
		finally
		{
			if (inputStream != null)
				inputStream.close();
		}

		return jsonNode;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object getObjectFromJSON(JsonNode jsonNode, Class aClass) throws Exception
	{
		Object obj = null;

		ObjectMapper mapper = new ObjectMapper();
		obj = mapper.readValue(jsonNode, aClass);
		
		return obj;
	}
}
