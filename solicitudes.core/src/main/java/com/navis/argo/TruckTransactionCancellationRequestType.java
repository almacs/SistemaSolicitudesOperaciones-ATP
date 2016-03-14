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
 * <p>Clase Java para TruckTransactionCancellationRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TruckTransactionCancellationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="tran-key" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ctr-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cancel-reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TruckTransactionCancellationRequestType")
public class TruckTransactionCancellationRequestType {

    @XmlAttribute(name = "tran-key")
    protected Long tranKey;
    @XmlAttribute(name = "ctr-nbr")
    protected String ctrNbr;
    @XmlAttribute(name = "cancel-reason")
    protected String cancelReason;

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
     * Obtiene el valor de la propiedad cancelReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Define el valor de la propiedad cancelReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

}
