<%--
  Created by IntelliJ IDEA.
  User: charles
  Date: 3/31/22
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h1>Create your pizza here!</h1>
    <form id="pizzaform" action="/login.jsp" method="POST">
        <div class="form-group">
            <label for="sauce">Sauce</label>
            <select id="sauce" name="sauce" form="pizzaform">
                <option value="marinara">Marinara</option>
                <option value="alfredo">Alfredo</option>
                <option value="bbq">BBQ</option>
            </select>
        </div>
        <div class="form-group">
            <label for="size">Size</label>
            <select id="size" name="size" form="pizzaform">
                <option value="small">Small</option>
                <option value="medium">Medium</option>
                <option value="large">Large</option>
            </select>
        </div>
        <div class="form-group">
            <label for="crust">Crust</label>
            <select id="crust" name="crust" form="pizzaform">
                <option value="thin">Thin</option>
                <option value="handtossed">Hand Tossed</option>
                <option value="pan">Pan</option>
            </select>
        </div>
        <div class="form-group">
            <input type="checkbox" id="topping1" name="topping1" value="pepperoni">
            <label for="topping1">Pepperoni</label><br>
            <input type="checkbox" id="topping2" name="topping2" value="sardines">
            <label for="topping2">Sardines</label><br>
        </div>
        <div class="form-group">
            <textinput></textinput>
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Log In">
    </form>
</div>
</body>
</html>
