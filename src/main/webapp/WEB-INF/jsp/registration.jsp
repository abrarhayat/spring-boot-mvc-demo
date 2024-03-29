<%--
  Created by IntelliJ IDEA.
  User: abrar
  Date: 4/30/20
  Time: 2:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
<h1>Registration Page</h1>
<form:form modelAttribute="registration">
    <form:errors path="*" cssClass="errorblock" element="div"/>
    <table>
        <tr>
            <td>
                <spring:message code="name"/>:
            </td>
            <td>
                <form:input path="name"/>
            </td>
            <td>
                <form:errors path="name" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit"
                       value="<spring:message code="save.changes"/>"
                >
            </td>
        </tr>
    </table>
</form:form>
<a href="index.html">Home</a>
</body>
</html>
