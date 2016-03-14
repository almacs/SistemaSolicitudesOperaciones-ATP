//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tDocTypeUsage.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tDocTypeUsage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="HAZARD"/>
 *     &lt;enumeration value="REEFER"/>
 *     &lt;enumeration value="TROUBLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tDocTypeUsage")
@XmlEnum
public enum TDocTypeUsage {


    /**
     * Document is used for any transactions
     * 
     */
    ANY,

    /**
     * Document is used for hazardous cargo
     * 
     */
    HAZARD,

    /**
     * Document is used for reefer cargo
     * 
     */
    REEFER,

    /**
     * Document is is used for trouble transactions
     * 
     */
    TROUBLE;

    public String value() {
        return name();
    }

    public static TDocTypeUsage fromValue(String v) {
        return valueOf(v);
    }

}
