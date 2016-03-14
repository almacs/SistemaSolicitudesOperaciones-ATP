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
 * <p>Clase Java para AccessoryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccessoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navis.com/argo}EquipmentIdType">
 *       &lt;attribute name="tare-weight" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="owner-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="owner-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operator-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operator-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessoryType")
public class AccessoryType
    extends EquipmentIdType
{

    @XmlAttribute(name = "tare-weight")
    protected Double tareWeight;
    @XmlAttribute(name = "owner-id")
    protected String ownerId;
    @XmlAttribute(name = "owner-name")
    protected String ownerName;
    @XmlAttribute(name = "operator-id")
    protected String operatorId;
    @XmlAttribute(name = "operator-name")
    protected String operatorName;

    /**
     * Obtiene el valor de la propiedad tareWeight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTareWeight() {
        return tareWeight;
    }

    /**
     * Define el valor de la propiedad tareWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTareWeight(Double value) {
        this.tareWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Define el valor de la propiedad ownerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Define el valor de la propiedad ownerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Define el valor de la propiedad operatorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorId(String value) {
        this.operatorId = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Define el valor de la propiedad operatorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

}
