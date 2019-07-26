package it.objectmethod.mondo.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.mondo.dao.ICityDao;
import it.objectmethod.mondo.dao.impl.CityDaoImpl;
import it.objectmethod.mondo.domain.City;
/*
public class InsertUpdateServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String idStr=request.getParameter("id");
		ICityDao cityDao=new CityDaoImpl();
		City city=null;
		
		try {
			int idCitta=Integer.parseInt(idStr);
			city=cityDao.inserimentoCitta(idCitta);
		}catch(NumberFormatException | SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("CittaInserita", city);
		request.getRequestDispatcher("pagine/citta.jsp").forward(request, response);
	}

}*/
