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
 * Pool Members
 * 
 * <p>Clase Java para tMembers complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tMembers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="member" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="equpment-classes" type="{http://www.navis.com/argo}tPoolEqClasses" minOccurs="0" form="unqualified"/>
 *                   &lt;element name="equpment-types" type="{http://www.navis.com/argo}tPoolEqTypes" minOccurs="0" form="unqualified"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="equipment-operator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "tMembers", propOrder = {
    "member"
})
public class TMembers {

    protected List<TMembers.Member> member;

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMembers.Member }
     * 
     * 
     */
    public List<TMembers.Member> getMember() {
        if (member == null) {
            member = new ArrayList<TMembers.Member>();
        }
        return this.member;
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
     *         &lt;element name="equpment-classes" type="{http://www.navis.com/argo}tPoolEqClasses" minOccurs="0" form="unqualified"/>
     *         &lt;element name="equpment-types" type="{http://www.navis.com/argo}tPoolEqTypes" minOccurs="0" form="unqualified"/>
     *       &lt;/sequence>
     *       &lt;attribute name="equipment-operator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "equpmentClasses",
        "equpmentTypes"
    })
    public static class Member {

        @XmlElement(name = "equpment-classes")
        protected TPoolEqClasses equpmentClasses;
        @XmlElement(name = "equpment-types")
        protected TPoolEqTypes equpmentTypes;
        @XmlAttribute(name = "equipment-operator", required = true)
        protected String equipmentOperator;

        /**
         * Obtiene el valor de la propiedad equpmentClasses.
         * 
         * @return
         *     possible object is
         *     {@link TPoolEqClasses }
         *     
         */
        public TPoolEqClasses getEqupmentClasses() {
            return equpmentClasses;
        }

        /**
         * Define el valor de la propiedad equpmentClasses.
         * 
         * @param value
         *     allowed object is
         *     {@link TPoolEqClasses }
         *     
         */
        public void setEqupmentClasses(TPoolEqClasses value) {
            this.equpmentClasses = value;
        }

        /**
         * Obtiene el valor de la propiedad equpmentTypes.
         * 
         * @return
         *     possible object is
         *     {@link TPoolEqTypes }
         *     
         */
        public TPoolEqTypes getEqupmentTypes() {
            return equpmentTypes;
        }

        /**
         * Define el valor de la propiedad equpmentTypes.
         * 
         * @param value
         *     allowed object is
         *     {@link TPoolEqTypes }
         *     
         */
        public void setEqupmentTypes(TPoolEqTypes value) {
            this.equpmentTypes = value;
        }

        /**
         * Obtiene el valor de la propiedad equipmentOperator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipmentOperator() {
            return equipmentOperator;
        }

        /**
         * Define el valor de la propiedad equipmentOperator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipmentOperator(String value) {
            this.equipmentOperator = value;
        }

    }

}
