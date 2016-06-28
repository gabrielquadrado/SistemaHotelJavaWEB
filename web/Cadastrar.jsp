<%-- 
    Document   : Cadastrar
    Created on : 01/05/2016, 23:48:24
    Author     : Gabriel Quadrado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cadastrar</title>
        <link rel="shortcut icon" href="icon/user_add.ico" />
        <link rel="stylesheet" type="text/css" href="css/cssIndex.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>
    <center>
        <h1 align="center" ><strong>CADASTRO DE HOSPEDE</strong></h1>
        <form action="CadastrarDB">
        Nome:<br>
        <input type="text" name="txtNome" /><br><br>
        Idade:<br>
        <input type="number" name="txtIdade" /><br><br>
        Sexo:<br>
        <input type="radio" name="radSexo" value="Masculino" checked>Masculino
        <input type="radio" name="radSexo" value="Feminino">Feminino<br><br>
        Status:<br>
        <select name="cmbStatus">
        <option value="Ocupado">Ocupado</option>
        <option value="Reservado">Reservado</option>
        </select><br><br><br>
        <input type="submit" name="btnCadastrar" value="Cadastrar" class="button"/><br><br>
        <a href="index.jsp"><input type="button" value="Voltar" name="btnVoltar" class="button"/><br><br>
        </form>
    </center>
    </body>
</html>