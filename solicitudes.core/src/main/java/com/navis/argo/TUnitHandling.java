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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tUnitHandling complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tUnitHandling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="special-stow" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="deck-requirement" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="last-free-day" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUnitHandling")
public class TUnitHandling {

    @XmlAttribute(name = "special-stow")
    protected String specialStow;
    @XmlAttribute(name = "deck-requirement")
    @XmlSchemaType(name = "anySimpleType")
    protected String deckRequirement;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "last-free-day")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastFreeDay;

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
     * Obtiene el valor de la propiedad deckRequirement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckRequirement() {
        return deckRequirement;
    }

    /**
     * Define el valor de la propiedad deckRequirement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckRequirement(String value) {
        this.deckRequirement = value;
    }

    /**
     * Obtiene el valor de la propiedad remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Define el valor de la propiedad remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Obtiene el valor de la propiedad lastFreeDay.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastFreeDay() {
        return lastFreeDay;
    }

    /**
     * Define el valor de la propiedad lastFreeDay.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastFreeDay(XMLGregorianCalendar value) {
        this.lastFreeDay = value;
    }

}
