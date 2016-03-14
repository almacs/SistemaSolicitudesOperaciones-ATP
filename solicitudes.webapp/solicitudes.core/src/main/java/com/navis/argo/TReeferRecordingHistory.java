//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Details of Reefer Record History.
 *             
 * 
 * <p>Clase Java para tReeferRecordingHistory complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tReeferRecordingHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="time-of-recording" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="return-temp-c" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="vent-setting" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="vent-unit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="PERCENTAGE"/>
 *             &lt;enumeration value="CUBIC_FT_MIN"/>
 *             &lt;enumeration value="CUBIC_M_HOUR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="humidity-pct" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="o2-pct" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="co2-pct" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rec-fault-code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="max_mtr_tmp" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="min_mtr_tmp" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="defrost-temp" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="tmp-set-pt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="supply-tmp" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="sensor1-tmp" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="sensor2-tmp" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="sensor3-tmp" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="sensor4-tmp" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="fuel-lvl" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="reefer-hours" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="malfunc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fan" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="drains" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-bulb-on" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-alarm-on" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tReeferRecordingHistory")
public class TReeferRecordingHistory {

    @XmlAttribute(name = "time-of-recording")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar timeOfRecording;
    @XmlAttribute(name = "return-temp-c")
    protected BigDecimal returnTempC;
    @XmlAttribute(name = "vent-setting")
    protected BigDecimal ventSetting;
    @XmlAttribute(name = "vent-unit")
    protected String ventUnit;
    @XmlAttribute(name = "humidity-pct")
    protected BigDecimal humidityPct;
    @XmlAttribute(name = "o2-pct")
    protected BigDecimal o2Pct;
    @XmlAttribute(name = "co2-pct")
    protected BigDecimal co2Pct;
    @XmlAttribute(name = "rec-fault-code")
    protected String recFaultCode;
    @XmlAttribute(name = "max_mtr_tmp")
    protected BigDecimal maxMtrTmp;
    @XmlAttribute(name = "min_mtr_tmp")
    protected BigDecimal minMtrTmp;
    @XmlAttribute(name = "defrost-temp")
    protected BigDecimal defrostTemp;
    @XmlAttribute(name = "tmp-set-pt")
    protected BigDecimal tmpSetPt;
    @XmlAttribute(name = "supply-tmp")
    protected BigDecimal supplyTmp;
    @XmlAttribute(name = "sensor1-tmp")
    protected BigDecimal sensor1Tmp;
    @XmlAttribute(name = "sensor2-tmp")
    protected BigDecimal sensor2Tmp;
    @XmlAttribute(name = "sensor3-tmp")
    protected BigDecimal sensor3Tmp;
    @XmlAttribute(name = "sensor4-tmp")
    protected BigDecimal sensor4Tmp;
    @XmlAttribute(name = "fuel-lvl")
    protected BigDecimal fuelLvl;
    @XmlAttribute(name = "reefer-hours")
    protected BigDecimal reeferHours;
    @XmlAttribute(name = "remark")
    protected BigDecimal remark;
    @XmlAttribute(name = "malfunc")
    protected String malfunc;
    @XmlAttribute(name = "fan")
    protected String fan;
    @XmlAttribute(name = "drains")
    protected String drains;
    @XmlAttribute(name = "is-bulb-on")
    protected String isBulbOn;
    @XmlAttribute(name = "is-alarm-on")
    protected String isAlarmOn;

