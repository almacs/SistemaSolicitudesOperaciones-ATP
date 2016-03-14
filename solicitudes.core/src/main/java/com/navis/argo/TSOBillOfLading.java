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
 * Bill Of Lading
 * 
 * <p>Clase Java para tSOBillOfLading complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tSOBillOfLading">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="bl-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bl-line" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bl-carrier-visit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSOBillOfLading")
public class TSOBillOfLading {

    @XmlAttribute(name = "bl-nbr")
    protected String blNbr;
    @XmlAttribute(name = "bl-line")
    protected String blLine;
    @XmlAttribute(name = "bl-carrier-visit")
    protected String blCarrierVisit;

    /**
     * Obtiene el valor de la propiedad blNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlNbr() {
        return blNbr;
    }

    /**
     * Define el valor de la propiedad blNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlNbr(String value) {
        this.blNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad blLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlLine() {
        return blLine;
    }

    /**
     * Define el valor de la propiedad blLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlLine(String value) {
        this.blLine = value;
    }

    /**
     * Obtiene el valor de la propiedad blCarrierVisit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlCarrierVisit() {
        return blCarrierVisit;
    }

    /**
     * Define el valor de la propiedad blCarrierVisit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlCarrierVisit(String value) {
        this.blCarrierVisit = value;
    }

}
