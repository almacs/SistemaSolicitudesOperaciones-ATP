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
import javax.xml.bind.annotation.XmlType;


/**
 * Trucking Company Line Restrictions.
 *             
 * 
 * <p>Clase Java para tTruckingCompanyLineRestictions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTruckingCompanyLineRestictions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restriction" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="sub-type" type="{http://www.navis.com/argo}tTranSubTypeEnum" />
 *                 &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="update-mode" type="{http://www.navis.com/argo}tUpdateMode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTruckingCompanyLineRestictions", propOrder = {
    "restriction"
})
public class TTruckingCompanyLineRestictions {

    protected List<TTruckingCompanyLineRestictions.Restriction> restriction;
    @XmlAttribute(name = "update-mode")
    protected TUpdateMode updateMode;

    /**
     * Gets the value of the restriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTruckingCompanyLineRestictions.Restriction }
     * 
     * 
     */
    public List<TTruckingCompanyLineRestictions.Restriction> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<TTruckingCompanyLineRestictions.Restriction>();
        }
        return this.restriction;
    }

    /**
     * Obtiene el valor de la propiedad updateMode.
     * 
     * @return
     *     possible object is
     *     {@link TUpdateMode }
     *     
     */
    public TUpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * Define el valor de la propiedad updateMode.
     * 
     * @param value
     *     allowed object is
     *     {@link TUpdateMode }
     *     
     */
    public void setUpdateMode(TUpdateMode value) {
        this.updateMode = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="sub-type" type="{http://www.navis.com/argo}tTranSubTypeEnum" />
     *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Restriction {

        @XmlAttribute(name = "sub-type")
        protected TTranSubTypeEnum subType;
        @XmlAttribute(name = "life-cycle-state")
        protected TLifeCycleStateType lifeCycleState;

        /**
         * Obtiene el valor de la propiedad subType.
         * 
         * @return
         *     possible object is
         *     {@link TTranSubTypeEnum }
         *     
         */
        public TTranSubTypeEnum getSubType() {
            return subType;
        }

        /**
         * Define el valor de la propiedad subType.
         * 
         * @param value
         *     allowed object is
         *     {@link TTranSubTypeEnum }
         *     
         */
        public void setSubType(TTranSubTypeEnum value) {
            this.subType = value;
        }

        /**
         * Obtiene el valor de la propiedad lifeCycleState.
         * 
         * @return
         *     possible object is
         *     {@link TLifeCycleStateType }
         *     
         */
        public TLifeCycleStateType getLifeCycleState() {
            return lifeCycleState;
        }

        /**
         * Define el valor de la propiedad lifeCycleState.
         * 
         * @param value
         *     allowed object is
         *     {@link TLifeCycleStateType }
         *     
         */
        public void setLifeCycleState(TLifeCycleStateType value) {
            this.lifeCycleState = value;
        }

    }

}
