/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


public class PhiQuanLy {

    public String getMaHoGDPhiQuanLy() {
        return maHoGDPhiQuanLy;
    }

    public void setMaHoGDPhiQuanLy(String maHoGDPhiQuanLy) {
        this.maHoGDPhiQuanLy = maHoGDPhiQuanLy;
    }

    public String getMaPhiQuanLy() {
        return maPhiQuanLy;
    }

    public void setMaPhiQuanLy(String maPhiQuanLy) {
        this.maPhiQuanLy = maPhiQuanLy;
    }

    public double getPhiVanHanh() {
        return phiVanHanh;
    }

    public void setPhiVanHanh(double phiVanHanh) {
        this.phiVanHanh = phiVanHanh;
    }

    public String getTinhTrangPhiQuanLy() {
        return tinhTrangPhiQuanLy;
    }

    public void setTinhTrangPhiQuanLy(String tinhTrangPhiQuanLy) {
        this.tinhTrangPhiQuanLy = tinhTrangPhiQuanLy;
    }
    String maHoGDPhiQuanLy;
    String maPhiQuanLy;
    double phiVanHanh;
    String tinhTrangPhiQuanLy;
    
    public PhiQuanLy(String maHoGDPhiQuanLy, String maPhiQuanLy, double phiVanHanh, String tinhTrangPhiQuanLy){
        this.maHoGDPhiQuanLy = maHoGDPhiQuanLy;
        this.maPhiQuanLy = maPhiQuanLy;
        this.phiVanHanh = phiVanHanh;
        this.tinhTrangPhiQuanLy = tinhTrangPhiQuanLy;

    }
    
}
