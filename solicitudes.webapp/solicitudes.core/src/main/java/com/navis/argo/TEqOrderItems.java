//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Edo items.
 * 
 * <p>Clase Java para tEqOrderItems complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tEqOrderItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serial-ranges" type="{http://www.navis.com/argo}tSerialRanges" minOccurs="0"/>
 *                   &lt;element name="reserved-empty-containers" type="{http://www.navis.com/argo}tResMtyCtrs" minOccurs="0"/>
 *                   &lt;element name="hazards" type="{http://www.navis.com/argo}tHazards" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="eq-iso-group" use="required" type="{http://www.navis.com/argo}tIsoGroup" />
 *                 &lt;attribute name="eq-size" use="required" type="{http://www.navis.com/argo}tEquipNominalLength" />
 *                 &lt;attribute name="eq-height" use="required" type="{http://www.navis.com/argo}tEquipNominalHeight" />
 *                 &lt;attribute name="tally-limit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="equipment-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ear-csc-exprn-dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="ear-mfg-dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="lat-mfg-dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="eq-grade" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="acc-type" type="{http://www.navis.com/argo}tAccType" />
 *                 &lt;attribute name="tare-wt-max" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="eq-material" type="{http://www.navis.com/argo}tMaterial" />
 *                 &lt;attribute name="feature-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="safe-wt-min" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="req-equip-condition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="is-powered" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="temp-reqrd" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="seq-nbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="eq-iso-group-description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="equip-type-description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="modified-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="modified-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEqOrderItems", propOrder = {
    "item"
})
public class TEqOrderItems {

