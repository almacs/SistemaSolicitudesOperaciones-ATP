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
 * Hazard Placard
 * 
 * <p>Clase Java para tPlacard complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tPlacard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="placard-text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="explanation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="min-wt-kg" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPlacard")
public class TPlacard {

    @XmlAttribute(name = "placard-text", required = true)
    protected String placardText;
    @XmlAttribute(name = "explanation")
    protected String explanation;
    @XmlAttribute(name = "min-wt-kg")
    protected Double minWtKg;

    /**
     * Obtiene el valor de la propiedad placardText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacardText() {
        return placardText;
    }

    /**
     * Define el valor de la propiedad placardText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacardText(String value) {
        this.placardText = value;
    }

    /**
     * Obtiene el valor de la propiedad explanation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Define el valor de la propiedad explanation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

    /**
     * Obtiene el valor de la propiedad minWtKg.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinWtKg() {
        return minWtKg;
    }

    /**
     * Define el valor de la propiedad minWtKg.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinWtKg(Double value) {
        this.minWtKg = value;
    }

}
