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
 * A vesselVisit is the contiguous block of time spent at the facility by
 *                 a vessel from arrival to departure
 *             
 * 
 * <p>Clase Java para tVesselVisit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tVesselVisit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="line" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                           &lt;attribute name="in-voy-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="out-voy-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="time-cargo-cutoff" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="time-empty-pickup" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="berths" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="berthing" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="quay-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ship-side-to">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *                                 &lt;enumeration value="UNKNOWN"/>
 *                                 &lt;enumeration value="STARBOARD"/>
 *                                 &lt;enumeration value="PORTSIDE"/>
 *                                 &lt;enumeration value="STERNSIDETO"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="time-shift" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="est-move-count" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="bbk-discharge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="bbk-load" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="discharge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="load" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="restow" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="shift" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ATA" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ATD" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ETA" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ETD" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="in-voy-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="in-call-number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="inbound-first-free-day" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="is-common-carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-dray-off" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-no-client-access" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="out-voy-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operator-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="out-call-number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="published-eta" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="published-etd" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="service-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="itinerary-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time-begin-receive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-cargo-cutoff" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-discharge-complete" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-end-work" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-first-availability" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-haz-cutoff" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-labor-off-board" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-labor-on-board" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-pilot-off-board" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-pilot-on-board" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-reefer-cutoff" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-start-work" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="vessel-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="vessel-name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attribute name="validate-phase" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="facility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="next-facility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="classification">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *             &lt;enumeration value="DEEPSEA"/>
 *             &lt;enumeration value="BARGE"/>
 *             &lt;enumeration value="FEEDER"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vv-flex-string-1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vv-flex-string-2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vv-flex-string-3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vv-flex-string-4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vv-flex-string-5" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vv-flex-string-6" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vv-flex-string-7" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vv-flex-string-8" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vv-flex-date-1" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="vv-flex-date-2" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="vv-flex-date-3" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="vv-flex-date-4" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="vv-flex-date-5" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="vv-flex-date-6" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="vv-flex-date-7" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="vv-flex-date-8" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tVesselVisit", propOrder = {
    "lines",
    "berths",
    "estMoveCount"
})
public class TVesselVisit {

