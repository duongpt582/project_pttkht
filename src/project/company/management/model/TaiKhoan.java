/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.company.management.model;

/**
 *
 * @author ASUS
 */
public class TaiKhoan {
    private String tenTK;
    private String matKhauTK;

    public TaiKhoan(String tenTK, String matKhauTK) {
        this.tenTK = tenTK;
        this.matKhauTK = matKhauTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhauTK() {
        return matKhauTK;
    }

    public void setMatKhauTK(String matKhauTK) {
        this.matKhauTK = matKhauTK;
    }
    
    
}
