package com.atp.solicitudes.reports.model;
 
import java.util.Date;

public class PaseDeEntradaReport
{
	private Integer gav_appNbr;
	private String gav_transTypeName;
	private String gav_state;
	private String gav_creator;
	private Date gav_startDate;
	private Date gav_endDate;
	private String gav_lineOp;
	private String gav_gateId;
	private String gav_gateDescription;
	private String gav_truckLicence;
	private String gav_truckingCompany;
	private String gav_driverName;
	private String gav_driverLicenseNbr;
	private String gav_unitNbr;
	private String gav_custidName;
	private String gav_booking;
	private String gav_bookingTypeIso;
	private String gav_bookingTypeDescription;
	private String gav_notes;
	private Integer gav_booking_gkey;
	private String gav_shipcustid;
	
	private String uv_typeIso;
	private Integer uv_weight;
	private String uv_temporal;
	private String uv_previoExpress;
	private String uv_special;
	private String uv_recintoTit;
	private String uv_typeIsoName;
	private Integer uv_hzrdGkey;
	private Float uv_tempRequired;
	private Float uv_ventRequiredPct;
	private String uv_ventUnit;
	private Integer uv_isDim;
	private Integer uv_oogLeft;
	private Integer uv_oogRight;
	private Integer uv_oogTop;
	private Integer uv_oogBack;
	private Integer uv_oogFront;
	private Float uv_o2Pct;
	private Float uv_co2Pct;
	private String uv_complexPosition;
	private Integer uv_unitGkey;
	private String uv_consigneeId;
	private String uv_category;
	private String uv_etiquetaUndg;

	private String bv_notes;

	private String biv_grade;
	private String biv_remarks;

	private String rbsv_name;
	private String rbsv_notes;
	private String rbsv_ctName;
	private String rbsv_addressLine1;
	private String rbsv_city;

	private String vvv_vesselVoyage;
	private String vvv_vesselName;
	private String vvv_voyageIn;
	private String vvv_voyageOut;

	private Integer uhv_hzrdGkey;
	private String uhv_imdgClass;
	private String uhv_hzrdDescription;
	private Integer uhv_marinePollutants;
	

	// TODO remove this from here and from the report
	public Boolean getPrintState()
	{
		return true;
	}

	public Integer getGav_appNbr()
	{
		return gav_appNbr;
	}

	public void setGav_appNbr(Integer gav_appNbr)
	{
		this.gav_appNbr = gav_appNbr;
	}

	public String getGav_transTypeName()
	{
		return gav_transTypeName;
	}

	public void setGav_transTypeName(String gav_transTypeName)
	{
		this.gav_transTypeName = gav_transTypeName;
	}

	public String getGav_state()
	{
		return gav_state;
	}

	public void setGav_state(String gav_state)
	{
		this.gav_state = gav_state;
	}

	public String getGav_creator()
	{
		return gav_creator;
	}

	public void setGav_creator(String gav_creator)
	{
		this.gav_creator = gav_creator;
	}

	public Date getGav_startDate()
	{
		return gav_startDate;
	}

	public void setGav_startDate(Date gav_startDate)
	{
		this.gav_startDate = gav_startDate;
	}

	public Date getGav_endDate() {
		return gav_endDate;
	}

	public void setGav_endDate(Date gav_endDate) {
		this.gav_endDate = gav_endDate;
	}

	public String getGav_lineOp()
	{
		return gav_lineOp;
	}

	public void setGav_lineOp(String gav_lineOp)
	{
		this.gav_lineOp = gav_lineOp;
	}

	public String getGav_gateId()
	{
		return gav_gateId;
	}

	public void setGav_gateId(String gav_gateId)
	{
		this.gav_gateId = gav_gateId;
	}

	public String getGav_gateDescription()
	{
		return gav_gateDescription;
	}

	public void setGav_gateDescription(String gav_gateDescription)
	{
		this.gav_gateDescription = gav_gateDescription;
	}

	public String getGav_truckLicence()
	{
		return gav_truckLicence;
	}

