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
import javax.xml.bind.annotation.XmlType;


/**
 * EDI Posting Rule
 * 
 * <p>Clase Java para tEdiPostingRule complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tEdiPostingRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rule" type="{http://www.navis.com/argo}tPredicate" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="message-class" use="required" type="{http://www.navis.com/argo}tEdiMessageClass" />
 *       &lt;attribute name="property-group" use="required" type="{http://www.navis.com/argo}tPropertyGroup" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEdiPostingRule", propOrder = {
    "rule"
})
public class TEdiPostingRule {

    protected TPredicate rule;
    @XmlAttribute(name = "message-class", required = true)
    protected TEdiMessageClass messageClass;
    @XmlAttribute(name = "property-group", required = true)
    protected TPropertyGroup propertyGroup;

    /**
     * Obtiene el valor de la propiedad rule.
     * 
     * @return
     *     possible object is
     *     {@link TPredicate }
     *     
     */
    public TPredicate getRule() {
        return rule;
    }

    /**
     * Define el valor de la propiedad rule.
     * 
     * @param value
     *     allowed object is
     *     {@link TPredicate }
     *     
     */
    public void setRule(TPredicate value) {
        this.rule = value;
    }

    /**
     * Obtiene el valor de la propiedad messageClass.
     * 
     * @return
     *     possible object is
     *     {@link TEdiMessageClass }
     *     
     */
    public TEdiMessageClass getMessageClass() {
        return messageClass;
    }

    /**
     * Define el valor de la propiedad messageClass.
     * 
     * @param value
     *     allowed object is
     *     {@link TEdiMessageClass }
     *     
     */
    public void setMessageClass(TEdiMessageClass value) {
        this.messageClass = value;
    }

    /**
     * Obtiene el valor de la propiedad propertyGroup.
     * 
     * @return
     *     possible object is
     *     {@link TPropertyGroup }
     *     
     */
    public TPropertyGroup getPropertyGroup() {
        return propertyGroup;
    }

    /**
     * Define el valor de la propiedad propertyGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link TPropertyGroup }
     *     
     */
    public void setPropertyGroup(TPropertyGroup value) {
        this.propertyGroup = value;
    }

}
