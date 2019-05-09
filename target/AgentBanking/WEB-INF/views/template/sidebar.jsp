<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <!-- Left side column. contains the logo and sidebar -->
        <aside class="main-sidebar">
            <!-- sidebar: style can be found in sidebar.less -->
            <section class="sidebar">
                <!-- search form -->
                <form action="#" method="get" class="sidebar-form">
                    <div class="input-group">
                        <input type="text" name="q" class="form-control"
                               placeholder="Search..."> <span class="input-group-btn">
                            <button type="submit" name="search" id="search-btn"
                                    class="btn btn-flat">
                                <i class="fa fa-search"></i>
                            </button>
                        </span>
                    </div>
                </form>
                <!-- /.search form -->
                <!-- sidebar menu: : style can be found in sidebar.less -->
                <ul class="sidebar-menu" data-widget="tree">
                    <li class="header">MAIN NAVIGATION</li>

                    <c:forEach items="${pages}" var="item">
                        <c:if test="${item.userrole.userrolecode == userrole}">
                            <li><a href="#"> <i class="fa fa-th"></i>
                            <span>${item.page.description}</span> <span class="pull-right-container">
                            </span>
                        </a></li>
                        </c:if>
                    </c:forEach>
                </ul>
            </section>
            <!-- /.sidebar -->
        </aside>

    </body>
</html>
