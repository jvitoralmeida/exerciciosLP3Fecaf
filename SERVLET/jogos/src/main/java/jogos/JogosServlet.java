package jogos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jogos")
public class JogosServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	List<JogosEntitie> lista;
	
	@Override
	public void init() throws ServletException {
		 lista = (List<JogosEntitie>) getServletContext().getAttribute("lista_jogos");
		 if(lista == null) {
			 lista = new ArrayList<JogosEntitie>();
			 getServletContext().setAttribute("lista_jogos", lista);
		 }
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String dificuldade = req.getParameter("dificuldade");
		String cmd = req.getParameter("cmd");
		
		if(cmd.equalsIgnoreCase("adicionar")) {
			JogosEntitie jogo = new JogosEntitie(nome,dificuldade);
			lista.add(jogo);
			
			req.setAttribute("action", cmd);
			req.setAttribute("nome", nome);
			req.setAttribute("dificuldade", dificuldade);
			req.getRequestDispatcher("jogos.jsp").forward(req, resp);
			System.out.println("jogo adicionado");
		}
	}
	
}
