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
 * Configuration setting
 * 
 * <p>Clase Java para tConfigSetting complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tConfigSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scope-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="string-value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="large-string-value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tConfigSetting")
public class TConfigSetting {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "scope-id")
    protected String scopeId;
    @XmlAttribute(name = "string-value")
    protected String stringValue;
    @XmlAttribute(name = "large-string-value")
    protected String largeStringValue;

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
     * Obtiene el valor de la propiedad scopeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeId() {
        return scopeId;
    }

    /**
     * Define el valor de la propiedad scopeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeId(String value) {
        this.scopeId = value;
    }

    /**
     * Obtiene el valor de la propiedad stringValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Define el valor de la propiedad stringValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Obtiene el valor de la propiedad largeStringValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargeStringValue() {
        return largeStringValue;
    }

    /**
     * Define el valor de la propiedad largeStringValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargeStringValue(String value) {
        this.largeStringValue = value;
    }

}
