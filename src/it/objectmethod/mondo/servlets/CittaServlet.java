package it.objectmethod.mondo.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.mondo.dao.ICityDao;
import it.objectmethod.mondo.dao.impl.CityDaoImpl;
import it.objectmethod.mondo.domain.City;

public class CittaServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//vado a prendere il paramentro dal DB. lo recuperiamo in modo da darlo a city più avanti
		String nomeNaz=req.getParameter("Name");
		ICityDao city=new CityDaoImpl();
		List<City> elenccity=new ArrayList<City>();
		try {
			elenccity=city.getCities(nomeNaz);
			req.setAttribute("elencoCitta",  elenccity);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("pagine/city.jsp").forward(req, resp);
	}

}
