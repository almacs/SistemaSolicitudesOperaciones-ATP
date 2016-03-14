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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An individual road truck.
 * 
 * <p>Clase Java para tTruck complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTruck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="driver-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="license-nbr" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="trucking-co-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="license-state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="license-expiration" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="bat-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aei-tag-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tare-weight" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="safe-weight" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="max-teu" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-internal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTruck")
public class TTruck {

    @XmlAttribute(name = "driver-id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String driverId;
    @XmlAttribute(name = "license-nbr", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String licenseNbr;
    @XmlAttribute(name = "trucking-co-id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String truckingCoId;
    @XmlAttribute(name = "license-state")
    protected String licenseState;
    @XmlAttribute(name = "license-expiration")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseExpiration;
    @XmlAttribute(name = "bat-nbr")
    protected String batNbr;
    @XmlAttribute(name = "aei-tag-id")
    protected String aeiTagId;
    @XmlAttribute(name = "tare-weight")
    protected Double tareWeight;
    @XmlAttribute(name = "safe-weight")
    protected Double safeWeight;
    @XmlAttribute(name = "max-teu")
    protected Integer maxTeu;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "is-internal")
    protected String isInternal;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Obtiene el valor de la propiedad driverId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverId() {
        return driverId;
    }

    /**
     * Define el valor de la propiedad driverId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverId(String value) {
        this.driverId = value;
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
     * Obtiene el valor de la propiedad licenseExpiration.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicenseExpiration() {
        return licenseExpiration;
    }

    /**
     * Define el valor de la propiedad licenseExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLicenseExpiration(XMLGregorianCalendar value) {
        this.licenseExpiration = value;
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
     * Obtiene el valor de la propiedad aeiTagId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeiTagId() {
        return aeiTagId;
    }

    /**
     * Define el valor de la propiedad aeiTagId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeiTagId(String value) {
        this.aeiTagId = value;
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
     * Obtiene el valor de la propiedad maxTeu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxTeu() {
        return maxTeu;
    }

    /**
     * Define el valor de la propiedad maxTeu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxTeu(Integer value) {
        this.maxTeu = value;
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
     * Obtiene el valor de la propiedad isInternal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsInternal() {
        return isInternal;
    }

    /**
     * Define el valor de la propiedad isInternal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsInternal(String value) {
        this.isInternal = value;
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
