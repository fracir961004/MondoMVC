package it.objectmethod.mondo.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.mondo.dao.impl.ContinenteDaoImpl;


public class ContinenteServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ContinenteDaoImpl cdi = new ContinenteDaoImpl();

		List<String> lista = cdi.getContinente();
		request.setAttribute("risultato", lista);

		request.getRequestDispatcher("pagine/Continenti.jsp").forward(request, response);
	}
}
