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
 * <p>Clase Java para DriverType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DriverType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navis.com/argo}DriverBaseRequestType">
 *       &lt;attribute name="is-hazard-licensed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="driver-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverType")
public class DriverType
    extends DriverBaseRequestType
{

    @XmlAttribute(name = "is-hazard-licensed")
    protected Boolean isHazardLicensed;
    @XmlAttribute(name = "driver-name")
    protected String driverName;

    /**
     * Obtiene el valor de la propiedad isHazardLicensed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsHazardLicensed() {
        if (isHazardLicensed == null) {
            return false;
        } else {
            return isHazardLicensed;
        }
    }

    /**
     * Define el valor de la propiedad isHazardLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHazardLicensed(Boolean value) {
        this.isHazardLicensed = value;
    }

    /**
     * Obtiene el valor de la propiedad driverName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Define el valor de la propiedad driverName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverName(String value) {
        this.driverName = value;
    }

}
