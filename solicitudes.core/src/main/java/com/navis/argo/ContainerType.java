//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ContainerType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContainerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navis.com/argo}EquipmentIdType">
 *       &lt;sequence>
 *         &lt;element name="accessory" type="{http://www.navis.com/argo}AccessoryType" minOccurs="0"/>
 *         &lt;element name="oog" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="is-oog" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="oog-front" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="oog-back" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="oog-left" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="oog-right" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="oog-top" type="{http://www.w3.org/2001/XMLSchema}long" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="damages" type="{http://www.navis.com/argo}DamagesType" minOccurs="0"/>
 *         &lt;element name="reefer-details" type="{http://www.navis.com/argo}ReeferDetailsType" minOccurs="0"/>
 *         &lt;element name="hazards" type="{http://www.navis.com/argo}HazardsType" minOccurs="0"/>
 *         &lt;element name="placards" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="placard" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="routing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pol-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pod-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pod2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pod2-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="optional-pod1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="optional-pod1-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="optional-pod2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="optional-pod2-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="owner-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="owner-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operator-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operator-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="on-chassis-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="seal-1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="seal-2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="seal-3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="seal-4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shipper-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consignee-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="commodity-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="freight-kind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grade-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grade-description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gross-weight" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="gross-weight-unit" type="{http://www.navis.com/argo}WeightUnitType" />
 *       &lt;attribute name="tare-weight" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="safe-weight" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="departure-order-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="line-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="carrier-visit-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="planned-slot" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="slot" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tran-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-5" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-6" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-7" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-8" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-9" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-10" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-11" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-12" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-13" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-14" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-flex-string-15" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ufv-flex-string-1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ufv-flex-string-2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ufv-flex-string-3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ufv-flex-string-4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ufv-flex-string-5" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ufv-flex-string-6" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ufv-flex-string-7" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ufv-flex-string-8" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ufv-flex-string-9" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ufv-flex-string-10" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ufv-flex-date-1" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ufv-flex-date-2" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="truck-position" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="door-direction" type="{http://www.navis.com/argo}DoorDirectionType" />
 *       &lt;attribute name="is-placarded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="has-documents" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="exchange-area-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerType", propOrder = {
    "accessory",
    "oog",
    "damages",
    "reeferDetails",
    "hazards",
    "placards",
    "routing"
})
public class ContainerType
    extends EquipmentIdType
{

    protected AccessoryType accessory;
    protected ContainerType.Oog oog;
    protected DamagesType damages;
    @XmlElement(name = "reefer-details")
    protected ReeferDetailsType reeferDetails;
    protected HazardsType hazards;
    protected ContainerType.Placards placards;
    protected ContainerType.Routing routing;
    @XmlAttribute(name = "owner-id")
    protected String ownerId;
    @XmlAttribute(name = "owner-name")
    protected String ownerName;
    @XmlAttribute(name = "operator-id")
    protected String operatorId;
    @XmlAttribute(name = "operator-name")
    protected String operatorName;
    @XmlAttribute(name = "on-chassis-id")
    protected String onChassisId;
    @XmlAttribute(name = "seal-1")
    protected String seal1;
    @XmlAttribute(name = "seal-2")
    protected String seal2;
    @XmlAttribute(name = "seal-3")
    protected String seal3;
    @XmlAttribute(name = "seal-4")
    protected String seal4;
    @XmlAttribute(name = "shipper-id")
    protected String shipperId;
    @XmlAttribute(name = "consignee-id")
    protected String consigneeId;
    @XmlAttribute(name = "commodity-id")
    protected String commodityId;
    @XmlAttribute(name = "freight-kind")
    protected String freightKind;
    @XmlAttribute(name = "grade-id")
    protected String gradeId;
    @XmlAttribute(name = "grade-description")
    protected String gradeDescription;
    @XmlAttribute(name = "gross-weight")
    protected Double grossWeight;
    @XmlAttribute(name = "gross-weight-unit")
    protected WeightUnitType grossWeightUnit;
    @XmlAttribute(name = "tare-weight")
    protected Double tareWeight;
    @XmlAttribute(name = "safe-weight")
    protected Double safeWeight;
    @XmlAttribute(name = "departure-order-nbr")
    protected String departureOrderNbr;
    @XmlAttribute(name = "line-id")
    protected String lineId;
    @XmlAttribute(name = "carrier-visit-id")
    protected String carrierVisitId;
    @XmlAttribute(name = "planned-slot")
    protected String plannedSlot;
    @XmlAttribute(name = "slot")
    protected String slot;
    @XmlAttribute(name = "tran-type")
    protected String tranType;
    @XmlAttribute(name = "pin")
    protected String pin;
    @XmlAttribute(name = "unit-flex-string-1")
    protected String unitFlexString1;
    @XmlAttribute(name = "unit-flex-string-2")
    protected String unitFlexString2;
    @XmlAttribute(name = "unit-flex-string-3")
    protected String unitFlexString3;
    @XmlAttribute(name = "unit-flex-string-4")
    protected String unitFlexString4;
    @XmlAttribute(name = "unit-flex-string-5")
    protected String unitFlexString5;
    @XmlAttribute(name = "unit-flex-string-6")
    protected String unitFlexString6;
    @XmlAttribute(name = "unit-flex-string-7")
    protected String unitFlexString7;
    @XmlAttribute(name = "unit-flex-string-8")
    protected String unitFlexString8;
    @XmlAttribute(name = "unit-flex-string-9")
    protected String unitFlexString9;
    @XmlAttribute(name = "unit-flex-string-10")
    protected String unitFlexString10;
    @XmlAttribute(name = "unit-flex-string-11")
    protected String unitFlexString11;
    @XmlAttribute(name = "unit-flex-string-12")
    protected String unitFlexString12;
    @XmlAttribute(name = "unit-flex-string-13")
    protected String unitFlexString13;
    @XmlAttribute(name = "unit-flex-string-14")
    protected String unitFlexString14;
    @XmlAttribute(name = "unit-flex-string-15")
    protected String unitFlexString15;
    @XmlAttribute(name = "ufv-flex-string-1")
    protected String ufvFlexString1;
    @XmlAttribute(name = "ufv-flex-string-2")
    protected String ufvFlexString2;
    @XmlAttribute(name = "ufv-flex-string-3")
    protected String ufvFlexString3;
    @XmlAttribute(name = "ufv-flex-string-4")
    protected String ufvFlexString4;
    @XmlAttribute(name = "ufv-flex-string-5")
    protected String ufvFlexString5;
    @XmlAttribute(name = "ufv-flex-string-6")
    protected String ufvFlexString6;
    @XmlAttribute(name = "ufv-flex-string-7")
    protected String ufvFlexString7;
    @XmlAttribute(name = "ufv-flex-string-8")
    protected String ufvFlexString8;
    @XmlAttribute(name = "ufv-flex-string-9")
    protected String ufvFlexString9;
    @XmlAttribute(name = "ufv-flex-string-10")
    protected String ufvFlexString10;
    @XmlAttribute(name = "ufv-flex-date-1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ufvFlexDate1;
    @XmlAttribute(name = "ufv-flex-date-2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ufvFlexDate2;
    @XmlAttribute(name = "truck-position")
    protected Long truckPosition;
    @XmlAttribute(name = "door-direction")
    protected DoorDirectionType doorDirection;
    @XmlAttribute(name = "is-placarded")
    protected Boolean isPlacarded;
    @XmlAttribute(name = "has-documents")
    protected Boolean hasDocuments;
    @XmlAttribute(name = "exchange-area-id")
    protected String exchangeAreaId;

    /**
     * Obtiene el valor de la propiedad accessory.
     * 
     * @return
     *     possible object is
     *     {@link AccessoryType }
     *     
     */
    public AccessoryType getAccessory() {
        return accessory;
    }

    /**
     * Define el valor de la propiedad accessory.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessoryType }
     *     
     */
    public void setAccessory(AccessoryType value) {
        this.accessory = value;
    }

    /**
     * Obtiene el valor de la propiedad oog.
     * 
     * @return
     *     possible object is
     *     {@link ContainerType.Oog }
     *     
     */
    public ContainerType.Oog getOog() {
        return oog;
    }

    /**
     * Define el valor de la propiedad oog.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerType.Oog }
     *     
     */
    public void setOog(ContainerType.Oog value) {
        this.oog = value;
    }

    /**
     * Obtiene el valor de la propiedad damages.
     * 
     * @return
     *     possible object is
     *     {@link DamagesType }
     *     
     */
    public DamagesType getDamages() {
        return damages;
    }

    /**
     * Define el valor de la propiedad damages.
     * 
     * @param value
     *     allowed object is
     *     {@link DamagesType }
     *     
     */
    public void setDamages(DamagesType value) {
        this.damages = value;
    }

    /**
     * Obtiene el valor de la propiedad reeferDetails.
     * 
     * @return
     *     possible object is
     *     {@link ReeferDetailsType }
     *     
     */
    public ReeferDetailsType getReeferDetails() {
        return reeferDetails;
    }

    /**
     * Define el valor de la propiedad reeferDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ReeferDetailsType }
     *     
     */
    public void setReeferDetails(ReeferDetailsType value) {
        this.reeferDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad hazards.
     * 
     * @return
     *     possible object is
     *     {@link HazardsType }
     *     
     */
    public HazardsType getHazards() {
        return hazards;
    }

    /**
     * Define el valor de la propiedad hazards.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardsType }
     *     
     */
    public void setHazards(HazardsType value) {
        this.hazards = value;
    }

    /**
     * Obtiene el valor de la propiedad placards.
     * 
     * @return
     *     possible object is
     *     {@link ContainerType.Placards }
     *     
     */
    public ContainerType.Placards getPlacards() {
        return placards;
    }

    /**
     * Define el valor de la propiedad placards.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerType.Placards }
     *     
     */
    public void setPlacards(ContainerType.Placards value) {
        this.placards = value;
    }

    /**
     * Obtiene el valor de la propiedad routing.
     * 
     * @return
     *     possible object is
     *     {@link ContainerType.Routing }
     *     
     */
    public ContainerType.Routing getRouting() {
        return routing;
    }

    /**
     * Define el valor de la propiedad routing.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerType.Routing }
     *     
     */
    public void setRouting(ContainerType.Routing value) {
        this.routing = value;
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
     * Obtiene el valor de la propiedad ownerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Define el valor de la propiedad ownerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Define el valor de la propiedad operatorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorId(String value) {
        this.operatorId = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Define el valor de la propiedad operatorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * Obtiene el valor de la propiedad onChassisId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnChassisId() {
        return onChassisId;
    }

    /**
     * Define el valor de la propiedad onChassisId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnChassisId(String value) {
        this.onChassisId = value;
    }

    /**
     * Obtiene el valor de la propiedad seal1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeal1() {
        return seal1;
    }

    /**
     * Define el valor de la propiedad seal1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeal1(String value) {
        this.seal1 = value;
    }

    /**
     * Obtiene el valor de la propiedad seal2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeal2() {
        return seal2;
    }

    /**
     * Define el valor de la propiedad seal2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeal2(String value) {
        this.seal2 = value;
    }

    /**
     * Obtiene el valor de la propiedad seal3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeal3() {
        return seal3;
    }

    /**
     * Define el valor de la propiedad seal3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeal3(String value) {
        this.seal3 = value;
    }

    /**
     * Obtiene el valor de la propiedad seal4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeal4() {
        return seal4;
    }

    /**
     * Define el valor de la propiedad seal4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeal4(String value) {
        this.seal4 = value;
    }

    /**
     * Obtiene el valor de la propiedad shipperId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperId() {
        return shipperId;
    }

    /**
     * Define el valor de la propiedad shipperId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperId(String value) {
        this.shipperId = value;
    }

    /**
     * Obtiene el valor de la propiedad consigneeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeId() {
        return consigneeId;
    }

    /**
     * Define el valor de la propiedad consigneeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeId(String value) {
        this.consigneeId = value;
    }

    /**
     * Obtiene el valor de la propiedad commodityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityId() {
        return commodityId;
    }

    /**
     * Define el valor de la propiedad commodityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityId(String value) {
        this.commodityId = value;
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
     * Obtiene el valor de la propiedad gradeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeId() {
        return gradeId;
    }

    /**
     * Define el valor de la propiedad gradeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeId(String value) {
        this.gradeId = value;
    }

    /**
     * Obtiene el valor de la propiedad gradeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeDescription() {
        return gradeDescription;
    }

    /**
     * Define el valor de la propiedad gradeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeDescription(String value) {
        this.gradeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad grossWeight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGrossWeight() {
        return grossWeight;
    }

    /**
     * Define el valor de la propiedad grossWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGrossWeight(Double value) {
        this.grossWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad grossWeightUnit.
     * 
     * @return
     *     possible object is
     *     {@link WeightUnitType }
     *     
     */
    public WeightUnitType getGrossWeightUnit() {
        return grossWeightUnit;
    }

    /**
     * Define el valor de la propiedad grossWeightUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightUnitType }
     *     
     */
    public void setGrossWeightUnit(WeightUnitType value) {
        this.grossWeightUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad tareWeight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTareWeight() {
        return tareWeight;
    }

    /**
     * Define el valor de la propiedad tareWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTareWeight(Double value) {
        this.tareWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad safeWeight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSafeWeight() {
        return safeWeight;
    }

    /**
     * Define el valor de la propiedad safeWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSafeWeight(Double value) {
        this.safeWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad departureOrderNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureOrderNbr() {
        return departureOrderNbr;
    }

    /**
     * Define el valor de la propiedad departureOrderNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureOrderNbr(String value) {
        this.departureOrderNbr = value;
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
     * Obtiene el valor de la propiedad carrierVisitId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierVisitId() {
        return carrierVisitId;
    }

    /**
     * Define el valor de la propiedad carrierVisitId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierVisitId(String value) {
        this.carrierVisitId = value;
    }

    /**
     * Obtiene el valor de la propiedad plannedSlot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedSlot() {
        return plannedSlot;
    }

    /**
     * Define el valor de la propiedad plannedSlot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedSlot(String value) {
        this.plannedSlot = value;
    }

    /**
     * Obtiene el valor de la propiedad slot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlot() {
        return slot;
    }

    /**
     * Define el valor de la propiedad slot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlot(String value) {
        this.slot = value;
    }

    /**
     * Obtiene el valor de la propiedad tranType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranType() {
        return tranType;
    }

    /**
     * Define el valor de la propiedad tranType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranType(String value) {
        this.tranType = value;
    }

    /**
     * Obtiene el valor de la propiedad pin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Define el valor de la propiedad pin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString1() {
        return unitFlexString1;
    }

    /**
     * Define el valor de la propiedad unitFlexString1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString1(String value) {
        this.unitFlexString1 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString2() {
        return unitFlexString2;
    }

    /**
     * Define el valor de la propiedad unitFlexString2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString2(String value) {
        this.unitFlexString2 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString3() {
        return unitFlexString3;
    }

    /**
     * Define el valor de la propiedad unitFlexString3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString3(String value) {
        this.unitFlexString3 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString4() {
        return unitFlexString4;
    }

    /**
     * Define el valor de la propiedad unitFlexString4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString4(String value) {
        this.unitFlexString4 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString5() {
        return unitFlexString5;
    }

    /**
     * Define el valor de la propiedad unitFlexString5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString5(String value) {
        this.unitFlexString5 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString6() {
        return unitFlexString6;
    }

    /**
     * Define el valor de la propiedad unitFlexString6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString6(String value) {
        this.unitFlexString6 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString7() {
        return unitFlexString7;
    }

    /**
     * Define el valor de la propiedad unitFlexString7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString7(String value) {
        this.unitFlexString7 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString8() {
        return unitFlexString8;
    }

    /**
     * Define el valor de la propiedad unitFlexString8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString8(String value) {
        this.unitFlexString8 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString9() {
        return unitFlexString9;
    }

    /**
     * Define el valor de la propiedad unitFlexString9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString9(String value) {
        this.unitFlexString9 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString10() {
        return unitFlexString10;
    }

    /**
     * Define el valor de la propiedad unitFlexString10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString10(String value) {
        this.unitFlexString10 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString11.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString11() {
        return unitFlexString11;
    }

    /**
     * Define el valor de la propiedad unitFlexString11.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString11(String value) {
        this.unitFlexString11 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString12() {
        return unitFlexString12;
    }

    /**
     * Define el valor de la propiedad unitFlexString12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString12(String value) {
        this.unitFlexString12 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString13() {
        return unitFlexString13;
    }

    /**
     * Define el valor de la propiedad unitFlexString13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString13(String value) {
        this.unitFlexString13 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString14.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString14() {
        return unitFlexString14;
    }

    /**
     * Define el valor de la propiedad unitFlexString14.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString14(String value) {
        this.unitFlexString14 = value;
    }

    /**
     * Obtiene el valor de la propiedad unitFlexString15.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFlexString15() {
        return unitFlexString15;
    }

    /**
     * Define el valor de la propiedad unitFlexString15.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFlexString15(String value) {
        this.unitFlexString15 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexString1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfvFlexString1() {
        return ufvFlexString1;
    }

    /**
     * Define el valor de la propiedad ufvFlexString1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfvFlexString1(String value) {
        this.ufvFlexString1 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexString2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfvFlexString2() {
        return ufvFlexString2;
    }

    /**
     * Define el valor de la propiedad ufvFlexString2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfvFlexString2(String value) {
        this.ufvFlexString2 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexString3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfvFlexString3() {
        return ufvFlexString3;
    }

    /**
     * Define el valor de la propiedad ufvFlexString3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfvFlexString3(String value) {
        this.ufvFlexString3 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexString4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfvFlexString4() {
        return ufvFlexString4;
    }

    /**
     * Define el valor de la propiedad ufvFlexString4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfvFlexString4(String value) {
        this.ufvFlexString4 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexString5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfvFlexString5() {
        return ufvFlexString5;
    }

    /**
     * Define el valor de la propiedad ufvFlexString5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfvFlexString5(String value) {
        this.ufvFlexString5 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexString6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfvFlexString6() {
        return ufvFlexString6;
    }

    /**
     * Define el valor de la propiedad ufvFlexString6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfvFlexString6(String value) {
        this.ufvFlexString6 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexString7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfvFlexString7() {
        return ufvFlexString7;
    }

    /**
     * Define el valor de la propiedad ufvFlexString7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfvFlexString7(String value) {
        this.ufvFlexString7 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexString8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfvFlexString8() {
        return ufvFlexString8;
    }

    /**
     * Define el valor de la propiedad ufvFlexString8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfvFlexString8(String value) {
        this.ufvFlexString8 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexString9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfvFlexString9() {
        return ufvFlexString9;
    }

    /**
     * Define el valor de la propiedad ufvFlexString9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfvFlexString9(String value) {
        this.ufvFlexString9 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexString10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfvFlexString10() {
        return ufvFlexString10;
    }

    /**
     * Define el valor de la propiedad ufvFlexString10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfvFlexString10(String value) {
        this.ufvFlexString10 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexDate1.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUfvFlexDate1() {
        return ufvFlexDate1;
    }

    /**
     * Define el valor de la propiedad ufvFlexDate1.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUfvFlexDate1(XMLGregorianCalendar value) {
        this.ufvFlexDate1 = value;
    }

    /**
     * Obtiene el valor de la propiedad ufvFlexDate2.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUfvFlexDate2() {
        return ufvFlexDate2;
    }

    /**
     * Define el valor de la propiedad ufvFlexDate2.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUfvFlexDate2(XMLGregorianCalendar value) {
        this.ufvFlexDate2 = value;
    }

    /**
     * Obtiene el valor de la propiedad truckPosition.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTruckPosition() {
        return truckPosition;
    }

    /**
     * Define el valor de la propiedad truckPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTruckPosition(Long value) {
        this.truckPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad doorDirection.
     * 
     * @return
     *     possible object is
     *     {@link DoorDirectionType }
     *     
     */
    public DoorDirectionType getDoorDirection() {
        return doorDirection;
    }

    /**
     * Define el valor de la propiedad doorDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorDirectionType }
     *     
     */
    public void setDoorDirection(DoorDirectionType value) {
        this.doorDirection = value;
    }

    /**
     * Obtiene el valor de la propiedad isPlacarded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPlacarded() {
        return isPlacarded;
    }

    /**
     * Define el valor de la propiedad isPlacarded.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPlacarded(Boolean value) {
        this.isPlacarded = value;
    }

    /**
     * Obtiene el valor de la propiedad hasDocuments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDocuments() {
        return hasDocuments;
    }

    /**
     * Define el valor de la propiedad hasDocuments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDocuments(Boolean value) {
        this.hasDocuments = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeAreaId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeAreaId() {
        return exchangeAreaId;
    }

    /**
     * Define el valor de la propiedad exchangeAreaId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeAreaId(String value) {
        this.exchangeAreaId = value;
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
     *       &lt;attribute name="is-oog" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="oog-front" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="oog-back" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="oog-left" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="oog-right" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="oog-top" type="{http://www.w3.org/2001/XMLSchema}long" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Oog {

        @XmlAttribute(name = "is-oog")
        protected Boolean isOog;
        @XmlAttribute(name = "oog-front")
        protected Long oogFront;
        @XmlAttribute(name = "oog-back")
        protected Long oogBack;
        @XmlAttribute(name = "oog-left")
        protected Long oogLeft;
        @XmlAttribute(name = "oog-right")
        protected Long oogRight;
        @XmlAttribute(name = "oog-top")
        protected Long oogTop;

        /**
         * Obtiene el valor de la propiedad isOog.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsOog() {
            return isOog;
        }

        /**
         * Define el valor de la propiedad isOog.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsOog(Boolean value) {
            this.isOog = value;
        }

        /**
         * Obtiene el valor de la propiedad oogFront.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOogFront() {
            return oogFront;
        }

        /**
         * Define el valor de la propiedad oogFront.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOogFront(Long value) {
            this.oogFront = value;
        }

        /**
         * Obtiene el valor de la propiedad oogBack.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOogBack() {
            return oogBack;
        }

        /**
         * Define el valor de la propiedad oogBack.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOogBack(Long value) {
            this.oogBack = value;
        }

        /**
         * Obtiene el valor de la propiedad oogLeft.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOogLeft() {
            return oogLeft;
        }

        /**
         * Define el valor de la propiedad oogLeft.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOogLeft(Long value) {
            this.oogLeft = value;
        }

        /**
         * Obtiene el valor de la propiedad oogRight.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOogRight() {
            return oogRight;
        }

        /**
         * Define el valor de la propiedad oogRight.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOogRight(Long value) {
            this.oogRight = value;
        }

        /**
         * Obtiene el valor de la propiedad oogTop.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOogTop() {
            return oogTop;
        }

        /**
         * Define el valor de la propiedad oogTop.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOogTop(Long value) {
            this.oogTop = value;
        }

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
     *         &lt;element name="placard" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @XmlType(name = "", propOrder = {
        "placard"
    })
    public static class Placards {

        protected List<ContainerType.Placards.Placard> placard;

        /**
         * Gets the value of the placard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the placard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlacard().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContainerType.Placards.Placard }
         * 
         * 
         */
        public List<ContainerType.Placards.Placard> getPlacard() {
            if (placard == null) {
                placard = new ArrayList<ContainerType.Placards.Placard>();
            }
            return this.placard;
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
         *       &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Placard {

            @XmlAttribute(name = "text", required = true)
            protected String text;

            /**
             * Obtiene el valor de la propiedad text.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Define el valor de la propiedad text.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

        }

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
     *       &lt;attribute name="origin" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="destination" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pol" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pol-name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pod" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pod-name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pod2" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pod2-name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="optional-pod1" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="optional-pod1-name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="optional-pod2" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="optional-pod2-name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Routing {

        @XmlAttribute(name = "origin")
        protected String origin;
        @XmlAttribute(name = "destination")
        protected String destination;
        @XmlAttribute(name = "pol")
        protected String pol;
        @XmlAttribute(name = "pol-name")
        protected String polName;
        @XmlAttribute(name = "pod")
        protected String pod;
        @XmlAttribute(name = "pod-name")
        protected String podName;
        @XmlAttribute(name = "pod2")
        protected String pod2;
        @XmlAttribute(name = "pod2-name")
        protected String pod2Name;
        @XmlAttribute(name = "optional-pod1")
        protected String optionalPod1;
        @XmlAttribute(name = "optional-pod1-name")
        protected String optionalPod1Name;
        @XmlAttribute(name = "optional-pod2")
        protected String optionalPod2;
        @XmlAttribute(name = "optional-pod2-name")
        protected String optionalPod2Name;

        /**
         * Obtiene el valor de la propiedad origin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * Define el valor de la propiedad origin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * Obtiene el valor de la propiedad destination.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestination() {
            return destination;
        }

        /**
         * Define el valor de la propiedad destination.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestination(String value) {
            this.destination = value;
        }

        /**
         * Obtiene el valor de la propiedad pol.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPol() {
            return pol;
        }

        /**
         * Define el valor de la propiedad pol.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPol(String value) {
            this.pol = value;
        }

        /**
         * Obtiene el valor de la propiedad polName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolName() {
            return polName;
        }

        /**
         * Define el valor de la propiedad polName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolName(String value) {
            this.polName = value;
        }

        /**
         * Obtiene el valor de la propiedad pod.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPod() {
            return pod;
        }

        /**
         * Define el valor de la propiedad pod.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPod(String value) {
            this.pod = value;
        }

        /**
         * Obtiene el valor de la propiedad podName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPodName() {
            return podName;
        }

        /**
         * Define el valor de la propiedad podName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPodName(String value) {
            this.podName = value;
        }

        /**
         * Obtiene el valor de la propiedad pod2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPod2() {
            return pod2;
        }

        /**
         * Define el valor de la propiedad pod2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPod2(String value) {
            this.pod2 = value;
        }

        /**
         * Obtiene el valor de la propiedad pod2Name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPod2Name() {
            return pod2Name;
        }

        /**
         * Define el valor de la propiedad pod2Name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPod2Name(String value) {
            this.pod2Name = value;
        }

        /**
         * Obtiene el valor de la propiedad optionalPod1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionalPod1() {
            return optionalPod1;
        }

        /**
         * Define el valor de la propiedad optionalPod1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionalPod1(String value) {
            this.optionalPod1 = value;
        }

        /**
         * Obtiene el valor de la propiedad optionalPod1Name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionalPod1Name() {
            return optionalPod1Name;
        }

        /**
         * Define el valor de la propiedad optionalPod1Name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionalPod1Name(String value) {
            this.optionalPod1Name = value;
        }

        /**
         * Obtiene el valor de la propiedad optionalPod2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionalPod2() {
            return optionalPod2;
        }

        /**
         * Define el valor de la propiedad optionalPod2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionalPod2(String value) {
            this.optionalPod2 = value;
        }

        /**
         * Obtiene el valor de la propiedad optionalPod2Name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionalPod2Name() {
            return optionalPod2Name;
        }

        /**
         * Define el valor de la propiedad optionalPod2Name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionalPod2Name(String value) {
            this.optionalPod2Name = value;
        }

    }

}
