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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An individual who drives a truck or multiple trucks and may work for a
 *                 truckingCompany.
 *             
 * 
 * <p>Clase Java para tTruckDriver complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTruckDriver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="trucking-companies" type="{http://www.navis.com/argo}tTruckingCompanies" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="bat-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="card-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="license-nbr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="license-state" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="email-address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-hazard-licensed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.navis.com/argo}tTruckStatus" />
 *       &lt;attribute name="trucking-co-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="truck-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birth-date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="suspended" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="haz-license-exp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="haz-license-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTruckDriver", propOrder = {
    "truckingCompanies"
})
public class TTruckDriver {

    @XmlElement(name = "trucking-companies")
    protected TTruckingCompanies truckingCompanies;
    @XmlAttribute(name = "bat-nbr")
    protected String batNbr;
    @XmlAttribute(name = "card-id")
    protected String cardId;
    @XmlAttribute(name = "license-nbr")
    @XmlSchemaType(name = "anySimpleType")
    protected String licenseNbr;
    @XmlAttribute(name = "license-state")
    @XmlSchemaType(name = "anySimpleType")
    protected String licenseState;
    @XmlAttribute(name = "name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "email-address")
    protected String emailAddress;
    @XmlAttribute(name = "is-hazard-licensed")
    protected String isHazardLicensed;
    @XmlAttribute(name = "status")
    protected TTruckStatus status;
    @XmlAttribute(name = "trucking-co-id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String truckingCoId;
    @XmlAttribute(name = "truck-id")
    protected String truckId;
    @XmlAttribute(name = "birth-date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "suspended")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspended;
    @XmlAttribute(name = "haz-license-exp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hazLicenseExp;
    @XmlAttribute(name = "haz-license-nbr")
    protected String hazLicenseNbr;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Obtiene el valor de la propiedad truckingCompanies.
     * 
     * @return
     *     possible object is
     *     {@link TTruckingCompanies }
     *     
     */
    public TTruckingCompanies getTruckingCompanies() {
        return truckingCompanies;
    }

    /**
     * Define el valor de la propiedad truckingCompanies.
     * 
     * @param value
     *     allowed object is
     *     {@link TTruckingCompanies }
     *     
     */
    public void setTruckingCompanies(TTruckingCompanies value) {
        this.truckingCompanies = value;
    }

    /**
     * Obtiene el valor de la propiedad batNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatNbr() {
        return batNbr;
    }

    /**
     * Define el valor de la propiedad batNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatNbr(String value) {
        this.batNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad cardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Define el valor de la propiedad cardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Obtiene el valor de la propiedad licenseNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNbr() {
        return licenseNbr;
    }

    /**
     * Define el valor de la propiedad licenseNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNbr(String value) {
        this.licenseNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad licenseState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseState() {
        return licenseState;
    }

    /**
     * Define el valor de la propiedad licenseState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseState(String value) {
        this.licenseState = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Define el valor de la propiedad emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad isHazardLicensed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHazardLicensed() {
        return isHazardLicensed;
    }

    /**
     * Define el valor de la propiedad isHazardLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHazardLicensed(String value) {
        this.isHazardLicensed = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link TTruckStatus }
     *     
     */
    public TTruckStatus getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link TTruckStatus }
     *     
     */
    public void setStatus(TTruckStatus value) {
        this.status = value;
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
     * Obtiene el valor de la propiedad truckId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckId() {
        return truckId;
    }

    /**
     * Define el valor de la propiedad truckId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckId(String value) {
        this.truckId = value;
    }

    /**
     * Obtiene el valor de la propiedad birthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Define el valor de la propiedad birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Obtiene el valor de la propiedad suspended.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspended() {
        return suspended;
    }

    /**
     * Define el valor de la propiedad suspended.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspended(XMLGregorianCalendar value) {
        this.suspended = value;
    }

    /**
     * Obtiene el valor de la propiedad hazLicenseExp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHazLicenseExp() {
        return hazLicenseExp;
    }

    /**
     * Define el valor de la propiedad hazLicenseExp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHazLicenseExp(XMLGregorianCalendar value) {
        this.hazLicenseExp = value;
    }

    /**
     * Obtiene el valor de la propiedad hazLicenseNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazLicenseNbr() {
        return hazLicenseNbr;
    }

    /**
     * Define el valor de la propiedad hazLicenseNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazLicenseNbr(String value) {
        this.hazLicenseNbr = value;
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
