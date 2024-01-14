
package models;

/**
 *
 * @author HP
 */
public class PhiDichVu {

    public String getMaHoGDPhiDichVu() {
        return maHoGDPhiDichVu;
    }

    public void setMaHoGDPhiDichVu(String maHoGDPhiDichVu) {
        this.maHoGDPhiDichVu = maHoGDPhiDichVu;
    }

    public String getMaPhiDichVu() {
        return maPhiDichVu;
    }

    public void setMaPhiDichVu(String maPhiDichVu) {
        this.maPhiDichVu = maPhiDichVu;
    }

    public double getPhiVeSinh() {
        return phiVeSinh;
    }

    public void setPhiVeSinh(double phiVeSinh) {
        this.phiVeSinh = phiVeSinh;
    }

    public double getPhiBaoTri() {
        return phiBaoTri;
    }

    public void setPhiBaoTri(double phiBaoTri) {
        this.phiBaoTri = phiBaoTri;
    }

    public double getPhiSHC() {
        return phiSHC;
    }

    public void setPhiSHC(double phiSHC) {
        this.phiSHC = phiSHC;
    }

    public double getPhiAnNinh() {
        return phiAnNinh;
    }

    public void setPhiAnNinh(double phiAnNinh) {
        this.phiAnNinh = phiAnNinh;
    }

    public String getTinhTrangPhiDichVu() {
        return tinhTrangPhiDichVu;
    }

    public void setTinhTrangPhiDichVu(String tinhTrangPhiDichVu) {
        this.tinhTrangPhiDichVu = tinhTrangPhiDichVu;
    }
    String maHoGDPhiDichVu;
    String maPhiDichVu;
    double phiVeSinh;
    double phiBaoTri;
    double phiSHC;
    double phiAnNinh;
    String tinhTrangPhiDichVu;
    
    public PhiDichVu(String maHoGDPhiDichVu, String maPhiDichVu, double phiVeSinh, double phiBaoTri, double phiSHC, double phiAnNinh, String tinhTrangPhiDichVu){
        this.maHoGDPhiDichVu = maHoGDPhiDichVu;
        this.maPhiDichVu = maPhiDichVu;
        this.phiVeSinh = phiVeSinh;
        this.phiBaoTri = phiBaoTri;
        this.phiSHC = phiSHC;
        this.phiAnNinh = phiAnNinh;
        this.tinhTrangPhiDichVu = tinhTrangPhiDichVu;

    }
            
}