    /**
     * Obtiene el valor de la propiedad timeOfRecording.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfRecording() {
        return timeOfRecording;
    }

    /**
     * Define el valor de la propiedad timeOfRecording.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfRecording(XMLGregorianCalendar value) {
        this.timeOfRecording = value;
    }

    /**
     * Obtiene el valor de la propiedad returnTempC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnTempC() {
        return returnTempC;
    }

    /**
     * Define el valor de la propiedad returnTempC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnTempC(BigDecimal value) {
        this.returnTempC = value;
    }

    /**
     * Obtiene el valor de la propiedad ventSetting.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVentSetting() {
        return ventSetting;
    }

    /**
     * Define el valor de la propiedad ventSetting.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVentSetting(BigDecimal value) {
        this.ventSetting = value;
    }

    /**
     * Obtiene el valor de la propiedad ventUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVentUnit() {
        return ventUnit;
    }

    /**
     * Define el valor de la propiedad ventUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVentUnit(String value) {
        this.ventUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad humidityPct.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHumidityPct() {
        return humidityPct;
    }

    /**
     * Define el valor de la propiedad humidityPct.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHumidityPct(BigDecimal value) {
        this.humidityPct = value;
    }

    /**
     * Obtiene el valor de la propiedad o2Pct.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getO2Pct() {
        return o2Pct;
    }

    /**
     * Define el valor de la propiedad o2Pct.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setO2Pct(BigDecimal value) {
        this.o2Pct = value;
    }

    /**
     * Obtiene el valor de la propiedad co2Pct.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCo2Pct() {
        return co2Pct;
    }

    /**
     * Define el valor de la propiedad co2Pct.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCo2Pct(BigDecimal value) {
        this.co2Pct = value;
    }

    /**
     * Obtiene el valor de la propiedad recFaultCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecFaultCode() {
        return recFaultCode;
    }

    /**
     * Define el valor de la propiedad recFaultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecFaultCode(String value) {
        this.recFaultCode = value;
    }

    /**
     * Obtiene el valor de la propiedad maxMtrTmp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxMtrTmp() {
        return maxMtrTmp;
    }

    /**
     * Define el valor de la propiedad maxMtrTmp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxMtrTmp(BigDecimal value) {
        this.maxMtrTmp = value;
    }

    /**
     * Obtiene el valor de la propiedad minMtrTmp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinMtrTmp() {
        return minMtrTmp;
    }

    /**
     * Define el valor de la propiedad minMtrTmp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinMtrTmp(BigDecimal value) {
        this.minMtrTmp = value;
    }

    /**
     * Obtiene el valor de la propiedad defrostTemp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefrostTemp() {
        return defrostTemp;
    }

    /**
     * Define el valor de la propiedad defrostTemp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefrostTemp(BigDecimal value) {
        this.defrostTemp = value;
    }

    /**
     * Obtiene el valor de la propiedad tmpSetPt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTmpSetPt() {
        return tmpSetPt;
    }

    /**
     * Define el valor de la propiedad tmpSetPt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTmpSetPt(BigDecimal value) {
        this.tmpSetPt = value;
    }

    /**
     * Obtiene el valor de la propiedad supplyTmp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSupplyTmp() {
        return supplyTmp;
    }

    /**
     * Define el valor de la propiedad supplyTmp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSupplyTmp(BigDecimal value) {
        this.supplyTmp = value;
    }

    /**
     * Obtiene el valor de la propiedad sensor1Tmp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSensor1Tmp() {
        return sensor1Tmp;
    }

    /**
     * Define el valor de la propiedad sensor1Tmp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSensor1Tmp(BigDecimal value) {
        this.sensor1Tmp = value;
    }

    /**
     * Obtiene el valor de la propiedad sensor2Tmp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSensor2Tmp() {
        return sensor2Tmp;
    }

    /**
     * Define el valor de la propiedad sensor2Tmp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSensor2Tmp(BigDecimal value) {
        this.sensor2Tmp = value;
    }

    /**
     * Obtiene el valor de la propiedad sensor3Tmp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSensor3Tmp() {
        return sensor3Tmp;
    }

    /**
     * Define el valor de la propiedad sensor3Tmp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSensor3Tmp(BigDecimal value) {
        this.sensor3Tmp = value;
    }

    /**
     * Obtiene el valor de la propiedad sensor4Tmp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSensor4Tmp() {
        return sensor4Tmp;
    }

    /**
     * Define el valor de la propiedad sensor4Tmp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSensor4Tmp(BigDecimal value) {
        this.sensor4Tmp = value;
    }

    /**
     * Obtiene el valor de la propiedad fuelLvl.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelLvl() {
        return fuelLvl;
    }

    /**
     * Define el valor de la propiedad fuelLvl.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuelLvl(BigDecimal value) {
        this.fuelLvl = value;
    }

    /**
     * Obtiene el valor de la propiedad reeferHours.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReeferHours() {
        return reeferHours;
    }

    /**
     * Define el valor de la propiedad reeferHours.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReeferHours(BigDecimal value) {
        this.reeferHours = value;
    }

    /**
     * Obtiene el valor de la propiedad remark.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemark() {
        return remark;
    }

    /**
     * Define el valor de la propiedad remark.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemark(BigDecimal value) {
        this.remark = value;
    }

    /**
     * Obtiene el valor de la propiedad malfunc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMalfunc() {
        return malfunc;
    }

    /**
     * Define el valor de la propiedad malfunc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMalfunc(String value) {
        this.malfunc = value;
    }

    /**
     * Obtiene el valor de la propiedad fan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFan() {
        return fan;
    }

    /**
     * Define el valor de la propiedad fan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFan(String value) {
        this.fan = value;
    }

    /**
     * Obtiene el valor de la propiedad drains.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrains() {
        return drains;
    }

    /**
     * Define el valor de la propiedad drains.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrains(String value) {
        this.drains = value;
    }

    /**
     * Obtiene el valor de la propiedad isBulbOn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBulbOn() {
        return isBulbOn;
    }

    /**
     * Define el valor de la propiedad isBulbOn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBulbOn(String value) {
        this.isBulbOn = value;
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

}
