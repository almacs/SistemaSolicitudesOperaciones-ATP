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
 * Unit Observed Placards
 * 
 * <p>Clase Java para tObsPlacards complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tObsPlacards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="observed-placard" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="placard" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "tObsPlacards", propOrder = {
    "observedPlacard"
})
public class TObsPlacards {

    @XmlElement(name = "observed-placard", required = true)
    protected List<TObsPlacards.ObservedPlacard> observedPlacard;

    /**
     * Gets the value of the observedPlacard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observedPlacard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservedPlacard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TObsPlacards.ObservedPlacard }
     * 
     * 
     */
    public List<TObsPlacards.ObservedPlacard> getObservedPlacard() {
        if (observedPlacard == null) {
            observedPlacard = new ArrayList<TObsPlacards.ObservedPlacard>();
        }
        return this.observedPlacard;
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
     *       &lt;attribute name="placard" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ObservedPlacard {

        @XmlAttribute(name = "placard", required = true)
        protected String placard;
        @XmlAttribute(name = "remarks")
        protected String remarks;

        /**
         * Obtiene el valor de la propiedad placard.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlacard() {
            return placard;
        }

        /**
         * Define el valor de la propiedad placard.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlacard(String value) {
            this.placard = value;
        }

        /**
         * Obtiene el valor de la propiedad remarks.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemarks() {
            return remarks;
        }

        /**
         * Define el valor de la propiedad remarks.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemarks(String value) {
            this.remarks = value;
        }

    }

}
