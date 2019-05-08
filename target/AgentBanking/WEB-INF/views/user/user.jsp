<%--
  Created by IntelliJ IDEA.
  User: suren
  Date: 5/5/2019
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
                    Dashboard <small>Control panel</small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                    <li class="active">Dashboard</li>
                </ol>
            </section>
            <section class="content">

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
</html>
