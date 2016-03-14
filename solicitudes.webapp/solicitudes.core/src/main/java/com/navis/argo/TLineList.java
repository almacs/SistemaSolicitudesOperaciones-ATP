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
 * Line List
 * 
 * <p>Clase Java para tLineList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tLineList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routing" type="{http://www.navis.com/argo}tLoadListRouting"/>
 *         &lt;element name="hazards" type="{http://www.navis.com/argo}tHazards" minOccurs="0"/>
 *         &lt;element name="contents" type="{http://www.navis.com/argo}tLoadListUnitContents" minOccurs="0"/>
 *         &lt;element name="seals" type="{http://www.navis.com/argo}tUnitSeals" minOccurs="0"/>
 *         &lt;element name="reefer" type="{http://www.navis.com/argo}tReeferRequirements" minOccurs="0"/>
 *         &lt;element name="oog" type="{http://www.navis.com/argo}tOog" minOccurs="0"/>
 *         &lt;element name="unit-flex" type="{http://www.navis.com/argo}tUnitFlexFields" minOccurs="0"/>
 *         &lt;element name="ufv-flex" type="{http://www.navis.com/argo}tUfvFlexFields" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{http://www.navis.com/argo}tLoadListAction" />
 *       &lt;attribute name="line-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sender-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="complex-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eq-type-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.navis.com/argo}tCategory" />
 *       &lt;attribute name="freight-kind">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="FCL"/>
 *             &lt;enumeration value="MTY"/>
 *             &lt;enumeration value="BBK"/>
 *             &lt;enumeration value="LCL"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="order-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ctr-operator-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="special-stow-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stow-position" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLineList", propOrder = {
    "routing",
    "hazards",
    "contents",
    "seals",
    "reefer",
    "oog",
    "unitFlex",
    "ufvFlex"
})
public class TLineList {

    @XmlElement(required = true)
    protected TLoadListRouting routing;
    protected THazards hazards;
    protected TLoadListUnitContents contents;
    protected TUnitSeals seals;
    protected TReeferRequirements reefer;
    protected TOog oog;
    @XmlElement(name = "unit-flex")
    protected TUnitFlexFields unitFlex;
    @XmlElement(name = "ufv-flex")
    protected TUfvFlexFields ufvFlex;
    @XmlAttribute(name = "action")
    protected TLoadListAction action;
    @XmlAttribute(name = "line-id")
    protected String lineId;
    @XmlAttribute(name = "sender-id")
    protected String senderId;
    @XmlAttribute(name = "complex-id")
    protected String complexId;
    @XmlAttribute(name = "unit-id", required = true)
    protected String unitId;
    @XmlAttribute(name = "eq-type-id")
    protected String eqTypeId;
    @XmlAttribute(name = "category")
    protected TCategory category;
    @XmlAttribute(name = "freight-kind")
    protected String freightKind;
    @XmlAttribute(name = "order-nbr")
    protected String orderNbr;
    @XmlAttribute(name = "ctr-operator-id")
    protected String ctrOperatorId;
    @XmlAttribute(name = "special-stow-id")
    protected String specialStowId;
    @XmlAttribute(name = "stow-position")
    protected String stowPosition;

    /**
     * Obtiene el valor de la propiedad routing.
     * 
     * @return
     *     possible object is
     *     {@link TLoadListRouting }
     *     
     */
    public TLoadListRouting getRouting() {
        return routing;
    }

    /**
     * Define el valor de la propiedad routing.
     * 
     * @param value
     *     allowed object is
     *     {@link TLoadListRouting }
     *     
     */
    public void setRouting(TLoadListRouting value) {
        this.routing = value;
    }

    /**
     * Obtiene el valor de la propiedad hazards.
     * 
     * @return
     *     possible object is
     *     {@link THazards }
     *     
     */
    public THazards getHazards() {
        return hazards;
    }

    /**
     * Define el valor de la propiedad hazards.
     * 
     * @param value
     *     allowed object is
     *     {@link THazards }
     *     
     */
    public void setHazards(THazards value) {
        this.hazards = value;
    }

    /**
     * Obtiene el valor de la propiedad contents.
     * 
     * @return
     *     possible object is
     *     {@link TLoadListUnitContents }
     *     
     */
    public TLoadListUnitContents getContents() {
        return contents;
    }

    /**
     * Define el valor de la propiedad contents.
     * 
     * @param value
     *     allowed object is
     *     {@link TLoadListUnitContents }
     *     
     */
    public void setContents(TLoadListUnitContents value) {
        this.contents = value;
    }

