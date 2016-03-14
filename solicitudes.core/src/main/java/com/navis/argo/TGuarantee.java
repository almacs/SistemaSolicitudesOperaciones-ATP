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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tGuarantee complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tGuarantee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billToInformation" type="{http://www.navis.com/argo}tBillToInformation" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="n4-user-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applied-to-class" type="{http://www.navis.com/argo}tGuaranteeAppliedToClass" />
 *       &lt;attribute name="applied-to-natural-key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applied-to-primary-key" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ext-user-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ext-user-contact-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ext-user-address1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ext-user-address2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ext-user-address3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ext-user-city" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ext-user-state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ext-user-country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ext-user-telephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ext-user-fax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ext-user-email-address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.navis.com/argo}tGuaranteeType" />
 *       &lt;attribute name="override-value-type" type="{http://www.navis.com/argo}tGuaranteeOverrideType" />
 *       &lt;attribute name="start-day" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="end-day" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="voided-expired-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="authorization-expiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="customer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customer-biz-role" type="{http://www.navis.com/argo}tBizRole" />
 *       &lt;attribute name="waiver-expiration-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="customer-reference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGuarantee", propOrder = {
    "billToInformation"
})
public class TGuarantee {

    protected TBillToInformation billToInformation;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "action")
    protected String action;
    @XmlAttribute(name = "n4-user-id")
    protected String n4UserId;
    @XmlAttribute(name = "applied-to-class")
    protected TGuaranteeAppliedToClass appliedToClass;
    @XmlAttribute(name = "applied-to-natural-key")
    protected String appliedToNaturalKey;
    @XmlAttribute(name = "applied-to-primary-key")
    protected Long appliedToPrimaryKey;
    @XmlAttribute(name = "ext-user-id")
    protected String extUserId;
    @XmlAttribute(name = "ext-user-contact-name")
    protected String extUserContactName;
    @XmlAttribute(name = "ext-user-address1")
    protected String extUserAddress1;
    @XmlAttribute(name = "ext-user-address2")
    protected String extUserAddress2;
    @XmlAttribute(name = "ext-user-address3")
    protected String extUserAddress3;
    @XmlAttribute(name = "ext-user-city")
    protected String extUserCity;
    @XmlAttribute(name = "ext-user-state")
    protected String extUserState;
    @XmlAttribute(name = "ext-user-country")
    protected String extUserCountry;
    @XmlAttribute(name = "ext-user-telephone")
    protected String extUserTelephone;
    @XmlAttribute(name = "ext-user-fax")
    protected String extUserFax;
    @XmlAttribute(name = "ext-user-email-address")
    protected String extUserEmailAddress;
    @XmlAttribute(name = "type")
    protected TGuaranteeType type;
    @XmlAttribute(name = "override-value-type")
    protected TGuaranteeOverrideType overrideValueType;
    @XmlAttribute(name = "start-day")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDay;
    @XmlAttribute(name = "end-day")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDay;
    @XmlAttribute(name = "quantity")
    protected Double quantity;
    @XmlAttribute(name = "amount")
    protected Double amount;
    @XmlAttribute(name = "notes")
    protected String notes;
    @XmlAttribute(name = "voided-expired-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voidedExpiredDate;
    @XmlAttribute(name = "authorization-expiration")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorizationExpiration;
    @XmlAttribute(name = "customer")
    protected String customer;
    @XmlAttribute(name = "customer-biz-role")
    protected TBizRole customerBizRole;
    @XmlAttribute(name = "waiver-expiration-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar waiverExpirationDate;
    @XmlAttribute(name = "customer-reference")
    protected String customerReference;

    /**
     * Obtiene el valor de la propiedad billToInformation.
     * 
     * @return
     *     possible object is
     *     {@link TBillToInformation }
     *     
     */
    public TBillToInformation getBillToInformation() {
        return billToInformation;
    }

    /**
     * Define el valor de la propiedad billToInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link TBillToInformation }
     *     
     */
    public void setBillToInformation(TBillToInformation value) {
        this.billToInformation = value;
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
     * Obtiene el valor de la propiedad n4UserId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN4UserId() {
        return n4UserId;
    }

    /**
     * Define el valor de la propiedad n4UserId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN4UserId(String value) {
        this.n4UserId = value;
    }

    /**
     * Obtiene el valor de la propiedad appliedToClass.
     * 
     * @return
     *     possible object is
     *     {@link TGuaranteeAppliedToClass }
     *     
     */
    public TGuaranteeAppliedToClass getAppliedToClass() {
        return appliedToClass;
    }

    /**
     * Define el valor de la propiedad appliedToClass.
     * 
     * @param value
     *     allowed object is
     *     {@link TGuaranteeAppliedToClass }
     *     
     */
    public void setAppliedToClass(TGuaranteeAppliedToClass value) {
        this.appliedToClass = value;
    }

    /**
     * Obtiene el valor de la propiedad appliedToNaturalKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedToNaturalKey() {
        return appliedToNaturalKey;
    }

    /**
     * Define el valor de la propiedad appliedToNaturalKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedToNaturalKey(String value) {
        this.appliedToNaturalKey = value;
    }

    /**
     * Obtiene el valor de la propiedad appliedToPrimaryKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAppliedToPrimaryKey() {
        return appliedToPrimaryKey;
    }

    /**
     * Define el valor de la propiedad appliedToPrimaryKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAppliedToPrimaryKey(Long value) {
        this.appliedToPrimaryKey = value;
    }

    /**
     * Obtiene el valor de la propiedad extUserId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUserId() {
        return extUserId;
    }

    /**
     * Define el valor de la propiedad extUserId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUserId(String value) {
        this.extUserId = value;
    }

    /**
     * Obtiene el valor de la propiedad extUserContactName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUserContactName() {
        return extUserContactName;
    }

    /**
     * Define el valor de la propiedad extUserContactName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUserContactName(String value) {
        this.extUserContactName = value;
    }

    /**
     * Obtiene el valor de la propiedad extUserAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUserAddress1() {
        return extUserAddress1;
    }

    /**
     * Define el valor de la propiedad extUserAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUserAddress1(String value) {
        this.extUserAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad extUserAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUserAddress2() {
        return extUserAddress2;
    }

    /**
     * Define el valor de la propiedad extUserAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUserAddress2(String value) {
        this.extUserAddress2 = value;
    }

    /**
     * Obtiene el valor de la propiedad extUserAddress3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUserAddress3() {
        return extUserAddress3;
    }

    /**
     * Define el valor de la propiedad extUserAddress3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUserAddress3(String value) {
        this.extUserAddress3 = value;
    }

    /**
     * Obtiene el valor de la propiedad extUserCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUserCity() {
        return extUserCity;
    }

    /**
     * Define el valor de la propiedad extUserCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUserCity(String value) {
        this.extUserCity = value;
    }

    /**
     * Obtiene el valor de la propiedad extUserState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUserState() {
        return extUserState;
    }

    /**
     * Define el valor de la propiedad extUserState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUserState(String value) {
        this.extUserState = value;
    }

    /**
     * Obtiene el valor de la propiedad extUserCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUserCountry() {
        return extUserCountry;
    }

    /**
     * Define el valor de la propiedad extUserCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUserCountry(String value) {
        this.extUserCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad extUserTelephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUserTelephone() {
        return extUserTelephone;
    }

    /**
     * Define el valor de la propiedad extUserTelephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUserTelephone(String value) {
        this.extUserTelephone = value;
    }

    /**
     * Obtiene el valor de la propiedad extUserFax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUserFax() {
        return extUserFax;
    }

    /**
     * Define el valor de la propiedad extUserFax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUserFax(String value) {
        this.extUserFax = value;
    }

    /**
     * Obtiene el valor de la propiedad extUserEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUserEmailAddress() {
        return extUserEmailAddress;
    }

    /**
     * Define el valor de la propiedad extUserEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUserEmailAddress(String value) {
        this.extUserEmailAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link TGuaranteeType }
     *     
     */
    public TGuaranteeType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link TGuaranteeType }
     *     
     */
    public void setType(TGuaranteeType value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad overrideValueType.
     * 
     * @return
     *     possible object is
     *     {@link TGuaranteeOverrideType }
     *     
     */
    public TGuaranteeOverrideType getOverrideValueType() {
        return overrideValueType;
    }

    /**
     * Define el valor de la propiedad overrideValueType.
     * 
     * @param value
     *     allowed object is
     *     {@link TGuaranteeOverrideType }
     *     
     */
    public void setOverrideValueType(TGuaranteeOverrideType value) {
        this.overrideValueType = value;
    }

    /**
     * Obtiene el valor de la propiedad startDay.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDay() {
        return startDay;
    }

    /**
     * Define el valor de la propiedad startDay.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDay(XMLGregorianCalendar value) {
        this.startDay = value;
    }

    /**
     * Obtiene el valor de la propiedad endDay.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDay() {
        return endDay;
    }

    /**
     * Define el valor de la propiedad endDay.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDay(XMLGregorianCalendar value) {
        this.endDay = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
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
     * Obtiene el valor de la propiedad voidedExpiredDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVoidedExpiredDate() {
        return voidedExpiredDate;
    }

    /**
     * Define el valor de la propiedad voidedExpiredDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVoidedExpiredDate(XMLGregorianCalendar value) {
        this.voidedExpiredDate = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationExpiration.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationExpiration() {
        return authorizationExpiration;
    }

    /**
     * Define el valor de la propiedad authorizationExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationExpiration(XMLGregorianCalendar value) {
        this.authorizationExpiration = value;
    }

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Obtiene el valor de la propiedad customerBizRole.
     * 
     * @return
     *     possible object is
     *     {@link TBizRole }
     *     
     */
    public TBizRole getCustomerBizRole() {
        return customerBizRole;
    }

    /**
     * Define el valor de la propiedad customerBizRole.
     * 
     * @param value
     *     allowed object is
     *     {@link TBizRole }
     *     
     */
    public void setCustomerBizRole(TBizRole value) {
        this.customerBizRole = value;
    }

    /**
     * Obtiene el valor de la propiedad waiverExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWaiverExpirationDate() {
        return waiverExpirationDate;
    }

    /**
     * Define el valor de la propiedad waiverExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWaiverExpirationDate(XMLGregorianCalendar value) {
        this.waiverExpirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad customerReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Define el valor de la propiedad customerReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

}
