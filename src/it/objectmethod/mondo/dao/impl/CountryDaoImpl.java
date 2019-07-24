package it.objectmethod.mondo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.objectmethod.mondo.dao.ICountryDao;
import it.objectmethod.mondo.domain.Country;
import it.objectmethod.mondo.config.ConnectionFactory;

public class CountryDaoImpl implements ICountryDao {

	public List<String> getContinenti() throws SQLException{

		Connection connessione = null;
		ResultSet rs = null;
		PreparedStatement st = null;
		List<String> lista = new ArrayList<>();

		try {
			connessione = ConnectionFactory.getConnection();
			st = connessione.prepareStatement("Select distinct Continent from country");

			rs = st.executeQuery();

			while (rs.next()) {
				String risultato = rs.getString("Continent");
				lista.add(risultato);
			}

			if (connessione != null) {
				connessione.close();
			}
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Country> getNazioni(String continente) throws SQLException{
		Connection connessione;
		ResultSet rs;
		PreparedStatement st;
		List<Country> listaNaz = new ArrayList<Country>();
		Country naz;

		try {
			connessione = ConnectionFactory.getConnection();
			st = connessione.prepareStatement("select * from country where Continent=?");
			st.setString(1, continente);
			/*qua gli passo il parametro*/
			rs = st.executeQuery();
			/*
			 * il set lo utilizzo per indicare quanti ? ci sono. Ovviamente ci deve essere
			 * una clausola(where) come in questo caso where Continent=? metto tanti set
			 * quanti ?. se 2 ? ci metto 2 set in ordine sequenziale
			 * 
			 * statement.setString(1,"fdfs") statement.setString(2,"vcsc");
			 * 
			 */

			while (rs.next()) {
				naz = new Country();
				naz.setCode(rs.getString("Code"));
				naz.setName(rs.getString("Name"));
				naz.setContinente(rs.getString("Continent"));
				naz.setPopolazione(rs.getInt("Population"));
				/*in getString/Int ci passo l'attributo del db*/
				listaNaz.add(naz);
			}

			if (connessione != null) {
				connessione.close();
			}
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return listaNaz;

	}

}
