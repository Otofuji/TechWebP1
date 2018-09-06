package br.edu.insper.techweb.p1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@WebServlet("/lista")

public class ListaUsuarios {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO dao = new DAO();
		
		List<Usuarios> usuarios = dao.getListaUsuarios();
		
		//TODO fazer isto abaixo
		PrintWriter out = response.getWriter();
		out.println("<html><body><table border='1'>");
		out.println("<tr><td>id_usuario</td>")
		//TODO fazer isto acima
		
		dao.close();
	}
}