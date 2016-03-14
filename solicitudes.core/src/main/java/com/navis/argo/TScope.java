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
 * <p>Clase Java para tScope.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GLOBAL"/>
 *     &lt;enumeration value="OPERATOR"/>
 *     &lt;enumeration value="COMPLEX"/>
 *     &lt;enumeration value="FACILITY"/>
 *     &lt;enumeration value="YARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tScope")
@XmlEnum
public enum TScope {

    GLOBAL,
    OPERATOR,
    COMPLEX,
    FACILITY,
    YARD;

    public String value() {
        return name();
    }

    public static TScope fromValue(String v) {
        return valueOf(v);
    }

}