	public void setGav_truckLicence(String gav_truckLicence)
	{
		this.gav_truckLicence = gav_truckLicence;
	}

	public String getGav_truckingCompany()
	{
		return gav_truckingCompany;
	}

	public void setGav_truckingCompany(String gav_truckingCompany)
	{
		this.gav_truckingCompany = gav_truckingCompany;
	}

	public String getGav_driverName()
	{
		return gav_driverName;
	}

	public void setGav_driverName(String gav_driverName)
	{
		this.gav_driverName = gav_driverName;
	}

	public String getGav_driverLicenseNbr()
	{
		return gav_driverLicenseNbr;
	}

	public void setGav_driverLicenseNbr(String gav_driverLicenseNbr)
	{
		this.gav_driverLicenseNbr = gav_driverLicenseNbr;
	}

	public String getGav_unitNbr()
	{
		return gav_unitNbr;
	}

	public void setGav_unitNbr(String gav_unitNbr)
	{
		this.gav_unitNbr = gav_unitNbr;
	}

	public String getGav_custidName()
	{
		return gav_custidName;
	}

	public void setGav_custidName(String gav_custidName)
	{
		this.gav_custidName = gav_custidName;
	}

	public String getGav_booking()
	{
		return gav_booking;
	}

	public void setGav_booking(String gav_booking)
	{
		this.gav_booking = gav_booking;
	}

	public String getGav_bookingTypeIso()
	{
		return gav_bookingTypeIso;
	}

	public void setGav_bookingTypeIso(String gav_bookingTypeIso)
	{
		this.gav_bookingTypeIso = gav_bookingTypeIso;
	}

	public String getGav_bookingTypeDescription()
	{
		return gav_bookingTypeDescription;
	}

	public void setGav_bookingTypeDescription(String gav_bookingTypeDescription)
	{
		this.gav_bookingTypeDescription = gav_bookingTypeDescription;
	}

	public String getGav_notes()
	{
		return gav_notes;
	}

	public void setGav_notes(String gav_notes)
	{
		this.gav_notes = gav_notes;
	}

	public Integer getGav_booking_gkey()
	{
		return gav_booking_gkey;
	}

	public void setGav_booking_gkey(Integer gav_booking_gkey)
	{
		this.gav_booking_gkey = gav_booking_gkey;
	}

	public String getUv_typeIso()
	{
		return uv_typeIso;
	}

	public void setUv_typeIso(String uv_typeIso)
	{
		this.uv_typeIso = uv_typeIso;
	}

	public Integer getUv_weight()
	{
		return uv_weight;
	}

	public void setUv_weight(Integer uv_weight)
	{
		this.uv_weight = uv_weight;
	}

	public String getUv_temporal()
	{
		return uv_temporal;
	}

	public void setUv_temporal(String uv_temporal)
	{
		this.uv_temporal = uv_temporal;
	}

	public String getUv_previoExpress()
	{
		return uv_previoExpress;
	}

	public void setUv_previoExpress(String uv_previoExpress)
	{
		this.uv_previoExpress = uv_previoExpress;
	}

	public String getUv_special()
	{
		return uv_special;
	}

	public void setUv_special(String uv_special)
	{
		this.uv_special = uv_special;
	}

	public String getUv_recintoTit()
	{
		return uv_recintoTit;
	}

	public void setUv_recintoTit(String uv_recintoTit)
	{
		this.uv_recintoTit = uv_recintoTit;
	}

	public String getUv_typeIsoName()
	{
		return uv_typeIsoName;
	}

	public void setUv_typeIsoName(String uv_typeIsoName)
	{
		this.uv_typeIsoName = uv_typeIsoName;
	}

	public Integer getUv_hzrdGkey()
	{
		return uv_hzrdGkey;
	}

	public void setUv_hzrdGkey(Integer uv_hzrdGkey)
	{
		this.uv_hzrdGkey = uv_hzrdGkey;
	}

	public Float getUv_tempRequired()
	{
		return uv_tempRequired;
	}

