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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                 This element AppointmentRequestBaseType is used in both the create/update truck visit appointment and
 *                 cancel appointment requests. Not all attributes/elements are being used in both the requests. In Cancel Appointment requests
 *                 only the attributes appointment-nbr and external-ref-nbr is used and whereas in create/update truck visit appointment requests the
 *                 container element with only truck position and door direction is being used(now). Support to other elements may be provided
 *                 in the future.
 *             
 * 
 * <p>Clase Java para AppointmentRequestBaseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AppointmentRequestBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="container" type="{http://www.navis.com/argo}ContainerType" minOccurs="0"/>
 *         &lt;element name="chassis" type="{http://www.navis.com/argo}ChassisType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="appointment-nbr" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="external-ref-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentRequestBaseType", propOrder = {
    "booking",
    "container",
    "chassis"
})
@XmlSeeAlso({
    AppointmentResponseBaseType.class
})
public class AppointmentRequestBaseType {

    protected AppointmentRequestBaseType.Booking booking;
    protected ContainerType container;
    protected ChassisType chassis;
    @XmlAttribute(name = "appointment-nbr")
    protected Long appointmentNbr;
    @XmlAttribute(name = "external-ref-nbr")
    protected String externalRefNbr;

    /**
     * Obtiene el valor de la propiedad booking.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentRequestBaseType.Booking }
     *     
     */
    public AppointmentRequestBaseType.Booking getBooking() {
        return booking;
    }

    /**
     * Define el valor de la propiedad booking.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentRequestBaseType.Booking }
     *     
     */
    public void setBooking(AppointmentRequestBaseType.Booking value) {
        this.booking = value;
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
     * Obtiene el valor de la propiedad appointmentNbr.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAppointmentNbr() {
        return appointmentNbr;
    }

    /**
     * Define el valor de la propiedad appointmentNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAppointmentNbr(Long value) {
        this.appointmentNbr = value;
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
