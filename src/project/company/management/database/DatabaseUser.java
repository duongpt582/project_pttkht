
package project.company.management.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseUser {
    
   
    public static void main(String[] args) {
        DatabaseUser db = new DatabaseUser();
        db.createConnect();
    }
    
    public void createConnect() {
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");
                System.out.println("Database Connection Success");
                
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM user");

                while (rs.next()) {
                    String name = rs.getString("username");
                    System.out.println(name);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean searchData(String username1, String password1) {
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM user WHERE username=? and password=?");
            preparedStatement.setString(1, username1);
            preparedStatement.setString(2, password1);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if (rs.next()) {
                System.out.println("Login success");
                return true;
            } else {
                System.out.println("False to login");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
