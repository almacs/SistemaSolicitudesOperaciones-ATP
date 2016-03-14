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
 * <p>Clase Java para WeightUnitType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="WeightUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="g"/>
 *     &lt;enumeration value="kg"/>
 *     &lt;enumeration value="lb"/>
 *     &lt;enumeration value="quintals"/>
 *     &lt;enumeration value="long-ton"/>
 *     &lt;enumeration value="short-ton"/>
 *     &lt;enumeration value="tonne"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WeightUnitType")
@XmlEnum
public enum WeightUnitType {

    @XmlEnumValue("g")
    G("g"),
    @XmlEnumValue("kg")
    KG("kg"),
    @XmlEnumValue("lb")
    LB("lb"),
    @XmlEnumValue("quintals")
    QUINTALS("quintals"),
    @XmlEnumValue("long-ton")
    LONG_TON("long-ton"),
    @XmlEnumValue("short-ton")
    SHORT_TON("short-ton"),
    @XmlEnumValue("tonne")
    TONNE("tonne");
    private final String value;

    WeightUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeightUnitType fromValue(String v) {
        for (WeightUnitType c: WeightUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
