//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Billable events completed for this Unit
 * 
 * <p>Clase Java para tNonMoveHistory complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tNonMoveHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="event" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.navis.com/argo}tEvent">
 *                 &lt;sequence>
 *                   &lt;element name="field-changes" type="{http://www.navis.com/argo}tEventFieldChanges" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="guarantee" type="{http://www.navis.com/argo}tGuarantee" minOccurs="0"/>
 *                   &lt;element name="storage-guarantees" type="{http://www.navis.com/argo}tStorageGuarantees" minOccurs="0"/>
 *                   &lt;element name="power-guarantees" type="{http://www.navis.com/argo}tPowerGuarantees" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="is-billable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="quantity-unit" type="{http://www.navis.com/argo}tServiceQuantityUnitEnum" />
 *               &lt;/extension>
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
@XmlType(name = "tNonMoveHistory", propOrder = {
    "event"
})
public class TNonMoveHistory {

    @XmlElement(required = true)
    protected List<TNonMoveHistory.Event> event;

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TNonMoveHistory.Event }
     * 
     * 
     */
    public List<TNonMoveHistory.Event> getEvent() {
        if (event == null) {
            event = new ArrayList<TNonMoveHistory.Event>();
        }
        return this.event;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.navis.com/argo}tEvent">
     *       &lt;sequence>
     *         &lt;element name="field-changes" type="{http://www.navis.com/argo}tEventFieldChanges" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="guarantee" type="{http://www.navis.com/argo}tGuarantee" minOccurs="0"/>
     *         &lt;element name="storage-guarantees" type="{http://www.navis.com/argo}tStorageGuarantees" minOccurs="0"/>
     *         &lt;element name="power-guarantees" type="{http://www.navis.com/argo}tPowerGuarantees" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="is-billable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="quantity-unit" type="{http://www.navis.com/argo}tServiceQuantityUnitEnum" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fieldChanges",
        "guarantee",
        "storageGuarantees",
        "powerGuarantees"
    })
    public static class Event
        extends TEvent
    {

        @XmlElement(name = "field-changes")
        protected List<TEventFieldChanges> fieldChanges;
        protected TGuarantee guarantee;
        @XmlElement(name = "storage-guarantees")
        protected TStorageGuarantees storageGuarantees;
        @XmlElement(name = "power-guarantees")
        protected TPowerGuarantees powerGuarantees;
        @XmlAttribute(name = "quantity")
        protected Double quantity;
        @XmlAttribute(name = "is-billable")
        protected String isBillable;
        @XmlAttribute(name = "quantity-unit")
        protected TServiceQuantityUnitEnum quantityUnit;

        /**
         * Gets the value of the fieldChanges property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fieldChanges property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFieldChanges().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TEventFieldChanges }
         * 
         * 
         */
        public List<TEventFieldChanges> getFieldChanges() {
            if (fieldChanges == null) {
                fieldChanges = new ArrayList<TEventFieldChanges>();
            }
            return this.fieldChanges;
        }

        /**
         * Obtiene el valor de la propiedad guarantee.
         * 
         * @return
         *     possible object is
         *     {@link TGuarantee }
         *     
         */
        public TGuarantee getGuarantee() {
            return guarantee;
        }

        /**
         * Define el valor de la propiedad guarantee.
         * 
         * @param value
         *     allowed object is
         *     {@link TGuarantee }
         *     
         */
        public void setGuarantee(TGuarantee value) {
            this.guarantee = value;
        }

        /**
         * Obtiene el valor de la propiedad storageGuarantees.
         * 
         * @return
         *     possible object is
         *     {@link TStorageGuarantees }
         *     
         */
        public TStorageGuarantees getStorageGuarantees() {
            return storageGuarantees;
        }

        /**
         * Define el valor de la propiedad storageGuarantees.
         * 
         * @param value
         *     allowed object is
         *     {@link TStorageGuarantees }
         *     
         */
        public void setStorageGuarantees(TStorageGuarantees value) {
            this.storageGuarantees = value;
        }

        /**
         * Obtiene el valor de la propiedad powerGuarantees.
         * 
         * @return
         *     possible object is
         *     {@link TPowerGuarantees }
         *     
         */
        public TPowerGuarantees getPowerGuarantees() {
            return powerGuarantees;
        }

        /**
         * Define el valor de la propiedad powerGuarantees.
         * 
         * @param value
         *     allowed object is
         *     {@link TPowerGuarantees }
         *     
         */
        public void setPowerGuarantees(TPowerGuarantees value) {
            this.powerGuarantees = value;
        }

        /**
         * Obtiene el valor de la propiedad quantity.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getQuantity() {
            return quantity;
        }

        /**
         * Define el valor de la propiedad quantity.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setQuantity(Double value) {
            this.quantity = value;
        }

        /**
         * Obtiene el valor de la propiedad isBillable.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsBillable() {
            return isBillable;
        }

        /**
         * Define el valor de la propiedad isBillable.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsBillable(String value) {
            this.isBillable = value;
        }

        /**
         * Obtiene el valor de la propiedad quantityUnit.
         * 
         * @return
         *     possible object is
         *     {@link TServiceQuantityUnitEnum }
         *     
         */
        public TServiceQuantityUnitEnum getQuantityUnit() {
            return quantityUnit;
        }

        /**
         * Define el valor de la propiedad quantityUnit.
         * 
         * @param value
         *     allowed object is
         *     {@link TServiceQuantityUnitEnum }
         *     
         */
        public void setQuantityUnit(TServiceQuantityUnitEnum value) {
            this.quantityUnit = value;
        }

    }

}
