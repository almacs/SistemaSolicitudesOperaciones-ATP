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
		opts.minLength = 3;
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
				window.setTimeout(function() { myColumn.setColumnValue('booking', null); }, 100);
			}
			else
			{
				myColumn.setColumnValue('linea', getColumnObjectForAtomicValue(linea));
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
		opts.sourceUrl = "rest/BookingItem/searchType.json";
		opts.sourceParams = { bookingId: bookingId };
		opts.optionObject = function(obj) { return { label : obj.typeIso, id : obj.id }; };
		opts.sourceError = function(data)
		{
			window.setTimeout(function() { aColumn.restoreColumn('tipo'); }, 100);
			showMessage(data.message);
		};

		return opts;
	};
	column.afterSave = function(rowid, cellname, value, iRow, iCol)
	{
		var myColumn = this;
		myColumn.setColumnValue('clase', getColumnObjectForAtomicValue(null));
	};
	column.validate = function(value)
	{
	};
	edition.addColumn(column);

	/*
	* clase column
	*/
	column = new JQGrid_Column_Model();
	column.name = "clase";
	column.type= "dropdown";
	column.dropdown_options = function(aColumn)
	{
		var rowData = getTable().jqGrid('getLocalRow', aColumn.getModel().cellInfo.rowid);

		var bookingId = rowData.booking.id;
		var bookingItemId = rowData.tipo.id;

		var opts = { };
		opts.sourceUrl = "rest/BookingItem/search.json";
		opts.sourceParams = { bookingId: bookingId, bookingItemId: bookingItemId };
		opts.optionObject = function(obj) { return { label : obj.grade, id : obj.id }; };
		opts.sourceError = function(data)
		{
			window.setTimeout(function() { aColumn.restoreColumn('clase'); }, 100);
			showMessage(data.message);
		};
		
		return opts;
	};
	column.afterSave = function(rowid, cellname, value, iRow, iCol)
	{
	};
	column.validate = function(value)
	{
	};
	edition.addColumn(column);

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
				editable : false,
				edittype : 'text'
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
				name : 'clase',
				index : 'clase',
				label : "<spring:message code='Class' />",
				width : 110,
				sortable : false,
				editable : true
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

function operationValidateRowInfo(rowData)
{
	if (isDataEmpty(rowData.booking))
		throw new SolicitudError("<spring:message code='Booking_must_be_defined' />");

	if (isDataEmpty(rowData.tipo))
		throw new SolicitudError("<spring:message code='Type_must_be_defined' />");

	if (isDataEmpty(rowData.clase))
		throw new SolicitudError("<spring:message code='Class_must_be_defined' />");
}
</script>
</html>