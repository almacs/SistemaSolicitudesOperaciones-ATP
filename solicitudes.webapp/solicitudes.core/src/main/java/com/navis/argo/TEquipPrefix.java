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
 * Equipment Prefix
 * 
 * <p>Clase Java para tEquipPrefix complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tEquipPrefix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="prefix" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.navis.com/argo}tEquipmentClass" />
 *       &lt;attribute name="owner-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="check-digit-algo" type="{http://www.navis.com/argo}tCheckDigitAlgorithm" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEquipPrefix")
public class TEquipPrefix {

    @XmlAttribute(name = "prefix", required = true)
    protected String prefix;
    @XmlAttribute(name = "class")
    protected TEquipmentClass clazz;
    @XmlAttribute(name = "owner-id")
    protected String ownerId;
    @XmlAttribute(name = "check-digit-algo")
    protected TCheckDigitAlgorithm checkDigitAlgo;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Obtiene el valor de la propiedad prefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Define el valor de la propiedad prefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
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

    /**
     * Obtiene el valor de la propiedad ownerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Define el valor de la propiedad ownerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Obtiene el valor de la propiedad checkDigitAlgo.
     * 
     * @return
     *     possible object is
     *     {@link TCheckDigitAlgorithm }
     *     
     */
    public TCheckDigitAlgorithm getCheckDigitAlgo() {
        return checkDigitAlgo;
    }

    /**
     * Define el valor de la propiedad checkDigitAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link TCheckDigitAlgorithm }
     *     
     */
    public void setCheckDigitAlgo(TCheckDigitAlgorithm value) {
        this.checkDigitAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeCycleState.
     * 
     * @return
     *     possible object is
     *     {@link TLifeCycleStateType }
     *     
     */
    public TLifeCycleStateType getLifeCycleState() {
        return lifeCycleState;
    }

    /**
     * Define el valor de la propiedad lifeCycleState.
     * 
     * @param value
     *     allowed object is
     *     {@link TLifeCycleStateType }
     *     
     */
    public void setLifeCycleState(TLifeCycleStateType value) {
        this.lifeCycleState = value;
    }

}
