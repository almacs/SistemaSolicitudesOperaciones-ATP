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
 * A Carrier Itinerary itinerary identifies the Routing Points in
 *                 sequence that a carrier visits on one rotation
 *             
 * 
 * <p>Clase Java para tCarrierItinerary complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tCarrierItinerary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="call" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sub-point" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="point-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="point-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="call-number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="call-order" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="scan-code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="owner-cv" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="owner-cv-mode" type="{http://www.navis.com/argo}tTransportMode" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCarrierItinerary", propOrder = {
    "call"
})
public class TCarrierItinerary {

    protected List<TCarrierItinerary.Call> call;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "owner-cv")
    protected String ownerCv;
    @XmlAttribute(name = "owner-cv-mode")
    protected String ownerCvMode;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Gets the value of the call property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the call property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCarrierItinerary.Call }
     * 
     * 
     */
    public List<TCarrierItinerary.Call> getCall() {
        if (call == null) {
            call = new ArrayList<TCarrierItinerary.Call>();
        }
        return this.call;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerCv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCv() {
        return ownerCv;
    }

    /**
     * Define el valor de la propiedad ownerCv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCv(String value) {
        this.ownerCv = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerCvMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCvMode() {
        return ownerCvMode;
    }

    /**
     * Define el valor de la propiedad ownerCvMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCvMode(String value) {
        this.ownerCvMode = value;
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


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sub-point" maxOccurs="unbounded" minOccurs="0" form="unqualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="point-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="point-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="call-number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="call-order" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="scan-code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subPoint"
    })
    public static class Call {

        @XmlElement(name = "sub-point")
        protected List<TCarrierItinerary.Call.SubPoint> subPoint;
        @XmlAttribute(name = "point-id", required = true)
        protected String pointId;
        @XmlAttribute(name = "call-number")
        protected String callNumber;
        @XmlAttribute(name = "call-order")
        protected Long callOrder;
        @XmlAttribute(name = "scan-code", required = true)
        protected String scanCode;
        @XmlAttribute(name = "life-cycle-state")
        protected TLifeCycleStateType lifeCycleState;

        /**
         * Gets the value of the subPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TCarrierItinerary.Call.SubPoint }
         * 
         * 
         */
        public List<TCarrierItinerary.Call.SubPoint> getSubPoint() {
            if (subPoint == null) {
                subPoint = new ArrayList<TCarrierItinerary.Call.SubPoint>();
            }
            return this.subPoint;
        }

        /**
         * Obtiene el valor de la propiedad pointId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPointId() {
            return pointId;
        }

        /**
         * Define el valor de la propiedad pointId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPointId(String value) {
            this.pointId = value;
        }

        /**
         * Obtiene el valor de la propiedad callNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallNumber() {
            return callNumber;
        }

        /**
         * Define el valor de la propiedad callNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallNumber(String value) {
            this.callNumber = value;
        }

        /**
         * Obtiene el valor de la propiedad callOrder.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCallOrder() {
            return callOrder;
        }

        /**
         * Define el valor de la propiedad callOrder.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCallOrder(Long value) {
            this.callOrder = value;
        }

        /**
         * Obtiene el valor de la propiedad scanCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScanCode() {
            return scanCode;
        }

        /**
         * Define el valor de la propiedad scanCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScanCode(String value) {
            this.scanCode = value;
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


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="point-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class SubPoint {

            @XmlAttribute(name = "point-id", required = true)
            protected String pointId;
            @XmlAttribute(name = "life-cycle-state")
            protected TLifeCycleStateType lifeCycleState;

            /**
             * Obtiene el valor de la propiedad pointId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPointId() {
                return pointId;
            }

            /**
             * Define el valor de la propiedad pointId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPointId(String value) {
                this.pointId = value;
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

}
