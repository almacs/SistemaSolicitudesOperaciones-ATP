<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<head>

<title><c:out value='${title}' /></title>
<c:import url="/libraries.jsp" />
<c:import url="/libraries_table.jsp" />

<script type="text/javascript" src="js/jqgrid-column-edition.js"></script>
<script type="text/javascript" src="panels/fake-panel.js"></script>
<script type="text/javascript" src="panels/comentario-panel.js"></script>
<script type="text/javascript" src="panels/cancel-appointment-panel.js"></script>

</head>

<body>
	<c:import url="/header.jsp">
		<c:param name='title' value='${title}' />
	</c:import>

	<div align=center>
	
	<c:import url="/navigationbar.jsp" />
	
	<c:if test='${error == ""}'>
		<div align=center>
			<h1></h1>
			<p></p>
		</div>
	</c:if>

	<h2><c:out value='${title}' /></h2>

		<c:import url="/solicitud_header_data.jsp" />
		<br/>
		
		<table id="transporterTable"></table>
		<div id="transporterPager"></div>

<!-- 		<div class="solicitudHeaderContainer" align=center> -->
<!-- 			<table class=noPaddingTable> -->
<!-- 				<tr> -->
<!-- 					<td> -->
<%-- 						<label><spring:message code='Transporter' />:</label> --%>
<!-- 						<input type=text id="transportista" /> -->
<!-- 					</td> -->
<!-- 					<td> -->
<%-- 						<label><spring:message code='Operator' />:</label> --%>
<!-- 						<input type=text id="operador" /> -->
<!-- 					</td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td> -->
<%-- 						<label><spring:message code='Plates' />:</label> --%>
<!-- 						<input type=text id="placas" class="inputToUppercase" maxlength="10"/> -->
<!-- 					</td> -->
<!-- 					<td> -->
<!-- 					&nbsp; -->
<!-- 					</td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td> -->
<%-- 						<label><spring:message code='Date' />:</label> --%>
<!-- 						<input type=text id="dayScheduled" /> -->
<!-- 					</td> -->
<!-- 					<td> -->
<%-- 						<label><spring:message code='Time' />:</label> --%>
<!-- 						<select id="timeScheduled"></select> -->
<!-- 					</td> -->
<!-- 				</tr> -->
<!-- 			</table> -->		
<!-- 		</div> -->
		<br/>

		<table class="display" id="table"></table>
		<div id="tablePager"></div>

		<div id="cancelPanelContainer" style="display: none;"></div>
		<div id="comentarioContainer" style="display: none;"></div>
	</div>

	<br/>
	
    <div class="genericButtonsArea" align=center>
            <input _clickBind="applySolicitudInfo" class="_clickBind" type="button" value="<spring:message code='Request_Appointment' />" />
            |
<%-- 	<sec:authorize access="!hasAnyRole('TI','TA')"> --%>
			<input _clickBind="canceledAppointment" class="_clickBind" type=button value="<spring:message code='Cancel_Appointment' />" />
			|
<%-- 	</sec:authorize>		 --%>
		    <input _clickBind="openComentarioPanel" class="_clickBind" type="button" value="<spring:message code='Comments' />" ></input>
			<input _clickBind="requestPaseDeEntrada" class="_clickBind" type=button value="<spring:message code='Entry_pass' />" />
 			| 
     	   	<input _clickBind="gotoSolicitudes" class="_clickBind" type=button value="<spring:message code='Return_solicitud' />" />
		</div>			
	<c:import url="/footer.jsp" />

	<div id="modalMessage"><p></p></div>
	
	<iframe id="downloadDocument" name="downloadDocument" src="" style="display: none;"></iframe>
</body>
<input type="hidden" id="checkTIT" />
<input type="hidden" id="recintoSelected" />

<script type="text/javascript">
//execute loaded function when page loaded
var baseRequestPath = "<c:out value='${view}' escapeXml="false" />";

var solicitudId = <c:out value='${solicitud.folio}' escapeXml="false" />;
var appointments = [];
var selectedAppointmentId = null;

var loggedUserId = ${_SessionModel.loggedUser.id};

