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
 * <p>Clase Java para tJobFrequency.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tJobFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ON_DEMAND"/>
 *     &lt;enumeration value="BY_REPEAT_COUNT"/>
 *     &lt;enumeration value="DAILY"/>
 *     &lt;enumeration value="BY_DAY_OF_WEEK"/>
 *     &lt;enumeration value="BY_DAY_OF_MONTH"/>
 *     &lt;enumeration value="CRON_EXPRESSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tJobFrequency")
@XmlEnum
public enum TJobFrequency {

    ON_DEMAND,
    BY_REPEAT_COUNT,
    DAILY,
    BY_DAY_OF_WEEK,
    BY_DAY_OF_MONTH,
    CRON_EXPRESSION;

    public String value() {
        return name();
    }

    public static TJobFrequency fromValue(String v) {
        return valueOf(v);
    }

}
