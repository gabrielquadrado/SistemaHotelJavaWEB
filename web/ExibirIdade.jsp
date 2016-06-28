<%-- 
    Document   : ExibirIdade
    Created on : 02/05/2016, 00:11:50
    Author     : Gabriel Quadrado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Idade</title>
        <link rel="shortcut icon" href="icon/table.ico" />
        <link rel="stylesheet" type="text/css" href="css/cssIndex.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>
    <center>
    <h1 align="center">BUSCAR HOSPEDES</h1>
    <form action="ExibirDB">
        <p>Digite a idade a buscar:</p>
        <input type="number" name="txtIdade"/><br /><br />
        <input type="submit" name="btnBuscar" value="Buscar" class="button" /><br /><br>
        <a href="index.jsp"><input type="button" value="Voltar" name="btnVoltar" class="button"/><br /><br />
        </form>
    </center>
    </body>
</html>
