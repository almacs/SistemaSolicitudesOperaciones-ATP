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
 * <p>Clase Java para tEquipNominalLength.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tEquipNominalLength">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOM20"/>
 *     &lt;enumeration value="NOM22"/>
 *     &lt;enumeration value="NOM24"/>
 *     &lt;enumeration value="NOM30"/>
 *     &lt;enumeration value="NOM32"/>
 *     &lt;enumeration value="NOM40"/>
 *     &lt;enumeration value="NOM42"/>
 *     &lt;enumeration value="NOM45"/>
 *     &lt;enumeration value="NOM48"/>
 *     &lt;enumeration value="NOM51"/>
 *     &lt;enumeration value="NOM53"/>
 *     &lt;enumeration value="NOM546"/>
 *     &lt;enumeration value="NOM60"/>
 *     &lt;enumeration value="NOMXX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tEquipNominalLength")
@XmlEnum
public enum TEquipNominalLength {

    @XmlEnumValue("NOM20")
    NOM_20("NOM20"),
    @XmlEnumValue("NOM22")
    NOM_22("NOM22"),
    @XmlEnumValue("NOM24")
    NOM_24("NOM24"),
    @XmlEnumValue("NOM30")
    NOM_30("NOM30"),
    @XmlEnumValue("NOM32")
    NOM_32("NOM32"),
    @XmlEnumValue("NOM40")
    NOM_40("NOM40"),
    @XmlEnumValue("NOM42")
    NOM_42("NOM42"),
    @XmlEnumValue("NOM45")
    NOM_45("NOM45"),
    @XmlEnumValue("NOM48")
    NOM_48("NOM48"),
    @XmlEnumValue("NOM51")
    NOM_51("NOM51"),
    @XmlEnumValue("NOM53")
    NOM_53("NOM53"),
    @XmlEnumValue("NOM546")
    NOM_546("NOM546"),
    @XmlEnumValue("NOM60")
    NOM_60("NOM60"),
    NOMXX("NOMXX");
    private final String value;

    TEquipNominalLength(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TEquipNominalLength fromValue(String v) {
        for (TEquipNominalLength c: TEquipNominalLength.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
