/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.company.management.model;

/**
 *
 * @author ASUS
 */
import java.util.Date;

public class NhapKho {
    private long maPhieuNhap;
    private String maHang;
    private long soLuong;
    private float thanhTien;
    private String maNhaCungCap;
    private Date ngayNhap;
    private String maNhanVien;

    public NhapKho(long maPhieuNhap, String maHang, long soLuong, float thanhTien, String maNhaCungCap, Date ngayNhap, String maNhanVien) {
        this.maPhieuNhap = maPhieuNhap;
        this.maHang = maHang;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.maNhaCungCap = maNhaCungCap;
        this.ngayNhap = ngayNhap;
        this.maNhanVien = maNhanVien;
    }

    // Getter and Setter methods

    public long getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(long maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(long soLuong) {
        this.soLuong = soLuong;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
}

