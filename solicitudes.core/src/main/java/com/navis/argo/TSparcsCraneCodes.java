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
 * <p>Clase Java para tSparcsCraneCodes.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tSparcsCraneCodes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="DO"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="HA"/>
 *     &lt;enumeration value="BB"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="CB"/>
 *     &lt;enumeration value="WL"/>
 *     &lt;enumeration value="WV"/>
 *     &lt;enumeration value="HC"/>
 *     &lt;enumeration value="WP"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="BM"/>
 *     &lt;enumeration value="WI"/>
 *     &lt;enumeration value="BW"/>
 *     &lt;enumeration value="PB"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="WS"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="TB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tSparcsCraneCodes")
@XmlEnum
public enum TSparcsCraneCodes {


    /**
     * Sparcs delay code indicating 'Break'
     * 
     */
    BR,

    /**
     * Sparcs delay code indicating 'Maintenance'
     * 
     */
    MA,

    /**
     * Sparcs delay code indicating 'Special'
     * 
     */
    SP,

    /**
     * Sparcs delay code indicating 'Downtime'
     * 
     */
    DO,

    /**
     * Sparcs delay code indicating 'User Defined'
     * 
     */
    US,

    /**
     * Sparcs delay code indicating 'Hatch Move'
     * 
     */
    HA,

    /**
     * Sparcs delay code indicating 'Break Bulk'
     * 
     */
    BB,

    /**
     * Sparcs delay code indicating 'Late Start'
     * 
     */
    LA,

    /**
     * Sparcs delay code indicating 'Crane Breakdown'
     * 
     */
    CB,

    /**
     * Sparcs delay code indicating 'Waiting Lashing'
     * 
     */
    WL,

    /**
     * Sparcs delay code indicating 'Waiting Vessel'
     * 
     */
    WV,

    /**
     * Sparcs delay code indicating 'Hatch Cover'
     * 
     */
    HC,

    /**
     * Sparcs delay code indicating 'Waiting CHE'
     * 
     */
    WP,

    /**
     * Sparcs delay code indicating 'Change Shift'
     * 
     */
    CS,

    /**
     * Sparcs delay code indicating 'Spreader Change'
     * 
     */
    SC,

    /**
     * Sparcs delay code indicating 'Boom Up'
     * 
     */
    BM,

    /**
     * Sparcs delay code indicating 'Waiting Instruction'
     * 
     */
    WI,

    /**
     * Sparcs delay code indicating 'Bad Weather'
     * 
     */
    BW,

    /**
     * Sparcs delay code indicating 'Primay Break'
     * 
     */
    PB,

    /**
     * Sparcs delay code indicating 'CHE Failure'
     * 
     */
    CF,

    /**
     * Sparcs delay code indicating 'Work Station'
     * 
     */
    WS,

    /**
     * Sparcs delay code indicating 'Secondary Break'
     * 
     */
    SB,

    /**
     * Sparcs delay code indicating 'Timed Break'
     * 
     */
    TB;

    public String value() {
        return name();
    }

    public static TSparcsCraneCodes fromValue(String v) {
        return valueOf(v);
    }

}
