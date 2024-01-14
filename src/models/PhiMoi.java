
package models;

public class PhiMoi {
    
    String maHoGDPhiMoi;
    double phiGuiXe;
    double phiDien;
    double phiNuoc;
    double phiInternet;
    String tinhTrangPhiMoi;
    
    public PhiMoi(String maHoGDPhiMoi, double phiGuiXe, double phiDien, double phiNuoc, double phiInternet, String tinhTrangPhiMoi){
        this.maHoGDPhiMoi = maHoGDPhiMoi;
        this.phiGuiXe = phiGuiXe;
        this.phiDien = phiDien;
        this.phiNuoc = phiNuoc;
        this.phiInternet = phiInternet;
        this.tinhTrangPhiMoi = tinhTrangPhiMoi;
    }
    
    public String getMaHoGDPhiMoi() {
        return maHoGDPhiMoi;
    }

    public void setMaHoGDPhiMoi(String maHoGDPhiMoi) {
        this.maHoGDPhiMoi = maHoGDPhiMoi;
    }

    public double getPhiGuiXe() {
        return phiGuiXe;
    }

    public void setPhiGuiXe(double phiGuiXe) {
        this.phiGuiXe = phiGuiXe;
    }

    public double getPhiDien() {
        return phiDien;
    }

    public void setPhiDien(double phiDien) {
        this.phiDien = phiDien;
    }

    public double getPhiNuoc() {
        return phiNuoc;
    }

    public void setPhiNuoc(double phiNuoc) {
        this.phiNuoc = phiNuoc;
    }

    public double getPhiInternet() {
        return phiInternet;
    }

    public void setPhiInternet(double phiInternet) {
        this.phiInternet = phiInternet;
    }

    public String getTinhTrangPhiMoi() {
        return tinhTrangPhiMoi;
    }

    public void setTinhTrangPhiMoi(String tinhTrangPhiMoi) {
        this.tinhTrangPhiMoi = tinhTrangPhiMoi;
    }
    
}
