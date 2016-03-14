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
 * Signals the movement of an existing Unit within the facility, or onto a carrier that is at
 *                 the facility.
 *             
 * 
 * <p>Clase Java para tMove complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tMove">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unit-identity" type="{http://www.navis.com/argo}tUnitIdentity"/>
 *         &lt;element name="to-position" type="{http://www.navis.com/argo}tPosition"/>
 *         &lt;element name="move-details" type="{http://www.navis.com/argo}tMoveDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="move-kind" type="{http://www.navis.com/argo}tMoveKind" />
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="is-correction-only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMove", propOrder = {
    "unitIdentity",
    "toPosition",
    "moveDetails"
})
public class TMove {

    @XmlElement(name = "unit-identity", required = true)
    protected TUnitIdentity unitIdentity;
    @XmlElement(name = "to-position", required = true)
    protected TPosition toPosition;
    @XmlElement(name = "move-details")
    protected TMoveDetails moveDetails;
    @XmlAttribute(name = "move-kind")
    protected TMoveKind moveKind;
    @XmlAttribute(name = "timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "is-correction-only")
    protected Boolean isCorrectionOnly;

    /**
     * Obtiene el valor de la propiedad unitIdentity.
     * 
     * @return
     *     possible object is
     *     {@link TUnitIdentity }
     *     
     */
    public TUnitIdentity getUnitIdentity() {
        return unitIdentity;
    }

    /**
     * Define el valor de la propiedad unitIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitIdentity }
     *     
     */
    public void setUnitIdentity(TUnitIdentity value) {
        this.unitIdentity = value;
    }

    /**
     * Obtiene el valor de la propiedad toPosition.
     * 
     * @return
     *     possible object is
     *     {@link TPosition }
     *     
     */
    public TPosition getToPosition() {
        return toPosition;
    }

    /**
     * Define el valor de la propiedad toPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link TPosition }
     *     
     */
    public void setToPosition(TPosition value) {
        this.toPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad moveDetails.
     * 
     * @return
     *     possible object is
     *     {@link TMoveDetails }
     *     
     */
    public TMoveDetails getMoveDetails() {
        return moveDetails;
    }

    /**
     * Define el valor de la propiedad moveDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link TMoveDetails }
     *     
     */
    public void setMoveDetails(TMoveDetails value) {
        this.moveDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad moveKind.
     * 
     * @return
     *     possible object is
     *     {@link TMoveKind }
     *     
     */
    public TMoveKind getMoveKind() {
        return moveKind;
    }

    /**
     * Define el valor de la propiedad moveKind.
     * 
     * @param value
     *     allowed object is
     *     {@link TMoveKind }
     *     
     */
    public void setMoveKind(TMoveKind value) {
        this.moveKind = value;
    }

    /**
     * Obtiene el valor de la propiedad timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Define el valor de la propiedad timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad isCorrectionOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCorrectionOnly() {
        return isCorrectionOnly;
    }

    /**
     * Define el valor de la propiedad isCorrectionOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCorrectionOnly(Boolean value) {
        this.isCorrectionOnly = value;
    }

}
