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
 * Storage Rule
 * 
 * <p>Clase Java para tStorageRule complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tStorageRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="rule-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-rule-for-power" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="start-day-rule" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-include-start-day" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="end-day-rule" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-include-end-day" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-include-exempt-days" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-include-gratis-days" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="start-day-cut-off-hours" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="end-day-cut-off-hours" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="power-charge-by">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="HOUR"/>
 *             &lt;enumeration value="DAY"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="power-first-tier-rounding" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="power-other-tier-rounding" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="calendar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="round-up-hours" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="round-up-minutes" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStorageRule")
public class TStorageRule {

    @XmlAttribute(name = "rule-id", required = true)
    protected String ruleId;
    @XmlAttribute(name = "is-rule-for-power")
    protected String isRuleForPower;
    @XmlAttribute(name = "start-day-rule")
    protected String startDayRule;
    @XmlAttribute(name = "is-include-start-day")
    protected String isIncludeStartDay;
    @XmlAttribute(name = "end-day-rule")
    protected String endDayRule;
    @XmlAttribute(name = "is-include-end-day")
    protected String isIncludeEndDay;
    @XmlAttribute(name = "is-include-exempt-days")
    protected String isIncludeExemptDays;
    @XmlAttribute(name = "is-include-gratis-days")
    protected String isIncludeGratisDays;
    @XmlAttribute(name = "start-day-cut-off-hours")
    protected Long startDayCutOffHours;
    @XmlAttribute(name = "end-day-cut-off-hours")
    protected Long endDayCutOffHours;
    @XmlAttribute(name = "power-charge-by")
    protected String powerChargeBy;
    @XmlAttribute(name = "power-first-tier-rounding")
    protected Long powerFirstTierRounding;
    @XmlAttribute(name = "power-other-tier-rounding")
    protected Long powerOtherTierRounding;
    @XmlAttribute(name = "calendar")
    protected String calendar;
    @XmlAttribute(name = "round-up-hours")
    protected Long roundUpHours;
    @XmlAttribute(name = "round-up-minutes")
    protected Long roundUpMinutes;

    /**
     * Obtiene el valor de la propiedad ruleId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * Define el valor de la propiedad ruleId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleId(String value) {
        this.ruleId = value;
    }

    /**
     * Obtiene el valor de la propiedad isRuleForPower.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRuleForPower() {
        return isRuleForPower;
    }

    /**
     * Define el valor de la propiedad isRuleForPower.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRuleForPower(String value) {
        this.isRuleForPower = value;
    }

    /**
     * Obtiene el valor de la propiedad startDayRule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDayRule() {
        return startDayRule;
    }

    /**
     * Define el valor de la propiedad startDayRule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDayRule(String value) {
        this.startDayRule = value;
    }

    /**
     * Obtiene el valor de la propiedad isIncludeStartDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIncludeStartDay() {
        return isIncludeStartDay;
    }

    /**
     * Define el valor de la propiedad isIncludeStartDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIncludeStartDay(String value) {
        this.isIncludeStartDay = value;
    }

    /**
     * Obtiene el valor de la propiedad endDayRule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDayRule() {
        return endDayRule;
    }

    /**
     * Define el valor de la propiedad endDayRule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDayRule(String value) {
        this.endDayRule = value;
    }

    /**
     * Obtiene el valor de la propiedad isIncludeEndDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIncludeEndDay() {
        return isIncludeEndDay;
    }

    /**
     * Define el valor de la propiedad isIncludeEndDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIncludeEndDay(String value) {
        this.isIncludeEndDay = value;
    }

    /**
     * Obtiene el valor de la propiedad isIncludeExemptDays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIncludeExemptDays() {
        return isIncludeExemptDays;
    }

    /**
     * Define el valor de la propiedad isIncludeExemptDays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIncludeExemptDays(String value) {
        this.isIncludeExemptDays = value;
    }

    /**
     * Obtiene el valor de la propiedad isIncludeGratisDays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIncludeGratisDays() {
        return isIncludeGratisDays;
    }

    /**
     * Define el valor de la propiedad isIncludeGratisDays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIncludeGratisDays(String value) {
        this.isIncludeGratisDays = value;
    }

    /**
     * Obtiene el valor de la propiedad startDayCutOffHours.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartDayCutOffHours() {
        return startDayCutOffHours;
    }

    /**
     * Define el valor de la propiedad startDayCutOffHours.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartDayCutOffHours(Long value) {
        this.startDayCutOffHours = value;
    }

    /**
     * Obtiene el valor de la propiedad endDayCutOffHours.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndDayCutOffHours() {
        return endDayCutOffHours;
    }

    /**
     * Define el valor de la propiedad endDayCutOffHours.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndDayCutOffHours(Long value) {
        this.endDayCutOffHours = value;
    }

    /**
     * Obtiene el valor de la propiedad powerChargeBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerChargeBy() {
        return powerChargeBy;
    }

    /**
     * Define el valor de la propiedad powerChargeBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerChargeBy(String value) {
        this.powerChargeBy = value;
    }

    /**
     * Obtiene el valor de la propiedad powerFirstTierRounding.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPowerFirstTierRounding() {
        return powerFirstTierRounding;
    }

    /**
     * Define el valor de la propiedad powerFirstTierRounding.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPowerFirstTierRounding(Long value) {
        this.powerFirstTierRounding = value;
    }

    /**
     * Obtiene el valor de la propiedad powerOtherTierRounding.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPowerOtherTierRounding() {
        return powerOtherTierRounding;
    }

    /**
     * Define el valor de la propiedad powerOtherTierRounding.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPowerOtherTierRounding(Long value) {
        this.powerOtherTierRounding = value;
    }

    /**
     * Obtiene el valor de la propiedad calendar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendar() {
        return calendar;
    }

    /**
     * Define el valor de la propiedad calendar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendar(String value) {
        this.calendar = value;
    }

    /**
     * Obtiene el valor de la propiedad roundUpHours.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoundUpHours() {
        return roundUpHours;
    }

    /**
     * Define el valor de la propiedad roundUpHours.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoundUpHours(Long value) {
        this.roundUpHours = value;
    }

    /**
     * Obtiene el valor de la propiedad roundUpMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoundUpMinutes() {
        return roundUpMinutes;
    }

    /**
     * Define el valor de la propiedad roundUpMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoundUpMinutes(Long value) {
        this.roundUpMinutes = value;
    }

}
