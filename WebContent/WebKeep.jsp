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

	<form action="postarTexto" method = "post">
		<semi> Nova nota </semi>
		<br> <input type="text" name="nota" autocomplete = off autofocus = autofocus ><br>
	</form>

<table border='0'>
<% DAO dao = new DAO();
 List<Notas> notas = dao.getListaNotas();
 for (Notas nota : notas ) { %>
 <tr>
 <td>
  <form action="${pageContext.request.contextPath}/apagarTexto" method="post">
    <input type="hidden" id="custId" name="notaId" value="<%=nota.getIdNota()%>">
    <input type="submit" name="apagar" value="x" />
</form>
<form action="${pageContext.request.contextPath}/alteraTexto" method="post">
    <input type="hidden" id="custId" name="notaId" value="<%=nota.getIdNota()%>">
  	<input type="text" name="nota" value = "<%=nota.getConteudoNota()%>" autocomplete = off >
 


</form>
 </td>
 
 </tr>
 <% } %>
 </table>
</body>
</body>
</html>