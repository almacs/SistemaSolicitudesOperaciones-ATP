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
 * <p>Clase Java para tUpdateMode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tUpdateMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *     &lt;enumeration value="REPLACE"/>
 *     &lt;enumeration value="MERGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tUpdateMode")
@XmlEnum
public enum TUpdateMode {


    /**
     * Replace entire collection with content of SNX
     * 
     */
    REPLACE,

    /**
     * Merge data from SNX into existing collection
     * 
     */
    MERGE;

    public String value() {
        return name();
    }

    public static TUpdateMode fromValue(String v) {
        return valueOf(v);
    }

}
