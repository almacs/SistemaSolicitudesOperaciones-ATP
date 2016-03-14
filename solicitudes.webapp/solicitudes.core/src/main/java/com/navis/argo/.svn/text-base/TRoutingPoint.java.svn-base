//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Routing Points are geographical locations, typically ports, e.g.
 *                 "OAK", "HKG". But they can be finer grained, for example to represent different
 *                 terminals within a port, e.g. "HK3" = "Hong Kong CT3"
 *             
 * 
 * <p>Clase Java para tRoutingPoint complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tRoutingPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unloc-code-def" type="{http://www.navis.com/argo}tUnLocCode" minOccurs="0"/>
 *         &lt;element name="actual-pod" type="{http://www.navis.com/argo}tRoutingPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="unloc-code">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="schedule-d-code" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="schedule-k-code" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="actual-pod-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-place-holder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="splc-code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRoutingPoint", propOrder = {
    "unlocCodeDef",
    "actualPod"
})
public class TRoutingPoint {

    @XmlElement(name = "unloc-code-def")
    protected TUnLocCode unlocCodeDef;
    @XmlElement(name = "actual-pod")
    protected TRoutingPoint actualPod;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "unloc-code")
    protected String unlocCode;
    @XmlAttribute(name = "schedule-d-code")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger scheduleDCode;
    @XmlAttribute(name = "schedule-k-code")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger scheduleKCode;
    @XmlAttribute(name = "terminal")
    protected String terminal;
    @XmlAttribute(name = "actual-pod-id")
    protected String actualPodId;
    @XmlAttribute(name = "is-place-holder")
    protected String isPlaceHolder;
    @XmlAttribute(name = "splc-code")
    protected String splcCode;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Obtiene el valor de la propiedad unlocCodeDef.
     * 
     * @return
     *     possible object is
     *     {@link TUnLocCode }
     *     
     */
    public TUnLocCode getUnlocCodeDef() {
        return unlocCodeDef;
    }

    /**
     * Define el valor de la propiedad unlocCodeDef.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnLocCode }
     *     
     */
    public void setUnlocCodeDef(TUnLocCode value) {
        this.unlocCodeDef = value;
    }

    /**
     * Obtiene el valor de la propiedad actualPod.
     * 
     * @return
     *     possible object is
     *     {@link TRoutingPoint }
     *     
     */
    public TRoutingPoint getActualPod() {
        return actualPod;
    }

    /**
     * Define el valor de la propiedad actualPod.
     * 
     * @param value
     *     allowed object is
     *     {@link TRoutingPoint }
     *     
     */
    public void setActualPod(TRoutingPoint value) {
        this.actualPod = value;
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
     * Obtiene el valor de la propiedad unlocCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnlocCode() {
        return unlocCode;
    }

    /**
     * Define el valor de la propiedad unlocCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnlocCode(String value) {
        this.unlocCode = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduleDCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScheduleDCode() {
        return scheduleDCode;
    }

    /**
     * Define el valor de la propiedad scheduleDCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScheduleDCode(BigInteger value) {
        this.scheduleDCode = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduleKCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScheduleKCode() {
        return scheduleKCode;
    }

    /**
     * Define el valor de la propiedad scheduleKCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScheduleKCode(BigInteger value) {
        this.scheduleKCode = value;
    }

    /**
     * Obtiene el valor de la propiedad terminal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Define el valor de la propiedad terminal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Obtiene el valor de la propiedad actualPodId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualPodId() {
        return actualPodId;
    }

    /**
     * Define el valor de la propiedad actualPodId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualPodId(String value) {
        this.actualPodId = value;
    }

    /**
     * Obtiene el valor de la propiedad isPlaceHolder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPlaceHolder() {
        return isPlaceHolder;
    }

    /**
     * Define el valor de la propiedad isPlaceHolder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPlaceHolder(String value) {
        this.isPlaceHolder = value;
    }

    /**
     * Obtiene el valor de la propiedad splcCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplcCode() {
        return splcCode;
    }

    /**
     * Define el valor de la propiedad splcCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplcCode(String value) {
        this.splcCode = value;
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
