package Exception_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
	public static void main(String[] args) {  
        String url = "jdbc:invalid:url"; // Invalid URL to trigger SQLException  
        try {  
            Connection conn = DriverManager.getConnection(url); // This will throw SQLException  
        } catch (SQLException e) {  
            System.out.println("Error: SQLException occurred! " + e.getMessage());  
        }  
    }  
}
