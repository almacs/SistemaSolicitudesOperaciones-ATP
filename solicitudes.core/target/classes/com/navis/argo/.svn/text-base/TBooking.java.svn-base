//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigDecimal;
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
 * <p>Clase Java para tBooking complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tBooking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier" type="{http://www.navis.com/argo}tCarrier"/>
 *         &lt;element name="items" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reefer" type="{http://www.navis.com/argo}tBaseReeferRequirements" minOccurs="0"/>
 *                             &lt;element name="oog" type="{http://www.navis.com/argo}tEqoiOog" minOccurs="0"/>
 *                             &lt;element name="received-containers" type="{http://www.navis.com/argo}tRecvCtrs" minOccurs="0"/>
 *                             &lt;element name="delivered-containers" type="{http://www.navis.com/argo}tDeliCtrs" minOccurs="0"/>
 *                             &lt;element name="reserved-containers" type="{http://www.navis.com/argo}tResCtrs" minOccurs="0"/>
 *                             &lt;element name="hazards" type="{http://www.navis.com/argo}tHazards" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="commodity-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="commodity-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="eq-height" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="40"/>
 *                                 &lt;enumeration value="43"/>
 *                                 &lt;enumeration value="80"/>
 *                                 &lt;enumeration value="86"/>
 *                                 &lt;enumeration value="90"/>
 *                                 &lt;enumeration value="96"/>
 *                                 &lt;enumeration value="NA"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="eq-iso-group" use="required" type="{http://www.navis.com/argo}tIsoGroup" />
 *                           &lt;attribute name="eq-iso-group-description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="acc-type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *                                 &lt;enumeration value="UNKNOWN"/>
 *                                 &lt;enumeration value="GENSET_NOSE_MOUNT"/>
 *                                 &lt;enumeration value="GENSET_UNDERSLUNG"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="eq-grade" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                           &lt;attribute name="eq-material" type="{http://www.navis.com/argo}tMaterial" />
 *                           &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="modified-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="modified-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="eq-size" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="20"/>
 *                                 &lt;enumeration value="40"/>
 *                                 &lt;enumeration value="45"/>
 *                                 &lt;enumeration value="24"/>
 *                                 &lt;enumeration value="30"/>
 *                                 &lt;enumeration value="48"/>
 *                                 &lt;enumeration value="53"/>
 *                                 &lt;enumeration value="XX"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="gross-weight" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="qty" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="tally" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="tally-limit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="feature-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                           &lt;attribute name="equipment-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="equip-type-description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="seq-nbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="update-mode" type="{http://www.navis.com/argo}tUpdateMode" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hazards" type="{http://www.navis.com/argo}tHazards" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="client-ref-no" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="consignee-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="consignee-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destination" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="eq-status" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="hold-partials" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="line" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="nbr" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ood" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="origin" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="override-cutoff" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pod-1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pod-2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pod-2-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pod-optional" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pol-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prevent-type-subst" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="modified-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="modified-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="shipper-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="shipper-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trucking-co-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="trucking-co-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stow-block" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="special-stow" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="agent-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="dispatch-reserved">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="FIRST"/>
 *             &lt;enumeration value="ONLY"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="owned-or-leased">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="OWNED"/>
 *             &lt;enumeration value="LEASED"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="empty-pickup-location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="full-return-location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.navis.com/argo}tCategory" />
 *       &lt;attribute name="stuffing-location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dray-off" type="{http://www.navis.com/argo}tDrayStatus" />
 *       &lt;attribute name="earliest-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="estimated-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ignore-damages" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignore-holds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="latest-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="military-tcn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="service-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shipping-mode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *             &lt;enumeration value="UNKNOWN"/>
 *             &lt;enumeration value="PP"/>
 *             &lt;enumeration value="PH"/>
 *             &lt;enumeration value="HP"/>
 *             &lt;enumeration value="HH"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBooking", propOrder = {
    "carrier",
    "items",
    "hazards"
})
public class TBooking {

