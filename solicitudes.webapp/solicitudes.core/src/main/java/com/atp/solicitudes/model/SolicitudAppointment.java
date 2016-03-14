package com.atp.solicitudes.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ObjectNode;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.objectwave.exception.DomainModelException;
import com.objectwave.logger.ActivityLogAppender;
import com.objectwave.utils.JSONUtils;

@Entity
@Table(name="solicitud_appointment")
public class SolicitudAppointment implements Serializable, ActivityLogAppender
{
	private static final long serialVersionUID	=  1L;
	
	public static final int NBR_LENGTH 	= 20;
	public static final int ID_AGENT_LENGTH =20;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;
	
	@Column(name = "date_created", nullable = false)
	private Date dateCreated; 

	@Column(name = "date_updated", nullable = false)
	private Date dateUpdated; 

	@Column(name = "definition", nullable = false, columnDefinition = "text")
	private String definition; 

	@Column(name = "appointment_nbr", nullable = false, length = NBR_LENGTH)
	private String appointmentNbr;
	
	@Column(name = "cancellation_id", nullable = false)
	private CancellationMotiveEnum cancellationMotive; 

	@ManyToOne(fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SELECT)
	@JoinColumn(name = "solicitud_id", nullable = false)
	private Solicitud solicitud;
	
	@Column(name= "status", nullable = true)
	private SolicitudAppointmentStatusEnum status;

	public SolicitudAppointment()
	{
		setStatus(SolicitudAppointmentStatusEnum.CREATED);
	}

	public void appendToActivityLog(StringBuilder builder)
	{
		builder.append("id=");
		builder.append(getId());
		builder.append(",nbr=");
		builder.append(getAppointmentNbr());
		builder.append(",status=");
		builder.append(getStatus().getName());
		builder.append(",sol=");
		builder.append(getSolicitud().getFolio());
	}
	
	public Boolean canBeEdited()
	{
		return SolicitudAppointmentStatusEnum.CREATED.equals(getStatus());
	}

	public JsonNode updateDefinition() throws Exception
	{
		ObjectNode node = (ObjectNode) JSONUtils.getJSONFromString(getDefinition());
		
		node.put("appointmentId", getId());
		node.put("appointmentNbr", getAppointmentNbr());
		node.put("status", getStatus().getName());
		
		setDefinition(node.toString());
		
		return node;
	}

	public boolean equals(Object anObject)
	{
		if (anObject == null)
			return false;

		if (this == anObject)
			return true;

		if (!(anObject instanceof SolicitudAppointment))
			return false;

		SolicitudAppointment realObject = (SolicitudAppointment) anObject;

		return this.getId().equals(realObject.getId());
	}

	public int hashCode()
	{
		return getId();
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getAppointmentNbr()
	{
		return appointmentNbr;
	}

	public void setAppointmentNbr(String appointmentNbr)
	{
		this.appointmentNbr = appointmentNbr;
	}

	public Date getDateCreated()
	{
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated)
	{
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated()
	{
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated)
	{
		this.dateUpdated = dateUpdated;
	}

	public String getDefinition()
	{
		return definition;
	}

	public void setDefinition(String definition)
	{
		this.definition = definition;
	}

	public Solicitud getSolicitud()
	{
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud)
	{
		this.solicitud = solicitud;
	}

	public SolicitudAppointmentStatusEnum getStatus()
	{
		return status;
	}

	public void setStatus(SolicitudAppointmentStatusEnum status)
	{
		this.status = status;
	}
	
	public CancellationMotiveEnum getCancellationMotive()
	{
		return cancellationMotive;
	}

	public void setCancellationMotive(CancellationMotiveEnum cancellationMotive)
	{
		this.cancellationMotive = cancellationMotive;
	}

	public boolean canBeCanceledByStatus()
	{
		return SolicitudAppointmentStatusEnum.CREATED.equals(status);
	}
	
	public void fillFromCancel(JsonNode node, Map<String,Object> context) throws DomainModelException, Exception
	{

		setCancellationMotive(CancellationMotiveEnum.withId(node.get("cancelSolicitudId").asInt()));

	}
}
