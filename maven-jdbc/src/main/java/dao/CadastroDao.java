package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.connection.BuildConnection;
import model.Cadastro;

public class CadastroDao {
	
	private Connection cnn;
	
	public CadastroDao() {
		BuildConnection bc = new BuildConnection();
		cnn = bc.createConnection();
	}

}
