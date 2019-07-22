package it.objectmethod.mondo.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.mondo.dao.impl.PopolazioneDaoImpl;

public class PopolazioneServelt {
	
	public void doGet(HttpServletRequest rs,HttpServletResponse res) throws ServletException, IOException {
		
		PopolazioneDaoImpl pdi=new PopolazioneDaoImpl();
		List<Integer> lista=new ArrayList<Integer>();
		lista=pdi.getPopolazione();
		
		rs.setAttribute("listaPopolazione", lista);
		rs.getRequestDispatcher("pagine/Popolazioni.jsp").forward(rs,res);
		
		
	}

}