var solicitudStatus = "${solicitud.status.name}";
var solicitudUserId = ${solicitudUser.id};
var solicitudUserN4Id = ${solicitudUser.usuarioN4_id};
var solicitudUserCompanyCode = "${solicitudUser.empresa.codigo}";
var solicitudTranType = "${solicitud.operationType.tranType}";
var solicitudMaxContainers = ${maxContainers};
var solicitudClienteId = ${solicitud.clienteId};
var solicitudAgenciaAduanalId = ${solicitud.agenciaAduanalId};

var cancelList = (<c:out value='${cancelList}' escapeXml="false" />);

var solicitudIdApp = null;
var operationValidateRowInfo = null;
var cancelPanel = null;

var comentarioPanel = null;

var table = null;
var transporterTable = null;

var transporterTableData =  <c:out value='${transporters}' escapeXml='false' default='[]'/>;
var tableData = [ ];
var objectTableData = [];

var bookingData = null;

jQuery(document).ready(loaded);

function loaded()
{
	//cache the table on a JS variable
	table = jQuery("#table");
	transporterTable = jQuery('#transporterTable');
	
	// initialize solicitud information
	initializeSolicitudInfo();

	// build the table
	buildTransporterTable();
	buildTable();
	
// 	addAppointmentsToTable();
	
	// individual button actions
	bindClickEvent("_clickBind");

	// build comentario panel
	initComentarioPanel();

	
	jQuery("#cancelPanelContainer").load(Cancel_Appointment_Panel.uiFile, function(response, status, xhr) 
			{		
				cancelPanel = new Cancel_Appointment_Panel();

				cancelPanel.parent = jQuery("#cancelPanelContainer");
				cancelPanel.fillCancellation(cancelList);
				cancelPanel.init();	
			});
	
	// highlight menu
	highlightNavigationBarItem("solicitudMenu");
}

/*
 * Solicitud Info functions
 */
function initializeSolicitudInfo()
{
// 	jQuery("#transportista").autocomplete
// 	({ 
// 		source: function(req, resp)
// 		{
// 			blockPage();
// 			jQuery.getJSON("rest/Transportista/like.json?results=20&match=" + encodeURIComponent(req.term.toUpperCase()), { }, resp);
// 		},
// 		create: function(event, ui) { jQuery(event.target).addClass("inputToUppercase"); },
// 		minLength: 2,

// 		open: function(event, ui)
// 		{
// 			unblockPage();
// 		},

// 		response: function(event, ui)
// 		{
// 			unblockPage();
// 		},

// 		select: function(event, ui)
// 		{
// 			jQuery(event.target).attr("objectId", ui.item.key);
// 		}
//     });

// 	jQuery("#operador").autocomplete
// 	({ 
// 		source: function(req, resp)
// 		{
// 			blockPage();
// 			jQuery.getJSON("rest/OperadorTransportista/like.json?results=20&match=" + encodeURIComponent(req.term.toUpperCase()), { }, resp);
// 		},
// 		create: function(event, ui) { jQuery(event.target).addClass("inputToUppercase"); },
// 		minLength: 3,

// 		open: function(event, ui)
// 		{
// 			unblockPage();
// 		},

// 		response: function(event, ui)
// 		{
// 			unblockPage();
// 		},

// 		select: function(event, ui)
// 		{
// 			jQuery(event.target).attr("objectId", ui.item.key);
// 		}
//     });
	
// 	jQuery("#dayScheduled")
// 		.datepicker({dateFormat: 'yy-mm-dd'})
// 		.val("${dayScheduled}")
// 		.change(function() { updateSolicitudInfoTimeSlots(); });

// 	setAutocompleteInfo("#transportista", <c:out value='${transportista}' escapeXml="false" />, function(obj) { return { id: obj.id, label: obj.nombre }; });
// 	setAutocompleteInfo("#operador", <c:out value='${operadorTransportista}' escapeXml="false" />, function(obj) { return { id: obj.gKey, label: obj.name }; });
// 	jQuery("#placas").val("<c:out value='${placas}' escapeXml="false" />");
// 	jQuery("#dayScheduled").val("<c:out value='${dayScheduled}' escapeXml="false" />");
// 	setInitialScheduledTime("${timeScheduled}");
}

function setInitialScheduledTime(value)
{
	var field = jQuery("#timeScheduled");
	field.find('option').remove();
	
	if (value != null)
	{
		field.append(new Option(value, value));
		field.val(value);
	}
}

// function updateSolicitudInfoTimeSlots()
// {
// 	var params = { date: jQuery("#dayScheduled").val() };

