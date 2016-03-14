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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Pool Equipments
 * 
 * <p>Clase Java para tPoolEquipments complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tPoolEquipments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipment" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="nbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="joined" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="removed" type="{http://www.w3.org/2001/XMLSchema}date" />
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
@XmlType(name = "tPoolEquipments", propOrder = {
    "equipment"
})
public class TPoolEquipments {

    protected List<TPoolEquipments.Equipment> equipment;

    /**
     * Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPoolEquipments.Equipment }
     * 
     * 
     */
    public List<TPoolEquipments.Equipment> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<TPoolEquipments.Equipment>();
        }
        return this.equipment;
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
     *       &lt;attribute name="nbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="joined" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="removed" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Equipment {

        @XmlAttribute(name = "nbr", required = true)
        protected String nbr;
        @XmlAttribute(name = "joined")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar joined;
        @XmlAttribute(name = "removed")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar removed;

        /**
         * Obtiene el valor de la propiedad nbr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNbr() {
            return nbr;
        }

        /**
         * Define el valor de la propiedad nbr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNbr(String value) {
            this.nbr = value;
        }

        /**
         * Obtiene el valor de la propiedad joined.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getJoined() {
            return joined;
        }

        /**
         * Define el valor de la propiedad joined.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setJoined(XMLGregorianCalendar value) {
            this.joined = value;
        }

        /**
         * Obtiene el valor de la propiedad removed.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRemoved() {
            return removed;
        }

        /**
         * Define el valor de la propiedad removed.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRemoved(XMLGregorianCalendar value) {
            this.removed = value;
        }

    }

}
