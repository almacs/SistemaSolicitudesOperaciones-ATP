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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tLoadListUnitContents complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tLoadListUnitContents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="gross-weight-kg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="bl-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agent1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agent2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="commodity-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="commodity-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consignee-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consignee-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLoadListUnitContents")
public class TLoadListUnitContents {

    @XmlAttribute(name = "gross-weight-kg")
    protected BigDecimal grossWeightKg;
    @XmlAttribute(name = "bl-nbr")
    protected String blNbr;
    @XmlAttribute(name = "agent1")
    protected String agent1;
    @XmlAttribute(name = "agent2")
    protected String agent2;
    @XmlAttribute(name = "commodity-id")
    protected String commodityId;
    @XmlAttribute(name = "commodity-name")
    protected String commodityName;
    @XmlAttribute(name = "consignee-id")
    protected String consigneeId;
    @XmlAttribute(name = "consignee-name")
    protected String consigneeName;

    /**
     * Obtiene el valor de la propiedad grossWeightKg.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWeightKg() {
        return grossWeightKg;
    }

    /**
     * Define el valor de la propiedad grossWeightKg.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWeightKg(BigDecimal value) {
        this.grossWeightKg = value;
    }

    /**
     * Obtiene el valor de la propiedad blNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlNbr() {
        return blNbr;
    }

    /**
     * Define el valor de la propiedad blNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlNbr(String value) {
        this.blNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad agent1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent1() {
        return agent1;
    }

    /**
     * Define el valor de la propiedad agent1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent1(String value) {
        this.agent1 = value;
    }

    /**
     * Obtiene el valor de la propiedad agent2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent2() {
        return agent2;
    }

    /**
     * Define el valor de la propiedad agent2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent2(String value) {
        this.agent2 = value;
    }

    /**
     * Obtiene el valor de la propiedad commodityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityId() {
        return commodityId;
    }

    /**
     * Define el valor de la propiedad commodityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityId(String value) {
        this.commodityId = value;
    }

    /**
     * Obtiene el valor de la propiedad commodityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * Define el valor de la propiedad commodityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityName(String value) {
        this.commodityName = value;
    }

    /**
     * Obtiene el valor de la propiedad consigneeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeId() {
        return consigneeId;
    }

    /**
     * Define el valor de la propiedad consigneeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeId(String value) {
        this.consigneeId = value;
    }

    /**
     * Obtiene el valor de la propiedad consigneeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * Define el valor de la propiedad consigneeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeName(String value) {
        this.consigneeName = value;
    }

}
