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
 * <p>Clase Java para LovType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LovType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lov-entry" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="lov-key" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="lov-description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "LovType", propOrder = {
    "lovEntry"
})
public class LovType {

    @XmlElement(name = "lov-entry", required = true)
    protected List<LovType.LovEntry> lovEntry;

    /**
     * Gets the value of the lovEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lovEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLovEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LovType.LovEntry }
     * 
     * 
     */
    public List<LovType.LovEntry> getLovEntry() {
        if (lovEntry == null) {
            lovEntry = new ArrayList<LovType.LovEntry>();
        }
        return this.lovEntry;
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
     *       &lt;attribute name="lov-key" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="lov-description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LovEntry {

        @XmlAttribute(name = "lov-key", required = true)
        protected long lovKey;
        @XmlAttribute(name = "lov-description", required = true)
        protected String lovDescription;

        /**
         * Obtiene el valor de la propiedad lovKey.
         * 
         */
        public long getLovKey() {
            return lovKey;
        }

        /**
         * Define el valor de la propiedad lovKey.
         * 
         */
        public void setLovKey(long value) {
            this.lovKey = value;
        }

        /**
         * Obtiene el valor de la propiedad lovDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLovDescription() {
            return lovDescription;
        }

        /**
         * Define el valor de la propiedad lovDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLovDescription(String value) {
            this.lovDescription = value;
        }

    }

}
