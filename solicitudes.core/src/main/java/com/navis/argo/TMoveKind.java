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
 * <p>Clase Java para tMoveKind.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tMoveKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RECV"/>
 *     &lt;enumeration value="DLVR"/>
 *     &lt;enumeration value="DSCH"/>
 *     &lt;enumeration value="LOAD"/>
 *     &lt;enumeration value="RDSC"/>
 *     &lt;enumeration value="RLOD"/>
 *     &lt;enumeration value="SHOB"/>
 *     &lt;enumeration value="YARD"/>
 *     &lt;enumeration value="SHFT"/>
 *     &lt;enumeration value="OTHR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tMoveKind")
@XmlEnum
public enum TMoveKind {


    /**
     * Receival
     * 
     */
    RECV,

    /**
     * Delivery
     * 
     */
    DLVR,

    /**
     * Discharge
     * 
     */
    DSCH,

    /**
     * Load
     * 
     */
    LOAD,

    /**
     * Rail Disch
     * 
     */
    RDSC,

    /**
     * Rail Load
     * 
     */
    RLOD,

    /**
     * Shift O.B.
     * 
     */
    SHOB,

    /**
     * Yard Move
     * 
     */
    YARD,

    /**
     * Yard Shift
     * 
     */
    SHFT,

    /**
     * Other
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static TMoveKind fromValue(String v) {
        return valueOf(v);
    }

}
