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
 * Equipment Type Definition.
 * 
 * <p>Clase Java para tEquipType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tEquipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scope" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataSource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isDepricated" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isArchtype" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="basicLength" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="BASIC20"/>
 *             &lt;enumeration value="BASIC40"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nominalLength">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NOM20"/>
 *             &lt;enumeration value="NOM40"/>
 *             &lt;enumeration value="NOM45"/>
 *             &lt;enumeration value="NOM24"/>
 *             &lt;enumeration value="NOM30"/>
 *             &lt;enumeration value="NOM48"/>
 *             &lt;enumeration value="NOM53"/>
 *             &lt;enumeration value="NOMXX"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rfrType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NON_RFR"/>
 *             &lt;enumeration value="PORTHOLE"/>
 *             &lt;enumeration value="FANTAINER"/>
 *             &lt;enumeration value="INTEG_UNK"/>
 *             &lt;enumeration value="INTEG_H20_SINGLE"/>
 *             &lt;enumeration value="INTEG_H20"/>
 *             &lt;enumeration value="INTEG_AIR_SINGLE"/>
 *             &lt;enumeration value="INTEG_AIR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="class" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="CONTAINER"/>
 *             &lt;enumeration value="CHASSIS"/>
 *             &lt;enumeration value="SERMITRAILER"/>
 *             &lt;enumeration value="MAFI"/>
 *             &lt;enumeration value="ACCESSORY"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="iso-group" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lengthMm" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="heightMm" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="widthMm" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="tareWeightKg" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="saveWeightKg" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pictId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="milliTeus" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="usesAccessories" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isTemperatureControlled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="oogOk" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isUnsealable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hasWheels" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isOpen" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fits20" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fits24" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fits30" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fits40" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fits45" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fits48" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fits53" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isChassisNoPick" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isChassisTriaxle" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isSuperFreezeReefer" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isControlledAtmosphereReefer" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="noStowOnTopIfEmpty" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="noStowOnTopIfLaden" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="mustStowBelowDeck" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="mustStowAboveDeck" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEquipType")
