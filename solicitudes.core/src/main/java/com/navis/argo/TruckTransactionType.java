//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigInteger;
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
 * <p>Clase Java para TruckTransactionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TruckTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="container" type="{http://www.navis.com/argo}ContainerType" minOccurs="0"/>
 *         &lt;element name="chassis" type="{http://www.navis.com/argo}ChassisType" minOccurs="0"/>
 *         &lt;element name="accessory" type="{http://www.navis.com/argo}AccessoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eq-order" type="{http://www.navis.com/argo}EqOrderType" minOccurs="0"/>
 *         &lt;element name="cancellation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="reason-description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="transaction-stages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transaction-stage" type="{http://www.navis.com/argo}TransactionStageType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="audit" type="{http://www.navis.com/argo}AuditType" minOccurs="0"/>
 *         &lt;element name="documents" type="{http://www.navis.com/argo}GateDocumentsType" minOccurs="0"/>
 *         &lt;element name="messages" type="{http://www.navis.com/argo}MessagesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tran-key" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="tran-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tv-key" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="seq-nbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="exchange-area-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exchange-lane-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mission" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="next-stage-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tran-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="freight-kind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appointment-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="order-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="order-item-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trucking-co-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="truck-position" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="door-direction" type="{http://www.navis.com/argo}DoorDirectionType" />
 *       &lt;attribute name="is-oog" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="oog-front" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="oog-back" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="oog-left" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="oog-right" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="oog-top" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="is-hazard" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="is-hazard-checked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="tran-flex-string01" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tran-flex-string02" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tran-flex-string03" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tran-flex-string04" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tran-flex-string05" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tran-flex-string06" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tran-flex-string07" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tran-flex-string08" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tran-flex-date01" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="tran-flex-date02" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="tran-flex-date03" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="tran-flex-date04" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="chs-is-owners" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="line-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="next-gate-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TruckTransactionType", propOrder = {
    "container",
    "chassis",
    "accessory",
    "eqOrder",
    "cancellation",
    "transactionStages",
    "audit",
    "documents",
    "messages"
})
public class TruckTransactionType {

    protected ContainerType container;
    protected ChassisType chassis;
    protected List<AccessoryType> accessory;
    @XmlElement(name = "eq-order")
    protected EqOrderType eqOrder;
    protected TruckTransactionType.Cancellation cancellation;
    @XmlElement(name = "transaction-stages")
    protected TruckTransactionType.TransactionStages transactionStages;
    protected AuditType audit;
    protected GateDocumentsType documents;
    protected List<MessagesType> messages;
    @XmlAttribute(name = "tran-key")
    protected Long tranKey;
    @XmlAttribute(name = "tran-nbr")
    protected String tranNbr;
    @XmlAttribute(name = "tv-key")
    protected Long tvKey;
    @XmlAttribute(name = "seq-nbr")
    protected BigInteger seqNbr;
    @XmlAttribute(name = "exchange-area-id")
    protected String exchangeAreaId;
    @XmlAttribute(name = "exchange-lane-id")
    protected String exchangeLaneId;
    @XmlAttribute(name = "mission")
    protected String mission;
    @XmlAttribute(name = "stage-id")
    protected String stageId;
    @XmlAttribute(name = "next-stage-id")
    protected String nextStageId;
    @XmlAttribute(name = "tran-type")
    protected String tranType;
    @XmlAttribute(name = "freight-kind")
    protected String freightKind;
    @XmlAttribute(name = "eqid")
    protected String eqid;
    @XmlAttribute(name = "pin")
    protected String pin;
    @XmlAttribute(name = "appointment-nbr")
    protected String appointmentNbr;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "order-nbr")
    protected String orderNbr;
    @XmlAttribute(name = "order-item-nbr")
    protected String orderItemNbr;
    @XmlAttribute(name = "is-confirmed")
    protected Boolean isConfirmed;
    @XmlAttribute(name = "notes")
    protected String notes;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "action")
    protected String action;
    @XmlAttribute(name = "trucking-co-id")
    protected String truckingCoId;
    @XmlAttribute(name = "truck-position")
    protected Long truckPosition;
    @XmlAttribute(name = "door-direction")
    protected DoorDirectionType doorDirection;
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
    @XmlAttribute(name = "is-hazard")
    protected Boolean isHazard;
    @XmlAttribute(name = "is-hazard-checked")
    protected Boolean isHazardChecked;
    @XmlAttribute(name = "tran-flex-string01")
    protected String tranFlexString01;
    @XmlAttribute(name = "tran-flex-string02")
    protected String tranFlexString02;
    @XmlAttribute(name = "tran-flex-string03")
    protected String tranFlexString03;
    @XmlAttribute(name = "tran-flex-string04")
    protected String tranFlexString04;
    @XmlAttribute(name = "tran-flex-string05")
    protected String tranFlexString05;
    @XmlAttribute(name = "tran-flex-string06")
    protected String tranFlexString06;
    @XmlAttribute(name = "tran-flex-string07")
    protected String tranFlexString07;
    @XmlAttribute(name = "tran-flex-string08")
    protected String tranFlexString08;
    @XmlAttribute(name = "tran-flex-date01")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranFlexDate01;
    @XmlAttribute(name = "tran-flex-date02")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranFlexDate02;
    @XmlAttribute(name = "tran-flex-date03")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranFlexDate03;
    @XmlAttribute(name = "tran-flex-date04")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranFlexDate04;
    @XmlAttribute(name = "chs-is-owners")
    protected Boolean chsIsOwners;
    @XmlAttribute(name = "line-id")
    protected String lineId;
    @XmlAttribute(name = "gate-id")
    protected String gateId;
    @XmlAttribute(name = "next-gate-id")
    protected String nextGateId;

    /**
     * Obtiene el valor de la propiedad container.
     * 
     * @return
     *     possible object is
     *     {@link ContainerType }
     *     
     */
    public ContainerType getContainer() {
        return container;
    }

    /**
     * Define el valor de la propiedad container.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerType }
     *     
     */
    public void setContainer(ContainerType value) {
        this.container = value;
    }

    /**
     * Obtiene el valor de la propiedad chassis.
     * 
     * @return
     *     possible object is
     *     {@link ChassisType }
     *     
     */
    public ChassisType getChassis() {
        return chassis;
    }

    /**
     * Define el valor de la propiedad chassis.
     * 
     * @param value
     *     allowed object is
     *     {@link ChassisType }
     *     
     */
    public void setChassis(ChassisType value) {
        this.chassis = value;
    }

    /**
     * Gets the value of the accessory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessoryType }
     * 
     * 
     */
    public List<AccessoryType> getAccessory() {
        if (accessory == null) {
            accessory = new ArrayList<AccessoryType>();
        }
        return this.accessory;
    }

    /**
     * Obtiene el valor de la propiedad eqOrder.
     * 
     * @return
     *     possible object is
     *     {@link EqOrderType }
     *     
     */
    public EqOrderType getEqOrder() {
        return eqOrder;
    }

    /**
     * Define el valor de la propiedad eqOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link EqOrderType }
     *     
     */
    public void setEqOrder(EqOrderType value) {
        this.eqOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad cancellation.
     * 
     * @return
     *     possible object is
     *     {@link TruckTransactionType.Cancellation }
     *     
     */
    public TruckTransactionType.Cancellation getCancellation() {
        return cancellation;
    }

    /**
     * Define el valor de la propiedad cancellation.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckTransactionType.Cancellation }
     *     
     */
    public void setCancellation(TruckTransactionType.Cancellation value) {
        this.cancellation = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionStages.
     * 
     * @return
     *     possible object is
     *     {@link TruckTransactionType.TransactionStages }
     *     
     */
    public TruckTransactionType.TransactionStages getTransactionStages() {
        return transactionStages;
    }

    /**
     * Define el valor de la propiedad transactionStages.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckTransactionType.TransactionStages }
     *     
     */
    public void setTransactionStages(TruckTransactionType.TransactionStages value) {
        this.transactionStages = value;
    }

    /**
     * Obtiene el valor de la propiedad audit.
     * 
     * @return
     *     possible object is
     *     {@link AuditType }
     *     
     */
    public AuditType getAudit() {
        return audit;
    }

    /**
     * Define el valor de la propiedad audit.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditType }
     *     
     */
    public void setAudit(AuditType value) {
        this.audit = value;
    }

    /**
     * Obtiene el valor de la propiedad documents.
     * 
     * @return
     *     possible object is
     *     {@link GateDocumentsType }
     *     
     */
    public GateDocumentsType getDocuments() {
        return documents;
    }

    /**
     * Define el valor de la propiedad documents.
     * 
     * @param value
     *     allowed object is
     *     {@link GateDocumentsType }
     *     
     */
    public void setDocuments(GateDocumentsType value) {
        this.documents = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessagesType }
     * 
     * 
     */
    public List<MessagesType> getMessages() {
        if (messages == null) {
            messages = new ArrayList<MessagesType>();
        }
        return this.messages;
    }

    /**
     * Obtiene el valor de la propiedad tranKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTranKey() {
        return tranKey;
    }

    /**
     * Define el valor de la propiedad tranKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTranKey(Long value) {
        this.tranKey = value;
    }

    /**
     * Obtiene el valor de la propiedad tranNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranNbr() {
        return tranNbr;
    }

    /**
     * Define el valor de la propiedad tranNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranNbr(String value) {
        this.tranNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad tvKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTvKey() {
        return tvKey;
    }

    /**
     * Define el valor de la propiedad tvKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTvKey(Long value) {
        this.tvKey = value;
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
     * Obtiene el valor de la propiedad exchangeLaneId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeLaneId() {
        return exchangeLaneId;
    }

    /**
     * Define el valor de la propiedad exchangeLaneId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeLaneId(String value) {
        this.exchangeLaneId = value;
    }

    /**
     * Obtiene el valor de la propiedad mission.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMission() {
        return mission;
    }

    /**
     * Define el valor de la propiedad mission.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMission(String value) {
        this.mission = value;
    }

    /**
     * Obtiene el valor de la propiedad stageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageId() {
        return stageId;
    }

    /**
     * Define el valor de la propiedad stageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageId(String value) {
        this.stageId = value;
    }

    /**
     * Obtiene el valor de la propiedad nextStageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextStageId() {
        return nextStageId;
    }

    /**
     * Define el valor de la propiedad nextStageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextStageId(String value) {
        this.nextStageId = value;
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
     * Obtiene el valor de la propiedad appointmentNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentNbr() {
        return appointmentNbr;
    }

    /**
     * Define el valor de la propiedad appointmentNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentNbr(String value) {
        this.appointmentNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     * Obtiene el valor de la propiedad orderItemNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemNbr() {
        return orderItemNbr;
    }

    /**
     * Define el valor de la propiedad orderItemNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemNbr(String value) {
        this.orderItemNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad isConfirmed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConfirmed() {
        return isConfirmed;
    }

    /**
     * Define el valor de la propiedad isConfirmed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConfirmed(Boolean value) {
        this.isConfirmed = value;
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
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Define el valor de la propiedad action.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Obtiene el valor de la propiedad truckingCoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckingCoId() {
        return truckingCoId;
    }

    /**
     * Define el valor de la propiedad truckingCoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckingCoId(String value) {
        this.truckingCoId = value;
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

    /**
     * Obtiene el valor de la propiedad isHazard.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHazard() {
        return isHazard;
    }

    /**
     * Define el valor de la propiedad isHazard.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHazard(Boolean value) {
        this.isHazard = value;
    }

    /**
     * Obtiene el valor de la propiedad isHazardChecked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHazardChecked() {
        return isHazardChecked;
    }

    /**
     * Define el valor de la propiedad isHazardChecked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHazardChecked(Boolean value) {
        this.isHazardChecked = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexString01.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranFlexString01() {
        return tranFlexString01;
    }

    /**
     * Define el valor de la propiedad tranFlexString01.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranFlexString01(String value) {
        this.tranFlexString01 = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexString02.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranFlexString02() {
        return tranFlexString02;
    }

    /**
     * Define el valor de la propiedad tranFlexString02.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranFlexString02(String value) {
        this.tranFlexString02 = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexString03.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranFlexString03() {
        return tranFlexString03;
    }

    /**
     * Define el valor de la propiedad tranFlexString03.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranFlexString03(String value) {
        this.tranFlexString03 = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexString04.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranFlexString04() {
        return tranFlexString04;
    }

    /**
     * Define el valor de la propiedad tranFlexString04.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranFlexString04(String value) {
        this.tranFlexString04 = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexString05.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranFlexString05() {
        return tranFlexString05;
    }

    /**
     * Define el valor de la propiedad tranFlexString05.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranFlexString05(String value) {
        this.tranFlexString05 = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexString06.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranFlexString06() {
        return tranFlexString06;
    }

    /**
     * Define el valor de la propiedad tranFlexString06.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranFlexString06(String value) {
        this.tranFlexString06 = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexString07.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranFlexString07() {
        return tranFlexString07;
    }

    /**
     * Define el valor de la propiedad tranFlexString07.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranFlexString07(String value) {
        this.tranFlexString07 = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexString08.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranFlexString08() {
        return tranFlexString08;
    }

    /**
     * Define el valor de la propiedad tranFlexString08.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranFlexString08(String value) {
        this.tranFlexString08 = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexDate01.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranFlexDate01() {
        return tranFlexDate01;
    }

    /**
     * Define el valor de la propiedad tranFlexDate01.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranFlexDate01(XMLGregorianCalendar value) {
        this.tranFlexDate01 = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexDate02.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranFlexDate02() {
        return tranFlexDate02;
    }

    /**
     * Define el valor de la propiedad tranFlexDate02.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranFlexDate02(XMLGregorianCalendar value) {
        this.tranFlexDate02 = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexDate03.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranFlexDate03() {
        return tranFlexDate03;
    }

    /**
     * Define el valor de la propiedad tranFlexDate03.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranFlexDate03(XMLGregorianCalendar value) {
        this.tranFlexDate03 = value;
    }

    /**
     * Obtiene el valor de la propiedad tranFlexDate04.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranFlexDate04() {
        return tranFlexDate04;
    }

    /**
     * Define el valor de la propiedad tranFlexDate04.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranFlexDate04(XMLGregorianCalendar value) {
        this.tranFlexDate04 = value;
    }

    /**
     * Obtiene el valor de la propiedad chsIsOwners.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChsIsOwners() {
        return chsIsOwners;
    }

    /**
     * Define el valor de la propiedad chsIsOwners.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChsIsOwners(Boolean value) {
        this.chsIsOwners = value;
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
     * Obtiene el valor de la propiedad gateId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateId() {
        return gateId;
    }

    /**
     * Define el valor de la propiedad gateId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateId(String value) {
        this.gateId = value;
    }

    /**
     * Obtiene el valor de la propiedad nextGateId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextGateId() {
        return nextGateId;
    }

    /**
     * Define el valor de la propiedad nextGateId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextGateId(String value) {
        this.nextGateId = value;
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
     *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="reason-description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cancellation {

        @XmlAttribute(name = "reason")
        protected String reason;
        @XmlAttribute(name = "reason-description")
        protected String reasonDescription;

        /**
         * Obtiene el valor de la propiedad reason.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Define el valor de la propiedad reason.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
        }

        /**
         * Obtiene el valor de la propiedad reasonDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonDescription() {
            return reasonDescription;
        }

        /**
         * Define el valor de la propiedad reasonDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonDescription(String value) {
            this.reasonDescription = value;
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
     *         &lt;element name="transaction-stage" type="{http://www.navis.com/argo}TransactionStageType" maxOccurs="unbounded" minOccurs="0"/>
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
        "transactionStage"
    })
    public static class TransactionStages {

        @XmlElement(name = "transaction-stage")
        protected List<TransactionStageType> transactionStage;

        /**
         * Gets the value of the transactionStage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transactionStage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransactionStage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TransactionStageType }
         * 
         * 
         */
        public List<TransactionStageType> getTransactionStage() {
            if (transactionStage == null) {
                transactionStage = new ArrayList<TransactionStageType>();
            }
            return this.transactionStage;
        }

    }

}
