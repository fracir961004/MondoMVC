package it.objectmethod.mondo.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.mondo.dao.ICityDao;
import it.objectmethod.mondo.dao.impl.CityDaoImpl;
import it.objectmethod.mondo.domain.City;

public class EliminazioneServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idCityStr = request.getParameter("id");
		/*l'id che gli passo nel parameter è lo stesso che gli passerò nella city.id*/
		ICityDao cityDao = new CityDaoImpl();
		City city = new City();
		
		try {
			int idCity = Integer.parseInt(idCityStr);
			city = cityDao.eliminazioneCitta(idCity);
			
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		}

		request.setAttribute("cittaEliminata", city);
		request.getRequestDispatcher("pagine/Citta.jsp").forward(request, response);

	}
}
