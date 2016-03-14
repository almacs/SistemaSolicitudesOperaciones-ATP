//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tRailcarFlatCarType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tRailcarFlatCarType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOFC"/>
 *     &lt;enumeration value="COFC"/>
 *     &lt;enumeration value="Convertible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tRailcarFlatCarType")
@XmlEnum
public enum TRailcarFlatCarType {


    /**
     * Trailer on flat car
     * 
     */
    TOFC("TOFC"),

    /**
     * Container on flat car
     * 
     */
    COFC("COFC"),

    /**
     * Convertible
     * 
     */
    @XmlEnumValue("Convertible")
    CONVERTIBLE("Convertible");
    private final String value;

    TRailcarFlatCarType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TRailcarFlatCarType fromValue(String v) {
        for (TRailcarFlatCarType c: TRailcarFlatCarType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
