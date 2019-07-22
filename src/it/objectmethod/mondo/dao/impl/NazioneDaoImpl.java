package it.objectmethod.mondo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import it.objectmethod.mondo.config.ConnectionFactory;
import it.objectmethod.mondo.dao.INazioneDao;

public class NazioneDaoImpl implements INazioneDao {

	@Override
	public List<String> getNazione() {
		List<String> lista = new ArrayList<String>();
		Connection connessione = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {  
			connessione = ConnectionFactory.getConnection();
			String query = "select distinct Name from country group by ";
			ps = connessione.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				String risultato = rs.getString("Name");
				lista.add(risultato);
			}
			if (connessione != null) {
				connessione.close();
			}

			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}