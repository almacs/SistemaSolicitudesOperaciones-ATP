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
 * Defines the relationship between a trucking company and a Line Operator (Shipping Line).
 *             
 * 
 * <p>Clase Java para tLineAgreement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tLineAgreement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navis.com/argo}tLineAgreementBase">
 *       &lt;attribute name="shipping-line" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shipping-line-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLineAgreement")
public class TLineAgreement
    extends TLineAgreementBase
{

    @XmlAttribute(name = "shipping-line", required = true)
    protected String shippingLine;
    @XmlAttribute(name = "shipping-line-name")
    protected String shippingLineName;

    /**
     * Obtiene el valor de la propiedad shippingLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingLine() {
        return shippingLine;
    }

    /**
     * Define el valor de la propiedad shippingLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingLine(String value) {
        this.shippingLine = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingLineName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingLineName() {
        return shippingLineName;
    }

    /**
     * Define el valor de la propiedad shippingLineName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingLineName(String value) {
        this.shippingLineName = value;
    }

}
