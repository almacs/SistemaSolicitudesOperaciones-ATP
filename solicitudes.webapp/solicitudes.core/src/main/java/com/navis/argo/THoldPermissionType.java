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
 * <p>Clase Java para tHoldPermissionType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tHoldPermissionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOLD"/>
 *     &lt;enumeration value="PERMISSION"/>
 *     &lt;enumeration value="PREREQUISITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tHoldPermissionType")
@XmlEnum
public enum THoldPermissionType {


    /**
     * A type representing a hold
     * 
     */
    HOLD,

    /**
     * A type representing a permission
     * 
     */
    PERMISSION,

    /**
     * A type representing a pre-requisite
     * 
     */
    PREREQUISITE;

    public String value() {
        return name();
    }

    public static THoldPermissionType fromValue(String v) {
        return valueOf(v);
    }

}
