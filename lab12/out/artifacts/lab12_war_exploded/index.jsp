<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/14/2019
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page='header.jsp'></jsp:include>
  <body class="text-center">
  <form class="form-signin" action="login" method="post">

    <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
    <p>${errorMsg}</p>
    <label for="inputEmail" class="sr-only">Email address</label>
    <input type="text" id="inputEmail" class="form-control" name="username" value="${cookie.user.value}" placeholder="User Name" required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" id="inputPassword" class="form-control" name="pass" placeholder="Password" required>
    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"  /> Remember me
      </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2017-2019</p>
  </form>
  </body>
</html>
