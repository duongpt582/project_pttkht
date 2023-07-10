/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.company.management.model;

import java.util.Date;

public class NhanVien {
    private String maNV;
    private TaiKhoan taiKhoan;
    private String ten;
    private Date tuoi;
    private String gioiTinh;
    private String soDienThoai;
    private String diaChi;
    private String soCCCD;
    private Date ngayKyHopDong;



    public NhanVien() {
    }

    public NhanVien(TaiKhoan taiKhoan, String ten, Date tuoi, String diaChi, String soCCCD) {
        this.taiKhoan = taiKhoan;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soCCCD = soCCCD;
    }

    public NhanVien(String maNV, TaiKhoan taiKhoan, String ten, Date tuoi, String gioiTinh, String soDienThoai, String diaChi, Date ngayKyHopDong) {
        this.maNV = maNV;
        this.taiKhoan = taiKhoan;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.ngayKyHopDong = ngayKyHopDong;
    }
    
    

    public NhanVien(String ten, Date tuoi, String diaChi, String soCCCD) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soCCCD = soCCCD;
    }

 

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public Date getNgayKyHopDong() {
        return ngayKyHopDong;
    }

    public void setNgayKyHopDong(Date ngayKyHopDong) {
        this.ngayKyHopDong = ngayKyHopDong;
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

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    
    
    
    
    
    
}
