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
 * <p>Clase Java para tUfvTimestamps complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tUfvTimestamps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="time-in" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-out" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-load" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-last-move" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUfvTimestamps")
public class TUfvTimestamps {

    @XmlAttribute(name = "time-in")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeIn;
    @XmlAttribute(name = "time-out")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeOut;
    @XmlAttribute(name = "time-load")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLoad;
    @XmlAttribute(name = "time-last-move")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLastMove;

    /**
     * Obtiene el valor de la propiedad timeIn.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeIn() {
        return timeIn;
    }

    /**
     * Define el valor de la propiedad timeIn.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeIn(XMLGregorianCalendar value) {
        this.timeIn = value;
    }

    /**
     * Obtiene el valor de la propiedad timeOut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOut() {
        return timeOut;
    }

    /**
     * Define el valor de la propiedad timeOut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOut(XMLGregorianCalendar value) {
        this.timeOut = value;
    }

    /**
     * Obtiene el valor de la propiedad timeLoad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLoad() {
        return timeLoad;
    }

    /**
     * Define el valor de la propiedad timeLoad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLoad(XMLGregorianCalendar value) {
        this.timeLoad = value;
    }

    /**
     * Obtiene el valor de la propiedad timeLastMove.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLastMove() {
        return timeLastMove;
    }

    /**
     * Define el valor de la propiedad timeLastMove.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLastMove(XMLGregorianCalendar value) {
        this.timeLastMove = value;
    }

}
