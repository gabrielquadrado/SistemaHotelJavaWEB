<%-- 
    Document   : index2
    Created on : 01/05/2016, 23:45:39
    Author     : Gabriel Quadrado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/cssIndex.css"/>
        <link rel="shortcut icon" href="icon/house.ico" />
        <title>Menu Hotel</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>

    <body>
    <h1 align="center" ><strong>MENU HOTEL</strong></h1>
    <p align="center"><a href="Cadastrar.jsp">
        <input name="btn1" type="button" class="button" id="btn1" value="Cadastrar"/>
        </a></p>

    <a href="ExibirDB">
    <p align="center">
      <input name="btn2" type="button" class="button" id="btn2" value="Exibir" />
    </p></a>

    <a href="Excluir.jsp">
    <p align="center">
      <input name="btn3" type="button" class="button" id="btn3" value="Excluir" />
    </p></a>

    <a href="ExibirIdade.jsp">
    <p align="center">
      <input name="btn4" type="button" class="button" id="btn4" value="Exibir Idade" />
    </p></a>

    <a href="Contar">
    <p align="center">
      <input name="btn5" type="button" class="button" id="btn5" value="Num Hospedes" />
    </p></a>
    </body>
</html>