package media.orthophonie.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDB {

	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/orthophonie";
	private static String USERNAME = "root";
	private static String PASSWORD = "";

	public static Connection getConnexionDB (){
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
