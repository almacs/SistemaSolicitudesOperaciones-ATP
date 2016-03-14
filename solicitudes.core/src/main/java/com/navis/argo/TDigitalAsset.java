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
 * Digital Asset
 * 
 * <p>Clase Java para tDigitalAsset complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tDigitalAsset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="short-description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-pre-deployed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groovy-code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDigitalAsset")
public class TDigitalAsset {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "short-description")
    protected String shortDescription;
    @XmlAttribute(name = "is-pre-deployed")
    protected String isPreDeployed;
    @XmlAttribute(name = "groovy-code")
    protected String groovyCode;

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
     * Obtiene el valor de la propiedad shortDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Define el valor de la propiedad shortDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad isPreDeployed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPreDeployed() {
        return isPreDeployed;
    }

    /**
     * Define el valor de la propiedad isPreDeployed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPreDeployed(String value) {
        this.isPreDeployed = value;
    }

    /**
     * Obtiene el valor de la propiedad groovyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroovyCode() {
        return groovyCode;
    }

    /**
     * Define el valor de la propiedad groovyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroovyCode(String value) {
        this.groovyCode = value;
    }

}
