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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para GateAppointmentRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GateAppointmentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appointment-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="appointment-time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driver" type="{http://www.navis.com/argo}DriverBaseRequestType" minOccurs="0"/>
 *         &lt;element name="truck" type="{http://www.navis.com/argo}TruckBaseRequestType" minOccurs="0"/>
 *         &lt;element name="booking" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="booking-nbr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="freight-kind" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="train-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="train-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tran-type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="RE"/>
 *               &lt;enumeration value="RI"/>
 *               &lt;enumeration value="RM"/>
 *               &lt;enumeration value="RC"/>
 *               &lt;enumeration value="RB"/>
 *               &lt;enumeration value="DE"/>
 *               &lt;enumeration value="DI"/>
 *               &lt;enumeration value="DM"/>
 *               &lt;enumeration value="DC"/>
 *               &lt;enumeration value="TC"/>
 *               &lt;enumeration value="UK"/>
 *               &lt;enumeration value="PUC"/>
 *               &lt;enumeration value="PUE"/>
 *               &lt;enumeration value="PUI"/>
 *               &lt;enumeration value="PUM"/>
 *               &lt;enumeration value="DOC"/>
 *               &lt;enumeration value="DOE"/>
 *               &lt;enumeration value="DOI"/>
 *               &lt;enumeration value="DOM"/>
 *               &lt;enumeration value="DOF"/>
 *               &lt;enumeration value="PUF"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="appointment" type="{http://www.navis.com/argo}AppointmentRequestType" minOccurs="0"/>
 *         &lt;element name="container" type="{http://www.navis.com/argo}ContainerType" minOccurs="0"/>
 *         &lt;element name="chassis" type="{http://www.navis.com/argo}ChassisType" minOccurs="0"/>
 *         &lt;element name="import-release-nbr" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="external-ref-nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin-nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GateAppointmentRequestType", propOrder = {
    "appointmentDate",
    "appointmentTime",
    "gateId",
    "driver",
    "truck",
    "booking",
    "tranType",
    "appointment",
    "container",
    "chassis",
    "importReleaseNbr",
    "externalRefNbr",
    "pinNbr"
})
@XmlSeeAlso({
    com.navis.argo.GateWebserviceRequestType.CreateAppointment.class,
    com.navis.argo.GateWebserviceRequestType.UpdateAppointment.class
})
public class GateAppointmentRequestType {

