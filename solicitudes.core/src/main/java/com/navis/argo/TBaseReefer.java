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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tBaseReefer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tBaseReefer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="rfr-type" type="{http://www.navis.com/argo}tRfrType" />
 *       &lt;attribute name="is-super-freeze" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-controlled-atmosphere" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-temperature-controlled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBaseReefer")
@XmlSeeAlso({
    TReefer.class
})
public class TBaseReefer {

    @XmlAttribute(name = "rfr-type")
    protected TRfrType rfrType;
    @XmlAttribute(name = "is-super-freeze")
    protected String isSuperFreeze;
    @XmlAttribute(name = "is-controlled-atmosphere")
    protected String isControlledAtmosphere;
    @XmlAttribute(name = "is-temperature-controlled")
    protected String isTemperatureControlled;

    /**
     * Obtiene el valor de la propiedad rfrType.
     * 
     * @return
     *     possible object is
     *     {@link TRfrType }
     *     
     */
    public TRfrType getRfrType() {
        return rfrType;
    }

    /**
     * Define el valor de la propiedad rfrType.
     * 
     * @param value
     *     allowed object is
     *     {@link TRfrType }
     *     
     */
    public void setRfrType(TRfrType value) {
        this.rfrType = value;
    }

    /**
     * Obtiene el valor de la propiedad isSuperFreeze.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSuperFreeze() {
        return isSuperFreeze;
    }

    /**
     * Define el valor de la propiedad isSuperFreeze.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSuperFreeze(String value) {
        this.isSuperFreeze = value;
    }

    /**
     * Obtiene el valor de la propiedad isControlledAtmosphere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsControlledAtmosphere() {
        return isControlledAtmosphere;
    }

    /**
     * Define el valor de la propiedad isControlledAtmosphere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsControlledAtmosphere(String value) {
        this.isControlledAtmosphere = value;
    }

    /**
     * Obtiene el valor de la propiedad isTemperatureControlled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTemperatureControlled() {
        return isTemperatureControlled;
    }

    /**
     * Define el valor de la propiedad isTemperatureControlled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTemperatureControlled(String value) {
        this.isTemperatureControlled = value;
    }

}
