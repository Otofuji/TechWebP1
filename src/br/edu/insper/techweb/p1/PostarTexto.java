package br.edu.insper.techweb.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostarTexto
 */
@WebServlet("/postarTexto")
public class PostarTexto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	public PostarTexto() {
		super();
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procces(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void procces(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO dao = new DAO();
		Notas nota = new Notas();
		Usuarios usuario = new Usuarios();
		Categorias categoria = new Categorias();
		
		String nota_form = request.getParameter("nota");
		nota.setConteudoNota(nota_form);
		nota.setIdNota(1);
		nota.setTipoNota(1);
		
		usuario.setIdUsuario(4);
		usuario.setEmail("email");
		usuario.setNome("nome");
		usuario.setSobrenome("sobrenome");
		usuario.setSenha("senha");
		
		categoria.setCategoria("categoria");
		categoria.setIdCategoria(1);
		categoria.setIdNota(1);
		
		dao.adicionaUsuario(usuario);
		dao.adicionaCategoria(categoria);
		dao.adicionaNota(nota);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
