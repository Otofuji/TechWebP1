package br.edu.insper.techweb.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostarTexto
 */
@WebServlet("/PostarTexto")
public class PostarTexto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
    	PrintWriter out = response.getWriter();
    	String nota = request.getParameter("nota");
    	out.println("<!DOCTYPE html>");
    	out.println("<html>");
    	out.println("<head>");
    	out.println("<meta charset=\"UTF-8\">");
    	out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
    	out.println("<meta name=\"description\" content=\"Projeto 1 de Tecnologias Web | Engenharia Insper\">");
    	out.println("<title>WebKeep</title>");
    	out.println("<link href=\"https://fonts.googleapis.com/css?family=Cairo:300,600,700&amp;subset=arabic,latin-ext\" rel=\"stylesheet\">");
    	out.println("<link href=\"./Resources/css/index.css\" type=\"text/css\" rel=\"stylesheet\">");
    	out.println("</head>");
    	out.println("<body>");
    	out.println("<div id=\"ognwrapper\"><header class=\"gb_Ta gb_qb gb_Ed gb_Kd\" ng-non-bindable=\"\" id=\"gb\" role=\"banner\" style=\"background-color:#fb0\"><div class=\"gb_je\">");
    	out.println("</div>");
    	out.println("<h1>WebKeep</h1>");
    	out.println("</div>");
    	
    	out.println("<form action=\"PostarTexto\">");
    	out.println("<semi> Nova nota</semi><br>");
    	out.println("<input type=\"text\" name=\"nota\"><br>");
    	out.println("</form>");
    	out.println("<div id=\"ognwrapper\"><header class=\"gb_Ta gb_qb gb_Ed gb_Kd\" ng-non-bindable=\"\" id=\"gb\" role=\"banner\" style=\"background-color:54ff9ffb0\"><div class=\"gb_je\">");
    	out.println("</div>");
    	out.println("<div id=\"ognwrapper\"><header class=\"gb_Ta gb_qb gb_Ed gb_Kd\" ng-non-bindable=\"\" id=\"gb\" role=\"banner\" style=\"background-color:54ff9ffb0\"><div class=\"gb_je\">");
    	out.println("</div>");
    	out.println("<div id=\"ognwrapper\"><header class=\"gb_Ta gb_qb gb_Ed gb_Kd\" ng-non-bindable=\"\" id=\"gb\" role=\"banner\" style=\"background-color:54ff9ffb0\"><div class=\"gb_je\">");
    	
    	out.println("</div>");
    	out.println("<div id=\"ognwrapper\"><header class=\"gb_Ta gb_qb gb_Ed gb_Kd\" ng-non-bindable=\"\" id=\"gb\" role=\"banner\" style=\"background-color:54ff9ffb0\"><div class=\"gb_je\">");
    	out.println("</div>");
    	

    	
    	out.println("<h2>" + nota + "</h2>");
    	out.println("</div>");
    	out.println("</body>");
    	out.println("</html>");
  	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