public class TEquipType {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "scope", required = true)
    protected String scope;
    @XmlAttribute(name = "dataSource", required = true)
    protected String dataSource;
    @XmlAttribute(name = "isDepricated", required = true)
    protected boolean isDepricated;
    @XmlAttribute(name = "isArchtype", required = true)
    protected boolean isArchtype;
    @XmlAttribute(name = "basicLength", required = true)
    protected String basicLength;
    @XmlAttribute(name = "nominalLength")
    protected String nominalLength;
    @XmlAttribute(name = "rfrType", required = true)
    protected String rfrType;
    @XmlAttribute(name = "class", required = true)
    protected String clazz;
    @XmlAttribute(name = "iso-group", required = true)
    protected String isoGroup;
    @XmlAttribute(name = "lengthMm", required = true)
    protected int lengthMm;
    @XmlAttribute(name = "heightMm", required = true)
    protected int heightMm;
    @XmlAttribute(name = "widthMm", required = true)
    protected int widthMm;
    @XmlAttribute(name = "tareWeightKg", required = true)
    protected double tareWeightKg;
    @XmlAttribute(name = "saveWeightKg", required = true)
    protected double saveWeightKg;
    @XmlAttribute(name = "description", required = true)
    protected String description;
    @XmlAttribute(name = "pictId", required = true)
    protected int pictId;
    @XmlAttribute(name = "milliTeus", required = true)
    protected int milliTeus;
    @XmlAttribute(name = "usesAccessories", required = true)
    protected boolean usesAccessories;
    @XmlAttribute(name = "isTemperatureControlled", required = true)
    protected boolean isTemperatureControlled;
    @XmlAttribute(name = "oogOk", required = true)
    protected boolean oogOk;
    @XmlAttribute(name = "isUnsealable", required = true)
    protected boolean isUnsealable;
    @XmlAttribute(name = "hasWheels", required = true)
    protected boolean hasWheels;
    @XmlAttribute(name = "isOpen", required = true)
    protected boolean isOpen;
    @XmlAttribute(name = "fits20", required = true)
    protected boolean fits20;
    @XmlAttribute(name = "fits24", required = true)
    protected boolean fits24;
    @XmlAttribute(name = "fits30", required = true)
    protected boolean fits30;
    @XmlAttribute(name = "fits40", required = true)
    protected boolean fits40;
    @XmlAttribute(name = "fits45", required = true)
    protected boolean fits45;
    @XmlAttribute(name = "fits48", required = true)
    protected boolean fits48;
    @XmlAttribute(name = "fits53", required = true)
    protected boolean fits53;
    @XmlAttribute(name = "isChassisNoPick", required = true)
    protected boolean isChassisNoPick;
    @XmlAttribute(name = "isChassisTriaxle", required = true)
    protected boolean isChassisTriaxle;
    @XmlAttribute(name = "isSuperFreezeReefer", required = true)
    protected boolean isSuperFreezeReefer;
    @XmlAttribute(name = "isControlledAtmosphereReefer", required = true)
    protected boolean isControlledAtmosphereReefer;
    @XmlAttribute(name = "noStowOnTopIfEmpty", required = true)
    protected boolean noStowOnTopIfEmpty;
    @XmlAttribute(name = "noStowOnTopIfLaden", required = true)
    protected boolean noStowOnTopIfLaden;
    @XmlAttribute(name = "mustStowBelowDeck", required = true)
    protected boolean mustStowBelowDeck;
    @XmlAttribute(name = "mustStowAboveDeck", required = true)
    protected boolean mustStowAboveDeck;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad scope.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Define el valor de la propiedad scope.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Obtiene el valor de la propiedad dataSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Define el valor de la propiedad dataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Obtiene el valor de la propiedad isDepricated.
     * 
     */
    public boolean isIsDepricated() {
        return isDepricated;
    }

    /**
     * Define el valor de la propiedad isDepricated.
     * 
     */
    public void setIsDepricated(boolean value) {
        this.isDepricated = value;
    }

    /**
     * Obtiene el valor de la propiedad isArchtype.
     * 
     */
    public boolean isIsArchtype() {
        return isArchtype;
    }

    /**
     * Define el valor de la propiedad isArchtype.
     * 
     */
    public void setIsArchtype(boolean value) {
        this.isArchtype = value;
    }

    /**
     * Obtiene el valor de la propiedad basicLength.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicLength() {
        return basicLength;
    }

    /**
     * Define el valor de la propiedad basicLength.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicLength(String value) {
        this.basicLength = value;
    }

    /**
     * Obtiene el valor de la propiedad nominalLength.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalLength() {
        return nominalLength;
    }

    /**
     * Define el valor de la propiedad nominalLength.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalLength(String value) {
        this.nominalLength = value;
    }

    /**
     * Obtiene el valor de la propiedad rfrType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrType() {
        return rfrType;
    }

    /**
     * Define el valor de la propiedad rfrType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfrType(String value) {
        this.rfrType = value;
    }

    /**
     * Obtiene el valor de la propiedad clazz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Define el valor de la propiedad clazz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Obtiene el valor de la propiedad isoGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoGroup() {
        return isoGroup;
    }

    /**
     * Define el valor de la propiedad isoGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoGroup(String value) {
        this.isoGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad lengthMm.
     * 
     */
    public int getLengthMm() {
        return lengthMm;
    }

    /**
     * Define el valor de la propiedad lengthMm.
     * 
     */
    public void setLengthMm(int value) {
        this.lengthMm = value;
    }

    /**
     * Obtiene el valor de la propiedad heightMm.
     * 
     */
    public int getHeightMm() {
        return heightMm;
    }

    /**
     * Define el valor de la propiedad heightMm.
     * 
     */
    public void setHeightMm(int value) {
        this.heightMm = value;
    }

    /**
     * Obtiene el valor de la propiedad widthMm.
     * 
     */
    public int getWidthMm() {
        return widthMm;
    }

    /**
     * Define el valor de la propiedad widthMm.
     * 
     */
    public void setWidthMm(int value) {
        this.widthMm = value;
    }

    /**
     * Obtiene el valor de la propiedad tareWeightKg.
     * 
     */
    public double getTareWeightKg() {
        return tareWeightKg;
    }

    /**
     * Define el valor de la propiedad tareWeightKg.
     * 
     */
    public void setTareWeightKg(double value) {
        this.tareWeightKg = value;
    }

    /**
     * Obtiene el valor de la propiedad saveWeightKg.
     * 
     */
    public double getSaveWeightKg() {
        return saveWeightKg;
    }

    /**
     * Define el valor de la propiedad saveWeightKg.
     * 
     */
    public void setSaveWeightKg(double value) {
        this.saveWeightKg = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad pictId.
     * 
     */
    public int getPictId() {
        return pictId;
    }

    /**
     * Define el valor de la propiedad pictId.
     * 
     */
    public void setPictId(int value) {
        this.pictId = value;
    }

    /**
     * Obtiene el valor de la propiedad milliTeus.
     * 
     */
    public int getMilliTeus() {
        return milliTeus;
    }

    /**
     * Define el valor de la propiedad milliTeus.
     * 
     */
    public void setMilliTeus(int value) {
        this.milliTeus = value;
    }

    /**
     * Obtiene el valor de la propiedad usesAccessories.
     * 
     */
    public boolean isUsesAccessories() {
        return usesAccessories;
    }

    /**
     * Define el valor de la propiedad usesAccessories.
     * 
     */
    public void setUsesAccessories(boolean value) {
        this.usesAccessories = value;
    }

    /**
     * Obtiene el valor de la propiedad isTemperatureControlled.
     * 
     */
    public boolean isIsTemperatureControlled() {
        return isTemperatureControlled;
    }

    /**
     * Define el valor de la propiedad isTemperatureControlled.
     * 
     */
    public void setIsTemperatureControlled(boolean value) {
        this.isTemperatureControlled = value;
    }

    /**
     * Obtiene el valor de la propiedad oogOk.
     * 
     */
    public boolean isOogOk() {
        return oogOk;
    }

    /**
     * Define el valor de la propiedad oogOk.
     * 
     */
    public void setOogOk(boolean value) {
        this.oogOk = value;
    }

    /**
     * Obtiene el valor de la propiedad isUnsealable.
     * 
     */
    public boolean isIsUnsealable() {
        return isUnsealable;
    }

    /**
     * Define el valor de la propiedad isUnsealable.
     * 
     */
    public void setIsUnsealable(boolean value) {
        this.isUnsealable = value;
    }

    /**
     * Obtiene el valor de la propiedad hasWheels.
     * 
     */
    public boolean isHasWheels() {
        return hasWheels;
    }

    /**
     * Define el valor de la propiedad hasWheels.
     * 
     */
    public void setHasWheels(boolean value) {
        this.hasWheels = value;
    }

    /**
     * Obtiene el valor de la propiedad isOpen.
     * 
     */
    public boolean isIsOpen() {
        return isOpen;
    }

    /**
     * Define el valor de la propiedad isOpen.
     * 
     */
    public void setIsOpen(boolean value) {
        this.isOpen = value;
    }

    /**
     * Obtiene el valor de la propiedad fits20.
     * 
     */
    public boolean isFits20() {
        return fits20;
    }

    /**
     * Define el valor de la propiedad fits20.
     * 
     */
    public void setFits20(boolean value) {
        this.fits20 = value;
    }

    /**
     * Obtiene el valor de la propiedad fits24.
     * 
     */
    public boolean isFits24() {
        return fits24;
    }

    /**
     * Define el valor de la propiedad fits24.
     * 
     */
    public void setFits24(boolean value) {
        this.fits24 = value;
    }

    /**
     * Obtiene el valor de la propiedad fits30.
     * 
     */
    public boolean isFits30() {
        return fits30;
    }

    /**
     * Define el valor de la propiedad fits30.
     * 
     */
    public void setFits30(boolean value) {
        this.fits30 = value;
    }

    /**
     * Obtiene el valor de la propiedad fits40.
     * 
     */
    public boolean isFits40() {
        return fits40;
    }

    /**
     * Define el valor de la propiedad fits40.
     * 
     */
    public void setFits40(boolean value) {
        this.fits40 = value;
    }

    /**
     * Obtiene el valor de la propiedad fits45.
     * 
     */
    public boolean isFits45() {
        return fits45;
    }

    /**
     * Define el valor de la propiedad fits45.
     * 
     */
    public void setFits45(boolean value) {
        this.fits45 = value;
    }

    /**
     * Obtiene el valor de la propiedad fits48.
     * 
     */
    public boolean isFits48() {
        return fits48;
    }

    /**
     * Define el valor de la propiedad fits48.
     * 
     */
    public void setFits48(boolean value) {
        this.fits48 = value;
    }

    /**
     * Obtiene el valor de la propiedad fits53.
     * 
     */
    public boolean isFits53() {
        return fits53;
    }

    /**
     * Define el valor de la propiedad fits53.
     * 
     */
    public void setFits53(boolean value) {
        this.fits53 = value;
    }

    /**
     * Obtiene el valor de la propiedad isChassisNoPick.
     * 
     */
    public boolean isIsChassisNoPick() {
        return isChassisNoPick;
    }

    /**
     * Define el valor de la propiedad isChassisNoPick.
     * 
     */
    public void setIsChassisNoPick(boolean value) {
        this.isChassisNoPick = value;
    }

    /**
     * Obtiene el valor de la propiedad isChassisTriaxle.
     * 
     */
    public boolean isIsChassisTriaxle() {
        return isChassisTriaxle;
    }

    /**
     * Define el valor de la propiedad isChassisTriaxle.
     * 
     */
    public void setIsChassisTriaxle(boolean value) {
        this.isChassisTriaxle = value;
    }

    /**
     * Obtiene el valor de la propiedad isSuperFreezeReefer.
     * 
     */
    public boolean isIsSuperFreezeReefer() {
        return isSuperFreezeReefer;
    }

    /**
     * Define el valor de la propiedad isSuperFreezeReefer.
     * 
     */
    public void setIsSuperFreezeReefer(boolean value) {
        this.isSuperFreezeReefer = value;
    }

    /**
     * Obtiene el valor de la propiedad isControlledAtmosphereReefer.
     * 
     */
    public boolean isIsControlledAtmosphereReefer() {
        return isControlledAtmosphereReefer;
    }

    /**
     * Define el valor de la propiedad isControlledAtmosphereReefer.
     * 
     */
    public void setIsControlledAtmosphereReefer(boolean value) {
        this.isControlledAtmosphereReefer = value;
    }

    /**
     * Obtiene el valor de la propiedad noStowOnTopIfEmpty.
     * 
     */
    public boolean isNoStowOnTopIfEmpty() {
        return noStowOnTopIfEmpty;
    }

    /**
     * Define el valor de la propiedad noStowOnTopIfEmpty.
     * 
     */
    public void setNoStowOnTopIfEmpty(boolean value) {
        this.noStowOnTopIfEmpty = value;
    }

    /**
     * Obtiene el valor de la propiedad noStowOnTopIfLaden.
     * 
     */
    public boolean isNoStowOnTopIfLaden() {
        return noStowOnTopIfLaden;
    }

    /**
     * Define el valor de la propiedad noStowOnTopIfLaden.
     * 
     */
    public void setNoStowOnTopIfLaden(boolean value) {
        this.noStowOnTopIfLaden = value;
    }

    /**
     * Obtiene el valor de la propiedad mustStowBelowDeck.
     * 
     */
    public boolean isMustStowBelowDeck() {
        return mustStowBelowDeck;
    }

    /**
     * Define el valor de la propiedad mustStowBelowDeck.
     * 
     */
    public void setMustStowBelowDeck(boolean value) {
        this.mustStowBelowDeck = value;
    }

    /**
     * Obtiene el valor de la propiedad mustStowAboveDeck.
     * 
     */
    public boolean isMustStowAboveDeck() {
        return mustStowAboveDeck;
    }

    /**
     * Define el valor de la propiedad mustStowAboveDeck.
     * 
     */
    public void setMustStowAboveDeck(boolean value) {
        this.mustStowAboveDeck = value;
    }

}
