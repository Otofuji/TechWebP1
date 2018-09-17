package br.edu.insper.techweb.p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/postarTexto")
public class PostarTexto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public PostarTexto() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		DAO dao = new DAO();
		Notas nota = new Notas();
		Usuarios usuario = new Usuarios();
		Categorias categoria = new Categorias();
		
		usuario.setEmail("email");
		usuario.setNome("nome");
		usuario.setSobrenome("sobrenome");
		usuario.setSenha("senha");
		
		categoria.setCategoria("categoria");
		categoria.setIdUsuario();
		
		String nota_form = request.getParameter("nota");
		nota.setConteudoNota(nota_form);
		nota.setTipoNota(1);
		nota.setIdUsuario();
		nota.setCategoria();
	
		dao.adicionaUsuario(usuario);
		dao.adicionaCategoria(categoria);
		dao.adicionaNota(nota);
		request.getRequestDispatcher("WebKeep.jsp").forward(request, response);
	}
	
	
}
