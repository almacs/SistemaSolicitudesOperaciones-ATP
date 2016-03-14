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
 * Specifies over-dimension attributes of the inventory unit.
 *             
 * 
 * <p>Clase Java para tOog complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tOog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="top-cm" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="front-cm" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="back-cm" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="left-cm" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="right-cm" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOog")
public class TOog {

    @XmlAttribute(name = "top-cm")
    protected Long topCm;
    @XmlAttribute(name = "front-cm")
    protected Long frontCm;
    @XmlAttribute(name = "back-cm")
    protected Long backCm;
    @XmlAttribute(name = "left-cm")
    protected Long leftCm;
    @XmlAttribute(name = "right-cm")
    protected Long rightCm;

    /**
     * Obtiene el valor de la propiedad topCm.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTopCm() {
        return topCm;
    }

    /**
     * Define el valor de la propiedad topCm.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTopCm(Long value) {
        this.topCm = value;
    }

    /**
     * Obtiene el valor de la propiedad frontCm.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFrontCm() {
        return frontCm;
    }

    /**
     * Define el valor de la propiedad frontCm.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFrontCm(Long value) {
        this.frontCm = value;
    }

    /**
     * Obtiene el valor de la propiedad backCm.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBackCm() {
        return backCm;
    }

    /**
     * Define el valor de la propiedad backCm.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBackCm(Long value) {
        this.backCm = value;
    }

    /**
     * Obtiene el valor de la propiedad leftCm.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLeftCm() {
        return leftCm;
    }

    /**
     * Define el valor de la propiedad leftCm.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLeftCm(Long value) {
        this.leftCm = value;
    }

    /**
     * Obtiene el valor de la propiedad rightCm.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRightCm() {
        return rightCm;
    }

    /**
     * Define el valor de la propiedad rightCm.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRightCm(Long value) {
        this.rightCm = value;
    }

}
