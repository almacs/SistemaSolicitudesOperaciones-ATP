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
 * Event Type
 * 
 * <p>Clase Java para tEventType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://www.navis.com/argo}tFilter" minOccurs="0" form="unqualified"/>
 *         &lt;element name="effects" type="{http://www.navis.com/argo}tEventEffects" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applies-to" type="{http://www.navis.com/argo}tBusinessEntity" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-billable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-notifiable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="can-bulk-update" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-builtin-event" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-event-recorded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-facility-service" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEventType", propOrder = {
    "filter",
    "effects"
})
public class TEventType {

    protected TFilter filter;
    protected TEventEffects effects;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "applies-to")
    protected TBusinessEntity appliesTo;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "is-billable")
    protected String isBillable;
    @XmlAttribute(name = "is-notifiable")
    protected String isNotifiable;
    @XmlAttribute(name = "can-bulk-update")
    protected String canBulkUpdate;
    @XmlAttribute(name = "is-builtin-event")
    protected String isBuiltinEvent;
    @XmlAttribute(name = "is-event-recorded")
    protected String isEventRecorded;
    @XmlAttribute(name = "is-facility-service")
    protected String isFacilityService;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Obtiene el valor de la propiedad filter.
     * 
     * @return
     *     possible object is
     *     {@link TFilter }
     *     
     */
    public TFilter getFilter() {
        return filter;
    }

    /**
     * Define el valor de la propiedad filter.
     * 
     * @param value
     *     allowed object is
     *     {@link TFilter }
     *     
     */
    public void setFilter(TFilter value) {
        this.filter = value;
    }

    /**
     * Obtiene el valor de la propiedad effects.
     * 
     * @return
     *     possible object is
     *     {@link TEventEffects }
     *     
     */
    public TEventEffects getEffects() {
        return effects;
    }

    /**
     * Define el valor de la propiedad effects.
     * 
     * @param value
     *     allowed object is
     *     {@link TEventEffects }
     *     
     */
    public void setEffects(TEventEffects value) {
        this.effects = value;
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
     * Obtiene el valor de la propiedad appliesTo.
     * 
     * @return
     *     possible object is
     *     {@link TBusinessEntity }
     *     
     */
    public TBusinessEntity getAppliesTo() {
        return appliesTo;
    }

    /**
     * Define el valor de la propiedad appliesTo.
     * 
     * @param value
     *     allowed object is
     *     {@link TBusinessEntity }
     *     
     */
    public void setAppliesTo(TBusinessEntity value) {
        this.appliesTo = value;
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
     * Obtiene el valor de la propiedad isBillable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBillable() {
        return isBillable;
    }

    /**
     * Define el valor de la propiedad isBillable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBillable(String value) {
        this.isBillable = value;
    }

    /**
     * Obtiene el valor de la propiedad isNotifiable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNotifiable() {
        return isNotifiable;
    }

    /**
     * Define el valor de la propiedad isNotifiable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNotifiable(String value) {
        this.isNotifiable = value;
    }

    /**
     * Obtiene el valor de la propiedad canBulkUpdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanBulkUpdate() {
        return canBulkUpdate;
    }

    /**
     * Define el valor de la propiedad canBulkUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanBulkUpdate(String value) {
        this.canBulkUpdate = value;
    }

    /**
     * Obtiene el valor de la propiedad isBuiltinEvent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBuiltinEvent() {
        return isBuiltinEvent;
    }

    /**
     * Define el valor de la propiedad isBuiltinEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBuiltinEvent(String value) {
        this.isBuiltinEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad isEventRecorded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEventRecorded() {
        return isEventRecorded;
    }

    /**
     * Define el valor de la propiedad isEventRecorded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEventRecorded(String value) {
        this.isEventRecorded = value;
    }

    /**
     * Obtiene el valor de la propiedad isFacilityService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFacilityService() {
        return isFacilityService;
    }

    /**
     * Define el valor de la propiedad isFacilityService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFacilityService(String value) {
        this.isFacilityService = value;
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
