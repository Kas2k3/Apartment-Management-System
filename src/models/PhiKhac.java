
package models;

/**
 *
 * @author HP
 */
public class PhiKhac {

    public String getMaHoGDPhiKhac() {
        return maHoGDPhiKhac;
    }

    public void setMaHoGDPhiKhac(String maHoGDPhiKhac) {
        this.maHoGDPhiKhac = maHoGDPhiKhac;
    }

    public String getMaPhiKhac() {
        return maPhiKhac;
    }

    public void setMaPhiKhac(String maPhiKhac) {
        this.maPhiKhac = maPhiKhac;
    }

    public double getQuyBienDao() {
        return quyBienDao;
    }

    public void setQuyBienDao(double quyBienDao) {
        this.quyBienDao = quyBienDao;
    }

    public double getQuyKhuyenHoc() {
        return quyKhuyenHoc;
    }

    public void setQuyKhuyenHoc(double quyKhuyenHoc) {
        this.quyKhuyenHoc = quyKhuyenHoc;
    }

    public double getQuyTuThien() {
        return quyTuThien;
    }

    public void setQuyTuThien(double quyTuThien) {
        this.quyTuThien = quyTuThien;
    }

    public String getTinhTrangPhiKhac() {
        return tinhTrangPhiKhac;
    }

    public void setTinhTrangPhiKhac(String tinhTrangPhiKhac) {
        this.tinhTrangPhiKhac = tinhTrangPhiKhac;
    }
    String maHoGDPhiKhac;
    String maPhiKhac;
    double quyBienDao;
    double quyKhuyenHoc;
    double quyTuThien;
    String tinhTrangPhiKhac;
    
    public PhiKhac(String maHoGDPhiKhac, String maPhiKhac, double quyBienDao, double quyKhuyenHoc, double quyTuThien, String tinhTrangPhiKhac){
        this.maHoGDPhiKhac = maHoGDPhiKhac;
        this.maPhiKhac = maPhiKhac;
        this.quyBienDao = quyBienDao;
        this.quyKhuyenHoc = quyKhuyenHoc;
        this.quyTuThien = quyTuThien;
        this.tinhTrangPhiKhac = tinhTrangPhiKhac;

    }
}
