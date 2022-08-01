<%--
  Created by IntelliJ IDEA.
  User: MULTICAMPUSPC
  Date: 8/1/2022
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Register</title>
</head>
<body>
<form class="container mt-5 w-50" action="<%=request.getContextPath()%>/register" method="post">
    <h1 class="bg bg-tomato">REGISTER FORM</h1>
    <div class="form-group">
        <label for="exampleInputEmail1">Username</label>
        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter username" name="username">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control" name="password" id="exampleInputPassword1" placeholder="Password">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Fullname</label>
        <input type="text" class="form-control" name="fullname" id="exampleI" placeholder="Fullname">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="email" class="form-control" name="email" id="exampleInpuPassword1" placeholder="Email">
    </div>

    <button type="submit" class="btn btn-outline-primary">Register</button>
</form>
</body>
</html>
