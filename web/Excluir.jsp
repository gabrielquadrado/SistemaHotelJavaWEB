<%-- 
    Document   : Excluir
    Created on : 01/05/2016, 23:58:51
    Author     : Gabriel Quadrado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Excluir</title>
        <link rel="shortcut icon" href="icon/delete.ico" />
        <link rel="stylesheet" type="text/css" href="css/cssIndex.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>
    <center>
        <h1 align="center">EXCLUIR HOSPEDE</h1>
        <h3 align="center">Digite o nome do hospede a excluir:</h3>
        <form action="RemoverDB">
        <input type="text" name="txtNome"/><br /><br />
        <input type="submit" name="btnExcluir" value="Excluir" class="button" align="middle"/><br /><br />
        <a href="index.jsp"><input type="button" value="Voltar" name="btnVoltar" class="button"/><br /><br />
        </form>
    </center>
    </body>
</html>
