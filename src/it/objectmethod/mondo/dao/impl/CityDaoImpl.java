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

	public City inserimentoModificaCity(int idCitta, String name, String code, int popolazione) throws SQLException {
		City city = new City();
		
		try {
				conn = ConnectionFactory.getConnection();
			if (idCitta == 0) {

				prepstat = conn.prepareStatement("Insert into city(Name,CountryCode,Population,ID) Values (?,?,?,?)");

				prepstat.setString(1, name);
				prepstat.setString(2, code);
				prepstat.setInt(3, popolazione);
				prepstat.setInt(4, idCitta);
				prepstat.executeUpdate();
			} else {
				String sql = "Update city set(Name,CountryCode,District,Population) where id=?";
				prepstat = conn.prepareStatement(sql);
				prepstat.setInt(1, idCitta);
				prepstat.executeUpdate();
			}

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

}
