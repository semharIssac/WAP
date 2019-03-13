<%--
  Created by IntelliJ IDEA.
  User: semhar
  Date: 3/13/2019
  Time: 4:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Help</title>
</head>
<body>

    <form method="Post">
        <label for="n">Name</label>
        <input id="n" type="text" name="name"/>
        <label for="e">Email Address</label>
        <input id="e"type="email" name="email"/>
        <label for="p">Problem</label>
        <input id="p"type="text" name="problem"/>
        <textarea name="sprt" id="" cols="30" rows="10"></textarea>
        <input type="submit" value="Help"/>
    </form>

</body>
</html>
