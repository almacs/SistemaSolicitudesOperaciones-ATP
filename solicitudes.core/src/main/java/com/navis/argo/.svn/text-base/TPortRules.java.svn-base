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
 * Port Rules
 * 
 * <p>Clase Java para tPortRules complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tPortRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="port-rule" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="used" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="routing-point-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="serial-ranges" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "tPortRules", propOrder = {
    "portRule"
})
public class TPortRules {

    @XmlElement(name = "port-rule")
    protected List<TPortRules.PortRule> portRule;
    @XmlAttribute(name = "update-mode")
    protected TUpdateMode updateMode;

    /**
     * Gets the value of the portRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPortRules.PortRule }
     * 
     * 
     */
    public List<TPortRules.PortRule> getPortRule() {
        if (portRule == null) {
            portRule = new ArrayList<TPortRules.PortRule>();
        }
        return this.portRule;
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
     *       &lt;attribute name="used" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="routing-point-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="serial-ranges" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PortRule {

        @XmlAttribute(name = "used")
        protected String used;
        @XmlAttribute(name = "routing-point-id", required = true)
        protected String routingPointId;
        @XmlAttribute(name = "serial-ranges", required = true)
        protected String serialRanges;

        /**
         * Obtiene el valor de la propiedad used.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsed() {
            return used;
        }

        /**
         * Define el valor de la propiedad used.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsed(String value) {
            this.used = value;
        }

        /**
         * Obtiene el valor de la propiedad routingPointId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoutingPointId() {
            return routingPointId;
        }

        /**
         * Define el valor de la propiedad routingPointId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoutingPointId(String value) {
            this.routingPointId = value;
        }

        /**
         * Obtiene el valor de la propiedad serialRanges.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerialRanges() {
            return serialRanges;
        }

        /**
         * Define el valor de la propiedad serialRanges.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerialRanges(String value) {
            this.serialRanges = value;
        }

    }

}