    protected List<TEqOrderItems.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEqOrderItems.Item }
     * 
     * 
     */
    public List<TEqOrderItems.Item> getItem() {
        if (item == null) {
            item = new ArrayList<TEqOrderItems.Item>();
        }
        return this.item;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="serial-ranges" type="{http://www.navis.com/argo}tSerialRanges" minOccurs="0"/>
     *         &lt;element name="reserved-empty-containers" type="{http://www.navis.com/argo}tResMtyCtrs" minOccurs="0"/>
     *         &lt;element name="hazards" type="{http://www.navis.com/argo}tHazards" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="eq-iso-group" use="required" type="{http://www.navis.com/argo}tIsoGroup" />
     *       &lt;attribute name="eq-size" use="required" type="{http://www.navis.com/argo}tEquipNominalLength" />
     *       &lt;attribute name="eq-height" use="required" type="{http://www.navis.com/argo}tEquipNominalHeight" />
     *       &lt;attribute name="tally-limit" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="equipment-type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ear-csc-exprn-dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="ear-mfg-dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="lat-mfg-dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="eq-grade" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="acc-type" type="{http://www.navis.com/argo}tAccType" />
     *       &lt;attribute name="tare-wt-max" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="eq-material" type="{http://www.navis.com/argo}tMaterial" />
     *       &lt;attribute name="feature-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="safe-wt-min" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="req-equip-condition" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="is-powered" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="temp-reqrd" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="seq-nbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="eq-iso-group-description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="equip-type-description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="modified-by" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="modified-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serialRanges",
        "reservedEmptyContainers",
        "hazards"
    })
    public static class Item {

        @XmlElement(name = "serial-ranges")
        protected TSerialRanges serialRanges;
        @XmlElement(name = "reserved-empty-containers")
        protected TResMtyCtrs reservedEmptyContainers;
        protected THazards hazards;
        @XmlAttribute(name = "quantity")
        protected BigInteger quantity;
        @XmlAttribute(name = "eq-iso-group", required = true)
        protected TIsoGroup eqIsoGroup;
        @XmlAttribute(name = "eq-size", required = true)
        protected TEquipNominalLength eqSize;
        @XmlAttribute(name = "eq-height", required = true)
        protected TEquipNominalHeight eqHeight;
        @XmlAttribute(name = "tally-limit")
        protected BigInteger tallyLimit;
        @XmlAttribute(name = "equipment-type")
        protected String equipmentType;
        @XmlAttribute(name = "ear-csc-exprn-dt")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar earCscExprnDt;
        @XmlAttribute(name = "ear-mfg-dt")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar earMfgDt;
        @XmlAttribute(name = "lat-mfg-dt")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar latMfgDt;
        @XmlAttribute(name = "eq-grade")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String eqGrade;
        @XmlAttribute(name = "acc-type")
        protected TAccType accType;
        @XmlAttribute(name = "tare-wt-max")
        protected Double tareWtMax;
        @XmlAttribute(name = "eq-material")
        protected TMaterial eqMaterial;
        @XmlAttribute(name = "feature-id")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String featureId;
        @XmlAttribute(name = "remarks")
        protected String remarks;
        @XmlAttribute(name = "safe-wt-min")
        protected Double safeWtMin;
        @XmlAttribute(name = "req-equip-condition")
        protected String reqEquipCondition;
        @XmlAttribute(name = "is-powered")
        protected String isPowered;
        @XmlAttribute(name = "temp-reqrd")
        protected BigDecimal tempReqrd;
        @XmlAttribute(name = "seq-nbr")
        protected BigInteger seqNbr;
        @XmlAttribute(name = "eq-iso-group-description")
        protected String eqIsoGroupDescription;
        @XmlAttribute(name = "equip-type-description")
        protected String equipTypeDescription;
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

        /**
         * Obtiene el valor de la propiedad serialRanges.
         * 
         * @return
         *     possible object is
         *     {@link TSerialRanges }
         *     
         */
        public TSerialRanges getSerialRanges() {
            return serialRanges;
        }

        /**
         * Define el valor de la propiedad serialRanges.
         * 
         * @param value
         *     allowed object is
         *     {@link TSerialRanges }
         *     
         */
        public void setSerialRanges(TSerialRanges value) {
            this.serialRanges = value;
        }

        /**
         * Obtiene el valor de la propiedad reservedEmptyContainers.
         * 
         * @return
         *     possible object is
         *     {@link TResMtyCtrs }
         *     
         */
        public TResMtyCtrs getReservedEmptyContainers() {
            return reservedEmptyContainers;
        }

        /**
         * Define el valor de la propiedad reservedEmptyContainers.
         * 
         * @param value
         *     allowed object is
         *     {@link TResMtyCtrs }
         *     
         */
        public void setReservedEmptyContainers(TResMtyCtrs value) {
            this.reservedEmptyContainers = value;
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
         * Obtiene el valor de la propiedad quantity.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Define el valor de la propiedad quantity.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Obtiene el valor de la propiedad eqIsoGroup.
         * 
         * @return
         *     possible object is
         *     {@link TIsoGroup }
         *     
         */
        public TIsoGroup getEqIsoGroup() {
            return eqIsoGroup;
        }

        /**
         * Define el valor de la propiedad eqIsoGroup.
         * 
         * @param value
         *     allowed object is
         *     {@link TIsoGroup }
         *     
         */
        public void setEqIsoGroup(TIsoGroup value) {
            this.eqIsoGroup = value;
        }

        /**
         * Obtiene el valor de la propiedad eqSize.
         * 
         * @return
         *     possible object is
         *     {@link TEquipNominalLength }
         *     
         */
        public TEquipNominalLength getEqSize() {
            return eqSize;
        }

        /**
         * Define el valor de la propiedad eqSize.
         * 
         * @param value
         *     allowed object is
         *     {@link TEquipNominalLength }
         *     
         */
        public void setEqSize(TEquipNominalLength value) {
            this.eqSize = value;
        }

        /**
         * Obtiene el valor de la propiedad eqHeight.
         * 
         * @return
         *     possible object is
         *     {@link TEquipNominalHeight }
         *     
         */
        public TEquipNominalHeight getEqHeight() {
            return eqHeight;
        }

        /**
         * Define el valor de la propiedad eqHeight.
         * 
         * @param value
         *     allowed object is
         *     {@link TEquipNominalHeight }
         *     
         */
        public void setEqHeight(TEquipNominalHeight value) {
            this.eqHeight = value;
        }

        /**
         * Obtiene el valor de la propiedad tallyLimit.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTallyLimit() {
            return tallyLimit;
        }

        /**
         * Define el valor de la propiedad tallyLimit.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTallyLimit(BigInteger value) {
            this.tallyLimit = value;
        }

        /**
         * Obtiene el valor de la propiedad equipmentType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipmentType() {
            return equipmentType;
        }

        /**
         * Define el valor de la propiedad equipmentType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipmentType(String value) {
            this.equipmentType = value;
        }

        /**
         * Obtiene el valor de la propiedad earCscExprnDt.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEarCscExprnDt() {
            return earCscExprnDt;
        }

        /**
         * Define el valor de la propiedad earCscExprnDt.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEarCscExprnDt(XMLGregorianCalendar value) {
            this.earCscExprnDt = value;
        }

        /**
         * Obtiene el valor de la propiedad earMfgDt.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEarMfgDt() {
            return earMfgDt;
        }

        /**
         * Define el valor de la propiedad earMfgDt.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEarMfgDt(XMLGregorianCalendar value) {
            this.earMfgDt = value;
        }

        /**
         * Obtiene el valor de la propiedad latMfgDt.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLatMfgDt() {
            return latMfgDt;
        }

        /**
         * Define el valor de la propiedad latMfgDt.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLatMfgDt(XMLGregorianCalendar value) {
            this.latMfgDt = value;
        }

        /**
         * Obtiene el valor de la propiedad eqGrade.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEqGrade() {
            return eqGrade;
        }

        /**
         * Define el valor de la propiedad eqGrade.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEqGrade(String value) {
            this.eqGrade = value;
        }

        /**
         * Obtiene el valor de la propiedad accType.
         * 
         * @return
         *     possible object is
         *     {@link TAccType }
         *     
         */
        public TAccType getAccType() {
            return accType;
        }

        /**
         * Define el valor de la propiedad accType.
         * 
         * @param value
         *     allowed object is
         *     {@link TAccType }
         *     
         */
        public void setAccType(TAccType value) {
            this.accType = value;
        }

        /**
         * Obtiene el valor de la propiedad tareWtMax.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getTareWtMax() {
            return tareWtMax;
        }

        /**
         * Define el valor de la propiedad tareWtMax.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setTareWtMax(Double value) {
            this.tareWtMax = value;
        }

        /**
         * Obtiene el valor de la propiedad eqMaterial.
         * 
         * @return
         *     possible object is
         *     {@link TMaterial }
         *     
         */
        public TMaterial getEqMaterial() {
            return eqMaterial;
        }

        /**
         * Define el valor de la propiedad eqMaterial.
         * 
         * @param value
         *     allowed object is
         *     {@link TMaterial }
         *     
         */
        public void setEqMaterial(TMaterial value) {
            this.eqMaterial = value;
        }

        /**
         * Obtiene el valor de la propiedad featureId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureId() {
            return featureId;
        }

        /**
         * Define el valor de la propiedad featureId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureId(String value) {
            this.featureId = value;
        }

        /**
         * Obtiene el valor de la propiedad remarks.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemarks() {
            return remarks;
        }

        /**
         * Define el valor de la propiedad remarks.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemarks(String value) {
            this.remarks = value;
        }

        /**
         * Obtiene el valor de la propiedad safeWtMin.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getSafeWtMin() {
            return safeWtMin;
        }

        /**
         * Define el valor de la propiedad safeWtMin.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSafeWtMin(Double value) {
            this.safeWtMin = value;
        }

        /**
         * Obtiene el valor de la propiedad reqEquipCondition.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReqEquipCondition() {
            return reqEquipCondition;
        }

        /**
         * Define el valor de la propiedad reqEquipCondition.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReqEquipCondition(String value) {
            this.reqEquipCondition = value;
        }

        /**
         * Obtiene el valor de la propiedad isPowered.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsPowered() {
            return isPowered;
        }

        /**
         * Define el valor de la propiedad isPowered.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsPowered(String value) {
            this.isPowered = value;
        }

        /**
         * Obtiene el valor de la propiedad tempReqrd.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTempReqrd() {
            return tempReqrd;
        }

        /**
         * Define el valor de la propiedad tempReqrd.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTempReqrd(BigDecimal value) {
            this.tempReqrd = value;
        }

        /**
         * Obtiene el valor de la propiedad seqNbr.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSeqNbr() {
            return seqNbr;
        }

        /**
         * Define el valor de la propiedad seqNbr.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSeqNbr(BigInteger value) {
            this.seqNbr = value;
        }

        /**
         * Obtiene el valor de la propiedad eqIsoGroupDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEqIsoGroupDescription() {
            return eqIsoGroupDescription;
        }

        /**
         * Define el valor de la propiedad eqIsoGroupDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEqIsoGroupDescription(String value) {
            this.eqIsoGroupDescription = value;
        }

        /**
         * Obtiene el valor de la propiedad equipTypeDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipTypeDescription() {
            return equipTypeDescription;
        }

        /**
         * Define el valor de la propiedad equipTypeDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipTypeDescription(String value) {
            this.equipTypeDescription = value;
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

    }

}
