package it.objectmethod.mondo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import it.objectmethod.mondo.dao.ICityDao;
import it.objectmethod.mondo.config.ConnectionFactory;

public class CityDaoImpl implements ICityDao {

	public List<String> getCitta() {
		Connection connessione = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<String> lista = new ArrayList<String>();

		try {
			connessione = ConnectionFactory.getConnection();
			String query = "select distinct city.Name from city inner join Country on city.CountryCode=Country.Code order by city.Name asc";
			ps = connessione.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				String risultato = rs.getString("Name");
				lista.add(risultato);
			}

			if (connessione != null) {
				connessione.close();
			}

			if (ps != null) {
				ps.close();
			}

			if (rs != null) {
				rs.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
