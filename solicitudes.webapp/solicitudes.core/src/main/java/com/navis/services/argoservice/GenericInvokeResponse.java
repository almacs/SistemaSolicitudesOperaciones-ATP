//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.25 at 02:28:10 PM CST 
//


package com.navis.services.argoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.navis.argo.webservice.types.v1.GenericInvokeResponseWsType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genericInvokeResponse" type="{http://types.webservice.argo.navis.com/v1.0}GenericInvokeResponseWsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "genericInvokeResponse"
})
@XmlRootElement(name = "genericInvokeResponse")
public class GenericInvokeResponse {

    @XmlElement(required = true)
    protected GenericInvokeResponseWsType genericInvokeResponse;

    /**
     * Gets the value of the genericInvokeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GenericInvokeResponseWsType }
     *     
     */
    public GenericInvokeResponseWsType getGenericInvokeResponse() {
        return genericInvokeResponse;
    }

    /**
     * Sets the value of the genericInvokeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericInvokeResponseWsType }
     *     
     */
    public void setGenericInvokeResponse(GenericInvokeResponseWsType value) {
        this.genericInvokeResponse = value;
    }

}