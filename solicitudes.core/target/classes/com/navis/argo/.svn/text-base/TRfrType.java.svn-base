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
 * <p>Clase Java para tRfrType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tRfrType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTEG_AIR"/>
 *     &lt;enumeration value="INTEG_AIR_SINGLE"/>
 *     &lt;enumeration value="INTEG_H20"/>
 *     &lt;enumeration value="INTEG_H20_SINGLE"/>
 *     &lt;enumeration value="INTEG_UNK"/>
 *     &lt;enumeration value="FANTAINER"/>
 *     &lt;enumeration value="PORTHOLE"/>
 *     &lt;enumeration value="NON_RFR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tRfrType")
@XmlEnum
public enum TRfrType {

    INTEG_AIR("INTEG_AIR"),
    INTEG_AIR_SINGLE("INTEG_AIR_SINGLE"),
    @XmlEnumValue("INTEG_H20")
    INTEG_H_20("INTEG_H20"),
    @XmlEnumValue("INTEG_H20_SINGLE")
    INTEG_H_20_SINGLE("INTEG_H20_SINGLE"),
    INTEG_UNK("INTEG_UNK"),
    FANTAINER("FANTAINER"),
    PORTHOLE("PORTHOLE"),
    NON_RFR("NON_RFR");
    private final String value;

    TRfrType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TRfrType fromValue(String v) {
        for (TRfrType c: TRfrType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
