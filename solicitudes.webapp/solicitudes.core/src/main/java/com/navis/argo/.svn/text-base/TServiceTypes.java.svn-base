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
 * ItemServiceTypes
 * 
 * <p>Clase Java para tServiceTypes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tServiceTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service-type" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="units" type="{http://www.navis.com/argo}tItemServiceTypeUnits" minOccurs="0" form="unqualified"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="event-type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "tServiceTypes", propOrder = {
    "serviceType"
})
public class TServiceTypes {

    @XmlElement(name = "service-type")
    protected List<TServiceTypes.ServiceType> serviceType;

    /**
     * Gets the value of the serviceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TServiceTypes.ServiceType }
     * 
     * 
     */
    public List<TServiceTypes.ServiceType> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<TServiceTypes.ServiceType>();
        }
        return this.serviceType;
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
     *         &lt;element name="units" type="{http://www.navis.com/argo}tItemServiceTypeUnits" minOccurs="0" form="unqualified"/>
     *       &lt;/sequence>
     *       &lt;attribute name="event-type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "units"
    })
    public static class ServiceType {

        protected TItemServiceTypeUnits units;
        @XmlAttribute(name = "event-type")
        protected String eventType;

        /**
         * Obtiene el valor de la propiedad units.
         * 
         * @return
         *     possible object is
         *     {@link TItemServiceTypeUnits }
         *     
         */
        public TItemServiceTypeUnits getUnits() {
            return units;
        }

        /**
         * Define el valor de la propiedad units.
         * 
         * @param value
         *     allowed object is
         *     {@link TItemServiceTypeUnits }
         *     
         */
        public void setUnits(TItemServiceTypeUnits value) {
            this.units = value;
        }

        /**
         * Obtiene el valor de la propiedad eventType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventType() {
            return eventType;
        }

        /**
         * Define el valor de la propiedad eventType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventType(String value) {
            this.eventType = value;
        }

    }

}
