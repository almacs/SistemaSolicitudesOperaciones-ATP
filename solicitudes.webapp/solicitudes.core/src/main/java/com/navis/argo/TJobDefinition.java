//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Job Definition Rule
 * 
 * <p>Clase Java para tJobDefinition complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tJobDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reprocess" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="reprocess-count" type="{http://www.w3.org/2001/XMLSchema}long" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="frequency" type="{http://www.navis.com/argo}tJobFrequency" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="execution-node" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hours" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="internal-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-at-last-day-of-months" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-clustered" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-on-closest-workday" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-on-last-defined-weekday-of-month" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-start-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="life-end-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="minutes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="days-of-month" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="week-days" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="expression" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repeat-interval-min" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="repeat-interval-hour" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="repeat-interval-day" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="repeat-count" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="is-on-defined-weekday-occurance-of-month" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="err-prefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="err-msg-receiver-addr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msg-prefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msg-subject" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msg-receiver-addr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="report-user-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="report-language" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="job-class" type="{http://www.navis.com/argo}tEdiJobClass" />
 *       &lt;attribute name="session" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mailbox" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tJobDefinition", propOrder = {
    "reprocess"
})
@XmlSeeAlso({
    TEdiJobDefinitionRule.class,
    TReportingJobDefinition.class
})
public class TJobDefinition {

