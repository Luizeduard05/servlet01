<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "br.com.ibm.Moto" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>POO MOTO</title>
</head>
<body>
    <h1>Moto</h1>
    <pre>
        <%
            Moto moto1 = new Moto();
            moto1.setNome("Fan");
            moto1.setAno(1970);
        %>
            <%= moto1.getLigar() %> <br>
            Nome: <%= moto1.getNome() %>
            Ano: <%= moto1.getAno() %>
    </pre>


</body>
</html>