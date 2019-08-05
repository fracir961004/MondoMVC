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

public class EliminazioneServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idCityStr = request.getParameter("id");
	
		/*l'id che gli passo nel parameter è lo stesso che gli passerò nella city.id*/
		ICityDao cityDao = new CityDaoImpl();
		City city = new City();
		HttpSession sessione=request.getSession(true);
		try {
			int idCity = Integer.parseInt(idCityStr);
			city = cityDao.eliminazioneCitta(idCity);
			
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		}

		sessione.setAttribute("cittaEliminata", city);
		request.getRequestDispatcher("/CittaServlet").forward(request, response);

	}
}