// 	var field = jQuery("#timeScheduled");
// 	var previousValue = field.val();
// 	field.find('option').remove();

// 	blockPage();
// 	jQuery.postJSON("appointment/get-time-slots.json", params,
// 	function(data)
// 	{
// 		unblockPage();

// 		if (data.error)
// 		{
// 			showMessage(data.message);
// 		}
// 		else
// 		{
// 			var col = data.body;

// 			field.append(new Option("", ""));

// 			jQuery.each(col, function(eachIndex, eachObject)
// 			{
// 				var eachSelObj = { label: eachObject, id: eachObject };
// 				field.append(new Option(eachSelObj.label, eachSelObj.id));
// 			});

// 			if (previousValue != null)
// 				field.val(previousValue);
// 		}
// 	},
// 	function(errorData)
// 	{
// 		unblockPage();
// 	}
// 	);
// }

function getSolicitudData()
{
	var obj = {};
	
	var data = getDataFromSelectedTransporter();
	
	obj.transportista = data.transporter.id;
	obj.operador = data.operator.id;
	obj.placas = data.plates;
	obj.dayScheduled = data.date;
	obj.timeScheduled = data.time.id;
	obj.TIT = $(data.TIT);
	
	validateSolicitudData(obj);

	obj.appointments = getAppointmentsData();

	//setTemporaly appointments
	var selectedRow = getTransporterTable().jqGrid('getGridParam','selrow');
	getTransporterTable().jqGrid('setCell',selectedRow,'appointments', JSON.stringify(obj.appointments).replace(/\.label/g,''));
	return obj;
}

function getSolicitudStatus()
{
	return solicitudStatus;
}

// function validateTransporterData(selectedRow)
// {
// 	var rowData = getTransporterTable().getRowData(selectedRow);
	
// 	if (isDataEmpty(rowData.transporter.id))
// 		throw new SolicitudError("<spring:message code='Transport_must_be_defined' />");
	
// 	if (isDataEmpty(rowData.operator.id))
// 		throw new SolicitudError("<spring:message code='Operator_must_be_defined' />");
	
// 	if (isDataEmpty(rowData.plates))
// 		throw new SolicitudError("<spring:message code='Plates_must_be_defined' />");
	
// 	if (isDataEmpty(rowData.date))
// 		throw new SolicitudError("<spring:message code='Date_must_be_defined' />");
	
// 	if (isDataEmpty(rowData.time.id))
// 		throw new SolicitudError("<spring:message code='Time_must_be_defined' />");	
// }

function validateSolicitudData(obj)
{
	if (isDataEmpty(obj.transportista))
	{
		throw new SolicitudError("<spring:message code='Transport_must_be_defined' />");
	}

	if (isDataEmpty(obj.operador))
	{
		throw new SolicitudError("<spring:message code='Operator_must_be_defined' />");
	}

	if (isDataEmpty(obj.placas))
	{
		throw new SolicitudError("<spring:message code='Plates_must_be_defined' />");
	}

	if (isDataEmpty(obj.dayScheduled))
	{
		throw new SolicitudError("<spring:message code='Date_must_be_defined' />");
	}
	
	
	//#Req Id 29 by Neitek	
	var checkboxTIT = $(obj.TIT); 
	 
	
	
	if ("1" == $('#checkTIT').val() && $('#recintoSelected').val().length == 0)
	{ 
		throw new SolicitudError("<spring:message code='TIT_without_recinto' />");
	}
	
	if (isDataEmpty(obj.timeScheduled))
	{
		throw new SolicitudError("<spring:message code='Time_must_be_defined' />");
	}
}

function getAppointmentsData()
{
    var ids = getTable().jqGrid('getDataIDs');
    
    var col = [];
    var c = 0;

    jQuery.each(ids, function(index, eachId)
    {
        var rowData = getRowData(eachId);
        
        rowData =  JSON.stringify(rowData).replace(/\.label/g,'');
        
        rowData = JSON.parse(rowData);
        
        var status = rowData.status;

        if (status == Solicitudes.Constants.AppointmentStatusCreated || status == null)
        {
   			if (operationValidateRowInfo != null)
   				operationValidateRowInfo(rowData);

 	        var copy = { };
	        jQuery.extend(copy, rowData);
	        col[c] = copy;
	        c++;
        }
    });

    return col;
}

