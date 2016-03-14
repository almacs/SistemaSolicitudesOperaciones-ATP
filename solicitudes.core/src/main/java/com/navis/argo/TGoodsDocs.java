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
 * Documentations
 * 
 * <p>Clase Java para tGoodsDocs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tGoodsDocs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goods-doc" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="description1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="description2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="stamp-code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="number-of-documents" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="validation-date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="validation-office" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
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
@XmlType(name = "tGoodsDocs", propOrder = {
    "goodsDoc"
})
public class TGoodsDocs {

    @XmlElement(name = "goods-doc", required = true)
    protected List<TGoodsDocs.GoodsDoc> goodsDoc;

    /**
     * Gets the value of the goodsDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TGoodsDocs.GoodsDoc }
     * 
     * 
     */
    public List<TGoodsDocs.GoodsDoc> getGoodsDoc() {
        if (goodsDoc == null) {
            goodsDoc = new ArrayList<TGoodsDocs.GoodsDoc>();
        }
        return this.goodsDoc;
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
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="description1" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="description2" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="stamp-code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="number-of-documents" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="validation-date" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="validation-office" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GoodsDoc {

        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "type", required = true)
        protected String type;
        @XmlAttribute(name = "description1")
        protected String description1;
        @XmlAttribute(name = "description2")
        protected String description2;
        @XmlAttribute(name = "category")
        protected String category;
        @XmlAttribute(name = "remarks")
        protected String remarks;
        @XmlAttribute(name = "stamp-code")
        protected String stampCode;
        @XmlAttribute(name = "number-of-documents")
        protected Long numberOfDocuments;
        @XmlAttribute(name = "validation-date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar validationDate;
        @XmlAttribute(name = "validation-office")
        protected String validationOffice;

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
         * Obtiene el valor de la propiedad type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Define el valor de la propiedad type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Obtiene el valor de la propiedad description1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription1() {
            return description1;
        }

        /**
         * Define el valor de la propiedad description1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription1(String value) {
            this.description1 = value;
        }

        /**
         * Obtiene el valor de la propiedad description2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription2() {
            return description2;
        }

        /**
         * Define el valor de la propiedad description2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription2(String value) {
            this.description2 = value;
        }

        /**
         * Obtiene el valor de la propiedad category.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * Define el valor de la propiedad category.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
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
         * Obtiene el valor de la propiedad stampCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStampCode() {
            return stampCode;
        }

        /**
         * Define el valor de la propiedad stampCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStampCode(String value) {
            this.stampCode = value;
        }

        /**
         * Obtiene el valor de la propiedad numberOfDocuments.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNumberOfDocuments() {
            return numberOfDocuments;
        }

        /**
         * Define el valor de la propiedad numberOfDocuments.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNumberOfDocuments(Long value) {
            this.numberOfDocuments = value;
        }

        /**
         * Obtiene el valor de la propiedad validationDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValidationDate() {
            return validationDate;
        }

        /**
         * Define el valor de la propiedad validationDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValidationDate(XMLGregorianCalendar value) {
            this.validationDate = value;
        }

        /**
         * Obtiene el valor de la propiedad validationOffice.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidationOffice() {
            return validationOffice;
        }

        /**
         * Define el valor de la propiedad validationOffice.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidationOffice(String value) {
            this.validationOffice = value;
        }

    }

}
