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
 * <p>Clase Java para tBizRole.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tBizRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LINEOP"/>
 *     &lt;enumeration value="VESSELOP"/>
 *     &lt;enumeration value="RAILROAD"/>
 *     &lt;enumeration value="HAULIER"/>
 *     &lt;enumeration value="SHIPPER"/>
 *     &lt;enumeration value="AGENT"/>
 *     &lt;enumeration value="MISC"/>
 *     &lt;enumeration value="STEVEDORE"/>
 *     &lt;enumeration value="SURVEYOR"/>
 *     &lt;enumeration value="DCOP"/>
 *     &lt;enumeration value="DEPOT"/>
 *     &lt;enumeration value="CUSTOMS"/>
 *     &lt;enumeration value="GOVAGENCY"/>
 *     &lt;enumeration value="FRGTHFWDER"/>
 *     &lt;enumeration value="LEASINGCO"/>
 *     &lt;enumeration value="TERMINAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tBizRole")
@XmlEnum
public enum TBizRole {

    LINEOP,
    VESSELOP,
    RAILROAD,
    HAULIER,
    SHIPPER,
    AGENT,
    MISC,
    STEVEDORE,
    SURVEYOR,
    DCOP,
    DEPOT,
    CUSTOMS,
    GOVAGENCY,
    FRGTHFWDER,
    LEASINGCO,
    TERMINAL;

    public String value() {
        return name();
    }

    public static TBizRole fromValue(String v) {
        return valueOf(v);
    }

}
