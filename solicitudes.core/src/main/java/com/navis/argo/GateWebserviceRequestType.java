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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.w3c.dom.Element;


/**
 * Action to be processed by the gate webservice
 * 
 * <p>Clase Java para GateWebserviceRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GateWebserviceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="record-scan" type="{http://www.navis.com/argo}ScanType"/>
 *         &lt;element name="process-truck">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.navis.com/argo}ScanType">
 *                 &lt;attribute name="send-to-trouble" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="do-stage-done" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="no-content" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="xps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="retry" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="submit-transaction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
 *                   &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
 *                   &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
 *                   &lt;element name="truck-transaction" type="{http://www.navis.com/argo}TruckTransactionRequestType"/>
 *                   &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="list-appointments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="no-content" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="xps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="retry" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="submit-multiple-transactions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
 *                   &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
 *                   &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
 *                   &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsRequestType"/>
 *                   &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="no-content" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="xps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="retry" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stage-done">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
 *                   &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
 *                   &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="no-content" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="xps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="retry" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="request-pickup-appointments">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitType"/>
 *                   &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="create-truck-visit" type="{http://www.navis.com/argo}TruckScanType"/>
 *         &lt;element name="read-preadvise">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="container">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="eqid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="need-assistance">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="record-truck-event">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="truck-event">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cancel-transaction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="truck-transaction" type="{http://www.navis.com/argo}TruckTransactionCancellationRequestType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cancel-truck-visit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notify-arrival">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="exchange-area-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
 *                   &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
 *                   &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitType" minOccurs="0"/>
 *                   &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="request-visit-details">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
 *                   &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
 *                   &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="no-content" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="include-complete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="request-scans-expected">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="list-transactions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transaction-filter" type="{http://www.navis.com/argo}TruckTransactionFilterType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="create-appointment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.navis.com/argo}GateAppointmentRequestType">
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="update-appointment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.navis.com/argo}GateAppointmentRequestType">
 *                 &lt;sequence>
 *                   &lt;element name="appointment-nbr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cancel-appointment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentListRequestType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="request-trouble-transactions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="truck-transaction" type="{http://www.navis.com/argo}TruckTransactionRequestType" minOccurs="0"/>
 *                   &lt;element name="line-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="start-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="end-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="read-order">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="eq-order" type="{http://www.navis.com/argo}EqOrderType"/>
 *                   &lt;element name="container" type="{http://www.navis.com/argo}ContainerType"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="update-truck-visit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
 *                   &lt;element name="driver" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="card-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="license-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
 *                   &lt;element name="scale-weight" type="{http://www.navis.com/argo}ScaleWeightType" minOccurs="0"/>
 *                   &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="request-stage-details">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tran-type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="RE"/>
 *                         &lt;enumeration value="RI"/>
 *                         &lt;enumeration value="RM"/>
 *                         &lt;enumeration value="RC"/>
 *                         &lt;enumeration value="RB"/>
 *                         &lt;enumeration value="DE"/>
 *                         &lt;enumeration value="DI"/>
 *                         &lt;enumeration value="DM"/>
 *                         &lt;enumeration value="DC"/>
 *                         &lt;enumeration value="TC"/>
 *                         &lt;enumeration value="UK"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
 *                   &lt;element name="truck-transaction" type="{http://www.navis.com/argo}TruckTransactionRequestType" minOccurs="0"/>
 *                   &lt;element name="stage-status" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="CREATED"/>
 *                         &lt;enumeration value="COMPLETE"/>
 *                         &lt;enumeration value="TROUBLE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="stage-type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="STANDARD"/>
 *                         &lt;enumeration value="EXCEPTION"/>
 *                         &lt;enumeration value=""/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="create-truck-visit-appointment" type="{http://www.navis.com/argo}TruckVisitAppointmentRequestType"/>
 *         &lt;element name="update-truck-visit-appointment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.navis.com/argo}TruckVisitAppointmentRequestType">
 *                 &lt;sequence>
 *                   &lt;element name="appointment-nbr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cancel-truck-visit-appointment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentListRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="custom">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="api-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="locale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GateWebserviceRequestType", propOrder = {
    "recordScan",
    "processTruck",
    "submitTransaction",
    "submitMultipleTransactions",
    "stageDone",
    "requestPickupAppointments",
    "createTruckVisit",
    "readPreadvise",
    "needAssistance",
    "recordTruckEvent",
    "cancelTransaction",
    "cancelTruckVisit",
    "notifyArrival",
    "requestVisitDetails",
    "requestScansExpected",
    "listTransactions",
    "createAppointment",
    "updateAppointment",
    "cancelAppointment",
    "requestTroubleTransactions",
    "readOrder",
    "updateTruckVisit",
    "requestStageDetails",
    "createTruckVisitAppointment",
    "updateTruckVisitAppointment",
    "cancelTruckVisitAppointment",
    "custom"
})
//added by Objectwave, required to make jaxb work
@XmlRootElement(name="gate")
public class GateWebserviceRequestType {

    @XmlElement(name = "record-scan")
    protected ScanType recordScan;
    @XmlElement(name = "process-truck")
    protected GateWebserviceRequestType.ProcessTruck processTruck;
    @XmlElement(name = "submit-transaction")
    protected GateWebserviceRequestType.SubmitTransaction submitTransaction;
    @XmlElement(name = "submit-multiple-transactions")
    protected GateWebserviceRequestType.SubmitMultipleTransactions submitMultipleTransactions;
    @XmlElement(name = "stage-done")
    protected GateWebserviceRequestType.StageDone stageDone;
    @XmlElement(name = "request-pickup-appointments")
    protected GateWebserviceRequestType.RequestPickupAppointments requestPickupAppointments;
    @XmlElement(name = "create-truck-visit")
    protected TruckScanType createTruckVisit;
    @XmlElement(name = "read-preadvise")
    protected GateWebserviceRequestType.ReadPreadvise readPreadvise;
    @XmlElement(name = "need-assistance")
    protected GateWebserviceRequestType.NeedAssistance needAssistance;
    @XmlElement(name = "record-truck-event")
    protected GateWebserviceRequestType.RecordTruckEvent recordTruckEvent;
    @XmlElement(name = "cancel-transaction")
    protected GateWebserviceRequestType.CancelTransaction cancelTransaction;
    @XmlElement(name = "cancel-truck-visit")
    protected GateWebserviceRequestType.CancelTruckVisit cancelTruckVisit;
    @XmlElement(name = "notify-arrival")
    protected GateWebserviceRequestType.NotifyArrival notifyArrival;
    @XmlElement(name = "request-visit-details")
    protected GateWebserviceRequestType.RequestVisitDetails requestVisitDetails;
    @XmlElement(name = "request-scans-expected")
    protected GateWebserviceRequestType.RequestScansExpected requestScansExpected;
    @XmlElement(name = "list-transactions")
    protected GateWebserviceRequestType.ListTransactions listTransactions;
    @XmlElement(name = "create-appointment")
    protected GateWebserviceRequestType.CreateAppointment createAppointment;
    @XmlElement(name = "update-appointment")
    protected GateWebserviceRequestType.UpdateAppointment updateAppointment;
    @XmlElement(name = "cancel-appointment")
    protected GateWebserviceRequestType.CancelAppointment cancelAppointment;
    @XmlElement(name = "request-trouble-transactions")
    protected GateWebserviceRequestType.RequestTroubleTransactions requestTroubleTransactions;
    @XmlElement(name = "read-order")
    protected GateWebserviceRequestType.ReadOrder readOrder;
    @XmlElement(name = "update-truck-visit")
    protected GateWebserviceRequestType.UpdateTruckVisit updateTruckVisit;
    @XmlElement(name = "request-stage-details")
    protected GateWebserviceRequestType.RequestStageDetails requestStageDetails;
    @XmlElement(name = "create-truck-visit-appointment")
    protected TruckVisitAppointmentRequestType createTruckVisitAppointment;
    @XmlElement(name = "update-truck-visit-appointment")
    protected GateWebserviceRequestType.UpdateTruckVisitAppointment updateTruckVisitAppointment;
    @XmlElement(name = "cancel-truck-visit-appointment")
    protected GateWebserviceRequestType.CancelTruckVisitAppointment cancelTruckVisitAppointment;
    protected GateWebserviceRequestType.Custom custom;
    @XmlAttribute(name = "locale")
    protected String locale;

    /**
     * Obtiene el valor de la propiedad recordScan.
     * 
     * @return
     *     possible object is
     *     {@link ScanType }
     *     
     */
    public ScanType getRecordScan() {
        return recordScan;
    }

    /**
     * Define el valor de la propiedad recordScan.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanType }
     *     
     */
    public void setRecordScan(ScanType value) {
        this.recordScan = value;
    }

    /**
     * Obtiene el valor de la propiedad processTruck.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.ProcessTruck }
     *     
     */
    public GateWebserviceRequestType.ProcessTruck getProcessTruck() {
        return processTruck;
    }

    /**
     * Define el valor de la propiedad processTruck.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.ProcessTruck }
     *     
     */
    public void setProcessTruck(GateWebserviceRequestType.ProcessTruck value) {
        this.processTruck = value;
    }

    /**
     * Obtiene el valor de la propiedad submitTransaction.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.SubmitTransaction }
     *     
     */
    public GateWebserviceRequestType.SubmitTransaction getSubmitTransaction() {
        return submitTransaction;
    }

    /**
     * Define el valor de la propiedad submitTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.SubmitTransaction }
     *     
     */
    public void setSubmitTransaction(GateWebserviceRequestType.SubmitTransaction value) {
        this.submitTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad submitMultipleTransactions.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.SubmitMultipleTransactions }
     *     
     */
    public GateWebserviceRequestType.SubmitMultipleTransactions getSubmitMultipleTransactions() {
        return submitMultipleTransactions;
    }

    /**
     * Define el valor de la propiedad submitMultipleTransactions.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.SubmitMultipleTransactions }
     *     
     */
    public void setSubmitMultipleTransactions(GateWebserviceRequestType.SubmitMultipleTransactions value) {
        this.submitMultipleTransactions = value;
    }

    /**
     * Obtiene el valor de la propiedad stageDone.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.StageDone }
     *     
     */
    public GateWebserviceRequestType.StageDone getStageDone() {
        return stageDone;
    }

    /**
     * Define el valor de la propiedad stageDone.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.StageDone }
     *     
     */
    public void setStageDone(GateWebserviceRequestType.StageDone value) {
        this.stageDone = value;
    }

    /**
     * Obtiene el valor de la propiedad requestPickupAppointments.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.RequestPickupAppointments }
     *     
     */
    public GateWebserviceRequestType.RequestPickupAppointments getRequestPickupAppointments() {
        return requestPickupAppointments;
    }

    /**
     * Define el valor de la propiedad requestPickupAppointments.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.RequestPickupAppointments }
     *     
     */
    public void setRequestPickupAppointments(GateWebserviceRequestType.RequestPickupAppointments value) {
        this.requestPickupAppointments = value;
    }

    /**
     * Obtiene el valor de la propiedad createTruckVisit.
     * 
     * @return
     *     possible object is
     *     {@link TruckScanType }
     *     
     */
    public TruckScanType getCreateTruckVisit() {
        return createTruckVisit;
    }

    /**
     * Define el valor de la propiedad createTruckVisit.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckScanType }
     *     
     */
    public void setCreateTruckVisit(TruckScanType value) {
        this.createTruckVisit = value;
    }

    /**
     * Obtiene el valor de la propiedad readPreadvise.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.ReadPreadvise }
     *     
     */
    public GateWebserviceRequestType.ReadPreadvise getReadPreadvise() {
        return readPreadvise;
    }

    /**
     * Define el valor de la propiedad readPreadvise.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.ReadPreadvise }
     *     
     */
    public void setReadPreadvise(GateWebserviceRequestType.ReadPreadvise value) {
        this.readPreadvise = value;
    }

    /**
     * Obtiene el valor de la propiedad needAssistance.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.NeedAssistance }
     *     
     */
    public GateWebserviceRequestType.NeedAssistance getNeedAssistance() {
        return needAssistance;
    }

    /**
     * Define el valor de la propiedad needAssistance.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.NeedAssistance }
     *     
     */
    public void setNeedAssistance(GateWebserviceRequestType.NeedAssistance value) {
        this.needAssistance = value;
    }

    /**
     * Obtiene el valor de la propiedad recordTruckEvent.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.RecordTruckEvent }
     *     
     */
    public GateWebserviceRequestType.RecordTruckEvent getRecordTruckEvent() {
        return recordTruckEvent;
    }

    /**
     * Define el valor de la propiedad recordTruckEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.RecordTruckEvent }
     *     
     */
    public void setRecordTruckEvent(GateWebserviceRequestType.RecordTruckEvent value) {
        this.recordTruckEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelTransaction.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.CancelTransaction }
     *     
     */
    public GateWebserviceRequestType.CancelTransaction getCancelTransaction() {
        return cancelTransaction;
    }

    /**
     * Define el valor de la propiedad cancelTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.CancelTransaction }
     *     
     */
    public void setCancelTransaction(GateWebserviceRequestType.CancelTransaction value) {
        this.cancelTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelTruckVisit.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.CancelTruckVisit }
     *     
     */
    public GateWebserviceRequestType.CancelTruckVisit getCancelTruckVisit() {
        return cancelTruckVisit;
    }

    /**
     * Define el valor de la propiedad cancelTruckVisit.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.CancelTruckVisit }
     *     
     */
    public void setCancelTruckVisit(GateWebserviceRequestType.CancelTruckVisit value) {
        this.cancelTruckVisit = value;
    }

    /**
     * Obtiene el valor de la propiedad notifyArrival.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.NotifyArrival }
     *     
     */
    public GateWebserviceRequestType.NotifyArrival getNotifyArrival() {
        return notifyArrival;
    }

    /**
     * Define el valor de la propiedad notifyArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.NotifyArrival }
     *     
     */
    public void setNotifyArrival(GateWebserviceRequestType.NotifyArrival value) {
        this.notifyArrival = value;
    }

    /**
     * Obtiene el valor de la propiedad requestVisitDetails.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.RequestVisitDetails }
     *     
     */
    public GateWebserviceRequestType.RequestVisitDetails getRequestVisitDetails() {
        return requestVisitDetails;
    }

    /**
     * Define el valor de la propiedad requestVisitDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.RequestVisitDetails }
     *     
     */
    public void setRequestVisitDetails(GateWebserviceRequestType.RequestVisitDetails value) {
        this.requestVisitDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad requestScansExpected.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.RequestScansExpected }
     *     
     */
    public GateWebserviceRequestType.RequestScansExpected getRequestScansExpected() {
        return requestScansExpected;
    }

    /**
     * Define el valor de la propiedad requestScansExpected.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.RequestScansExpected }
     *     
     */
    public void setRequestScansExpected(GateWebserviceRequestType.RequestScansExpected value) {
        this.requestScansExpected = value;
    }

    /**
     * Obtiene el valor de la propiedad listTransactions.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.ListTransactions }
     *     
     */
    public GateWebserviceRequestType.ListTransactions getListTransactions() {
        return listTransactions;
    }

    /**
     * Define el valor de la propiedad listTransactions.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.ListTransactions }
     *     
     */
    public void setListTransactions(GateWebserviceRequestType.ListTransactions value) {
        this.listTransactions = value;
    }

    /**
     * Obtiene el valor de la propiedad createAppointment.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.CreateAppointment }
     *     
     */
    public GateWebserviceRequestType.CreateAppointment getCreateAppointment() {
        return createAppointment;
    }

    /**
     * Define el valor de la propiedad createAppointment.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.CreateAppointment }
     *     
     */
    public void setCreateAppointment(GateWebserviceRequestType.CreateAppointment value) {
        this.createAppointment = value;
    }

    /**
     * Obtiene el valor de la propiedad updateAppointment.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.UpdateAppointment }
     *     
     */
    public GateWebserviceRequestType.UpdateAppointment getUpdateAppointment() {
        return updateAppointment;
    }

    /**
     * Define el valor de la propiedad updateAppointment.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.UpdateAppointment }
     *     
     */
    public void setUpdateAppointment(GateWebserviceRequestType.UpdateAppointment value) {
        this.updateAppointment = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelAppointment.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.CancelAppointment }
     *     
     */
    public GateWebserviceRequestType.CancelAppointment getCancelAppointment() {
        return cancelAppointment;
    }

    /**
     * Define el valor de la propiedad cancelAppointment.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.CancelAppointment }
     *     
     */
    public void setCancelAppointment(GateWebserviceRequestType.CancelAppointment value) {
        this.cancelAppointment = value;
    }

    /**
     * Obtiene el valor de la propiedad requestTroubleTransactions.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.RequestTroubleTransactions }
     *     
     */
    public GateWebserviceRequestType.RequestTroubleTransactions getRequestTroubleTransactions() {
        return requestTroubleTransactions;
    }

    /**
     * Define el valor de la propiedad requestTroubleTransactions.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.RequestTroubleTransactions }
     *     
     */
    public void setRequestTroubleTransactions(GateWebserviceRequestType.RequestTroubleTransactions value) {
        this.requestTroubleTransactions = value;
    }

    /**
     * Obtiene el valor de la propiedad readOrder.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.ReadOrder }
     *     
     */
    public GateWebserviceRequestType.ReadOrder getReadOrder() {
        return readOrder;
    }

    /**
     * Define el valor de la propiedad readOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.ReadOrder }
     *     
     */
    public void setReadOrder(GateWebserviceRequestType.ReadOrder value) {
        this.readOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad updateTruckVisit.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.UpdateTruckVisit }
     *     
     */
    public GateWebserviceRequestType.UpdateTruckVisit getUpdateTruckVisit() {
        return updateTruckVisit;
    }

    /**
     * Define el valor de la propiedad updateTruckVisit.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.UpdateTruckVisit }
     *     
     */
    public void setUpdateTruckVisit(GateWebserviceRequestType.UpdateTruckVisit value) {
        this.updateTruckVisit = value;
    }

    /**
     * Obtiene el valor de la propiedad requestStageDetails.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.RequestStageDetails }
     *     
     */
    public GateWebserviceRequestType.RequestStageDetails getRequestStageDetails() {
        return requestStageDetails;
    }

    /**
     * Define el valor de la propiedad requestStageDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.RequestStageDetails }
     *     
     */
    public void setRequestStageDetails(GateWebserviceRequestType.RequestStageDetails value) {
        this.requestStageDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad createTruckVisitAppointment.
     * 
     * @return
     *     possible object is
     *     {@link TruckVisitAppointmentRequestType }
     *     
     */
    public TruckVisitAppointmentRequestType getCreateTruckVisitAppointment() {
        return createTruckVisitAppointment;
    }

    /**
     * Define el valor de la propiedad createTruckVisitAppointment.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckVisitAppointmentRequestType }
     *     
     */
    public void setCreateTruckVisitAppointment(TruckVisitAppointmentRequestType value) {
        this.createTruckVisitAppointment = value;
    }

    /**
     * Obtiene el valor de la propiedad updateTruckVisitAppointment.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.UpdateTruckVisitAppointment }
     *     
     */
    public GateWebserviceRequestType.UpdateTruckVisitAppointment getUpdateTruckVisitAppointment() {
        return updateTruckVisitAppointment;
    }

    /**
     * Define el valor de la propiedad updateTruckVisitAppointment.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.UpdateTruckVisitAppointment }
     *     
     */
    public void setUpdateTruckVisitAppointment(GateWebserviceRequestType.UpdateTruckVisitAppointment value) {
        this.updateTruckVisitAppointment = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelTruckVisitAppointment.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.CancelTruckVisitAppointment }
     *     
     */
    public GateWebserviceRequestType.CancelTruckVisitAppointment getCancelTruckVisitAppointment() {
        return cancelTruckVisitAppointment;
    }

    /**
     * Define el valor de la propiedad cancelTruckVisitAppointment.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.CancelTruckVisitAppointment }
     *     
     */
    public void setCancelTruckVisitAppointment(GateWebserviceRequestType.CancelTruckVisitAppointment value) {
        this.cancelTruckVisitAppointment = value;
    }

    /**
     * Obtiene el valor de la propiedad custom.
     * 
     * @return
     *     possible object is
     *     {@link GateWebserviceRequestType.Custom }
     *     
     */
    public GateWebserviceRequestType.Custom getCustom() {
        return custom;
    }

    /**
     * Define el valor de la propiedad custom.
     * 
     * @param value
     *     allowed object is
     *     {@link GateWebserviceRequestType.Custom }
     *     
     */
    public void setCustom(GateWebserviceRequestType.Custom value) {
        this.custom = value;
    }

    /**
     * Obtiene el valor de la propiedad locale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Define el valor de la propiedad locale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
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
     *         &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentListRequestType" minOccurs="0"/>
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
    public static class CancelAppointment {

        protected AppointmentListRequestType appointments;

        /**
         * Obtiene el valor de la propiedad appointments.
         * 
         * @return
         *     possible object is
         *     {@link AppointmentListRequestType }
         *     
         */
        public AppointmentListRequestType getAppointments() {
            return appointments;
        }

        /**
         * Define el valor de la propiedad appointments.
         * 
         * @param value
         *     allowed object is
         *     {@link AppointmentListRequestType }
         *     
         */
        public void setAppointments(AppointmentListRequestType value) {
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
     *         &lt;element name="truck-transaction" type="{http://www.navis.com/argo}TruckTransactionCancellationRequestType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
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
    public static class CancelTransaction {

        @XmlElement(name = "truck-transaction", required = true)
        protected TruckTransactionCancellationRequestType truckTransaction;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad truckTransaction.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionCancellationRequestType }
         *     
         */
        public TruckTransactionCancellationRequestType getTruckTransaction() {
            return truckTransaction;
        }

        /**
         * Define el valor de la propiedad truckTransaction.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionCancellationRequestType }
         *     
         */
        public void setTruckTransaction(TruckTransactionCancellationRequestType value) {
            this.truckTransaction = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
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
    public static class CancelTruckVisit {

        @XmlElement(name = "truck-visit", required = true)
        protected TruckVisitRequestType truckVisit;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public TruckVisitRequestType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public void setTruckVisit(TruckVisitRequestType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="appointments" type="{http://www.navis.com/argo}AppointmentListRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class CancelTruckVisitAppointment {

        protected List<AppointmentListRequestType> appointments;

        /**
         * Gets the value of the appointments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the appointments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAppointments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AppointmentListRequestType }
         * 
         * 
         */
        public List<AppointmentListRequestType> getAppointments() {
            if (appointments == null) {
                appointments = new ArrayList<AppointmentListRequestType>();
            }
            return this.appointments;
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
     *     &lt;extension base="{http://www.navis.com/argo}GateAppointmentRequestType">
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CreateAppointment
        extends GateAppointmentRequestType
    {

        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *       &lt;attribute name="api-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Custom {

        @XmlAnyElement
        protected List<Element> any;
        @XmlAttribute(name = "api-name", required = true)
        protected String apiName;

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

        /**
         * Obtiene el valor de la propiedad apiName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApiName() {
            return apiName;
        }

        /**
         * Define el valor de la propiedad apiName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApiName(String value) {
            this.apiName = value;
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
     *         &lt;element name="transaction-filter" type="{http://www.navis.com/argo}TruckTransactionFilterType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transactionFilter"
    })
    public static class ListTransactions {

        @XmlElement(name = "transaction-filter", required = true)
        protected List<TruckTransactionFilterType> transactionFilter;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Gets the value of the transactionFilter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transactionFilter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransactionFilter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TruckTransactionFilterType }
         * 
         * 
         */
        public List<TruckTransactionFilterType> getTransactionFilter() {
            if (transactionFilter == null) {
                transactionFilter = new ArrayList<TruckTransactionFilterType>();
            }
            return this.transactionFilter;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gateId",
        "stageId",
        "laneId",
        "truckVisit"
    })
    public static class NeedAssistance {

        @XmlElement(name = "gate-id", required = true)
        protected String gateId;
        @XmlElement(name = "stage-id", required = true)
        protected String stageId;
        @XmlElement(name = "lane-id", required = true)
        protected String laneId;
        @XmlElement(name = "truck-visit", required = true)
        protected TruckVisitType truckVisit;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad gateId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateId() {
            return gateId;
        }

        /**
         * Define el valor de la propiedad gateId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateId(String value) {
            this.gateId = value;
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
         * Obtiene el valor de la propiedad laneId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLaneId() {
            return laneId;
        }

        /**
         * Define el valor de la propiedad laneId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLaneId(String value) {
            this.laneId = value;
        }

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitType }
         *     
         */
        public TruckVisitType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitType }
         *     
         */
        public void setTruckVisit(TruckVisitType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="exchange-area-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
     *         &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitType" minOccurs="0"/>
     *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gateId",
        "stageId",
        "exchangeAreaId",
        "laneId",
        "truck",
        "driver",
        "truckVisit",
        "timestamp"
    })
    public static class NotifyArrival {

        @XmlElement(name = "gate-id")
        protected String gateId;
        @XmlElement(name = "stage-id", required = true)
        protected String stageId;
        @XmlElement(name = "exchange-area-id")
        protected String exchangeAreaId;
        @XmlElement(name = "lane-id")
        protected String laneId;
        protected TruckType truck;
        protected DriverType driver;
        @XmlElement(name = "truck-visit")
        protected TruckVisitType truckVisit;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad gateId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateId() {
            return gateId;
        }

        /**
         * Define el valor de la propiedad gateId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateId(String value) {
            this.gateId = value;
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
         * Obtiene el valor de la propiedad exchangeAreaId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExchangeAreaId() {
            return exchangeAreaId;
        }

        /**
         * Define el valor de la propiedad exchangeAreaId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExchangeAreaId(String value) {
            this.exchangeAreaId = value;
        }

        /**
         * Obtiene el valor de la propiedad laneId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLaneId() {
            return laneId;
        }

        /**
         * Define el valor de la propiedad laneId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLaneId(String value) {
            this.laneId = value;
        }

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
         * Obtiene el valor de la propiedad driver.
         * 
         * @return
         *     possible object is
         *     {@link DriverType }
         *     
         */
        public DriverType getDriver() {
            return driver;
        }

        /**
         * Define el valor de la propiedad driver.
         * 
         * @param value
         *     allowed object is
         *     {@link DriverType }
         *     
         */
        public void setDriver(DriverType value) {
            this.driver = value;
        }

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitType }
         *     
         */
        public TruckVisitType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitType }
         *     
         */
        public void setTruckVisit(TruckVisitType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad timestamp.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Define el valor de la propiedad timestamp.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *     &lt;extension base="{http://www.navis.com/argo}ScanType">
     *       &lt;attribute name="send-to-trouble" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="do-stage-done" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="no-content" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="xps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="retry" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProcessTruck
        extends ScanType
    {

        @XmlAttribute(name = "send-to-trouble")
        protected Boolean sendToTrouble;
        @XmlAttribute(name = "do-stage-done")
        protected Boolean doStageDone;
        @XmlAttribute(name = "no-content")
        protected Boolean noContent;
        @XmlAttribute(name = "xps")
        protected Boolean xps;
        @XmlAttribute(name = "retry")
        protected Boolean retry;

        /**
         * Obtiene el valor de la propiedad sendToTrouble.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSendToTrouble() {
            if (sendToTrouble == null) {
                return false;
            } else {
                return sendToTrouble;
            }
        }

        /**
         * Define el valor de la propiedad sendToTrouble.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendToTrouble(Boolean value) {
            this.sendToTrouble = value;
        }

        /**
         * Obtiene el valor de la propiedad doStageDone.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isDoStageDone() {
            if (doStageDone == null) {
                return true;
            } else {
                return doStageDone;
            }
        }

        /**
         * Define el valor de la propiedad doStageDone.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDoStageDone(Boolean value) {
            this.doStageDone = value;
        }

        /**
         * Obtiene el valor de la propiedad noContent.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNoContent() {
            if (noContent == null) {
                return false;
            } else {
                return noContent;
            }
        }

        /**
         * Define el valor de la propiedad noContent.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoContent(Boolean value) {
            this.noContent = value;
        }

        /**
         * Obtiene el valor de la propiedad xps.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isXps() {
            if (xps == null) {
                return true;
            } else {
                return xps;
            }
        }

        /**
         * Define el valor de la propiedad xps.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setXps(Boolean value) {
            this.xps = value;
        }

        /**
         * Obtiene el valor de la propiedad retry.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRetry() {
            if (retry == null) {
                return true;
            } else {
                return retry;
            }
        }

        /**
         * Define el valor de la propiedad retry.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRetry(Boolean value) {
            this.retry = value;
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
     *         &lt;element name="eq-order" type="{http://www.navis.com/argo}EqOrderType"/>
     *         &lt;element name="container" type="{http://www.navis.com/argo}ContainerType"/>
     *       &lt;/choice>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eqOrder",
        "container"
    })
    public static class ReadOrder {

        @XmlElement(name = "eq-order")
        protected EqOrderType eqOrder;
        protected ContainerType container;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad eqOrder.
         * 
         * @return
         *     possible object is
         *     {@link EqOrderType }
         *     
         */
        public EqOrderType getEqOrder() {
            return eqOrder;
        }

        /**
         * Define el valor de la propiedad eqOrder.
         * 
         * @param value
         *     allowed object is
         *     {@link EqOrderType }
         *     
         */
        public void setEqOrder(EqOrderType value) {
            this.eqOrder = value;
        }

        /**
         * Obtiene el valor de la propiedad container.
         * 
         * @return
         *     possible object is
         *     {@link ContainerType }
         *     
         */
        public ContainerType getContainer() {
            return container;
        }

        /**
         * Define el valor de la propiedad container.
         * 
         * @param value
         *     allowed object is
         *     {@link ContainerType }
         *     
         */
        public void setContainer(ContainerType value) {
            this.container = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="container">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="eqid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "container"
    })
    public static class ReadPreadvise {

        @XmlElement(required = true)
        protected GateWebserviceRequestType.ReadPreadvise.Container container;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad container.
         * 
         * @return
         *     possible object is
         *     {@link GateWebserviceRequestType.ReadPreadvise.Container }
         *     
         */
        public GateWebserviceRequestType.ReadPreadvise.Container getContainer() {
            return container;
        }

        /**
         * Define el valor de la propiedad container.
         * 
         * @param value
         *     allowed object is
         *     {@link GateWebserviceRequestType.ReadPreadvise.Container }
         *     
         */
        public void setContainer(GateWebserviceRequestType.ReadPreadvise.Container value) {
            this.container = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
         *       &lt;attribute name="eqid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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

            @XmlAttribute(name = "eqid", required = true)
            protected String eqid;

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
     *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="truck-event">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gateId",
        "stageId",
        "laneId",
        "truckEvent"
    })
    public static class RecordTruckEvent {

        @XmlElement(name = "gate-id", required = true)
        protected String gateId;
        @XmlElement(name = "stage-id", required = true)
        protected String stageId;
        @XmlElement(name = "lane-id", required = true)
        protected String laneId;
        @XmlElement(name = "truck-event", required = true)
        protected GateWebserviceRequestType.RecordTruckEvent.TruckEvent truckEvent;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad gateId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateId() {
            return gateId;
        }

        /**
         * Define el valor de la propiedad gateId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateId(String value) {
            this.gateId = value;
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
         * Obtiene el valor de la propiedad laneId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLaneId() {
            return laneId;
        }

        /**
         * Define el valor de la propiedad laneId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLaneId(String value) {
            this.laneId = value;
        }

        /**
         * Obtiene el valor de la propiedad truckEvent.
         * 
         * @return
         *     possible object is
         *     {@link GateWebserviceRequestType.RecordTruckEvent.TruckEvent }
         *     
         */
        public GateWebserviceRequestType.RecordTruckEvent.TruckEvent getTruckEvent() {
            return truckEvent;
        }

        /**
         * Define el valor de la propiedad truckEvent.
         * 
         * @param value
         *     allowed object is
         *     {@link GateWebserviceRequestType.RecordTruckEvent.TruckEvent }
         *     
         */
        public void setTruckEvent(GateWebserviceRequestType.RecordTruckEvent.TruckEvent value) {
            this.truckEvent = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TruckEvent {

            @XmlAttribute(name = "type", required = true)
            protected String type;

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
     *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitType"/>
     *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gateId",
        "truckVisit",
        "timestamp"
    })
    public static class RequestPickupAppointments {

        @XmlElement(name = "gate-id", required = true)
        protected String gateId;
        @XmlElement(name = "truck-visit", required = true)
        protected TruckVisitType truckVisit;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad gateId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateId() {
            return gateId;
        }

        /**
         * Define el valor de la propiedad gateId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateId(String value) {
            this.gateId = value;
        }

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitType }
         *     
         */
        public TruckVisitType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitType }
         *     
         */
        public void setTruckVisit(TruckVisitType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad timestamp.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Define el valor de la propiedad timestamp.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gateId",
        "stageId"
    })
    public static class RequestScansExpected {

        @XmlElement(name = "gate-id")
        protected String gateId;
        @XmlElement(name = "stage-id")
        protected String stageId;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad gateId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateId() {
            return gateId;
        }

        /**
         * Define el valor de la propiedad gateId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateId(String value) {
            this.gateId = value;
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
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tran-type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="RE"/>
     *               &lt;enumeration value="RI"/>
     *               &lt;enumeration value="RM"/>
     *               &lt;enumeration value="RC"/>
     *               &lt;enumeration value="RB"/>
     *               &lt;enumeration value="DE"/>
     *               &lt;enumeration value="DI"/>
     *               &lt;enumeration value="DM"/>
     *               &lt;enumeration value="DC"/>
     *               &lt;enumeration value="TC"/>
     *               &lt;enumeration value="UK"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
     *         &lt;element name="truck-transaction" type="{http://www.navis.com/argo}TruckTransactionRequestType" minOccurs="0"/>
     *         &lt;element name="stage-status" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="CREATED"/>
     *               &lt;enumeration value="COMPLETE"/>
     *               &lt;enumeration value="TROUBLE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="stage-type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="STANDARD"/>
     *               &lt;enumeration value="EXCEPTION"/>
     *               &lt;enumeration value=""/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gateId",
        "tranType",
        "truckVisit",
        "truckTransaction",
        "stageStatus",
        "stageType"
    })
    public static class RequestStageDetails {

        @XmlElement(name = "gate-id", required = true)
        protected String gateId;
        @XmlElement(name = "tran-type")
        protected String tranType;
        @XmlElement(name = "truck-visit")
        protected TruckVisitRequestType truckVisit;
        @XmlElement(name = "truck-transaction")
        protected TruckTransactionRequestType truckTransaction;
        @XmlElement(name = "stage-status")
        protected String stageStatus;
        @XmlElement(name = "stage-type")
        protected String stageType;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad gateId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateId() {
            return gateId;
        }

        /**
         * Define el valor de la propiedad gateId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateId(String value) {
            this.gateId = value;
        }

        /**
         * Obtiene el valor de la propiedad tranType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranType() {
            return tranType;
        }

        /**
         * Define el valor de la propiedad tranType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranType(String value) {
            this.tranType = value;
        }

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public TruckVisitRequestType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public void setTruckVisit(TruckVisitRequestType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad truckTransaction.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionRequestType }
         *     
         */
        public TruckTransactionRequestType getTruckTransaction() {
            return truckTransaction;
        }

        /**
         * Define el valor de la propiedad truckTransaction.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionRequestType }
         *     
         */
        public void setTruckTransaction(TruckTransactionRequestType value) {
            this.truckTransaction = value;
        }

        /**
         * Obtiene el valor de la propiedad stageStatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStageStatus() {
            return stageStatus;
        }

        /**
         * Define el valor de la propiedad stageStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStageStatus(String value) {
            this.stageStatus = value;
        }

        /**
         * Obtiene el valor de la propiedad stageType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStageType() {
            return stageType;
        }

        /**
         * Define el valor de la propiedad stageType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStageType(String value) {
            this.stageType = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="truck-transaction" type="{http://www.navis.com/argo}TruckTransactionRequestType" minOccurs="0"/>
     *         &lt;element name="line-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="start-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="end-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "truckTransaction",
        "lineId",
        "startDate",
        "endDate"
    })
    public static class RequestTroubleTransactions {

        @XmlElement(name = "truck-transaction")
        protected TruckTransactionRequestType truckTransaction;
        @XmlElement(name = "line-id")
        protected String lineId;
        @XmlElement(name = "start-date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlElement(name = "end-date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad truckTransaction.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionRequestType }
         *     
         */
        public TruckTransactionRequestType getTruckTransaction() {
            return truckTransaction;
        }

        /**
         * Define el valor de la propiedad truckTransaction.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionRequestType }
         *     
         */
        public void setTruckTransaction(TruckTransactionRequestType value) {
            this.truckTransaction = value;
        }

        /**
         * Obtiene el valor de la propiedad lineId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLineId() {
            return lineId;
        }

        /**
         * Define el valor de la propiedad lineId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLineId(String value) {
            this.lineId = value;
        }

        /**
         * Obtiene el valor de la propiedad startDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Define el valor de la propiedad startDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Obtiene el valor de la propiedad endDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Define el valor de la propiedad endDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
     *         &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="no-content" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="include-complete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
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
        "driver",
        "truckVisit"
    })
    public static class RequestVisitDetails {

        protected TruckType truck;
        protected DriverType driver;
        @XmlElement(name = "truck-visit")
        protected TruckVisitRequestType truckVisit;
        @XmlAttribute(name = "no-content")
        protected Boolean noContent;
        @XmlAttribute(name = "include-complete")
        protected Boolean includeComplete;
        @XmlAttribute(name = "content")
        protected String content;

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
         * Obtiene el valor de la propiedad driver.
         * 
         * @return
         *     possible object is
         *     {@link DriverType }
         *     
         */
        public DriverType getDriver() {
            return driver;
        }

        /**
         * Define el valor de la propiedad driver.
         * 
         * @param value
         *     allowed object is
         *     {@link DriverType }
         *     
         */
        public void setDriver(DriverType value) {
            this.driver = value;
        }

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public TruckVisitRequestType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public void setTruckVisit(TruckVisitRequestType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad noContent.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNoContent() {
            if (noContent == null) {
                return false;
            } else {
                return noContent;
            }
        }

        /**
         * Define el valor de la propiedad noContent.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoContent(Boolean value) {
            this.noContent = value;
        }

        /**
         * Obtiene el valor de la propiedad includeComplete.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isIncludeComplete() {
            if (includeComplete == null) {
                return false;
            } else {
                return includeComplete;
            }
        }

        /**
         * Define el valor de la propiedad includeComplete.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncludeComplete(Boolean value) {
            this.includeComplete = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
     *         &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="no-content" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="xps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="retry" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gateId",
        "stageId",
        "laneId",
        "truck",
        "driver",
        "truckVisit"
    })
    public static class StageDone {

        @XmlElement(name = "gate-id", required = true)
        protected String gateId;
        @XmlElement(name = "stage-id", required = true)
        protected String stageId;
        @XmlElement(name = "lane-id")
        protected String laneId;
        protected TruckType truck;
        protected DriverType driver;
        @XmlElement(name = "truck-visit")
        protected TruckVisitRequestType truckVisit;
        @XmlAttribute(name = "no-content")
        protected Boolean noContent;
        @XmlAttribute(name = "xps")
        protected Boolean xps;
        @XmlAttribute(name = "retry")
        protected Boolean retry;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad gateId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateId() {
            return gateId;
        }

        /**
         * Define el valor de la propiedad gateId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateId(String value) {
            this.gateId = value;
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
         * Obtiene el valor de la propiedad laneId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLaneId() {
            return laneId;
        }

        /**
         * Define el valor de la propiedad laneId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLaneId(String value) {
            this.laneId = value;
        }

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
         * Obtiene el valor de la propiedad driver.
         * 
         * @return
         *     possible object is
         *     {@link DriverType }
         *     
         */
        public DriverType getDriver() {
            return driver;
        }

        /**
         * Define el valor de la propiedad driver.
         * 
         * @param value
         *     allowed object is
         *     {@link DriverType }
         *     
         */
        public void setDriver(DriverType value) {
            this.driver = value;
        }

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public TruckVisitRequestType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public void setTruckVisit(TruckVisitRequestType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad noContent.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNoContent() {
            if (noContent == null) {
                return false;
            } else {
                return noContent;
            }
        }

        /**
         * Define el valor de la propiedad noContent.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoContent(Boolean value) {
            this.noContent = value;
        }

        /**
         * Obtiene el valor de la propiedad xps.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isXps() {
            if (xps == null) {
                return true;
            } else {
                return xps;
            }
        }

        /**
         * Define el valor de la propiedad xps.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setXps(Boolean value) {
            this.xps = value;
        }

        /**
         * Obtiene el valor de la propiedad retry.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRetry() {
            if (retry == null) {
                return true;
            } else {
                return retry;
            }
        }

        /**
         * Define el valor de la propiedad retry.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRetry(Boolean value) {
            this.retry = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
     *         &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
     *         &lt;element name="truck-transactions" type="{http://www.navis.com/argo}TruckTransactionsRequestType"/>
     *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="no-content" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="xps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="retry" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gateId",
        "stageId",
        "laneId",
        "truck",
        "driver",
        "truckVisit",
        "truckTransactions",
        "timestamp"
    })
    public static class SubmitMultipleTransactions {

        @XmlElement(name = "gate-id")
        protected String gateId;
        @XmlElement(name = "stage-id", required = true)
        protected String stageId;
        @XmlElement(name = "lane-id")
        protected String laneId;
        protected TruckType truck;
        protected DriverType driver;
        @XmlElement(name = "truck-visit")
        protected TruckVisitRequestType truckVisit;
        @XmlElement(name = "truck-transactions", required = true)
        protected TruckTransactionsRequestType truckTransactions;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;
        @XmlAttribute(name = "no-content")
        protected Boolean noContent;
        @XmlAttribute(name = "xps")
        protected Boolean xps;
        @XmlAttribute(name = "retry")
        protected Boolean retry;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad gateId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateId() {
            return gateId;
        }

        /**
         * Define el valor de la propiedad gateId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateId(String value) {
            this.gateId = value;
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
         * Obtiene el valor de la propiedad laneId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLaneId() {
            return laneId;
        }

        /**
         * Define el valor de la propiedad laneId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLaneId(String value) {
            this.laneId = value;
        }

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
         * Obtiene el valor de la propiedad driver.
         * 
         * @return
         *     possible object is
         *     {@link DriverType }
         *     
         */
        public DriverType getDriver() {
            return driver;
        }

        /**
         * Define el valor de la propiedad driver.
         * 
         * @param value
         *     allowed object is
         *     {@link DriverType }
         *     
         */
        public void setDriver(DriverType value) {
            this.driver = value;
        }

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public TruckVisitRequestType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public void setTruckVisit(TruckVisitRequestType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad truckTransactions.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionsRequestType }
         *     
         */
        public TruckTransactionsRequestType getTruckTransactions() {
            return truckTransactions;
        }

        /**
         * Define el valor de la propiedad truckTransactions.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionsRequestType }
         *     
         */
        public void setTruckTransactions(TruckTransactionsRequestType value) {
            this.truckTransactions = value;
        }

        /**
         * Obtiene el valor de la propiedad timestamp.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Define el valor de la propiedad timestamp.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

        /**
         * Obtiene el valor de la propiedad noContent.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNoContent() {
            if (noContent == null) {
                return false;
            } else {
                return noContent;
            }
        }

        /**
         * Define el valor de la propiedad noContent.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoContent(Boolean value) {
            this.noContent = value;
        }

        /**
         * Obtiene el valor de la propiedad xps.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isXps() {
            if (xps == null) {
                return true;
            } else {
                return xps;
            }
        }

        /**
         * Define el valor de la propiedad xps.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setXps(Boolean value) {
            this.xps = value;
        }

        /**
         * Obtiene el valor de la propiedad retry.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRetry() {
            if (retry == null) {
                return true;
            } else {
                return retry;
            }
        }

        /**
         * Define el valor de la propiedad retry.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRetry(Boolean value) {
            this.retry = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *         &lt;element name="gate-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stage-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="lane-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
     *         &lt;element name="driver" type="{http://www.navis.com/argo}DriverType" minOccurs="0"/>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
     *         &lt;element name="truck-transaction" type="{http://www.navis.com/argo}TruckTransactionRequestType"/>
     *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="list-appointments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="no-content" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="xps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="retry" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gateId",
        "stageId",
        "laneId",
        "truck",
        "driver",
        "truckVisit",
        "truckTransaction",
        "timestamp"
    })
    public static class SubmitTransaction {

        @XmlElement(name = "gate-id")
        protected String gateId;
        @XmlElement(name = "stage-id", required = true)
        protected String stageId;
        @XmlElement(name = "lane-id")
        protected String laneId;
        protected TruckType truck;
        protected DriverType driver;
        @XmlElement(name = "truck-visit")
        protected TruckVisitRequestType truckVisit;
        @XmlElement(name = "truck-transaction", required = true)
        protected TruckTransactionRequestType truckTransaction;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;
        @XmlAttribute(name = "list-appointments")
        protected Boolean listAppointments;
        @XmlAttribute(name = "no-content")
        protected Boolean noContent;
        @XmlAttribute(name = "xps")
        protected Boolean xps;
        @XmlAttribute(name = "retry")
        protected Boolean retry;
        @XmlAttribute(name = "content")
        protected String content;

        /**
         * Obtiene el valor de la propiedad gateId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateId() {
            return gateId;
        }

        /**
         * Define el valor de la propiedad gateId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateId(String value) {
            this.gateId = value;
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
         * Obtiene el valor de la propiedad laneId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLaneId() {
            return laneId;
        }

        /**
         * Define el valor de la propiedad laneId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLaneId(String value) {
            this.laneId = value;
        }

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
         * Obtiene el valor de la propiedad driver.
         * 
         * @return
         *     possible object is
         *     {@link DriverType }
         *     
         */
        public DriverType getDriver() {
            return driver;
        }

        /**
         * Define el valor de la propiedad driver.
         * 
         * @param value
         *     allowed object is
         *     {@link DriverType }
         *     
         */
        public void setDriver(DriverType value) {
            this.driver = value;
        }

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public TruckVisitRequestType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public void setTruckVisit(TruckVisitRequestType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad truckTransaction.
         * 
         * @return
         *     possible object is
         *     {@link TruckTransactionRequestType }
         *     
         */
        public TruckTransactionRequestType getTruckTransaction() {
            return truckTransaction;
        }

        /**
         * Define el valor de la propiedad truckTransaction.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckTransactionRequestType }
         *     
         */
        public void setTruckTransaction(TruckTransactionRequestType value) {
            this.truckTransaction = value;
        }

        /**
         * Obtiene el valor de la propiedad timestamp.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Define el valor de la propiedad timestamp.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

        /**
         * Obtiene el valor de la propiedad listAppointments.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isListAppointments() {
            if (listAppointments == null) {
                return false;
            } else {
                return listAppointments;
            }
        }

        /**
         * Define el valor de la propiedad listAppointments.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setListAppointments(Boolean value) {
            this.listAppointments = value;
        }

        /**
         * Obtiene el valor de la propiedad noContent.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNoContent() {
            if (noContent == null) {
                return false;
            } else {
                return noContent;
            }
        }

        /**
         * Define el valor de la propiedad noContent.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoContent(Boolean value) {
            this.noContent = value;
        }

        /**
         * Obtiene el valor de la propiedad xps.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isXps() {
            if (xps == null) {
                return true;
            } else {
                return xps;
            }
        }

        /**
         * Define el valor de la propiedad xps.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setXps(Boolean value) {
            this.xps = value;
        }

        /**
         * Obtiene el valor de la propiedad retry.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRetry() {
            if (retry == null) {
                return true;
            } else {
                return retry;
            }
        }

        /**
         * Define el valor de la propiedad retry.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRetry(Boolean value) {
            this.retry = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
     *     &lt;extension base="{http://www.navis.com/argo}GateAppointmentRequestType">
     *       &lt;sequence>
     *         &lt;element name="appointment-nbr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "appointmentNbr"
    })
    public static class UpdateAppointment
        extends GateAppointmentRequestType
    {

        @XmlElement(name = "appointment-nbr")
        protected Long appointmentNbr;

        /**
         * Obtiene el valor de la propiedad appointmentNbr.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAppointmentNbr() {
            return appointmentNbr;
        }

        /**
         * Define el valor de la propiedad appointmentNbr.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAppointmentNbr(Long value) {
            this.appointmentNbr = value;
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
     *         &lt;element name="truck" type="{http://www.navis.com/argo}TruckType" minOccurs="0"/>
     *         &lt;element name="driver" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="card-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="license-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="truck-visit" type="{http://www.navis.com/argo}TruckVisitRequestType" minOccurs="0"/>
     *         &lt;element name="scale-weight" type="{http://www.navis.com/argo}ScaleWeightType" minOccurs="0"/>
     *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
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
        "driver",
        "truckVisit",
        "scaleWeight",
        "timestamp"
    })
    public static class UpdateTruckVisit {

        protected TruckType truck;
        protected GateWebserviceRequestType.UpdateTruckVisit.Driver driver;
        @XmlElement(name = "truck-visit")
        protected TruckVisitRequestType truckVisit;
        @XmlElement(name = "scale-weight")
        protected ScaleWeightType scaleWeight;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;
        @XmlAttribute(name = "content")
        protected String content;

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
         * Obtiene el valor de la propiedad driver.
         * 
         * @return
         *     possible object is
         *     {@link GateWebserviceRequestType.UpdateTruckVisit.Driver }
         *     
         */
        public GateWebserviceRequestType.UpdateTruckVisit.Driver getDriver() {
            return driver;
        }

        /**
         * Define el valor de la propiedad driver.
         * 
         * @param value
         *     allowed object is
         *     {@link GateWebserviceRequestType.UpdateTruckVisit.Driver }
         *     
         */
        public void setDriver(GateWebserviceRequestType.UpdateTruckVisit.Driver value) {
            this.driver = value;
        }

        /**
         * Obtiene el valor de la propiedad truckVisit.
         * 
         * @return
         *     possible object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public TruckVisitRequestType getTruckVisit() {
            return truckVisit;
        }

        /**
         * Define el valor de la propiedad truckVisit.
         * 
         * @param value
         *     allowed object is
         *     {@link TruckVisitRequestType }
         *     
         */
        public void setTruckVisit(TruckVisitRequestType value) {
            this.truckVisit = value;
        }

        /**
         * Obtiene el valor de la propiedad scaleWeight.
         * 
         * @return
         *     possible object is
         *     {@link ScaleWeightType }
         *     
         */
        public ScaleWeightType getScaleWeight() {
            return scaleWeight;
        }

        /**
         * Define el valor de la propiedad scaleWeight.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaleWeightType }
         *     
         */
        public void setScaleWeight(ScaleWeightType value) {
            this.scaleWeight = value;
        }

        /**
         * Obtiene el valor de la propiedad timestamp.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Define el valor de la propiedad timestamp.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

        /**
         * Obtiene el valor de la propiedad content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            if (content == null) {
                return "default";
            } else {
                return content;
            }
        }

        /**
         * Define el valor de la propiedad content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
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
         *       &lt;attribute name="card-id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="license-nbr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Driver {

            @XmlAttribute(name = "card-id")
            protected String cardId;
            @XmlAttribute(name = "license-nbr")
            protected String licenseNbr;

            /**
             * Obtiene el valor de la propiedad cardId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardId() {
                return cardId;
            }

            /**
             * Define el valor de la propiedad cardId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardId(String value) {
                this.cardId = value;
            }

            /**
             * Obtiene el valor de la propiedad licenseNbr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLicenseNbr() {
                return licenseNbr;
            }

            /**
             * Define el valor de la propiedad licenseNbr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLicenseNbr(String value) {
                this.licenseNbr = value;
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
     *     &lt;extension base="{http://www.navis.com/argo}TruckVisitAppointmentRequestType">
     *       &lt;sequence>
     *         &lt;element name="appointment-nbr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "appointmentNbr"
    })
    public static class UpdateTruckVisitAppointment
        extends TruckVisitAppointmentRequestType
    {

        @XmlElement(name = "appointment-nbr")
        protected Long appointmentNbr;

        /**
         * Obtiene el valor de la propiedad appointmentNbr.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAppointmentNbr() {
            return appointmentNbr;
        }

        /**
         * Define el valor de la propiedad appointmentNbr.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAppointmentNbr(Long value) {
            this.appointmentNbr = value;
        }

    }

}
