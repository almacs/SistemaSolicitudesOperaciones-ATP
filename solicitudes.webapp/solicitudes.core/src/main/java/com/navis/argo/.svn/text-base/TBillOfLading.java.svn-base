//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A shipment from shipper to consignee being shipped together over the
 *                 same route.
 *             
 * 
 * <p>Clase Java para tBillOfLading complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tBillOfLading">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="items" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reefer" type="{http://www.navis.com/argo}tReeferRequirements" minOccurs="0"/>
 *                             &lt;element name="cargo-lots" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cargo-lot" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="unit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                               &lt;attribute name="unit-key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="quantity-manifiested" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="quantity-discrepency" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                               &lt;attribute name="brand" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                               &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                               &lt;attribute name="model" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="update-mode" type="{http://www.navis.com/argo}tUpdateMode" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="bulk-unit">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="GALLON"/>
 *                                 &lt;enumeration value="LITER"/>
 *                                 &lt;enumeration value="CUBICMETER"/>
 *                                 &lt;enumeration value="KG"/>
 *                                 &lt;enumeration value="MT"/>
 *                                 &lt;enumeration value="SHORTTON"/>
 *                                 &lt;enumeration value="LONGTON"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="commodity-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                           &lt;attribute name="is-bulk" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="package-type" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                           &lt;attribute name="package-length-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="package-width-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="package-height-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="package-weight-kg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="piece-quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="piece-is-bulk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="piece-bulk-unit">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="GALLON"/>
 *                                 &lt;enumeration value="LITER"/>
 *                                 &lt;enumeration value="CUBICMETER"/>
 *                                 &lt;enumeration value="KG"/>
 *                                 &lt;enumeration value="MT"/>
 *                                 &lt;enumeration value="SHORTTON"/>
 *                                 &lt;enumeration value="LONGTON"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="piece-package-type" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                           &lt;attribute name="piece-length-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="piece-width-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="piece-height-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="piece-weight-kg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="product-type" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
 *         &lt;element name="goods-bl" maxOccurs="unbounded" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="unit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="unit-key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="nbr" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="line" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="carrier-visit" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="category" type="{http://www.navis.com/argo}tCategory" />
 *       &lt;attribute name="consignee-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="consignee-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shipper-id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="shipper-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="origin" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="destination" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="pol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pod-1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pod-2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bonded-destination" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="bond-trucking-company" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="manifested-quantity" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="agent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBillOfLading", propOrder = {
    "items",
    "goodsBl"
})
public class TBillOfLading {

