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
 * Upper Tier Restrictions
 * 
 * <p>Clase Java para tUpperTierRestrictions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tUpperTierRestrictions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="is-upper-20" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-upper-40" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-upper-45" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-upper-48" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-upper-53" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-upper-reefer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUpperTierRestrictions")
public class TUpperTierRestrictions {

    @XmlAttribute(name = "is-upper-20")
    protected String isUpper20;
    @XmlAttribute(name = "is-upper-40")
    protected String isUpper40;
    @XmlAttribute(name = "is-upper-45")
    protected String isUpper45;
    @XmlAttribute(name = "is-upper-48")
    protected String isUpper48;
    @XmlAttribute(name = "is-upper-53")
    protected String isUpper53;
    @XmlAttribute(name = "is-upper-reefer")
    protected String isUpperReefer;

    /**
     * Obtiene el valor de la propiedad isUpper20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUpper20() {
        return isUpper20;
    }

    /**
     * Define el valor de la propiedad isUpper20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUpper20(String value) {
        this.isUpper20 = value;
    }

    /**
     * Obtiene el valor de la propiedad isUpper40.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUpper40() {
        return isUpper40;
    }

    /**
     * Define el valor de la propiedad isUpper40.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUpper40(String value) {
        this.isUpper40 = value;
    }

    /**
     * Obtiene el valor de la propiedad isUpper45.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUpper45() {
        return isUpper45;
    }

    /**
     * Define el valor de la propiedad isUpper45.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUpper45(String value) {
        this.isUpper45 = value;
    }

    /**
     * Obtiene el valor de la propiedad isUpper48.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUpper48() {
        return isUpper48;
    }

    /**
     * Define el valor de la propiedad isUpper48.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUpper48(String value) {
        this.isUpper48 = value;
    }

    /**
     * Obtiene el valor de la propiedad isUpper53.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUpper53() {
        return isUpper53;
    }

    /**
     * Define el valor de la propiedad isUpper53.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUpper53(String value) {
        this.isUpper53 = value;
    }

    /**
     * Obtiene el valor de la propiedad isUpperReefer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUpperReefer() {
        return isUpperReefer;
    }

    /**
     * Define el valor de la propiedad isUpperReefer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUpperReefer(String value) {
        this.isUpperReefer = value;
    }

}
