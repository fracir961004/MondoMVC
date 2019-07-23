package it.objectmethod.mondo.config;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionFactory {

	private static Context contx;

	public static Connection getConnection() {
		Connection conn = null;
		try {
			if (contx == null) {
				contx = new InitialContext();
			}
			DataSource ds = (DataSource) contx.lookup("java:comp/env/" + "jdbc/local");
			if (ds == null) {
				throw new Exception("Impossibile trovare la configurazione per la connessione");
			}
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
