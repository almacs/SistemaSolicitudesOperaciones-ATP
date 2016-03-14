//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Item of equipment associated with the inventory unit - Container,
 *                 Chassis, Accessories
 *             
 * 
 * <p>Clase Java para tEquipment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tEquipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="physical" type="{http://www.navis.com/argo}tPhysical" minOccurs="0"/>
 *         &lt;element name="ownership" type="{http://www.navis.com/argo}tOwnership" minOccurs="0"/>
 *         &lt;element name="restrictions" type="{http://www.navis.com/argo}tRestrictions" minOccurs="0"/>
 *         &lt;element name="transponder" type="{http://www.navis.com/argo}tTransponder" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="eqid" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="class" use="required" type="{http://www.navis.com/argo}tEquipmentClass" />
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="modified-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="modified-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="tare-kg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="height-mm" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="strength-code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="material" type="{http://www.navis.com/argo}tMaterial" />
 *       &lt;attribute name="eq-flex-01" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eq-flex-02" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eq-flex-03" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEquipment", propOrder = {
    "physical",
    "ownership",
    "restrictions",
    "transponder"
})
@XmlSeeAlso({
    TUnitEquipment.class,
    TContainer.class,
    TChassis.class,
    TAccessory.class
})
public class TEquipment {

    protected TPhysical physical;
    protected TOwnership ownership;
    protected TRestrictions restrictions;
    protected TTransponder transponder;
    @XmlAttribute(name = "eqid", required = true)
    protected String eqid;
    @XmlAttribute(name = "class", required = true)
    protected TEquipmentClass clazz;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "created-by")
    protected String createdBy;
    @XmlAttribute(name = "created-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlAttribute(name = "modified-by")
    protected String modifiedBy;
    @XmlAttribute(name = "modified-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlAttribute(name = "tare-kg")
    protected BigDecimal tareKg;
    @XmlAttribute(name = "height-mm")
    protected BigInteger heightMm;
    @XmlAttribute(name = "strength-code")
    protected String strengthCode;
    @XmlAttribute(name = "owner")
    protected String owner;
    @XmlAttribute(name = "operator")
    protected String operator;
    @XmlAttribute(name = "material")
    protected TMaterial material;
    @XmlAttribute(name = "eq-flex-01")
    protected String eqFlex01;
    @XmlAttribute(name = "eq-flex-02")
    protected String eqFlex02;
    @XmlAttribute(name = "eq-flex-03")
    protected String eqFlex03;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Obtiene el valor de la propiedad physical.
     * 
     * @return
     *     possible object is
     *     {@link TPhysical }
     *     
     */
    public TPhysical getPhysical() {
        return physical;
    }

    /**
     * Define el valor de la propiedad physical.
     * 
     * @param value
     *     allowed object is
     *     {@link TPhysical }
     *     
     */
    public void setPhysical(TPhysical value) {
        this.physical = value;
    }

    /**
     * Obtiene el valor de la propiedad ownership.
     * 
     * @return
     *     possible object is
     *     {@link TOwnership }
     *     
     */
    public TOwnership getOwnership() {
        return ownership;
    }

    /**
     * Define el valor de la propiedad ownership.
     * 
     * @param value
     *     allowed object is
     *     {@link TOwnership }
     *     
     */
    public void setOwnership(TOwnership value) {
        this.ownership = value;
    }

    /**
     * Obtiene el valor de la propiedad restrictions.
     * 
     * @return
     *     possible object is
     *     {@link TRestrictions }
     *     
     */
    public TRestrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Define el valor de la propiedad restrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link TRestrictions }
     *     
     */
    public void setRestrictions(TRestrictions value) {
        this.restrictions = value;
    }

    /**
     * Obtiene el valor de la propiedad transponder.
     * 
     * @return
     *     possible object is
     *     {@link TTransponder }
     *     
     */
    public TTransponder getTransponder() {
        return transponder;
    }

    /**
     * Define el valor de la propiedad transponder.
     * 
     * @param value
     *     allowed object is
     *     {@link TTransponder }
     *     
     */
    public void setTransponder(TTransponder value) {
        this.transponder = value;
    }

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
     * Obtiene el valor de la propiedad createdBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Define el valor de la propiedad createdBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Obtiene el valor de la propiedad createdDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Define el valor de la propiedad createdDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Obtiene el valor de la propiedad modifiedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Define el valor de la propiedad modifiedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedBy(String value) {
        this.modifiedBy = value;
    }

    /**
     * Obtiene el valor de la propiedad modifiedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Define el valor de la propiedad modifiedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad tareKg.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTareKg() {
        return tareKg;
    }

    /**
     * Define el valor de la propiedad tareKg.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTareKg(BigDecimal value) {
        this.tareKg = value;
    }

    /**
     * Obtiene el valor de la propiedad heightMm.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeightMm() {
        return heightMm;
    }

    /**
     * Define el valor de la propiedad heightMm.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeightMm(BigInteger value) {
        this.heightMm = value;
    }

    /**
     * Obtiene el valor de la propiedad strengthCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrengthCode() {
        return strengthCode;
    }

    /**
     * Define el valor de la propiedad strengthCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrengthCode(String value) {
        this.strengthCode = value;
    }

    /**
     * Obtiene el valor de la propiedad owner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Define el valor de la propiedad owner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Obtiene el valor de la propiedad operator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Define el valor de la propiedad operator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Obtiene el valor de la propiedad material.
     * 
     * @return
     *     possible object is
     *     {@link TMaterial }
     *     
     */
    public TMaterial getMaterial() {
        return material;
    }

    /**
     * Define el valor de la propiedad material.
     * 
     * @param value
     *     allowed object is
     *     {@link TMaterial }
     *     
     */
    public void setMaterial(TMaterial value) {
        this.material = value;
    }

    /**
     * Obtiene el valor de la propiedad eqFlex01.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqFlex01() {
        return eqFlex01;
    }

    /**
     * Define el valor de la propiedad eqFlex01.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqFlex01(String value) {
        this.eqFlex01 = value;
    }

    /**
     * Obtiene el valor de la propiedad eqFlex02.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqFlex02() {
        return eqFlex02;
    }

    /**
     * Define el valor de la propiedad eqFlex02.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqFlex02(String value) {
        this.eqFlex02 = value;
    }

    /**
     * Obtiene el valor de la propiedad eqFlex03.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqFlex03() {
        return eqFlex03;
    }

    /**
     * Define el valor de la propiedad eqFlex03.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqFlex03(String value) {
        this.eqFlex03 = value;
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
