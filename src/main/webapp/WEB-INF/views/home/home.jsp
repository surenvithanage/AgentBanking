<%-- 
    Document   : home
    Created on : May 6, 2019, 4:18:59 PM
    Author     : shalini_w
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${not empty username}">
            <h1>Hello ${username}!</h1>
        </c:if>
        <c:if test="${not empty error}">
            <h1>Error Message : ${error}</h1>
        </c:if>
    </body>
</html>
