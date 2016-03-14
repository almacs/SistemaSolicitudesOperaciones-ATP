package com.objectwave.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "system_property")
public class SystemProperty
{
	public static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss.S";

	private static SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT_PATTERN);

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;

	@Column(name = "name", nullable = true, length = 100)
	String name;

	@Column(name = "value", nullable = true, length = 1000)
	String value;

	public boolean equals(Object anObject)
	{
		if (anObject == null)
			return false;

		if (this == anObject)
			return true;

		SystemProperty realObject = (SystemProperty) anObject;

		return this.getId().equals(realObject.getId());
	}

	public int hashCode()
	{
		return getId();
	}

	public void setValue(Object obj)
	{
		setValue(obj.toString());
	}

	public void setValue(Boolean boolValue)
	{
		setValue(boolValue ? "1" : "0");
	}

	public void setValue(Date date)
	{
		// synch dateFormatter as its not thread safe
		synchronized(dateFormatter)
		{
			setValue(dateFormatter.format(date));
		}
	}

	public String getStringValue()
	{
		return getValue();
	}

	public Integer getIntegerValue()
	{
		Integer val = null;
		try { val = Integer.parseInt(getValue()); } catch (Exception e) { val = null; }
		return val;
	}

	public Float getFloatValue()
	{
		Float val = null;
		try { val = Float.parseFloat(getValue()); } catch (Exception e) { val = null; }
		return val;
	}

	public Double getDoubleValue()
	{
		Double val = null;
		try { val = Double.parseDouble(getValue()); } catch (Exception e) { val = null; }
		return val;
	}

	public Long getLongValue()
	{
		Long val = null;
		try { val = Long.parseLong(getValue()); } catch (Exception e) { val = null; }
		return val;
	}

	public Date getDateValue()
	{
		Date val = null;
		// synch dateFormatter as its not thread safe
		synchronized(dateFormatter)
		{
			try { val = dateFormatter.parse(getValue()); } catch (Exception e) { val = null; }
		}
		return val;
	}
	
	public Boolean getBooleanValue()
	{
		String val = getValue();
		
		return "true".equalsIgnoreCase(val) || "1".equalsIgnoreCase(val);
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String string)
	{
		this.value = string;
	}
}
