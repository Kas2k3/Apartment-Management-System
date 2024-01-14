
package models;

import java.sql.Date;

/**
 *
 * @author HP
 */
public class NhanKhau {
    
    String maNhanKhau;
    String hoTenNhanKhau;
    String soCCCD;
    String gioiTinhNhanKhau;
    Date ngaySinhNhanKhau;
    String quanHeChuHo;    
    
    public NhanKhau(String maNhanKhau, String hoTenNhanKhau, String soCCCD, String gioiTinhNhanKhau, Date ngaySinhNhanKhau, String quanHeChuHo){
        this.maNhanKhau = maNhanKhau;
        this.hoTenNhanKhau = hoTenNhanKhau;
        this.soCCCD = soCCCD;
        this.gioiTinhNhanKhau = gioiTinhNhanKhau;
        this.ngaySinhNhanKhau = ngaySinhNhanKhau;
        this.quanHeChuHo = quanHeChuHo;
    }
    
    public String getMaNhanKhau() {
        return maNhanKhau;
    }

    public void setMaNhanKhau(String maNhanKhau) {
        this.maNhanKhau = maNhanKhau;
    }

    public String getHoTenNhanKhau() {
        return hoTenNhanKhau;
    }

    public void setHoTenNhanKhau(String hoTenNhanKhau) {
        this.hoTenNhanKhau = hoTenNhanKhau;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getGioiTinhNhanKhau() {
        return gioiTinhNhanKhau;
    }

    public void setGioiTinhNhanKhau(String gioiTinhNhanKhau) {
        this.gioiTinhNhanKhau = gioiTinhNhanKhau;
    }

    public Date getNgaySinhNhanKhau() {
        return ngaySinhNhanKhau;
    }

    public void setNgaySinhNhanKhau(Date ngaySinhNhanKhau) {
        this.ngaySinhNhanKhau = ngaySinhNhanKhau;
    }

    public String getQuanHeChuHo() {
        return quanHeChuHo;
    }

    public void setQuanHeChuHo(String quanHeChuHo) {
        this.quanHeChuHo = quanHeChuHo;
    }

}
