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
 * <p>Clase Java para tEdiMessageStandard.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tEdiMessageStandard">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="X12"/>
 *     &lt;enumeration value="EDIFACT"/>
 *     &lt;enumeration value="Navis standard XML"/>
 *     &lt;enumeration value="FLATFILE"/>
 *     &lt;enumeration value="Misc. standard or prorpietary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tEdiMessageStandard")
@XmlEnum
public enum TEdiMessageStandard {


    /**
     * X12
     * 
     */
    @XmlEnumValue("X12")
    X_12("X12"),

    /**
     * EDIFACT
     * 
     */
    EDIFACT("EDIFACT"),

    /**
     * Navis standard XML
     * 
     */
    @XmlEnumValue("Navis standard XML")
    NAVIS_STANDARD_XML("Navis standard XML"),

    /**
     * FLATFILE
     * 
     */
    FLATFILE("FLATFILE"),

    /**
     * Misc. standard or proprietary
     * 
     */
    @XmlEnumValue("Misc. standard or prorpietary")
    MISC_STANDARD_OR_PRORPIETARY("Misc. standard or prorpietary");
    private final String value;

    TEdiMessageStandard(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TEdiMessageStandard fromValue(String v) {
        for (TEdiMessageStandard c: TEdiMessageStandard.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
