//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to identify a container entity.
 * 
 * <p>Clase Java para tContainer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navis.com/argo}tEquipment">
 *       &lt;sequence>
 *         &lt;element name="reefer" type="{http://www.navis.com/argo}tReefer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tContainer", propOrder = {
    "reefer"
})
public class TContainer
    extends TEquipment
{

    protected TReefer reefer;

    /**
     * Obtiene el valor de la propiedad reefer.
     * 
     * @return
     *     possible object is
     *     {@link TReefer }
     *     
     */
    public TReefer getReefer() {
        return reefer;
    }

    /**
     * Define el valor de la propiedad reefer.
     * 
     * @param value
     *     allowed object is
     *     {@link TReefer }
     *     
     */
    public void setReefer(TReefer value) {
        this.reefer = value;
    }

}