    @XmlElement(name = "appointment-date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar appointmentDate;
    @XmlElement(name = "appointment-time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar appointmentTime;
    @XmlElement(name = "gate-id", required = true)
    protected String gateId;
    protected DriverBaseRequestType driver;
    protected TruckBaseRequestType truck;
    protected GateAppointmentRequestType.Booking booking;
    @XmlElement(name = "tran-type", required = true)
    protected String tranType;
    protected AppointmentRequestType appointment;
    protected ContainerType container;
    protected ChassisType chassis;
    @XmlElement(name = "import-release-nbr")
    protected Object importReleaseNbr;
    @XmlElement(name = "external-ref-nbr")
    protected String externalRefNbr;
    @XmlElement(name = "pin-nbr")
    protected String pinNbr;

    /**
     * Obtiene el valor de la propiedad appointmentDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Define el valor de la propiedad appointmentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentDate(XMLGregorianCalendar value) {
        this.appointmentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad appointmentTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * Define el valor de la propiedad appointmentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentTime(XMLGregorianCalendar value) {
        this.appointmentTime = value;
    }

    /**
     * Obtiene el valor de la propiedad gateId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateId() {
        return gateId;
    }

    /**
     * Define el valor de la propiedad gateId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateId(String value) {
        this.gateId = value;
    }

    /**
     * Obtiene el valor de la propiedad driver.
     * 
     * @return
     *     possible object is
     *     {@link DriverBaseRequestType }
     *     
     */
    public DriverBaseRequestType getDriver() {
        return driver;
    }

    /**
     * Define el valor de la propiedad driver.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverBaseRequestType }
     *     
     */
    public void setDriver(DriverBaseRequestType value) {
        this.driver = value;
    }

    /**
     * Obtiene el valor de la propiedad truck.
     * 
     * @return
     *     possible object is
     *     {@link TruckBaseRequestType }
     *     
     */
    public TruckBaseRequestType getTruck() {
        return truck;
    }

    /**
     * Define el valor de la propiedad truck.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckBaseRequestType }
     *     
     */
    public void setTruck(TruckBaseRequestType value) {
        this.truck = value;
    }

    /**
     * Obtiene el valor de la propiedad booking.
     * 
     * @return
     *     possible object is
     *     {@link GateAppointmentRequestType.Booking }
     *     
     */
    public GateAppointmentRequestType.Booking getBooking() {
        return booking;
    }

    /**
     * Define el valor de la propiedad booking.
     * 
     * @param value
     *     allowed object is
     *     {@link GateAppointmentRequestType.Booking }
     *     
     */
    public void setBooking(GateAppointmentRequestType.Booking value) {
        this.booking = value;
    }

    /**
     * Obtiene el valor de la propiedad tranType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranType() {
        return tranType;
    }

    /**
     * Define el valor de la propiedad tranType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranType(String value) {
        this.tranType = value;
    }

    /**
     * Obtiene el valor de la propiedad appointment.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentRequestType }
     *     
     */
    public AppointmentRequestType getAppointment() {
        return appointment;
    }

    /**
     * Define el valor de la propiedad appointment.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentRequestType }
     *     
     */
    public void setAppointment(AppointmentRequestType value) {
        this.appointment = value;
    }

    /**
     * Obtiene el valor de la propiedad container.
     * 
     * @return
     *     possible object is
     *     {@link ContainerType }
     *     
     */
    public ContainerType getContainer() {
        return container;
    }

    /**
     * Define el valor de la propiedad container.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerType }
     *     
     */
    public void setContainer(ContainerType value) {
        this.container = value;
    }

    /**
     * Obtiene el valor de la propiedad chassis.
     * 
     * @return
     *     possible object is
     *     {@link ChassisType }
     *     
     */
    public ChassisType getChassis() {
        return chassis;
    }

    /**
     * Define el valor de la propiedad chassis.
     * 
     * @param value
     *     allowed object is
     *     {@link ChassisType }
     *     
     */
    public void setChassis(ChassisType value) {
        this.chassis = value;
    }

    /**
     * Obtiene el valor de la propiedad importReleaseNbr.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getImportReleaseNbr() {
        return importReleaseNbr;
    }

    /**
     * Define el valor de la propiedad importReleaseNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setImportReleaseNbr(Object value) {
        this.importReleaseNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad externalRefNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRefNbr() {
        return externalRefNbr;
    }

    /**
     * Define el valor de la propiedad externalRefNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRefNbr(String value) {
        this.externalRefNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad pinNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinNbr() {
        return pinNbr;
    }

    /**
     * Define el valor de la propiedad pinNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinNbr(String value) {
        this.pinNbr = value;
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
     *       &lt;attribute name="booking-nbr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="freight-kind" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="train-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="train-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Booking {

        @XmlAttribute(name = "booking-nbr")
        @XmlSchemaType(name = "anySimpleType")
        protected String bookingNbr;
        @XmlAttribute(name = "line")
        @XmlSchemaType(name = "anySimpleType")
        protected String line;
        @XmlAttribute(name = "freight-kind")
        @XmlSchemaType(name = "anySimpleType")
        protected String freightKind;
        @XmlAttribute(name = "train-id")
        @XmlSchemaType(name = "anySimpleType")
        protected String trainId;
        @XmlAttribute(name = "train-date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar trainDate;
        
        /**
         * Obtiene el valor de la propiedad bookingNbr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingNbr() {
            return bookingNbr;
        }

        /**
         * Define el valor de la propiedad bookingNbr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingNbr(String value) {
            this.bookingNbr = value;
        }

        /**
         * Obtiene el valor de la propiedad line.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine() {
            return line;
        }

        /**
         * Define el valor de la propiedad line.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine(String value) {
            this.line = value;
        }

        /**
         * Obtiene el valor de la propiedad freightKind.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFreightKind() {
            return freightKind;
        }

        /**
         * Define el valor de la propiedad freightKind.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFreightKind(String value) {
            this.freightKind = value;
        }

        /**
         * Obtiene el valor de la propiedad trainId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrainId() {
            return trainId;
        }

        /**
         * Define el valor de la propiedad trainId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrainId(String value) {
            this.trainId = value;
        }

        /**
         * Obtiene el valor de la propiedad trainDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTrainDate() {
            return trainDate;
        }

        /**
         * Define el valor de la propiedad trainDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTrainDate(XMLGregorianCalendar value) {
            this.trainDate = value;
        }
        
    }

}
