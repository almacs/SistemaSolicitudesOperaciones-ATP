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
 * <p>Clase Java para tServiceQuantityUnitEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tServiceQuantityUnitEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CELSIUS"/>
 *     &lt;enumeration value="CENTIMETERS"/>
 *     &lt;enumeration value="DAYS"/>
 *     &lt;enumeration value="FAHRENHEIT"/>
 *     &lt;enumeration value="GALLONS"/>
 *     &lt;enumeration value="HOURS"/>
 *     &lt;enumeration value="ITEMS"/>
 *     &lt;enumeration value="KILOS"/>
 *     &lt;enumeration value="LITERS"/>
 *     &lt;enumeration value="METERS"/>
 *     &lt;enumeration value="METRIC_TONS"/>
 *     &lt;enumeration value="MINUTES"/>
 *     &lt;enumeration value="POUNDS"/>
 *     &lt;enumeration value="SECONDS"/>
 *     &lt;enumeration value="SHORT_TONS"/>
 *     &lt;enumeration value="UNITS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tServiceQuantityUnitEnum")
@XmlEnum
public enum TServiceQuantityUnitEnum {


    /**
     * Not Available
     * 
     */
    UNKNOWN,

    /**
     * Celsius
     * 
     */
    CELSIUS,

    /**
     * Centimeters
     * 
     */
    CENTIMETERS,

    /**
     * Days
     * 
     */
    DAYS,

    /**
     * Fahrenheit
     * 
     */
    FAHRENHEIT,

    /**
     * Gallons
     * 
     */
    GALLONS,

    /**
     * Hours
     * 
     */
    HOURS,

    /**
     * Items
     * 
     */
    ITEMS,

    /**
     * Kilos
     * 
     */
    KILOS,

    /**
     * Liters
     * 
     */
    LITERS,

    /**
     * Meters
     * 
     */
    METERS,

    /**
     * Metric Tons
     * 
     */
    METRIC_TONS,

    /**
     * Minutes
     * 
     */
    MINUTES,

    /**
     * Pounds
     * 
     */
    POUNDS,

    /**
     * Seconds
     * 
     */
    SECONDS,

    /**
     * Short Tons
     * 
     */
    SHORT_TONS,

    /**
     * Units
     * 
     */
    UNITS;

    public String value() {
        return name();
    }

    public static TServiceQuantityUnitEnum fromValue(String v) {
        return valueOf(v);
    }

}
