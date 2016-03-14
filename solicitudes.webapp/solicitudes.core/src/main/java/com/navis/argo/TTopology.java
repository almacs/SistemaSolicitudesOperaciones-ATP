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
 * Operator's Topology
 * 
 * <p>Clase Java para tTopology complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTopology">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complexes" type="{http://www.navis.com/argo}tComplexes" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTopology", propOrder = {
    "complexes"
})
public class TTopology {

    protected TComplexes complexes;
    @XmlAttribute(name = "operator-id", required = true)
    protected String operatorId;

    /**
     * Obtiene el valor de la propiedad complexes.
     * 
     * @return
     *     possible object is
     *     {@link TComplexes }
     *     
     */
    public TComplexes getComplexes() {
        return complexes;
    }

    /**
     * Define el valor de la propiedad complexes.
     * 
     * @param value
     *     allowed object is
     *     {@link TComplexes }
     *     
     */
    public void setComplexes(TComplexes value) {
        this.complexes = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Define el valor de la propiedad operatorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorId(String value) {
        this.operatorId = value;
    }

}
