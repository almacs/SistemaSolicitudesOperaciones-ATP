package com.objectwave.mail;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.velocity.VelocityEngineUtils;

public class MailDeliverer
{
	protected static Logger logger = LoggerFactory.getLogger(MailDeliverer.class);

	public static final String BEAN_NAME = "MailDeliverer";

	private JavaMailSender mailSender;
	private VelocityEngine velocityEngine;
	
	private Integer maxConcurrentMessageSend = 4;

	ExecutorService exeService = null;

	public void initialize()
	{
		exeService = Executors.newFixedThreadPool(getMaxConcurrentMessageSend());
	}

	public void release()
	{
		exeService.shutdownNow();
	}

	public void sendMailMessage(final MimeMessage msg)
	{
		Runnable runnable = new Runnable()
		{
			public void run()
			{
				privateSendMailMessage(msg);
			}
		};
		
		exeService.execute(runnable);
	}

	private void privateSendMailMessage(MimeMessage msg)
	{
		try
		{
			this.mailSender.send(msg);
		}
		catch (MailException ex)
		{
			logger.error("Error while sending mail", ex);
		}
	}

	public MimeMessageHelper prepareMailWithParameters(Map<String,String> mailParams, Map<String,Object> modelParams, String templateName, Boolean multipart) throws MessagingException
	{
		MimeMessage msg = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg, multipart);

		try
		{
			helper.setFrom(mailParams.get("from"));
			helper.setSubject(mailParams.get("subject"));
			helper.setTo(mailParams.get("to"));
	
	        String text = VelocityEngineUtils.mergeTemplateIntoString(
	           velocityEngine,
	           templateName, modelParams);
	
	        helper.setText(text, true);
		}
		catch (Exception e)
		{
			logger.error("error while building email");
		}

		return helper;
	}
	
	public void setMailSender(JavaMailSender mailSender)
	{
		this.mailSender = mailSender;
	}

	public void setVelocityEngine(VelocityEngine velocityEngine)
	{
		this.velocityEngine = velocityEngine;
	}

	public Integer getMaxConcurrentMessageSend()
	{
		return maxConcurrentMessageSend;
	}

	public void setMaxConcurrentMessageSend(Integer maxConcurrentMessageSend)
	{
		this.maxConcurrentMessageSend = maxConcurrentMessageSend;
	}
}