	public void setUv_tempRequired(Float uv_tempRequired)
	{
		this.uv_tempRequired = uv_tempRequired;
	}

	public Float getUv_ventRequiredPct()
	{
		return uv_ventRequiredPct;
	}

	public void setUv_ventRequiredPct(Float uv_ventRequiredPct)
	{
		this.uv_ventRequiredPct = uv_ventRequiredPct;
	}

	public String getUv_ventUnit()
	{
		return uv_ventUnit;
	}

	public void setUv_ventUnit(String uv_ventUnit)
	{
		this.uv_ventUnit = uv_ventUnit;
	}

	public Integer getUv_isDim()
	{
		return uv_isDim;
	}

	public void setUv_isDim(Integer uv_isDim)
	{
		this.uv_isDim = uv_isDim;
	}

	public Integer getUv_oogLeft()
	{
		return uv_oogLeft;
	}

	public void setUv_oogLeft(Integer uv_oogLeft)
	{
		this.uv_oogLeft = uv_oogLeft;
	}

	public Integer getUv_oogRight()
	{
		return uv_oogRight;
	}

	public void setUv_oogRight(Integer uv_oogRight)
	{
		this.uv_oogRight = uv_oogRight;
	}

	public Integer getUv_oogTop()
	{
		return uv_oogTop;
	}

	public void setUv_oogTop(Integer uv_oogTop)
	{
		this.uv_oogTop = uv_oogTop;
	}

	public Integer getUv_oogBack()
	{
		return uv_oogBack;
	}

	public void setUv_oogBack(Integer uv_oogBack)
	{
		this.uv_oogBack = uv_oogBack;
	}

	public Integer getUv_oogFront()
	{
		return uv_oogFront;
	}

	public void setUv_oogFront(Integer uv_oogFront)
	{
		this.uv_oogFront = uv_oogFront;
	}

	public Float getUv_o2Pct()
	{
		return uv_o2Pct;
	}

	public void setUv_o2Pct(Float uv_o2Pct)
	{
		this.uv_o2Pct = uv_o2Pct;
	}

	public Float getUv_co2Pct()
	{
		return uv_co2Pct;
	}

	public void setUv_co2Pct(Float uv_co2Pct)
	{
		this.uv_co2Pct = uv_co2Pct;
	}

	public String getUv_complexPosition()
	{
		return uv_complexPosition;
	}

	public void setUv_complexPosition(String uv_complexPosition)
	{
		this.uv_complexPosition = uv_complexPosition;
	}

	public Integer getUv_unitGkey()
	{
		return uv_unitGkey;
	}

	public void setUv_unitGkey(Integer uv_unitGkey)
	{
		this.uv_unitGkey = uv_unitGkey;
	}

	public String getUv_etiquetaUndg() {
		if(uv_etiquetaUndg!=null)
		{
			return uv_etiquetaUndg;
		}
		else
		{
			return "";
		}
		
	}

	public void setUv_etiquetaUndg(String uv_etiquetaUndg) {
		if(uv_etiquetaUndg!=null)
		{
		this.uv_etiquetaUndg = uv_etiquetaUndg;
		}
		else
		{
			this.uv_etiquetaUndg = "";
		}
	}

	public String getBv_notes()
	{
		return bv_notes;
	}

	public void setBv_notes(String bv_notes)
	{
		this.bv_notes = bv_notes;
	}

	public String getBiv_grade()
	{
		return biv_grade;
	}

	public void setBiv_grade(String biv_grade)
	{
		this.biv_grade = biv_grade;
	}

	public String getBiv_remarks()
	{
		return biv_remarks;
	}

	public void setBiv_remarks(String biv_remarks)
	{
		this.biv_remarks = biv_remarks;
	}

	public String getRbsv_name()
	{
		return rbsv_name;
	}

	public void setRbsv_name(String rbsv_name)
	{
		this.rbsv_name = rbsv_name;
	}

	public String getRbsv_notes()
	{
		return rbsv_notes;
	}

