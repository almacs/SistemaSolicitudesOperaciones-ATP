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
 * Session
 * 
 * <p>Clase Java para tEdiSession complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tEdiSession">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://www.navis.com/argo}tFilter" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="mailboxes" type="{http://www.navis.com/argo}tEdiMailBoxes" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="settings" type="{http://www.navis.com/argo}tSettings" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="edi-filters" type="{http://www.navis.com/argo}tEdiFilters" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="extension" type="{http://www.navis.com/argo}tCodeExtension" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="message-class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="direction" type="{http://www.navis.com/argo}tEdiMessageDirection" />
 *       &lt;attribute name="message-map" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="file-ext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-auto-posted" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delimeter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEdiSession", propOrder = {
    "filter",
    "mailboxes",
    "settings",
    "ediFilters",
    "extension"
})
public class TEdiSession {

    protected List<TFilter> filter;
    protected List<TEdiMailBoxes> mailboxes;
    protected List<TSettings> settings;
    @XmlElement(name = "edi-filters")
    protected List<TEdiFilters> ediFilters;
    protected TCodeExtension extension;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "message-class")
    protected String messageClass;
    @XmlAttribute(name = "direction")
    protected TEdiMessageDirection direction;
    @XmlAttribute(name = "message-map")
    protected String messageMap;
    @XmlAttribute(name = "file-ext")
    protected String fileExt;
    @XmlAttribute(name = "is-auto-posted")
    protected String isAutoPosted;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "delimeter")
    protected String delimeter;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TFilter }
     * 
     * 
     */
    public List<TFilter> getFilter() {
        if (filter == null) {
            filter = new ArrayList<TFilter>();
        }
        return this.filter;
    }

    /**
     * Gets the value of the mailboxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailboxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailboxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEdiMailBoxes }
     * 
     * 
     */
    public List<TEdiMailBoxes> getMailboxes() {
        if (mailboxes == null) {
            mailboxes = new ArrayList<TEdiMailBoxes>();
        }
        return this.mailboxes;
    }

    /**
     * Gets the value of the settings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSettings }
     * 
     * 
     */
    public List<TSettings> getSettings() {
        if (settings == null) {
            settings = new ArrayList<TSettings>();
        }
        return this.settings;
    }

    /**
     * Gets the value of the ediFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ediFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdiFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEdiFilters }
     * 
     * 
     */
    public List<TEdiFilters> getEdiFilters() {
        if (ediFilters == null) {
            ediFilters = new ArrayList<TEdiFilters>();
        }
        return this.ediFilters;
    }

    /**
     * Obtiene el valor de la propiedad extension.
     * 
     * @return
     *     possible object is
     *     {@link TCodeExtension }
     *     
     */
    public TCodeExtension getExtension() {
        return extension;
    }

    /**
     * Define el valor de la propiedad extension.
     * 
     * @param value
     *     allowed object is
     *     {@link TCodeExtension }
     *     
     */
    public void setExtension(TCodeExtension value) {
        this.extension = value;
    }

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
     * Obtiene el valor de la propiedad messageClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageClass() {
        return messageClass;
    }

    /**
     * Define el valor de la propiedad messageClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageClass(String value) {
        this.messageClass = value;
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
     * Obtiene el valor de la propiedad messageMap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageMap() {
        return messageMap;
    }

    /**
     * Define el valor de la propiedad messageMap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageMap(String value) {
        this.messageMap = value;
    }

    /**
     * Obtiene el valor de la propiedad fileExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileExt() {
        return fileExt;
    }

    /**
     * Define el valor de la propiedad fileExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileExt(String value) {
        this.fileExt = value;
    }

    /**
     * Obtiene el valor de la propiedad isAutoPosted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAutoPosted() {
        return isAutoPosted;
    }

    /**
     * Define el valor de la propiedad isAutoPosted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAutoPosted(String value) {
        this.isAutoPosted = value;
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
     * Obtiene el valor de la propiedad delimeter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimeter() {
        return delimeter;
    }

    /**
     * Define el valor de la propiedad delimeter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimeter(String value) {
        this.delimeter = value;
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
