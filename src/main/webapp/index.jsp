<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>HOME</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <header>
        <jsp:include page="layout/header.jsp"/>
    </header>

    <section class="d-flex justify-content-between">
        <div>
            Category
        </div>
        <div>
            Index_main
        </div>
        <div>
            Hot
        </div>
    </section>

    <footer>
        <jsp:include page="layout/footer.jsp"/>
    </footer>
</body>
</html>