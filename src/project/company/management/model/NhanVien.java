/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.company.management.model;

import java.util.Date;

public class NhanVien {
    private String maNV;
    private String taiKhoan;
    private String matKhau;
    private String ten;
    private Date tuoi;
    private String diaChi;
    private String soCCCD;

    public NhanVien(String taiKhoan, String matKhau) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public NhanVien() {
    }

    public NhanVien(String taiKhoan, String matKhau, String ten, Date tuoi, String diaChi, String soCCCD) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soCCCD = soCCCD;
    }
    
    

    public NhanVien(String ten, Date tuoi, String diaChi, String soCCCD) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soCCCD = soCCCD;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getTuoi() {
        return tuoi;
    }

    public void setTuoi(Date tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    
    
    
}
