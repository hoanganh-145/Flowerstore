
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan {
    private String TenDangNhap;
    private String MatKhau;

    public TaiKhoan() {
    }

    public TaiKhoan(String TenDangNhap, String MatKhau) {
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = this.MatKhau;
    }

    public String getTenĐN() {
        return TenDangNhap;
    }

    public void setTenĐN(String tenĐN) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMK() {
        return MatKhau;
    }

    public void setMK(String MK) {
        this.MatKhau = MatKhau;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "ten\u0110N=" + TenDangNhap + ", MK=" + MatKhau + '}';
    }   
}
