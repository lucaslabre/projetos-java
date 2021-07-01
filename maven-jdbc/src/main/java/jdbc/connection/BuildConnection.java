package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BuildConnection {
	public Connection createConnection() {
		Connection cnn = null;
		String url = "jdbc:postgresql://localhost/postgres";
		String user = "postgres";
		String password = "postgres";
		
		try {
			cnn = DriverManager.getConnection(url, user, password);
			System.out.println("Successful Connection!");
		} catch (SQLException e) {
			System.err.print(e);
		}
		
		return cnn;
	}
}
