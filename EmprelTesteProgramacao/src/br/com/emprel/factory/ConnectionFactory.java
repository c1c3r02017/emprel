package br.com.emprel.factory;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionFactory {
	private static final String USERNAME = "root";
	private static final String PASSWORD = "admin";
	private static final String URL = "jdbc:mysql://localhost:3306/complaint";

	public static Connection createConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return connection;
	}

	/**
	 * @param args
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Testando conexão
		Connection con = createConnection();
		if (con != null) {
			System.out.print("Copas");
			con.close();
		}

	}
}
