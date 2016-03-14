<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<c:import url="/doctype.jsp" />
<html>

<!-- appointment jsp begins -->

<c:import url="/appointment.jsp" />

<!-- appointment jsp ends -->

<script>
function buildTableDefinition()
{
	/*
	* Column Edition
	*/
	edition = new JQGrid_Column_Edition();
	edition.grid = getTable();
	edition.afterColumnSave = afterColumnSave;
	edition.beforeEditCell = beforeEditCell;

	/*
	* booking column
	*/
	var column = new JQGrid_Column_Model();
	column.name = "booking";
	column.type = "autocomplete";
	column.autocomplete_options = function(aColumn)
	{
		var opts = { };
		opts.minLength = 6;
		opts.source = function(req, resp)
		{
			jQuery.getJSON("rest/Booking/like.json?results=10&match=" + encodeURIComponent(req.term.toUpperCase()), { }, resp);
		};
		return opts;
	};
	column.beforeEdit = function(rowid, cellname, value, iRow, iCol)
	{
		var rowData = getTable().jqGrid('getLocalRow', rowid);

		if (isRowRegistered(rowData))
		{
			showMessage("<spring:message code='Cannot_change_booking_from_a_registered_appointment' />");
			window.setTimeout(function() { getTable().jqGrid('restoreCell', iRow, iCol); }, 100);
		}
	};
	column.afterSave = function(rowid, cellname, value, iRow, iCol)
	{
		var myColumn = this;

		var bookingCode = value.label;
		
		// if gate is IST and booking starts with S avoid process
		try
		{
			validateBookingForGate(bookingCode);
		}
		catch (ex)
		{
			showMessage(ex.getMessage());
			window.setTimeout(function() { myColumn.setColumnValue('booking', null); }, 100);
			return;
		}

		blockPage();
		jQuery.getJSON("rest/Booking/" + value.id, null, function(data)
		{
			unblockPage();

			var linea = data.linea;
			
			if (linea == null)
			{
				showMessage("<spring:message code='Booking_not_registered_on_system_please_verify_check' />");

				window.setTimeout(function()
				{
					myColumn.setColumnValue('booking', null);
					myColumn.setColumnValue('linea', null);
					myColumn.setColumnValue('buqueViaje', null);
					myColumn.setColumnValue('pod', null);
					myColumn.setColumnValue('fpod', null);
					myColumn.setColumnValue('fk', null);

					myColumn.setColumnValue('tipo', null);
					myColumn.setColumnValue('contenedor', null);
					myColumn.setColumnValue('contenido', null);
					
// 					updateRequireConnection(myColumn);
				}, 100);
			}
			else
			{
				myColumn.setColumnValue('linea', getColumnObjectForAtomicValue(linea));
				myColumn.setColumnValue('buqueViaje', getColumnObjectForAtomicValue(data.buqueViajeNombre+ " - "+data.buqueViaje));
				myColumn.setColumnValue('pod', getColumnObjectForAtomicValue(data.podName));
				myColumn.setColumnValue('fpod', getColumnObjectForAtomicValue(data.fpodName));
				myColumn.setColumnValue('fk', getColumnObjectForAtomicValue(data.fk));

				myColumn.setColumnValue('tipo', null);
				myColumn.setColumnValue('contenedor', null);
				myColumn.setColumnValue('contenido', null);
				myColumn.setColumnValue('costado', checked=true);

				
// 				updateRequireConnection(myColumn);
			}
		});
	};
	column.validate = function(value)
	{
	};
	edition.addColumn(column);

	/*
	* tipo column
	*/
	column = new JQGrid_Column_Model();
	column.name = "tipo";
	column.type = "dropdown";
	column.dropdown_options = function(aColumn)
	{
		var rowData = getTable().jqGrid('getLocalRow', aColumn.getModel().cellInfo.rowid);

		var bookingId = rowData.booking.id;

		var opts = { };
		opts.sourceUrl = "rest/BookingItem/search.json";
		opts.sourceParams = { bookingId: bookingId };
		opts.optionObject = function(obj) { return { label : obj.typeIso, id : obj.id }; };
		opts.sourceError = function(data)
		{
			window.setTimeout(function() { aColumn.getGrid().jqGrid('restoreCell', aColumn.getModel().cellInfo.rowid, 'tipo'); }, 100);
			showMessage(data.message);
		};

		return opts;
	};
	column.afterSave = function(rowid, cellname, value, iRow, iCol)
	{
		var myColumn = this;

		var process = function(bookingItem)
		{
			unblockPage();

			myColumn.setColumnValue('contenedor', null);

			if (bookingItem == null)
			{
				myColumn.setColumnValue('contenido', null);
				myColumn.setColumnValue('imo', null);
// 				myColumn.setColumnValue('undg', null);

				myColumn.setColumnValue('hasHazard', null);
				myColumn.setColumnValue('hasMarinePollutants', null);
				myColumn.setColumnValue('hasDimensions', null);
				myColumn.setColumnValue('requireConnection', null);
				myColumn.setColumnValue('setPoint', null);
				mymyColumn.setColumnValue('costado', null);

			}
			else
			{
				myColumn.setColumnValue('contenido', getColumnObjectForAtomicValue(bookingItem.cmdy));
				myColumn.setColumnValue('imo', getColumnObjectForAtomicValue(bookingItem.imos));
// 				myColumn.setColumnValue('undg', getColumnObjectForAtomicValue(bookingItem.imos));
				
				myColumn.setColumnValue('hasHazard', (bookingItem.hasHazard));
				myColumn.setColumnValue('hasMarinePollutants', (bookingItem.hasMarinePollutants));
				myColumn.setColumnValue('hasDimensions', (bookingItem.hasDimensions));
				myColumn.setColumnValue('requireConnection', (bookingItem.requireConnection));
				myColumn.setColumnValue('setPoint', (bookingItem.tempRequired));
			}

// 			updateRequireConnection(myColumn);
		};
		
		blockPage();
		jQuery.getJSON("rest/BookingItem/" + value.id, null, process, function() { process(null); });
	};
	column.validate = function(value)
	{
	};
	edition.addColumn(column);

	/*
	* contenedor column
	*/
	column = new JQGrid_Column_Model();
	column.name = "contenedor";
	column.type = "autocomplete";
	column.autocomplete_options = function(aColumn)
	{
		var opts = { };
		opts.minLength = 11;
		opts.source = function(req, resp) { resp([req.term.toUpperCase()]);	};
		opts.create = function(event, ui) { jQuery(event.target).addClass("inputToUppercase");	};
		return opts;
	};
	column.beforeEdit = function(rowid, cellname, value, iRow, iCol)
	{
		var rowData = getTable().jqGrid('getLocalRow', rowid);

		if (isRowRegistered(rowData))
		{
			showMessage("<spring:message code='Cannot_change_container_from_a_registered_appointment' />");
			window.setTimeout(function() { getTable().jqGrid('restoreCell', iRow, iCol); }, 100);
		}
	};
	column.afterSave = function(rowid, cellname, value, iRow, iCol)
	{
		var myColumn = this;
		
		var accepF = function(data)
		{
			unblockPage();

			var container = data;

			try
			{
				validatesBookingInfoAgainstContainer(container, myColumn);
			}
			catch (ex)
			{
				showMessage(ex.getMessage());
				window.setTimeout(function() { myColumn.setColumnValue("contenedor", null); }, 100);
				return;
			}
			
// 			updateRequireConnection(myColumn);
		};

		blockPage();
		jQuery.getJSON("rest/Contenedor/recent/unit_nbr/"
			+ encodeURIComponent(value.label), null,
			accepF, function() { accepF(null); });
	};
	column.validate = function(value)
	{
	};
	edition.addColumn(column);
	
	column = new JQGrid_Column_Model();
	column.name = "recintoOrigen";
	column.type = "dropdown";
	column.dropdown_options = function(aColumn)
	{
		var opts = { };
	
		opts.sourceUrl = "rest/RecintoOrigen/get-all";
		opts.sourceParams = { };
		opts.optionObject = function(obj) { return { label : obj.descripcion, id : obj.recinto }; };

		opts.sourceError = function(data)
		{
			window.setTimeout(function() { aColumn.cancelColumnValue(); }, 100);
			showMessage(data.message);
		};

		return opts;
	};
	column.beforeEdit = function(rowid, cellname, value, iRow, iCol)
	{
	};
	column.afterSave = function(rowid, cellname, value, iRow, iCol)
	{
	};
	edition.addColumn(column);

	edition.addColumn(getSpecialColumn());
// 	edition.addColumn(getReferenciaColumn());

	/*
	* grid options
	*/
	gridOptions = {
		caption : "<spring:message code='Appointments' />",
		datatype : 'local',
		data : tableData,
		loadonce : true,
		cellEdit : true,
		cellsubmit : 'clientArray',
		pager : "#tablePager",
		viewrecords : true,
		height : 150,
		sortname : 'id',
		sortorder : 'asc',
		width : '1000',
		shrinkToFit : false,
		forceFit : false,

		colModel :
		[
			{ name : 'id', index : 'id', label : 'ID', align : 'right', width : 25, sortable : false, editable : false },
			{ name : 'extra', index : 'extra', hidden : true },
			{ name : 'appointmentId', index : 'appointmentId', hidden : true },
			{
				name : 'booking',
				index : 'booking',
				label : "<spring:message code='Booking' />",
				width : 110,
				sortable : false,
				editable : true
			},			
			{
				name : 'linea',
				index : 'linea',
				label : "<spring:message code='Line' />",
				width : 110,
				sortable : false,
				editable : false
			},
			{
				name : 'buqueViaje',
				index : 'buqueViaje',
				label : "<spring:message code='Buque_Viaje' />",
				width : 180,
				sortable : false,
				editable : false
			},
			{
				name : 'pod',
				index : 'pod',
				label : "<spring:message code='POD' />",
				width : 200,
				sortable : false,
				editable : false
			},
			{
				name : 'fpod',
				index : 'fpod',
				label : "<spring:message code='FPOD' />",
				width : 140,
				sortable : false,
				editable : false
			},
			{
				name : 'fk',
				index : 'fk',
				label : "<spring:message code='FK' />",
				width : 135,
				sortable : false,
				editable : false
			},
			{
				name : 'tipo',
				index : 'tipo',
				label : "<spring:message code='Type' />",
				width : 110,
				sortable : false,
				editable : true
			},
			{
				name : 'contenedor',
				index : 'contenedor',
				label : "<spring:message code='Container' />",
				width : 110,
				sortable : false,
				editable : true
			},
			{
				name : 'peso',
				index : 'peso',
				label : "<spring:message code='Weight_tara' />",
				width : 130,
				sortable : false,
				editable : true,
				edittype : 'text'
			},
			{
				name : 'contenido',
				index : 'contenido',
				label : "<spring:message code='Contenido' />",
				width : 110,
				sortable : false,
				editable : false
			},
			{
				name : 'sello1',
				index : 'sello1',
				label : "<spring:message code='Sello1' />",
				width : 110,
				sortable : false,
				editable : true,
				edittype : 'text'
			},
			{
				name : 'sello2',
				index : 'sello2',
				label : "<spring:message code='Sello2' />",
				width : 110,
				sortable : false,
				editable : true,
				edittype : 'text'
			},
			{
				name : 'sello3',
				index : 'sello3',
				label : "<spring:message code='Sello3' />",
				width : 110,
				sortable : false,
				editable : true,
				edittype : 'text'
			},
			{
				name : 'sello4',
				index : 'sello4',
				label : "<spring:message code='Sello4' />",
				width : 110,
				sortable : false,
				editable : true,
				edittype : 'text'
			},
			{
				name : 'hasHazard',
				index : 'hasHazard',
				label : "<spring:message code='Has_Hazard' />",
				width : 110,
				sortable : false,
				editable : false,
				formatter : 'checkbox'
			},
			{
				name : 'imo',
				index : 'imo',
				label : "<spring:message code='IMO' />",
				width : 110,
				sortable : false,
				editable : false
			},
// 			{
// 				name : 'undg',
// 				index : 'undg',
// 				label : "<spring:message code='UNDG' />",
// 				width : 110,
// 				sortable : false,
// 				editable : false
// 			},
			{
				name : 'hasMarinePollutants',
				index : 'hasMarinePollutants',
				label : "<spring:message code='Marine_Pol' />",
				width : 110,
				sortable : false,
				editable : false,
				formatter : 'checkbox'
			},
			{
				name : 'requireConnection',
				index : 'requireConnection',
				label : "<spring:message code='Req_Connection' />",
				width : 110,
				sortable : false,
				editable : false,
				formatter : 'checkbox'
			},
			{
				name : 'setPoint',
				index : 'setPoint',
				label : "<spring:message code='Set_Point' />",
				width : 110,
				sortable : false,
				editable : false
			},
			{
				name : 'hasDimensions',
				index : 'hasDimensions',
				label : "<spring:message code='Has_Dimensions' />",
				width : 110,
				sortable : false,
				editable : false,
				formatter : 'checkbox'
			},
			{
				name : 'recintoOrigen',
				index : 'recintoOrigen',
				label : "<spring:message code='Recinto_Origen' />",
				width : 110,
				sortable : false,
				editable : true
			},
			{
				name : 'special',
				index : 'special',
				label : "<spring:message code='Special' />",
				width : 250,
				sortable : false,
				editable : true
			},
			{
				name : 'costado',
				index : 'costado',
				label : "<spring:message code='Side' />",
				width : 110,
				sortable : false,
				editable : true,
				edittype : 'checkbox',
				formatter : 'checkbox'
			},
// 			{
// 				name : 'referencia',
// 				index : 'referencia',
// 				label : "<spring:message code='Reference' />",
// 				width : 110,
// 				sortable : false,
// 				editable : true,
// 				edittype : 'text'
// 			},
			{
				name : 'appointmentNbr',
				index : 'appointmentNbr',
				label : "<spring:message code='Appointment' />",
				width : 110,
				sortable : false,
				editable : false,
				edittype : 'text'
			},
			{
				name : 'status',
				index : 'status',
				label : "<spring:message code='Status' />",
				width : 110,
				sortable : false,
				editable : false,
				edittype : 'text'
			}
		],
		
		onCellSelect : cellSelected
	};
}

function updateRequireConnection(myColumn)
{
	var contenedor = myColumn.getColumnValue("contenedor");
	var tipo = myColumn.getColumnValue("tipo");

	// require connection when container is R1 and booking requires a connection (temperature != null))
	var requireConnection = tipo != null && tipo.requireConnection ;
// 	var requireConnection = tipo != null && tipo.requireConnection && contenedor != null && (contenedor.label.indexOf('R') != -1);

	myColumn.setColumnValue('requireConnection', requireConnection);
}

function operationValidateRowInfo(rowData)
{
	if (isDataEmpty(rowData.booking))
		throw new SolicitudError("<spring:message code='Booking_must_be_defined' />");

	if (isDataEmpty(rowData.contenedor))
		throw new SolicitudError("<spring:message code='Container_must_be_defined' />");
	
	if (isDataEmpty(rowData.peso))
		throw new SolicitudError("<spring:message code='Weight_must_be_defined' />");
}
</script>
</html>