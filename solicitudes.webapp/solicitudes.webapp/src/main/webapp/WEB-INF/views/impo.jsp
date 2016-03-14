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
	* contenedor column
	*/
	var column = new JQGrid_Column_Model();
	column.name = "contenedor";
	column.type = "autocomplete";
	column.autocomplete_options = function(aColumn)
	{
		var opts = { };
		opts.minLength = 11;
		opts.source = function(req, resp)
		{
			jQuery.getJSON("rest/Contenedor/impo/like.json?results=10&match="
				+ encodeURIComponent(req.term.toUpperCase())
				+ "&consigne=" + encodeURIComponent(solicitudUserCompanyCode), { }, resp);
		};
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
	}
	column.afterSave = function(rowid, cellname, value, iRow, iCol)
	{
		var myColumn = this;

		jQuery.getJSON("rest/Contenedor/" + value.id, null, function(data)
		{
			var obj = data;

			// validates customer and shipper solicitud matches container
			try
			{
				validatesSolicitudInfoAgainstContainer(obj);
			}
			catch (ex)
			{
				showMessage(ex.getMessage());
				window.setTimeout(function() { myColumn.setColumnValue(myColumn.name, null); }, 100);
				return;
			}

			myColumn.setColumnValue('bl', getColumnObjectForAtomicValue(obj.bl_Nbr));
			myColumn.setColumnValue('tipo', getColumnObjectForAtomicValue(obj.type_Iso));
			myColumn.setColumnValue('linea', getColumnObjectForAtomicValue(obj.line_Op));
			myColumn.setColumnValue('temporal', obj.temporal);
			myColumn.setColumnValue('recintoDestino', getColumnObjectForAtomicValue(obj.recinto_Tit));
			myColumn.setColumnValue('special', getColumnObjectForAtomicValue(obj.special));
			myColumn.setColumnValue('costado', checked=true);
		});
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
				name : 'contenedor',
				index : 'contenedor',
				label : "<spring:message code='Container' />",
				width : 110,
				sortable : false,
				editable : true
			},
			{
				name : 'bl',
				index : 'bl',
				label : "<spring:message code='Bl' />",
				width : 120,
				sortable : false,
				editable : false
			},
			{
				name : 'tipo',
				index : 'tipo',
				label : "<spring:message code='Type' />",
				width : 110,
				sortable : false,
				editable : false,
				edittype : 'text'
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
				name : 'temporal',
				index : 'temporal',
				label : "<spring:message code='Temporal' />",
				width : 110,
				sortable : false,
				editable : false,
				edittype : 'text'
			},
			{
				name : 'recintoDestino',
				index : 'recintoDestino',
				label : "<spring:message code='Target_Recint' />",
				width : 130,
				sortable : false,
				editable : false,
				edittype : 'text'
			},
			{
				name : 'special',
				index : 'special',
				label : "<spring:message code='Special' />",
				width : 110,
				sortable : false,
				editable : false,
				edittype : 'text'
			},
			{
				name : 'costado',
				index : 'costado',
				label : "<spring:message code='Side' />",
				width : 110,
				sortable : true,
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

function operationValidateRowInfo(rowData)
{
	if (isDataEmpty(rowData.contenedor))
		throw new SolicitudError("<spring:message code='Container_must_be_defined' />");
}
</script>
</html>