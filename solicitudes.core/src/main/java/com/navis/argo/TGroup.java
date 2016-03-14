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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Group
 * 
 * <p>Clase Java para tGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trucking-companies" type="{http://www.navis.com/argo}tTruckingCompanies" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *       &lt;attribute name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flex-string-1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flex-string-2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flex-string-3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time-start-delivery" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-end-delivery" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="destination-facility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGroup", propOrder = {
    "truckingCompanies"
})
public class TGroup {

    @XmlElement(name = "trucking-companies")
    protected TTruckingCompanies truckingCompanies;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;
    @XmlAttribute(name = "purpose")
    protected String purpose;
    @XmlAttribute(name = "flex-string-1")
    protected String flexString1;
    @XmlAttribute(name = "flex-string-2")
    protected String flexString2;
    @XmlAttribute(name = "flex-string-3")
    protected String flexString3;
    @XmlAttribute(name = "time-start-delivery")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStartDelivery;
    @XmlAttribute(name = "time-end-delivery")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeEndDelivery;
    @XmlAttribute(name = "destination-facility")
    protected String destinationFacility;

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

    /**
     * Obtiene el valor de la propiedad purpose.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Define el valor de la propiedad purpose.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Obtiene el valor de la propiedad flexString1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString1() {
        return flexString1;
    }

    /**
     * Define el valor de la propiedad flexString1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString1(String value) {
        this.flexString1 = value;
    }

    /**
     * Obtiene el valor de la propiedad flexString2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString2() {
        return flexString2;
    }

    /**
     * Define el valor de la propiedad flexString2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString2(String value) {
        this.flexString2 = value;
    }

    /**
     * Obtiene el valor de la propiedad flexString3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString3() {
        return flexString3;
    }

    /**
     * Define el valor de la propiedad flexString3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString3(String value) {
        this.flexString3 = value;
    }

    /**
     * Obtiene el valor de la propiedad timeStartDelivery.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStartDelivery() {
        return timeStartDelivery;
    }

    /**
     * Define el valor de la propiedad timeStartDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStartDelivery(XMLGregorianCalendar value) {
        this.timeStartDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad timeEndDelivery.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeEndDelivery() {
        return timeEndDelivery;
    }

    /**
     * Define el valor de la propiedad timeEndDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeEndDelivery(XMLGregorianCalendar value) {
        this.timeEndDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationFacility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationFacility() {
        return destinationFacility;
    }

    /**
     * Define el valor de la propiedad destinationFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationFacility(String value) {
        this.destinationFacility = value;
    }

}