    protected TJobDefinition.Reprocess reprocess;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "frequency")
    protected TJobFrequency frequency;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "execution-node")
    protected String executionNode;
    @XmlAttribute(name = "hours")
    protected String hours;
    @XmlAttribute(name = "internal-name")
    protected String internalName;
    @XmlAttribute(name = "is-at-last-day-of-months")
    protected String isAtLastDayOfMonths;
    @XmlAttribute(name = "is-clustered")
    protected String isClustered;
    @XmlAttribute(name = "is-on-closest-workday")
    protected String isOnClosestWorkday;
    @XmlAttribute(name = "is-on-last-defined-weekday-of-month")
    protected String isOnLastDefinedWeekdayOfMonth;
    @XmlAttribute(name = "life-start-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lifeStartDate;
    @XmlAttribute(name = "life-end-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lifeEndDate;
    @XmlAttribute(name = "minutes")
    protected String minutes;
    @XmlAttribute(name = "days-of-month")
    protected String daysOfMonth;
    @XmlAttribute(name = "week-days")
    protected String weekDays;
    @XmlAttribute(name = "expression")
    protected String expression;
    @XmlAttribute(name = "repeat-interval-min")
    protected Long repeatIntervalMin;
    @XmlAttribute(name = "repeat-interval-hour")
    protected Long repeatIntervalHour;
    @XmlAttribute(name = "repeat-interval-day")
    protected Long repeatIntervalDay;
    @XmlAttribute(name = "repeat-count")
    protected Long repeatCount;
    @XmlAttribute(name = "is-on-defined-weekday-occurance-of-month")
    protected Long isOnDefinedWeekdayOccuranceOfMonth;
    @XmlAttribute(name = "err-prefix")
    protected String errPrefix;
    @XmlAttribute(name = "err-msg-receiver-addr")
    protected String errMsgReceiverAddr;
    @XmlAttribute(name = "msg-prefix")
    protected String msgPrefix;
    @XmlAttribute(name = "msg-subject")
    protected String msgSubject;
    @XmlAttribute(name = "msg-receiver-addr")
    protected String msgReceiverAddr;
    @XmlAttribute(name = "report-user-id")
    protected String reportUserId;
    @XmlAttribute(name = "report-language")
    protected String reportLanguage;
    @XmlAttribute(name = "job-class")
    protected TEdiJobClass jobClass;
    @XmlAttribute(name = "session")
    protected String session;
    @XmlAttribute(name = "mailbox")
    protected String mailbox;

    /**
     * Obtiene el valor de la propiedad reprocess.
     * 
     * @return
     *     possible object is
     *     {@link TJobDefinition.Reprocess }
     *     
     */
    public TJobDefinition.Reprocess getReprocess() {
        return reprocess;
    }

    /**
     * Define el valor de la propiedad reprocess.
     * 
     * @param value
     *     allowed object is
     *     {@link TJobDefinition.Reprocess }
     *     
     */
    public void setReprocess(TJobDefinition.Reprocess value) {
        this.reprocess = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad frequency.
     * 
     * @return
     *     possible object is
     *     {@link TJobFrequency }
     *     
     */
    public TJobFrequency getFrequency() {
        return frequency;
    }

    /**
     * Define el valor de la propiedad frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link TJobFrequency }
     *     
     */
    public void setFrequency(TJobFrequency value) {
        this.frequency = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad executionNode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionNode() {
        return executionNode;
    }

    /**
     * Define el valor de la propiedad executionNode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionNode(String value) {
        this.executionNode = value;
    }

    /**
     * Obtiene el valor de la propiedad hours.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHours() {
        return hours;
    }

    /**
     * Define el valor de la propiedad hours.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHours(String value) {
        this.hours = value;
    }

    /**
     * Obtiene el valor de la propiedad internalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalName() {
        return internalName;
    }

    /**
     * Define el valor de la propiedad internalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalName(String value) {
        this.internalName = value;
    }

    /**
     * Obtiene el valor de la propiedad isAtLastDayOfMonths.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAtLastDayOfMonths() {
        return isAtLastDayOfMonths;
    }

    /**
     * Define el valor de la propiedad isAtLastDayOfMonths.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAtLastDayOfMonths(String value) {
        this.isAtLastDayOfMonths = value;
    }

    /**
     * Obtiene el valor de la propiedad isClustered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsClustered() {
        return isClustered;
    }

    /**
     * Define el valor de la propiedad isClustered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsClustered(String value) {
        this.isClustered = value;
    }

    /**
     * Obtiene el valor de la propiedad isOnClosestWorkday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOnClosestWorkday() {
        return isOnClosestWorkday;
    }

    /**
     * Define el valor de la propiedad isOnClosestWorkday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOnClosestWorkday(String value) {
        this.isOnClosestWorkday = value;
    }

    /**
     * Obtiene el valor de la propiedad isOnLastDefinedWeekdayOfMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOnLastDefinedWeekdayOfMonth() {
        return isOnLastDefinedWeekdayOfMonth;
    }

    /**
     * Define el valor de la propiedad isOnLastDefinedWeekdayOfMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOnLastDefinedWeekdayOfMonth(String value) {
        this.isOnLastDefinedWeekdayOfMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLifeStartDate() {
        return lifeStartDate;
    }

    /**
     * Define el valor de la propiedad lifeStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLifeStartDate(XMLGregorianCalendar value) {
        this.lifeStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLifeEndDate() {
        return lifeEndDate;
    }

    /**
     * Define el valor de la propiedad lifeEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLifeEndDate(XMLGregorianCalendar value) {
        this.lifeEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad minutes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinutes() {
        return minutes;
    }

    /**
     * Define el valor de la propiedad minutes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinutes(String value) {
        this.minutes = value;
    }

    /**
     * Obtiene el valor de la propiedad daysOfMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysOfMonth() {
        return daysOfMonth;
    }

    /**
     * Define el valor de la propiedad daysOfMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysOfMonth(String value) {
        this.daysOfMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad weekDays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekDays() {
        return weekDays;
    }

    /**
     * Define el valor de la propiedad weekDays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekDays(String value) {
        this.weekDays = value;
    }

    /**
     * Obtiene el valor de la propiedad expression.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Define el valor de la propiedad expression.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Obtiene el valor de la propiedad repeatIntervalMin.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepeatIntervalMin() {
        return repeatIntervalMin;
    }

    /**
     * Define el valor de la propiedad repeatIntervalMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepeatIntervalMin(Long value) {
        this.repeatIntervalMin = value;
    }

    /**
     * Obtiene el valor de la propiedad repeatIntervalHour.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepeatIntervalHour() {
        return repeatIntervalHour;
    }

    /**
     * Define el valor de la propiedad repeatIntervalHour.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepeatIntervalHour(Long value) {
        this.repeatIntervalHour = value;
    }

    /**
     * Obtiene el valor de la propiedad repeatIntervalDay.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepeatIntervalDay() {
        return repeatIntervalDay;
    }

    /**
     * Define el valor de la propiedad repeatIntervalDay.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepeatIntervalDay(Long value) {
        this.repeatIntervalDay = value;
    }

    /**
     * Obtiene el valor de la propiedad repeatCount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepeatCount() {
        return repeatCount;
    }

    /**
     * Define el valor de la propiedad repeatCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepeatCount(Long value) {
        this.repeatCount = value;
    }

    /**
     * Obtiene el valor de la propiedad isOnDefinedWeekdayOccuranceOfMonth.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsOnDefinedWeekdayOccuranceOfMonth() {
        return isOnDefinedWeekdayOccuranceOfMonth;
    }

    /**
     * Define el valor de la propiedad isOnDefinedWeekdayOccuranceOfMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsOnDefinedWeekdayOccuranceOfMonth(Long value) {
        this.isOnDefinedWeekdayOccuranceOfMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad errPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrPrefix() {
        return errPrefix;
    }

    /**
     * Define el valor de la propiedad errPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrPrefix(String value) {
        this.errPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad errMsgReceiverAddr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsgReceiverAddr() {
        return errMsgReceiverAddr;
    }

    /**
     * Define el valor de la propiedad errMsgReceiverAddr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsgReceiverAddr(String value) {
        this.errMsgReceiverAddr = value;
    }

    /**
     * Obtiene el valor de la propiedad msgPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgPrefix() {
        return msgPrefix;
    }

    /**
     * Define el valor de la propiedad msgPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgPrefix(String value) {
        this.msgPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad msgSubject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSubject() {
        return msgSubject;
    }

    /**
     * Define el valor de la propiedad msgSubject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSubject(String value) {
        this.msgSubject = value;
    }

    /**
     * Obtiene el valor de la propiedad msgReceiverAddr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgReceiverAddr() {
        return msgReceiverAddr;
    }

    /**
     * Define el valor de la propiedad msgReceiverAddr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgReceiverAddr(String value) {
        this.msgReceiverAddr = value;
    }

    /**
     * Obtiene el valor de la propiedad reportUserId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportUserId() {
        return reportUserId;
    }

    /**
     * Define el valor de la propiedad reportUserId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportUserId(String value) {
        this.reportUserId = value;
    }

    /**
     * Obtiene el valor de la propiedad reportLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportLanguage() {
        return reportLanguage;
    }

    /**
     * Define el valor de la propiedad reportLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportLanguage(String value) {
        this.reportLanguage = value;
    }

    /**
     * Obtiene el valor de la propiedad jobClass.
     * 
     * @return
     *     possible object is
     *     {@link TEdiJobClass }
     *     
     */
    public TEdiJobClass getJobClass() {
        return jobClass;
    }

    /**
     * Define el valor de la propiedad jobClass.
     * 
     * @param value
     *     allowed object is
     *     {@link TEdiJobClass }
     *     
     */
    public void setJobClass(TEdiJobClass value) {
        this.jobClass = value;
    }

    /**
     * Obtiene el valor de la propiedad session.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSession() {
        return session;
    }

    /**
     * Define el valor de la propiedad session.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSession(String value) {
        this.session = value;
    }

    /**
     * Obtiene el valor de la propiedad mailbox.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * Define el valor de la propiedad mailbox.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailbox(String value) {
        this.mailbox = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="reprocess-count" type="{http://www.w3.org/2001/XMLSchema}long" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Reprocess {

        @XmlAttribute(name = "reprocess-count")
        protected Long reprocessCount;

        /**
         * Obtiene el valor de la propiedad reprocessCount.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getReprocessCount() {
            return reprocessCount;
        }

        /**
         * Define el valor de la propiedad reprocessCount.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setReprocessCount(Long value) {
            this.reprocessCount = value;
        }

    }

}
