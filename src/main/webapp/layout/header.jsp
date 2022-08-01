<%--
  Created by IntelliJ IDEA.
  User: MULTICAMPUSPC
  Date: 8/1/2022
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-white">
        <div class="container-fluid">
            <button
                    class="navbar-toggler"
                    type="button"
                    data-mdb-toggle="collapse"
                    data-mdb-target="#navbarExample01"
                    aria-controls="navbarExample01"
                    aria-expanded="false"
                    aria-label="Toggle navigation"
            >
                <i class="fas fa-bars"></i>
            </button>
            <div class="collapse navbar-collapse" id="navbarExample01">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item active">
                        <a class="nav-link" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Pricing</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/logout">Log out</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- Navbar -->

    <!-- Background image -->
    <div
            class="p-5 text-center bg-image"
            style="
      background-image: url('https://media.istockphoto.com/photos/news-banner-picture-id1084892836');
      height: 600px;
    "
    >
        <div class="mask">
            <div class="d-flex justify-content-center align-items-center h-100">
                <div class="text-black" >
                    <h1 class="mb-3">ĐỌC BÁO</h1>
                    <h4 class="mb-3">Reading papers</h4>
                    <a class="btn btn-light btn-lg" href="/register" role="button"
                    >Log in</a
                    >
                </div>
            </div>
        </div>
    </div>
    <!-- Background image -->

</body>
</html>
