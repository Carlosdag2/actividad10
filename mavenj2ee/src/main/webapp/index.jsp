<%-- 
    Document   : index
    Created on : 17 abr 2024, 10:28:22
    Author     : Campus FP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio - MavenJ2EE</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">MavenJ2EE</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="true" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="contacto.jsp">Contacto</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="info.jsp">Info</a>
                    </li>
                </ul>
            </div>
        </nav>
        <h1>Bienvenido a MavenJ2EE</h1>
        <div class="alert alert-info" role="alert">
            <h4 class="alert-heading">Diferencia entre J2SE y J2EE</h4>
            <p>
                J2SE (Java 2 Platform, Standard Edition) es la plataforma base de Java, diseñada para el desarrollo de aplicaciones de escritorio y aplicaciones de consola.
                Proporciona las bibliotecas fundamentales y las herramientas necesarias para desarrollar y ejecutar aplicaciones Java en entornos de escritorio.
            </p>
            <hr>
            <p>
                J2EE (Java 2 Platform, Enterprise Edition) está diseñado para el desarrollo de aplicaciones empresariales y distribuidas, que requieren capacidades adicionales más allá de las proporcionadas por J2SE.
                Proporciona un conjunto de especificaciones y APIs (Interfaz de Programación de Aplicaciones) que permiten el desarrollo de aplicaciones escalables, seguras y transaccionales para entornos empresariales.
            </p>
        </div>
    </div>
</body>
</html>
