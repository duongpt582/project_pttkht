/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.company.management.database;

/**
 *
 * @author ASUS
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import project.company.management.model.TaiKhoan;

public class TaiKhoanManager {
    private static final String FILE_PATH = "TaiKhoan.txt";

    public static void main(String[] args) {
        // Đoạn mã để kiểm tra việc đọc và ghi file
        List<TaiKhoan> danhSachTaiKhoan = new ArrayList<>();

        // Thêm tài khoản mẫu để minh họa
        danhSachTaiKhoan.add(new TaiKhoan("admin", "admin"));
        danhSachTaiKhoan.add(new TaiKhoan("duongpt", "12345"));
        danhSachTaiKhoan.add(new TaiKhoan("nguyenvt", "67890"));

        // Ghi danh sách tài khoản vào file
        ghiFile(danhSachTaiKhoan);

        // Đọc danh sách tài khoản từ file
        List<TaiKhoan> taiKhoanDaDoc = docFile();

        // In danh sách tài khoản đã đọc từ file
        for (TaiKhoan taiKhoan : taiKhoanDaDoc) {
            System.out.println(taiKhoan);
        }
    }

    // Phương thức để ghi danh sách tài khoản vào file
    public static void ghiFile(List<TaiKhoan> danhSachTaiKhoan) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (TaiKhoan taiKhoan : danhSachTaiKhoan) {
                String taiKhoanLine = taiKhoan.getTenTK()+ "," + taiKhoan.getMatKhauTK();
                writer.write(taiKhoanLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
    
    // Phương thức để ghi danh sách tài khoản vào file
    public static void ghiFile(TaiKhoan taiKhoan) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            
                String taiKhoanLine = taiKhoan.getTenTK()+ "," + taiKhoan.getMatKhauTK();
                writer.write(taiKhoanLine);
                writer.newLine();
            
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    // Phương thức để đọc danh sách tài khoản từ file
    public static List<TaiKhoan> docFile() {
        List<TaiKhoan> danhSachTaiKhoan = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String tenTaiKhoan = parts[0];
                    String matKhau = parts[1];
                    TaiKhoan taiKhoan = new TaiKhoan(tenTaiKhoan, matKhau);
                    danhSachTaiKhoan.add(taiKhoan);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }

        return danhSachTaiKhoan;
    }
}

