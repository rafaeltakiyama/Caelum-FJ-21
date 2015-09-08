package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.caelum.jdbc.exception.DAOException;

public class ConnectionFactory {

	public Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fj21", "root", "12345");
		} catch (SQLException e) {
			throw new DAOException(e);
		}

	}

}