function showMessageIfInvalidContenedor(iCol, message)
{
	var colName = getTable().jqGrid('getGridParam','colNames')[iCol];
	if (typeof colName != 'undefined') {
		if (colName.toUpperCase() == 'CONTENEDOR')
			showMessage(message);
	}
}

function isValidContenedor(contenedor)
{
	return /[A-Z]{4,4}[0-9]{7,7}/.test(contenedor.toUpperCase().trim());
}

/*
 * Comentario Panel functions
 */
function initComentarioPanel()
{
	// build comentario panel
	comentarioPanel = new Comentario_Panel();
	comentarioPanel.ownerId = solicitudId;
	comentarioPanel.mergeObject = {solicitudId: solicitudId, usuarioId: loggedUserId};
	comentarioPanel.restUrls =
	{
		get: "rest/SolicitudComentario/",
		save: "rest/SolicitudComentario/saveNotify/",
		list: "rest/SolicitudComentario/fromSolicitud/"
	};
	comentarioPanel.parent = jQuery("#comentarioContainer");
	comentarioPanel.load("comentario-panel.jsp", function(panel)
	{
		comentarioPanel.init();
	});
}

function openComentarioPanel()
{
	comentarioPanel.update();
	comentarioPanel.open("<spring:message code='Comments' />");
}

/*
 * Button actions
 */

function gotoSolicitudes()
{ 
	redirectURL("solicitud.page");
}

function requestPaseDeEntrada()
{
	try
	{
		var appointmentNbr = getAppointmentNbr();
		
		jQuery("#downloadDocument").attr("src", "rest/PaseDeEntradaReport/pdf/" + appointmentNbr);
	}
	catch (ex)
	{
		showMessage(ex.getMessage());
	}
}

function applySolicitudInfo()
{
	var obj = null;
	
	try
	{
		obj = getSolicitudData();
	}
	catch (ex)
	{
		showMessage(ex.getMessage());
		return;
	}

	blockPage();
	jQuery.postJSON(baseRequestPath + "/accept-general-information.json", obj, function(data)
	{
		unblockPage();

		var message = convertLinesToHTMLBreaks(data.message);

		var dialogParams = { width : '600px'};
		if (data.error)
			dialogParams.title = 'Error';

		showMessage(message, dialogParams);

		var appointmentsResponse = data.body;

		jQuery.each(appointmentsResponse, function(eachAppointmentIndex, eachAppointmentInfo)
		{
			var aRowId = eachAppointmentInfo.id;

			getTable().jqGrid('setCell', aRowId, "appointmentNbr", eachAppointmentInfo.appointmentNbr);
			getTable().jqGrid('setCell', aRowId, "appointmentId", eachAppointmentInfo.appointmentId);
			getTable().jqGrid('setCell', aRowId, "status", eachAppointmentInfo.status);
		});
	});
}

