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

@WebServlet("/alteraTexto")
public class AlteraTexto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public AlteraTexto() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		DAO dao = new DAO();
		Notas nota = new Notas();
		String notaId_string = request.getParameter("notaId");
		String nota_form = request.getParameter("nota");
		int notaId = Integer.parseInt(notaId_string);
		dao.alteraNota(notaId, nota_form);
		request.getRequestDispatcher("WebKeep.jsp").forward(request, response);
	}
	
	

}
