package com.objectwave.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.Blob;

import org.apache.commons.codec.binary.Base64;

/**
 * Helper class with many useful simplified Stream operations
 * 
 */
public class StreamUtils
{
	/**
	 * Field BUFFER_SIZE.
	 */
	public static final Integer BUFFER_SIZE = 8192;

	/**
	 * Method createTemporaryFileFromInputStream.
	 * 
	 * Creates a temporary file with the contents from the InputStream
	 * 
	 * @param prefixName
	 *            String
	 * @param sufixName
	 *            String
	 * @param inputStream
	 *            InputStream
	 * @return File
	 * @throws Exception
	 */
	public static final File createTemporaryFileFromInputStream(String prefixName, String sufixName, InputStream inputStream)
			throws Exception
	{
		File tempFile = File.createTempFile(prefixName, sufixName);

		FileOutputStream outStream = new FileOutputStream(tempFile);

		try
		{
			copyStream(inputStream, outStream, BUFFER_SIZE);
		}
		finally
		{
			if (outStream != null)
				outStream.close();
		}

		return tempFile;
	}

	/**
	 * Method copyStream.
	 * 
	 * Copies the contents from the InputStream to the OutputStream
	 * 
	 * @param in
	 *            InputStream
	 * @param out
	 *            OutputStream
	 * @param bufferSize
	 *            Integer
	 * @throws Exception
	 */
	public static final void copyStream(InputStream in, OutputStream out, Integer bufferSize) throws Exception
	{
		int length = 0;
		byte[] buffer = new byte[bufferSize == null ? BUFFER_SIZE : bufferSize];

		while ((length = in.read(buffer)) != -1)
			out.write(buffer, 0, length);
	}

	/**
	 * Method inputStreamFromString.
	 * 
	 * Creates an InputStream from the contents of the String
	 * 
	 * @param string
	 *            String
	 * @return InputStream
	 * @throws Exception
	 */
	public static final InputStream inputStreamFromString(String string) throws Exception
	{
		return inputStreamFromBytes(string.getBytes());
	}

	/**
	 * Method inputStreamFromBytes.
	 * 
	 * Creates an InputStream from the contents of the byte array
	 * 
	 * @param string
	 *            String
	 * @return InputStream
	 * @throws Exception
	 */
	public static final InputStream inputStreamFromBytes(byte[] bytes) throws Exception
	{
		return new ByteArrayInputStream(bytes);
	}

	/**
	 * Method copyStringToStream.
	 * 
	 * Copies the String to the OutputStream
	 * 
	 * @param string
	 *            String
	 * @param out
	 *            OutputStream
	 * @param bufferSize
	 *            Integer
	 * @throws Exception
	 */
	public static final void copyStringToStream(String string, OutputStream out, Integer bufferSize) throws Exception
	{
		copyStream(inputStreamFromString(string), out, bufferSize);
	}

	/**
	 * Method getStringFromStream.
	 * 
	 * Returns a String from the contents of the InputStream
	 * 
	 * @param stream
	 *            InputStream
	 * @return String
	 * @throws Exception
	 */
	public static final String getStringFromStream(InputStream stream) throws Exception
	{
		char[] buffer = new char[8192];

		StringBuilder out = new StringBuilder();

		Reader in = new InputStreamReader(stream, "UTF-8");

		for (;;)
		{
			int rsz = in.read(buffer, 0, buffer.length);
			if (rsz < 0)
				break;
			out.append(buffer, 0, rsz);
		}

		in.close();

		return out.toString();
	}

	/**
	 * Method getStringBase64FromBlob.
	 * 
	 * Returns a Base64 String from a Java SQL Blob object
	 * 
	 * @param blobImage
	 *            Blob
	 * @return String
	 * @throws Exception
	 */
	public static final String getStringBase64FromBlob(Blob blobImage) throws Exception
	{
		byte[] encoded = Base64.encodeBase64(blobImage.getBytes(1, (int) blobImage.length()));

		return new String(encoded);
	}

	public static byte[] getBytes(InputStream input) throws Exception
	{
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		copyStream(input, result, BUFFER_SIZE);
		result.close();
		return result.toByteArray();
	}
}
