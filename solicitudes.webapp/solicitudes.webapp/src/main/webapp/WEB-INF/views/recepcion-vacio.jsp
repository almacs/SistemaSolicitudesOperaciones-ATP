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

			var obj = data;

			var typeFromContainer = obj == null ? null : obj.type_Iso;
			var lineFromContainer = obj == null ? null : obj.line_Op;
			var temporalFromContainer = obj == null ? null : obj.temporal;
			var specialFromContainer = obj == null ? null : obj.special;

			myColumn.setColumnValue('tipo', getColumnObjectForAtomicValue(typeFromContainer));
			myColumn.setColumnValue('linea', getColumnObjectForAtomicValue(lineFromContainer));
			myColumn.setColumnValue('temporal', getColumnObjectForAtomicValue(temporalFromContainer));

			// set the extra values
			var extra = myColumn.getColumnValue('extra');
			extra.typeFromContainer = typeFromContainer;
			extra.lineFromContainer = lineFromContainer;
			extra.temporalFromContainer = temporalFromContainer;
			extra.specialFromContainer = null;

			// if temporal not defined, notify
			if (temporalFromContainer == null)
				showMessage("<spring:message code='Requires_file' />");

			// get the special
// 			if (specialFromContainer != null)
// 			{
// 				blockPage();
// 				jQuery.getJSON("rest/Special/" + encodeURIComponent(specialFromContainer), null, function (dataSpecial)
// 				{
// 					unblockPage();
					
// 					myColumn.setColumnValue('special', {id: dataSpecial.special, label: dataSpecial.descripcion});
// 				});
// 			}
// 			else
// 			{
// 				myColumn.setColumnValue('special', null);
// 			}
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

	/*
	* line column
	*/
	column = new JQGrid_Column_Model();
	column.name = "linea";
	column.type = "autocomplete";
	column.autocomplete_options = function(aColumn)
	{
		var opts = { };
		opts.minLength = 2;
		opts.source = function(req, resp)
		{
			jQuery.getJSON("rest/LineaNaviera/like.json?results=10&match=" + encodeURIComponent(req.term.toUpperCase()), { }, resp);
		};
		opts.create = function(event, ui) { jQuery(event.target).addClass("inputToUppercase");	};
		return opts;
	};
	column.beforeEdit = function(rowid, cellname, value, iRow, iCol)
	{
		var myColumn = this;
		var extra = myColumn.getColumnValue('extra');

		if (extra.lineFromContainer != null)
		{
			showMessage("<spring:message code='The_line_is_defined_by_container' />");
			window.setTimeout(function() { getTable().jqGrid('restoreCell', iRow, iCol); }, 100);
		}
	};
	column.afterSave = function(rowid, cellname, value, iRow, iCol)
	{
	};
	column.validate = function(value)
	{
	};
	edition.addColumn(column);

	/*
	* type column
	*/
	column = new JQGrid_Column_Model();
	column.name = "tipo";
	column.type = "autocomplete";
	column.autocomplete_options = function(aColumn)
	{
		var opts = { };
		opts.minLength = 2;
		opts.source = function(req, resp)
		{
			jQuery.getJSON("rest/TipoRecepcionVacio/like.json?results=10&match=" + encodeURIComponent(req.term.toUpperCase()), { }, resp);
		};
		opts.create = function(event, ui) { jQuery(event.target).addClass("inputToUppercase");	};
		return opts;
	};
	column.beforeEdit = function(rowid, cellname, value, iRow, iCol)
	{
		var myColumn = this;
		var extra = myColumn.getColumnValue('extra');

		if (extra.typeFromContainer != null)
		{
			showMessage("<spring:message code='The_type_is_defined_by_container' />");
			window.setTimeout(function() { getTable().jqGrid('restoreCell', iRow, iCol); }, 100);
		}
	};
	column.afterSave = function(rowid, cellname, value, iRow, iCol)
	{
	};
	column.validate = function(value)
	{
	};
	edition.addColumn(column);

	/*
	* temporal column
	*/
	column = new JQGrid_Column_Model();
	column.name = "temporal";
	column.type = "string";
	column.beforeEdit = function(rowid, cellname, value, iRow, iCol)
	{
		var myColumn = this;
		var extra = myColumn.getColumnValue('extra');

		if (extra.temporalFromContainer != null)
		{
			showMessage("<spring:message code='Temporal_is_defined_by_container' />");
			window.setTimeout(function() { getTable().jqGrid('restoreCell', iRow, iCol); }, 100);
		}
	};
	column.afterSave = function(rowid, cellname, value, iRow, iCol)
	{
	};
	column.validate = function(value)
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
				name : 'contenedor',
				index : 'contenedor',
				label : "<spring:message code='Container' />",
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
				editable : true
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
				name : 'temporal',
				index : 'temporal',
				label : "<spring:message code='Temporal' />",
				width : 110,
				sortable : false,
				editable : true,
				edittype : 'text'
			},
			{
				name : 'special',
				index : 'special',
				label : "<spring:message code='Special' />",
				width : 210,
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
	// if gate is IST or RFI, then special is required
	if (solicitudUserCompanyCode == "IST" || solicitudUserCompanyCode == "RFI")
	{
		if (rowData.special == null)
			throw new SolicitudError("<spring:message code='Special_column_is_required_for_gate' />");
	}

	if (isDataEmpty(rowData.contenedor))
		throw new SolicitudError("<spring:message code='Container_must_be_defined' />");

	if (isDataEmpty(rowData.linea))
		throw new SolicitudError("<spring:message code='Line_must_be_defined' />");

	if (isDataEmpty(rowData.tipo))
		throw new SolicitudError("<spring:message code='Type_must_be_defined' />");
}
</script>

</html>