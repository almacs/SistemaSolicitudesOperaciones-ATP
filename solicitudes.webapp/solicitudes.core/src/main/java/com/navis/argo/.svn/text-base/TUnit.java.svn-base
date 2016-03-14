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
import javax.xml.bind.annotation.XmlType;


/**
 * The Unit is the central object in SPARCS N4, representing a moveable
 *                 item of inventory consisting of cargo and its packaging. The most obvious example
 *                 being a container and its contents.
 *             
 * 
 * <p>Clase Java para tUnit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipment" type="{http://www.navis.com/argo}tUnitEquipment" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.navis.com/argo}tPosition" minOccurs="0"/>
 *         &lt;element name="routing" type="{http://www.navis.com/argo}tRouting" minOccurs="0"/>
 *         &lt;element name="booking" type="{http://www.navis.com/argo}tBkg" minOccurs="0"/>
 *         &lt;element name="edo" type="{http://www.navis.com/argo}tUnitEdo" minOccurs="0"/>
 *         &lt;element name="ero" type="{http://www.navis.com/argo}tUnitEro" minOccurs="0"/>
 *         &lt;element name="elo" type="{http://www.navis.com/argo}tUnitElo" minOccurs="0"/>
 *         &lt;element name="rail-order" type="{http://www.navis.com/argo}tUnitRailOrder" minOccurs="0"/>
 *         &lt;element name="hazards" type="{http://www.navis.com/argo}tHazards" minOccurs="0"/>
 *         &lt;element name="reefer" type="{http://www.navis.com/argo}tReeferRequirements" minOccurs="0"/>
 *         &lt;element name="reefer-recording-histories" type="{http://www.navis.com/argo}tReeferRecordingHistories" minOccurs="0"/>
 *         &lt;element name="oog" type="{http://www.navis.com/argo}tOog" minOccurs="0"/>
 *         &lt;element name="handling" type="{http://www.navis.com/argo}tUnitHandling" minOccurs="0"/>
 *         &lt;element name="contents" type="{http://www.navis.com/argo}tUnitContents" minOccurs="0"/>
 *         &lt;element name="seals" type="{http://www.navis.com/argo}tUnitSeals" minOccurs="0"/>
 *         &lt;element name="flags" type="{http://www.navis.com/argo}tFlags" minOccurs="0"/>
 *         &lt;element name="unit-etc" type="{http://www.navis.com/argo}tUnitEtc" minOccurs="0"/>
 *         &lt;element name="unit-flex" type="{http://www.navis.com/argo}tUnitFlexFields" minOccurs="0"/>
 *         &lt;element name="ufv-flex" type="{http://www.navis.com/argo}tUfvFlexFields" minOccurs="0"/>
 *         &lt;element name="timestamps" type="{http://www.navis.com/argo}tUfvTimestamps" minOccurs="0"/>
 *         &lt;element name="move-history" type="{http://www.navis.com/argo}tMoveHistory" minOccurs="0"/>
 *         &lt;element name="non-move-history" type="{http://www.navis.com/argo}tNonMoveHistory" minOccurs="0"/>
 *         &lt;element name="goods" type="{http://www.navis.com/argo}tGoods" minOccurs="0"/>
 *         &lt;element name="observed-placards" type="{http://www.navis.com/argo}tObsPlacards" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="unique-key">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.navis.com/argo}tCategory" />
 *       &lt;attribute name="restow" type="{http://www.navis.com/argo}tRestowType" />
 *       &lt;attribute name="import-delivery-order-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transit-state">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="YARD"/>
 *             &lt;enumeration value="ADVISED"/>
 *             &lt;enumeration value="LOADED"/>
 *             &lt;enumeration value="INBOUND"/>
 *             &lt;enumeration value="ECIN"/>
 *             &lt;enumeration value="ECOUT"/>
 *             &lt;enumeration value="DEPARTED"/>
 *             &lt;enumeration value="RETIRED"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
 *       &lt;attribute name="line">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="snx-update-note">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="agent1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agent2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-ib-to-ob-move-direct" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUnit", propOrder = {
    "equipment",
    "position",
    "routing",
    "booking",
    "edo",
    "ero",
    "elo",
    "railOrder",
    "hazards",
    "reefer",
    "reeferRecordingHistories",
    "oog",
    "handling",
    "contents",
    "seals",
    "flags",
    "unitEtc",
    "unitFlex",
    "ufvFlex",
    "timestamps",
    "moveHistory",
    "nonMoveHistory",
    "goods",
    "observedPlacards"
})
public class TUnit {

    protected List<TUnitEquipment> equipment;
    protected TPosition position;
    protected TRouting routing;
    protected TBkg booking;
    protected TUnitEdo edo;
    protected TUnitEro ero;
    protected TUnitElo elo;
    @XmlElement(name = "rail-order")
    protected TUnitRailOrder railOrder;
    protected THazards hazards;
    protected TReeferRequirements reefer;
    @XmlElement(name = "reefer-recording-histories")
    protected TReeferRecordingHistories reeferRecordingHistories;
    protected TOog oog;
    protected TUnitHandling handling;
    protected TUnitContents contents;
    protected TUnitSeals seals;
    protected TFlags flags;
    @XmlElement(name = "unit-etc")
    protected TUnitEtc unitEtc;
    @XmlElement(name = "unit-flex")
    protected TUnitFlexFields unitFlex;
    @XmlElement(name = "ufv-flex")
    protected TUfvFlexFields ufvFlex;
    protected TUfvTimestamps timestamps;
    @XmlElement(name = "move-history")
    protected TMoveHistory moveHistory;
    @XmlElement(name = "non-move-history")
    protected TNonMoveHistory nonMoveHistory;
    protected TGoods goods;
    @XmlElement(name = "observed-placards")
    protected TObsPlacards observedPlacards;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "unique-key")
    protected String uniqueKey;
    @XmlAttribute(name = "remarks")
    protected String remarks;
    @XmlAttribute(name = "category")
    protected TCategory category;
    @XmlAttribute(name = "restow")
    protected TRestowType restow;
    @XmlAttribute(name = "import-delivery-order-id")
    protected String importDeliveryOrderId;
    @XmlAttribute(name = "transit-state")
    protected String transitState;
    @XmlAttribute(name = "freight-kind")
    protected String freightKind;
    @XmlAttribute(name = "line")
    protected String line;
    @XmlAttribute(name = "snx-update-note")
    protected String snxUpdateNote;
    @XmlAttribute(name = "agent1")
    protected String agent1;
    @XmlAttribute(name = "agent2")
    protected String agent2;
    @XmlAttribute(name = "is-ib-to-ob-move-direct")
    protected Boolean isIbToObMoveDirect;

    /**
     * Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TUnitEquipment }
     * 
     * 
     */
    public List<TUnitEquipment> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<TUnitEquipment>();
        }
        return this.equipment;
    }

    /**
     * Obtiene el valor de la propiedad position.
     * 
     * @return
     *     possible object is
     *     {@link TPosition }
     *     
     */
    public TPosition getPosition() {
        return position;
    }

    /**
     * Define el valor de la propiedad position.
     * 
     * @param value
     *     allowed object is
     *     {@link TPosition }
     *     
     */
    public void setPosition(TPosition value) {
        this.position = value;
    }

    /**
     * Obtiene el valor de la propiedad routing.
     * 
     * @return
     *     possible object is
     *     {@link TRouting }
     *     
     */
    public TRouting getRouting() {
        return routing;
    }

    /**
     * Define el valor de la propiedad routing.
     * 
     * @param value
     *     allowed object is
     *     {@link TRouting }
     *     
     */
    public void setRouting(TRouting value) {
        this.routing = value;
    }

    /**
     * Obtiene el valor de la propiedad booking.
     * 
     * @return
     *     possible object is
     *     {@link TBkg }
     *     
     */
    public TBkg getBooking() {
        return booking;
    }

    /**
     * Define el valor de la propiedad booking.
     * 
     * @param value
     *     allowed object is
     *     {@link TBkg }
     *     
     */
    public void setBooking(TBkg value) {
        this.booking = value;
    }

    /**
     * Obtiene el valor de la propiedad edo.
     * 
     * @return
     *     possible object is
     *     {@link TUnitEdo }
     *     
     */
    public TUnitEdo getEdo() {
        return edo;
    }

    /**
     * Define el valor de la propiedad edo.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitEdo }
     *     
     */
    public void setEdo(TUnitEdo value) {
        this.edo = value;
    }

    /**
     * Obtiene el valor de la propiedad ero.
     * 
     * @return
     *     possible object is
     *     {@link TUnitEro }
     *     
     */
    public TUnitEro getEro() {
        return ero;
    }

    /**
     * Define el valor de la propiedad ero.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitEro }
     *     
     */
    public void setEro(TUnitEro value) {
        this.ero = value;
    }

    /**
     * Obtiene el valor de la propiedad elo.
     * 
     * @return
     *     possible object is
     *     {@link TUnitElo }
     *     
     */
    public TUnitElo getElo() {
        return elo;
    }

    /**
     * Define el valor de la propiedad elo.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitElo }
     *     
     */
    public void setElo(TUnitElo value) {
        this.elo = value;
    }

    /**
     * Obtiene el valor de la propiedad railOrder.
     * 
     * @return
     *     possible object is
     *     {@link TUnitRailOrder }
     *     
     */
    public TUnitRailOrder getRailOrder() {
        return railOrder;
    }

    /**
     * Define el valor de la propiedad railOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitRailOrder }
     *     
     */
    public void setRailOrder(TUnitRailOrder value) {
        this.railOrder = value;
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
     * Obtiene el valor de la propiedad reeferRecordingHistories.
     * 
     * @return
     *     possible object is
     *     {@link TReeferRecordingHistories }
     *     
     */
    public TReeferRecordingHistories getReeferRecordingHistories() {
        return reeferRecordingHistories;
    }

    /**
     * Define el valor de la propiedad reeferRecordingHistories.
     * 
     * @param value
     *     allowed object is
     *     {@link TReeferRecordingHistories }
     *     
     */
    public void setReeferRecordingHistories(TReeferRecordingHistories value) {
        this.reeferRecordingHistories = value;
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
     * Obtiene el valor de la propiedad handling.
     * 
     * @return
     *     possible object is
     *     {@link TUnitHandling }
     *     
     */
    public TUnitHandling getHandling() {
        return handling;
    }

    /**
     * Define el valor de la propiedad handling.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitHandling }
     *     
     */
    public void setHandling(TUnitHandling value) {
        this.handling = value;
    }

    /**
     * Obtiene el valor de la propiedad contents.
     * 
     * @return
     *     possible object is
     *     {@link TUnitContents }
     *     
     */
    public TUnitContents getContents() {
        return contents;
    }

    /**
     * Define el valor de la propiedad contents.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitContents }
     *     
     */
    public void setContents(TUnitContents value) {
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
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link TFlags }
     *     
     */
    public TFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link TFlags }
     *     
     */
    public void setFlags(TFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad unitEtc.
     * 
     * @return
     *     possible object is
     *     {@link TUnitEtc }
     *     
     */
    public TUnitEtc getUnitEtc() {
        return unitEtc;
    }

    /**
     * Define el valor de la propiedad unitEtc.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitEtc }
     *     
     */
    public void setUnitEtc(TUnitEtc value) {
        this.unitEtc = value;
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
     * Obtiene el valor de la propiedad timestamps.
     * 
     * @return
     *     possible object is
     *     {@link TUfvTimestamps }
     *     
     */
    public TUfvTimestamps getTimestamps() {
        return timestamps;
    }

    /**
     * Define el valor de la propiedad timestamps.
     * 
     * @param value
     *     allowed object is
     *     {@link TUfvTimestamps }
     *     
     */
    public void setTimestamps(TUfvTimestamps value) {
        this.timestamps = value;
    }

    /**
     * Obtiene el valor de la propiedad moveHistory.
     * 
     * @return
     *     possible object is
     *     {@link TMoveHistory }
     *     
     */
    public TMoveHistory getMoveHistory() {
        return moveHistory;
    }

    /**
     * Define el valor de la propiedad moveHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link TMoveHistory }
     *     
     */
    public void setMoveHistory(TMoveHistory value) {
        this.moveHistory = value;
    }

    /**
     * Obtiene el valor de la propiedad nonMoveHistory.
     * 
     * @return
     *     possible object is
     *     {@link TNonMoveHistory }
     *     
     */
    public TNonMoveHistory getNonMoveHistory() {
        return nonMoveHistory;
    }

    /**
     * Define el valor de la propiedad nonMoveHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonMoveHistory }
     *     
     */
    public void setNonMoveHistory(TNonMoveHistory value) {
        this.nonMoveHistory = value;
    }

    /**
     * Obtiene el valor de la propiedad goods.
     * 
     * @return
     *     possible object is
     *     {@link TGoods }
     *     
     */
    public TGoods getGoods() {
        return goods;
    }

    /**
     * Define el valor de la propiedad goods.
     * 
     * @param value
     *     allowed object is
     *     {@link TGoods }
     *     
     */
    public void setGoods(TGoods value) {
        this.goods = value;
    }

    /**
     * Obtiene el valor de la propiedad observedPlacards.
     * 
     * @return
     *     possible object is
     *     {@link TObsPlacards }
     *     
     */
    public TObsPlacards getObservedPlacards() {
        return observedPlacards;
    }

    /**
     * Define el valor de la propiedad observedPlacards.
     * 
     * @param value
     *     allowed object is
     *     {@link TObsPlacards }
     *     
     */
    public void setObservedPlacards(TObsPlacards value) {
        this.observedPlacards = value;
    }

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
     * Obtiene el valor de la propiedad uniqueKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * Define el valor de la propiedad uniqueKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueKey(String value) {
        this.uniqueKey = value;
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
     * Obtiene el valor de la propiedad restow.
     * 
     * @return
     *     possible object is
     *     {@link TRestowType }
     *     
     */
    public TRestowType getRestow() {
        return restow;
    }

    /**
     * Define el valor de la propiedad restow.
     * 
     * @param value
     *     allowed object is
     *     {@link TRestowType }
     *     
     */
    public void setRestow(TRestowType value) {
        this.restow = value;
    }

    /**
     * Obtiene el valor de la propiedad importDeliveryOrderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportDeliveryOrderId() {
        return importDeliveryOrderId;
    }

    /**
     * Define el valor de la propiedad importDeliveryOrderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportDeliveryOrderId(String value) {
        this.importDeliveryOrderId = value;
    }

    /**
     * Obtiene el valor de la propiedad transitState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitState() {
        return transitState;
    }

    /**
     * Define el valor de la propiedad transitState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitState(String value) {
        this.transitState = value;
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
     * Obtiene el valor de la propiedad line.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine() {
        return line;
    }

    /**
     * Define el valor de la propiedad line.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine(String value) {
        this.line = value;
    }

    /**
     * Obtiene el valor de la propiedad snxUpdateNote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnxUpdateNote() {
        return snxUpdateNote;
    }

    /**
     * Define el valor de la propiedad snxUpdateNote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnxUpdateNote(String value) {
        this.snxUpdateNote = value;
    }

    /**
     * Obtiene el valor de la propiedad agent1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent1() {
        return agent1;
    }

    /**
     * Define el valor de la propiedad agent1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent1(String value) {
        this.agent1 = value;
    }

    /**
     * Obtiene el valor de la propiedad agent2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent2() {
        return agent2;
    }

    /**
     * Define el valor de la propiedad agent2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent2(String value) {
        this.agent2 = value;
    }

    /**
     * Obtiene el valor de la propiedad isIbToObMoveDirect.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIbToObMoveDirect() {
        return isIbToObMoveDirect;
    }

    /**
     * Define el valor de la propiedad isIbToObMoveDirect.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIbToObMoveDirect(Boolean value) {
        this.isIbToObMoveDirect = value;
    }

}
