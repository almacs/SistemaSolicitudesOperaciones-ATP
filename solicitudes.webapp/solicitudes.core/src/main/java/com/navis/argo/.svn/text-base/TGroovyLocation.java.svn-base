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
 * <p>Clase Java para tGroovyLocation.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tGroovyLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="database"/>
 *     &lt;enumeration value="classpath"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tGroovyLocation")
@XmlEnum
public enum TGroovyLocation {


    /**
     * File system
     * 
     */
    @XmlEnumValue("file")
    FILE("file"),

    /**
     * Database
     * 
     */
    @XmlEnumValue("database")
    DATABASE("database"),

    /**
     * Classpath
     * 
     */
    @XmlEnumValue("classpath")
    CLASSPATH("classpath");
    private final String value;

    TGroovyLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TGroovyLocation fromValue(String v) {
        for (TGroovyLocation c: TGroovyLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
