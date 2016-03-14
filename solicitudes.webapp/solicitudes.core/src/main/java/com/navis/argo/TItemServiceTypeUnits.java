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
 * Item Service Type Units
 * 
 * <p>Clase Java para tItemServiceTypeUnits complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tItemServiceTypeUnits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unit" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="equip-nbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="unit-status" type="{http://www.navis.com/argo}tServiceOrderUnitStatus" />
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
@XmlType(name = "tItemServiceTypeUnits", propOrder = {
    "unit"
})
public class TItemServiceTypeUnits {

    protected List<TItemServiceTypeUnits.Unit> unit;

    /**
     * Gets the value of the unit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TItemServiceTypeUnits.Unit }
     * 
     * 
     */
    public List<TItemServiceTypeUnits.Unit> getUnit() {
        if (unit == null) {
            unit = new ArrayList<TItemServiceTypeUnits.Unit>();
        }
        return this.unit;
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
     *       &lt;attribute name="equip-nbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="unit-status" type="{http://www.navis.com/argo}tServiceOrderUnitStatus" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Unit {

        @XmlAttribute(name = "equip-nbr", required = true)
        protected String equipNbr;
        @XmlAttribute(name = "unit-status")
        protected TServiceOrderUnitStatus unitStatus;

        /**
         * Obtiene el valor de la propiedad equipNbr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipNbr() {
            return equipNbr;
        }

        /**
         * Define el valor de la propiedad equipNbr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipNbr(String value) {
            this.equipNbr = value;
        }

        /**
         * Obtiene el valor de la propiedad unitStatus.
         * 
         * @return
         *     possible object is
         *     {@link TServiceOrderUnitStatus }
         *     
         */
        public TServiceOrderUnitStatus getUnitStatus() {
            return unitStatus;
        }

        /**
         * Define el valor de la propiedad unitStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link TServiceOrderUnitStatus }
         *     
         */
        public void setUnitStatus(TServiceOrderUnitStatus value) {
            this.unitStatus = value;
        }

    }

}
