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
 * Report Design
 * 
 * <p>Clase Java para tReportDesign complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tReportDesign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xml-design" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filter" type="{http://www.navis.com/argo}tFilter" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="entity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visible-scope" use="required" type="{http://www.navis.com/argo}tScope" />
 *       &lt;attribute name="max-scope" type="{http://www.navis.com/argo}tScope" />
 *       &lt;attribute name="min-scope" type="{http://www.navis.com/argo}tScope" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tReportDesign", propOrder = {
    "xmlDesign",
    "filter"
})
public class TReportDesign {

    @XmlElement(name = "xml-design")
    protected String xmlDesign;
    protected TFilter filter;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "entity")
    protected String entity;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "visible-scope", required = true)
    protected TScope visibleScope;
    @XmlAttribute(name = "max-scope")
    protected TScope maxScope;
    @XmlAttribute(name = "min-scope")
    protected TScope minScope;

    /**
     * Obtiene el valor de la propiedad xmlDesign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlDesign() {
        return xmlDesign;
    }

    /**
     * Define el valor de la propiedad xmlDesign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlDesign(String value) {
        this.xmlDesign = value;
    }

    /**
     * Obtiene el valor de la propiedad filter.
     * 
     * @return
     *     possible object is
     *     {@link TFilter }
     *     
     */
    public TFilter getFilter() {
        return filter;
    }

    /**
     * Define el valor de la propiedad filter.
     * 
     * @param value
     *     allowed object is
     *     {@link TFilter }
     *     
     */
    public void setFilter(TFilter value) {
        this.filter = value;
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
     * Obtiene el valor de la propiedad entity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Define el valor de la propiedad entity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
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
     * Obtiene el valor de la propiedad visibleScope.
     * 
     * @return
     *     possible object is
     *     {@link TScope }
     *     
     */
    public TScope getVisibleScope() {
        return visibleScope;
    }

    /**
     * Define el valor de la propiedad visibleScope.
     * 
     * @param value
     *     allowed object is
     *     {@link TScope }
     *     
     */
    public void setVisibleScope(TScope value) {
        this.visibleScope = value;
    }

    /**
     * Obtiene el valor de la propiedad maxScope.
     * 
     * @return
     *     possible object is
     *     {@link TScope }
     *     
     */
    public TScope getMaxScope() {
        return maxScope;
    }

    /**
     * Define el valor de la propiedad maxScope.
     * 
     * @param value
     *     allowed object is
     *     {@link TScope }
     *     
     */
    public void setMaxScope(TScope value) {
        this.maxScope = value;
    }

    /**
     * Obtiene el valor de la propiedad minScope.
     * 
     * @return
     *     possible object is
     *     {@link TScope }
     *     
     */
    public TScope getMinScope() {
        return minScope;
    }

    /**
     * Define el valor de la propiedad minScope.
     * 
     * @param value
     *     allowed object is
     *     {@link TScope }
     *     
     */
    public void setMinScope(TScope value) {
        this.minScope = value;
    }

}
