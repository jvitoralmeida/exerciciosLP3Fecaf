package br.com.joao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aluno")
public class ServletAluno extends HttpServlet{
	private static final long serialVersionUID = 1L;

	List<AlunoEntitie> lista;
	
	@Override
	public void init() throws ServletException {
		 lista = (List<AlunoEntitie>) getServletContext().getAttribute("lista_aluno");
		 if(lista == null) {
			 lista = new ArrayList<AlunoEntitie>();
			 getServletContext().setAttribute("lista_aluno", lista);
		 }
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Teste");
		System.out.println(req.getParameter("cmd"));
		String id = req.getParameter("id");
		String ra = req.getParameter("ra");
		String nome = req.getParameter("nome");
		String idade = req.getParameter("idade");
		String sexo = req.getParameter("sexo");
		String cmd = req.getParameter("cmd");
		
		if(cmd.equalsIgnoreCase("adicionar")) {
			lista.add(new AlunoEntitie(Long.parseLong(id), ra, nome, Integer.parseInt(idade), sexo));
			System.out.println("aluno adicionado");
		}
		
	}
}
