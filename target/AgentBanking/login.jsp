<%-- 
    Document   : login
    Created on : May 6, 2019, 11:28:44 AM
    Author     : shalini_w
--%>

<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Agent Banking</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.7 -->
        <link rel="stylesheet" href="<c:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.min.css"/>">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="<c:url value="/resources/bower_components/font-awesome/css/font-awesome.min.css"/>">
        <!--Theme style--> 
        <link rel="stylesheet" href="<c:url value="/resources/dist/css/AdminLTE.min.css" />">
        <!-- Google Font -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
    </head>
    <body class="hold-transition login-page">
        <div class="login-box">
            <div class="login-logo">
                <b>Agent</b>Banking
            </div>
            <div class="login-box-body">

                <form action="login" method="post" modelAttribute="user">
                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" name="username" placeholder="Username">
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" name="password" placeholder="Password">
                    </div>
                    <div class="row">
                        <div class="col-xs-8">
                        </div>
                        <div class="col-xs-4">
                            <button type="submit" class="btn btn-primary btn-block btn-flat">Login</button>
                        </div>
                    </div>
                    <div class="login-box-msg">
                        <s:actionerror theme="jquery"/>
                        <s:actionmessage theme="jquery"/>
                    </div>
                </form>
            </div>
            <div class="login-box-msg">
                <%--<c:if test="${not empty error}">--%>
                    ${error}
                <%--</c:if>--%>
            </div>
        </div>

        <!-- jQuery 3 -->
        <script src="<c:url value="/resources/bower_components/jquery/dist/jquery.min.js"/>"></script>
        <!-- Bootstrap 3.3.7 -->
        <script src="<c:url value="/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"/>"></script>
    </body>
</html>
