package it.objectmethod.mondo.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.objectmethod.mondo.dao.ICityDao;
import it.objectmethod.mondo.dao.impl.CityDaoImpl;
import it.objectmethod.mondo.domain.City;

public class InsertUpdateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		City city = new City();
		String name=request.getParameter("name");
		String code=request.getParameter("code");
		String popStr=request.getParameter("popolazione");
		String idCityStr=request.getParameter("id");
		ICityDao cityDao = new CityDaoImpl();
		int idCity, popolazione;

	//	HttpSession session=request.getSession();
	//	session.setAttribute("name", name);
	

		try {
				
				idCity=Integer.parseInt(idCityStr);
			    popolazione = Integer.parseInt(popStr);
				city = cityDao.inserimentoModificaCity(idCity, name, code, popolazione);
			

		}catch(NumberFormatException| SQLException e)
	{
		e.printStackTrace();
	}

	request.setAttribute("cittaInserita",city);request.getRequestDispatcher("pagine/Inserimento.jsp").forward(request,response);
}

}
