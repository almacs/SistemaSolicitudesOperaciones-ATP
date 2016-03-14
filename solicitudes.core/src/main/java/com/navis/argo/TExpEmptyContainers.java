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
 * <p>Clase Java para tExpEmptyContainers complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tExpEmptyContainers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expected-empty-container" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="equip-number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "tExpEmptyContainers", propOrder = {
    "expectedEmptyContainer"
})
public class TExpEmptyContainers {

    @XmlElement(name = "expected-empty-container")
    protected List<TExpEmptyContainers.ExpectedEmptyContainer> expectedEmptyContainer;

    /**
     * Gets the value of the expectedEmptyContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expectedEmptyContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedEmptyContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TExpEmptyContainers.ExpectedEmptyContainer }
     * 
     * 
     */
    public List<TExpEmptyContainers.ExpectedEmptyContainer> getExpectedEmptyContainer() {
        if (expectedEmptyContainer == null) {
            expectedEmptyContainer = new ArrayList<TExpEmptyContainers.ExpectedEmptyContainer>();
        }
        return this.expectedEmptyContainer;
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
     *       &lt;attribute name="equip-number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExpectedEmptyContainer {

        @XmlAttribute(name = "equip-number")
        protected String equipNumber;

        /**
         * Obtiene el valor de la propiedad equipNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipNumber() {
            return equipNumber;
        }

        /**
         * Define el valor de la propiedad equipNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipNumber(String value) {
            this.equipNumber = value;
        }

    }

}
