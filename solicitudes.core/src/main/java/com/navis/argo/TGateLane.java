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
import javax.xml.bind.annotation.XmlType;


/**
 * Gate Lane
 * 
 * <p>Clase Java para tGateLane complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tGateLane">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gate-lane-printers" type="{http://www.navis.com/argo}tGateLanePrinters" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" use="required" type="{http://www.navis.com/argo}tGateLaneClass" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="truck-license-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pedestal-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="needs-appointment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="has-scale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-closed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGateLane", propOrder = {
    "gateLanePrinters"
})
public class TGateLane {

    @XmlElement(name = "gate-lane-printers")
    protected TGateLanePrinters gateLanePrinters;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "class", required = true)
    protected TGateLaneClass clazz;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "truck-license-nbr")
    protected String truckLicenseNbr;
    @XmlAttribute(name = "pedestal-id")
    protected String pedestalId;
    @XmlAttribute(name = "needs-appointment")
    protected String needsAppointment;
    @XmlAttribute(name = "has-scale")
    protected String hasScale;
    @XmlAttribute(name = "is-closed")
    protected String isClosed;

    /**
     * Obtiene el valor de la propiedad gateLanePrinters.
     * 
     * @return
     *     possible object is
     *     {@link TGateLanePrinters }
     *     
     */
    public TGateLanePrinters getGateLanePrinters() {
        return gateLanePrinters;
    }

    /**
     * Define el valor de la propiedad gateLanePrinters.
     * 
     * @param value
     *     allowed object is
     *     {@link TGateLanePrinters }
     *     
     */
    public void setGateLanePrinters(TGateLanePrinters value) {
        this.gateLanePrinters = value;
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
     * Obtiene el valor de la propiedad clazz.
     * 
     * @return
     *     possible object is
     *     {@link TGateLaneClass }
     *     
     */
    public TGateLaneClass getClazz() {
        return clazz;
    }

    /**
     * Define el valor de la propiedad clazz.
     * 
     * @param value
     *     allowed object is
     *     {@link TGateLaneClass }
     *     
     */
    public void setClazz(TGateLaneClass value) {
        this.clazz = value;
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
     * Obtiene el valor de la propiedad truckLicenseNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckLicenseNbr() {
        return truckLicenseNbr;
    }

    /**
     * Define el valor de la propiedad truckLicenseNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckLicenseNbr(String value) {
        this.truckLicenseNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad pedestalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedestalId() {
        return pedestalId;
    }

    /**
     * Define el valor de la propiedad pedestalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedestalId(String value) {
        this.pedestalId = value;
    }

    /**
     * Obtiene el valor de la propiedad needsAppointment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedsAppointment() {
        return needsAppointment;
    }

    /**
     * Define el valor de la propiedad needsAppointment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedsAppointment(String value) {
        this.needsAppointment = value;
    }

    /**
     * Obtiene el valor de la propiedad hasScale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasScale() {
        return hasScale;
    }

    /**
     * Define el valor de la propiedad hasScale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasScale(String value) {
        this.hasScale = value;
    }

    /**
     * Obtiene el valor de la propiedad isClosed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsClosed() {
        return isClosed;
    }

    /**
     * Define el valor de la propiedad isClosed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsClosed(String value) {
        this.isClosed = value;
    }

}