	public void setRbsv_notes(String rbsv_notes)
	{
		this.rbsv_notes = rbsv_notes;
	}

	public String getRbsv_ctName()
	{
		return rbsv_ctName;
	}

	public void setRbsv_ctName(String rbsv_ctName)
	{
		this.rbsv_ctName = rbsv_ctName;
	}

	public String getRbsv_addressLine1()
	{
		return rbsv_addressLine1;
	}

	public void setRbsv_addressLine1(String rbsv_addressLine1)
	{
		this.rbsv_addressLine1 = rbsv_addressLine1;
	}

	public String getRbsv_city()
	{
		return rbsv_city;
	}

	public void setRbsv_city(String rbsv_city)
	{
		this.rbsv_city = rbsv_city;
	}

	public String getVvv_vesselVoyage()
	{
		return vvv_vesselVoyage;
	}

	public void setVvv_vesselVoyage(String vvv_vesselVoyage)
	{
		this.vvv_vesselVoyage = vvv_vesselVoyage;
	}

	public String getVvv_vesselName()
	{
		return vvv_vesselName;
	}

	public void setVvv_vesselName(String vvv_vesselName)
	{
		this.vvv_vesselName = vvv_vesselName;
	}

	public String getVvv_voyageIn()
	{
		return vvv_voyageIn;
	}

	public void setVvv_voyageIn(String vvv_voyageIn)
	{
		this.vvv_voyageIn = vvv_voyageIn;
	}

	public String getVvv_voyageOut() {
		return vvv_voyageOut;
	}

	public void setVvv_voyageOut(String vvv_voyageOut) {
		this.vvv_voyageOut = vvv_voyageOut;
	}

	public Integer getUhv_hzrdGkey()
	{
		return uhv_hzrdGkey;
	}

	public void setUhv_hzrdGkey(Integer uhv_hzrdGkey)
	{
		this.uhv_hzrdGkey = uhv_hzrdGkey;
	}

	public String getUhv_imdgClass()
	{
		return uhv_imdgClass;
	}

	public void setUhv_imdgClass(String uhv_imdgClass)
	{
		this.uhv_imdgClass = uhv_imdgClass;
	}

	public String getUhv_hzrdDescription()
	{
		return uhv_hzrdDescription;
	}

	public void setUhv_hzrdDescription(String uhv_hzrdDescription)
	{
		this.uhv_hzrdDescription = uhv_hzrdDescription;
	}

	public Integer getUhv_marinePollutants()
	{
		return uhv_marinePollutants;
	}

	public void setUhv_marinePollutants(Integer uhv_marinePollutants)
	{
		this.uhv_marinePollutants = uhv_marinePollutants;
	}

	public String getHazardContaminanteM()
	{
		String aux=null;
		if(uhv_imdgClass!=null && uhv_hzrdDescription!=null)
		{
			aux = uhv_imdgClass+" - "+uhv_hzrdDescription;
			if(uhv_marinePollutants == 1)
			{
				aux+="CONTAMINANTE MARINO";
			}
			else
				if(uhv_marinePollutants == 1)
				{
					aux+="";
					return aux;
				}
		}
		else
			aux="";
			return aux;
			

	}

	public String getPretipRunning()
	{
		if (uv_tempRequired == null)
			return "";
		else
			return uv_tempRequired.toString();
	}

	public String getLineOpSSL()
	{
		if (gav_lineOp == null)
			return "";
		else
			return gav_lineOp;
	}

	public String getBooking()
	{
		if (gav_booking == null)
			return "";
		else
			return gav_booking;
	}

	public String getOogLeft()
	{
		if (uv_oogLeft == null)
			return "";
		else
			return uv_oogLeft.toString();
	}

	public String getOogRight()
	{
		if (uv_oogRight == null)
			return "";
		else
			return uv_oogRight.toString();
	}

	public String getOogTop()
	{
		if (uv_oogTop == null)
			return "";
		else
			return uv_oogTop.toString();
	}

	public String getOogBack()
	{
		if (uv_oogBack == null)
			return "";
		else
			return uv_oogBack.toString();
	}

