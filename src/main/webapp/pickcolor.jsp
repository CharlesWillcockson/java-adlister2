<%--
  Created by IntelliJ IDEA.
  User: charles
  Date: 4/1/22
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<h1>Pick a color!</h1>
<form action="pickColorServlet" method="post">
    <input type="text" id="bg_color" name="bg_color">
    <input type="submit">
</form>
</body>
</html>
