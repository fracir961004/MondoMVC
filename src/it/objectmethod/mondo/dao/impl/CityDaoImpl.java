package it.objectmethod.mondo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.objectmethod.mondo.config.ConnectionFactory;
import it.objectmethod.mondo.dao.ICityDao;
import it.objectmethod.mondo.domain.City;

public class CityDaoImpl implements ICityDao{

	  
	@Override
	public List<City> getCities(String nazione) throws SQLException {
		Connection conn=null;
		  PreparedStatement prepstat=null;
		 ResultSet rest=null;
		 List<City> elencoCit=new ArrayList<City>();
		 City citta=null;
		 try {
			 conn=ConnectionFactory.getConnection();
			 prepstat=conn.prepareStatement("select city.Name from country inner join city on country.Code=city.CountryCode where Continent=?");
			 prepstat.setString(1,nazione);
			 rest=prepstat.executeQuery();
			 
			 while(rest.next()) {
				 citta=new City();
				 citta.setId(rest.getInt("ID"));
				 citta.setName(rest.getString("Name"));
				 citta.setCountryCode(rest.getString("CountryCode"));
				 citta.setDistrict(rest.getString("District"));
				 citta.setPopulation(rest.getInt("Population"));
				 elencoCit.add(citta);
				 
				 if (conn != null) {
						conn.close();
					}
					if (rest != null) {
						rest.close();
					}
					if (prepstat != null) {
						prepstat.close();
					}
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		return elencoCit;
	}

}
