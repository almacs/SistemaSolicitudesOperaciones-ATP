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
 * <p>Clase Java para tTruckStatus.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tTruckStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *     &lt;enumeration value="BANNED"/>
 *     &lt;enumeration value="RCVONLY"/>
 *     &lt;enumeration value="OK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tTruckStatus")
@XmlEnum
public enum TTruckStatus {


    /**
     * Company (or Driver) is Banned
     * 
     */
    BANNED,

    /**
     * Company (or Driver) can dropoff only (no
     *                         pickup)
     *                     
     * 
     */
    RCVONLY,

    /**
     * Company (or Driver) has no restrictions
     * 
     */
    OK;

    public String value() {
        return name();
    }

    public static TTruckStatus fromValue(String v) {
        return valueOf(v);
    }

}