/*
 * Cancel Appointment
 */

	function canceledAppointment()
	{
		var appointmentId = getAppointmentId();
		$("#cancelAppointmentPanelContainer").find("#appointment").val(appointmentId);
 
		cancelAppointment(appointmentId); 
		
	}

	function cancelAppointment(appointmentId) 
	{
		unblockPage();
		cancelPanel.open("<spring:message code='Cancellation' />");

	}
	
	function cancelCallBack()
	{
		var rowData = getRowData(selectedAppointmentId);
		var status = rowData.status;
		getTable().jqGrid('setCell', rowData.id, "status", status);
	}
	
	/*
	 * Table functions
	 */

	var edition = null;
	var gridOptions = null;
	
	var transporterEdition = null;
	var transporterGridOptions = null;

	function getTransporterTable() {
		return transporterTable;
	}
	
	function getTable() {
		return table;
	}

	//TODO: I think this function is not being used.
	function getAppointmentTable() {
		return jQuery('#table');
	}

	function addAppointmentsToTable() {
		jQuery.each(appointments, function(eachAppointmentIndex,
				eachAppointment) {
			var newRow = getRowForAppointment(eachAppointment);
			getTable().jqGrid('addRowData', newRow.id, newRow);
		});
	}

	function getRowForAppointment(aRow) {
		var obj = new Object();

		for ( var key in aRow) {
			var slotValue = aRow[key];

			if (slotValue instanceof Object)
				obj[key] = new JQGrid_Column_Value(slotValue.id,
						slotValue.label);
			else
				obj[key] = slotValue;
		}

		return obj;
	}

	function getColumnObjectForAtomicValue(anObject) {
		if (anObject == null)
			return null;

		return new JQGrid_Column_Value(null, anObject);
	}
	
	function getColumnObjectForAtomicValueWithId(anObject) {
		if (anObject == null)
			return null;

		return new JQGrid_Column_Value(anObject, anObject);
	}


	function isRegisteredAppointment() {
		var result = true;

		try {
			getAppointmentId();
		} catch (ex) {
			result = false;
		}

		return result;
	}

	function getAppointmentId() {
		var rowData = getSelectedRowData();

		if (!isRowRegistered(rowData))
			throw new SolicitudError(
					"<spring:message code='The_appointment_is_not_registered_yet' />");

		return rowData.appointmentId;
	}

	function getAppointmentNbr() {
		var rowData = getSelectedRowData();

		if (!isRowRegistered(rowData))
			throw new SolicitudError(
					"<spring:message code='The_appointment_is_not_registered_yet' />");

		return rowData.appointmentNbr;
	}

	function getSelectedRowData() {
		if (selectedAppointmentId == null)
			throw new SolicitudError(
					"<spring:message code='No_appointment_selected' />");

		var rowData = getRowData(selectedAppointmentId);

		return rowData;
	}

	function getRowData(rowIndex) {
		return getTable().jqGrid('getLocalRow', rowIndex);
	}
	
	function buildTransporterTable() {
		buildTransporterTableDefinition();
		
		var fullOptions = transporterEdition.computeOptionsForGrid(transporterGridOptions);
		getTransporterTable().jqGrid(fullOptions);
		
		getTransporterTable()
				.jqGrid(
						'navGrid',
						'#transporterPager',
						{
							add: true,
							del: true,
							edit: false,
							search: false,
							delfunc: function(rowId) {
								var rowData = getRowData(rowId);

								//TODO: Need to improved to be able to work with the tranposters.
// 								if (isRowRegistered(rowData)) {
// 									showMessage("<spring:message code='Cannot_delete_a_registered_appointment' />");
// 									return;
// 								}

								getTransporterTable().jqGrid('resetSelection');
								getTransporterTable().jqGrid('delRowData', rowId);

								transporterEdition.cellInfo.rowid = null;
								
								selectedAppointmentId = null;								
							},
							addfunc: function(rowId) {
								try {
									validateAddNewRowToTransporterTable();

									var newRow = {
										id : getNextNewTransporterId(),
										extra : {}
									};									
									
									var rowData = getDataFromSelectedTransporter();
									if (rowData != null) {
										getTransporterTable().jqGrid('resetSelection');			 
										//objectTableData[rowData.id] = getTable().jqGrid('getGridParam', 'data');
									}
									
									getTransporterTable().jqGrid('addRowData', newRow.id, newRow);
									
									//clear the appoinments's table
									getTable().clearGridData(true).trigger("reloadGrid");
									//just to select the nex row on the transporter table
									getTransporterTable().jqGrid('editCell', newRow.id, 0, false);
									
									selectedAppointmentId = null;
								} catch (ex) {
									showMessage(ex.getMessage());
								}
							}
						}				
				);
	}

	function buildTable() {
		buildTableDefinition();

		var fullOptions = edition.computeOptionsForGrid(gridOptions);

		getTable().jqGrid(fullOptions);

		getTable()
				.jqGrid(
						'navGrid',
						'#tablePager',
						{
							add : true,
							del : true,
							edit : false,
							search : false,
							delfunc : function(rowId) {
								var rowData = getRowData(rowId);

								if (isRowRegistered(rowData)) {
									showMessage("<spring:message code='Cannot_delete_a_registered_appointment' />");
									return;
								}

								getTable().jqGrid('resetSelection');
								getTable().jqGrid('delRowData', rowId);

								edition.cellInfo.rowid = null;

								selectedAppointmentId = null;
							},
							addfunc : function() {
								try {									
									var selectedRow = getTransporterTable().jqGrid('getGridParam','selrow');
									if (selectedRow == null)
										throw new SolicitudError("<spring:message code='Select_a_carrier' />");
									
									//validateTransporterData(selectedRow);
									validateAddNewRow();

									var newRow = {
										id : getNextNewId(),
										extra : {}
									};
									getTable().jqGrid('addRowData', newRow.id, newRow);
									getTable().jqGrid('editCell', newRow.id, 0, false);

									selectedAppointmentId = null;
								} catch (ex) {
									showMessage(ex.getMessage());
								}
							}
						});

		jQuery.jgrid.info_dialog = function(caption, message) {
			showMessage(message, {
				title : caption
			});
		};
	}
	
	function saveAppointmentsToGridData()
	{
		var rowData = getDataFromSelectedTransporter();
		if (rowData != null) 		 
			objectTableData[rowData.id] = getTable().jqGrid('getGridParam', 'data');
	}

	/*
	* New transporter's table stuff
	**/
	
	function getDataFromSelectedTransporter()
	{
		var selectedRow = getTransporterTable().jqGrid('getGridParam','selrow');
		return selectedRow == null ? null : getTransporterTable().getRowData(selectedRow);
// 		if (selectedRow == null)
// 			return null;
// 		else
// 			return getTransporterTable().getRowData(selectedRow);
	}
	
	function getNextNewTransporterId() {
		var ids = getTransporterTable().jqGrid('getDataIDs');

		if (ids.length == 0)
			return 1;
		else
			return parseInt(ids[ids.length - 1]) + 1;
	}
	
	function validateAddNewRowToTransporterTable() {
		var ids = getTransporterTable().jqGrid('getDataIDs');

		var count = 0;

		jQuery.each(ids, function(eachIndex, eachId) {
			var rowData = getRowData(eachId);

			if (!isRowCancelled(rowData))
				count++;
		});

		//TODO: We need to confirm the max number of tranporters
// 		if (count >= solicitudMaxContainers)
// 			throw new SolicitudError(
// 					"<spring:message code='Number_of_containers_exceed_operation_permitted' />");
	}
	/**/
		
	function validateAddNewRow() {
		var ids = getTable().jqGrid('getDataIDs');

		var count = 0;

		jQuery.each(ids, function(eachIndex, eachId) {
			var rowData = getRowData(eachId);

			if (!isRowCancelled(rowData))
				count++;
		});

		if (count >= solicitudMaxContainers)
			throw new SolicitudError(
					"<spring:message code='Number_of_containers_exceed_operation_permitted' />");
	}

	function getNextNewId() {
		var ids = getTable().jqGrid('getDataIDs');

		if (ids.length == 0)
			return 1;
		else
			return parseInt(ids[ids.length - 1]) + 1;
	}

	function cellSelected(rowid, iCol, cellcontent, e) {
		selectedAppointmentId = rowid;
	}

	/*
	 * Reusable columns
	 */

	function getSpecialColumn() {
		var column = new JQGrid_Column_Model();
		column.name = "special";
		column.type = "dropdown";
		column.dropdown_options = function(aColumn) {
			var opts = {};

			opts.sourceUrl = "rest/Special/search";
			opts.sourceParams = {
				moveWithAll : solicitudTranType,
				companyLike : solicitudUserCompanyCode
			};
			opts.optionObject = function(obj) {
				return {
					label : obj.descripcion,
					id : obj.special
				};
			};

			opts.sourceError = function(data) {
				window.setTimeout(function() {
					aColumn.cancelColumnValue();
				}, 100);
				showMessage(data.message);
			};

			return opts;
		};
		column.beforeEdit = function(rowid, cellname, value, iRow, iCol) {
		};
		column.afterSave = function(rowid, cellname, value, iRow, iCol) {
		};
		return column;
	}

	function getReferenciaColumn() {
		var column = new JQGrid_Column_Model();
		column.name = "referencia";
		column.type = "text";
		column.dataInit = function(element) {
			jQuery(element).addClass("inputToUppercase");
		};
		return column;
	}
	
	function getBookingData() {
		return bookingData;
	}
	
	function setBookingData(obj) {
		bookingData = obj;
	}

	/*
	 * Generic after and before cell edits
	 */

	function afterColumnSave(rowid, cellname, value, iRow, iCol) {
		console.log(cellname + "," + rowid + "=" + value);
	}

	function beforeEditCell(rowid, cellname, value, iRow, iCol) {
		var rowData = getRowData(rowid);

		if (!canRowBeEdited(rowData)) {
			showMessage("<spring:message code='The_appointment_cannot_be_modified' />");

			window.setTimeout(function() {
				getTable().jqGrid('restoreCell', iRow, iCol);
			}, 100);
		}
	}
</script>
