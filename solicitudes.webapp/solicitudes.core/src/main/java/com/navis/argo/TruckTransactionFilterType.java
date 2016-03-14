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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para TruckTransactionFilterType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TruckTransactionFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="tv-key" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="gos-tv-key" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="tran-key" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="tran-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ctr-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="chs-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="order-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bl-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="from-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="to-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="doc-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trucking-co-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="line-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tran-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="has-damage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TruckTransactionFilterType")
public class TruckTransactionFilterType {

    @XmlAttribute(name = "tv-key")
    protected Long tvKey;
    @XmlAttribute(name = "gos-tv-key")
    protected Long gosTvKey;
    @XmlAttribute(name = "tran-key")
    protected Long tranKey;
    @XmlAttribute(name = "tran-nbr")
    protected String tranNbr;
    @XmlAttribute(name = "ctr-nbr")
    protected String ctrNbr;
    @XmlAttribute(name = "chs-nbr")
    protected String chsNbr;
    @XmlAttribute(name = "order-nbr")
    protected String orderNbr;
    @XmlAttribute(name = "bl-nbr")
    protected String blNbr;
    @XmlAttribute(name = "from-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlAttribute(name = "to-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlAttribute(name = "date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "doc-type")
    protected String docType;
    @XmlAttribute(name = "trucking-co-id")
    protected String truckingCoId;
    @XmlAttribute(name = "line-id")
    protected String lineId;
    @XmlAttribute(name = "tran-type")
    protected String tranType;
    @XmlAttribute(name = "has-damage")
    protected Boolean hasDamage;

    /**
     * Obtiene el valor de la propiedad tvKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTvKey() {
        return tvKey;
    }

    /**
     * Define el valor de la propiedad tvKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTvKey(Long value) {
        this.tvKey = value;
    }

    /**
     * Obtiene el valor de la propiedad gosTvKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGosTvKey() {
        return gosTvKey;
    }

    /**
     * Define el valor de la propiedad gosTvKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGosTvKey(Long value) {
        this.gosTvKey = value;
    }

    /**
     * Obtiene el valor de la propiedad tranKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTranKey() {
        return tranKey;
    }

    /**
     * Define el valor de la propiedad tranKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTranKey(Long value) {
        this.tranKey = value;
    }

    /**
     * Obtiene el valor de la propiedad tranNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranNbr() {
        return tranNbr;
    }

    /**
     * Define el valor de la propiedad tranNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranNbr(String value) {
        this.tranNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrNbr() {
        return ctrNbr;
    }

    /**
     * Define el valor de la propiedad ctrNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrNbr(String value) {
        this.ctrNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad chsNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChsNbr() {
        return chsNbr;
    }

    /**
     * Define el valor de la propiedad chsNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChsNbr(String value) {
        this.chsNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad orderNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNbr() {
        return orderNbr;
    }

    /**
     * Define el valor de la propiedad orderNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNbr(String value) {
        this.orderNbr = value;
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
     * Obtiene el valor de la propiedad fromDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Define el valor de la propiedad fromDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Obtiene el valor de la propiedad toDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Define el valor de la propiedad toDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad docType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Define el valor de la propiedad docType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
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
     * Obtiene el valor de la propiedad lineId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Define el valor de la propiedad lineId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Obtiene el valor de la propiedad tranType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranType() {
        return tranType;
    }

    /**
     * Define el valor de la propiedad tranType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranType(String value) {
        this.tranType = value;
    }

    /**
     * Obtiene el valor de la propiedad hasDamage.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDamage() {
        return hasDamage;
    }

    /**
     * Define el valor de la propiedad hasDamage.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDamage(Boolean value) {
        this.hasDamage = value;
    }

}
