package it.objectmethod.mondo.dao;


import java.sql.SQLException;
import java.util.List;

import it.objectmethod.mondo.domain.Country;



public interface ICountryDao {
	
	public List<Country> getNazioni(String nomeNazione) throws SQLException;
	public  List<String> getContinenti() throws SQLException;

}
