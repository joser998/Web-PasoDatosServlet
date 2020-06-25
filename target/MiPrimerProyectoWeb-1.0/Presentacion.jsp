<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Presentacion en JSP</h1>
        
        <h3>Esto es una variable de tipo Request: ${usuario}</h3>
        <br>
        <h3>Esto es una variable de tipo Session ${userSesion}</h3>
        <br>
        <h3>Esto es una variable de tipo Context: ${userContext}</h3>
        
        <a href="Presentacion2.jsp">Llevarme a Presentacion2 JSP </a>
        
        
    </body>
</html>
