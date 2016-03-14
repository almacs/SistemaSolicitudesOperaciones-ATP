//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A trainVisit is the contiguous block of time spent at the facility by
 *                 a train from arrival to departure
 *             
 * 
 * <p>Clase Java para tTrainVisit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTrainVisit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="est-move-count" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="bbk-discharge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="bbk-load" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="discharge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="load" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="inbound-railcar" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="visit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="in-seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="inspection-status" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *                       &lt;enumeration value="NOT_INSPECTED"/>
 *                       &lt;enumeration value="OK"/>
 *                       &lt;enumeration value="BAD"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="visit-nbr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="out-seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="template-type-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="railcar-owner-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="visible-in-sparcs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="trainvisit-inbound" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="trainvisit-outbound" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="discharge-point" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="railcar-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="railcar-state" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="facility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="modified-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="modified-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outbound-railcar" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="visit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="inspection-status" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *                       &lt;enumeration value="NOT_INSPECTED"/>
 *                       &lt;enumeration value="OK"/>
 *                       &lt;enumeration value="BAD"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="out-seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="visit-nbr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="in-seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="template-type-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="railcar-owner-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="visible-in-sparcs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="trainvisit-inbound" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="trainvisit-outbound" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="discharge-point" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="railcar-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="railcar-state" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="facility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="modified-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="modified-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ATA" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ATD" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ETA" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ETD" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="direction">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="IN"/>
 *             &lt;enumeration value="OUT"/>
 *             &lt;enumeration value="THRU"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="direction-description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="in-call-number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="is-dray-off" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="facility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="next-facility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="out-call-number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="rr-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="service-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="service-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time-begin-receive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-end-work" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-start-work" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="visit-phase">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *             &lt;enumeration value="CREATED"/>
 *             &lt;enumeration value="INBOUND"/>
 *             &lt;enumeration value="ARRIVED"/>
 *             &lt;enumeration value="WORKING"/>
 *             &lt;enumeration value="COMPLETE"/>
 *             &lt;enumeration value="DEPARTED"/>
 *             &lt;enumeration value="CLOSED"/>
 *             &lt;enumeration value="CANCELED"/>
 *             &lt;enumeration value="ARCHIVED"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="visit-phase-comment">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NONE"/>
 *             &lt;enumeration value="REQUEST_FOR_ARRIVAL"/>
 *             &lt;enumeration value="REQUEST_FOR_DEPARTURE"/>
 *             &lt;enumeration value="ARRIVAL_ALLOWED"/>
 *             &lt;enumeration value="DEPARTURE_ALLOWED"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTrainVisit", propOrder = {
    "estMoveCount",
    "inboundRailcar",
    "outboundRailcar"
})
public class TTrainVisit {

