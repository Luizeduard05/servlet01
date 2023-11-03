<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "br.com.ibm.Carro" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>POO Carro</title>
</head>
<body>
    <h1>Carro</h1>
    <pre>
        <%
            Carro carro1 = new Carro();
            carro1.setNome("Fusca");
            carro1.setAno(1970);
        %>
            <%= carro1.getLigar() %> <br>
            Nome: <%= carro1.getNome() %>
            Ano: <%= carro1.getAno() %>
    </pre>


</body>
</html>