//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Predicate
 * 
 * <p>Clase Java para tPredicate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tPredicate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predicate" type="{http://www.navis.com/argo}tPredicate" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sub-predicate" type="{http://www.navis.com/argo}tPredicate" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="mapped-value" type="{http://www.navis.com/argo}tPredicate" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="next-predicate" type="{http://www.navis.com/argo}tPredicate" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="metafield" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="verb">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="EQ"/>
 *             &lt;enumeration value="NE"/>
 *             &lt;enumeration value="LT"/>
 *             &lt;enumeration value="GT"/>
 *             &lt;enumeration value="LE"/>
 *             &lt;enumeration value="GE"/>
 *             &lt;enumeration value="NOT"/>
 *             &lt;enumeration value="IN"/>
 *             &lt;enumeration value="TRUE"/>
 *             &lt;enumeration value="FALSE"/>
 *             &lt;enumeration value="SAME"/>
 *             &lt;enumeration value="NOT_NULL"/>
 *             &lt;enumeration value="NULL"/>
 *             &lt;enumeration value="MATCHES"/>
 *             &lt;enumeration value="BEFORE"/>
 *             &lt;enumeration value="AFTER"/>
 *             &lt;enumeration value="OLDER"/>
 *             &lt;enumeration value="NEWER"/>
 *             &lt;enumeration value="TIME_IS"/>
 *             &lt;enumeration value="AND"/>
 *             &lt;enumeration value="OR"/>
 *             &lt;enumeration value="OTHERWISE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ui-value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="parm-type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NO_PARM"/>
 *             &lt;enumeration value="REQUIRED_PARM"/>
 *             &lt;enumeration value="OPTIONAL_PARM"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="parm-label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parm-internal-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPredicate", propOrder = {
    "predicate",
    "subPredicate",
    "mappedValue",
    "nextPredicate"
})
public class TPredicate {

    protected List<TPredicate> predicate;
    @XmlElement(name = "sub-predicate")
    protected List<TPredicate> subPredicate;
    @XmlElement(name = "mapped-value")
    protected List<TPredicate> mappedValue;
    @XmlElement(name = "next-predicate")
    protected List<TPredicate> nextPredicate;
    @XmlAttribute(name = "metafield")
    protected String metafield;
    @XmlAttribute(name = "verb")
    protected String verb;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "ui-value")
    protected String uiValue;
    @XmlAttribute(name = "order")
    protected BigInteger order;
    @XmlAttribute(name = "negated")
    protected Boolean negated;
    @XmlAttribute(name = "parm-type")
    protected String parmType;
    @XmlAttribute(name = "parm-label")
    protected String parmLabel;
    @XmlAttribute(name = "parm-internal-name")
    protected String parmInternalName;

    /**
     * Gets the value of the predicate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predicate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredicate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPredicate }
     * 
     * 
     */
    public List<TPredicate> getPredicate() {
        if (predicate == null) {
            predicate = new ArrayList<TPredicate>();
        }
        return this.predicate;
    }

    /**
     * Gets the value of the subPredicate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPredicate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPredicate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPredicate }
     * 
     * 
     */
    public List<TPredicate> getSubPredicate() {
        if (subPredicate == null) {
            subPredicate = new ArrayList<TPredicate>();
        }
        return this.subPredicate;
    }

    /**
     * Gets the value of the mappedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mappedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPredicate }
     * 
     * 
     */
    public List<TPredicate> getMappedValue() {
        if (mappedValue == null) {
            mappedValue = new ArrayList<TPredicate>();
        }
        return this.mappedValue;
    }

    /**
     * Gets the value of the nextPredicate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextPredicate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextPredicate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPredicate }
     * 
     * 
     */
    public List<TPredicate> getNextPredicate() {
        if (nextPredicate == null) {
            nextPredicate = new ArrayList<TPredicate>();
        }
        return this.nextPredicate;
    }

    /**
     * Obtiene el valor de la propiedad metafield.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetafield() {
        return metafield;
    }

    /**
     * Define el valor de la propiedad metafield.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetafield(String value) {
        this.metafield = value;
    }

    /**
     * Obtiene el valor de la propiedad verb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerb() {
        return verb;
    }

    /**
     * Define el valor de la propiedad verb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerb(String value) {
        this.verb = value;
    }

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
     * Obtiene el valor de la propiedad uiValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiValue() {
        return uiValue;
    }

    /**
     * Define el valor de la propiedad uiValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiValue(String value) {
        this.uiValue = value;
    }

    /**
     * Obtiene el valor de la propiedad order.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Define el valor de la propiedad order.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Obtiene el valor de la propiedad negated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegated() {
        return negated;
    }

    /**
     * Define el valor de la propiedad negated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegated(Boolean value) {
        this.negated = value;
    }

    /**
     * Obtiene el valor de la propiedad parmType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParmType() {
        return parmType;
    }

    /**
     * Define el valor de la propiedad parmType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParmType(String value) {
        this.parmType = value;
    }

    /**
     * Obtiene el valor de la propiedad parmLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParmLabel() {
        return parmLabel;
    }

    /**
     * Define el valor de la propiedad parmLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParmLabel(String value) {
        this.parmLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad parmInternalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParmInternalName() {
        return parmInternalName;
    }

    /**
     * Define el valor de la propiedad parmInternalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParmInternalName(String value) {
        this.parmInternalName = value;
    }

}
