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
 * <p>Clase Java para tEdiJobClass.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tEdiJobClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMMUNICATION_SESSION"/>
 *     &lt;enumeration value="INBOUND_SESSION"/>
 *     &lt;enumeration value="OUTBOUND_SESSION"/>
 *     &lt;enumeration value="REPROCESS_SESSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tEdiJobClass")
@XmlEnum
public enum TEdiJobClass {


    /**
     * EDI Message Receive Send Session
     * 
     */
    COMMUNICATION_SESSION,

    /**
     * EDI Message Receive Session
     * 
     */
    INBOUND_SESSION,

    /**
     * EDI Message Send Session
     * 
     */
    OUTBOUND_SESSION,

    /**
     * EDI Message Reprocess Session
     * 
     */
    REPROCESS_SESSION;

    public String value() {
        return name();
    }

    public static TEdiJobClass fromValue(String v) {
        return valueOf(v);
    }

}
