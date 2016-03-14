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
 * <p>Clase Java para tGoodsDeclaration complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tGoodsDeclaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goods-docs" type="{http://www.navis.com/argo}tGoodsDocs" minOccurs="0"/>
 *         &lt;element name="unit-identity" type="{http://www.navis.com/argo}tUnitIdentity" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequence-num" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="quantity-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit-unique-key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGoodsDeclaration", propOrder = {
    "goodsDocs",
    "unitIdentity"
})
public class TGoodsDeclaration {

    @XmlElement(name = "goods-docs")
    protected TGoodsDocs goodsDocs;
    @XmlElement(name = "unit-identity")
    protected TUnitIdentity unitIdentity;
    @XmlAttribute(name = "sequence-num", required = true)
    protected long sequenceNum;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "quantity")
    protected Long quantity;
    @XmlAttribute(name = "quantity-type")
    protected String quantityType;
    @XmlAttribute(name = "unit-unique-key")
    protected String unitUniqueKey;

    /**
     * Obtiene el valor de la propiedad goodsDocs.
     * 
     * @return
     *     possible object is
     *     {@link TGoodsDocs }
     *     
     */
    public TGoodsDocs getGoodsDocs() {
        return goodsDocs;
    }

    /**
     * Define el valor de la propiedad goodsDocs.
     * 
     * @param value
     *     allowed object is
     *     {@link TGoodsDocs }
     *     
     */
    public void setGoodsDocs(TGoodsDocs value) {
        this.goodsDocs = value;
    }

    /**
     * Obtiene el valor de la propiedad unitIdentity.
     * 
     * @return
     *     possible object is
     *     {@link TUnitIdentity }
     *     
     */
    public TUnitIdentity getUnitIdentity() {
        return unitIdentity;
    }

    /**
     * Define el valor de la propiedad unitIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitIdentity }
     *     
     */
    public void setUnitIdentity(TUnitIdentity value) {
        this.unitIdentity = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceNum.
     * 
     */
    public long getSequenceNum() {
        return sequenceNum;
    }

    /**
     * Define el valor de la propiedad sequenceNum.
     * 
     */
    public void setSequenceNum(long value) {
        this.sequenceNum = value;
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
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantity(Long value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityType() {
        return quantityType;
    }

    /**
     * Define el valor de la propiedad quantityType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityType(String value) {
        this.quantityType = value;
    }

    /**
     * Obtiene el valor de la propiedad unitUniqueKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitUniqueKey() {
        return unitUniqueKey;
    }

    /**
     * Define el valor de la propiedad unitUniqueKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitUniqueKey(String value) {
        this.unitUniqueKey = value;
    }

}
