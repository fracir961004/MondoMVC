package it.objectmethod.mondo.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.mondo.dao.impl.CountryDaoImpl;
import it.objectmethod.mondo.domain.Country;


public class NazioneServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeNaz = request.getParameter("Continent");
		CountryDaoImpl icountr = new CountryDaoImpl();
//		Country naz = null;
		List<Country> listaNaz=new ArrayList<Country>();
		try {
			listaNaz = icountr.getNazioni(nomeNaz);
//	     	listaNaz.add(naz); 
		} catch (Exception e) {
			e.printStackTrace();
		}

	    request.setAttribute("Nazioni", listaNaz);
		
		request.getRequestDispatcher("pagine/Nazioni.jsp").forward(request, response);

	}
}