    /**
     * Obtiene el valor de la propiedad seals.
     * 
     * @return
     *     possible object is
     *     {@link TUnitSeals }
     *     
     */
    public TUnitSeals getSeals() {
        return seals;
    }

    /**
     * Define el valor de la propiedad seals.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitSeals }
     *     
     */
    public void setSeals(TUnitSeals value) {
        this.seals = value;
    }

    /**
     * Obtiene el valor de la propiedad reefer.
     * 
     * @return
     *     possible object is
     *     {@link TReeferRequirements }
     *     
     */
    public TReeferRequirements getReefer() {
        return reefer;
    }

    /**
     * Define el valor de la propiedad reefer.
     * 
     * @param value
     *     allowed object is
     *     {@link TReeferRequirements }
     *     
     */
    public void setReefer(TReeferRequirements value) {
        this.reefer = value;
    }

    /**
     * Obtiene el valor de la propiedad oog.
     * 
     * @return
     *     possible object is
     *     {@link TOog }
     *     
     */
    public TOog getOog() {
        return oog;
    }

    /**
     * Define el valor de la propiedad oog.
     * 
     * @param value
     *     allowed object is
     *     {@link TOog }
     *     
     */
    public void setOog(TOog value) {
        this.oog = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlex.
     * 
     * @return
     *     possible object is
     *     {@link TUnitFlexFields }
     *     
     */
    public TUnitFlexFields getUnitFlex() {
        return unitFlex;
    }

    /**
     * Define el valor de la propiedad unitFlex.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitFlexFields }
     *     
     */
    public void setUnitFlex(TUnitFlexFields value) {
        this.unitFlex = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlex.
     * 
     * @return
     *     possible object is
     *     {@link TUfvFlexFields }
     *     
     */
    public TUfvFlexFields getUfvFlex() {
        return ufvFlex;
    }

    /**
     * Define el valor de la propiedad ufvFlex.
     * 
     * @param value
     *     allowed object is
     *     {@link TUfvFlexFields }
     *     
     */
    public void setUfvFlex(TUfvFlexFields value) {
        this.ufvFlex = value;
    }

    /**
     * Obtiene el valor de la propiedad action.
     * 
     * @return
     *     possible object is
     *     {@link TLoadListAction }
     *     
     */
    public TLoadListAction getAction() {
        return action;
    }

    /**
     * Define el valor de la propiedad action.
     * 
     * @param value
     *     allowed object is
     *     {@link TLoadListAction }
     *     
     */
    public void setAction(TLoadListAction value) {
        this.action = value;
    }

    /**
     * Obtiene el valor de la propiedad lineId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Define el valor de la propiedad lineId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Obtiene el valor de la propiedad senderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * Define el valor de la propiedad senderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderId(String value) {
        this.senderId = value;
    }

    /**
     * Obtiene el valor de la propiedad complexId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexId() {
        return complexId;
    }

    /**
     * Define el valor de la propiedad complexId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexId(String value) {
        this.complexId = value;
    }

    /**
     * Obtiene el valor de la propiedad unitId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitId() {
        return unitId;
    }

    /**
     * Define el valor de la propiedad unitId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitId(String value) {
        this.unitId = value;
    }

    /**
     * Obtiene el valor de la propiedad eqTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqTypeId() {
        return eqTypeId;
    }

    /**
     * Define el valor de la propiedad eqTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqTypeId(String value) {
        this.eqTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link TCategory }
     *     
     */
    public TCategory getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link TCategory }
     *     
     */
    public void setCategory(TCategory value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad freightKind.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightKind() {
        return freightKind;
    }

    /**
     * Define el valor de la propiedad freightKind.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightKind(String value) {
        this.freightKind = value;
    }

    /**
     * Obtiene el valor de la propiedad orderNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNbr() {
        return orderNbr;
    }

    /**
     * Define el valor de la propiedad orderNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNbr(String value) {
        this.orderNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrOperatorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrOperatorId() {
        return ctrOperatorId;
    }

    /**
     * Define el valor de la propiedad ctrOperatorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrOperatorId(String value) {
        this.ctrOperatorId = value;
    }

    /**
     * Obtiene el valor de la propiedad specialStowId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialStowId() {
        return specialStowId;
    }

    /**
     * Define el valor de la propiedad specialStowId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialStowId(String value) {
        this.specialStowId = value;
    }

    /**
     * Obtiene el valor de la propiedad stowPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStowPosition() {
        return stowPosition;
    }

    /**
     * Define el valor de la propiedad stowPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStowPosition(String value) {
        this.stowPosition = value;
    }

}
