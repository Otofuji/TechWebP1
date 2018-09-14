<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Projeto 1 de Tecnologias Web | Engenharia Insper">
<title>WebKeep</title>
<link
	href="https://fonts.googleapis.com/css?family=Cairo:300,600,700&amp;subset=arabic,latin-ext"
	rel="stylesheet">
<link href="./Resources/css/index.css" type="text/css" rel="stylesheet">
</head>
<body>
<%@ page import="java.util.*,br.edu.insper.techweb.p1.*" %>
<body>
<div id="ognwrapper">
		<header class="gb_Ta gb_qb gb_Ed gb_Kd" ng-non-bindable="" id="gb"
			role="banner" style="background-color: #fb0">
			<div class="gb_je"></div>
			<h1>WebKeep</h1>
	</div>
	<p>
		Este projeto ainda está em desenvolvimento. Acompanhe o progresso no <a
			href="https://github.com/Otofuji/TechWebP1" target="_blank">GitHub.</a>
		Lançamento em 20 de setembro de 2018.
	</p>

	<form action="postarTexto" method = "post">
		<semi> Nova nota </semi>
		<br> <input type="text" name="nota"><br>
	</form>

<table border='1'>
<% DAO dao = new DAO();
 List<Notas> notas = dao.getListaNotas();
 for (Notas nota : notas ) { %>
 <tr>
 <td><%=nota.getConteudoNota()%>
 

 <form action="${pageContext.request.contextPath}/apagarTexto" method="post">
    <input type="hidden" id="custId" name="notaId" value="<%=nota.getIdNota()%>">
    <input type="submit" name="apagar" value="Apagar" />
</form>
 </td>
 
 </tr>
 <% } %>
 </table>
</body>
</body>
</html>