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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines an organization that acts as a Shipper
 * 
 * <p>Clase Java para tTruckingCompany complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTruckingCompany">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navis.com/argo}tBusinessUnit">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="agent-representations" type="{http://www.navis.com/argo}tAgentRepresentations" minOccurs="0" form="unqualified"/>
 *         &lt;element name="line-agreements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="line-agreement" type="{http://www.navis.com/argo}tLineAgreement" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="update-mode" type="{http://www.navis.com/argo}tUpdateMode" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="drivers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="driver" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="license-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="card-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="update-mode" type="{http://www.navis.com/argo}tUpdateMode" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="groups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="group" type="{http://www.navis.com/argo}tGroup" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="update-mode" type="{http://www.navis.com/argo}tUpdateMode" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="insurance-expires" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="is-eq-operator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-eq-owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="default-edo-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="line-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.navis.com/argo}tTruckStatus" />
 *       &lt;attribute name="guarantee-limit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-exam-site-carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-seized-cargo-carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exam-authorization-expires" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="seized-cargo-authorization-expires" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTruckingCompany", propOrder = {
    "agentRepresentations",
    "lineAgreements",
    "drivers",
    "groups"
})
public class TTruckingCompany
    extends TBusinessUnit
{

    @XmlElement(name = "agent-representations")
    protected TAgentRepresentations agentRepresentations;
    @XmlElement(name = "line-agreements")
    protected TTruckingCompany.LineAgreements lineAgreements;
    protected TTruckingCompany.Drivers drivers;
    protected TTruckingCompany.Groups groups;
    @XmlAttribute(name = "insurance-expires")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar insuranceExpires;
    @XmlAttribute(name = "is-eq-operator")
    protected String isEqOperator;
    @XmlAttribute(name = "is-eq-owner")
    protected String isEqOwner;
    @XmlAttribute(name = "default-edo-nbr")
    protected String defaultEdoNbr;
    @XmlAttribute(name = "line-id")
    protected String lineId;
    @XmlAttribute(name = "status")
    protected TTruckStatus status;
    @XmlAttribute(name = "guarantee-limit")
    protected String guaranteeLimit;
    @XmlAttribute(name = "is-exam-site-carrier")
    protected String isExamSiteCarrier;
    @XmlAttribute(name = "is-seized-cargo-carrier")
    protected String isSeizedCargoCarrier;
    @XmlAttribute(name = "exam-authorization-expires")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examAuthorizationExpires;
    @XmlAttribute(name = "seized-cargo-authorization-expires")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar seizedCargoAuthorizationExpires;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Obtiene el valor de la propiedad agentRepresentations.
     * 
     * @return
     *     possible object is
     *     {@link TAgentRepresentations }
     *     
     */
    public TAgentRepresentations getAgentRepresentations() {
        return agentRepresentations;
    }

    /**
     * Define el valor de la propiedad agentRepresentations.
     * 
     * @param value
     *     allowed object is
     *     {@link TAgentRepresentations }
     *     
     */
    public void setAgentRepresentations(TAgentRepresentations value) {
        this.agentRepresentations = value;
    }

    /**
     * Obtiene el valor de la propiedad lineAgreements.
     * 
     * @return
     *     possible object is
     *     {@link TTruckingCompany.LineAgreements }
     *     
     */
    public TTruckingCompany.LineAgreements getLineAgreements() {
        return lineAgreements;
    }

    /**
     * Define el valor de la propiedad lineAgreements.
     * 
     * @param value
     *     allowed object is
     *     {@link TTruckingCompany.LineAgreements }
     *     
     */
    public void setLineAgreements(TTruckingCompany.LineAgreements value) {
        this.lineAgreements = value;
    }

    /**
     * Obtiene el valor de la propiedad drivers.
     * 
     * @return
     *     possible object is
     *     {@link TTruckingCompany.Drivers }
     *     
     */
    public TTruckingCompany.Drivers getDrivers() {
        return drivers;
    }

    /**
     * Define el valor de la propiedad drivers.
     * 
     * @param value
     *     allowed object is
     *     {@link TTruckingCompany.Drivers }
     *     
     */
    public void setDrivers(TTruckingCompany.Drivers value) {
        this.drivers = value;
    }

    /**
     * Obtiene el valor de la propiedad groups.
     * 
     * @return
     *     possible object is
     *     {@link TTruckingCompany.Groups }
     *     
     */
    public TTruckingCompany.Groups getGroups() {
        return groups;
    }

    /**
     * Define el valor de la propiedad groups.
     * 
     * @param value
     *     allowed object is
     *     {@link TTruckingCompany.Groups }
     *     
     */
    public void setGroups(TTruckingCompany.Groups value) {
        this.groups = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceExpires.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsuranceExpires() {
        return insuranceExpires;
    }

    /**
     * Define el valor de la propiedad insuranceExpires.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsuranceExpires(XMLGregorianCalendar value) {
        this.insuranceExpires = value;
    }

    /**
     * Obtiene el valor de la propiedad isEqOperator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEqOperator() {
        return isEqOperator;
    }

    /**
     * Define el valor de la propiedad isEqOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEqOperator(String value) {
        this.isEqOperator = value;
    }

    /**
     * Obtiene el valor de la propiedad isEqOwner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEqOwner() {
        return isEqOwner;
    }

    /**
     * Define el valor de la propiedad isEqOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEqOwner(String value) {
        this.isEqOwner = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultEdoNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultEdoNbr() {
        return defaultEdoNbr;
    }

    /**
     * Define el valor de la propiedad defaultEdoNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultEdoNbr(String value) {
        this.defaultEdoNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad lineId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Define el valor de la propiedad lineId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link TTruckStatus }
     *     
     */
    public TTruckStatus getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link TTruckStatus }
     *     
     */
    public void setStatus(TTruckStatus value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad guaranteeLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeLimit() {
        return guaranteeLimit;
    }

    /**
     * Define el valor de la propiedad guaranteeLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeLimit(String value) {
        this.guaranteeLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad isExamSiteCarrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsExamSiteCarrier() {
        return isExamSiteCarrier;
    }

    /**
     * Define el valor de la propiedad isExamSiteCarrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsExamSiteCarrier(String value) {
        this.isExamSiteCarrier = value;
    }

    /**
     * Obtiene el valor de la propiedad isSeizedCargoCarrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSeizedCargoCarrier() {
        return isSeizedCargoCarrier;
    }

    /**
     * Define el valor de la propiedad isSeizedCargoCarrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSeizedCargoCarrier(String value) {
        this.isSeizedCargoCarrier = value;
    }

    /**
     * Obtiene el valor de la propiedad examAuthorizationExpires.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExamAuthorizationExpires() {
        return examAuthorizationExpires;
    }

    /**
     * Define el valor de la propiedad examAuthorizationExpires.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExamAuthorizationExpires(XMLGregorianCalendar value) {
        this.examAuthorizationExpires = value;
    }

    /**
     * Obtiene el valor de la propiedad seizedCargoAuthorizationExpires.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeizedCargoAuthorizationExpires() {
        return seizedCargoAuthorizationExpires;
    }

    /**
     * Define el valor de la propiedad seizedCargoAuthorizationExpires.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeizedCargoAuthorizationExpires(XMLGregorianCalendar value) {
        this.seizedCargoAuthorizationExpires = value;
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
     *         &lt;element name="driver" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="license-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="card-id" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @XmlType(name = "", propOrder = {
        "driver"
    })
    public static class Drivers {

        protected List<TTruckingCompany.Drivers.Driver> driver;
        @XmlAttribute(name = "update-mode")
        protected TUpdateMode updateMode;

        /**
         * Gets the value of the driver property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the driver property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDriver().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TTruckingCompany.Drivers.Driver }
         * 
         * 
         */
        public List<TTruckingCompany.Drivers.Driver> getDriver() {
            if (driver == null) {
                driver = new ArrayList<TTruckingCompany.Drivers.Driver>();
            }
            return this.driver;
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
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="license-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="card-id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Driver {

            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "license-nbr")
            protected String licenseNbr;
            @XmlAttribute(name = "card-id")
            protected String cardId;

            /**
             * Obtiene el valor de la propiedad name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad licenseNbr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLicenseNbr() {
                return licenseNbr;
            }

            /**
             * Define el valor de la propiedad licenseNbr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLicenseNbr(String value) {
                this.licenseNbr = value;
            }

            /**
             * Obtiene el valor de la propiedad cardId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardId() {
                return cardId;
            }

            /**
             * Define el valor de la propiedad cardId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardId(String value) {
                this.cardId = value;
            }

        }

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
     *         &lt;element name="group" type="{http://www.navis.com/argo}tGroup" maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "group"
    })
    public static class Groups {

        protected List<TGroup> group;
        @XmlAttribute(name = "update-mode")
        protected TUpdateMode updateMode;

        /**
         * Gets the value of the group property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the group property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TGroup }
         * 
         * 
         */
        public List<TGroup> getGroup() {
            if (group == null) {
                group = new ArrayList<TGroup>();
            }
            return this.group;
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
     *         &lt;element name="line-agreement" type="{http://www.navis.com/argo}tLineAgreement" maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "lineAgreement"
    })
    public static class LineAgreements {

        @XmlElement(name = "line-agreement")
        protected List<TLineAgreement> lineAgreement;
        @XmlAttribute(name = "update-mode")
        protected TUpdateMode updateMode;

        /**
         * Gets the value of the lineAgreement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineAgreement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineAgreement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TLineAgreement }
         * 
         * 
         */
        public List<TLineAgreement> getLineAgreement() {
            if (lineAgreement == null) {
                lineAgreement = new ArrayList<TLineAgreement>();
            }
            return this.lineAgreement;
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

    }

}
