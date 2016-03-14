//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tUnitRenumber complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tUnitRenumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unit-identity" type="{http://www.navis.com/argo}tUnitIdentity"/>
 *         &lt;element name="renumber">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="bad-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="corrected-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "tUnitRenumber", propOrder = {
    "unitIdentity",
    "renumber"
})
public class TUnitRenumber {

    @XmlElement(name = "unit-identity", required = true)
    protected TUnitIdentity unitIdentity;
    @XmlElement(required = true)
    protected TUnitRenumber.Renumber renumber;

    /**
     * Obtiene el valor de la propiedad unitIdentity.
     * 
     * @return
     *     possible object is
     *     {@link TUnitIdentity }
     *     
     */
    public TUnitIdentity getUnitIdentity() {
        return unitIdentity;
    }

    /**
     * Define el valor de la propiedad unitIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitIdentity }
     *     
     */
    public void setUnitIdentity(TUnitIdentity value) {
        this.unitIdentity = value;
    }

    /**
     * Obtiene el valor de la propiedad renumber.
     * 
     * @return
     *     possible object is
     *     {@link TUnitRenumber.Renumber }
     *     
     */
    public TUnitRenumber.Renumber getRenumber() {
        return renumber;
    }

    /**
     * Define el valor de la propiedad renumber.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnitRenumber.Renumber }
     *     
     */
    public void setRenumber(TUnitRenumber.Renumber value) {
        this.renumber = value;
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
     *       &lt;attribute name="bad-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="corrected-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Renumber {

        @XmlAttribute(name = "bad-id", required = true)
        protected String badId;
        @XmlAttribute(name = "corrected-id", required = true)
        protected String correctedId;

        /**
         * Obtiene el valor de la propiedad badId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBadId() {
            return badId;
        }

        /**
         * Define el valor de la propiedad badId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBadId(String value) {
            this.badId = value;
        }

        /**
         * Obtiene el valor de la propiedad correctedId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorrectedId() {
            return correctedId;
        }

        /**
         * Define el valor de la propiedad correctedId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorrectedId(String value) {
            this.correctedId = value;
        }

    }

}
