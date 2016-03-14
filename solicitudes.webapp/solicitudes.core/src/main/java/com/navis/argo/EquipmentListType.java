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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EquipmentListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EquipmentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="container" type="{http://www.navis.com/argo}ContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accessory" type="{http://www.navis.com/argo}AccessoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chassis" type="{http://www.navis.com/argo}ChassisType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentListType", propOrder = {
    "container",
    "accessory",
    "chassis"
})
public class EquipmentListType {

    protected List<ContainerType> container;
    protected List<AccessoryType> accessory;
    protected List<ChassisType> chassis;

    /**
     * Gets the value of the container property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the container property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerType }
     * 
     * 
     */
    public List<ContainerType> getContainer() {
        if (container == null) {
            container = new ArrayList<ContainerType>();
        }
        return this.container;
    }

    /**
     * Gets the value of the accessory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessoryType }
     * 
     * 
     */
    public List<AccessoryType> getAccessory() {
        if (accessory == null) {
            accessory = new ArrayList<AccessoryType>();
        }
        return this.accessory;
    }

    /**
     * Gets the value of the chassis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chassis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChassis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChassisType }
     * 
     * 
     */
    public List<ChassisType> getChassis() {
        if (chassis == null) {
            chassis = new ArrayList<ChassisType>();
        }
        return this.chassis;
    }

}
