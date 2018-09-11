<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Notas</title>
</head>
<body>
<%@ page import="java.util.*,br.edu.insper.techweb.p1.*" %>
<body>
<% Notas nota = new Notas();%>
<% String conteudo = nota.getConteudoNota(); %>
Você escreveu ${ conteudo}.
</body>
</body>
</html>