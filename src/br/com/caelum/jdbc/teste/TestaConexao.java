package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException{
		
		Connection connection = null;
		
		try {
			connection = new ConnectionFactory().getConnection();
			System.out.println("Conexao aberta!!!");
			
		}finally{
			connection.close();
		}
	}
	
}
