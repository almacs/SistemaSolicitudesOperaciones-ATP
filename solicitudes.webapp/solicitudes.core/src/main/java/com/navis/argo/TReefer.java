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
 * <p>Clase Java para tReefer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tReefer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navis.com/argo}tBaseReefer">
 *       &lt;attribute name="is-starvent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tReefer")
public class TReefer
    extends TBaseReefer
{

    @XmlAttribute(name = "is-starvent")
    protected String isStarvent;

    /**
     * Obtiene el valor de la propiedad isStarvent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStarvent() {
        return isStarvent;
    }

    /**
     * Define el valor de la propiedad isStarvent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStarvent(String value) {
        this.isStarvent = value;
    }

}
