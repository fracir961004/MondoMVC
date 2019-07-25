package it.objectmethod.mondo.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.mondo.dao.ICountryDao;
import it.objectmethod.mondo.dao.impl.CountryDaoImpl;

public class ContinenteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ICountryDao countrydaoimpl = new CountryDaoImpl();

		List<String> listContinent = new ArrayList<String>();
		try {
			listContinent = countrydaoimpl.getContinenti();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("continenti", listContinent);

		request.getRequestDispatcher("pagine/Continenti.jsp").forward(request, response);
	}
}
