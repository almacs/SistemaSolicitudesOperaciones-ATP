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
import javax.xml.bind.annotation.XmlType;


/**
 * Details of one item of hazardous content.
 * 
 * <p>Clase Java para tHazard complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tHazard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hazard-item-placards" type="{http://www.navis.com/argo}tHazardItemPlacards" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="risks" type="{http://www.navis.com/argo}tRisks" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="imdg" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imdg-description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="un">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="4"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ltd-qty-flag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="package-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inhalation-zone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="explosive-class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="page-number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flash-point" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="tech-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proper-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ems-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mfag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="packing-group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="packing-group-description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="haz-id-upper" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="substance-lower" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="weight-kg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="planner-ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="move-method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="secondary-imo-1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="secondary-imo-2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="deck-restrictions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marine-pollutants" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dc-lg-ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="emergency-telephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ems-response-guide-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fire-code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="placard-optional" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="haz-nbr-type" type="{http://www.navis.com/argo}tHazardNumberType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tHazard", propOrder = {
    "hazardItemPlacards",
    "risks"
})
public class THazard {

    @XmlElement(name = "hazard-item-placards")
    protected List<THazardItemPlacards> hazardItemPlacards;
    protected List<TRisks> risks;
    @XmlAttribute(name = "imdg", required = true)
    protected String imdg;
    @XmlAttribute(name = "imdg-description")
    protected String imdgDescription;
    @XmlAttribute(name = "un")
    protected String un;
    @XmlAttribute(name = "ltd-qty-flag")
    protected String ltdQtyFlag;
    @XmlAttribute(name = "package-type")
    protected String packageType;
    @XmlAttribute(name = "inhalation-zone")
    protected String inhalationZone;
    @XmlAttribute(name = "explosive-class")
    protected String explosiveClass;
    @XmlAttribute(name = "page-number")
    protected String pageNumber;
    @XmlAttribute(name = "flash-point")
    protected BigDecimal flashPoint;
    @XmlAttribute(name = "tech-name")
    protected String techName;
    @XmlAttribute(name = "proper-name")
    protected String properName;
    @XmlAttribute(name = "ems-nbr")
    protected String emsNbr;
    @XmlAttribute(name = "mfag")
    protected String mfag;
    @XmlAttribute(name = "packing-group")
    protected String packingGroup;
    @XmlAttribute(name = "packing-group-description")
    protected String packingGroupDescription;
    @XmlAttribute(name = "haz-id-upper")
    protected String hazIdUpper;
    @XmlAttribute(name = "substance-lower")
    protected String substanceLower;
    @XmlAttribute(name = "weight-kg")
    protected BigDecimal weightKg;
    @XmlAttribute(name = "planner-ref")
    protected String plannerRef;
    @XmlAttribute(name = "quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "move-method")
    protected String moveMethod;
    @XmlAttribute(name = "secondary-imo-1")
    protected String secondaryImo1;
    @XmlAttribute(name = "secondary-imo-2")
    protected String secondaryImo2;
    @XmlAttribute(name = "deck-restrictions")
    protected String deckRestrictions;
    @XmlAttribute(name = "marine-pollutants")
    protected String marinePollutants;
    @XmlAttribute(name = "dc-lg-ref")
    protected String dcLgRef;
    @XmlAttribute(name = "emergency-telephone")
    protected String emergencyTelephone;
    @XmlAttribute(name = "ems-response-guide-nbr")
    protected String emsResponseGuideNbr;
    @XmlAttribute(name = "notes")
    protected String notes;
    @XmlAttribute(name = "fire-code")
    protected String fireCode;
    @XmlAttribute(name = "placard-optional")
    protected String placardOptional;
    @XmlAttribute(name = "haz-nbr-type")
    protected THazardNumberType hazNbrType;

    /**
     * Gets the value of the hazardItemPlacards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardItemPlacards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardItemPlacards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link THazardItemPlacards }
     * 
     * 
     */
    public List<THazardItemPlacards> getHazardItemPlacards() {
        if (hazardItemPlacards == null) {
            hazardItemPlacards = new ArrayList<THazardItemPlacards>();
        }
        return this.hazardItemPlacards;
    }

    /**
     * Gets the value of the risks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the risks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRisks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRisks }
     * 
     * 
     */
    public List<TRisks> getRisks() {
        if (risks == null) {
            risks = new ArrayList<TRisks>();
        }
        return this.risks;
    }

    /**
     * Obtiene el valor de la propiedad imdg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImdg() {
        return imdg;
    }

    /**
     * Define el valor de la propiedad imdg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImdg(String value) {
        this.imdg = value;
    }

    /**
     * Obtiene el valor de la propiedad imdgDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImdgDescription() {
        return imdgDescription;
    }

    /**
     * Define el valor de la propiedad imdgDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImdgDescription(String value) {
        this.imdgDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad un.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUn() {
        return un;
    }

    /**
     * Define el valor de la propiedad un.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUn(String value) {
        this.un = value;
    }

    /**
     * Obtiene el valor de la propiedad ltdQtyFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtdQtyFlag() {
        return ltdQtyFlag;
    }

    /**
     * Define el valor de la propiedad ltdQtyFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtdQtyFlag(String value) {
        this.ltdQtyFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad packageType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Define el valor de la propiedad packageType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

    /**
     * Obtiene el valor de la propiedad inhalationZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhalationZone() {
        return inhalationZone;
    }

    /**
     * Define el valor de la propiedad inhalationZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhalationZone(String value) {
        this.inhalationZone = value;
    }

    /**
     * Obtiene el valor de la propiedad explosiveClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplosiveClass() {
        return explosiveClass;
    }

    /**
     * Define el valor de la propiedad explosiveClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplosiveClass(String value) {
        this.explosiveClass = value;
    }

    /**
     * Obtiene el valor de la propiedad pageNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * Define el valor de la propiedad pageNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumber(String value) {
        this.pageNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad flashPoint.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlashPoint() {
        return flashPoint;
    }

    /**
     * Define el valor de la propiedad flashPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlashPoint(BigDecimal value) {
        this.flashPoint = value;
    }

    /**
     * Obtiene el valor de la propiedad techName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechName() {
        return techName;
    }

    /**
     * Define el valor de la propiedad techName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechName(String value) {
        this.techName = value;
    }

    /**
     * Obtiene el valor de la propiedad properName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperName() {
        return properName;
    }

    /**
     * Define el valor de la propiedad properName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperName(String value) {
        this.properName = value;
    }

    /**
     * Obtiene el valor de la propiedad emsNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmsNbr() {
        return emsNbr;
    }

    /**
     * Define el valor de la propiedad emsNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmsNbr(String value) {
        this.emsNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad mfag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfag() {
        return mfag;
    }

    /**
     * Define el valor de la propiedad mfag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfag(String value) {
        this.mfag = value;
    }

    /**
     * Obtiene el valor de la propiedad packingGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingGroup() {
        return packingGroup;
    }

    /**
     * Define el valor de la propiedad packingGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingGroup(String value) {
        this.packingGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad packingGroupDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingGroupDescription() {
        return packingGroupDescription;
    }

    /**
     * Define el valor de la propiedad packingGroupDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingGroupDescription(String value) {
        this.packingGroupDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad hazIdUpper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazIdUpper() {
        return hazIdUpper;
    }

    /**
     * Define el valor de la propiedad hazIdUpper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazIdUpper(String value) {
        this.hazIdUpper = value;
    }

    /**
     * Obtiene el valor de la propiedad substanceLower.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstanceLower() {
        return substanceLower;
    }

    /**
     * Define el valor de la propiedad substanceLower.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstanceLower(String value) {
        this.substanceLower = value;
    }

    /**
     * Obtiene el valor de la propiedad weightKg.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightKg() {
        return weightKg;
    }

    /**
     * Define el valor de la propiedad weightKg.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightKg(BigDecimal value) {
        this.weightKg = value;
    }

    /**
     * Obtiene el valor de la propiedad plannerRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannerRef() {
        return plannerRef;
    }

    /**
     * Define el valor de la propiedad plannerRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannerRef(String value) {
        this.plannerRef = value;
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
     * Obtiene el valor de la propiedad moveMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoveMethod() {
        return moveMethod;
    }

    /**
     * Define el valor de la propiedad moveMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoveMethod(String value) {
        this.moveMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad secondaryImo1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryImo1() {
        return secondaryImo1;
    }

    /**
     * Define el valor de la propiedad secondaryImo1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryImo1(String value) {
        this.secondaryImo1 = value;
    }

    /**
     * Obtiene el valor de la propiedad secondaryImo2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryImo2() {
        return secondaryImo2;
    }

    /**
     * Define el valor de la propiedad secondaryImo2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryImo2(String value) {
        this.secondaryImo2 = value;
    }

    /**
     * Obtiene el valor de la propiedad deckRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckRestrictions() {
        return deckRestrictions;
    }

    /**
     * Define el valor de la propiedad deckRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckRestrictions(String value) {
        this.deckRestrictions = value;
    }

    /**
     * Obtiene el valor de la propiedad marinePollutants.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarinePollutants() {
        return marinePollutants;
    }

    /**
     * Define el valor de la propiedad marinePollutants.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarinePollutants(String value) {
        this.marinePollutants = value;
    }

    /**
     * Obtiene el valor de la propiedad dcLgRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcLgRef() {
        return dcLgRef;
    }

    /**
     * Define el valor de la propiedad dcLgRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcLgRef(String value) {
        this.dcLgRef = value;
    }

    /**
     * Obtiene el valor de la propiedad emergencyTelephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyTelephone() {
        return emergencyTelephone;
    }

    /**
     * Define el valor de la propiedad emergencyTelephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyTelephone(String value) {
        this.emergencyTelephone = value;
    }

    /**
     * Obtiene el valor de la propiedad emsResponseGuideNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmsResponseGuideNbr() {
        return emsResponseGuideNbr;
    }

    /**
     * Define el valor de la propiedad emsResponseGuideNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmsResponseGuideNbr(String value) {
        this.emsResponseGuideNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Define el valor de la propiedad notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Obtiene el valor de la propiedad fireCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFireCode() {
        return fireCode;
    }

    /**
     * Define el valor de la propiedad fireCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFireCode(String value) {
        this.fireCode = value;
    }

    /**
     * Obtiene el valor de la propiedad placardOptional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacardOptional() {
        return placardOptional;
    }

    /**
     * Define el valor de la propiedad placardOptional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacardOptional(String value) {
        this.placardOptional = value;
    }

    /**
     * Obtiene el valor de la propiedad hazNbrType.
     * 
     * @return
     *     possible object is
     *     {@link THazardNumberType }
     *     
     */
    public THazardNumberType getHazNbrType() {
        return hazNbrType;
    }

    /**
     * Define el valor de la propiedad hazNbrType.
     * 
     * @param value
     *     allowed object is
     *     {@link THazardNumberType }
     *     
     */
    public void setHazNbrType(THazardNumberType value) {
        this.hazNbrType = value;
    }

}
