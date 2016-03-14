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
import javax.xml.bind.annotation.XmlType;


/**
 * Lower Tier Restrictions
 * 
 * <p>Clase Java para tLowerTierRestrictions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tLowerTierRestrictions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="is-lower-20" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-lower-40" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-lower-45" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-lower-48" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-lower-53" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-lower-reefer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLowerTierRestrictions")
public class TLowerTierRestrictions {

    @XmlAttribute(name = "is-lower-20")
    protected String isLower20;
    @XmlAttribute(name = "is-lower-40")
    protected String isLower40;
    @XmlAttribute(name = "is-lower-45")
    protected String isLower45;
    @XmlAttribute(name = "is-lower-48")
    protected String isLower48;
    @XmlAttribute(name = "is-lower-53")
    protected String isLower53;
    @XmlAttribute(name = "is-lower-reefer")
    protected String isLowerReefer;

    /**
     * Obtiene el valor de la propiedad isLower20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLower20() {
        return isLower20;
    }

    /**
     * Define el valor de la propiedad isLower20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLower20(String value) {
        this.isLower20 = value;
    }

    /**
     * Obtiene el valor de la propiedad isLower40.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLower40() {
        return isLower40;
    }

    /**
     * Define el valor de la propiedad isLower40.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLower40(String value) {
        this.isLower40 = value;
    }

    /**
     * Obtiene el valor de la propiedad isLower45.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLower45() {
        return isLower45;
    }

    /**
     * Define el valor de la propiedad isLower45.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLower45(String value) {
        this.isLower45 = value;
    }

    /**
     * Obtiene el valor de la propiedad isLower48.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLower48() {
        return isLower48;
    }

    /**
     * Define el valor de la propiedad isLower48.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLower48(String value) {
        this.isLower48 = value;
    }

    /**
     * Obtiene el valor de la propiedad isLower53.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLower53() {
        return isLower53;
    }

    /**
     * Define el valor de la propiedad isLower53.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLower53(String value) {
        this.isLower53 = value;
    }

    /**
     * Obtiene el valor de la propiedad isLowerReefer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLowerReefer() {
        return isLowerReefer;
    }

    /**
     * Define el valor de la propiedad isLowerReefer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLowerReefer(String value) {
        this.isLowerReefer = value;
    }

}
