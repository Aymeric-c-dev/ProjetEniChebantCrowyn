package fr.eni.Connexion.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class Connexion {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			DriverManager.registerDriver(new SQLServerDriver());
			String url = "jdbc:sqlserver://localhost:1433;databaseName=PROJET_ENCHERE";
			
			 con = DriverManager.getConnection(url,"sa","Pa$$w0rd");
			
		} catch (SQLException e) {
					e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
