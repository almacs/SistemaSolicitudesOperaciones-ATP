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
 * Edi Message Map
 * 
 * <p>Clase Java para tMessageMaps complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tMessageMaps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message-map" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dic-file" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="mgt-file" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="direction" type="{http://www.navis.com/argo}tEdiMessageDirection" />
 *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
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
@XmlType(name = "tMessageMaps", propOrder = {
    "messageMap"
})
public class TMessageMaps {

    @XmlElement(name = "message-map")
    protected List<TMessageMaps.MessageMap> messageMap;

    /**
     * Gets the value of the messageMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMessageMaps.MessageMap }
     * 
     * 
     */
    public List<TMessageMaps.MessageMap> getMessageMap() {
        if (messageMap == null) {
            messageMap = new ArrayList<TMessageMaps.MessageMap>();
        }
        return this.messageMap;
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
     *         &lt;element name="dic-file" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="mgt-file" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="direction" type="{http://www.navis.com/argo}tEdiMessageDirection" />
     *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dicFile",
        "mgtFile"
    })
    public static class MessageMap {

        @XmlElement(name = "dic-file", required = true)
        protected String dicFile;
        @XmlElement(name = "mgt-file", required = true)
        protected String mgtFile;
        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "direction")
        protected TEdiMessageDirection direction;
        @XmlAttribute(name = "description")
        protected String description;
        @XmlAttribute(name = "life-cycle-state")
        protected TLifeCycleStateType lifeCycleState;

        /**
         * Obtiene el valor de la propiedad dicFile.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDicFile() {
            return dicFile;
        }

        /**
         * Define el valor de la propiedad dicFile.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDicFile(String value) {
            this.dicFile = value;
        }

        /**
         * Obtiene el valor de la propiedad mgtFile.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMgtFile() {
            return mgtFile;
        }

        /**
         * Define el valor de la propiedad mgtFile.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMgtFile(String value) {
            this.mgtFile = value;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad direction.
         * 
         * @return
         *     possible object is
         *     {@link TEdiMessageDirection }
         *     
         */
        public TEdiMessageDirection getDirection() {
            return direction;
        }

        /**
         * Define el valor de la propiedad direction.
         * 
         * @param value
         *     allowed object is
         *     {@link TEdiMessageDirection }
         *     
         */
        public void setDirection(TEdiMessageDirection value) {
            this.direction = value;
        }

        /**
         * Obtiene el valor de la propiedad description.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Define el valor de la propiedad description.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Obtiene el valor de la propiedad lifeCycleState.
         * 
         * @return
         *     possible object is
         *     {@link TLifeCycleStateType }
         *     
         */
        public TLifeCycleStateType getLifeCycleState() {
            return lifeCycleState;
        }

        /**
         * Define el valor de la propiedad lifeCycleState.
         * 
         * @param value
         *     allowed object is
         *     {@link TLifeCycleStateType }
         *     
         */
        public void setLifeCycleState(TLifeCycleStateType value) {
            this.lifeCycleState = value;
        }

    }

}
