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
 * Pool Member Equip Type
 * 
 * <p>Clase Java para tPoolEqTypes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tPoolEqTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equpment-type" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="iso-group" type="{http://www.navis.com/argo}tIsoGroup" />
 *                 &lt;attribute name="size" use="required" type="{http://www.navis.com/argo}tEquipNominalLength" />
 *                 &lt;attribute name="height" type="{http://www.navis.com/argo}tEquipNominalHeight" />
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
@XmlType(name = "tPoolEqTypes", propOrder = {
    "equpmentType"
})
public class TPoolEqTypes {

    @XmlElement(name = "equpment-type")
    protected List<TPoolEqTypes.EqupmentType> equpmentType;

    /**
     * Gets the value of the equpmentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equpmentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEqupmentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPoolEqTypes.EqupmentType }
     * 
     * 
     */
    public List<TPoolEqTypes.EqupmentType> getEqupmentType() {
        if (equpmentType == null) {
            equpmentType = new ArrayList<TPoolEqTypes.EqupmentType>();
        }
        return this.equpmentType;
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
     *       &lt;attribute name="iso-group" type="{http://www.navis.com/argo}tIsoGroup" />
     *       &lt;attribute name="size" use="required" type="{http://www.navis.com/argo}tEquipNominalLength" />
     *       &lt;attribute name="height" type="{http://www.navis.com/argo}tEquipNominalHeight" />
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
    public static class EqupmentType {

        @XmlAttribute(name = "iso-group")
        protected TIsoGroup isoGroup;
        @XmlAttribute(name = "size", required = true)
        protected TEquipNominalLength size;
        @XmlAttribute(name = "height")
        protected TEquipNominalHeight height;
        @XmlAttribute(name = "joined")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar joined;
        @XmlAttribute(name = "removed")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar removed;

        /**
         * Obtiene el valor de la propiedad isoGroup.
         * 
         * @return
         *     possible object is
         *     {@link TIsoGroup }
         *     
         */
        public TIsoGroup getIsoGroup() {
            return isoGroup;
        }

        /**
         * Define el valor de la propiedad isoGroup.
         * 
         * @param value
         *     allowed object is
         *     {@link TIsoGroup }
         *     
         */
        public void setIsoGroup(TIsoGroup value) {
            this.isoGroup = value;
        }

        /**
         * Obtiene el valor de la propiedad size.
         * 
         * @return
         *     possible object is
         *     {@link TEquipNominalLength }
         *     
         */
        public TEquipNominalLength getSize() {
            return size;
        }

        /**
         * Define el valor de la propiedad size.
         * 
         * @param value
         *     allowed object is
         *     {@link TEquipNominalLength }
         *     
         */
        public void setSize(TEquipNominalLength value) {
            this.size = value;
        }

        /**
         * Obtiene el valor de la propiedad height.
         * 
         * @return
         *     possible object is
         *     {@link TEquipNominalHeight }
         *     
         */
        public TEquipNominalHeight getHeight() {
            return height;
        }

        /**
         * Define el valor de la propiedad height.
         * 
         * @param value
         *     allowed object is
         *     {@link TEquipNominalHeight }
         *     
         */
        public void setHeight(TEquipNominalHeight value) {
            this.height = value;
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
