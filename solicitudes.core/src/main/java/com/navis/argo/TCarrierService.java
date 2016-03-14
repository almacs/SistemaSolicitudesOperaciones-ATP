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
import javax.xml.bind.annotation.XmlType;


/**
 * A Carrier Service identifies a scheduled rotation. A service is
 *                 associated with an itinerary to define the points visited on the service.
 *             
 * 
 * <p>Clase Java para tCarrierService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tCarrierService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier-itinerary" type="{http://www.navis.com/argo}tCarrierItinerary" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="carrier-mode" use="required" type="{http://www.navis.com/argo}tTransportMode" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="itinerary-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCarrierService", propOrder = {
    "carrierItinerary"
})
public class TCarrierService {

    @XmlElement(name = "carrier-itinerary")
    protected TCarrierItinerary carrierItinerary;
    @XmlAttribute(name = "carrier-mode", required = true)
    protected String carrierMode;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "itinerary-id", required = true)
    protected String itineraryId;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Obtiene el valor de la propiedad carrierItinerary.
     * 
     * @return
     *     possible object is
     *     {@link TCarrierItinerary }
     *     
     */
    public TCarrierItinerary getCarrierItinerary() {
        return carrierItinerary;
    }

    /**
     * Define el valor de la propiedad carrierItinerary.
     * 
     * @param value
     *     allowed object is
     *     {@link TCarrierItinerary }
     *     
     */
    public void setCarrierItinerary(TCarrierItinerary value) {
        this.carrierItinerary = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierMode() {
        return carrierMode;
    }

    /**
     * Define el valor de la propiedad carrierMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierMode(String value) {
        this.carrierMode = value;
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
     * Obtiene el valor de la propiedad itineraryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItineraryId() {
        return itineraryId;
    }

    /**
     * Define el valor de la propiedad itineraryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItineraryId(String value) {
        this.itineraryId = value;
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
