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
 * <p>Clase Java para BundleType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BundleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="bundle-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eq-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleType")
public class BundleType {

    @XmlAttribute(name = "bundle-nbr")
    protected String bundleNbr;
    @XmlAttribute(name = "eq-type")
    protected String eqType;

    /**
     * Obtiene el valor de la propiedad bundleNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleNbr() {
        return bundleNbr;
    }

    /**
     * Define el valor de la propiedad bundleNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleNbr(String value) {
        this.bundleNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad eqType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqType() {
        return eqType;
    }

    /**
     * Define el valor de la propiedad eqType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqType(String value) {
        this.eqType = value;
    }

}
