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
 * Routing specifies the carrier that brought or will bring the inventory
 *                 unit to the facility and that which took it or will take it from the facility. Both
 *                 intended and actual carriers are recorded.
 *             
 * 
 * <p>Clase Java para tLoadListRouting complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tLoadListRouting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier" maxOccurs="2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.navis.com/argo}tCarrier">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="pol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLoadListRouting", propOrder = {
    "carrier"
})
public class TLoadListRouting {

    @XmlElement(required = true)
    protected List<TLoadListRouting.Carrier> carrier;
    @XmlAttribute(name = "pol")
    protected String pol;
    @XmlAttribute(name = "pod")
    protected String pod;

    /**
     * Gets the value of the carrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLoadListRouting.Carrier }
     * 
     * 
     */
    public List<TLoadListRouting.Carrier> getCarrier() {
        if (carrier == null) {
            carrier = new ArrayList<TLoadListRouting.Carrier>();
        }
        return this.carrier;
    }

    /**
     * Obtiene el valor de la propiedad pol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPol() {
        return pol;
    }

    /**
     * Define el valor de la propiedad pol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPol(String value) {
        this.pol = value;
    }

    /**
     * Obtiene el valor de la propiedad pod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPod() {
        return pod;
    }

    /**
     * Define el valor de la propiedad pod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPod(String value) {
        this.pod = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.navis.com/argo}tCarrier">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Carrier
        extends TCarrier
    {


    }

}
