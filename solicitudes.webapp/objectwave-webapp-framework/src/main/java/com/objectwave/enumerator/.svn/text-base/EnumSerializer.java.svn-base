package com.objectwave.enumerator;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class EnumSerializer extends JsonSerializer<BasicEnum>
{
	public EnumSerializer()
	{
		super();
	}

	public void serialize(BasicEnum value, JsonGenerator generator, SerializerProvider provider) throws IOException, JsonProcessingException
	{
		generator.writeStartObject();
		generator.writeFieldName("name");
		generator.writeString(value.getName());
		generator.writeFieldName("id");
		generator.writeNumber(value.getId());
		generator.writeEndObject();
	}
}
