package servlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/saytime")
public class ServletClass extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	public ServletClass() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><body><h1 align='center'>" +
        new Date().toString() + "</h1></body></html>");
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")) {
			PrintWriter out = response.getWriter();
	        out.print("<h1 align='center'>Logado com sucesso</h1>");
	        
		}else {
			PrintWriter out = response.getWriter();
	        out.print("<h1 align='center'>Login ou senha invalido</h1>");
		}
		
		System.out.println(username + password);
    }
}
