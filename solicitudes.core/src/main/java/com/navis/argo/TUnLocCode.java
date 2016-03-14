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
 * Un Locations
 * 
 * <p>Clase Java para tUnLocCode complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tUnLocCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="is-airport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="is-port" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="is-rail-terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="is-road-terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="miscellaneous" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="is-multimodal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="is-border-crossing" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="is-fixed-transport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="is-function-unknown" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="compass" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="latitude-nor-s" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="longitude-eor-w" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="place-code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="place-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sub-division-code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life-cycle-state" type="{http://www.navis.com/argo}tLifeCycleStateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUnLocCode", propOrder = {
    "category",
    "miscellaneous",
    "compass"
})
public class TUnLocCode {

    protected TUnLocCode.Category category;
    protected TUnLocCode.Miscellaneous miscellaneous;
    protected TUnLocCode.Compass compass;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "place-code", required = true)
    protected String placeCode;
    @XmlAttribute(name = "place-name", required = true)
    protected String placeName;
    @XmlAttribute(name = "status", required = true)
    protected String status;
    @XmlAttribute(name = "country")
    protected String country;
    @XmlAttribute(name = "sub-division-code")
    protected String subDivisionCode;
    @XmlAttribute(name = "remarks")
    protected String remarks;
    @XmlAttribute(name = "life-cycle-state")
    protected TLifeCycleStateType lifeCycleState;

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link TUnLocCode.Category }
     *     
     */
    public TUnLocCode.Category getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnLocCode.Category }
     *     
     */
    public void setCategory(TUnLocCode.Category value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad miscellaneous.
     * 
     * @return
     *     possible object is
     *     {@link TUnLocCode.Miscellaneous }
     *     
     */
    public TUnLocCode.Miscellaneous getMiscellaneous() {
        return miscellaneous;
    }

    /**
     * Define el valor de la propiedad miscellaneous.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnLocCode.Miscellaneous }
     *     
     */
    public void setMiscellaneous(TUnLocCode.Miscellaneous value) {
        this.miscellaneous = value;
    }

    /**
     * Obtiene el valor de la propiedad compass.
     * 
     * @return
     *     possible object is
     *     {@link TUnLocCode.Compass }
     *     
     */
    public TUnLocCode.Compass getCompass() {
        return compass;
    }

    /**
     * Define el valor de la propiedad compass.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnLocCode.Compass }
     *     
     */
    public void setCompass(TUnLocCode.Compass value) {
        this.compass = value;
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
     * Obtiene el valor de la propiedad placeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceCode() {
        return placeCode;
    }

    /**
     * Define el valor de la propiedad placeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceCode(String value) {
        this.placeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad placeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Define el valor de la propiedad placeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad subDivisionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDivisionCode() {
        return subDivisionCode;
    }

    /**
     * Define el valor de la propiedad subDivisionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDivisionCode(String value) {
        this.subDivisionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad remarks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Define el valor de la propiedad remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
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
     *       &lt;attribute name="is-airport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="is-port" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="is-rail-terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="is-road-terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Category {

        @XmlAttribute(name = "is-airport")
        protected String isAirport;
        @XmlAttribute(name = "is-port")
        protected String isPort;
        @XmlAttribute(name = "is-rail-terminal")
        protected String isRailTerminal;
        @XmlAttribute(name = "is-road-terminal")
        protected String isRoadTerminal;

        /**
         * Obtiene el valor de la propiedad isAirport.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsAirport() {
            return isAirport;
        }

        /**
         * Define el valor de la propiedad isAirport.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsAirport(String value) {
            this.isAirport = value;
        }

        /**
         * Obtiene el valor de la propiedad isPort.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsPort() {
            return isPort;
        }

        /**
         * Define el valor de la propiedad isPort.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsPort(String value) {
            this.isPort = value;
        }

        /**
         * Obtiene el valor de la propiedad isRailTerminal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsRailTerminal() {
            return isRailTerminal;
        }

        /**
         * Define el valor de la propiedad isRailTerminal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsRailTerminal(String value) {
            this.isRailTerminal = value;
        }

        /**
         * Obtiene el valor de la propiedad isRoadTerminal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsRoadTerminal() {
            return isRoadTerminal;
        }

        /**
         * Define el valor de la propiedad isRoadTerminal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsRoadTerminal(String value) {
            this.isRoadTerminal = value;
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
     *       &lt;attribute name="latitude-nor-s" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="longitude-eor-w" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Compass {

        @XmlAttribute(name = "latitude-nor-s", required = true)
        protected String latitudeNorS;
        @XmlAttribute(name = "longitude-eor-w", required = true)
        protected String longitudeEorW;
        @XmlAttribute(name = "latitude")
        protected String latitude;
        @XmlAttribute(name = "longitude")
        protected String longitude;

        /**
         * Obtiene el valor de la propiedad latitudeNorS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitudeNorS() {
            return latitudeNorS;
        }

        /**
         * Define el valor de la propiedad latitudeNorS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitudeNorS(String value) {
            this.latitudeNorS = value;
        }

        /**
         * Obtiene el valor de la propiedad longitudeEorW.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitudeEorW() {
            return longitudeEorW;
        }

        /**
         * Define el valor de la propiedad longitudeEorW.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitudeEorW(String value) {
            this.longitudeEorW = value;
        }

        /**
         * Obtiene el valor de la propiedad latitude.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Define el valor de la propiedad latitude.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Obtiene el valor de la propiedad longitude.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Define el valor de la propiedad longitude.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
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
     *       &lt;attribute name="is-multimodal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="is-border-crossing" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="is-fixed-transport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="is-function-unknown" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Miscellaneous {

        @XmlAttribute(name = "is-multimodal")
        protected String isMultimodal;
        @XmlAttribute(name = "is-border-crossing")
        protected String isBorderCrossing;
        @XmlAttribute(name = "is-fixed-transport")
        protected String isFixedTransport;
        @XmlAttribute(name = "is-function-unknown")
        protected String isFunctionUnknown;

        /**
         * Obtiene el valor de la propiedad isMultimodal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsMultimodal() {
            return isMultimodal;
        }

        /**
         * Define el valor de la propiedad isMultimodal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsMultimodal(String value) {
            this.isMultimodal = value;
        }

        /**
         * Obtiene el valor de la propiedad isBorderCrossing.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsBorderCrossing() {
            return isBorderCrossing;
        }

        /**
         * Define el valor de la propiedad isBorderCrossing.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsBorderCrossing(String value) {
            this.isBorderCrossing = value;
        }

        /**
         * Obtiene el valor de la propiedad isFixedTransport.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsFixedTransport() {
            return isFixedTransport;
        }

        /**
         * Define el valor de la propiedad isFixedTransport.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsFixedTransport(String value) {
            this.isFixedTransport = value;
        }

        /**
         * Obtiene el valor de la propiedad isFunctionUnknown.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsFunctionUnknown() {
            return isFunctionUnknown;
        }

        /**
         * Define el valor de la propiedad isFunctionUnknown.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsFunctionUnknown(String value) {
            this.isFunctionUnknown = value;
        }

    }

}
