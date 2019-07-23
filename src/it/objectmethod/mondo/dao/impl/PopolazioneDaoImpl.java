package it.objectmethod.mondo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import it.objectmethod.mondo.config.ConnectionFactory;
import it.objectmethod.mondo.dao.IPopolazioneDao;

public class PopolazioneDaoImpl implements IPopolazioneDao {

	@Override
	public List<Integer> getPopolazione() {
		Connection connessione = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Integer> lista = new ArrayList<Integer>();

		try {
			connessione = ConnectionFactory.getConnection();
			String query = "select Population, Name from city group by ID;";
			ps = connessione.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				int risultato = rs.getInt("Population");
				lista.add(risultato);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
