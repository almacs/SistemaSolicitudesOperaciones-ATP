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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Servcie Order
 * 
 * <p>Clase Java para tServiceOrder complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tServiceOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bill-of-ladding" type="{http://www.navis.com/argo}tSOBillOfLading" minOccurs="0" form="unqualified"/>
 *         &lt;element name="booking" type="{http://www.navis.com/argo}tSOBkg" minOccurs="0" form="unqualified"/>
 *         &lt;element name="items" type="{http://www.navis.com/argo}tSOItems" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="service-order-number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="billing-party" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="order-line" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="start-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="completion-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.navis.com/argo}tServiceOrderStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tServiceOrder", propOrder = {
    "billOfLadding",
    "booking",
    "items"
})
public class TServiceOrder {

    @XmlElement(name = "bill-of-ladding")
    protected TSOBillOfLading billOfLadding;
    protected TSOBkg booking;
    protected TSOItems items;
    @XmlAttribute(name = "service-order-number", required = true)
    protected String serviceOrderNumber;
    @XmlAttribute(name = "billing-party", required = true)
    protected String billingParty;
    @XmlAttribute(name = "order-line")
    protected String orderLine;
    @XmlAttribute(name = "start-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "completion-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionDate;
    @XmlAttribute(name = "notes")
    protected String notes;
    @XmlAttribute(name = "status")
    protected TServiceOrderStatus status;

    /**
     * Obtiene el valor de la propiedad billOfLadding.
     * 
     * @return
     *     possible object is
     *     {@link TSOBillOfLading }
     *     
     */
    public TSOBillOfLading getBillOfLadding() {
        return billOfLadding;
    }

    /**
     * Define el valor de la propiedad billOfLadding.
     * 
     * @param value
     *     allowed object is
     *     {@link TSOBillOfLading }
     *     
     */
    public void setBillOfLadding(TSOBillOfLading value) {
        this.billOfLadding = value;
    }

    /**
     * Obtiene el valor de la propiedad booking.
     * 
     * @return
     *     possible object is
     *     {@link TSOBkg }
     *     
     */
    public TSOBkg getBooking() {
        return booking;
    }

    /**
     * Define el valor de la propiedad booking.
     * 
     * @param value
     *     allowed object is
     *     {@link TSOBkg }
     *     
     */
    public void setBooking(TSOBkg value) {
        this.booking = value;
    }

    /**
     * Obtiene el valor de la propiedad items.
     * 
     * @return
     *     possible object is
     *     {@link TSOItems }
     *     
     */
    public TSOItems getItems() {
        return items;
    }

    /**
     * Define el valor de la propiedad items.
     * 
     * @param value
     *     allowed object is
     *     {@link TSOItems }
     *     
     */
    public void setItems(TSOItems value) {
        this.items = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceOrderNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrderNumber() {
        return serviceOrderNumber;
    }

    /**
     * Define el valor de la propiedad serviceOrderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrderNumber(String value) {
        this.serviceOrderNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad billingParty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingParty() {
        return billingParty;
    }

    /**
     * Define el valor de la propiedad billingParty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingParty(String value) {
        this.billingParty = value;
    }

    /**
     * Obtiene el valor de la propiedad orderLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLine() {
        return orderLine;
    }

    /**
     * Define el valor de la propiedad orderLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLine(String value) {
        this.orderLine = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad completionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDate() {
        return completionDate;
    }

    /**
     * Define el valor de la propiedad completionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDate(XMLGregorianCalendar value) {
        this.completionDate = value;
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
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link TServiceOrderStatus }
     *     
     */
    public TServiceOrderStatus getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link TServiceOrderStatus }
     *     
     */
    public void setStatus(TServiceOrderStatus value) {
        this.status = value;
    }

}