	public String getOogFront()
	{
		if (uv_oogFront == null)
			return "";
		else
			return uv_oogFront.toString();
	}

	public String getO2Pct()
	{
		if (uv_o2Pct == null)
			return "";
		else
			return uv_o2Pct.toString();
	}

	public String getCo2Pct()
	{
		if (uv_co2Pct == null)
			return "";
		else
			return uv_co2Pct.toString();
	}

	public String getGav_shipcustid()
	{
		return gav_shipcustid;
	}

	public void setGav_shipcustid(String gav_shipcustid)
	{
		this.gav_shipcustid = gav_shipcustid;
	}

	public String getUv_consigneeId()
	{
		return uv_consigneeId;
	}

	public void setUv_consigneeId(String uv_consigneeId)
	{
		this.uv_consigneeId = uv_consigneeId;
	}

	public String getUv_category()
	{
		return uv_category;
	}

	public void setUv_category(String uv_category)
	{
		this.uv_category = uv_category;
	}

	public String getGrade()
	{
		if (biv_grade == null)
			return "";
		else
			return biv_grade;
	}

	public String getVentRequiredPct()
	{
		if (uv_ventRequiredPct == null)
			return "";
		else
			return uv_ventRequiredPct.toString();
	}

	public String getVesselVoyage()
	{
		if (vvv_vesselVoyage == null)
			return "";
		else
			return vvv_vesselVoyage;
	}

	public String getTemporal()
	{
		if (uv_temporal == null)
			return "";
		else
			return uv_temporal;
	}

	public String getCtName()
	{
		if (rbsv_ctName == null)
			return "";
		else
			return rbsv_ctName;
	}

	public String getRfcNotes()
	{
		if (rbsv_notes == null)
			return "";
		else
			return rbsv_notes;
	}

	public String getNotes()
	{
		if (gav_notes == null)
			return "";
		else
			return gav_notes;
	}

	public String getUnitNbr()
	{
		if (gav_unitNbr == null)
			return "";
		else
			return gav_unitNbr;
	}

	public String getTransTypeName()
	{
		if (gav_transTypeName == null)
			return "";
		else
			return gav_transTypeName;
	}

	public String getCity()
	{
		if (rbsv_city == null)
			return "";
		else
			return rbsv_city;
	}

	public String getEmpresa()
	{
		if (gav_gateId.equalsIgnoreCase("IST"))
			return "I  S  T  A  S  A ";
		else
			if (gav_gateId.equalsIgnoreCase("RFI"))
				return "RECINTO FISCALIZADO ISTASA";
			else
				if (gav_gateId.equalsIgnoreCase("5 ISTASA"))
					return "INTEGRADORA DE SERVICIOS TRANSPORTES Y ALMACENAJES";
				else
					return "ALTAMIRA TERMINAL PORTUARIA";
	}

	public String getEquipmentType()
	{
		if (gav_unitNbr.trim().equalsIgnoreCase("EMTY0000001"))
		{
		return (gav_bookingTypeIso.trim() + "-" + gav_bookingTypeDescription.trim());
		}
	else
		if (uv_typeIso == null)
		{
			return (gav_bookingTypeIso.trim() + "-" + gav_bookingTypeDescription.trim());
		}
		else
		{
			return (uv_typeIso.trim() + "-" + uv_typeIsoName.trim());
		}
	}

	public String getWeight()
	{	   
		if (uv_weight == null)
			return "";
		else
			return uv_weight.toString();
	}

	public String getDriverInfo()
	{
		return (gav_driverName + " - " + gav_driverLicenseNbr);
	}

