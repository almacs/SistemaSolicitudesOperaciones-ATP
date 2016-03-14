//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ServiceOrderItems
 * 
 * <p>Clase Java para tSOItems complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tSOItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="service-types" type="{http://www.navis.com/argo}tServiceTypes" minOccurs="0" form="unqualified"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="eq-iso-group" type="{http://www.navis.com/argo}tIsoGroup" />
 *                 &lt;attribute name="equipment-type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="eq-size" use="required" type="{http://www.navis.com/argo}tEquipNominalLength" />
 *                 &lt;attribute name="eq-height" type="{http://www.navis.com/argo}tEquipNominalHeight" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSOItems", propOrder = {
    "item"
})
public class TSOItems {

    protected List<TSOItems.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSOItems.Item }
     * 
     * 
     */
    public List<TSOItems.Item> getItem() {
        if (item == null) {
            item = new ArrayList<TSOItems.Item>();
        }
        return this.item;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="service-types" type="{http://www.navis.com/argo}tServiceTypes" minOccurs="0" form="unqualified"/>
     *       &lt;/sequence>
     *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="eq-iso-group" type="{http://www.navis.com/argo}tIsoGroup" />
     *       &lt;attribute name="equipment-type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="eq-size" use="required" type="{http://www.navis.com/argo}tEquipNominalLength" />
     *       &lt;attribute name="eq-height" type="{http://www.navis.com/argo}tEquipNominalHeight" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceTypes"
    })
    public static class Item {

        @XmlElement(name = "service-types")
        protected TServiceTypes serviceTypes;
        @XmlAttribute(name = "quantity")
        protected BigInteger quantity;
        @XmlAttribute(name = "eq-iso-group")
        protected TIsoGroup eqIsoGroup;
        @XmlAttribute(name = "equipment-type", required = true)
        protected String equipmentType;
        @XmlAttribute(name = "eq-size", required = true)
        protected TEquipNominalLength eqSize;
        @XmlAttribute(name = "eq-height")
        protected TEquipNominalHeight eqHeight;

        /**
         * Obtiene el valor de la propiedad serviceTypes.
         * 
         * @return
         *     possible object is
         *     {@link TServiceTypes }
         *     
         */
        public TServiceTypes getServiceTypes() {
            return serviceTypes;
        }

        /**
         * Define el valor de la propiedad serviceTypes.
         * 
         * @param value
         *     allowed object is
         *     {@link TServiceTypes }
         *     
         */
        public void setServiceTypes(TServiceTypes value) {
            this.serviceTypes = value;
        }

        /**
         * Obtiene el valor de la propiedad quantity.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Define el valor de la propiedad quantity.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Obtiene el valor de la propiedad eqIsoGroup.
         * 
         * @return
         *     possible object is
         *     {@link TIsoGroup }
         *     
         */
        public TIsoGroup getEqIsoGroup() {
            return eqIsoGroup;
        }

        /**
         * Define el valor de la propiedad eqIsoGroup.
         * 
         * @param value
         *     allowed object is
         *     {@link TIsoGroup }
         *     
         */
        public void setEqIsoGroup(TIsoGroup value) {
            this.eqIsoGroup = value;
        }

        /**
         * Obtiene el valor de la propiedad equipmentType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipmentType() {
            return equipmentType;
        }

        /**
         * Define el valor de la propiedad equipmentType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipmentType(String value) {
            this.equipmentType = value;
        }

        /**
         * Obtiene el valor de la propiedad eqSize.
         * 
         * @return
         *     possible object is
         *     {@link TEquipNominalLength }
         *     
         */
        public TEquipNominalLength getEqSize() {
            return eqSize;
        }

        /**
         * Define el valor de la propiedad eqSize.
         * 
         * @param value
         *     allowed object is
         *     {@link TEquipNominalLength }
         *     
         */
        public void setEqSize(TEquipNominalLength value) {
            this.eqSize = value;
        }

        /**
         * Obtiene el valor de la propiedad eqHeight.
         * 
         * @return
         *     possible object is
         *     {@link TEquipNominalHeight }
         *     
         */
        public TEquipNominalHeight getEqHeight() {
            return eqHeight;
        }

        /**
         * Define el valor de la propiedad eqHeight.
         * 
         * @param value
         *     allowed object is
         *     {@link TEquipNominalHeight }
         *     
         */
        public void setEqHeight(TEquipNominalHeight value) {
            this.eqHeight = value;
        }

    }

}
