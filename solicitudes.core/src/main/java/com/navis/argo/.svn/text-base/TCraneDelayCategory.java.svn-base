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
 * <p>Clase Java para tCraneDelayCategory.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tCraneDelayCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FORCE_MAJEURE"/>
 *     &lt;enumeration value="NON_TERMINAL"/>
 *     &lt;enumeration value="TERMINAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tCraneDelayCategory")
@XmlEnum
public enum TCraneDelayCategory {


    /**
     * Delay category indicating that the delay was caused due to unpreventable
     *                         circumstance. eg. Snow
     *                     
     * 
     */
    FORCE_MAJEURE,

    /**
     * Delay category referring to delay caused by non terminal related delay
     * 
     */
    NON_TERMINAL,

    /**
     * Delay category referring to delay caused by terminal related delay
     * 
     */
    TERMINAL;

    public String value() {
        return name();
    }

    public static TCraneDelayCategory fromValue(String v) {
        return valueOf(v);
    }

}
