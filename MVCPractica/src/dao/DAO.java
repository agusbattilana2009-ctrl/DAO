package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	private String user = "root";
	private String psw = "admin";
	private String path = "jdbc:mysql://localhost:3306/mvcpractica";

	public Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(path, user, psw);
			Statement stmt = conexion.createStatement();
			System.out.println("Se conectó");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;
	}
}