    protected TBillOfLading.Items items;
    @XmlElement(name = "goods-bl")
    protected List<TBillOfLading.GoodsBl> goodsBl;
    @XmlAttribute(name = "nbr", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String nbr;
    @XmlAttribute(name = "line", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String line;
    @XmlAttribute(name = "carrier-visit", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String carrierVisit;
    @XmlAttribute(name = "category")
    protected TCategory category;
    @XmlAttribute(name = "consignee-id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String consigneeId;
    @XmlAttribute(name = "consignee-name")
    protected String consigneeName;
    @XmlAttribute(name = "shipper-id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String shipperId;
    @XmlAttribute(name = "shipper-name")
    protected String shipperName;
    @XmlAttribute(name = "origin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String origin;
    @XmlAttribute(name = "destination")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String destination;
    @XmlAttribute(name = "pol")
    protected String pol;
    @XmlAttribute(name = "pod-1")
    protected String pod1;
    @XmlAttribute(name = "pod-2")
    protected String pod2;
    @XmlAttribute(name = "bonded-destination")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String bondedDestination;
    @XmlAttribute(name = "bond-trucking-company")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String bondTruckingCompany;
    @XmlAttribute(name = "notes")
    @XmlSchemaType(name = "anySimpleType")
    protected String notes;
    @XmlAttribute(name = "manifested-quantity")
    protected Long manifestedQuantity;
    @XmlAttribute(name = "agent")
    protected String agent;

    /**
     * Obtiene el valor de la propiedad items.
     * 
     * @return
     *     possible object is
     *     {@link TBillOfLading.Items }
     *     
     */
    public TBillOfLading.Items getItems() {
        return items;
    }

    /**
     * Define el valor de la propiedad items.
     * 
     * @param value
     *     allowed object is
     *     {@link TBillOfLading.Items }
     *     
     */
    public void setItems(TBillOfLading.Items value) {
        this.items = value;
    }

    /**
     * Gets the value of the goodsBl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsBl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsBl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TBillOfLading.GoodsBl }
     * 
     * 
     */
    public List<TBillOfLading.GoodsBl> getGoodsBl() {
        if (goodsBl == null) {
            goodsBl = new ArrayList<TBillOfLading.GoodsBl>();
        }
        return this.goodsBl;
    }

    /**
     * Obtiene el valor de la propiedad nbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbr() {
        return nbr;
    }

    /**
     * Define el valor de la propiedad nbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbr(String value) {
        this.nbr = value;
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
     * Obtiene el valor de la propiedad carrierVisit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierVisit() {
        return carrierVisit;
    }

    /**
     * Define el valor de la propiedad carrierVisit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierVisit(String value) {
        this.carrierVisit = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link TCategory }
     *     
     */
    public TCategory getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link TCategory }
     *     
     */
    public void setCategory(TCategory value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad consigneeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeId() {
        return consigneeId;
    }

    /**
     * Define el valor de la propiedad consigneeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeId(String value) {
        this.consigneeId = value;
    }

    /**
     * Obtiene el valor de la propiedad consigneeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * Define el valor de la propiedad consigneeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeName(String value) {
        this.consigneeName = value;
    }

    /**
     * Obtiene el valor de la propiedad shipperId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperId() {
        return shipperId;
    }

    /**
     * Define el valor de la propiedad shipperId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperId(String value) {
        this.shipperId = value;
    }

    /**
     * Obtiene el valor de la propiedad shipperName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperName() {
        return shipperName;
    }

    /**
     * Define el valor de la propiedad shipperName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperName(String value) {
        this.shipperName = value;
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
     * Obtiene el valor de la propiedad bondedDestination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondedDestination() {
        return bondedDestination;
    }

    /**
     * Define el valor de la propiedad bondedDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondedDestination(String value) {
        this.bondedDestination = value;
    }

    /**
     * Obtiene el valor de la propiedad bondTruckingCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondTruckingCompany() {
        return bondTruckingCompany;
    }

    /**
     * Define el valor de la propiedad bondTruckingCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondTruckingCompany(String value) {
        this.bondTruckingCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Define el valor de la propiedad notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Obtiene el valor de la propiedad manifestedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManifestedQuantity() {
        return manifestedQuantity;
    }

    /**
     * Define el valor de la propiedad manifestedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManifestedQuantity(Long value) {
        this.manifestedQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad agent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Define el valor de la propiedad agent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(String value) {
        this.agent = value;
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
     *       &lt;attribute name="unit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="unit-key" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GoodsBl {

        @XmlAttribute(name = "unit-id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String unitId;
        @XmlAttribute(name = "unit-key")
        protected String unitKey;

        /**
         * Obtiene el valor de la propiedad unitId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitId() {
            return unitId;
        }

        /**
         * Define el valor de la propiedad unitId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitId(String value) {
            this.unitId = value;
        }

        /**
         * Obtiene el valor de la propiedad unitKey.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitKey() {
            return unitKey;
        }

        /**
         * Define el valor de la propiedad unitKey.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitKey(String value) {
            this.unitKey = value;
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
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0" form="unqualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="reefer" type="{http://www.navis.com/argo}tReeferRequirements" minOccurs="0"/>
     *                   &lt;element name="cargo-lots" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cargo-lot" maxOccurs="unbounded" minOccurs="0" form="unqualified">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="unit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="unit-key" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="quantity-manifiested" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="quantity-discrepency" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="brand" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="model" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="update-mode" type="{http://www.navis.com/argo}tUpdateMode" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="bulk-unit">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="GALLON"/>
     *                       &lt;enumeration value="LITER"/>
     *                       &lt;enumeration value="CUBICMETER"/>
     *                       &lt;enumeration value="KG"/>
     *                       &lt;enumeration value="MT"/>
     *                       &lt;enumeration value="SHORTTON"/>
     *                       &lt;enumeration value="LONGTON"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="commodity-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                 &lt;attribute name="is-bulk" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="package-type" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                 &lt;attribute name="package-length-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="package-width-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="package-height-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="package-weight-kg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="piece-quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="piece-is-bulk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="piece-bulk-unit">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="GALLON"/>
     *                       &lt;enumeration value="LITER"/>
     *                       &lt;enumeration value="CUBICMETER"/>
     *                       &lt;enumeration value="KG"/>
     *                       &lt;enumeration value="MT"/>
     *                       &lt;enumeration value="SHORTTON"/>
     *                       &lt;enumeration value="LONGTON"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="piece-package-type" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                 &lt;attribute name="piece-length-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="piece-width-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="piece-height-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="piece-weight-kg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="product-type" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
        "item"
    })
    public static class Items {

        protected List<TBillOfLading.Items.Item> item;
        @XmlAttribute(name = "update-mode")
        protected TUpdateMode updateMode;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TBillOfLading.Items.Item }
         * 
         * 
         */
        public List<TBillOfLading.Items.Item> getItem() {
            if (item == null) {
                item = new ArrayList<TBillOfLading.Items.Item>();
            }
            return this.item;
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
         *       &lt;sequence>
         *         &lt;element name="reefer" type="{http://www.navis.com/argo}tReeferRequirements" minOccurs="0"/>
         *         &lt;element name="cargo-lots" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cargo-lot" maxOccurs="unbounded" minOccurs="0" form="unqualified">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="unit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="unit-key" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="quantity-manifiested" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="quantity-discrepency" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="brand" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="model" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
         *       &lt;/sequence>
         *       &lt;attribute name="bulk-unit">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="GALLON"/>
         *             &lt;enumeration value="LITER"/>
         *             &lt;enumeration value="CUBICMETER"/>
         *             &lt;enumeration value="KG"/>
         *             &lt;enumeration value="MT"/>
         *             &lt;enumeration value="SHORTTON"/>
         *             &lt;enumeration value="LONGTON"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="commodity-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *       &lt;attribute name="is-bulk" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="package-type" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *       &lt;attribute name="package-length-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="package-width-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="package-height-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="package-weight-kg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="piece-quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="piece-is-bulk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="piece-bulk-unit">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="GALLON"/>
         *             &lt;enumeration value="LITER"/>
         *             &lt;enumeration value="CUBICMETER"/>
         *             &lt;enumeration value="KG"/>
         *             &lt;enumeration value="MT"/>
         *             &lt;enumeration value="SHORTTON"/>
         *             &lt;enumeration value="LONGTON"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="piece-package-type" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *       &lt;attribute name="piece-length-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="piece-width-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="piece-height-cm" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="piece-weight-kg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="product-type" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "reefer",
            "cargoLots"
        })
        public static class Item {

            protected TReeferRequirements reefer;
            @XmlElement(name = "cargo-lots")
            protected TBillOfLading.Items.Item.CargoLots cargoLots;
            @XmlAttribute(name = "bulk-unit")
            protected String bulkUnit;
            @XmlAttribute(name = "commodity-id", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String commodityId;
            @XmlAttribute(name = "is-bulk", required = true)
            protected boolean isBulk;
            @XmlAttribute(name = "nbr")
            protected String nbr;
            @XmlAttribute(name = "quantity")
            protected BigInteger quantity;
            @XmlAttribute(name = "package-type")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String packageType;
            @XmlAttribute(name = "package-length-cm")
            protected BigInteger packageLengthCm;
            @XmlAttribute(name = "package-width-cm")
            protected BigInteger packageWidthCm;
            @XmlAttribute(name = "package-height-cm")
            protected BigInteger packageHeightCm;
            @XmlAttribute(name = "package-weight-kg")
            protected BigDecimal packageWeightKg;
            @XmlAttribute(name = "piece-quantity")
            protected BigInteger pieceQuantity;
            @XmlAttribute(name = "piece-is-bulk")
            protected Boolean pieceIsBulk;
            @XmlAttribute(name = "piece-bulk-unit")
            protected String pieceBulkUnit;
            @XmlAttribute(name = "piece-package-type")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String piecePackageType;
            @XmlAttribute(name = "piece-length-cm")
            protected BigInteger pieceLengthCm;
            @XmlAttribute(name = "piece-width-cm")
            protected BigInteger pieceWidthCm;
            @XmlAttribute(name = "piece-height-cm")
            protected BigInteger pieceHeightCm;
            @XmlAttribute(name = "piece-weight-kg")
            protected BigDecimal pieceWeightKg;
            @XmlAttribute(name = "product-type")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String productType;

            /**
             * Obtiene el valor de la propiedad reefer.
             * 
             * @return
             *     possible object is
             *     {@link TReeferRequirements }
             *     
             */
            public TReeferRequirements getReefer() {
                return reefer;
            }

            /**
             * Define el valor de la propiedad reefer.
             * 
             * @param value
             *     allowed object is
             *     {@link TReeferRequirements }
             *     
             */
            public void setReefer(TReeferRequirements value) {
                this.reefer = value;
            }

            /**
             * Obtiene el valor de la propiedad cargoLots.
             * 
             * @return
             *     possible object is
             *     {@link TBillOfLading.Items.Item.CargoLots }
             *     
             */
            public TBillOfLading.Items.Item.CargoLots getCargoLots() {
                return cargoLots;
            }

            /**
             * Define el valor de la propiedad cargoLots.
             * 
             * @param value
             *     allowed object is
             *     {@link TBillOfLading.Items.Item.CargoLots }
             *     
             */
            public void setCargoLots(TBillOfLading.Items.Item.CargoLots value) {
                this.cargoLots = value;
            }

            /**
             * Obtiene el valor de la propiedad bulkUnit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBulkUnit() {
                return bulkUnit;
            }

            /**
             * Define el valor de la propiedad bulkUnit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBulkUnit(String value) {
                this.bulkUnit = value;
            }

            /**
             * Obtiene el valor de la propiedad commodityId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommodityId() {
                return commodityId;
            }

            /**
             * Define el valor de la propiedad commodityId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommodityId(String value) {
                this.commodityId = value;
            }

            /**
             * Obtiene el valor de la propiedad isBulk.
             * 
             */
            public boolean isIsBulk() {
                return isBulk;
            }

            /**
             * Define el valor de la propiedad isBulk.
             * 
             */
            public void setIsBulk(boolean value) {
                this.isBulk = value;
            }

            /**
             * Obtiene el valor de la propiedad nbr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNbr() {
                return nbr;
            }

            /**
             * Define el valor de la propiedad nbr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNbr(String value) {
                this.nbr = value;
            }

            /**
             * Obtiene el valor de la propiedad quantity.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * Define el valor de la propiedad quantity.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

            /**
             * Obtiene el valor de la propiedad packageType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPackageType() {
                return packageType;
            }

            /**
             * Define el valor de la propiedad packageType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPackageType(String value) {
                this.packageType = value;
            }

            /**
             * Obtiene el valor de la propiedad packageLengthCm.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPackageLengthCm() {
                return packageLengthCm;
            }

            /**
             * Define el valor de la propiedad packageLengthCm.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPackageLengthCm(BigInteger value) {
                this.packageLengthCm = value;
            }

            /**
             * Obtiene el valor de la propiedad packageWidthCm.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPackageWidthCm() {
                return packageWidthCm;
            }

            /**
             * Define el valor de la propiedad packageWidthCm.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPackageWidthCm(BigInteger value) {
                this.packageWidthCm = value;
            }

            /**
             * Obtiene el valor de la propiedad packageHeightCm.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPackageHeightCm() {
                return packageHeightCm;
            }

            /**
             * Define el valor de la propiedad packageHeightCm.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPackageHeightCm(BigInteger value) {
                this.packageHeightCm = value;
            }

            /**
             * Obtiene el valor de la propiedad packageWeightKg.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPackageWeightKg() {
                return packageWeightKg;
            }

            /**
             * Define el valor de la propiedad packageWeightKg.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPackageWeightKg(BigDecimal value) {
                this.packageWeightKg = value;
            }

            /**
             * Obtiene el valor de la propiedad pieceQuantity.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPieceQuantity() {
                return pieceQuantity;
            }

            /**
             * Define el valor de la propiedad pieceQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPieceQuantity(BigInteger value) {
                this.pieceQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad pieceIsBulk.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPieceIsBulk() {
                return pieceIsBulk;
            }

            /**
             * Define el valor de la propiedad pieceIsBulk.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPieceIsBulk(Boolean value) {
                this.pieceIsBulk = value;
            }

            /**
             * Obtiene el valor de la propiedad pieceBulkUnit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPieceBulkUnit() {
                return pieceBulkUnit;
            }

            /**
             * Define el valor de la propiedad pieceBulkUnit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPieceBulkUnit(String value) {
                this.pieceBulkUnit = value;
            }

            /**
             * Obtiene el valor de la propiedad piecePackageType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPiecePackageType() {
                return piecePackageType;
            }

            /**
             * Define el valor de la propiedad piecePackageType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPiecePackageType(String value) {
                this.piecePackageType = value;
            }

            /**
             * Obtiene el valor de la propiedad pieceLengthCm.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPieceLengthCm() {
                return pieceLengthCm;
            }

            /**
             * Define el valor de la propiedad pieceLengthCm.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPieceLengthCm(BigInteger value) {
                this.pieceLengthCm = value;
            }

            /**
             * Obtiene el valor de la propiedad pieceWidthCm.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPieceWidthCm() {
                return pieceWidthCm;
            }

            /**
             * Define el valor de la propiedad pieceWidthCm.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPieceWidthCm(BigInteger value) {
                this.pieceWidthCm = value;
            }

            /**
             * Obtiene el valor de la propiedad pieceHeightCm.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPieceHeightCm() {
                return pieceHeightCm;
            }

            /**
             * Define el valor de la propiedad pieceHeightCm.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPieceHeightCm(BigInteger value) {
                this.pieceHeightCm = value;
            }

            /**
             * Obtiene el valor de la propiedad pieceWeightKg.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPieceWeightKg() {
                return pieceWeightKg;
            }

            /**
             * Define el valor de la propiedad pieceWeightKg.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPieceWeightKg(BigDecimal value) {
                this.pieceWeightKg = value;
            }

            /**
             * Obtiene el valor de la propiedad productType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductType() {
                return productType;
            }

            /**
             * Define el valor de la propiedad productType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductType(String value) {
                this.productType = value;
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
             *         &lt;element name="cargo-lot" maxOccurs="unbounded" minOccurs="0" form="unqualified">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="unit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="unit-key" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="quantity-manifiested" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="quantity-discrepency" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="brand" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="model" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
                "cargoLot"
            })
            public static class CargoLots {

                @XmlElement(name = "cargo-lot")
                protected List<TBillOfLading.Items.Item.CargoLots.CargoLot> cargoLot;
                @XmlAttribute(name = "update-mode")
                protected TUpdateMode updateMode;

                /**
                 * Gets the value of the cargoLot property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cargoLot property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCargoLot().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TBillOfLading.Items.Item.CargoLots.CargoLot }
                 * 
                 * 
                 */
                public List<TBillOfLading.Items.Item.CargoLots.CargoLot> getCargoLot() {
                    if (cargoLot == null) {
                        cargoLot = new ArrayList<TBillOfLading.Items.Item.CargoLots.CargoLot>();
                    }
                    return this.cargoLot;
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
                 *       &lt;attribute name="unit-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="unit-key" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="quantity-manifiested" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="quantity-discrepency" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="brand" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="model" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class CargoLot {

                    @XmlAttribute(name = "unit-id", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String unitId;
                    @XmlAttribute(name = "unit-key")
                    protected String unitKey;
                    @XmlAttribute(name = "quantity")
                    protected BigInteger quantity;
                    @XmlAttribute(name = "quantity-manifiested")
                    protected BigInteger quantityManifiested;
                    @XmlAttribute(name = "quantity-discrepency")
                    protected BigInteger quantityDiscrepency;
                    @XmlAttribute(name = "id")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String id;
                    @XmlAttribute(name = "brand")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String brand;
                    @XmlAttribute(name = "color")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String color;
                    @XmlAttribute(name = "model")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String model;

                    /**
                     * Obtiene el valor de la propiedad unitId.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUnitId() {
                        return unitId;
                    }

                    /**
                     * Define el valor de la propiedad unitId.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUnitId(String value) {
                        this.unitId = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad unitKey.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUnitKey() {
                        return unitKey;
                    }

                    /**
                     * Define el valor de la propiedad unitKey.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUnitKey(String value) {
                        this.unitKey = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantity.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getQuantity() {
                        return quantity;
                    }

                    /**
                     * Define el valor de la propiedad quantity.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setQuantity(BigInteger value) {
                        this.quantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantityManifiested.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getQuantityManifiested() {
                        return quantityManifiested;
                    }

                    /**
                     * Define el valor de la propiedad quantityManifiested.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setQuantityManifiested(BigInteger value) {
                        this.quantityManifiested = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantityDiscrepency.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getQuantityDiscrepency() {
                        return quantityDiscrepency;
                    }

                    /**
                     * Define el valor de la propiedad quantityDiscrepency.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setQuantityDiscrepency(BigInteger value) {
                        this.quantityDiscrepency = value;
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
                     * Obtiene el valor de la propiedad brand.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBrand() {
                        return brand;
                    }

                    /**
                     * Define el valor de la propiedad brand.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBrand(String value) {
                        this.brand = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad color.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getColor() {
                        return color;
                    }

                    /**
                     * Define el valor de la propiedad color.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setColor(String value) {
                        this.color = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad model.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getModel() {
                        return model;
                    }

                    /**
                     * Define el valor de la propiedad model.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setModel(String value) {
                        this.model = value;
                    }

                }

            }

        }

    }

}
