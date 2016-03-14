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
 * Trucking company line
 * 
 * <p>Clase Java para tTruckingCompanyLine complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTruckingCompanyLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navis.com/argo}tLineAgreementBase">
 *       &lt;attribute name="trucking-company" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTruckingCompanyLine")
public class TTruckingCompanyLine
    extends TLineAgreementBase
{

    @XmlAttribute(name = "trucking-company")
    protected String truckingCompany;

    /**
     * Obtiene el valor de la propiedad truckingCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckingCompany() {
        return truckingCompany;
    }

    /**
     * Define el valor de la propiedad truckingCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckingCompany(String value) {
        this.truckingCompany = value;
    }

}
