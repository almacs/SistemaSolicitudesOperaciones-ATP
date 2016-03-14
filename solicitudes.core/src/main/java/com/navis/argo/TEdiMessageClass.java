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
 * <p>Clase Java para tEdiMessageClass.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tEdiMessageClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVITY"/>
 *     &lt;enumeration value="RELEASE"/>
 *     &lt;enumeration value="STOWPLAN"/>
 *     &lt;enumeration value="BOOKING"/>
 *     &lt;enumeration value="PREADVISE"/>
 *     &lt;enumeration value="LOADLIST"/>
 *     &lt;enumeration value="DISCHLIST"/>
 *     &lt;enumeration value="PERFORMANCE"/>
 *     &lt;enumeration value="SCHEDULE"/>
 *     &lt;enumeration value="MANIFEST"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ACKNOWLEDGEMENT"/>
 *     &lt;enumeration value="APPOINTMENT"/>
 *     &lt;enumeration value="INVENTORY"/>
 *     &lt;enumeration value="INVOICE"/>
 *     &lt;enumeration value="RAILCONSIST"/>
 *     &lt;enumeration value="HAZARD"/>
 *     &lt;enumeration value="RAILORDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tEdiMessageClass")
@XmlEnum
public enum TEdiMessageClass {


    /**
     * ACTIVITY
     * 
     */
    ACTIVITY,

    /**
     * RELEASE
     * 
     */
    RELEASE,

    /**
     * STOWPLAN
     * 
     */
    STOWPLAN,

    /**
     * BOOKING
     * 
     */
    BOOKING,

    /**
     * PREADVISE
     * 
     */
    PREADVISE,

    /**
     * LOADLIST
     * 
     */
    LOADLIST,

    /**
     * DISCHLIST
     * 
     */
    DISCHLIST,

    /**
     * PERFORMANCE
     * 
     */
    PERFORMANCE,

    /**
     * SCHEDULE
     * 
     */
    SCHEDULE,

    /**
     * MANIFEST
     * 
     */
    MANIFEST,

    /**
     * UNKNOWN
     * 
     */
    UNKNOWN,

    /**
     * ACKNOWLEDGEMENT
     * 
     */
    ACKNOWLEDGEMENT,

    /**
     * APPOINTMENT
     * 
     */
    APPOINTMENT,

    /**
     * INVENTORY
     * 
     */
    INVENTORY,

    /**
     * INVOICE
     * 
     */
    INVOICE,

    /**
     * RAILCONSIST
     * 
     */
    RAILCONSIST,

    /**
     * HAZARD
     * 
     */
    HAZARD,

    /**
     * RAILORDER
     * 
     */
    RAILORDER;

    public String value() {
        return name();
    }

    public static TEdiMessageClass fromValue(String v) {
        return valueOf(v);
    }

}
