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
 * <p>Clase Java para tRouting complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tRouting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier" maxOccurs="4">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.navis.com/argo}tCarrier">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="pol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pol-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pod-1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pod-1-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pod-2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pod-2-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="opl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pin-number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="return-to-location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="designated-trucker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="carrier-service" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="next-facility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRouting", propOrder = {
    "carrier"
})
public class TRouting {

    @XmlElement(required = true)
    protected List<TRouting.Carrier> carrier;
    @XmlAttribute(name = "pol")
    protected String pol;
    @XmlAttribute(name = "pol-name")
    protected String polName;
    @XmlAttribute(name = "pod-1")
    protected String pod1;
    @XmlAttribute(name = "pod-1-name")
    protected String pod1Name;
    @XmlAttribute(name = "pod-2")
    protected String pod2;
    @XmlAttribute(name = "pod-2-name")
    protected String pod2Name;
    @XmlAttribute(name = "opl")
    protected String opl;
    @XmlAttribute(name = "origin")
    protected String origin;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "pin-number")
    protected String pinNumber;
    @XmlAttribute(name = "return-to-location")
    protected String returnToLocation;
    @XmlAttribute(name = "designated-trucker")
    protected String designatedTrucker;
    @XmlAttribute(name = "carrier-service")
    protected String carrierService;
    @XmlAttribute(name = "group")
    protected String group;
    @XmlAttribute(name = "next-facility")
    protected String nextFacility;

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
     * {@link TRouting.Carrier }
     * 
     * 
     */
    public List<TRouting.Carrier> getCarrier() {
        if (carrier == null) {
            carrier = new ArrayList<TRouting.Carrier>();
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
     * Obtiene el valor de la propiedad polName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolName() {
        return polName;
    }

    /**
     * Define el valor de la propiedad polName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolName(String value) {
        this.polName = value;
    }

    /**
     * Obtiene el valor de la propiedad pod1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPod1() {
        return pod1;
    }

    /**
     * Define el valor de la propiedad pod1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPod1(String value) {
        this.pod1 = value;
    }

    /**
     * Obtiene el valor de la propiedad pod1Name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPod1Name() {
        return pod1Name;
    }

    /**
     * Define el valor de la propiedad pod1Name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPod1Name(String value) {
        this.pod1Name = value;
    }

    /**
     * Obtiene el valor de la propiedad pod2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPod2() {
        return pod2;
    }

    /**
     * Define el valor de la propiedad pod2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPod2(String value) {
        this.pod2 = value;
    }

    /**
     * Obtiene el valor de la propiedad pod2Name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPod2Name() {
        return pod2Name;
    }

    /**
     * Define el valor de la propiedad pod2Name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPod2Name(String value) {
        this.pod2Name = value;
    }

    /**
     * Obtiene el valor de la propiedad opl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpl() {
        return opl;
    }

    /**
     * Define el valor de la propiedad opl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpl(String value) {
        this.opl = value;
    }

    /**
     * Obtiene el valor de la propiedad origin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Define el valor de la propiedad origin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Obtiene el valor de la propiedad destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Define el valor de la propiedad destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Obtiene el valor de la propiedad pinNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinNumber() {
        return pinNumber;
    }

    /**
     * Define el valor de la propiedad pinNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinNumber(String value) {
        this.pinNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToLocation() {
        return returnToLocation;
    }

    /**
     * Define el valor de la propiedad returnToLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToLocation(String value) {
        this.returnToLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad designatedTrucker.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignatedTrucker() {
        return designatedTrucker;
    }

    /**
     * Define el valor de la propiedad designatedTrucker.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatedTrucker(String value) {
        this.designatedTrucker = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierService() {
        return carrierService;
    }

    /**
     * Define el valor de la propiedad carrierService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierService(String value) {
        this.carrierService = value;
    }

    /**
     * Obtiene el valor de la propiedad group.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Define el valor de la propiedad group.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Obtiene el valor de la propiedad nextFacility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextFacility() {
        return nextFacility;
    }

    /**
     * Define el valor de la propiedad nextFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextFacility(String value) {
        this.nextFacility = value;
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
