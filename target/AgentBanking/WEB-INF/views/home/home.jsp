<%-- 
    Document   : home
    Created on : May 6, 2019, 4:18:59 PM
    Author     : shalini_w
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>Agent Banking</title>
        <style>
            div.dataTables_wrapper {
                width: 100%;
                margin: 0 auto;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <%@ include file="/WEB-INF/views/template/header.jsp"%>
            </div>
            <div class="row">
                <div class="col-md-2">
                    <%@ include file="/WEB-INF/views/template/sidebar.jsp"%>
                </div>
                <div class="col-md-10">
                    <section class="content-header">
                        <h1>
                            Dashboard <small>Home Page</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li><a href="#"><i class="fa fa-dashboard"></i> Dashboard</a></li>
                            <li class="active">Home</li>
                        </ol>
                    </section>
                    <section class="content">
                        <hr/>
                        <div class="row" style="margin-top: 50px;">
                            <h3>Home Page</h3>
                        </div>
                    </section>
                </div>
                <div class="row">
                    <div class="col-md-2"></div>
                    <div class="col-md-10">
                        <%@ include file="/WEB-INF/views/template/footer.jsp"%></div>
                </div>
            </div>
        </div>
    </body>
    <script>
        $(document).ready(function () {
            $('#userTable').DataTable({
                "scrollX": true
            });
        });
    </script>
</html>
