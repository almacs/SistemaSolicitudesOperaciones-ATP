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
import javax.xml.bind.annotation.XmlType;


/**
 * Auto Update Flags
 * 
 * <p>Clase Java para tUpdateFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tUpdateFlags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flag" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="type-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="is-released" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "tUpdateFlags", propOrder = {
    "flag"
})
public class TUpdateFlags {

    protected List<TUpdateFlags.Flag> flag;
    @XmlAttribute(name = "update-mode")
    protected TUpdateMode updateMode;

    /**
     * Gets the value of the flag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TUpdateFlags.Flag }
     * 
     * 
     */
    public List<TUpdateFlags.Flag> getFlag() {
        if (flag == null) {
            flag = new ArrayList<TUpdateFlags.Flag>();
        }
        return this.flag;
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
     *       &lt;attribute name="type-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="is-released" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Flag {

        @XmlAttribute(name = "type-id", required = true)
        protected String typeId;
        @XmlAttribute(name = "is-released")
        protected String isReleased;
        @XmlAttribute(name = "notes")
        protected String notes;

        /**
         * Obtiene el valor de la propiedad typeId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeId() {
            return typeId;
        }

        /**
         * Define el valor de la propiedad typeId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeId(String value) {
            this.typeId = value;
        }

        /**
         * Obtiene el valor de la propiedad isReleased.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsReleased() {
            return isReleased;
        }

        /**
         * Define el valor de la propiedad isReleased.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsReleased(String value) {
            this.isReleased = value;
        }

        /**
         * Obtiene el valor de la propiedad notes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotes() {
            return notes;
        }

        /**
         * Define el valor de la propiedad notes.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotes(String value) {
            this.notes = value;
        }

    }

}
