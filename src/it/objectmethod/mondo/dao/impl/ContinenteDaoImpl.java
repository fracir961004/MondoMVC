package it.objectmethod.mondo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import it.objectmethod.mondo.dao.IContinent;

import it.objectmethod.mondo.config.ConnectionFactory;

public class ContinenteDaoImpl implements IContinent {

	public List<String> getContinente() {

		Connection connessione = null;
		ResultSet rs = null;
		PreparedStatement st = null;
		List<String> lista = new ArrayList<>();

		try {
			connessione = ConnectionFactory.getConnection();

			String query = "Select distinct Continent from country";

			st = connessione.prepareStatement(query);
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

}
