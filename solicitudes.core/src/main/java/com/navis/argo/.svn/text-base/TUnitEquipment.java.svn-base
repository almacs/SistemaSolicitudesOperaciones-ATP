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
 * Item of equipment associated with the inventory unit - Container,
 *                     Chassis, Accessories.
 *                 
 * 
 * <p>Clase Java para tUnitEquipment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tUnitEquipment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navis.com/argo}tEquipment">
 *       &lt;sequence>
 *         &lt;element name="damages" type="{http://www.navis.com/argo}tDamages" minOccurs="0"/>
 *         &lt;element name="flags" type="{http://www.navis.com/argo}tFlags" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="role">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="PRIMARY"/>
 *             &lt;enumeration value="CARRIAGE"/>
 *             &lt;enumeration value="ACCESSORY"/>
 *             &lt;enumeration value="ACCESSORY_ON_CHS"/>
 *             &lt;enumeration value="PAYLOAD"/>
 *             &lt;enumeration value=""/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUnitEquipment", propOrder = {
    "damages",
    "flags"
})
public class TUnitEquipment
    extends TEquipment
{

    protected TDamages damages;
    protected TFlags flags;
    @XmlAttribute(name = "role")
    protected String role;

    /**
     * Obtiene el valor de la propiedad damages.
     * 
     * @return
     *     possible object is
     *     {@link TDamages }
     *     
     */
    public TDamages getDamages() {
        return damages;
    }

    /**
     * Define el valor de la propiedad damages.
     * 
     * @param value
     *     allowed object is
     *     {@link TDamages }
     *     
     */
    public void setDamages(TDamages value) {
        this.damages = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link TFlags }
     *     
     */
    public TFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link TFlags }
     *     
     */
    public void setFlags(TFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad role.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Define el valor de la propiedad role.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

}
