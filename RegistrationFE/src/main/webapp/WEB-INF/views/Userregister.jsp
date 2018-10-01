<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>

<c:url var="addAction" value="/user/add" ></c:url>

<form:form action="${addAction}" modelAttribute="users">
<table>

	<tr>
		<td>
			<form:label path="id">
				<spring:message text="id"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" />
		</td>
	</tr> 
       <tr>
		<td>
			<form:label path="username">
				<spring:message text="username"/>
			</form:label>
		</td>
		<td>
			<form:input path="username" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="password">
				<spring:message text="password"/>
			</form:label>
		</td>
		<td>
			<form:input path="password" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="confirmpassword">
				<spring:message text="confirmpassword"/>
			</form:label>
		</td>
		<td>
			<form:input path="confirmpassword" />
		</td> 
	</tr>
	<tr>
		<td colspan="2">
			
			
				<input type="submit"
					value="<spring:message text="Adduser"/>" />
			
		</td>
	</tr>
</table>	
</form:form>

<br>
<h3>User LIST</h3>
<c:if test="${!empty list}">
	<table class="" border="1">
	<tr>
		<th>User ID</th>
		<th>user Name</th>
		<th>password</th>
		<th>confirm password</th>
		
		
		
	</tr>
	<c:forEach items="${list}" var="lists">
		<tr>
			<td>${lists.id}</td>
			<td>${lists.username}</td>
			<td>${lists.password}</td>
			<td>${lists.confirmpassword}</td>
			
		</tr>
	</c:forEach>
	</table>
</c:if>

</body>
</html>