	public String getSpecials()
	{
		if (uv_special == null)
			return "";
		else
			if (uv_special.trim().equalsIgnoreCase("ACO"))
				return "Acondicionamiento";
			else
				if (uv_special.trim().equalsIgnoreCase("ISTA1"))
					return "Lavado Simple, IST";
				else
					if (uv_special.trim().equalsIgnoreCase("ISTA2"))
						return "Remoción de grasa, IST";
					else
						if (uv_special.trim().equalsIgnoreCase("ISTA3"))
							return "Remoción de Basura, IST";
						else
							if (uv_special.trim().equalsIgnoreCase("ISTA4"))
								return "Remoción grasa y basura, IST";
							else
								if (uv_special.trim().equalsIgnoreCase("ISTA5"))
									return "Traslado a ATP, IST";
								else
									if (uv_special.trim().equalsIgnoreCase("ISTA7"))
										return "Reparación, IST";
									else
										if (uv_special.trim().equalsIgnoreCase("ISTA8"))
											return "Reparación y lavado simple, IST";
										else
											if (uv_special.trim().equalsIgnoreCase("ISTAS"))
												return "Contenedor de IST";
											else
												if (uv_special.trim().equalsIgnoreCase("LINER"))
													return "Cuenta con liner instalado";
												else
													if (uv_special.trim().equalsIgnoreCase("OCX"))
														return "Previo Express";
													else
														if (uv_special.trim().equalsIgnoreCase("PXSA"))
															return "Previo Express sin apertura";
														else
															if (uv_special.trim().equalsIgnoreCase("WASH"))
																return "Lavado simple en ATP";
															else
																if (uv_special.trim().equalsIgnoreCase("OCXR"))
																	return "Regla Con Previo Express";
																else
																	if (uv_special.trim().equalsIgnoreCase("REG"))
																		return "Salida con Regla";
																	else
																		return uv_special;
	}

	public String getPrevioExpress()
	{
		if (uv_previoExpress == null)
			return "";
		else
			if (uv_previoExpress.trim().equalsIgnoreCase("SI"))
				return "PREVIO EXPRESS";
			else
				return "";

	}

	public String getRecintoTit()
	{
		if (uv_recintoTit == null)
			return "";
		else
			if (uv_recintoTit.length() > 0)
				return "Recinto TIT: " + uv_recintoTit.trim();
			else
				return "";
	}

	public String getRemarks()
	{
		if (biv_remarks == null && bv_notes == null)
			return "";
		else
			if (biv_remarks == null && bv_notes != null)
				return "" + bv_notes;
			else
				if (biv_remarks != null && bv_notes == null)
					return "" + biv_remarks;
				else
					if (biv_remarks.trim().length() > 0 && bv_notes.trim().length() > 0)
						return bv_notes.trim() +"\n "+ " - " + biv_remarks.trim();
					else
						return bv_notes.trim() +"\n "+ biv_remarks.trim();
	}

	public String getUmVent()
	{
		if (uv_ventUnit == null)
		{
			return "";
		}
		else
			if (uv_ventUnit.trim().equalsIgnoreCase("PERCENTAGE"))
				return "%";
			else
				if (uv_ventUnit.trim().equalsIgnoreCase("CUBIC_M_HOUR"))
					return "CMH";
				else
					if (uv_ventUnit.trim().equalsIgnoreCase("CUBIC_FT_MINUTE"))
						return "CFM";
					else
						return "";
	}

	public String getPosicion()
	{
		if (uv_complexPosition == null)
			return "";
		else
			if (uv_complexPosition.substring(1, 5) == "Y-ATP")
				return (uv_complexPosition.substring(7, 12));
			else
				return "";
	}
	
	public String getVessel()
	{
		
		String vesselN=null;
		if(!vvv_vesselVoyage.equals(null) || !vvv_vesselName.equals(null) || !vvv_voyageOut.equals(null) )
		{
		 vesselN = vvv_vesselVoyage+" " + vvv_vesselName + " " + vvv_voyageOut;
		}
		else
		{
			vesselN = "";
		}
		return vesselN;
	}
	
	public String getEtiqUndg()
	{
		String etiqUndg = null;
		
		if(uv_etiquetaUndg.equals(null) ||uv_etiquetaUndg.equals(""))
		{
			etiqUndg="";
		}
		else
		{
			etiqUndg = "Etiqueta UNDG: ";
		}
		return etiqUndg;
	}

}
