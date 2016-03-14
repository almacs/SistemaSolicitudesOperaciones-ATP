//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para TruckVisitResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TruckVisitResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trucking-co" type="{http://www.navis.com/argo}TruckingCoType" minOccurs="0"/>
 *         &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
 *         &lt;element name="truck-stages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="truck-stage" type="{http://www.navis.com/argo}TruckStageType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="documents" type="{http://www.navis.com/argo}GateDocumentsType" minOccurs="0"/>
 *         &lt;element name="messages" type="{http://www.navis.com/argo}MessagesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tv-key" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="gos-tv-key" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="tracking-tag-id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="appointment-nbr" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="next-stage-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bat-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="next-exchange-area-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="out-bat-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scale-weight" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="exchange-lane-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-internal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="tvdtls-flex-string01" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tvdtls-flex-string02" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tvdtls-flex-string03" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tvdtls-flex-date01" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="entered" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="exited" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TruckVisitResponseType", propOrder = {
    "truckingCo",
    "driver",
    "truckStages",
    "documents",
    "messages"
})
@XmlSeeAlso({
    TruckVisitWithTransactionsResponseType.class
})
public class TruckVisitResponseType {

    @XmlElement(name = "trucking-co")
    protected TruckingCoType truckingCo;
    protected DriverType driver;
    @XmlElement(name = "truck-stages")
    protected TruckVisitResponseType.TruckStages truckStages;
    protected GateDocumentsType documents;
    protected List<MessagesType> messages;
    @XmlAttribute(name = "tv-key")
    protected Long tvKey;
    @XmlAttribute(name = "gos-tv-key")
    protected Long gosTvKey;
    @XmlAttribute(name = "tracking-tag-id")
    protected Long trackingTagId;
    @XmlAttribute(name = "appointment-nbr")
    protected Long appointmentNbr;
    @XmlAttribute(name = "next-stage-id")
    protected String nextStageId;
    @XmlAttribute(name = "bat-nbr")
    protected String batNbr;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "action")
    protected String action;
    @XmlAttribute(name = "gate-id")
    protected String gateId;
    @XmlAttribute(name = "next-exchange-area-id")
    protected String nextExchangeAreaId;
    @XmlAttribute(name = "out-bat-nbr")
    protected String outBatNbr;
    @XmlAttribute(name = "scale-weight")
    protected Double scaleWeight;
    @XmlAttribute(name = "exchange-lane-id")
    protected String exchangeLaneId;
    @XmlAttribute(name = "is-internal")
    protected Boolean isInternal;
    @XmlAttribute(name = "tvdtls-flex-string01")
    protected String tvdtlsFlexString01;
    @XmlAttribute(name = "tvdtls-flex-string02")
    protected String tvdtlsFlexString02;
    @XmlAttribute(name = "tvdtls-flex-string03")
    protected String tvdtlsFlexString03;
    @XmlAttribute(name = "tvdtls-flex-date01")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tvdtlsFlexDate01;
    @XmlAttribute(name = "entered")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entered;
    @XmlAttribute(name = "exited")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exited;

    /**
     * Obtiene el valor de la propiedad truckingCo.
     * 
     * @return
     *     possible object is
     *     {@link TruckingCoType }
     *     
     */
    public TruckingCoType getTruckingCo() {
        return truckingCo;
    }

    /**
     * Define el valor de la propiedad truckingCo.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckingCoType }
     *     
     */
    public void setTruckingCo(TruckingCoType value) {
        this.truckingCo = value;
    }

    /**
     * Obtiene el valor de la propiedad driver.
     * 
     * @return
     *     possible object is
     *     {@link DriverType }
     *     
     */
    public DriverType getDriver() {
        return driver;
    }

    /**
     * Define el valor de la propiedad driver.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverType }
     *     
     */
    public void setDriver(DriverType value) {
        this.driver = value;
    }

    /**
     * Obtiene el valor de la propiedad truckStages.
     * 
     * @return
     *     possible object is
     *     {@link TruckVisitResponseType.TruckStages }
     *     
     */
    public TruckVisitResponseType.TruckStages getTruckStages() {
        return truckStages;
    }

    /**
     * Define el valor de la propiedad truckStages.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckVisitResponseType.TruckStages }
     *     
     */
    public void setTruckStages(TruckVisitResponseType.TruckStages value) {
        this.truckStages = value;
    }

    /**
     * Obtiene el valor de la propiedad documents.
     * 
     * @return
     *     possible object is
     *     {@link GateDocumentsType }
     *     
     */
    public GateDocumentsType getDocuments() {
        return documents;
    }

    /**
     * Define el valor de la propiedad documents.
     * 
     * @param value
     *     allowed object is
     *     {@link GateDocumentsType }
     *     
     */
    public void setDocuments(GateDocumentsType value) {
        this.documents = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessagesType }
     * 
     * 
     */
    public List<MessagesType> getMessages() {
        if (messages == null) {
            messages = new ArrayList<MessagesType>();
        }
        return this.messages;
    }

    /**
     * Obtiene el valor de la propiedad tvKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTvKey() {
        return tvKey;
    }

    /**
     * Define el valor de la propiedad tvKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTvKey(Long value) {
        this.tvKey = value;
    }

    /**
     * Obtiene el valor de la propiedad gosTvKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGosTvKey() {
        return gosTvKey;
    }

    /**
     * Define el valor de la propiedad gosTvKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGosTvKey(Long value) {
        this.gosTvKey = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingTagId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrackingTagId() {
        return trackingTagId;
    }

    /**
     * Define el valor de la propiedad trackingTagId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrackingTagId(Long value) {
        this.trackingTagId = value;
    }

    /**
     * Obtiene el valor de la propiedad appointmentNbr.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAppointmentNbr() {
        return appointmentNbr;
    }

    /**
     * Define el valor de la propiedad appointmentNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAppointmentNbr(Long value) {
        this.appointmentNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad nextStageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextStageId() {
        return nextStageId;
    }

    /**
     * Define el valor de la propiedad nextStageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextStageId(String value) {
        this.nextStageId = value;
    }

    /**
     * Obtiene el valor de la propiedad batNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatNbr() {
        return batNbr;
    }

    /**
     * Define el valor de la propiedad batNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatNbr(String value) {
        this.batNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Define el valor de la propiedad action.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Obtiene el valor de la propiedad gateId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateId() {
        return gateId;
    }

    /**
     * Define el valor de la propiedad gateId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateId(String value) {
        this.gateId = value;
    }

    /**
     * Obtiene el valor de la propiedad nextExchangeAreaId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextExchangeAreaId() {
        return nextExchangeAreaId;
    }

    /**
     * Define el valor de la propiedad nextExchangeAreaId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextExchangeAreaId(String value) {
        this.nextExchangeAreaId = value;
    }

    /**
     * Obtiene el valor de la propiedad outBatNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBatNbr() {
        return outBatNbr;
    }

    /**
     * Define el valor de la propiedad outBatNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBatNbr(String value) {
        this.outBatNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad scaleWeight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScaleWeight() {
        return scaleWeight;
    }

    /**
     * Define el valor de la propiedad scaleWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScaleWeight(Double value) {
        this.scaleWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeLaneId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeLaneId() {
        return exchangeLaneId;
    }

    /**
     * Define el valor de la propiedad exchangeLaneId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeLaneId(String value) {
        this.exchangeLaneId = value;
    }

    /**
     * Obtiene el valor de la propiedad isInternal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInternal() {
        return isInternal;
    }

    /**
     * Define el valor de la propiedad isInternal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInternal(Boolean value) {
        this.isInternal = value;
    }

    /**
     * Obtiene el valor de la propiedad tvdtlsFlexString01.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTvdtlsFlexString01() {
        return tvdtlsFlexString01;
    }

    /**
     * Define el valor de la propiedad tvdtlsFlexString01.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTvdtlsFlexString01(String value) {
        this.tvdtlsFlexString01 = value;
    }

    /**
     * Obtiene el valor de la propiedad tvdtlsFlexString02.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTvdtlsFlexString02() {
        return tvdtlsFlexString02;
    }

    /**
     * Define el valor de la propiedad tvdtlsFlexString02.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTvdtlsFlexString02(String value) {
        this.tvdtlsFlexString02 = value;
    }

    /**
     * Obtiene el valor de la propiedad tvdtlsFlexString03.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTvdtlsFlexString03() {
        return tvdtlsFlexString03;
    }

    /**
     * Define el valor de la propiedad tvdtlsFlexString03.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTvdtlsFlexString03(String value) {
        this.tvdtlsFlexString03 = value;
    }

    /**
     * Obtiene el valor de la propiedad tvdtlsFlexDate01.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTvdtlsFlexDate01() {
        return tvdtlsFlexDate01;
    }

    /**
     * Define el valor de la propiedad tvdtlsFlexDate01.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTvdtlsFlexDate01(XMLGregorianCalendar value) {
        this.tvdtlsFlexDate01 = value;
    }

    /**
     * Obtiene el valor de la propiedad entered.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntered() {
        return entered;
    }

    /**
     * Define el valor de la propiedad entered.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntered(XMLGregorianCalendar value) {
        this.entered = value;
    }

    /**
     * Obtiene el valor de la propiedad exited.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExited() {
        return exited;
    }

    /**
     * Define el valor de la propiedad exited.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExited(XMLGregorianCalendar value) {
        this.exited = value;
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
     *       &lt;sequence>
     *         &lt;element name="truck-stage" type="{http://www.navis.com/argo}TruckStageType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckStage"
    })
    public static class TruckStages {

        @XmlElement(name = "truck-stage")
        protected List<TruckStageType> truckStage;

        /**
         * Gets the value of the truckStage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the truckStage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTruckStage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TruckStageType }
         * 
         * 
         */
        public List<TruckStageType> getTruckStage() {
            if (truckStage == null) {
                truckStage = new ArrayList<TruckStageType>();
            }
            return this.truckStage;
        }

    }

}
