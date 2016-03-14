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
 * Equipment Serial Range.
 * 
 * <p>Clase Java para tEquipSerialRange complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tEquipSerialRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restrictions" type="{http://www.navis.com/argo}tEquipTypeRestrictions" minOccurs="0" form="unqualified"/>
 *         &lt;element name="reefer" type="{http://www.navis.com/argo}tBaseReefer" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="prefix" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="equip-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="iso-group" type="{http://www.navis.com/argo}tIsoGroup" />
 *       &lt;attribute name="starting-serial-nbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="length-mm" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="height-mm" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="width-mm" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="tare-weight-kg" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="ending-serial-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEquipSerialRange", propOrder = {
    "restrictions",
    "reefer"
})
public class TEquipSerialRange {

    protected TEquipTypeRestrictions restrictions;
    protected TBaseReefer reefer;
    @XmlAttribute(name = "prefix", required = true)
    protected String prefix;
    @XmlAttribute(name = "equip-type")
    protected String equipType;
    @XmlAttribute(name = "iso-group")
    protected TIsoGroup isoGroup;
    @XmlAttribute(name = "starting-serial-nbr", required = true)
    protected String startingSerialNbr;
    @XmlAttribute(name = "length-mm")
    protected Integer lengthMm;
    @XmlAttribute(name = "height-mm")
    protected Integer heightMm;
    @XmlAttribute(name = "width-mm")
    protected Integer widthMm;
    @XmlAttribute(name = "tare-weight-kg")
    protected Double tareWeightKg;
    @XmlAttribute(name = "ending-serial-nbr")
    protected String endingSerialNbr;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Obtiene el valor de la propiedad restrictions.
     * 
     * @return
     *     possible object is
     *     {@link TEquipTypeRestrictions }
     *     
     */
    public TEquipTypeRestrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Define el valor de la propiedad restrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link TEquipTypeRestrictions }
     *     
     */
    public void setRestrictions(TEquipTypeRestrictions value) {
        this.restrictions = value;
    }

    /**
     * Obtiene el valor de la propiedad reefer.
     * 
     * @return
     *     possible object is
     *     {@link TBaseReefer }
     *     
     */
    public TBaseReefer getReefer() {
        return reefer;
    }

    /**
     * Define el valor de la propiedad reefer.
     * 
     * @param value
     *     allowed object is
     *     {@link TBaseReefer }
     *     
     */
    public void setReefer(TBaseReefer value) {
        this.reefer = value;
    }

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
     * Obtiene el valor de la propiedad equipType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipType() {
        return equipType;
    }

    /**
     * Define el valor de la propiedad equipType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipType(String value) {
        this.equipType = value;
    }

    /**
     * Obtiene el valor de la propiedad isoGroup.
     * 
     * @return
     *     possible object is
     *     {@link TIsoGroup }
     *     
     */
    public TIsoGroup getIsoGroup() {
        return isoGroup;
    }

    /**
     * Define el valor de la propiedad isoGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link TIsoGroup }
     *     
     */
    public void setIsoGroup(TIsoGroup value) {
        this.isoGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad startingSerialNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingSerialNbr() {
        return startingSerialNbr;
    }

    /**
     * Define el valor de la propiedad startingSerialNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingSerialNbr(String value) {
        this.startingSerialNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad lengthMm.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLengthMm() {
        return lengthMm;
    }

    /**
     * Define el valor de la propiedad lengthMm.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLengthMm(Integer value) {
        this.lengthMm = value;
    }

    /**
     * Obtiene el valor de la propiedad heightMm.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeightMm() {
        return heightMm;
    }

    /**
     * Define el valor de la propiedad heightMm.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeightMm(Integer value) {
        this.heightMm = value;
    }

    /**
     * Obtiene el valor de la propiedad widthMm.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidthMm() {
        return widthMm;
    }

    /**
     * Define el valor de la propiedad widthMm.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidthMm(Integer value) {
        this.widthMm = value;
    }

    /**
     * Obtiene el valor de la propiedad tareWeightKg.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTareWeightKg() {
        return tareWeightKg;
    }

    /**
     * Define el valor de la propiedad tareWeightKg.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTareWeightKg(Double value) {
        this.tareWeightKg = value;
    }

    /**
     * Obtiene el valor de la propiedad endingSerialNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingSerialNbr() {
        return endingSerialNbr;
    }

    /**
     * Define el valor de la propiedad endingSerialNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingSerialNbr(String value) {
        this.endingSerialNbr = value;
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
