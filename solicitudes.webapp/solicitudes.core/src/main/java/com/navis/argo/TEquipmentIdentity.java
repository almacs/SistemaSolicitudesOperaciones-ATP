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
 * Used to uniquely identify a piece of Equipment.
 *             
 * 
 * <p>Clase Java para tEquipmentIdentity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tEquipmentIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="eqid" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="class" use="required" type="{http://www.navis.com/argo}tEquipmentClass" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEquipmentIdentity")
public class TEquipmentIdentity {

    @XmlAttribute(name = "eqid", required = true)
    protected String eqid;
    @XmlAttribute(name = "class", required = true)
    protected TEquipmentClass clazz;

    /**
     * Obtiene el valor de la propiedad eqid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqid() {
        return eqid;
    }

    /**
     * Define el valor de la propiedad eqid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqid(String value) {
        this.eqid = value;
    }

    /**
     * Obtiene el valor de la propiedad clazz.
     * 
     * @return
     *     possible object is
     *     {@link TEquipmentClass }
     *     
     */
    public TEquipmentClass getClazz() {
        return clazz;
    }

    /**
     * Define el valor de la propiedad clazz.
     * 
     * @param value
     *     allowed object is
     *     {@link TEquipmentClass }
     *     
     */
    public void setClazz(TEquipmentClass value) {
        this.clazz = value;
    }

}
