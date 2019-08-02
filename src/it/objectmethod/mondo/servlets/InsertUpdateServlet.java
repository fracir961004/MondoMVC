package it.objectmethod.mondo.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import it.objectmethod.mondo.dao.ICityDao;
import it.objectmethod.mondo.dao.impl.CityDaoImpl;
import it.objectmethod.mondo.domain.City;

public class InsertUpdateServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		City city = null;
		ICityDao cityDao = new CityDaoImpl();
		int idCity;
		String idStr = request.getParameter("id");
		String code;
		String name;
		ArrayList<City> cittaIM=new ArrayList<City>();
		try {
			idCity = Integer.parseInt(idStr);
			if (idCity > 0) {
				name = request.getParameter("name");
				code = request.getParameter("code");
				int popolazione = Integer.parseInt(request.getParameter("popolazione"));
				city = cityDao.inserimentoModificaCity(idCity, name, code, popolazione);
				
			} else if (idCity == 0) {
				name = request.getParameter("name");
				code = request.getParameter("code");
				int popolazione = Integer.parseInt(request.getParameter("popolazione"));

				city = cityDao.inserimentoModificaCity(idCity, name, code, popolazione);
				
			}

		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		}
		// la sessione serve quando si attiva una funzionalità e si ritorna nella pagin
		// precedente

		request.setAttribute("citta", city);
		request.getRequestDispatcher("pagine/Citta.jsp").forward(request, response);
	}
	


}