    @XmlElement(required = true)
    protected TCarrier carrier;
    protected TBooking.Items items;
    protected THazards hazards;
    @XmlAttribute(name = "client-ref-no")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String clientRefNo;
    @XmlAttribute(name = "consignee-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String consigneeId;
    @XmlAttribute(name = "consignee-name")
    protected String consigneeName;
    @XmlAttribute(name = "destination")
    @XmlSchemaType(name = "anySimpleType")
    protected String destination;
    @XmlAttribute(name = "eq-status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String eqStatus;
    @XmlAttribute(name = "hold-partials")
    protected String holdPartials;
    @XmlAttribute(name = "line", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String line;
    @XmlAttribute(name = "nbr", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String nbr;
    @XmlAttribute(name = "notes")
    @XmlSchemaType(name = "anySimpleType")
    protected String notes;
    @XmlAttribute(name = "ood")
    protected String ood;
    @XmlAttribute(name = "origin")
    @XmlSchemaType(name = "anySimpleType")
    protected String origin;
    @XmlAttribute(name = "override-cutoff")
    protected String overrideCutoff;
    @XmlAttribute(name = "pod-1")
    protected String pod1;
    @XmlAttribute(name = "pod-2")
    protected String pod2;
    @XmlAttribute(name = "pod-2-name")
    protected String pod2Name;
    @XmlAttribute(name = "pod-optional")
    protected String podOptional;
    @XmlAttribute(name = "pol")
    protected String pol;
    @XmlAttribute(name = "pol-name")
    protected String polName;
    @XmlAttribute(name = "prevent-type-subst")
    protected String preventTypeSubst;
    @XmlAttribute(name = "created-by")
    protected String createdBy;
    @XmlAttribute(name = "created-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlAttribute(name = "modified-by")
    protected String modifiedBy;
    @XmlAttribute(name = "modified-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlAttribute(name = "shipper-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String shipperId;
    @XmlAttribute(name = "shipper-name")
    protected String shipperName;
    @XmlAttribute(name = "trucking-co-id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String truckingCoId;
    @XmlAttribute(name = "trucking-co-name")
    protected String truckingCoName;
    @XmlAttribute(name = "stow-block")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String stowBlock;
    @XmlAttribute(name = "special-stow")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String specialStow;
    @XmlAttribute(name = "agent-id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String agentId;
    @XmlAttribute(name = "dispatch-reserved")
    protected String dispatchReserved;
    @XmlAttribute(name = "owned-or-leased")
    protected String ownedOrLeased;
    @XmlAttribute(name = "empty-pickup-location")
    protected String emptyPickupLocation;
    @XmlAttribute(name = "full-return-location")
    protected String fullReturnLocation;
    @XmlAttribute(name = "category")
    protected TCategory category;
    @XmlAttribute(name = "stuffing-location")
    protected String stuffingLocation;
    @XmlAttribute(name = "dray-off")
    protected String drayOff;
    @XmlAttribute(name = "earliest-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestDate;
    @XmlAttribute(name = "estimated-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDate;
    @XmlAttribute(name = "ignore-damages")
    protected Boolean ignoreDamages;
    @XmlAttribute(name = "ignore-holds")
    protected Boolean ignoreHolds;
    @XmlAttribute(name = "latest-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestDate;
    @XmlAttribute(name = "military-tcn")
    protected String militaryTcn;
    @XmlAttribute(name = "service-type")
    protected String serviceType;
    @XmlAttribute(name = "shipping-mode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shippingMode;
    @XmlAttribute(name = "quantity")
    protected BigInteger quantity;

    /**
     * Obtiene el valor de la propiedad carrier.
     * 
     * @return
     *     possible object is
     *     {@link TCarrier }
     *     
     */
    public TCarrier getCarrier() {
        return carrier;
    }

    /**
     * Define el valor de la propiedad carrier.
     * 
     * @param value
     *     allowed object is
     *     {@link TCarrier }
     *     
     */
    public void setCarrier(TCarrier value) {
        this.carrier = value;
    }

    /**
     * Obtiene el valor de la propiedad items.
     * 
     * @return
     *     possible object is
     *     {@link TBooking.Items }
     *     
     */
    public TBooking.Items getItems() {
        return items;
    }

    /**
     * Define el valor de la propiedad items.
     * 
     * @param value
     *     allowed object is
     *     {@link TBooking.Items }
     *     
     */
    public void setItems(TBooking.Items value) {
        this.items = value;
    }

    /**
     * Obtiene el valor de la propiedad hazards.
     * 
     * @return
     *     possible object is
     *     {@link THazards }
     *     
     */
    public THazards getHazards() {
        return hazards;
    }

    /**
     * Define el valor de la propiedad hazards.
     * 
     * @param value
     *     allowed object is
     *     {@link THazards }
     *     
     */
    public void setHazards(THazards value) {
        this.hazards = value;
    }

    /**
     * Obtiene el valor de la propiedad clientRefNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRefNo() {
        return clientRefNo;
    }

    /**
     * Define el valor de la propiedad clientRefNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRefNo(String value) {
        this.clientRefNo = value;
    }

    /**
     * Obtiene el valor de la propiedad consigneeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeId() {
        return consigneeId;
    }

    /**
     * Define el valor de la propiedad consigneeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeId(String value) {
        this.consigneeId = value;
    }

    /**
     * Obtiene el valor de la propiedad consigneeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * Define el valor de la propiedad consigneeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeName(String value) {
        this.consigneeName = value;
    }

    /**
     * Obtiene el valor de la propiedad destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Define el valor de la propiedad destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Obtiene el valor de la propiedad eqStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqStatus() {
        return eqStatus;
    }

    /**
     * Define el valor de la propiedad eqStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqStatus(String value) {
        this.eqStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad holdPartials.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldPartials() {
        return holdPartials;
    }

    /**
     * Define el valor de la propiedad holdPartials.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldPartials(String value) {
        this.holdPartials = value;
    }

    /**
     * Obtiene el valor de la propiedad line.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine() {
        return line;
    }

    /**
     * Define el valor de la propiedad line.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine(String value) {
        this.line = value;
    }

    /**
     * Obtiene el valor de la propiedad nbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbr() {
        return nbr;
    }

    /**
     * Define el valor de la propiedad nbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbr(String value) {
        this.nbr = value;
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
     * Obtiene el valor de la propiedad ood.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOod() {
        return ood;
    }

    /**
     * Define el valor de la propiedad ood.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOod(String value) {
        this.ood = value;
    }

    /**
     * Obtiene el valor de la propiedad origin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Define el valor de la propiedad origin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Obtiene el valor de la propiedad overrideCutoff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideCutoff() {
        return overrideCutoff;
    }

    /**
     * Define el valor de la propiedad overrideCutoff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideCutoff(String value) {
        this.overrideCutoff = value;
    }

    /**
     * Obtiene el valor de la propiedad pod1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPod1() {
        return pod1;
    }

    /**
     * Define el valor de la propiedad pod1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPod1(String value) {
        this.pod1 = value;
    }

    /**
     * Obtiene el valor de la propiedad pod2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPod2() {
        return pod2;
    }

    /**
     * Define el valor de la propiedad pod2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPod2(String value) {
        this.pod2 = value;
    }

    /**
     * Obtiene el valor de la propiedad pod2Name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPod2Name() {
        return pod2Name;
    }

    /**
     * Define el valor de la propiedad pod2Name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPod2Name(String value) {
        this.pod2Name = value;
    }

    /**
     * Obtiene el valor de la propiedad podOptional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodOptional() {
        return podOptional;
    }

    /**
     * Define el valor de la propiedad podOptional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodOptional(String value) {
        this.podOptional = value;
    }

    /**
     * Obtiene el valor de la propiedad pol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPol() {
        return pol;
    }

    /**
     * Define el valor de la propiedad pol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPol(String value) {
        this.pol = value;
    }

    /**
     * Obtiene el valor de la propiedad polName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolName() {
        return polName;
    }

    /**
     * Define el valor de la propiedad polName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolName(String value) {
        this.polName = value;
    }

    /**
     * Obtiene el valor de la propiedad preventTypeSubst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreventTypeSubst() {
        return preventTypeSubst;
    }

    /**
     * Define el valor de la propiedad preventTypeSubst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreventTypeSubst(String value) {
        this.preventTypeSubst = value;
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
     * Obtiene el valor de la propiedad shipperId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperId() {
        return shipperId;
    }

    /**
     * Define el valor de la propiedad shipperId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperId(String value) {
        this.shipperId = value;
    }

    /**
     * Obtiene el valor de la propiedad shipperName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperName() {
        return shipperName;
    }

    /**
     * Define el valor de la propiedad shipperName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperName(String value) {
        this.shipperName = value;
    }

    /**
     * Obtiene el valor de la propiedad truckingCoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckingCoId() {
        return truckingCoId;
    }

    /**
     * Define el valor de la propiedad truckingCoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckingCoId(String value) {
        this.truckingCoId = value;
    }

    /**
     * Obtiene el valor de la propiedad truckingCoName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckingCoName() {
        return truckingCoName;
    }

    /**
     * Define el valor de la propiedad truckingCoName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckingCoName(String value) {
        this.truckingCoName = value;
    }

    /**
     * Obtiene el valor de la propiedad stowBlock.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStowBlock() {
        return stowBlock;
    }

    /**
     * Define el valor de la propiedad stowBlock.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStowBlock(String value) {
        this.stowBlock = value;
    }

    /**
     * Obtiene el valor de la propiedad specialStow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialStow() {
        return specialStow;
    }

    /**
     * Define el valor de la propiedad specialStow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialStow(String value) {
        this.specialStow = value;
    }

    /**
     * Obtiene el valor de la propiedad agentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Define el valor de la propiedad agentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * Obtiene el valor de la propiedad dispatchReserved.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchReserved() {
        return dispatchReserved;
    }

    /**
     * Define el valor de la propiedad dispatchReserved.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchReserved(String value) {
        this.dispatchReserved = value;
    }

    /**
     * Obtiene el valor de la propiedad ownedOrLeased.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnedOrLeased() {
        return ownedOrLeased;
    }

    /**
     * Define el valor de la propiedad ownedOrLeased.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnedOrLeased(String value) {
        this.ownedOrLeased = value;
    }

    /**
     * Obtiene el valor de la propiedad emptyPickupLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyPickupLocation() {
        return emptyPickupLocation;
    }

    /**
     * Define el valor de la propiedad emptyPickupLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyPickupLocation(String value) {
        this.emptyPickupLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad fullReturnLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullReturnLocation() {
        return fullReturnLocation;
    }

    /**
     * Define el valor de la propiedad fullReturnLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullReturnLocation(String value) {
        this.fullReturnLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link TCategory }
     *     
     */
    public TCategory getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link TCategory }
     *     
     */
    public void setCategory(TCategory value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad stuffingLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuffingLocation() {
        return stuffingLocation;
    }

    /**
     * Define el valor de la propiedad stuffingLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuffingLocation(String value) {
        this.stuffingLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad drayOff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrayOff() {
        return drayOff;
    }

    /**
     * Define el valor de la propiedad drayOff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrayOff(String value) {
        this.drayOff = value;
    }

    /**
     * Obtiene el valor de la propiedad earliestDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestDate() {
        return earliestDate;
    }

    /**
     * Define el valor de la propiedad earliestDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestDate(XMLGregorianCalendar value) {
        this.earliestDate = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDate() {
        return estimatedDate;
    }

    /**
     * Define el valor de la propiedad estimatedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDate(XMLGregorianCalendar value) {
        this.estimatedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad ignoreDamages.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreDamages() {
        return ignoreDamages;
    }

    /**
     * Define el valor de la propiedad ignoreDamages.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreDamages(Boolean value) {
        this.ignoreDamages = value;
    }

    /**
     * Obtiene el valor de la propiedad ignoreHolds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreHolds() {
        return ignoreHolds;
    }

    /**
     * Define el valor de la propiedad ignoreHolds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreHolds(Boolean value) {
        this.ignoreHolds = value;
    }

    /**
     * Obtiene el valor de la propiedad latestDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestDate() {
        return latestDate;
    }

    /**
     * Define el valor de la propiedad latestDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestDate(XMLGregorianCalendar value) {
        this.latestDate = value;
    }

    /**
     * Obtiene el valor de la propiedad militaryTcn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryTcn() {
        return militaryTcn;
    }

    /**
     * Define el valor de la propiedad militaryTcn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryTcn(String value) {
        this.militaryTcn = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Define el valor de la propiedad serviceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMode() {
        return shippingMode;
    }

    /**
     * Define el valor de la propiedad shippingMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMode(String value) {
        this.shippingMode = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
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
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0" form="unqualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="reefer" type="{http://www.navis.com/argo}tBaseReeferRequirements" minOccurs="0"/>
     *                   &lt;element name="oog" type="{http://www.navis.com/argo}tEqoiOog" minOccurs="0"/>
     *                   &lt;element name="received-containers" type="{http://www.navis.com/argo}tRecvCtrs" minOccurs="0"/>
     *                   &lt;element name="delivered-containers" type="{http://www.navis.com/argo}tDeliCtrs" minOccurs="0"/>
     *                   &lt;element name="reserved-containers" type="{http://www.navis.com/argo}tResCtrs" minOccurs="0"/>
     *                   &lt;element name="hazards" type="{http://www.navis.com/argo}tHazards" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="commodity-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="commodity-name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="eq-height" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="40"/>
     *                       &lt;enumeration value="43"/>
     *                       &lt;enumeration value="80"/>
     *                       &lt;enumeration value="86"/>
     *                       &lt;enumeration value="90"/>
     *                       &lt;enumeration value="96"/>
     *                       &lt;enumeration value="NA"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="eq-iso-group" use="required" type="{http://www.navis.com/argo}tIsoGroup" />
     *                 &lt;attribute name="eq-iso-group-description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="acc-type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
     *                       &lt;enumeration value="UNKNOWN"/>
     *                       &lt;enumeration value="GENSET_NOSE_MOUNT"/>
     *                       &lt;enumeration value="GENSET_UNDERSLUNG"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="eq-grade" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                 &lt;attribute name="eq-material" type="{http://www.navis.com/argo}tMaterial" />
     *                 &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="modified-by" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="modified-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="eq-size" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="20"/>
     *                       &lt;enumeration value="40"/>
     *                       &lt;enumeration value="45"/>
     *                       &lt;enumeration value="24"/>
     *                       &lt;enumeration value="30"/>
     *                       &lt;enumeration value="48"/>
     *                       &lt;enumeration value="53"/>
     *                       &lt;enumeration value="XX"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="gross-weight" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="qty" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="tally" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="tally-limit" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="feature-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                 &lt;attribute name="equipment-type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="equip-type-description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="seq-nbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="update-mode" type="{http://www.navis.com/argo}tUpdateMode" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Items {

        protected List<TBooking.Items.Item> item;
        @XmlAttribute(name = "update-mode")
        protected TUpdateMode updateMode;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TBooking.Items.Item }
         * 
         * 
         */
        public List<TBooking.Items.Item> getItem() {
            if (item == null) {
                item = new ArrayList<TBooking.Items.Item>();
            }
            return this.item;
        }

        /**
         * Obtiene el valor de la propiedad updateMode.
         * 
         * @return
         *     possible object is
         *     {@link TUpdateMode }
         *     
         */
        public TUpdateMode getUpdateMode() {
            return updateMode;
        }

        /**
         * Define el valor de la propiedad updateMode.
         * 
         * @param value
         *     allowed object is
         *     {@link TUpdateMode }
         *     
         */
        public void setUpdateMode(TUpdateMode value) {
            this.updateMode = value;
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
         *         &lt;element name="reefer" type="{http://www.navis.com/argo}tBaseReeferRequirements" minOccurs="0"/>
         *         &lt;element name="oog" type="{http://www.navis.com/argo}tEqoiOog" minOccurs="0"/>
         *         &lt;element name="received-containers" type="{http://www.navis.com/argo}tRecvCtrs" minOccurs="0"/>
         *         &lt;element name="delivered-containers" type="{http://www.navis.com/argo}tDeliCtrs" minOccurs="0"/>
         *         &lt;element name="reserved-containers" type="{http://www.navis.com/argo}tResCtrs" minOccurs="0"/>
         *         &lt;element name="hazards" type="{http://www.navis.com/argo}tHazards" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="commodity-id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="commodity-name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="eq-height" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="40"/>
         *             &lt;enumeration value="43"/>
         *             &lt;enumeration value="80"/>
         *             &lt;enumeration value="86"/>
         *             &lt;enumeration value="90"/>
         *             &lt;enumeration value="96"/>
         *             &lt;enumeration value="NA"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="eq-iso-group" use="required" type="{http://www.navis.com/argo}tIsoGroup" />
         *       &lt;attribute name="eq-iso-group-description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="acc-type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
         *             &lt;enumeration value="UNKNOWN"/>
         *             &lt;enumeration value="GENSET_NOSE_MOUNT"/>
         *             &lt;enumeration value="GENSET_UNDERSLUNG"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="eq-grade" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *       &lt;attribute name="eq-material" type="{http://www.navis.com/argo}tMaterial" />
         *       &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="modified-by" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="modified-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="eq-size" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="20"/>
         *             &lt;enumeration value="40"/>
         *             &lt;enumeration value="45"/>
         *             &lt;enumeration value="24"/>
         *             &lt;enumeration value="30"/>
         *             &lt;enumeration value="48"/>
         *             &lt;enumeration value="53"/>
         *             &lt;enumeration value="XX"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="gross-weight" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="qty" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="tally" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="tally-limit" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="feature-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *       &lt;attribute name="equipment-type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="equip-type-description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="seq-nbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "reefer",
            "oog",
            "receivedContainers",
            "deliveredContainers",
            "reservedContainers",
            "hazards"
        })
        public static class Item {

            protected TBaseReeferRequirements reefer;
            protected TEqoiOog oog;
            @XmlElement(name = "received-containers")
            protected TRecvCtrs receivedContainers;
            @XmlElement(name = "delivered-containers")
            protected TDeliCtrs deliveredContainers;
            @XmlElement(name = "reserved-containers")
            protected TResCtrs reservedContainers;
            protected THazards hazards;
            @XmlAttribute(name = "commodity-id")
            protected String commodityId;
            @XmlAttribute(name = "commodity-name")
            protected String commodityName;
            @XmlAttribute(name = "eq-height", required = true)
            protected String eqHeight;
            @XmlAttribute(name = "eq-iso-group", required = true)
            protected TIsoGroup eqIsoGroup;
            @XmlAttribute(name = "eq-iso-group-description")
            protected String eqIsoGroupDescription;
            @XmlAttribute(name = "acc-type")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String accType;
            @XmlAttribute(name = "eq-grade")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String eqGrade;
            @XmlAttribute(name = "eq-material")
            protected TMaterial eqMaterial;
            @XmlAttribute(name = "remarks")
            protected String remarks;
            @XmlAttribute(name = "created-by")
            protected String createdBy;
            @XmlAttribute(name = "created-date")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdDate;
            @XmlAttribute(name = "modified-by")
            protected String modifiedBy;
            @XmlAttribute(name = "modified-date")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modifiedDate;
            @XmlAttribute(name = "eq-size", required = true)
            protected String eqSize;
            @XmlAttribute(name = "gross-weight")
            protected BigDecimal grossWeight;
            @XmlAttribute(name = "qty")
            protected BigInteger qty;
            @XmlAttribute(name = "tally")
            protected BigInteger tally;
            @XmlAttribute(name = "tally-limit")
            protected BigInteger tallyLimit;
            @XmlAttribute(name = "feature-id")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String featureId;
            @XmlAttribute(name = "equipment-type")
            protected String equipmentType;
            @XmlAttribute(name = "equip-type-description")
            protected String equipTypeDescription;
            @XmlAttribute(name = "seq-nbr")
            protected BigInteger seqNbr;

            /**
             * Obtiene el valor de la propiedad reefer.
             * 
             * @return
             *     possible object is
             *     {@link TBaseReeferRequirements }
             *     
             */
            public TBaseReeferRequirements getReefer() {
                return reefer;
            }

            /**
             * Define el valor de la propiedad reefer.
             * 
             * @param value
             *     allowed object is
             *     {@link TBaseReeferRequirements }
             *     
             */
            public void setReefer(TBaseReeferRequirements value) {
                this.reefer = value;
            }

            /**
             * Obtiene el valor de la propiedad oog.
             * 
             * @return
             *     possible object is
             *     {@link TEqoiOog }
             *     
             */
            public TEqoiOog getOog() {
                return oog;
            }

            /**
             * Define el valor de la propiedad oog.
             * 
             * @param value
             *     allowed object is
             *     {@link TEqoiOog }
             *     
             */
            public void setOog(TEqoiOog value) {
                this.oog = value;
            }

            /**
             * Obtiene el valor de la propiedad receivedContainers.
             * 
             * @return
             *     possible object is
             *     {@link TRecvCtrs }
             *     
             */
            public TRecvCtrs getReceivedContainers() {
                return receivedContainers;
            }

            /**
             * Define el valor de la propiedad receivedContainers.
             * 
             * @param value
             *     allowed object is
             *     {@link TRecvCtrs }
             *     
             */
            public void setReceivedContainers(TRecvCtrs value) {
                this.receivedContainers = value;
            }

            /**
             * Obtiene el valor de la propiedad deliveredContainers.
             * 
             * @return
             *     possible object is
             *     {@link TDeliCtrs }
             *     
             */
            public TDeliCtrs getDeliveredContainers() {
                return deliveredContainers;
            }

            /**
             * Define el valor de la propiedad deliveredContainers.
             * 
             * @param value
             *     allowed object is
             *     {@link TDeliCtrs }
             *     
             */
            public void setDeliveredContainers(TDeliCtrs value) {
                this.deliveredContainers = value;
            }

            /**
             * Obtiene el valor de la propiedad reservedContainers.
             * 
             * @return
             *     possible object is
             *     {@link TResCtrs }
             *     
             */
            public TResCtrs getReservedContainers() {
                return reservedContainers;
            }

            /**
             * Define el valor de la propiedad reservedContainers.
             * 
             * @param value
             *     allowed object is
             *     {@link TResCtrs }
             *     
             */
            public void setReservedContainers(TResCtrs value) {
                this.reservedContainers = value;
            }

            /**
             * Obtiene el valor de la propiedad hazards.
             * 
             * @return
             *     possible object is
             *     {@link THazards }
             *     
             */
            public THazards getHazards() {
                return hazards;
            }

            /**
             * Define el valor de la propiedad hazards.
             * 
             * @param value
             *     allowed object is
             *     {@link THazards }
             *     
             */
            public void setHazards(THazards value) {
                this.hazards = value;
            }

            /**
             * Obtiene el valor de la propiedad commodityId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommodityId() {
                return commodityId;
            }

            /**
             * Define el valor de la propiedad commodityId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommodityId(String value) {
                this.commodityId = value;
            }

            /**
             * Obtiene el valor de la propiedad commodityName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommodityName() {
                return commodityName;
            }

            /**
             * Define el valor de la propiedad commodityName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommodityName(String value) {
                this.commodityName = value;
            }

            /**
             * Obtiene el valor de la propiedad eqHeight.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEqHeight() {
                return eqHeight;
            }

            /**
             * Define el valor de la propiedad eqHeight.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEqHeight(String value) {
                this.eqHeight = value;
            }

            /**
             * Obtiene el valor de la propiedad eqIsoGroup.
             * 
             * @return
             *     possible object is
             *     {@link TIsoGroup }
             *     
             */
            public TIsoGroup getEqIsoGroup() {
                return eqIsoGroup;
            }

            /**
             * Define el valor de la propiedad eqIsoGroup.
             * 
             * @param value
             *     allowed object is
             *     {@link TIsoGroup }
             *     
             */
            public void setEqIsoGroup(TIsoGroup value) {
                this.eqIsoGroup = value;
            }

            /**
             * Obtiene el valor de la propiedad eqIsoGroupDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEqIsoGroupDescription() {
                return eqIsoGroupDescription;
            }

            /**
             * Define el valor de la propiedad eqIsoGroupDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEqIsoGroupDescription(String value) {
                this.eqIsoGroupDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad accType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccType() {
                return accType;
            }

            /**
             * Define el valor de la propiedad accType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccType(String value) {
                this.accType = value;
            }

            /**
             * Obtiene el valor de la propiedad eqGrade.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEqGrade() {
                return eqGrade;
            }

            /**
             * Define el valor de la propiedad eqGrade.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEqGrade(String value) {
                this.eqGrade = value;
            }

            /**
             * Obtiene el valor de la propiedad eqMaterial.
             * 
             * @return
             *     possible object is
             *     {@link TMaterial }
             *     
             */
            public TMaterial getEqMaterial() {
                return eqMaterial;
            }

            /**
             * Define el valor de la propiedad eqMaterial.
             * 
             * @param value
             *     allowed object is
             *     {@link TMaterial }
             *     
             */
            public void setEqMaterial(TMaterial value) {
                this.eqMaterial = value;
            }

            /**
             * Obtiene el valor de la propiedad remarks.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemarks() {
                return remarks;
            }

            /**
             * Define el valor de la propiedad remarks.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemarks(String value) {
                this.remarks = value;
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
             * Obtiene el valor de la propiedad eqSize.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEqSize() {
                return eqSize;
            }

            /**
             * Define el valor de la propiedad eqSize.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEqSize(String value) {
                this.eqSize = value;
            }

            /**
             * Obtiene el valor de la propiedad grossWeight.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getGrossWeight() {
                return grossWeight;
            }

            /**
             * Define el valor de la propiedad grossWeight.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setGrossWeight(BigDecimal value) {
                this.grossWeight = value;
            }

            /**
             * Obtiene el valor de la propiedad qty.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQty() {
                return qty;
            }

            /**
             * Define el valor de la propiedad qty.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQty(BigInteger value) {
                this.qty = value;
            }

            /**
             * Obtiene el valor de la propiedad tally.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTally() {
                return tally;
            }

            /**
             * Define el valor de la propiedad tally.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTally(BigInteger value) {
                this.tally = value;
            }

            /**
             * Obtiene el valor de la propiedad tallyLimit.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTallyLimit() {
                return tallyLimit;
            }

            /**
             * Define el valor de la propiedad tallyLimit.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTallyLimit(BigInteger value) {
                this.tallyLimit = value;
            }

            /**
             * Obtiene el valor de la propiedad featureId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeatureId() {
                return featureId;
            }

            /**
             * Define el valor de la propiedad featureId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeatureId(String value) {
                this.featureId = value;
            }

            /**
             * Obtiene el valor de la propiedad equipmentType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEquipmentType() {
                return equipmentType;
            }

            /**
             * Define el valor de la propiedad equipmentType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEquipmentType(String value) {
                this.equipmentType = value;
            }

            /**
             * Obtiene el valor de la propiedad equipTypeDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEquipTypeDescription() {
                return equipTypeDescription;
            }

            /**
             * Define el valor de la propiedad equipTypeDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEquipTypeDescription(String value) {
                this.equipTypeDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad seqNbr.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSeqNbr() {
                return seqNbr;
            }

            /**
             * Define el valor de la propiedad seqNbr.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSeqNbr(BigInteger value) {
                this.seqNbr = value;
            }

        }

    }

}
