<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Exemplo de JSP</title>
</head>
<body>
<%@ page import="java.util.*,br.edu.insper.techweb.p1.*" %>
<table border='1'>
<% DAO dao = new DAO();
 List<Usuarios> usuarios = dao.getListaUsuarios();
 for (Usuarios usuario : usuarios ) { %>
 <tr>
 <td><%=usuario.getNome()%></td>
 </tr>
<% } %>
</table>

<table border='1'>
 <%List<Notas> notas = dao.getListaNotas();
 for (Notas nota: notas ) { %>
 <tr>
 <td><%=nota.getConteudoNota()%></td>
 </tr>
<% } %>
</table>
</body>
</html>