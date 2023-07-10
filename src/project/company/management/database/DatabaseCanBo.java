
package project.company.management.database;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;

public class DatabaseCanBo {
    
    public static Connection con;
    private Statement statement;
    DefaultTableModel model;

    
    public static void main(String[] args) throws SQLException {
        DatabaseCanBo db = new DatabaseCanBo();
        db.createConnect();
        db.insertData1();
    }
    
    public DatabaseCanBo() {
        createConnect();
    }
    
    
    public void createConnect() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                

                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");

                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3307/db_company",
                        "root",
                        "");

                System.out.println("Database Connection Success");
                
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM can_bo");

                while (rs.next()) {
                    String name = rs.getString("ho_ten");
                    System.out.println(name);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public Connection createConnect2() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");

                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3307/db_company",
                        "root",
                        "");

                System.out.println("Database Connection Success");
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    /**
     *  using Statement
     */
    public void insertData1() {
        try {
            String name = "Tu Ngoc Duc";
            String dateString;
            statement = con.createStatement();
            String dbInsert = "INSERT INTO `can_bo`( `ho_ten`, `ngay_sinh`, `dia_chi`, `chuc_vu`, `ma_can_bo`, `so_ngay_lam_viec`) "
                    + "VALUES ('" + name +"','2002-05-08','Ha Noi','xxxx','xxxxx','5')";
            statement.execute(dbInsert);
            System.out.println("Insertion Complete!");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *  using Prepared Statements
     */
    public void insertData2() {
        try {
            String name = "Tu Ngoc Duc";
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO `can_bo`(?)");
            preparedStatement.setString(1, name);
            preparedStatement.execute();
            preparedStatement.close();
            System.out.println("Insertion Complete!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertData1(String ma, String ten, String ngaySinh, 
                    String gioiTinh, String diaChi, String chucVu, 
                    int soNgayLamViec, double luong) {
        try {
            statement = con.createStatement();
            String dbInsert = "INSERT INTO `can_bo`(`ID`, `ho_ten`, `ngay_sinh`, `Gioi_tinh`, `dia_chi`, `chuc_vu`, `so_ngay_lam_viec`, `Luong`) "
                    + "VALUES ('"+ ma +"', '"+ten+"', '"+ngaySinh+"','"+gioiTinh+"','"+diaChi+"','"+chucVu+"','"+soNgayLamViec+"','"+luong+"')";
                   
            statement.execute(dbInsert);
            System.out.println("Insertion Complete!");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    
    
    
}
