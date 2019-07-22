package it.objectmethod.mondo.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.mondo.dao.impl.CityDaoImpl;

public class CittaServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest rs, HttpServletResponse res) throws ServletException, IOException {
		
		
		CityDaoImpl cydi=new CityDaoImpl();
		List<String> lista=new ArrayList<String>();
		lista=cydi.getCitta();
		
		rs.setAttribute("listaCitta", lista);
		rs.getRequestDispatcher("pagine/Citta.jsp").forward(rs,res);
	}
	

}
