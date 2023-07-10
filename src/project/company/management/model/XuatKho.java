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

public class XuatKho {
    private long maPhieuXuat;
    private String maHang;
    private long soLuong;
    private float thanhTien;
    private Date ngayXuat;
    private String maNhanVien;

    public XuatKho(long maPhieuXuat, String maHang, long soLuong, float thanhTien, Date ngayXuat, String maNhanVien) {
        this.maPhieuXuat = maPhieuXuat;
        this.maHang = maHang;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.ngayXuat = ngayXuat;
        this.maNhanVien = maNhanVien;
    }

    // Getter and Setter methods

    public long getMaPhieuXuat() {
        return maPhieuXuat;
    }

    public void setMaPhieuXuat(long maPhieuXuat) {
        this.maPhieuXuat = maPhieuXuat;
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

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
}

