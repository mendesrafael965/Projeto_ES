package connections;

import java.sql.*;
import javax.swing.*;

public class sqllConnection {
	Connection conn = null;
	
	public static Connection dbConnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			//("jdbc:sqlite:C:\\Users\\Tulio\\Desktop\\Eng Software\\test_proj.db");
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\mende\\OneDrive\\�rea de Trabalho\\Teste DB\\test_proj.db");
			JOptionPane.showMessageDialog(null, "Connection succesfull");
			return conn;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		 
	}
}

