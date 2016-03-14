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
 * <p>Clase Java para GateAppointmentResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GateAppointmentResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appointment-nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slot" type="{http://www.navis.com/argo}SlotType" minOccurs="0"/>
 *         &lt;element name="available-slots" type="{http://www.navis.com/argo}SlotType" minOccurs="0"/>
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
 *         &lt;element name="tran-type" minOccurs="0">
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
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="appointment" type="{http://www.navis.com/argo}AppointmentResponseType" minOccurs="0"/>
 *         &lt;element name="container" type="{http://www.navis.com/argo}ContainerType" minOccurs="0"/>
 *         &lt;element name="chassis" type="{http://www.navis.com/argo}ChassisType" minOccurs="0"/>
 *         &lt;element name="import-release-nbr" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
 *         &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
 *         &lt;element name="external-ref-nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messages" type="{http://www.navis.com/argo}MessagesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GateAppointmentResponseType", propOrder = {
    "gateId",
    "appointmentNbr",
    "slot",
    "availableSlots",
    "booking",
    "tranType",
    "appointment",
    "container",
    "chassis",
    "importReleaseNbr",
    "driver",
    "truck",
    "externalRefNbr",
    "messages"
})
public class GateAppointmentResponseType {

    @XmlElement(name = "gate-id", required = true)
    protected String gateId;
    @XmlElement(name = "appointment-nbr")
    protected String appointmentNbr;
    protected SlotType slot;
    @XmlElement(name = "available-slots")
    protected List<SlotType> availableSlots;
    protected GateAppointmentResponseType.Booking booking;
    @XmlElement(name = "tran-type")
    protected String tranType;
    protected AppointmentResponseType appointment;
    protected ContainerType container;
    protected ChassisType chassis;
    @XmlElement(name = "import-release-nbr")
    protected Object importReleaseNbr;
    protected DriverType driver;
    protected TruckType truck;
    @XmlElement(name = "external-ref-nbr")
    protected String externalRefNbr;
    protected List<MessagesType> messages;

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
     * Obtiene el valor de la propiedad appointmentNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentNbr() {
        return appointmentNbr;
    }

    /**
     * Define el valor de la propiedad appointmentNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentNbr(String value) {
        this.appointmentNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad slot.
     * 
     * @return
     *     possible object is
     *     {@link SlotType }
     *     
     */
    public SlotType getSlot() {
        return slot;
    }

    /**
     * Define el valor de la propiedad slot.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotType }
     *     
     */
    public void setSlot(SlotType value) {
        this.slot = value;
    }

    /**
     * Obtiene el valor de la propiedad availableSlots.
     * 
     * @return
     *     possible object is
     *     {@link SlotType }
     *     
     */
    public List<SlotType> getAvailableSlots() {
        return availableSlots;
    }

    /**
     * Define el valor de la propiedad availableSlots.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotType }
     *     
     */
    public void setAvailableSlots(SlotType value) {
    	if (this.availableSlots == null)
    		this.availableSlots = new ArrayList<SlotType>();

        this.availableSlots.add(value);
    }

    /**
     * Obtiene el valor de la propiedad booking.
     * 
     * @return
     *     possible object is
     *     {@link GateAppointmentResponseType.Booking }
     *     
     */
    public GateAppointmentResponseType.Booking getBooking() {
        return booking;
    }

    /**
     * Define el valor de la propiedad booking.
     * 
     * @param value
     *     allowed object is
     *     {@link GateAppointmentResponseType.Booking }
     *     
     */
    public void setBooking(GateAppointmentResponseType.Booking value) {
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
     *     {@link AppointmentResponseType }
     *     
     */
    public AppointmentResponseType getAppointment() {
        return appointment;
    }

    /**
     * Define el valor de la propiedad appointment.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentResponseType }
     *     
     */
    public void setAppointment(AppointmentResponseType value) {
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
     * Obtiene el valor de la propiedad driver.
     * 
     * @return
     *     possible object is
     *     {@link DriverType }
     *     
     */
    public DriverType getDriver() {
        return driver;
    }

    /**
     * Define el valor de la propiedad driver.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverType }
     *     
     */
    public void setDriver(DriverType value) {
        this.driver = value;
    }

    /**
     * Obtiene el valor de la propiedad truck.
     * 
     * @return
     *     possible object is
     *     {@link TruckType }
     *     
     */
    public TruckType getTruck() {
        return truck;
    }

    /**
     * Define el valor de la propiedad truck.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckType }
     *     
     */
    public void setTruck(TruckType value) {
        this.truck = value;
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
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessagesType }
     * 
     * 
     */
    public List<MessagesType> getMessages() {
        if (messages == null) {
            messages = new ArrayList<MessagesType>();
        }
        return this.messages;
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
