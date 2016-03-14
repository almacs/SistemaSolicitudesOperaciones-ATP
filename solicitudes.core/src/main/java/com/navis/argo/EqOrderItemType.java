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
 * <p>Clase Java para EqOrderItemType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EqOrderItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type-description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eq-length" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eq-length-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eq-height" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eq-height-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eq-iso-group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eq-iso-group-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EqOrderItemType")
public class EqOrderItemType {

    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "type-description")
    protected String typeDescription;
    @XmlAttribute(name = "eq-length")
    protected String eqLength;
    @XmlAttribute(name = "eq-length-name")
    protected String eqLengthName;
    @XmlAttribute(name = "eq-height")
    protected String eqHeight;
    @XmlAttribute(name = "eq-height-name")
    protected String eqHeightName;
    @XmlAttribute(name = "eq-iso-group")
    protected String eqIsoGroup;
    @XmlAttribute(name = "eq-iso-group-name")
    protected String eqIsoGroupName;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad typeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * Define el valor de la propiedad typeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDescription(String value) {
        this.typeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad eqLength.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqLength() {
        return eqLength;
    }

    /**
     * Define el valor de la propiedad eqLength.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqLength(String value) {
        this.eqLength = value;
    }

    /**
     * Obtiene el valor de la propiedad eqLengthName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqLengthName() {
        return eqLengthName;
    }

    /**
     * Define el valor de la propiedad eqLengthName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqLengthName(String value) {
        this.eqLengthName = value;
    }

    /**
     * Obtiene el valor de la propiedad eqHeight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqHeight() {
        return eqHeight;
    }

    /**
     * Define el valor de la propiedad eqHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqHeight(String value) {
        this.eqHeight = value;
    }

    /**
     * Obtiene el valor de la propiedad eqHeightName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqHeightName() {
        return eqHeightName;
    }

    /**
     * Define el valor de la propiedad eqHeightName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqHeightName(String value) {
        this.eqHeightName = value;
    }

    /**
     * Obtiene el valor de la propiedad eqIsoGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqIsoGroup() {
        return eqIsoGroup;
    }

    /**
     * Define el valor de la propiedad eqIsoGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqIsoGroup(String value) {
        this.eqIsoGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad eqIsoGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqIsoGroupName() {
        return eqIsoGroupName;
    }

    /**
     * Define el valor de la propiedad eqIsoGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqIsoGroupName(String value) {
        this.eqIsoGroupName = value;
    }

}
