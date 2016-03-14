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
 * Ero Items.
 * 
 * <p>Clase Java para tOrderItems complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tOrderItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="expected-empty-containers" type="{http://www.navis.com/argo}tExpEmptyContainers" minOccurs="0"/>
 *                   &lt;element name="hazards" type="{http://www.navis.com/argo}tHazards" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="eq-height" use="required" type="{http://www.navis.com/argo}tEquipNominalHeight" />
 *                 &lt;attribute name="eq-iso-group" use="required" type="{http://www.navis.com/argo}tIsoGroup" />
 *                 &lt;attribute name="eq-size" use="required" type="{http://www.navis.com/argo}tEquipNominalLength" />
 *                 &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="equipment-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="seq-nbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="update-mode" type="{http://www.navis.com/argo}tUpdateMode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOrderItems", propOrder = {
    "item"
})
public class TOrderItems {

    protected List<TOrderItems.Item> item;
    @XmlAttribute(name = "update-mode")
    protected TUpdateMode updateMode;

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
     * {@link TOrderItems.Item }
     * 
     * 
     */
    public List<TOrderItems.Item> getItem() {
        if (item == null) {
            item = new ArrayList<TOrderItems.Item>();
        }
        return this.item;
    }

    /**
     * Obtiene el valor de la propiedad updateMode.
     * 
     * @return
     *     possible object is
     *     {@link TUpdateMode }
     *     
     */
    public TUpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * Define el valor de la propiedad updateMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TUpdateMode }
     *     
     */
    public void setUpdateMode(TUpdateMode value) {
        this.updateMode = value;
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
     *         &lt;element name="expected-empty-containers" type="{http://www.navis.com/argo}tExpEmptyContainers" minOccurs="0"/>
     *         &lt;element name="hazards" type="{http://www.navis.com/argo}tHazards" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="eq-height" use="required" type="{http://www.navis.com/argo}tEquipNominalHeight" />
     *       &lt;attribute name="eq-iso-group" use="required" type="{http://www.navis.com/argo}tIsoGroup" />
     *       &lt;attribute name="eq-size" use="required" type="{http://www.navis.com/argo}tEquipNominalLength" />
     *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="equipment-type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="seq-nbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "expectedEmptyContainers",
        "hazards"
    })
    public static class Item {

        @XmlElement(name = "expected-empty-containers")
        protected TExpEmptyContainers expectedEmptyContainers;
        protected THazards hazards;
        @XmlAttribute(name = "eq-height", required = true)
        protected TEquipNominalHeight eqHeight;
        @XmlAttribute(name = "eq-iso-group", required = true)
        protected TIsoGroup eqIsoGroup;
        @XmlAttribute(name = "eq-size", required = true)
        protected TEquipNominalLength eqSize;
        @XmlAttribute(name = "quantity")
        protected BigInteger quantity;
        @XmlAttribute(name = "equipment-type")
        protected String equipmentType;
        @XmlAttribute(name = "seq-nbr")
        protected BigInteger seqNbr;

        /**
         * Obtiene el valor de la propiedad expectedEmptyContainers.
         * 
         * @return
         *     possible object is
         *     {@link TExpEmptyContainers }
         *     
         */
        public TExpEmptyContainers getExpectedEmptyContainers() {
            return expectedEmptyContainers;
        }

        /**
         * Define el valor de la propiedad expectedEmptyContainers.
         * 
         * @param value
         *     allowed object is
         *     {@link TExpEmptyContainers }
         *     
         */
        public void setExpectedEmptyContainers(TExpEmptyContainers value) {
            this.expectedEmptyContainers = value;
        }

        /**
         * Obtiene el valor de la propiedad hazards.
         * 
         * @return
         *     possible object is
         *     {@link THazards }
         *     
         */
        public THazards getHazards() {
            return hazards;
        }

        /**
         * Define el valor de la propiedad hazards.
         * 
         * @param value
         *     allowed object is
         *     {@link THazards }
         *     
         */
        public void setHazards(THazards value) {
            this.hazards = value;
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
         * Obtiene el valor de la propiedad seqNbr.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSeqNbr() {
            return seqNbr;
        }

        /**
         * Define el valor de la propiedad seqNbr.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSeqNbr(BigInteger value) {
            this.seqNbr = value;
        }

    }

}
