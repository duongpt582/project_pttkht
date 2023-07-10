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

public class BienBanKiemKe {
    private long maBienBan;
    private Date ngayLap;
    private long maPhieuNhap;
    private long maPhieuXuat;
    private long soLuongHangTon;
    private float tongTienThanhToan;
    private String maNhanVien;

    public BienBanKiemKe(long maBienBan, Date ngayLap, long maPhieuNhap, long maPhieuXuat, long soLuongHangTon, float tongTienThanhToan, String maNhanVien) {
        this.maBienBan = maBienBan;
        this.ngayLap = ngayLap;
        this.maPhieuNhap = maPhieuNhap;
        this.maPhieuXuat = maPhieuXuat;
        this.soLuongHangTon = soLuongHangTon;
        this.tongTienThanhToan = tongTienThanhToan;
        this.maNhanVien = maNhanVien;
    }

    // Getter and Setter methods

    public long getMaBienBan() {
        return maBienBan;
    }

    public void setMaBienBan(long maBienBan) {
        this.maBienBan = maBienBan;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public long getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(long maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public long getMaPhieuXuat() {
        return maPhieuXuat;
    }

    public void setMaPhieuXuat(long maPhieuXuat) {
        this.maPhieuXuat = maPhieuXuat;
    }

    public long getSoLuongHangTon() {
        return soLuongHangTon;
    }

    public void setSoLuongHangTon(long soLuongHangTon) {
        this.soLuongHangTon = soLuongHangTon;
    }

    public float getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(float tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
}
