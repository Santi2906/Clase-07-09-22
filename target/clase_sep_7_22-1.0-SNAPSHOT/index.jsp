<%-- 
    Document   : index
    Created on : 7/09/2022, 1:14:30 p. m.
    Author     : administradorPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina 1</title>
    </head>
    <body>
        <h1>Hola mundillo</h1>
        <a href="control">Verificar servlet  objecto response</a>
        <form action="control" method="GET">
            <label>Nombres: </label>
            <input type="text" name="txt_nombres" required="true">
            <label>Apellidos: </label>           
            <input type="text" name="txt_apellidos" required="true">
            <button type="submit" name="btnRegistrar" value="Registrar">Registrar   </button>
        </form>
    </body>
</html>