    @XmlElement(name = "est-move-count")
    protected TTrainVisit.EstMoveCount estMoveCount;
    @XmlElement(name = "inbound-railcar")
    protected List<TTrainVisit.InboundRailcar> inboundRailcar;
    @XmlElement(name = "outbound-railcar")
    protected List<TTrainVisit.OutboundRailcar> outboundRailcar;
    @XmlAttribute(name = "ATA")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ata;
    @XmlAttribute(name = "ATD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar atd;
    @XmlAttribute(name = "ETA")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eta;
    @XmlAttribute(name = "ETD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar etd;
    @XmlAttribute(name = "direction")
    protected String direction;
    @XmlAttribute(name = "direction-description")
    protected String directionDescription;
    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "in-call-number")
    protected BigInteger inCallNumber;
    @XmlAttribute(name = "is-dray-off")
    protected Boolean isDrayOff;
    @XmlAttribute(name = "facility")
    protected String facility;
    @XmlAttribute(name = "next-facility")
    protected String nextFacility;
    @XmlAttribute(name = "out-call-number")
    protected BigInteger outCallNumber;
    @XmlAttribute(name = "rr-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String rrId;
    @XmlAttribute(name = "service-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String serviceId;
    @XmlAttribute(name = "service-name")
    protected String serviceName;
    @XmlAttribute(name = "time-begin-receive")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeBeginReceive;
    @XmlAttribute(name = "time-end-work")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeEndWork;
    @XmlAttribute(name = "time-start-work")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStartWork;
    @XmlAttribute(name = "visit-phase")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visitPhase;
    @XmlAttribute(name = "visit-phase-comment")
    protected String visitPhaseComment;
    @XmlAttribute(name = "notes")
    @XmlSchemaType(name = "anySimpleType")
    protected String notes;

    /**
     * Obtiene el valor de la propiedad estMoveCount.
     * 
     * @return
     *     possible object is
     *     {@link TTrainVisit.EstMoveCount }
     *     
     */
    public TTrainVisit.EstMoveCount getEstMoveCount() {
        return estMoveCount;
    }

    /**
     * Define el valor de la propiedad estMoveCount.
     * 
     * @param value
     *     allowed object is
     *     {@link TTrainVisit.EstMoveCount }
     *     
     */
    public void setEstMoveCount(TTrainVisit.EstMoveCount value) {
        this.estMoveCount = value;
    }

    /**
     * Gets the value of the inboundRailcar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inboundRailcar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInboundRailcar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTrainVisit.InboundRailcar }
     * 
     * 
     */
    public List<TTrainVisit.InboundRailcar> getInboundRailcar() {
        if (inboundRailcar == null) {
            inboundRailcar = new ArrayList<TTrainVisit.InboundRailcar>();
        }
        return this.inboundRailcar;
    }

    /**
     * Gets the value of the outboundRailcar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outboundRailcar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutboundRailcar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTrainVisit.OutboundRailcar }
     * 
     * 
     */
    public List<TTrainVisit.OutboundRailcar> getOutboundRailcar() {
        if (outboundRailcar == null) {
            outboundRailcar = new ArrayList<TTrainVisit.OutboundRailcar>();
        }
        return this.outboundRailcar;
    }

    /**
     * Obtiene el valor de la propiedad ata.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getATA() {
        return ata;
    }

    /**
     * Define el valor de la propiedad ata.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setATA(XMLGregorianCalendar value) {
        this.ata = value;
    }

    /**
     * Obtiene el valor de la propiedad atd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getATD() {
        return atd;
    }

    /**
     * Define el valor de la propiedad atd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setATD(XMLGregorianCalendar value) {
        this.atd = value;
    }

    /**
     * Obtiene el valor de la propiedad eta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETA() {
        return eta;
    }

    /**
     * Define el valor de la propiedad eta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETA(XMLGregorianCalendar value) {
        this.eta = value;
    }

    /**
     * Obtiene el valor de la propiedad etd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETD() {
        return etd;
    }

    /**
     * Define el valor de la propiedad etd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETD(XMLGregorianCalendar value) {
        this.etd = value;
    }

    /**
     * Obtiene el valor de la propiedad direction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Define el valor de la propiedad direction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Obtiene el valor de la propiedad directionDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionDescription() {
        return directionDescription;
    }

    /**
     * Define el valor de la propiedad directionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionDescription(String value) {
        this.directionDescription = value;
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
     * Obtiene el valor de la propiedad inCallNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInCallNumber() {
        return inCallNumber;
    }

    /**
     * Define el valor de la propiedad inCallNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInCallNumber(BigInteger value) {
        this.inCallNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad isDrayOff.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDrayOff() {
        return isDrayOff;
    }

    /**
     * Define el valor de la propiedad isDrayOff.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDrayOff(Boolean value) {
        this.isDrayOff = value;
    }

    /**
     * Obtiene el valor de la propiedad facility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacility() {
        return facility;
    }

    /**
     * Define el valor de la propiedad facility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacility(String value) {
        this.facility = value;
    }

    /**
     * Obtiene el valor de la propiedad nextFacility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextFacility() {
        return nextFacility;
    }

    /**
     * Define el valor de la propiedad nextFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextFacility(String value) {
        this.nextFacility = value;
    }

    /**
     * Obtiene el valor de la propiedad outCallNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutCallNumber() {
        return outCallNumber;
    }

    /**
     * Define el valor de la propiedad outCallNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutCallNumber(BigInteger value) {
        this.outCallNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad rrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrId() {
        return rrId;
    }

    /**
     * Define el valor de la propiedad rrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrId(String value) {
        this.rrId = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Define el valor de la propiedad serviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Define el valor de la propiedad serviceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Obtiene el valor de la propiedad timeBeginReceive.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeBeginReceive() {
        return timeBeginReceive;
    }

    /**
     * Define el valor de la propiedad timeBeginReceive.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeBeginReceive(XMLGregorianCalendar value) {
        this.timeBeginReceive = value;
    }

    /**
     * Obtiene el valor de la propiedad timeEndWork.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeEndWork() {
        return timeEndWork;
    }

    /**
     * Define el valor de la propiedad timeEndWork.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeEndWork(XMLGregorianCalendar value) {
        this.timeEndWork = value;
    }

    /**
     * Obtiene el valor de la propiedad timeStartWork.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStartWork() {
        return timeStartWork;
    }

    /**
     * Define el valor de la propiedad timeStartWork.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStartWork(XMLGregorianCalendar value) {
        this.timeStartWork = value;
    }

    /**
     * Obtiene el valor de la propiedad visitPhase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitPhase() {
        return visitPhase;
    }

    /**
     * Define el valor de la propiedad visitPhase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitPhase(String value) {
        this.visitPhase = value;
    }

    /**
     * Obtiene el valor de la propiedad visitPhaseComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitPhaseComment() {
        return visitPhaseComment;
    }

    /**
     * Define el valor de la propiedad visitPhaseComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitPhaseComment(String value) {
        this.visitPhaseComment = value;
    }

    /**
     * Obtiene el valor de la propiedad notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Define el valor de la propiedad notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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
     *       &lt;attribute name="bbk-discharge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="bbk-load" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="discharge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="load" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EstMoveCount {

        @XmlAttribute(name = "bbk-discharge")
        protected BigInteger bbkDischarge;
        @XmlAttribute(name = "bbk-load")
        protected BigInteger bbkLoad;
        @XmlAttribute(name = "discharge")
        protected BigInteger discharge;
        @XmlAttribute(name = "load")
        protected BigInteger load;

        /**
         * Obtiene el valor de la propiedad bbkDischarge.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBbkDischarge() {
            return bbkDischarge;
        }

        /**
         * Define el valor de la propiedad bbkDischarge.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBbkDischarge(BigInteger value) {
            this.bbkDischarge = value;
        }

        /**
         * Obtiene el valor de la propiedad bbkLoad.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBbkLoad() {
            return bbkLoad;
        }

        /**
         * Define el valor de la propiedad bbkLoad.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBbkLoad(BigInteger value) {
            this.bbkLoad = value;
        }

        /**
         * Obtiene el valor de la propiedad discharge.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDischarge() {
            return discharge;
        }

        /**
         * Define el valor de la propiedad discharge.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDischarge(BigInteger value) {
            this.discharge = value;
        }

        /**
         * Obtiene el valor de la propiedad load.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLoad() {
            return load;
        }

        /**
         * Define el valor de la propiedad load.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLoad(BigInteger value) {
            this.load = value;
        }

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
     *       &lt;attribute name="visit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="in-seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="inspection-status" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
     *             &lt;enumeration value="NOT_INSPECTED"/>
     *             &lt;enumeration value="OK"/>
     *             &lt;enumeration value="BAD"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="visit-nbr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="out-seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="template-type-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="railcar-owner-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="visible-in-sparcs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="trainvisit-inbound" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="trainvisit-outbound" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="discharge-point" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="railcar-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="railcar-state" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="facility" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="modified-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="modified-by" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InboundRailcar {

        @XmlAttribute(name = "visit-id", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String visitId;
        @XmlAttribute(name = "in-seq")
        protected BigInteger inSeq;
        @XmlAttribute(name = "inspection-status", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String inspectionStatus;
        @XmlAttribute(name = "visit-nbr")
        @XmlSchemaType(name = "anySimpleType")
        protected String visitNbr;
        @XmlAttribute(name = "active")
        @XmlSchemaType(name = "anySimpleType")
        protected String active;
        @XmlAttribute(name = "out-seq")
        protected BigInteger outSeq;
        @XmlAttribute(name = "template-type-id")
        protected String templateTypeId;
        @XmlAttribute(name = "railcar-owner-id")
        protected String railcarOwnerId;
        @XmlAttribute(name = "visible-in-sparcs")
        protected Boolean visibleInSparcs;
        @XmlAttribute(name = "trainvisit-inbound")
        protected String trainvisitInbound;
        @XmlAttribute(name = "trainvisit-outbound")
        protected String trainvisitOutbound;
        @XmlAttribute(name = "discharge-point")
        protected String dischargePoint;
        @XmlAttribute(name = "railcar-id")
        protected String railcarId;
        @XmlAttribute(name = "railcar-state")
        protected Integer railcarState;
        @XmlAttribute(name = "facility")
        protected String facility;
        @XmlAttribute(name = "created-by")
        protected String createdBy;
        @XmlAttribute(name = "created-date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdDate;
        @XmlAttribute(name = "modified-date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar modifiedDate;
        @XmlAttribute(name = "modified-by")
        protected String modifiedBy;

        /**
         * Obtiene el valor de la propiedad visitId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVisitId() {
            return visitId;
        }

        /**
         * Define el valor de la propiedad visitId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVisitId(String value) {
            this.visitId = value;
        }

        /**
         * Obtiene el valor de la propiedad inSeq.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInSeq() {
            return inSeq;
        }

        /**
         * Define el valor de la propiedad inSeq.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInSeq(BigInteger value) {
            this.inSeq = value;
        }

        /**
         * Obtiene el valor de la propiedad inspectionStatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInspectionStatus() {
            return inspectionStatus;
        }

        /**
         * Define el valor de la propiedad inspectionStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInspectionStatus(String value) {
            this.inspectionStatus = value;
        }

        /**
         * Obtiene el valor de la propiedad visitNbr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVisitNbr() {
            return visitNbr;
        }

        /**
         * Define el valor de la propiedad visitNbr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVisitNbr(String value) {
            this.visitNbr = value;
        }

        /**
         * Obtiene el valor de la propiedad active.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActive() {
            return active;
        }

        /**
         * Define el valor de la propiedad active.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActive(String value) {
            this.active = value;
        }

        /**
         * Obtiene el valor de la propiedad outSeq.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOutSeq() {
            return outSeq;
        }

        /**
         * Define el valor de la propiedad outSeq.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOutSeq(BigInteger value) {
            this.outSeq = value;
        }

        /**
         * Obtiene el valor de la propiedad templateTypeId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemplateTypeId() {
            return templateTypeId;
        }

        /**
         * Define el valor de la propiedad templateTypeId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTemplateTypeId(String value) {
            this.templateTypeId = value;
        }

        /**
         * Obtiene el valor de la propiedad railcarOwnerId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRailcarOwnerId() {
            return railcarOwnerId;
        }

        /**
         * Define el valor de la propiedad railcarOwnerId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRailcarOwnerId(String value) {
            this.railcarOwnerId = value;
        }

        /**
         * Obtiene el valor de la propiedad visibleInSparcs.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVisibleInSparcs() {
            return visibleInSparcs;
        }

        /**
         * Define el valor de la propiedad visibleInSparcs.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVisibleInSparcs(Boolean value) {
            this.visibleInSparcs = value;
        }

        /**
         * Obtiene el valor de la propiedad trainvisitInbound.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrainvisitInbound() {
            return trainvisitInbound;
        }

        /**
         * Define el valor de la propiedad trainvisitInbound.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrainvisitInbound(String value) {
            this.trainvisitInbound = value;
        }

        /**
         * Obtiene el valor de la propiedad trainvisitOutbound.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrainvisitOutbound() {
            return trainvisitOutbound;
        }

        /**
         * Define el valor de la propiedad trainvisitOutbound.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrainvisitOutbound(String value) {
            this.trainvisitOutbound = value;
        }

        /**
         * Obtiene el valor de la propiedad dischargePoint.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDischargePoint() {
            return dischargePoint;
        }

        /**
         * Define el valor de la propiedad dischargePoint.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDischargePoint(String value) {
            this.dischargePoint = value;
        }

        /**
         * Obtiene el valor de la propiedad railcarId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRailcarId() {
            return railcarId;
        }

        /**
         * Define el valor de la propiedad railcarId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRailcarId(String value) {
            this.railcarId = value;
        }

        /**
         * Obtiene el valor de la propiedad railcarState.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRailcarState() {
            return railcarState;
        }

        /**
         * Define el valor de la propiedad railcarState.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRailcarState(Integer value) {
            this.railcarState = value;
        }

        /**
         * Obtiene el valor de la propiedad facility.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacility() {
            return facility;
        }

        /**
         * Define el valor de la propiedad facility.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacility(String value) {
            this.facility = value;
        }

        /**
         * Obtiene el valor de la propiedad createdBy.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatedBy() {
            return createdBy;
        }

        /**
         * Define el valor de la propiedad createdBy.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatedBy(String value) {
            this.createdBy = value;
        }

        /**
         * Obtiene el valor de la propiedad createdDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedDate() {
            return createdDate;
        }

        /**
         * Define el valor de la propiedad createdDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedDate(XMLGregorianCalendar value) {
            this.createdDate = value;
        }

        /**
         * Obtiene el valor de la propiedad modifiedDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getModifiedDate() {
            return modifiedDate;
        }

        /**
         * Define el valor de la propiedad modifiedDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setModifiedDate(XMLGregorianCalendar value) {
            this.modifiedDate = value;
        }

        /**
         * Obtiene el valor de la propiedad modifiedBy.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifiedBy() {
            return modifiedBy;
        }

        /**
         * Define el valor de la propiedad modifiedBy.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifiedBy(String value) {
            this.modifiedBy = value;
        }

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
     *       &lt;attribute name="visit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="inspection-status" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
     *             &lt;enumeration value="NOT_INSPECTED"/>
     *             &lt;enumeration value="OK"/>
     *             &lt;enumeration value="BAD"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="out-seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="visit-nbr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="in-seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="template-type-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="railcar-owner-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="visible-in-sparcs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="trainvisit-inbound" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="trainvisit-outbound" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="discharge-point" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="railcar-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="railcar-state" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="facility" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="modified-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="modified-by" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OutboundRailcar {

        @XmlAttribute(name = "visit-id", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String visitId;
        @XmlAttribute(name = "inspection-status", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String inspectionStatus;
        @XmlAttribute(name = "out-seq")
        protected BigInteger outSeq;
        @XmlAttribute(name = "visit-nbr")
        @XmlSchemaType(name = "anySimpleType")
        protected String visitNbr;
        @XmlAttribute(name = "active")
        @XmlSchemaType(name = "anySimpleType")
        protected String active;
        @XmlAttribute(name = "in-seq")
        protected BigInteger inSeq;
        @XmlAttribute(name = "template-type-id")
        protected String templateTypeId;
        @XmlAttribute(name = "railcar-owner-id")
        protected String railcarOwnerId;
        @XmlAttribute(name = "visible-in-sparcs")
        protected Boolean visibleInSparcs;
        @XmlAttribute(name = "trainvisit-inbound")
        protected String trainvisitInbound;
        @XmlAttribute(name = "trainvisit-outbound")
        protected String trainvisitOutbound;
        @XmlAttribute(name = "discharge-point")
        protected String dischargePoint;
        @XmlAttribute(name = "railcar-id")
        protected String railcarId;
        @XmlAttribute(name = "railcar-state")
        protected Integer railcarState;
        @XmlAttribute(name = "facility")
        protected String facility;
        @XmlAttribute(name = "created-by")
        protected String createdBy;
        @XmlAttribute(name = "created-date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdDate;
        @XmlAttribute(name = "modified-date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar modifiedDate;
        @XmlAttribute(name = "modified-by")
        protected String modifiedBy;

        /**
         * Obtiene el valor de la propiedad visitId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVisitId() {
            return visitId;
        }

        /**
         * Define el valor de la propiedad visitId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVisitId(String value) {
            this.visitId = value;
        }

        /**
         * Obtiene el valor de la propiedad inspectionStatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInspectionStatus() {
            return inspectionStatus;
        }

        /**
         * Define el valor de la propiedad inspectionStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInspectionStatus(String value) {
            this.inspectionStatus = value;
        }

        /**
         * Obtiene el valor de la propiedad outSeq.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOutSeq() {
            return outSeq;
        }

        /**
         * Define el valor de la propiedad outSeq.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOutSeq(BigInteger value) {
            this.outSeq = value;
        }

        /**
         * Obtiene el valor de la propiedad visitNbr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVisitNbr() {
            return visitNbr;
        }

        /**
         * Define el valor de la propiedad visitNbr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVisitNbr(String value) {
            this.visitNbr = value;
        }

        /**
         * Obtiene el valor de la propiedad active.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActive() {
            return active;
        }

        /**
         * Define el valor de la propiedad active.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActive(String value) {
            this.active = value;
        }

        /**
         * Obtiene el valor de la propiedad inSeq.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInSeq() {
            return inSeq;
        }

        /**
         * Define el valor de la propiedad inSeq.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInSeq(BigInteger value) {
            this.inSeq = value;
        }

        /**
         * Obtiene el valor de la propiedad templateTypeId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemplateTypeId() {
            return templateTypeId;
        }

        /**
         * Define el valor de la propiedad templateTypeId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTemplateTypeId(String value) {
            this.templateTypeId = value;
        }

        /**
         * Obtiene el valor de la propiedad railcarOwnerId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRailcarOwnerId() {
            return railcarOwnerId;
        }

        /**
         * Define el valor de la propiedad railcarOwnerId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRailcarOwnerId(String value) {
            this.railcarOwnerId = value;
        }

        /**
         * Obtiene el valor de la propiedad visibleInSparcs.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVisibleInSparcs() {
            return visibleInSparcs;
        }

        /**
         * Define el valor de la propiedad visibleInSparcs.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVisibleInSparcs(Boolean value) {
            this.visibleInSparcs = value;
        }

        /**
         * Obtiene el valor de la propiedad trainvisitInbound.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrainvisitInbound() {
            return trainvisitInbound;
        }

        /**
         * Define el valor de la propiedad trainvisitInbound.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrainvisitInbound(String value) {
            this.trainvisitInbound = value;
        }

        /**
         * Obtiene el valor de la propiedad trainvisitOutbound.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrainvisitOutbound() {
            return trainvisitOutbound;
        }

        /**
         * Define el valor de la propiedad trainvisitOutbound.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrainvisitOutbound(String value) {
            this.trainvisitOutbound = value;
        }

        /**
         * Obtiene el valor de la propiedad dischargePoint.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDischargePoint() {
            return dischargePoint;
        }

        /**
         * Define el valor de la propiedad dischargePoint.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDischargePoint(String value) {
            this.dischargePoint = value;
        }

        /**
         * Obtiene el valor de la propiedad railcarId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRailcarId() {
            return railcarId;
        }

        /**
         * Define el valor de la propiedad railcarId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRailcarId(String value) {
            this.railcarId = value;
        }

        /**
         * Obtiene el valor de la propiedad railcarState.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRailcarState() {
            return railcarState;
        }

        /**
         * Define el valor de la propiedad railcarState.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRailcarState(Integer value) {
            this.railcarState = value;
        }

        /**
         * Obtiene el valor de la propiedad facility.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacility() {
            return facility;
        }

        /**
         * Define el valor de la propiedad facility.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacility(String value) {
            this.facility = value;
        }

        /**
         * Obtiene el valor de la propiedad createdBy.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatedBy() {
            return createdBy;
        }

        /**
         * Define el valor de la propiedad createdBy.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatedBy(String value) {
            this.createdBy = value;
        }

        /**
         * Obtiene el valor de la propiedad createdDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedDate() {
            return createdDate;
        }

        /**
         * Define el valor de la propiedad createdDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedDate(XMLGregorianCalendar value) {
            this.createdDate = value;
        }

        /**
         * Obtiene el valor de la propiedad modifiedDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getModifiedDate() {
            return modifiedDate;
        }

        /**
         * Define el valor de la propiedad modifiedDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setModifiedDate(XMLGregorianCalendar value) {
            this.modifiedDate = value;
        }

        /**
         * Obtiene el valor de la propiedad modifiedBy.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifiedBy() {
            return modifiedBy;
        }

        /**
         * Define el valor de la propiedad modifiedBy.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifiedBy(String value) {
            this.modifiedBy = value;
        }

    }

}
