package POO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
public static void main(String[] args) {
		
		String jdbcURL = "jdbc:postgresql://localhost:5433/postgres";
		String username = "postgres";
		String password = "password";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Conectado ao servidor Postgresql");
			
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro na conexao com o servidor");
			e.printStackTrace();
		}
		
		
	}

}
