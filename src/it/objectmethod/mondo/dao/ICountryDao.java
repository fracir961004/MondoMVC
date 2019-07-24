package it.objectmethod.mondo.dao;


import java.util.List;

import it.objectmethod.mondo.domain.Country;



public interface ICountryDao {
	
	public Country getNazioni(String nomeNazione);
	public  List<String> getContinenti();

}
