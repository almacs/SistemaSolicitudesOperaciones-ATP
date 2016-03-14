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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ScanType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ScanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="external-console-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
 *         &lt;element name="driver" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="card-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="license-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="scale-weight" type="{http://www.navis.com/argo}ScaleWeightType"/>
 *           &lt;element name="scale-weight-lb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="scale-weight-kg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;/choice>
 *         &lt;element name="appointment-nbrs" type="{http://www.navis.com/argo}AppointmentNbrs" minOccurs="0"/>
 *         &lt;element name="equipment" type="{http://www.navis.com/argo}EquipmentListType" minOccurs="0"/>
 *         &lt;element name="images" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="image" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *       &lt;attribute name="scan-set-id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="scan-status" type="{http://www.navis.com/argo}ScanStatusType" default="0" />
 *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanType", propOrder = {
    "gateId",
    "stageId",
    "laneId",
    "externalConsoleId",
    "truck",
    "driver",
    "truckVisit",
    "scaleWeight",
    "scaleWeightLb",
    "scaleWeightKg",
    "appointmentNbrs",
    "equipment",
    "images",
    "timestamp"
})
@XmlSeeAlso({
    com.navis.argo.GateWebserviceRequestType.ProcessTruck.class
})
public class ScanType {

    @XmlElement(name = "gate-id")
    protected String gateId;
    @XmlElement(name = "stage-id", required = true)
    protected String stageId;
    @XmlElement(name = "lane-id")
    protected String laneId;
    @XmlElement(name = "external-console-id")
    protected String externalConsoleId;
    protected TruckType truck;
    protected ScanType.Driver driver;
    @XmlElement(name = "truck-visit")
    protected TruckVisitRequestType truckVisit;
    @XmlElement(name = "scale-weight")
    protected ScaleWeightType scaleWeight;
    @XmlElement(name = "scale-weight-lb")
    protected Integer scaleWeightLb;
    @XmlElement(name = "scale-weight-kg")
    protected Integer scaleWeightKg;
    @XmlElement(name = "appointment-nbrs")
    protected AppointmentNbrs appointmentNbrs;
    protected EquipmentListType equipment;
    protected ScanType.Images images;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "scan-set-id")
    protected Long scanSetId;
    @XmlAttribute(name = "scan-status")
    protected Integer scanStatus;
    @XmlAttribute(name = "content")
    protected String content;

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
     * Obtiene el valor de la propiedad stageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageId() {
        return stageId;
    }

    /**
     * Define el valor de la propiedad stageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageId(String value) {
        this.stageId = value;
    }

    /**
     * Obtiene el valor de la propiedad laneId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaneId() {
        return laneId;
    }

    /**
     * Define el valor de la propiedad laneId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaneId(String value) {
        this.laneId = value;
    }

    /**
     * Obtiene el valor de la propiedad externalConsoleId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalConsoleId() {
        return externalConsoleId;
    }

    /**
     * Define el valor de la propiedad externalConsoleId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalConsoleId(String value) {
        this.externalConsoleId = value;
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
     * Obtiene el valor de la propiedad driver.
     * 
     * @return
     *     possible object is
     *     {@link ScanType.Driver }
     *     
     */
    public ScanType.Driver getDriver() {
        return driver;
    }

    /**
     * Define el valor de la propiedad driver.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanType.Driver }
     *     
     */
    public void setDriver(ScanType.Driver value) {
        this.driver = value;
    }

    /**
     * Obtiene el valor de la propiedad truckVisit.
     * 
     * @return
     *     possible object is
     *     {@link TruckVisitRequestType }
     *     
     */
    public TruckVisitRequestType getTruckVisit() {
        return truckVisit;
    }

    /**
     * Define el valor de la propiedad truckVisit.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckVisitRequestType }
     *     
     */
    public void setTruckVisit(TruckVisitRequestType value) {
        this.truckVisit = value;
    }

    /**
     * Obtiene el valor de la propiedad scaleWeight.
     * 
     * @return
     *     possible object is
     *     {@link ScaleWeightType }
     *     
     */
    public ScaleWeightType getScaleWeight() {
        return scaleWeight;
    }

    /**
     * Define el valor de la propiedad scaleWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleWeightType }
     *     
     */
    public void setScaleWeight(ScaleWeightType value) {
        this.scaleWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad scaleWeightLb.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScaleWeightLb() {
        return scaleWeightLb;
    }

    /**
     * Define el valor de la propiedad scaleWeightLb.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScaleWeightLb(Integer value) {
        this.scaleWeightLb = value;
    }

    /**
     * Obtiene el valor de la propiedad scaleWeightKg.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScaleWeightKg() {
        return scaleWeightKg;
    }

    /**
     * Define el valor de la propiedad scaleWeightKg.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScaleWeightKg(Integer value) {
        this.scaleWeightKg = value;
    }

    /**
     * Obtiene el valor de la propiedad appointmentNbrs.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentNbrs }
     *     
     */
    public AppointmentNbrs getAppointmentNbrs() {
        return appointmentNbrs;
    }

    /**
     * Define el valor de la propiedad appointmentNbrs.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentNbrs }
     *     
     */
    public void setAppointmentNbrs(AppointmentNbrs value) {
        this.appointmentNbrs = value;
    }

    /**
     * Obtiene el valor de la propiedad equipment.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentListType }
     *     
     */
    public EquipmentListType getEquipment() {
        return equipment;
    }

    /**
     * Define el valor de la propiedad equipment.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentListType }
     *     
     */
    public void setEquipment(EquipmentListType value) {
        this.equipment = value;
    }

    /**
     * Obtiene el valor de la propiedad images.
     * 
     * @return
     *     possible object is
     *     {@link ScanType.Images }
     *     
     */
    public ScanType.Images getImages() {
        return images;
    }

    /**
     * Define el valor de la propiedad images.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanType.Images }
     *     
     */
    public void setImages(ScanType.Images value) {
        this.images = value;
    }

    /**
     * Obtiene el valor de la propiedad timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Define el valor de la propiedad timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad scanSetId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScanSetId() {
        return scanSetId;
    }

    /**
     * Define el valor de la propiedad scanSetId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScanSetId(Long value) {
        this.scanSetId = value;
    }

    /**
     * Obtiene el valor de la propiedad scanStatus.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getScanStatus() {
        if (scanStatus == null) {
            return  0;
        } else {
            return scanStatus;
        }
    }

    /**
     * Define el valor de la propiedad scanStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScanStatus(Integer value) {
        this.scanStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad content.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        if (content == null) {
            return "default";
        } else {
            return content;
        }
    }

    /**
     * Define el valor de la propiedad content.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
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
     *       &lt;attribute name="card-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="license-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
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

        @XmlAttribute(name = "card-id")
        protected String cardId;
        @XmlAttribute(name = "license-nbr")
        protected String licenseNbr;

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
     *         &lt;element name="image" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "image"
    })
    public static class Images {

        protected List<ScanType.Images.Image> image;

        /**
         * Gets the value of the image property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the image property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ScanType.Images.Image }
         * 
         * 
         */
        public List<ScanType.Images.Image> getImage() {
            if (image == null) {
                image = new ArrayList<ScanType.Images.Image>();
            }
            return this.image;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Image {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id", required = true)
            protected String id;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
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

        }

    }

}
