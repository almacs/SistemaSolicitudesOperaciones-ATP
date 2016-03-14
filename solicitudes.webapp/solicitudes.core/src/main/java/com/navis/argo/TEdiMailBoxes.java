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
 * Mail Boxes
 * 
 * <p>Clase Java para tEdiMailBoxes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tEdiMailBoxes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mailbox" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="direction" type="{http://www.navis.com/argo}tEdiMessageDirection" />
 *                 &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="comm-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="comm-address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="comm-folder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="comm-passwd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="comm-user-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="is-primary" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "tEdiMailBoxes", propOrder = {
    "mailbox"
})
public class TEdiMailBoxes {

    protected List<TEdiMailBoxes.Mailbox> mailbox;

    /**
     * Gets the value of the mailbox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailbox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailbox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEdiMailBoxes.Mailbox }
     * 
     * 
     */
    public List<TEdiMailBoxes.Mailbox> getMailbox() {
        if (mailbox == null) {
            mailbox = new ArrayList<TEdiMailBoxes.Mailbox>();
        }
        return this.mailbox;
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
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="direction" type="{http://www.navis.com/argo}tEdiMessageDirection" />
     *       &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="comm-type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="comm-address" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="comm-folder" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="comm-passwd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="comm-user-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="is-primary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Mailbox {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "direction")
        protected TEdiMessageDirection direction;
        @XmlAttribute(name = "directory")
        protected String directory;
        @XmlAttribute(name = "comm-type")
        protected String commType;
        @XmlAttribute(name = "comm-address")
        protected String commAddress;
        @XmlAttribute(name = "comm-folder")
        protected String commFolder;
        @XmlAttribute(name = "comm-passwd")
        protected String commPasswd;
        @XmlAttribute(name = "comm-user-id")
        protected String commUserId;
        @XmlAttribute(name = "is-primary")
        protected String isPrimary;
        @XmlAttribute(name = "life-cycle-state")
        protected TLifeCycleStateType lifeCycleState;

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
         * Obtiene el valor de la propiedad directory.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirectory() {
            return directory;
        }

        /**
         * Define el valor de la propiedad directory.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirectory(String value) {
            this.directory = value;
        }

        /**
         * Obtiene el valor de la propiedad commType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommType() {
            return commType;
        }

        /**
         * Define el valor de la propiedad commType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommType(String value) {
            this.commType = value;
        }

        /**
         * Obtiene el valor de la propiedad commAddress.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommAddress() {
            return commAddress;
        }

        /**
         * Define el valor de la propiedad commAddress.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommAddress(String value) {
            this.commAddress = value;
        }

        /**
         * Obtiene el valor de la propiedad commFolder.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommFolder() {
            return commFolder;
        }

        /**
         * Define el valor de la propiedad commFolder.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommFolder(String value) {
            this.commFolder = value;
        }

        /**
         * Obtiene el valor de la propiedad commPasswd.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommPasswd() {
            return commPasswd;
        }

        /**
         * Define el valor de la propiedad commPasswd.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommPasswd(String value) {
            this.commPasswd = value;
        }

        /**
         * Obtiene el valor de la propiedad commUserId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommUserId() {
            return commUserId;
        }

        /**
         * Define el valor de la propiedad commUserId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommUserId(String value) {
            this.commUserId = value;
        }

        /**
         * Obtiene el valor de la propiedad isPrimary.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsPrimary() {
            return isPrimary;
        }

        /**
         * Define el valor de la propiedad isPrimary.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsPrimary(String value) {
            this.isPrimary = value;
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
