package it.objectmethod.mondo.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.mondo.dao.impl.NazioneDaoImpl;
import it.objectmethod.mondo.domain.Nazione;

public class NazioneServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		NazioneDaoImpl ndi = new NazioneDaoImpl();

		List<String> lista = ndi.getNazione();
		request.setAttribute("risultato", lista);
		request.getRequestDispatcher("pagine/Nazioni.jsp").forward(request, response);

	}
}
