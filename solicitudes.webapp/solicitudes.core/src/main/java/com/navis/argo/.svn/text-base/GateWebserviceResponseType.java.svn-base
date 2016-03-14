//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.01.27 a las 01:53:38 PM CST 
//


package com.navis.argo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.w3c.dom.Element;


/**
 * Action to be processed by the gate webservice
 * 
 * <p>Clase Java para GateWebserviceResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GateWebserviceResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="record-scan-response" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *           &lt;element name="process-truck-response" type="{http://www.navis.com/argo}ProcessTruckResponseType"/>
 *           &lt;element name="cancel-transaction-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="truck-transaction" type="{http://www.navis.com/argo}TruckTransactionType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="submit-transaction-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType"/>
 *                     &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
 *                     &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentsType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="submit-multiple-transactions-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType"/>
 *                     &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
 *                     &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentsType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="stage-done-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType"/>
 *                     &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="request-pickup-appointments-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitResponseType"/>
 *                     &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentsType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="request-trouble-transactions-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="create-truck-visit-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitResponseType"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="cancel-truck-visit-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType"/>
 *                     &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="read-preadvise-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="unit" type="{http://www.navis.com/argo}tUnit" minOccurs="0"/>
 *                     &lt;element name="appointment" type="{http://www.navis.com/argo}AppointmentType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="request-visit-details-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType" minOccurs="0"/>
 *                     &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="list-transactions-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="truck-visits" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="update-truck-visit-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitResponseType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="request-scans-expected-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="scans-expected" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="scan-expected" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
 *                                         &lt;element name="equipment" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;choice maxOccurs="unbounded">
 *                                                   &lt;element name="container" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                           &lt;attribute name="on-chassis-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="chassis" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/choice>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="last-stage-completion" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="notify-arrival-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType" minOccurs="0"/>
 *                     &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="create-appointment-response" type="{http://www.navis.com/argo}GateAppointmentResponseType"/>
 *           &lt;element name="read-order-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="eq-orders">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="eq-order" type="{http://www.navis.com/argo}EqOrderType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="request-stage-details-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="gate-stages" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="gate-stage" type="{http://www.navis.com/argo}GateStageType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="transaction-stages" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="transaction-stage" type="{http://www.navis.com/argo}TransactionStageType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="update-appointment-response" type="{http://www.navis.com/argo}GateAppointmentResponseType"/>
 *           &lt;element name="cancel-appointment-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentListResponseType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="create-truck-visit-appointment-response" type="{http://www.navis.com/argo}TruckVisitAppointmentResponseType"/>
 *           &lt;element name="update-truck-visit-appointment-response" type="{http://www.navis.com/argo}TruckVisitAppointmentResponseType"/>
 *           &lt;element name="cancel-truck-visit-appointment-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentListResponseType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="custom-response">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="notify-wait" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GateWebserviceResponseType", propOrder = {
    "recordScanResponse",
    "processTruckResponse",
    "cancelTransactionResponse",
    "submitTransactionResponse",
    "submitMultipleTransactionsResponse",
    "stageDoneResponse",
    "requestPickupAppointmentsResponse",
    "requestTroubleTransactionsResponse",
    "createTruckVisitResponse",
    "cancelTruckVisitResponse",
    "readPreadviseResponse",
    "requestVisitDetailsResponse",
    "listTransactionsResponse",
    "updateTruckVisitResponse",
    "requestScansExpectedResponse",
    "notifyArrivalResponse",
    "createAppointmentResponse",
    "readOrderResponse",
    "requestStageDetailsResponse",
    "updateAppointmentResponse",
    "cancelAppointmentResponse",
    "createTruckVisitAppointmentResponse",
    "updateTruckVisitAppointmentResponse",
    "cancelTruckVisitAppointmentResponse",
    "customResponse",
    "notifyWait"
})
//added by Objectwave, required to make jaxb work
@XmlRootElement(name="gate-response")
public class GateWebserviceResponseType {

    @XmlElement(name = "record-scan-response")
    protected Object recordScanResponse;
    @XmlElement(name = "process-truck-response")
    protected ProcessTruckResponseType processTruckResponse;
    @XmlElement(name = "cancel-transaction-response")
    protected GateWebserviceResponseType.CancelTransactionResponse cancelTransactionResponse;
    @XmlElement(name = "submit-transaction-response")
    protected GateWebserviceResponseType.SubmitTransactionResponse submitTransactionResponse;
    @XmlElement(name = "submit-multiple-transactions-response")
    protected GateWebserviceResponseType.SubmitMultipleTransactionsResponse submitMultipleTransactionsResponse;
    @XmlElement(name = "stage-done-response")
    protected GateWebserviceResponseType.StageDoneResponse stageDoneResponse;
    @XmlElement(name = "request-pickup-appointments-response")
    protected GateWebserviceResponseType.RequestPickupAppointmentsResponse requestPickupAppointmentsResponse;
    @XmlElement(name = "request-trouble-transactions-response")
    protected GateWebserviceResponseType.RequestTroubleTransactionsResponse requestTroubleTransactionsResponse;
    @XmlElement(name = "create-truck-visit-response")
    protected GateWebserviceResponseType.CreateTruckVisitResponse createTruckVisitResponse;
    @XmlElement(name = "cancel-truck-visit-response")
    protected GateWebserviceResponseType.CancelTruckVisitResponse cancelTruckVisitResponse;
    @XmlElement(name = "read-preadvise-response")
    protected GateWebserviceResponseType.ReadPreadviseResponse readPreadviseResponse;
    @XmlElement(name = "request-visit-details-response")
    protected GateWebserviceResponseType.RequestVisitDetailsResponse requestVisitDetailsResponse;
    @XmlElement(name = "list-transactions-response")
    protected GateWebserviceResponseType.ListTransactionsResponse listTransactionsResponse;
    @XmlElement(name = "update-truck-visit-response")
    protected GateWebserviceResponseType.UpdateTruckVisitResponse updateTruckVisitResponse;
    @XmlElement(name = "request-scans-expected-response")
    protected GateWebserviceResponseType.RequestScansExpectedResponse requestScansExpectedResponse;
    @XmlElement(name = "notify-arrival-response")
    protected GateWebserviceResponseType.NotifyArrivalResponse notifyArrivalResponse;
    @XmlElement(name = "create-appointment-response")
    protected GateAppointmentResponseType createAppointmentResponse;
    @XmlElement(name = "read-order-response")
    protected GateWebserviceResponseType.ReadOrderResponse readOrderResponse;
    @XmlElement(name = "request-stage-details-response")
    protected GateWebserviceResponseType.RequestStageDetailsResponse requestStageDetailsResponse;
    @XmlElement(name = "update-appointment-response")
    protected GateAppointmentResponseType updateAppointmentResponse;
    @XmlElement(name = "cancel-appointment-response")
    protected GateWebserviceResponseType.CancelAppointmentResponse cancelAppointmentResponse;
    @XmlElement(name = "create-truck-visit-appointment-response")
    protected TruckVisitAppointmentResponseType createTruckVisitAppointmentResponse;
    @XmlElement(name = "update-truck-visit-appointment-response")
    protected TruckVisitAppointmentResponseType updateTruckVisitAppointmentResponse;
    @XmlElement(name = "cancel-truck-visit-appointment-response")
    protected GateWebserviceResponseType.CancelTruckVisitAppointmentResponse cancelTruckVisitAppointmentResponse;
    @XmlElement(name = "custom-response")
    protected GateWebserviceResponseType.CustomResponse customResponse;
    @XmlElement(name = "notify-wait")
    protected Object notifyWait;

    /**
     * Obtiene el valor de la propiedad recordScanResponse.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRecordScanResponse() {
        return recordScanResponse;
    }

    /**
     * Define el valor de la propiedad recordScanResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRecordScanResponse(Object value) {
        this.recordScanResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad processTruckResponse.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTruckResponseType }
     *     
     */
    public ProcessTruckResponseType getProcessTruckResponse() {
        return processTruckResponse;
    }

    /**
     * Define el valor de la propiedad processTruckResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTruckResponseType }
     *     
     */
    public void setProcessTruckResponse(ProcessTruckResponseType value) {
        this.processTruckResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelTransactionResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.CancelTransactionResponse }
     *     
     */
    public GateWebserviceResponseType.CancelTransactionResponse getCancelTransactionResponse() {
        return cancelTransactionResponse;
    }

    /**
     * Define el valor de la propiedad cancelTransactionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.CancelTransactionResponse }
     *     
     */
    public void setCancelTransactionResponse(GateWebserviceResponseType.CancelTransactionResponse value) {
        this.cancelTransactionResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad submitTransactionResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.SubmitTransactionResponse }
     *     
     */
    public GateWebserviceResponseType.SubmitTransactionResponse getSubmitTransactionResponse() {
        return submitTransactionResponse;
    }

    /**
     * Define el valor de la propiedad submitTransactionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.SubmitTransactionResponse }
     *     
     */
    public void setSubmitTransactionResponse(GateWebserviceResponseType.SubmitTransactionResponse value) {
        this.submitTransactionResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad submitMultipleTransactionsResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.SubmitMultipleTransactionsResponse }
     *     
     */
    public GateWebserviceResponseType.SubmitMultipleTransactionsResponse getSubmitMultipleTransactionsResponse() {
        return submitMultipleTransactionsResponse;
    }

    /**
     * Define el valor de la propiedad submitMultipleTransactionsResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.SubmitMultipleTransactionsResponse }
     *     
     */
    public void setSubmitMultipleTransactionsResponse(GateWebserviceResponseType.SubmitMultipleTransactionsResponse value) {
        this.submitMultipleTransactionsResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad stageDoneResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.StageDoneResponse }
     *     
     */
    public GateWebserviceResponseType.StageDoneResponse getStageDoneResponse() {
        return stageDoneResponse;
    }

    /**
     * Define el valor de la propiedad stageDoneResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.StageDoneResponse }
     *     
     */
    public void setStageDoneResponse(GateWebserviceResponseType.StageDoneResponse value) {
        this.stageDoneResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad requestPickupAppointmentsResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.RequestPickupAppointmentsResponse }
     *     
     */
    public GateWebserviceResponseType.RequestPickupAppointmentsResponse getRequestPickupAppointmentsResponse() {
        return requestPickupAppointmentsResponse;
    }

    /**
     * Define el valor de la propiedad requestPickupAppointmentsResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.RequestPickupAppointmentsResponse }
     *     
     */
    public void setRequestPickupAppointmentsResponse(GateWebserviceResponseType.RequestPickupAppointmentsResponse value) {
        this.requestPickupAppointmentsResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad requestTroubleTransactionsResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.RequestTroubleTransactionsResponse }
     *     
     */
    public GateWebserviceResponseType.RequestTroubleTransactionsResponse getRequestTroubleTransactionsResponse() {
        return requestTroubleTransactionsResponse;
    }

    /**
     * Define el valor de la propiedad requestTroubleTransactionsResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.RequestTroubleTransactionsResponse }
     *     
     */
    public void setRequestTroubleTransactionsResponse(GateWebserviceResponseType.RequestTroubleTransactionsResponse value) {
        this.requestTroubleTransactionsResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad createTruckVisitResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.CreateTruckVisitResponse }
     *     
     */
    public GateWebserviceResponseType.CreateTruckVisitResponse getCreateTruckVisitResponse() {
        return createTruckVisitResponse;
    }

    /**
     * Define el valor de la propiedad createTruckVisitResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.CreateTruckVisitResponse }
     *     
     */
    public void setCreateTruckVisitResponse(GateWebserviceResponseType.CreateTruckVisitResponse value) {
        this.createTruckVisitResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelTruckVisitResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.CancelTruckVisitResponse }
     *     
     */
    public GateWebserviceResponseType.CancelTruckVisitResponse getCancelTruckVisitResponse() {
        return cancelTruckVisitResponse;
    }

    /**
     * Define el valor de la propiedad cancelTruckVisitResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.CancelTruckVisitResponse }
     *     
     */
    public void setCancelTruckVisitResponse(GateWebserviceResponseType.CancelTruckVisitResponse value) {
        this.cancelTruckVisitResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad readPreadviseResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.ReadPreadviseResponse }
     *     
     */
    public GateWebserviceResponseType.ReadPreadviseResponse getReadPreadviseResponse() {
        return readPreadviseResponse;
    }

    /**
     * Define el valor de la propiedad readPreadviseResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.ReadPreadviseResponse }
     *     
     */
    public void setReadPreadviseResponse(GateWebserviceResponseType.ReadPreadviseResponse value) {
        this.readPreadviseResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad requestVisitDetailsResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.RequestVisitDetailsResponse }
     *     
     */
    public GateWebserviceResponseType.RequestVisitDetailsResponse getRequestVisitDetailsResponse() {
        return requestVisitDetailsResponse;
    }

    /**
     * Define el valor de la propiedad requestVisitDetailsResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.RequestVisitDetailsResponse }
     *     
     */
    public void setRequestVisitDetailsResponse(GateWebserviceResponseType.RequestVisitDetailsResponse value) {
        this.requestVisitDetailsResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad listTransactionsResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.ListTransactionsResponse }
     *     
     */
    public GateWebserviceResponseType.ListTransactionsResponse getListTransactionsResponse() {
        return listTransactionsResponse;
    }

    /**
     * Define el valor de la propiedad listTransactionsResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.ListTransactionsResponse }
     *     
     */
    public void setListTransactionsResponse(GateWebserviceResponseType.ListTransactionsResponse value) {
        this.listTransactionsResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad updateTruckVisitResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.UpdateTruckVisitResponse }
     *     
     */
    public GateWebserviceResponseType.UpdateTruckVisitResponse getUpdateTruckVisitResponse() {
        return updateTruckVisitResponse;
    }

    /**
     * Define el valor de la propiedad updateTruckVisitResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.UpdateTruckVisitResponse }
     *     
     */
    public void setUpdateTruckVisitResponse(GateWebserviceResponseType.UpdateTruckVisitResponse value) {
        this.updateTruckVisitResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad requestScansExpectedResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.RequestScansExpectedResponse }
     *     
     */
    public GateWebserviceResponseType.RequestScansExpectedResponse getRequestScansExpectedResponse() {
        return requestScansExpectedResponse;
    }

    /**
     * Define el valor de la propiedad requestScansExpectedResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.RequestScansExpectedResponse }
     *     
     */
    public void setRequestScansExpectedResponse(GateWebserviceResponseType.RequestScansExpectedResponse value) {
        this.requestScansExpectedResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad notifyArrivalResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.NotifyArrivalResponse }
     *     
     */
    public GateWebserviceResponseType.NotifyArrivalResponse getNotifyArrivalResponse() {
        return notifyArrivalResponse;
    }

    /**
     * Define el valor de la propiedad notifyArrivalResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.NotifyArrivalResponse }
     *     
     */
    public void setNotifyArrivalResponse(GateWebserviceResponseType.NotifyArrivalResponse value) {
        this.notifyArrivalResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad createAppointmentResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateAppointmentResponseType }
     *     
     */
    public GateAppointmentResponseType getCreateAppointmentResponse() {
        return createAppointmentResponse;
    }

    /**
     * Define el valor de la propiedad createAppointmentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateAppointmentResponseType }
     *     
     */
    public void setCreateAppointmentResponse(GateAppointmentResponseType value) {
        this.createAppointmentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad readOrderResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.ReadOrderResponse }
     *     
     */
    public GateWebserviceResponseType.ReadOrderResponse getReadOrderResponse() {
        return readOrderResponse;
    }

    /**
     * Define el valor de la propiedad readOrderResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.ReadOrderResponse }
     *     
     */
    public void setReadOrderResponse(GateWebserviceResponseType.ReadOrderResponse value) {
        this.readOrderResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad requestStageDetailsResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.RequestStageDetailsResponse }
     *     
     */
    public GateWebserviceResponseType.RequestStageDetailsResponse getRequestStageDetailsResponse() {
        return requestStageDetailsResponse;
    }

    /**
     * Define el valor de la propiedad requestStageDetailsResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.RequestStageDetailsResponse }
     *     
     */
    public void setRequestStageDetailsResponse(GateWebserviceResponseType.RequestStageDetailsResponse value) {
        this.requestStageDetailsResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad updateAppointmentResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateAppointmentResponseType }
     *     
     */
    public GateAppointmentResponseType getUpdateAppointmentResponse() {
        return updateAppointmentResponse;
    }

    /**
     * Define el valor de la propiedad updateAppointmentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateAppointmentResponseType }
     *     
     */
    public void setUpdateAppointmentResponse(GateAppointmentResponseType value) {
        this.updateAppointmentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelAppointmentResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.CancelAppointmentResponse }
     *     
     */
    public GateWebserviceResponseType.CancelAppointmentResponse getCancelAppointmentResponse() {
        return cancelAppointmentResponse;
    }

    /**
     * Define el valor de la propiedad cancelAppointmentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.CancelAppointmentResponse }
     *     
     */
    public void setCancelAppointmentResponse(GateWebserviceResponseType.CancelAppointmentResponse value) {
        this.cancelAppointmentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad createTruckVisitAppointmentResponse.
     * 
     * @return
     *     possible object is
     *     {@link TruckVisitAppointmentResponseType }
     *     
     */
    public TruckVisitAppointmentResponseType getCreateTruckVisitAppointmentResponse() {
        return createTruckVisitAppointmentResponse;
    }

    /**
     * Define el valor de la propiedad createTruckVisitAppointmentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckVisitAppointmentResponseType }
     *     
     */
    public void setCreateTruckVisitAppointmentResponse(TruckVisitAppointmentResponseType value) {
        this.createTruckVisitAppointmentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad updateTruckVisitAppointmentResponse.
     * 
     * @return
     *     possible object is
     *     {@link TruckVisitAppointmentResponseType }
     *     
     */
    public TruckVisitAppointmentResponseType getUpdateTruckVisitAppointmentResponse() {
        return updateTruckVisitAppointmentResponse;
    }

    /**
     * Define el valor de la propiedad updateTruckVisitAppointmentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckVisitAppointmentResponseType }
     *     
     */
    public void setUpdateTruckVisitAppointmentResponse(TruckVisitAppointmentResponseType value) {
        this.updateTruckVisitAppointmentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelTruckVisitAppointmentResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.CancelTruckVisitAppointmentResponse }
     *     
     */
    public GateWebserviceResponseType.CancelTruckVisitAppointmentResponse getCancelTruckVisitAppointmentResponse() {
        return cancelTruckVisitAppointmentResponse;
    }

    /**
     * Define el valor de la propiedad cancelTruckVisitAppointmentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.CancelTruckVisitAppointmentResponse }
     *     
     */
    public void setCancelTruckVisitAppointmentResponse(GateWebserviceResponseType.CancelTruckVisitAppointmentResponse value) {
        this.cancelTruckVisitAppointmentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad customResponse.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceResponseType.CustomResponse }
     *     
     */
    public GateWebserviceResponseType.CustomResponse getCustomResponse() {
        return customResponse;
    }

    /**
     * Define el valor de la propiedad customResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceResponseType.CustomResponse }
     *     
     */
    public void setCustomResponse(GateWebserviceResponseType.CustomResponse value) {
        this.customResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad notifyWait.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNotifyWait() {
        return notifyWait;
    }

    /**
     * Define el valor de la propiedad notifyWait.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNotifyWait(Object value) {
        this.notifyWait = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentListResponseType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "appointments"
    })
    public static class CancelAppointmentResponse {

        protected AppointmentListResponseType appointments;

        /**
         * Obtiene el valor de la propiedad appointments.
         * 
         * @return
         *     possible object is
         *     {@link AppointmentListResponseType }
         *     
         */
        public AppointmentListResponseType getAppointments() {
            return appointments;
        }

        /**
         * Define el valor de la propiedad appointments.
         * 
         * @param value
         *     allowed object is
         *     {@link AppointmentListResponseType }
         *     
         */
        public void setAppointments(AppointmentListResponseType value) {
            this.appointments = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="truck-transaction" type="{http://www.navis.com/argo}TruckTransactionType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckTransaction"
    })
    public static class CancelTransactionResponse {

        @XmlElement(name = "truck-transaction")
        protected TruckTransactionType truckTransaction;

        /**
         * Obtiene el valor de la propiedad truckTransaction.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionType }
         *     
         */
        public TruckTransactionType getTruckTransaction() {
            return truckTransaction;
        }

        /**
         * Define el valor de la propiedad truckTransaction.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionType }
         *     
         */
        public void setTruckTransaction(TruckTransactionType value) {
            this.truckTransaction = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentListResponseType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "appointments"
    })
    public static class CancelTruckVisitAppointmentResponse {

        protected AppointmentListResponseType appointments;

        /**
         * Obtiene el valor de la propiedad appointments.
         * 
         * @return
         *     possible object is
         *     {@link AppointmentListResponseType }
         *     
         */
        public AppointmentListResponseType getAppointments() {
            return appointments;
        }

        /**
         * Define el valor de la propiedad appointments.
         * 
         * @param value
         *     allowed object is
         *     {@link AppointmentListResponseType }
         *     
         */
        public void setAppointments(AppointmentListResponseType value) {
            this.appointments = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType"/>
     *         &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckVisit",
        "truckTransactions"
    })
    public static class CancelTruckVisitResponse {

        @XmlElement(name = "truck-visit", required = true)
        protected TruckVisitWithTransactionsResponseType truckVisit;
        @XmlElement(name = "truck-transactions")
        protected TruckTransactionsType truckTransactions;

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public TruckVisitWithTransactionsResponseType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public void setTruckVisit(TruckVisitWithTransactionsResponseType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad truckTransactions.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionsType }
         *     
         */
        public TruckTransactionsType getTruckTransactions() {
            return truckTransactions;
        }

        /**
         * Define el valor de la propiedad truckTransactions.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionsType }
         *     
         */
        public void setTruckTransactions(TruckTransactionsType value) {
            this.truckTransactions = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitResponseType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckVisit"
    })
    public static class CreateTruckVisitResponse {

        @XmlElement(name = "truck-visit", required = true)
        protected TruckVisitResponseType truckVisit;

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitResponseType }
         *     
         */
        public TruckVisitResponseType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitResponseType }
         *     
         */
        public void setTruckVisit(TruckVisitResponseType value) {
            this.truckVisit = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class CustomResponse {

        @XmlAnyElement
        protected List<Element> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getAny() {
            if (any == null) {
                any = new ArrayList<Element>();
            }
            return this.any;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="truck-visits" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckVisits",
        "truckTransactions"
    })
    public static class ListTransactionsResponse {

        @XmlElement(name = "truck-visits")
        protected GateWebserviceResponseType.ListTransactionsResponse.TruckVisits truckVisits;
        @XmlElement(name = "truck-transactions")
        protected TruckTransactionsType truckTransactions;

        /**
         * Obtiene el valor de la propiedad truckVisits.
         * 
         * @return
         *     possible object is
         *     {@link GateWebserviceResponseType.ListTransactionsResponse.TruckVisits }
         *     
         */
        public GateWebserviceResponseType.ListTransactionsResponse.TruckVisits getTruckVisits() {
            return truckVisits;
        }

        /**
         * Define el valor de la propiedad truckVisits.
         * 
         * @param value
         *     allowed object is
         *     {@link GateWebserviceResponseType.ListTransactionsResponse.TruckVisits }
         *     
         */
        public void setTruckVisits(GateWebserviceResponseType.ListTransactionsResponse.TruckVisits value) {
            this.truckVisits = value;
        }

        /**
         * Obtiene el valor de la propiedad truckTransactions.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionsType }
         *     
         */
        public TruckTransactionsType getTruckTransactions() {
            return truckTransactions;
        }

        /**
         * Define el valor de la propiedad truckTransactions.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionsType }
         *     
         */
        public void setTruckTransactions(TruckTransactionsType value) {
            this.truckTransactions = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "truckVisit"
        })
        public static class TruckVisits {

            @XmlElement(name = "truck-visit")
            protected List<TruckVisitWithTransactionsResponseType> truckVisit;

            /**
             * Gets the value of the truckVisit property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the truckVisit property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTruckVisit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TruckVisitWithTransactionsResponseType }
             * 
             * 
             */
            public List<TruckVisitWithTransactionsResponseType> getTruckVisit() {
                if (truckVisit == null) {
                    truckVisit = new ArrayList<TruckVisitWithTransactionsResponseType>();
                }
                return this.truckVisit;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType" minOccurs="0"/>
     *         &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckVisit",
        "truckTransactions"
    })
    public static class NotifyArrivalResponse {

        @XmlElement(name = "truck-visit")
        protected TruckVisitWithTransactionsResponseType truckVisit;
        @XmlElement(name = "truck-transactions")
        protected TruckTransactionsType truckTransactions;
        @XmlAttribute(name = "action")
        protected String action;

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public TruckVisitWithTransactionsResponseType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public void setTruckVisit(TruckVisitWithTransactionsResponseType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad truckTransactions.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionsType }
         *     
         */
        public TruckTransactionsType getTruckTransactions() {
            return truckTransactions;
        }

        /**
         * Define el valor de la propiedad truckTransactions.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionsType }
         *     
         */
        public void setTruckTransactions(TruckTransactionsType value) {
            this.truckTransactions = value;
        }

        /**
         * Obtiene el valor de la propiedad action.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * Define el valor de la propiedad action.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="eq-orders">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="eq-order" type="{http://www.navis.com/argo}EqOrderType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eqOrders"
    })
    public static class ReadOrderResponse {

        @XmlElement(name = "eq-orders", required = true)
        protected GateWebserviceResponseType.ReadOrderResponse.EqOrders eqOrders;

        /**
         * Obtiene el valor de la propiedad eqOrders.
         * 
         * @return
         *     possible object is
         *     {@link GateWebserviceResponseType.ReadOrderResponse.EqOrders }
         *     
         */
        public GateWebserviceResponseType.ReadOrderResponse.EqOrders getEqOrders() {
            return eqOrders;
        }

        /**
         * Define el valor de la propiedad eqOrders.
         * 
         * @param value
         *     allowed object is
         *     {@link GateWebserviceResponseType.ReadOrderResponse.EqOrders }
         *     
         */
        public void setEqOrders(GateWebserviceResponseType.ReadOrderResponse.EqOrders value) {
            this.eqOrders = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="eq-order" type="{http://www.navis.com/argo}EqOrderType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "eqOrder"
        })
        public static class EqOrders {

            @XmlElement(name = "eq-order")
            protected List<EqOrderType> eqOrder;

            /**
             * Gets the value of the eqOrder property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the eqOrder property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEqOrder().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EqOrderType }
             * 
             * 
             */
            public List<EqOrderType> getEqOrder() {
                if (eqOrder == null) {
                    eqOrder = new ArrayList<EqOrderType>();
                }
                return this.eqOrder;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="unit" type="{http://www.navis.com/argo}tUnit" minOccurs="0"/>
     *         &lt;element name="appointment" type="{http://www.navis.com/argo}AppointmentType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unit",
        "appointment"
    })
    public static class ReadPreadviseResponse {

        protected TUnit unit;
        protected AppointmentType appointment;

        /**
         * Obtiene el valor de la propiedad unit.
         * 
         * @return
         *     possible object is
         *     {@link TUnit }
         *     
         */
        public TUnit getUnit() {
            return unit;
        }

        /**
         * Define el valor de la propiedad unit.
         * 
         * @param value
         *     allowed object is
         *     {@link TUnit }
         *     
         */
        public void setUnit(TUnit value) {
            this.unit = value;
        }

        /**
         * Obtiene el valor de la propiedad appointment.
         * 
         * @return
         *     possible object is
         *     {@link AppointmentType }
         *     
         */
        public AppointmentType getAppointment() {
            return appointment;
        }

        /**
         * Define el valor de la propiedad appointment.
         * 
         * @param value
         *     allowed object is
         *     {@link AppointmentType }
         *     
         */
        public void setAppointment(AppointmentType value) {
            this.appointment = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitResponseType"/>
     *         &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentsType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckVisit",
        "appointments"
    })
    public static class RequestPickupAppointmentsResponse {

        @XmlElement(name = "truck-visit", required = true)
        protected TruckVisitResponseType truckVisit;
        protected AppointmentsType appointments;

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitResponseType }
         *     
         */
        public TruckVisitResponseType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitResponseType }
         *     
         */
        public void setTruckVisit(TruckVisitResponseType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad appointments.
         * 
         * @return
         *     possible object is
         *     {@link AppointmentsType }
         *     
         */
        public AppointmentsType getAppointments() {
            return appointments;
        }

        /**
         * Define el valor de la propiedad appointments.
         * 
         * @param value
         *     allowed object is
         *     {@link AppointmentsType }
         *     
         */
        public void setAppointments(AppointmentsType value) {
            this.appointments = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="scans-expected" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="scan-expected" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
     *                             &lt;element name="equipment" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice maxOccurs="unbounded">
     *                                       &lt;element name="container" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="on-chassis-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="chassis" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/choice>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="last-stage-completion" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "scansExpected"
    })
    public static class RequestScansExpectedResponse {

        @XmlElement(name = "scans-expected")
        protected List<GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected> scansExpected;

        /**
         * Gets the value of the scansExpected property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scansExpected property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScansExpected().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected }
         * 
         * 
         */
        public List<GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected> getScansExpected() {
            if (scansExpected == null) {
                scansExpected = new ArrayList<GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected>();
            }
            return this.scansExpected;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="scan-expected" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
         *                   &lt;element name="equipment" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice maxOccurs="unbounded">
         *                             &lt;element name="container" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="on-chassis-id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="chassis" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/choice>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="last-stage-completion" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "scanExpected"
        })
        public static class ScansExpected {

            @XmlElement(name = "scan-expected")
            protected List<GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected> scanExpected;
            @XmlAttribute(name = "stage-id")
            protected String stageId;

            /**
             * Gets the value of the scanExpected property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the scanExpected property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getScanExpected().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected }
             * 
             * 
             */
            public List<GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected> getScanExpected() {
                if (scanExpected == null) {
                    scanExpected = new ArrayList<GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected>();
                }
                return this.scanExpected;
            }

            /**
             * Obtiene el valor de la propiedad stageId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStageId() {
                return stageId;
            }

            /**
             * Define el valor de la propiedad stageId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStageId(String value) {
                this.stageId = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
             *         &lt;element name="equipment" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice maxOccurs="unbounded">
             *                   &lt;element name="container" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="on-chassis-id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="chassis" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="last-stage-completion" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "truck",
                "equipment"
            })
            public static class ScanExpected {

                protected TruckType truck;
                protected GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected.Equipment equipment;
                @XmlAttribute(name = "last-stage-completion")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lastStageCompletion;

                /**
                 * Obtiene el valor de la propiedad truck.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TruckType }
                 *     
                 */
                public TruckType getTruck() {
                    return truck;
                }

                /**
                 * Define el valor de la propiedad truck.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TruckType }
                 *     
                 */
                public void setTruck(TruckType value) {
                    this.truck = value;
                }

                /**
                 * Obtiene el valor de la propiedad equipment.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected.Equipment }
                 *     
                 */
                public GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected.Equipment getEquipment() {
                    return equipment;
                }

                /**
                 * Define el valor de la propiedad equipment.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected.Equipment }
                 *     
                 */
                public void setEquipment(GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected.Equipment value) {
                    this.equipment = value;
                }

                /**
                 * Obtiene el valor de la propiedad lastStageCompletion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLastStageCompletion() {
                    return lastStageCompletion;
                }

                /**
                 * Define el valor de la propiedad lastStageCompletion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLastStageCompletion(XMLGregorianCalendar value) {
                    this.lastStageCompletion = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice maxOccurs="unbounded">
                 *         &lt;element name="container" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="on-chassis-id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="chassis" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "containerOrChassis"
                })
                public static class Equipment {

                    @XmlElements({
                        @XmlElement(name = "container", type = GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected.Equipment.Container.class),
                        @XmlElement(name = "chassis", type = GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected.Equipment.Chassis.class)
                    })
                    protected List<Object> containerOrChassis;

                    /**
                     * Gets the value of the containerOrChassis property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the containerOrChassis property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getContainerOrChassis().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected.Equipment.Container }
                     * {@link GateWebserviceResponseType.RequestScansExpectedResponse.ScansExpected.ScanExpected.Equipment.Chassis }
                     * 
                     * 
                     */
                    public List<Object> getContainerOrChassis() {
                        if (containerOrChassis == null) {
                            containerOrChassis = new ArrayList<Object>();
                        }
                        return this.containerOrChassis;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Chassis {

                        @XmlAttribute(name = "eqid")
                        protected String eqid;
                        @XmlAttribute(name = "type")
                        protected String type;

                        /**
                         * Obtiene el valor de la propiedad eqid.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEqid() {
                            return eqid;
                        }

                        /**
                         * Define el valor de la propiedad eqid.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEqid(String value) {
                            this.eqid = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad type.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getType() {
                            return type;
                        }

                        /**
                         * Define el valor de la propiedad type.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setType(String value) {
                            this.type = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="eqid" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="on-chassis-id" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Container {

                        @XmlAttribute(name = "eqid")
                        protected String eqid;
                        @XmlAttribute(name = "type")
                        protected String type;
                        @XmlAttribute(name = "on-chassis-id")
                        protected String onChassisId;

                        /**
                         * Obtiene el valor de la propiedad eqid.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEqid() {
                            return eqid;
                        }

                        /**
                         * Define el valor de la propiedad eqid.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEqid(String value) {
                            this.eqid = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad type.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getType() {
                            return type;
                        }

                        /**
                         * Define el valor de la propiedad type.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setType(String value) {
                            this.type = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad onChassisId.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOnChassisId() {
                            return onChassisId;
                        }

                        /**
                         * Define el valor de la propiedad onChassisId.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOnChassisId(String value) {
                            this.onChassisId = value;
                        }

                    }

                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="gate-stages" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="gate-stage" type="{http://www.navis.com/argo}GateStageType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="transaction-stages" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="transaction-stage" type="{http://www.navis.com/argo}TransactionStageType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gateStages",
        "transactionStages"
    })
    public static class RequestStageDetailsResponse {

        @XmlElement(name = "gate-stages")
        protected GateWebserviceResponseType.RequestStageDetailsResponse.GateStages gateStages;
        @XmlElement(name = "transaction-stages")
        protected GateWebserviceResponseType.RequestStageDetailsResponse.TransactionStages transactionStages;
        @XmlAttribute(name = "action")
        protected String action;

        /**
         * Obtiene el valor de la propiedad gateStages.
         * 
         * @return
         *     possible object is
         *     {@link GateWebserviceResponseType.RequestStageDetailsResponse.GateStages }
         *     
         */
        public GateWebserviceResponseType.RequestStageDetailsResponse.GateStages getGateStages() {
            return gateStages;
        }

        /**
         * Define el valor de la propiedad gateStages.
         * 
         * @param value
         *     allowed object is
         *     {@link GateWebserviceResponseType.RequestStageDetailsResponse.GateStages }
         *     
         */
        public void setGateStages(GateWebserviceResponseType.RequestStageDetailsResponse.GateStages value) {
            this.gateStages = value;
        }

        /**
         * Obtiene el valor de la propiedad transactionStages.
         * 
         * @return
         *     possible object is
         *     {@link GateWebserviceResponseType.RequestStageDetailsResponse.TransactionStages }
         *     
         */
        public GateWebserviceResponseType.RequestStageDetailsResponse.TransactionStages getTransactionStages() {
            return transactionStages;
        }

        /**
         * Define el valor de la propiedad transactionStages.
         * 
         * @param value
         *     allowed object is
         *     {@link GateWebserviceResponseType.RequestStageDetailsResponse.TransactionStages }
         *     
         */
        public void setTransactionStages(GateWebserviceResponseType.RequestStageDetailsResponse.TransactionStages value) {
            this.transactionStages = value;
        }

        /**
         * Obtiene el valor de la propiedad action.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * Define el valor de la propiedad action.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="gate-stage" type="{http://www.navis.com/argo}GateStageType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "gateStage"
        })
        public static class GateStages {

            @XmlElement(name = "gate-stage")
            protected List<GateStageType> gateStage;

            /**
             * Gets the value of the gateStage property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the gateStage property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGateStage().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GateStageType }
             * 
             * 
             */
            public List<GateStageType> getGateStage() {
                if (gateStage == null) {
                    gateStage = new ArrayList<GateStageType>();
                }
                return this.gateStage;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="transaction-stage" type="{http://www.navis.com/argo}TransactionStageType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "transactionStage"
        })
        public static class TransactionStages {

            @XmlElement(name = "transaction-stage")
            protected List<TransactionStageType> transactionStage;

            /**
             * Gets the value of the transactionStage property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the transactionStage property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTransactionStage().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TransactionStageType }
             * 
             * 
             */
            public List<TransactionStageType> getTransactionStage() {
                if (transactionStage == null) {
                    transactionStage = new ArrayList<TransactionStageType>();
                }
                return this.transactionStage;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckTransactions"
    })
    public static class RequestTroubleTransactionsResponse {

        @XmlElement(name = "truck-transactions")
        protected TruckTransactionsType truckTransactions;
        @XmlAttribute(name = "action")
        protected String action;

        /**
         * Obtiene el valor de la propiedad truckTransactions.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionsType }
         *     
         */
        public TruckTransactionsType getTruckTransactions() {
            return truckTransactions;
        }

        /**
         * Define el valor de la propiedad truckTransactions.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionsType }
         *     
         */
        public void setTruckTransactions(TruckTransactionsType value) {
            this.truckTransactions = value;
        }

        /**
         * Obtiene el valor de la propiedad action.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * Define el valor de la propiedad action.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType" minOccurs="0"/>
     *         &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckVisit",
        "truckTransactions"
    })
    public static class RequestVisitDetailsResponse {

        @XmlElement(name = "truck-visit")
        protected TruckVisitWithTransactionsResponseType truckVisit;
        @XmlElement(name = "truck-transactions")
        protected TruckTransactionsType truckTransactions;
        @XmlAttribute(name = "action")
        protected String action;

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public TruckVisitWithTransactionsResponseType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public void setTruckVisit(TruckVisitWithTransactionsResponseType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad truckTransactions.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionsType }
         *     
         */
        public TruckTransactionsType getTruckTransactions() {
            return truckTransactions;
        }

        /**
         * Define el valor de la propiedad truckTransactions.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionsType }
         *     
         */
        public void setTruckTransactions(TruckTransactionsType value) {
            this.truckTransactions = value;
        }

        /**
         * Obtiene el valor de la propiedad action.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * Define el valor de la propiedad action.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType"/>
     *         &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckVisit",
        "truckTransactions"
    })
    public static class StageDoneResponse {

        @XmlElement(name = "truck-visit", required = true)
        protected TruckVisitWithTransactionsResponseType truckVisit;
        @XmlElement(name = "truck-transactions")
        protected TruckTransactionsType truckTransactions;
        @XmlAttribute(name = "action")
        protected String action;

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public TruckVisitWithTransactionsResponseType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public void setTruckVisit(TruckVisitWithTransactionsResponseType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad truckTransactions.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionsType }
         *     
         */
        public TruckTransactionsType getTruckTransactions() {
            return truckTransactions;
        }

        /**
         * Define el valor de la propiedad truckTransactions.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionsType }
         *     
         */
        public void setTruckTransactions(TruckTransactionsType value) {
            this.truckTransactions = value;
        }

        /**
         * Obtiene el valor de la propiedad action.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * Define el valor de la propiedad action.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType"/>
     *         &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
     *         &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentsType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckVisit",
        "truckTransactions",
        "appointments"
    })
    public static class SubmitMultipleTransactionsResponse {

        @XmlElement(name = "truck-visit", required = true)
        protected TruckVisitWithTransactionsResponseType truckVisit;
        @XmlElement(name = "truck-transactions")
        protected TruckTransactionsType truckTransactions;
        protected AppointmentsType appointments;

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public TruckVisitWithTransactionsResponseType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public void setTruckVisit(TruckVisitWithTransactionsResponseType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad truckTransactions.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionsType }
         *     
         */
        public TruckTransactionsType getTruckTransactions() {
            return truckTransactions;
        }

        /**
         * Define el valor de la propiedad truckTransactions.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionsType }
         *     
         */
        public void setTruckTransactions(TruckTransactionsType value) {
            this.truckTransactions = value;
        }

        /**
         * Obtiene el valor de la propiedad appointments.
         * 
         * @return
         *     possible object is
         *     {@link AppointmentsType }
         *     
         */
        public AppointmentsType getAppointments() {
            return appointments;
        }

        /**
         * Define el valor de la propiedad appointments.
         * 
         * @param value
         *     allowed object is
         *     {@link AppointmentsType }
         *     
         */
        public void setAppointments(AppointmentsType value) {
            this.appointments = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitWithTransactionsResponseType"/>
     *         &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsType" minOccurs="0"/>
     *         &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentsType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckVisit",
        "truckTransactions",
        "appointments"
    })
    public static class SubmitTransactionResponse {

        @XmlElement(name = "truck-visit", required = true)
        protected TruckVisitWithTransactionsResponseType truckVisit;
        @XmlElement(name = "truck-transactions")
        protected TruckTransactionsType truckTransactions;
        protected AppointmentsType appointments;

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public TruckVisitWithTransactionsResponseType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitWithTransactionsResponseType }
         *     
         */
        public void setTruckVisit(TruckVisitWithTransactionsResponseType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad truckTransactions.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionsType }
         *     
         */
        public TruckTransactionsType getTruckTransactions() {
            return truckTransactions;
        }

        /**
         * Define el valor de la propiedad truckTransactions.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionsType }
         *     
         */
        public void setTruckTransactions(TruckTransactionsType value) {
            this.truckTransactions = value;
        }

        /**
         * Obtiene el valor de la propiedad appointments.
         * 
         * @return
         *     possible object is
         *     {@link AppointmentsType }
         *     
         */
        public AppointmentsType getAppointments() {
            return appointments;
        }

        /**
         * Define el valor de la propiedad appointments.
         * 
         * @param value
         *     allowed object is
         *     {@link AppointmentsType }
         *     
         */
        public void setAppointments(AppointmentsType value) {
            this.appointments = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitResponseType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckVisit"
    })
    public static class UpdateTruckVisitResponse {

        @XmlElement(name = "truck-visit")
        protected TruckVisitResponseType truckVisit;

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitResponseType }
         *     
         */
        public TruckVisitResponseType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitResponseType }
         *     
         */
        public void setTruckVisit(TruckVisitResponseType value) {
            this.truckVisit = value;
        }

    }

}
