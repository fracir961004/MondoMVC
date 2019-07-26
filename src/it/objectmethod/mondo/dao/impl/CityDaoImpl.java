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

public class CityDaoImpl implements ICityDao {

	private Connection conn = null;
	private PreparedStatement prepstat = null;
	private ResultSet rest = null;

	public List<City> getCities(String nazione) throws SQLException {
		List<City> elencoCit = new ArrayList<City>();
		City citta = null;
		try {
			conn = ConnectionFactory.getConnection();
			prepstat = conn.prepareStatement("select * from city where city.countryCode=?");
			prepstat.setString(1, nazione);
			rest = prepstat.executeQuery();

			while (rest.next()) {
				citta = new City();
				citta.setId(rest.getInt("ID"));
				citta.setCountryCode(rest.getString("CountryCode"));
				citta.setName(rest.getString("Name"));
				citta.setDistrict(rest.getString("District"));
				citta.setPopulation(rest.getInt("Population"));
				elencoCit.add(citta);
				/*
				 * Se nella query seleziono solo name e population poi mi darà l'eccezzione che
				 * non mi troverà id, countrycode e district perchè attraverso il get recupera i
				 * dati dal db però prima li seleziono nel db
				 */
			}
			if (conn != null) {
				conn.close();
			}
			if (rest != null) {
				rest.close();
			}
			if (prepstat != null) {
				prepstat.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return elencoCit;
	}

	public City eliminazioneCitta(int idCitta) throws SQLException {

		City city = new City();
		conn = ConnectionFactory.getConnection();

		try {
			prepstat = conn.prepareStatement("Delete from city where id=?");

			prepstat.setInt(1, idCitta);
			prepstat.execute();
			if (conn != null) {
				conn.close();
			}
			if (prepstat != null) {
				prepstat.close();
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return city;

	}
/*
	public City inserimentoCitta(int idCitta) throws SQLException {
		idCitta=0;
		City city=new City();
		int nabitanti = 20000;
		conn=ConnectionFactory.getConnection();
		try {
			if(city.getId()==idCitta) {
				String sql="Insert into city(Name,CountryCode,District,Population)Values(?,?,?)";
				prepstat=conn.prepareStatement(sql);
				prepstat.execute();
				prepstat.setString(1,"Gerenzano");
				prepstat.setString(2,"ITA");
				prepstat.setString(3,"North Italy");
				prepstat.setInt(4, nabitanti);
			}
			else {
				System.out.println("Città già esistente");
			}
			if(conn !=null) {
				conn.close();
			}
			if(prepstat !=null) {
				prepstat.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return city;
	}*/

}
