package com.objectwave.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.objectwave.utils.StreamUtils;


@Entity
@Table(name = "generic_blob")
public class GenericBlob implements Serializable
{
	private static final long serialVersionUID = 1L;

	public static final Integer BUFFER_SIZE = 8192;
	public static final int TYPE_LENGTH = 100;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;

	@Column(name = "type", nullable = true, length=TYPE_LENGTH)
	String type;

	//@Column(name = "data", nullable = false, columnDefinition="longBlob")
	@Column(name = "data", nullable = false, columnDefinition="image")
	private byte[] data;

	public InputStream getInputStream() throws Exception
	{
		return StreamUtils.inputStreamFromBytes(getData());
	}

	public File getDataAsFile() throws Exception
	{
		File blobFile = File.createTempFile("blob", ".bin");

		FileOutputStream fileStream = null;
		InputStream inStream = null;
		
		try
		{
			fileStream = new FileOutputStream(blobFile);
			inStream = getInputStream();

			int length;
			byte[] buffer = new byte[BUFFER_SIZE];
	
			while ((length = inStream.read(buffer)) != -1)
			{
				fileStream.write(buffer, 0, length);
				fileStream.flush();
			}
		}
		finally
		{
			if (inStream != null) inStream.close();
			if (fileStream != null) fileStream.close();
		}

		return blobFile;
	}

	public boolean equals(Object anObject)
	{
		if (anObject == null)
			return false;

		if (this == anObject)
			return true;

		GenericBlob realObject = (GenericBlob) anObject;

		return this.getId().equals(realObject.getId());
	}

	public int hashCode()
	{
		return getId().intValue();
	}

	public byte[] getData()
	{
		return data;
	}

	public void setData(byte[] data)
	{
		this.data = data;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
}
