<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div align=center>
	<table>
		<tr>
			<td rowspan="2">
				<img src="images/atp-logo.jpg" style="margin-top:10px; display: inline;"/>
			</td>
			<td>
				<h1><spring:message code="application.title" /></h1>
			</td>
		</tr>
		<tr>
			<td align="right">
				&nbsp;
				<c:if test='${_SessionModel != null && _SessionModel.loggedIn }'>
				<spring:message code="Welcome" /> <c:out value='${_SessionModel.loggedUser.username}'/>
			
				<c:if test='${param.title != null}'>
					-&nbsp;<c:out value='${title}' />
				</c:if>
			
				| <a class=linkNoDecoration href="#" onclick=doExit()><spring:message code="Logoff" /></a>
				</c:if>
			</td>
		</tr>
	</table>
</div>