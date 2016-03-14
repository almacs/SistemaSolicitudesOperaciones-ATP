//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tEro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tEro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="items" type="{http://www.navis.com/argo}tOrderItems" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="line" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="estimated-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="earliest-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="latest-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="prevent-type-subst" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eq-status" type="{http://www.navis.com/argo}tEquipStatus" />
 *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEro", propOrder = {
    "items"
})
public class TEro {

    protected TOrderItems items;
    @XmlAttribute(name = "number", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String number;
    @XmlAttribute(name = "line", required = true)
    protected String line;
    @XmlAttribute(name = "agent")
    protected String agent;
    @XmlAttribute(name = "estimated-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDate;
    @XmlAttribute(name = "earliest-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestDate;
    @XmlAttribute(name = "latest-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestDate;
    @XmlAttribute(name = "prevent-type-subst")
    protected String preventTypeSubst;
    @XmlAttribute(name = "eq-status")
    protected TEquipStatus eqStatus;
    @XmlAttribute(name = "notes")
    @XmlSchemaType(name = "anySimpleType")
    protected String notes;
    @XmlAttribute(name = "quantity")
    protected BigInteger quantity;

    /**
     * Obtiene el valor de la propiedad items.
     * 
     * @return
     *     possible object is
     *     {@link TOrderItems }
     *     
     */
    public TOrderItems getItems() {
        return items;
    }

    /**
     * Define el valor de la propiedad items.
     * 
     * @param value
     *     allowed object is
     *     {@link TOrderItems }
     *     
     */
    public void setItems(TOrderItems value) {
        this.items = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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
     * Obtiene el valor de la propiedad agent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Define el valor de la propiedad agent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(String value) {
        this.agent = value;
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
     * Obtiene el valor de la propiedad eqStatus.
     * 
     * @return
     *     possible object is
     *     {@link TEquipStatus }
     *     
     */
    public TEquipStatus getEqStatus() {
        return eqStatus;
    }

    /**
     * Define el valor de la propiedad eqStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link TEquipStatus }
     *     
     */
    public void setEqStatus(TEquipStatus value) {
        this.eqStatus = value;
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

}
