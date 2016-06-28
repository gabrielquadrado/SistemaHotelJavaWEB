<%-- 
    Document   : Exibir
    Created on : 03/05/2016, 12:01:44
    Author     : Gabriel Quadrado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Hospedes</title>
        <link rel="shortcut icon" href="icon/table.ico" />
        <link rel="stylesheet" type="text/css" href="css/cssIndex.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body style="margin-left: 200px; margin-right: 200px">
        <h1 align="center">TABELA DE HOSPEDES</h1>
        <table align="center">
            <tr>
                <td><strong>ID</strong></td>
                <td><strong>Nome</strong></td>
                <td><strong>Idade</strong></td>
                <td><strong>Sexo</strong></td>
                <td><strong>Status</strong></td>
            </tr>
            <c:forEach var="hospede" items="${hospedes}">
                <tr>
                    <c:if test="${empty param.txtIdade}">
                        <td>${hospede.id}</td>
                        <td>${hospede.nome}</td>
                        <td>${hospede.idade}</td>
                        <td>${hospede.sexo}</td>
                        <td>${hospede.status}</td>
                    </c:if>
                    <c:if test="${param.txtIdade==hospede.idade}">
                        <td>${hospede.id}</td>
                        <td>${hospede.nome}</td>
                        <td>${hospede.idade}</td>
                        <td>${hospede.sexo}</td>
                        <td>${hospede.status}</td>
                    </c:if>
                </tr>
            </c:forEach>
        </table>
        <br />
        <p align="center"><a href="index.jsp"><input type="button" name="btnVoltar" class="button" value="Voltar" />
            </a></p><br />
    </body>
</html>
