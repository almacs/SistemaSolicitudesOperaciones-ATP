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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Moves completed for this Unit
 * 
 * <p>Clase Java para tMoveHistory complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tMoveHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="move" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="from-position" type="{http://www.navis.com/argo}tPosition"/>
 *                   &lt;element name="to-position" type="{http://www.navis.com/argo}tPosition"/>
 *                   &lt;element name="move-details" type="{http://www.navis.com/argo}tMoveDetails" minOccurs="0"/>
 *                   &lt;element name="guarantee" type="{http://www.navis.com/argo}tGuarantee" minOccurs="0"/>
 *                   &lt;element name="storage-guarantees" type="{http://www.navis.com/argo}tStorageGuarantees" minOccurs="0"/>
 *                   &lt;element name="power-guarantees" type="{http://www.navis.com/argo}tPowerGuarantees" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="move-kind" type="{http://www.navis.com/argo}tMoveKind" />
 *                 &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
@XmlType(name = "tMoveHistory", propOrder = {
    "move"
})
public class TMoveHistory {

    @XmlElement(required = true)
    protected List<TMoveHistory.Move> move;

    /**
     * Gets the value of the move property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the move property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMove().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMoveHistory.Move }
     * 
     * 
     */
    public List<TMoveHistory.Move> getMove() {
        if (move == null) {
            move = new ArrayList<TMoveHistory.Move>();
        }
        return this.move;
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
     *         &lt;element name="from-position" type="{http://www.navis.com/argo}tPosition"/>
     *         &lt;element name="to-position" type="{http://www.navis.com/argo}tPosition"/>
     *         &lt;element name="move-details" type="{http://www.navis.com/argo}tMoveDetails" minOccurs="0"/>
     *         &lt;element name="guarantee" type="{http://www.navis.com/argo}tGuarantee" minOccurs="0"/>
     *         &lt;element name="storage-guarantees" type="{http://www.navis.com/argo}tStorageGuarantees" minOccurs="0"/>
     *         &lt;element name="power-guarantees" type="{http://www.navis.com/argo}tPowerGuarantees" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="move-kind" type="{http://www.navis.com/argo}tMoveKind" />
     *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fromPosition",
        "toPosition",
        "moveDetails",
        "guarantee",
        "storageGuarantees",
        "powerGuarantees"
    })
    public static class Move {

        @XmlElement(name = "from-position", required = true)
        protected TPosition fromPosition;
        @XmlElement(name = "to-position", required = true)
        protected TPosition toPosition;
        @XmlElement(name = "move-details")
        protected TMoveDetails moveDetails;
        protected TGuarantee guarantee;
        @XmlElement(name = "storage-guarantees")
        protected TStorageGuarantees storageGuarantees;
        @XmlElement(name = "power-guarantees")
        protected TPowerGuarantees powerGuarantees;
        @XmlAttribute(name = "move-kind")
        protected TMoveKind moveKind;
        @XmlAttribute(name = "timestamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;

        /**
         * Obtiene el valor de la propiedad fromPosition.
         * 
         * @return
         *     possible object is
         *     {@link TPosition }
         *     
         */
        public TPosition getFromPosition() {
            return fromPosition;
        }

        /**
         * Define el valor de la propiedad fromPosition.
         * 
         * @param value
         *     allowed object is
         *     {@link TPosition }
         *     
         */
        public void setFromPosition(TPosition value) {
            this.fromPosition = value;
        }

        /**
         * Obtiene el valor de la propiedad toPosition.
         * 
         * @return
         *     possible object is
         *     {@link TPosition }
         *     
         */
        public TPosition getToPosition() {
            return toPosition;
        }

        /**
         * Define el valor de la propiedad toPosition.
         * 
         * @param value
         *     allowed object is
         *     {@link TPosition }
         *     
         */
        public void setToPosition(TPosition value) {
            this.toPosition = value;
        }

        /**
         * Obtiene el valor de la propiedad moveDetails.
         * 
         * @return
         *     possible object is
         *     {@link TMoveDetails }
         *     
         */
        public TMoveDetails getMoveDetails() {
            return moveDetails;
        }

        /**
         * Define el valor de la propiedad moveDetails.
         * 
         * @param value
         *     allowed object is
         *     {@link TMoveDetails }
         *     
         */
        public void setMoveDetails(TMoveDetails value) {
            this.moveDetails = value;
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
         * Obtiene el valor de la propiedad moveKind.
         * 
         * @return
         *     possible object is
         *     {@link TMoveKind }
         *     
         */
        public TMoveKind getMoveKind() {
            return moveKind;
        }

        /**
         * Define el valor de la propiedad moveKind.
         * 
         * @param value
         *     allowed object is
         *     {@link TMoveKind }
         *     
         */
        public void setMoveKind(TMoveKind value) {
            this.moveKind = value;
        }

        /**
         * Obtiene el valor de la propiedad timestamp.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Define el valor de la propiedad timestamp.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

    }

}
