<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/14/2019
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page='header.jsp'></jsp:include>
<body>
    <div class="container">
        <div class="jumbotron">
            <h1>Welcome ${loggeduser}</h1>
            <a href="logout">Logout</a>
        </div>
    </div>


</body>
</html>
