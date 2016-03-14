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
 * Jms Connection
 * 
 * <p>Clase Java para tJmsConnection complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tJmsConnection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="in-uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="out-uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="poll-in-uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="provider-url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="poll-frequency" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="provider">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ACTIVE_MQ"/>
 *             &lt;enumeration value="WEBLOGIC"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tJmsConnection")
public class TJmsConnection {

    @XmlAttribute(name = "in-uri")
    protected String inUri;
    @XmlAttribute(name = "out-uri")
    protected String outUri;
    @XmlAttribute(name = "poll-in-uri")
    protected String pollInUri;
    @XmlAttribute(name = "provider-url")
    protected String providerUrl;
    @XmlAttribute(name = "poll-frequency")
    protected Long pollFrequency;
    @XmlAttribute(name = "provider")
    protected String provider;

    /**
     * Obtiene el valor de la propiedad inUri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUri() {
        return inUri;
    }

    /**
     * Define el valor de la propiedad inUri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUri(String value) {
        this.inUri = value;
    }

    /**
     * Obtiene el valor de la propiedad outUri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUri() {
        return outUri;
    }

    /**
     * Define el valor de la propiedad outUri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUri(String value) {
        this.outUri = value;
    }

    /**
     * Obtiene el valor de la propiedad pollInUri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollInUri() {
        return pollInUri;
    }

    /**
     * Define el valor de la propiedad pollInUri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollInUri(String value) {
        this.pollInUri = value;
    }

    /**
     * Obtiene el valor de la propiedad providerUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderUrl() {
        return providerUrl;
    }

    /**
     * Define el valor de la propiedad providerUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderUrl(String value) {
        this.providerUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad pollFrequency.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPollFrequency() {
        return pollFrequency;
    }

    /**
     * Define el valor de la propiedad pollFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPollFrequency(Long value) {
        this.pollFrequency = value;
    }

    /**
     * Obtiene el valor de la propiedad provider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Define el valor de la propiedad provider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

}
