package it.objectmethod.mondo.dao;

import java.sql.SQLException;
import java.util.List;

import it.objectmethod.mondo.domain.City;

public interface ICityDao {

	public List<City> getCities(String nazione) throws SQLException;
}
