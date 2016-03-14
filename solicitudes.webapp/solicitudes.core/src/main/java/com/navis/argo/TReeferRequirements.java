//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information specifiying refrigeration requirements and use for the
 *                     inventory unit.
 *                 
 * 
 * <p>Clase Java para tReeferRequirements complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tReeferRequirements">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navis.com/argo}tBaseReeferRequirements">
 *       &lt;attribute name="temp-min-c" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="temp-max-c" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="temp-display-unit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="C"/>
 *             &lt;enumeration value="F"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="is-power" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wanted-is-power" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time-latest-on-power" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-requested-off-power" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-requested" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-monitor-1" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-monitor-2" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-monitor-3" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="time-monitor-4" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="is-alarm-on" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unplug-warn-min" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tReeferRequirements")
public class TReeferRequirements
    extends TBaseReeferRequirements
{

    @XmlAttribute(name = "temp-min-c")
    protected BigDecimal tempMinC;
    @XmlAttribute(name = "temp-max-c")
    protected BigDecimal tempMaxC;
    @XmlAttribute(name = "temp-display-unit")
    protected String tempDisplayUnit;
    @XmlAttribute(name = "is-power")
    protected String isPower;
    @XmlAttribute(name = "wanted-is-power")
    protected String wantedIsPower;
    @XmlAttribute(name = "time-latest-on-power")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLatestOnPower;
    @XmlAttribute(name = "time-requested-off-power")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeRequestedOffPower;
    @XmlAttribute(name = "time-requested")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeRequested;
    @XmlAttribute(name = "time-monitor-1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeMonitor1;
    @XmlAttribute(name = "time-monitor-2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeMonitor2;
    @XmlAttribute(name = "time-monitor-3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeMonitor3;
    @XmlAttribute(name = "time-monitor-4")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeMonitor4;
    @XmlAttribute(name = "is-alarm-on")
    protected String isAlarmOn;
    @XmlAttribute(name = "unplug-warn-min")
    protected BigInteger unplugWarnMin;

    /**
     * Obtiene el valor de la propiedad tempMinC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTempMinC() {
        return tempMinC;
    }

    /**
     * Define el valor de la propiedad tempMinC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTempMinC(BigDecimal value) {
        this.tempMinC = value;
    }

    /**
     * Obtiene el valor de la propiedad tempMaxC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTempMaxC() {
        return tempMaxC;
    }

    /**
     * Define el valor de la propiedad tempMaxC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTempMaxC(BigDecimal value) {
        this.tempMaxC = value;
    }

    /**
     * Obtiene el valor de la propiedad tempDisplayUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempDisplayUnit() {
        return tempDisplayUnit;
    }

    /**
     * Define el valor de la propiedad tempDisplayUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempDisplayUnit(String value) {
        this.tempDisplayUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad isPower.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPower() {
        return isPower;
    }

    /**
     * Define el valor de la propiedad isPower.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPower(String value) {
        this.isPower = value;
    }

    /**
     * Obtiene el valor de la propiedad wantedIsPower.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWantedIsPower() {
        return wantedIsPower;
    }

    /**
     * Define el valor de la propiedad wantedIsPower.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWantedIsPower(String value) {
        this.wantedIsPower = value;
    }

    /**
     * Obtiene el valor de la propiedad timeLatestOnPower.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLatestOnPower() {
        return timeLatestOnPower;
    }

    /**
     * Define el valor de la propiedad timeLatestOnPower.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLatestOnPower(XMLGregorianCalendar value) {
        this.timeLatestOnPower = value;
    }

    /**
     * Obtiene el valor de la propiedad timeRequestedOffPower.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeRequestedOffPower() {
        return timeRequestedOffPower;
    }

    /**
     * Define el valor de la propiedad timeRequestedOffPower.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeRequestedOffPower(XMLGregorianCalendar value) {
        this.timeRequestedOffPower = value;
    }

    /**
     * Obtiene el valor de la propiedad timeRequested.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeRequested() {
        return timeRequested;
    }

    /**
     * Define el valor de la propiedad timeRequested.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeRequested(XMLGregorianCalendar value) {
        this.timeRequested = value;
    }

    /**
     * Obtiene el valor de la propiedad timeMonitor1.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeMonitor1() {
        return timeMonitor1;
    }

    /**
     * Define el valor de la propiedad timeMonitor1.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeMonitor1(XMLGregorianCalendar value) {
        this.timeMonitor1 = value;
    }

    /**
     * Obtiene el valor de la propiedad timeMonitor2.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeMonitor2() {
        return timeMonitor2;
    }

    /**
     * Define el valor de la propiedad timeMonitor2.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeMonitor2(XMLGregorianCalendar value) {
        this.timeMonitor2 = value;
    }

    /**
     * Obtiene el valor de la propiedad timeMonitor3.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeMonitor3() {
        return timeMonitor3;
    }

    /**
     * Define el valor de la propiedad timeMonitor3.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeMonitor3(XMLGregorianCalendar value) {
        this.timeMonitor3 = value;
    }

    /**
     * Obtiene el valor de la propiedad timeMonitor4.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeMonitor4() {
        return timeMonitor4;
    }

    /**
     * Define el valor de la propiedad timeMonitor4.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeMonitor4(XMLGregorianCalendar value) {
        this.timeMonitor4 = value;
    }

    /**
     * Obtiene el valor de la propiedad isAlarmOn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAlarmOn() {
        return isAlarmOn;
    }

    /**
     * Define el valor de la propiedad isAlarmOn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAlarmOn(String value) {
        this.isAlarmOn = value;
    }

    /**
     * Obtiene el valor de la propiedad unplugWarnMin.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnplugWarnMin() {
        return unplugWarnMin;
    }

    /**
     * Define el valor de la propiedad unplugWarnMin.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnplugWarnMin(BigInteger value) {
        this.unplugWarnMin = value;
    }

}