    protected TVesselVisit.Lines lines;
    protected TVesselVisit.Berths berths;
    @XmlElement(name = "est-move-count")
    protected TVesselVisit.EstMoveCount estMoveCount;
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
    @XmlAttribute(name = "in-voy-nbr")
    protected String inVoyNbr;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String id;
    @XmlAttribute(name = "in-call-number")
    protected BigInteger inCallNumber;
    @XmlAttribute(name = "inbound-first-free-day")
    @XmlSchemaType(name = "anySimpleType")
    protected String inboundFirstFreeDay;
    @XmlAttribute(name = "is-common-carrier")
    protected String isCommonCarrier;
    @XmlAttribute(name = "is-dray-off")
    protected String isDrayOff;
    @XmlAttribute(name = "is-no-client-access")
    protected String isNoClientAccess;
    @XmlAttribute(name = "notes")
    @XmlSchemaType(name = "anySimpleType")
    protected String notes;
    @XmlAttribute(name = "out-voy-nbr")
    protected String outVoyNbr;
    @XmlAttribute(name = "operator-id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String operatorId;
    @XmlAttribute(name = "out-call-number")
    protected BigInteger outCallNumber;
    @XmlAttribute(name = "published-eta")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishedEta;
    @XmlAttribute(name = "published-etd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishedEtd;
    @XmlAttribute(name = "service-id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String serviceId;
    @XmlAttribute(name = "itinerary-id")
    protected String itineraryId;
    @XmlAttribute(name = "time-begin-receive")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeBeginReceive;
    @XmlAttribute(name = "time-cargo-cutoff")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeCargoCutoff;
    @XmlAttribute(name = "time-discharge-complete")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeDischargeComplete;
    @XmlAttribute(name = "time-end-work")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeEndWork;
    @XmlAttribute(name = "time-first-availability")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeFirstAvailability;
    @XmlAttribute(name = "time-haz-cutoff")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeHazCutoff;
    @XmlAttribute(name = "time-labor-off-board")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLaborOffBoard;
    @XmlAttribute(name = "time-labor-on-board")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLaborOnBoard;
    @XmlAttribute(name = "time-pilot-off-board")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timePilotOffBoard;
    @XmlAttribute(name = "time-pilot-on-board")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timePilotOnBoard;
    @XmlAttribute(name = "time-reefer-cutoff")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeReeferCutoff;
    @XmlAttribute(name = "time-start-work")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStartWork;
    @XmlAttribute(name = "vessel-id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String vesselId;
    @XmlAttribute(name = "vessel-name")
    protected String vesselName;
    @XmlAttribute(name = "visit-phase")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visitPhase;
    @XmlAttribute(name = "validate-phase")
    @XmlSchemaType(name = "anySimpleType")
    protected String validatePhase;
    @XmlAttribute(name = "facility")
    protected String facility;
    @XmlAttribute(name = "next-facility")
    protected String nextFacility;
    @XmlAttribute(name = "classification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String classification;
    @XmlAttribute(name = "vv-flex-string-1")
    protected String vvFlexString1;
    @XmlAttribute(name = "vv-flex-string-2")
    protected String vvFlexString2;
    @XmlAttribute(name = "vv-flex-string-3")
    protected String vvFlexString3;
    @XmlAttribute(name = "vv-flex-string-4")
    protected String vvFlexString4;
    @XmlAttribute(name = "vv-flex-string-5")
    protected String vvFlexString5;
    @XmlAttribute(name = "vv-flex-string-6")
    protected String vvFlexString6;
    @XmlAttribute(name = "vv-flex-string-7")
    protected String vvFlexString7;
    @XmlAttribute(name = "vv-flex-string-8")
    protected String vvFlexString8;
    @XmlAttribute(name = "vv-flex-date-1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vvFlexDate1;
    @XmlAttribute(name = "vv-flex-date-2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vvFlexDate2;
    @XmlAttribute(name = "vv-flex-date-3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vvFlexDate3;
    @XmlAttribute(name = "vv-flex-date-4")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vvFlexDate4;
    @XmlAttribute(name = "vv-flex-date-5")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vvFlexDate5;
    @XmlAttribute(name = "vv-flex-date-6")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vvFlexDate6;
    @XmlAttribute(name = "vv-flex-date-7")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vvFlexDate7;
    @XmlAttribute(name = "vv-flex-date-8")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vvFlexDate8;

    /**
     * Obtiene el valor de la propiedad lines.
     * 
     * @return
     *     possible object is
     *     {@link TVesselVisit.Lines }
     *     
     */
    public TVesselVisit.Lines getLines() {
        return lines;
    }

    /**
     * Define el valor de la propiedad lines.
     * 
     * @param value
     *     allowed object is
     *     {@link TVesselVisit.Lines }
     *     
     */
    public void setLines(TVesselVisit.Lines value) {
        this.lines = value;
    }

    /**
     * Obtiene el valor de la propiedad berths.
     * 
     * @return
     *     possible object is
     *     {@link TVesselVisit.Berths }
     *     
     */
    public TVesselVisit.Berths getBerths() {
        return berths;
    }

    /**
     * Define el valor de la propiedad berths.
     * 
     * @param value
     *     allowed object is
     *     {@link TVesselVisit.Berths }
     *     
     */
    public void setBerths(TVesselVisit.Berths value) {
        this.berths = value;
    }

    /**
     * Obtiene el valor de la propiedad estMoveCount.
     * 
     * @return
     *     possible object is
     *     {@link TVesselVisit.EstMoveCount }
     *     
     */
    public TVesselVisit.EstMoveCount getEstMoveCount() {
        return estMoveCount;
    }

    /**
     * Define el valor de la propiedad estMoveCount.
     * 
     * @param value
     *     allowed object is
     *     {@link TVesselVisit.EstMoveCount }
     *     
     */
    public void setEstMoveCount(TVesselVisit.EstMoveCount value) {
        this.estMoveCount = value;
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
     * Obtiene el valor de la propiedad inVoyNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInVoyNbr() {
        return inVoyNbr;
    }

    /**
     * Define el valor de la propiedad inVoyNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInVoyNbr(String value) {
        this.inVoyNbr = value;
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
     * Obtiene el valor de la propiedad inboundFirstFreeDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundFirstFreeDay() {
        return inboundFirstFreeDay;
    }

    /**
     * Define el valor de la propiedad inboundFirstFreeDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundFirstFreeDay(String value) {
        this.inboundFirstFreeDay = value;
    }

    /**
     * Obtiene el valor de la propiedad isCommonCarrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCommonCarrier() {
        return isCommonCarrier;
    }

    /**
     * Define el valor de la propiedad isCommonCarrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCommonCarrier(String value) {
        this.isCommonCarrier = value;
    }

    /**
     * Obtiene el valor de la propiedad isDrayOff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDrayOff() {
        return isDrayOff;
    }

    /**
     * Define el valor de la propiedad isDrayOff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDrayOff(String value) {
        this.isDrayOff = value;
    }

    /**
     * Obtiene el valor de la propiedad isNoClientAccess.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNoClientAccess() {
        return isNoClientAccess;
    }

    /**
     * Define el valor de la propiedad isNoClientAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNoClientAccess(String value) {
        this.isNoClientAccess = value;
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
     * Obtiene el valor de la propiedad outVoyNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVoyNbr() {
        return outVoyNbr;
    }

    /**
     * Define el valor de la propiedad outVoyNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVoyNbr(String value) {
        this.outVoyNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Define el valor de la propiedad operatorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorId(String value) {
        this.operatorId = value;
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
     * Obtiene el valor de la propiedad publishedEta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishedEta() {
        return publishedEta;
    }

    /**
     * Define el valor de la propiedad publishedEta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishedEta(XMLGregorianCalendar value) {
        this.publishedEta = value;
    }

    /**
     * Obtiene el valor de la propiedad publishedEtd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishedEtd() {
        return publishedEtd;
    }

    /**
     * Define el valor de la propiedad publishedEtd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishedEtd(XMLGregorianCalendar value) {
        this.publishedEtd = value;
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
     * Obtiene el valor de la propiedad itineraryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItineraryId() {
        return itineraryId;
    }

    /**
     * Define el valor de la propiedad itineraryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItineraryId(String value) {
        this.itineraryId = value;
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
     * Obtiene el valor de la propiedad timeCargoCutoff.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeCargoCutoff() {
        return timeCargoCutoff;
    }

    /**
     * Define el valor de la propiedad timeCargoCutoff.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeCargoCutoff(XMLGregorianCalendar value) {
        this.timeCargoCutoff = value;
    }

    /**
     * Obtiene el valor de la propiedad timeDischargeComplete.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeDischargeComplete() {
        return timeDischargeComplete;
    }

    /**
     * Define el valor de la propiedad timeDischargeComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeDischargeComplete(XMLGregorianCalendar value) {
        this.timeDischargeComplete = value;
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
     * Obtiene el valor de la propiedad timeFirstAvailability.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeFirstAvailability() {
        return timeFirstAvailability;
    }

    /**
     * Define el valor de la propiedad timeFirstAvailability.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeFirstAvailability(XMLGregorianCalendar value) {
        this.timeFirstAvailability = value;
    }

    /**
     * Obtiene el valor de la propiedad timeHazCutoff.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeHazCutoff() {
        return timeHazCutoff;
    }

    /**
     * Define el valor de la propiedad timeHazCutoff.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeHazCutoff(XMLGregorianCalendar value) {
        this.timeHazCutoff = value;
    }

    /**
     * Obtiene el valor de la propiedad timeLaborOffBoard.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLaborOffBoard() {
        return timeLaborOffBoard;
    }

    /**
     * Define el valor de la propiedad timeLaborOffBoard.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLaborOffBoard(XMLGregorianCalendar value) {
        this.timeLaborOffBoard = value;
    }

    /**
     * Obtiene el valor de la propiedad timeLaborOnBoard.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLaborOnBoard() {
        return timeLaborOnBoard;
    }

    /**
     * Define el valor de la propiedad timeLaborOnBoard.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLaborOnBoard(XMLGregorianCalendar value) {
        this.timeLaborOnBoard = value;
    }

    /**
     * Obtiene el valor de la propiedad timePilotOffBoard.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimePilotOffBoard() {
        return timePilotOffBoard;
    }

    /**
     * Define el valor de la propiedad timePilotOffBoard.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimePilotOffBoard(XMLGregorianCalendar value) {
        this.timePilotOffBoard = value;
    }

    /**
     * Obtiene el valor de la propiedad timePilotOnBoard.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimePilotOnBoard() {
        return timePilotOnBoard;
    }

    /**
     * Define el valor de la propiedad timePilotOnBoard.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimePilotOnBoard(XMLGregorianCalendar value) {
        this.timePilotOnBoard = value;
    }

    /**
     * Obtiene el valor de la propiedad timeReeferCutoff.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeReeferCutoff() {
        return timeReeferCutoff;
    }

    /**
     * Define el valor de la propiedad timeReeferCutoff.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeReeferCutoff(XMLGregorianCalendar value) {
        this.timeReeferCutoff = value;
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
     * Obtiene el valor de la propiedad vesselId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselId() {
        return vesselId;
    }

    /**
     * Define el valor de la propiedad vesselId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselId(String value) {
        this.vesselId = value;
    }

    /**
     * Obtiene el valor de la propiedad vesselName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselName() {
        return vesselName;
    }

    /**
     * Define el valor de la propiedad vesselName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselName(String value) {
        this.vesselName = value;
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
     * Obtiene el valor de la propiedad validatePhase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatePhase() {
        return validatePhase;
    }

    /**
     * Define el valor de la propiedad validatePhase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatePhase(String value) {
        this.validatePhase = value;
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
     * Obtiene el valor de la propiedad classification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Define el valor de la propiedad classification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexString1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVvFlexString1() {
        return vvFlexString1;
    }

    /**
     * Define el valor de la propiedad vvFlexString1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVvFlexString1(String value) {
        this.vvFlexString1 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexString2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVvFlexString2() {
        return vvFlexString2;
    }

    /**
     * Define el valor de la propiedad vvFlexString2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVvFlexString2(String value) {
        this.vvFlexString2 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexString3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVvFlexString3() {
        return vvFlexString3;
    }

    /**
     * Define el valor de la propiedad vvFlexString3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVvFlexString3(String value) {
        this.vvFlexString3 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexString4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVvFlexString4() {
        return vvFlexString4;
    }

    /**
     * Define el valor de la propiedad vvFlexString4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVvFlexString4(String value) {
        this.vvFlexString4 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexString5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVvFlexString5() {
        return vvFlexString5;
    }

    /**
     * Define el valor de la propiedad vvFlexString5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVvFlexString5(String value) {
        this.vvFlexString5 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexString6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVvFlexString6() {
        return vvFlexString6;
    }

    /**
     * Define el valor de la propiedad vvFlexString6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVvFlexString6(String value) {
        this.vvFlexString6 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexString7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVvFlexString7() {
        return vvFlexString7;
    }

    /**
     * Define el valor de la propiedad vvFlexString7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVvFlexString7(String value) {
        this.vvFlexString7 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexString8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVvFlexString8() {
        return vvFlexString8;
    }

    /**
     * Define el valor de la propiedad vvFlexString8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVvFlexString8(String value) {
        this.vvFlexString8 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexDate1.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVvFlexDate1() {
        return vvFlexDate1;
    }

    /**
     * Define el valor de la propiedad vvFlexDate1.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVvFlexDate1(XMLGregorianCalendar value) {
        this.vvFlexDate1 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexDate2.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVvFlexDate2() {
        return vvFlexDate2;
    }

    /**
     * Define el valor de la propiedad vvFlexDate2.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVvFlexDate2(XMLGregorianCalendar value) {
        this.vvFlexDate2 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexDate3.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVvFlexDate3() {
        return vvFlexDate3;
    }

    /**
     * Define el valor de la propiedad vvFlexDate3.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVvFlexDate3(XMLGregorianCalendar value) {
        this.vvFlexDate3 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexDate4.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVvFlexDate4() {
        return vvFlexDate4;
    }

    /**
     * Define el valor de la propiedad vvFlexDate4.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVvFlexDate4(XMLGregorianCalendar value) {
        this.vvFlexDate4 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexDate5.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVvFlexDate5() {
        return vvFlexDate5;
    }

    /**
     * Define el valor de la propiedad vvFlexDate5.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVvFlexDate5(XMLGregorianCalendar value) {
        this.vvFlexDate5 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexDate6.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVvFlexDate6() {
        return vvFlexDate6;
    }

    /**
     * Define el valor de la propiedad vvFlexDate6.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVvFlexDate6(XMLGregorianCalendar value) {
        this.vvFlexDate6 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexDate7.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVvFlexDate7() {
        return vvFlexDate7;
    }

    /**
     * Define el valor de la propiedad vvFlexDate7.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVvFlexDate7(XMLGregorianCalendar value) {
        this.vvFlexDate7 = value;
    }

    /**
     * Obtiene el valor de la propiedad vvFlexDate8.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVvFlexDate8() {
        return vvFlexDate8;
    }

    /**
     * Define el valor de la propiedad vvFlexDate8.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVvFlexDate8(XMLGregorianCalendar value) {
        this.vvFlexDate8 = value;
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
     *         &lt;element name="berthing" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="quay-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ship-side-to">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
     *                       &lt;enumeration value="UNKNOWN"/>
     *                       &lt;enumeration value="STARBOARD"/>
     *                       &lt;enumeration value="PORTSIDE"/>
     *                       &lt;enumeration value="STERNSIDETO"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="time-shift" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "berthing"
    })
    public static class Berths {

        protected List<TVesselVisit.Berths.Berthing> berthing;

        /**
         * Gets the value of the berthing property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the berthing property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBerthing().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TVesselVisit.Berths.Berthing }
         * 
         * 
         */
        public List<TVesselVisit.Berths.Berthing> getBerthing() {
            if (berthing == null) {
                berthing = new ArrayList<TVesselVisit.Berths.Berthing>();
            }
            return this.berthing;
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
         *       &lt;attribute name="quay-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ship-side-to">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
         *             &lt;enumeration value="UNKNOWN"/>
         *             &lt;enumeration value="STARBOARD"/>
         *             &lt;enumeration value="PORTSIDE"/>
         *             &lt;enumeration value="STERNSIDETO"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="time-shift" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Berthing {

            @XmlAttribute(name = "quay-id", required = true)
            protected String quayId;
            @XmlAttribute(name = "ship-side-to")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String shipSideTo;
            @XmlAttribute(name = "time-shift")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar timeShift;

            /**
             * Obtiene el valor de la propiedad quayId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuayId() {
                return quayId;
            }

            /**
             * Define el valor de la propiedad quayId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuayId(String value) {
                this.quayId = value;
            }

            /**
             * Obtiene el valor de la propiedad shipSideTo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShipSideTo() {
                return shipSideTo;
            }

            /**
             * Define el valor de la propiedad shipSideTo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShipSideTo(String value) {
                this.shipSideTo = value;
            }

            /**
             * Obtiene el valor de la propiedad timeShift.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTimeShift() {
                return timeShift;
            }

            /**
             * Define el valor de la propiedad timeShift.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTimeShift(XMLGregorianCalendar value) {
                this.timeShift = value;
            }

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
     *       &lt;attribute name="bbk-discharge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="bbk-load" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="discharge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="load" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="restow" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="shift" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
        @XmlAttribute(name = "restow")
        protected BigInteger restow;
        @XmlAttribute(name = "shift")
        protected BigInteger shift;

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

        /**
         * Obtiene el valor de la propiedad restow.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRestow() {
            return restow;
        }

        /**
         * Define el valor de la propiedad restow.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRestow(BigInteger value) {
            this.restow = value;
        }

        /**
         * Obtiene el valor de la propiedad shift.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getShift() {
            return shift;
        }

        /**
         * Define el valor de la propiedad shift.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setShift(BigInteger value) {
            this.shift = value;
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
     *       &lt;sequence>
     *         &lt;element name="line" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                 &lt;attribute name="in-voy-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="out-voy-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="time-cargo-cutoff" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="time-empty-pickup" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "line"
    })
    public static class Lines {

        protected List<TVesselVisit.Lines.Line> line;

        /**
         * Gets the value of the line property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the line property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TVesselVisit.Lines.Line }
         * 
         * 
         */
        public List<TVesselVisit.Lines.Line> getLine() {
            if (line == null) {
                line = new ArrayList<TVesselVisit.Lines.Line>();
            }
            return this.line;
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
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *       &lt;attribute name="in-voy-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="out-voy-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="time-cargo-cutoff" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="time-empty-pickup" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Line {

            @XmlAttribute(name = "id", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String id;
            @XmlAttribute(name = "in-voy-nbr")
            protected String inVoyNbr;
            @XmlAttribute(name = "out-voy-nbr")
            protected String outVoyNbr;
            @XmlAttribute(name = "time-cargo-cutoff")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar timeCargoCutoff;
            @XmlAttribute(name = "time-empty-pickup")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar timeEmptyPickup;

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
             * Obtiene el valor de la propiedad inVoyNbr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInVoyNbr() {
                return inVoyNbr;
            }

            /**
             * Define el valor de la propiedad inVoyNbr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInVoyNbr(String value) {
                this.inVoyNbr = value;
            }

            /**
             * Obtiene el valor de la propiedad outVoyNbr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOutVoyNbr() {
                return outVoyNbr;
            }

            /**
             * Define el valor de la propiedad outVoyNbr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOutVoyNbr(String value) {
                this.outVoyNbr = value;
            }

            /**
             * Obtiene el valor de la propiedad timeCargoCutoff.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTimeCargoCutoff() {
                return timeCargoCutoff;
            }

            /**
             * Define el valor de la propiedad timeCargoCutoff.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTimeCargoCutoff(XMLGregorianCalendar value) {
                this.timeCargoCutoff = value;
            }

            /**
             * Obtiene el valor de la propiedad timeEmptyPickup.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTimeEmptyPickup() {
                return timeEmptyPickup;
            }

            /**
             * Define el valor de la propiedad timeEmptyPickup.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTimeEmptyPickup(XMLGregorianCalendar value) {
                this.timeEmptyPickup = value;
            }

        }

    }

}
