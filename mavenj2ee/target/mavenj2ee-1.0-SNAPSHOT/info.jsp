<%-- 
    Document   : info
    Created on : 17 abr 2024, 10:29:22
    Author     : Campus FP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Info - MavenJ2EE</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Info</h1>
        <form action="ServletInfo" method="post">
            <div class="form-group">
                <label for="busqueda">Buscar:</label>
                <input type="text" class="form-control" name="busqueda" required>
            </div>
            <button type="submit" class="btn btn-primary">Buscar</button>
        </form>
    </div>
</body>
</html>