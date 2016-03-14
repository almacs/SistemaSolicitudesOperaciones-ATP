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
 * <p>Clase Java para tUnitSimpleAction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tUnitSimpleAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unit-identity" type="{http://www.navis.com/argo}tUnitIdentity"/>
 *       &lt;/sequence>
 *       &lt;attribute name="facility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUnitSimpleAction", propOrder = {
    "unitIdentity"
})
public class TUnitSimpleAction {

    @XmlElement(name = "unit-identity", required = true)
    protected TUnitIdentity unitIdentity;
    @XmlAttribute(name = "facility")
    protected String facility;

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
     * Obtiene el valor de la propiedad facility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacility() {
        return facility;
    }

    /**
     * Define el valor de la propiedad facility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacility(String value) {
        this.facility = value;
    }

}
