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
 * Gate
 * 
 * <p>Clase Java para tGate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tGate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gate-lanes" type="{http://www.navis.com/argo}tGateLanes" minOccurs="0" form="unqualified"/>
 *         &lt;element name="gate-yards" type="{http://www.navis.com/argo}tGateYards" minOccurs="0" form="unqualified"/>
 *         &lt;element name="gate-consoles" type="{http://www.navis.com/argo}tGateConsoles" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gate-config-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="facility-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="app-rule-set-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGate", propOrder = {
    "gateLanes",
    "gateYards",
    "gateConsoles"
})
public class TGate {

    @XmlElement(name = "gate-lanes")
    protected TGateLanes gateLanes;
    @XmlElement(name = "gate-yards")
    protected TGateYards gateYards;
    @XmlElement(name = "gate-consoles")
    protected TGateConsoles gateConsoles;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "description", required = true)
    protected String description;
    @XmlAttribute(name = "gate-config-id", required = true)
    protected String gateConfigId;
    @XmlAttribute(name = "facility-id")
    protected String facilityId;
    @XmlAttribute(name = "app-rule-set-id")
    protected String appRuleSetId;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Obtiene el valor de la propiedad gateLanes.
     * 
     * @return
     *     possible object is
     *     {@link TGateLanes }
     *     
     */
    public TGateLanes getGateLanes() {
        return gateLanes;
    }

    /**
     * Define el valor de la propiedad gateLanes.
     * 
     * @param value
     *     allowed object is
     *     {@link TGateLanes }
     *     
     */
    public void setGateLanes(TGateLanes value) {
        this.gateLanes = value;
    }

    /**
     * Obtiene el valor de la propiedad gateYards.
     * 
     * @return
     *     possible object is
     *     {@link TGateYards }
     *     
     */
    public TGateYards getGateYards() {
        return gateYards;
    }

    /**
     * Define el valor de la propiedad gateYards.
     * 
     * @param value
     *     allowed object is
     *     {@link TGateYards }
     *     
     */
    public void setGateYards(TGateYards value) {
        this.gateYards = value;
    }

    /**
     * Obtiene el valor de la propiedad gateConsoles.
     * 
     * @return
     *     possible object is
     *     {@link TGateConsoles }
     *     
     */
    public TGateConsoles getGateConsoles() {
        return gateConsoles;
    }

    /**
     * Define el valor de la propiedad gateConsoles.
     * 
     * @param value
     *     allowed object is
     *     {@link TGateConsoles }
     *     
     */
    public void setGateConsoles(TGateConsoles value) {
        this.gateConsoles = value;
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
     * Obtiene el valor de la propiedad gateConfigId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateConfigId() {
        return gateConfigId;
    }

    /**
     * Define el valor de la propiedad gateConfigId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateConfigId(String value) {
        this.gateConfigId = value;
    }

    /**
     * Obtiene el valor de la propiedad facilityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityId() {
        return facilityId;
    }

    /**
     * Define el valor de la propiedad facilityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityId(String value) {
        this.facilityId = value;
    }

    /**
     * Obtiene el valor de la propiedad appRuleSetId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRuleSetId() {
        return appRuleSetId;
    }

    /**
     * Define el valor de la propiedad appRuleSetId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRuleSetId(String value) {
        this.appRuleSetId = value;
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
