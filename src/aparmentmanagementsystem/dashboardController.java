package aparmentmanagementsystem;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.HoKhau;
import models.NhanKhau;
import models.PhiDichVu;
import models.PhiKhac;
import models.PhiMoi;
import models.PhiQuanLy;
import models.QuanTriVien;


public class dashboardController implements Initializable{
    
    @FXML
    private Button logout;
    
    @FXML
    private Button minimize;
    
    @FXML
    private Label username;
    
//    @FXML
//    private ComboBox<?> danhSachTrangThai_cbb;
//    
//    @FXML
//    private ComboBox<?> danhSachGioiTinh_cbb;
    
    @FXML
    private Button trangChu_btn;
    
    @FXML
    private Button doiMatKhau_btn;
    
    @FXML
    private Button khoanThu_btn;
    
    @FXML
    private Button thongTinHoGD_btn;
    
    @FXML
    private Button thongTinQTV_btn;
    
    @FXML
    private Button v2Update_btn;
    
    @FXML
    private Button traCuuV2Update_btn;
    
    @FXML
    private Button themV2Update_btn;
    
    @FXML
    private Button suaV2Update_btn;
    
    @FXML
    private Button themKhoanThu_btn;
    
    @FXML
    private Button suaKhoanThu_btn;
    
    @FXML
    private Button traCuuKhoanThu_btn;
    
    @FXML
    private Button traCuuPhiQuanLy_btn;
    
    @FXML
    private Button traCuuPhiDichVu_btn;
    
    @FXML
    private Button traCuuPhiKhac_btn;
    
    @FXML
    private Button themPhiQuanLy_btn;
    
    @FXML
    private Button themPhiDichVu_btn;
    
    @FXML
    private Button themPhiKhac_btn;
    
    @FXML
    private Button suaPhiQuanLy_btn;
    
    @FXML
    private Button suaPhiDichVu_btn;
    
    @FXML
    private Button suaPhiKhac_btn;
    
    @FXML
    private Button themThongTinHoGD_btn;
    
    @FXML
    private Button suaThongTinHoGD_btn;
    
    @FXML
    private Button traCuuThongTinHoGD_btn;
    
    @FXML
    private Button suaHoKhau_btn;
    
    @FXML
    private Button suaNhanKhau_btn;
    
    @FXML
    private Button traCuuHoKhau_btn;
    
    @FXML
    private Button traCuuNhanKhau_btn;
    
    @FXML
    private Button themHoKhau_btn;
    
    @FXML
    private Button themNhanKhau_btn;
    
    @FXML
    private AnchorPane trangChu_form;
    
    @FXML
    private AnchorPane khoanThu_form;
    
    @FXML
    private AnchorPane thongTinHoGD_form;
    
    @FXML
    private AnchorPane thongTinQTV_form;
    
    @FXML
    private AnchorPane v2Update_form;
    
    @FXML
    private AnchorPane traCuuV2Update_form;
    
    @FXML
    private AnchorPane themV2Update_form;
    
    @FXML
    private AnchorPane suaV2Update_form;
    
    @FXML
    private AnchorPane themKhoanThu_form;
    
    @FXML
    private AnchorPane suaKhoanThu_form;
    
    @FXML
    private AnchorPane traCuuPhiQuanLy_form;
    
    @FXML
    private AnchorPane traCuuPhiDichVu_form;
    
    @FXML
    private AnchorPane traCuuPhiKhac_form;
    
    @FXML
    private AnchorPane themPhiQuanLy_form;
    
    @FXML
    private AnchorPane themPhiDichVu_form;
    
    @FXML
    private AnchorPane themPhiKhac_form;
    
    @FXML
    private AnchorPane suaPhiQuanLy_form;
    
    @FXML
    private AnchorPane suaPhiDichVu_form;
    
    @FXML
    private AnchorPane suaPhiKhac_form;
    
    @FXML
    private AnchorPane traCuuKhoanThu_form;

    @FXML
    private AnchorPane themThongTinHoGD_form;
    
    @FXML
    private AnchorPane suaThongTinHoGD_form;
    
    @FXML
    private AnchorPane traCuuThongTinHoGD_form;
        
    @FXML
    private AnchorPane suaHoKhau_form;
    
    @FXML
    private AnchorPane suaNhanKhau_form;
    
    @FXML
    private AnchorPane traCuuHoKhau_form;
    
    @FXML
    private AnchorPane traCuuNhanKhau_form;
    
    @FXML
    private AnchorPane themHoKhau_form;
    
    @FXML
    private AnchorPane themNhanKhau_form;
    
    @FXML
    private AnchorPane mainQTV_form;
    
    @FXML
    private AnchorPane doiMatKhau_form;
    
    @FXML
    private TableView<QuanTriVien> QTV_table;
    
    @FXML
    private TableView<HoKhau> hoKhau_table;
    
    @FXML
    private TableView<NhanKhau> nhanKhau_table;
     
    @FXML
    private TableView<PhiMoi> phiMoi_table;
    
    @FXML
    private TableView<PhiDichVu> phiDichVu_table;
    
    @FXML
    private TableView<PhiKhac> phiKhac_table;
    
    @FXML
    private TableView<PhiQuanLy> phiQuanLy_table;
    
    
    @FXML
    private TableColumn<QuanTriVien, String> emailQTV_col;

    @FXML
    private TableColumn<QuanTriVien, String> gioiTinhQTV_col;

    @FXML
    private TableColumn<QuanTriVien, String> hoTenQTV_col;
    
     @FXML
    private TableColumn<QuanTriVien, String> maQTV_col;

    @FXML
    private TableColumn<QuanTriVien, String> ngaySinhQTV_col;

    @FXML
    private TableColumn<QuanTriVien, String> sdtQTV_col;
    
    @FXML
    private TableColumn<QuanTriVien, String> diaChiQTV_col;
    
    @FXML
    private TableColumn<HoKhau, String> chatLuongChungCu_col;
    
    @FXML
    private TableColumn<HoKhau, String> diaChiHoKhau_col;
    
    @FXML
    private TableColumn<HoKhau, Double> dienTich_col;
    
    @FXML
    private TableColumn<HoKhau, String> maHoKhau_col;
    
    @FXML
    private TableColumn<HoKhau, String> ngaySuaHoKhau_col;

    @FXML
    private TableColumn<HoKhau, String> ngayTaoHoKhau_col;
    
    @FXML
    private TableColumn<HoKhau, String> tenChuHo_col;
    
    @FXML
    private TableColumn<NhanKhau, String> tenNhanKhau_col;
    
    @FXML
    private TableColumn<NhanKhau, String> quanHeChuHo_col;
    
    @FXML
    private TableColumn<NhanKhau, String> ngaySinhNhanKhau_col;
    
    @FXML
    private TableColumn<NhanKhau, String> maNhanKhau_col;
      
    @FXML
    private TableColumn<NhanKhau, String> gioiTinhNhanKhau_col;
    
    @FXML
    private TableColumn<NhanKhau, String> cccd_col;
    
    @FXML
    private TableColumn<PhiMoi, String> maHoGDPhiMoi_col;
    
    @FXML
    private TableColumn<PhiMoi, Double> phiDien_col;

    @FXML
    private TableColumn<PhiMoi, Double> phiGuiXe_col;

    @FXML
    private TableColumn<PhiMoi, Double> phiInternet_col;
    
    @FXML
    private TableColumn<PhiMoi, Double> phiNuoc_col;
    
    @FXML
    private TableColumn<PhiMoi, Double> tinhTrangPhiMoi_col;
    
    @FXML
    private TableColumn<PhiDichVu, String> maHoGDPhiDichVu_col;

    @FXML
    private TableColumn<PhiKhac, String> maHoGDPhiKhac_col;
    
    @FXML
    private TableColumn<PhiQuanLy, String> maHoGDPhiQuanLy_col;
    
    @FXML
    private TableColumn<PhiDichVu, String> maPhiDichVu_col;

    @FXML
    private TableColumn<PhiKhac, String> maPhiKhac_col;

    @FXML
    private TableColumn<PhiQuanLy, String> maPhiQuanLy_col;
    
    @FXML
    private TableColumn<PhiDichVu, String> phiAnNinh_col;

    @FXML
    private TableColumn<PhiDichVu, String> phiBaoTri_col;
    
    @FXML
    private TableColumn<PhiDichVu, String> phiSHC_col;

    @FXML
    private TableColumn<PhiQuanLy, String> phiVanHanh_col;

    @FXML
    private TableColumn<PhiDichVu, String> phiVeSinh_col;
    
    @FXML
    private TableColumn<PhiKhac, String> quyBienDao_col;
    
    @FXML
    private TableColumn<PhiKhac, String> quyKhuyenHoc_col;
    
    @FXML
    private TableColumn<PhiKhac, String> quyTuThien_col;
    
    @FXML
    private TableColumn<PhiDichVu, String> tinhTrangPhiDichVu_col;

    @FXML
    private TableColumn<PhiKhac, String> tinhTrangPhiKhac_col;

    @FXML
    private TableColumn<PhiQuanLy, String> tinhTrangPhiQuanLy_col;
    
    

    @FXML
    private TextField diaChiQTV_txt;
    
    @FXML
    private TextField maQTV_txt;
    
    @FXML
    private TextField hoTenQTV_txt;
    
    @FXML
    private TextField sdtQTV_txt;
    
    @FXML
    private TextField emailQTV_txt;
    
    @FXML
    private TextField gioiTinhQTV_txt;
    
    @FXML
    private DatePicker ngaySinhQTV_txt;
    
    @FXML
    private TextField searchQTV_txt;
    
    @FXML
    private TextField addChatLuongChungCu_txt;

    @FXML
    private TextField addDiaChiHoKhau_txt;

    @FXML
    private TextField addDienTich_txt;
    
    @FXML
    private TextField addTenChuHo_txt;
    
    @FXML
    private DatePicker addNgayTaoHoKhau_txt;
    
    @FXML
    private TextField addMaHoKhau_txt;
    
    @FXML
    private TextField changeChatLuongChungCu_txt;

    @FXML
    private TextField changeDiaChiHoKhau_txt;

    @FXML
    private TextField changeDienTich_txt;
    
    @FXML
    private DatePicker changeNgaySuaHoKhau_txt;
    
    @FXML
    private TextField changeTenChuHo_txt;
    
    @FXML
    private TextField changeMaHoKhau_txt;
    
    @FXML
    private TextField searchNhanKhau_txt;
    
    @FXML
    private TextField addGioiTinhNhanKhau_txt;
    
    @FXML
    private TextField addMaNhanKhau_txt;
    
    @FXML
    private DatePicker addNgaySinhNhanKhau_txt;
    
    @FXML
    private TextField addTenNhanKhau_txt;
    
    @FXML
    private TextField addQuanHeChuHo_txt;
    
    @FXML
    private TextField addCCCD_txt;
    
    @FXML
    private TextField account_txt;
    
    @FXML
    private PasswordField newPassword_txt;
    
    @FXML
    private PasswordField currentPassword_txt;
    
    
    
    @FXML
    private TextField changeCCCD_txt;
    
    @FXML
    private TextField changeMaNhanKhau_txt;
    
    @FXML
    private DatePicker changeNgaySinhNhanKhau_txt;
    
    @FXML
    private TextField changeQuanHeChuHo_txt;
    
    @FXML
    private TextField changeTenNhanKhau_txt;
    
    @FXML
    private TextField changeGioiTinhNhanKhau_txt;
    
    
    @FXML
    private TextField changeMaHoPhiMoi_txt;
    
    @FXML
    private TextField changePhiDien_txt;

    @FXML
    private TextField changePhiGuiXe_txt;

    @FXML
    private TextField changePhiInternet_txt;

    @FXML
    private TextField changePhiNuoc_txt;
    
    @FXML
    private TextField changeTinhTrangPhiMoi_txt;
    
    @FXML
    private TextField searchPhiMoi_txt;
    
    @FXML
    private TextField addTinhTrangPhiMoi_txt;
    
    @FXML
    private TextField addPhiDien_txt;

    @FXML
    private TextField addPhiGuiXe_txt;

    @FXML
    private TextField addPhiInternet_txt;

    @FXML
    private TextField addPhiNuoc_txt;
    
    @FXML
    private TextField addMaHoPhiMoi_txt;
    
    @FXML
    private TextField addMaHoKhauPhiQuanLy_txt;
    
    @FXML
    private TextField addMaHoKhauPhiKhac_txt;
    
    @FXML
    private TextField addMaPhiKhac_txt;
    
    @FXML
    private TextField addMaPhiQuanLy_txt;
    
    @FXML
    private TextField addMaPhiDichVu_txt;
    
    @FXML
    private TextField addPhiVanHanh_txt;
    
    @FXML
    private TextField addMaHoKhauPhiDichVu_txt;
    
    @FXML
    private TextField addPhiSHC_txt;
    
    @FXML
    private TextField addPhiVeSinh_txt;
    
    @FXML
    private TextField addPhiAnNinh_txt;
    
    @FXML
    private TextField addPhiBaoTri_txt;
    
    @FXML
    private TextField addTinhTrangPhiDichVu_txt;    
    
    @FXML
    private TextField addQuyBienDao_txt;

    @FXML
    private TextField addQuyKhuyenHoc_txt;

    @FXML
    private TextField addQuyTuThien_txt;

    @FXML
    private TextField addTinhTrangPhiKhac_txt;
    
    @FXML
    private TextField addTinhTrangPhiQuanLy_txt;
    
    @FXML
    private TextField changeMaHoKhauPhiDichVu_txt;

    @FXML
    private TextField changeMaHoKhauPhiKhac_txt;

    @FXML
    private TextField changeMaHoKhauPhiQuanLy_txt;
    
    @FXML
    private TextField changeMaPhiDichVu_txt;

    @FXML
    private TextField changeMaPhiKhac_txt;

    @FXML
    private TextField changeMaPhiQuanLy_txt;
    
    @FXML
    private TextField changePhiAnNinh_txt;

    @FXML
    private TextField changePhiBaoTri_txt;
    
    @FXML
    private TextField changePhiSHC_txt;

    @FXML
    private TextField changePhiVanHanh_txt;

    @FXML
    private TextField changePhiVeSinh_txt;
    
    @FXML
    private TextField changeQuyBienDao_txt;

    @FXML
    private TextField changeQuyKhuyenHoc_txt;

    @FXML
    private TextField changeQuyTuThien_txt;
    
    @FXML
    private TextField changeTinhTrangPhiDichVu_txt;

    @FXML
    private TextField changeTinhTrangPhiKhac_txt;
    
    @FXML
    private TextField changeTinhTrangPhiQuanLy_txt;
    
    
    
    
    
    
    

    //OPTION_COMBO_BOX
//    private String[] trangThai = {"Đã nộp đủ", "Chưa nộp đủ"};
//    
//    public void trangThaiNopTien(){
//        List<String> DStrangThai = new ArrayList<>();
//        
//        for(String data: trangThai) {
//            DStrangThai.add(data);
//        }
//        
//        ObservableList listData = FXCollections.observableArrayList(DStrangThai);
//        danhSachTrangThai_cbb.setItems(listData);
//    }
//    
//    
//    private String[] gioiTinh = {"Nam", "Nữ"};
//    
//    public void gioiTinh(){
//        List<String> DSgioiTinh = new ArrayList<>();
//        
//        for(String data: gioiTinh) {
//            DSgioiTinh.add(data);
//        }
//        
//        ObservableList listData = FXCollections.observableArrayList(DSgioiTinh);
//        danhSachGioiTinh_cbb.setItems(listData);
//    }
    
    //SWITCH_FORM
    
//   
    
    
    Connection connect;
    PreparedStatement pst;
    Statement statement;
    ResultSet result;
    
    int myQTVIndex;
    int myHoKhauIndex;
    int myNhanKhauIndex;
    int myPhiMoiIndex;
    int myPhiQLIndex;
    int myPhiDVIndex;
    int myPhiKhacIndex;
    
    
    // THÔNG TIN PHÍ KHÁC (QUỸ KHUYÊN GÓP)
    
    @FXML
    void changePhiKhac(ActionEvent event) throws SQLException {
        
        connect = database.connectDb();
        String changePhiKhac = "update phikhac set MaPhiKhac = ?, QuyBienDao = ?, QuyKhuyenHoc = ?, QuyTuThien = ?, TinhTrangPhiKhac = ?"
                + " where MaHoGDPhiKhac = '" + changeMaHoKhauPhiKhac_txt.getText() + "'";
        try {
            
            Alert alert;
            
            if (changeMaHoKhauPhiKhac_txt.getText().isEmpty() 
                    || changeMaPhiKhac_txt.getText().isEmpty()
                    || changeQuyBienDao_txt.getText().isEmpty()
                    || changeQuyKhuyenHoc_txt.getText().isEmpty()
                    || changeQuyTuThien_txt.getText().isEmpty()
                    || changeTinhTrangPhiKhac_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin!");
            alert.showAndWait();
            PhiKhacShowListData();
            
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Xác nhận sửa");
                alert.setHeaderText(null);
                alert.setContentText("Bạn có chắc muốn SỬA phí quyên góp của hộ # " + changeMaHoKhauPhiDichVu_txt.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)){
                    pst = connect.prepareStatement(changePhiKhac);
                    pst.setString(1, changeMaPhiKhac_txt.getText());
                    pst.setString(2, changeQuyBienDao_txt.getText());
                    pst.setString(3, changeQuyKhuyenHoc_txt.getText());
                    pst.setString(4, changeQuyTuThien_txt.getText());
                    pst.setString(5, changeTinhTrangPhiKhac_txt.getText());
                    pst.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Thông báo sửa phí");
                    alert.setHeaderText(null);
                    alert.setContentText("Sửa phí thành công!");
                    alert.showAndWait();
                    
                    // UPDATE TABLEVIEW
                    PhiKhacShowListData();
                    //TO CLEAR THE FIELDS
                    ChangePhiKhacClear();
                }
            }
            } catch (SQLException e){
                e.printStackTrace();
            }
    }
    
    // Thêm thông tin phi quyên góp
    @FXML
    public void addPhiKhac(ActionEvent event) {
    String insertPhiKhac = "insert into phikhac (MaHoGDPhiKhac,MaPhiKhac,QuyBienDao,QuyKhuyenHoc,QuyTuThien,TinhTrangPhiKhac) values(?,?,?,?,?,?)";

    connect = database.connectDb();

    try {
        Alert alert;

        if (addMaHoKhauPhiKhac_txt.getText().isEmpty()
                || addMaPhiKhac_txt.getText().isEmpty()
                || addQuyBienDao_txt.getText().isEmpty()
                || addQuyKhuyenHoc_txt.getText().isEmpty()
                || addQuyTuThien_txt.getText().isEmpty()
                || addTinhTrangPhiKhac_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin");
            alert.showAndWait();
            PhiKhacShowListData();

        } else {
            // CHECK IF EXIST
            String checkPhiKhac = "select MaHoGDPhiKhac from phikhac where MaHoGDPhiKhac = '"
                    + addMaHoKhauPhiKhac_txt.getText() + "'";

            statement = connect.createStatement();
            result = statement.executeQuery(checkPhiKhac);

            if (result.next()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Hộ khẩu #" + addMaHoKhauPhiKhac_txt.getText() + "đã tồn tại!");
                alert.showAndWait();
                AddPhiKhacClear();
            } else {
                pst = connect.prepareStatement(insertPhiKhac);
                pst.setString(1, addMaHoKhauPhiKhac_txt.getText());
                pst.setString(2, addMaPhiKhac_txt.getText());
                pst.setString(3, addQuyBienDao_txt.getText());
                pst.setString(4, addQuyKhuyenHoc_txt.getText());
                pst.setString(5, addQuyTuThien_txt.getText());
                pst.setString(6, addTinhTrangPhiKhac_txt.getText());

                pst.executeUpdate();

                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Thông báo");
                alert.setHeaderText(null);
                alert.setContentText("Thêm phí quyên góp thành công");
                alert.showAndWait();

                // UPDATE  TABLEVIEW
                PhiKhacShowListData();
                // TO CLEAR THE FIELDS
                AddPhiKhacClear();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public void AddPhiKhacClear(){
        addMaHoKhauPhiKhac_txt.setText("");
        addMaPhiKhac_txt.setText("");
        addQuyBienDao_txt.setText("");
        addQuyKhuyenHoc_txt.setText("");
        addQuyTuThien_txt.setText("");
        addTinhTrangPhiKhac_txt.setText("");
    }
    
    public void ChangePhiKhacClear(){
        changeMaHoKhauPhiKhac_txt.setText("");
        changeMaPhiKhac_txt.setText("");
        changeQuyBienDao_txt.setText("");
        changeQuyKhuyenHoc_txt.setText("");
        changeQuyTuThien_txt.setText("");
        changeTinhTrangPhiKhac_txt.setText("");
    }

    public void PhiKhacShowListData(){
        
        connect = database.connectDb();
        ObservableList<PhiKhac> listPhiKhac = FXCollections.observableArrayList();
        try {
            pst = connect.prepareStatement("select * from phikhac");
            result = pst.executeQuery(); {
            while(result.next()) {
                PhiKhac phikhac = new PhiKhac(result.getString("maHoGDPhiKhac"), 
                result.getString("maPhiKhac"), 
                result.getDouble("quyBienDao"),
                result.getDouble("quyKhuyenHoc"),
                result.getDouble("quyTuThien"),
                result.getString("tinhTrangPhiKhac"));
                
                listPhiKhac.add(phikhac);
            }
        }
            phiKhac_table.setItems(listPhiKhac);
            
            maHoGDPhiKhac_col.setCellValueFactory(new PropertyValueFactory<>("maHoGDPhiKhac"));
            maPhiKhac_col.setCellValueFactory(new PropertyValueFactory<>("maPhiKhac"));
            quyBienDao_col.setCellValueFactory(new PropertyValueFactory<>("quyBienDao"));
            quyKhuyenHoc_col.setCellValueFactory(new PropertyValueFactory<>("quyKhuyenHoc"));
            quyTuThien_col.setCellValueFactory(new PropertyValueFactory<>("quyTuThien"));
            tinhTrangPhiKhac_col.setCellValueFactory(new PropertyValueFactory<>("tinhTrangPhiKhac"));  
            
        } catch (SQLException ex) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        phiKhac_table.setRowFactory( tv -> {
            TableRow<PhiKhac> phirow = new TableRow<>();
            phirow.setOnMouseClicked (event -> {
                if (event.getClickCount() == 1 && (!phirow.isEmpty())){
                    myPhiKhacIndex = phiKhac_table.getSelectionModel().getSelectedIndex();
                    
                    changeMaHoKhauPhiKhac_txt.setText(phiKhac_table.getItems().get(myPhiKhacIndex).getMaHoGDPhiKhac());
                    changeMaPhiKhac_txt.setText(phiKhac_table.getItems().get(myPhiKhacIndex).getMaPhiKhac());
                    changeQuyBienDao_txt.setText(String.valueOf(phiKhac_table.getItems().get(myPhiKhacIndex).getQuyBienDao()));
                    changeQuyKhuyenHoc_txt.setText(String.valueOf(phiKhac_table.getItems().get(myPhiKhacIndex).getQuyKhuyenHoc()));
                    changeQuyTuThien_txt.setText(String.valueOf(phiKhac_table.getItems().get(myPhiKhacIndex).getQuyTuThien()));
                    changeTinhTrangPhiKhac_txt.setText(phiKhac_table.getItems().get(myPhiKhacIndex).getTinhTrangPhiKhac());
                    
                }
            });
            return phirow;
            
        });

    }
    
    
    //THÔNG TIN PHÍ DỊCH VỤ CHUNG CƯ
    
    @FXML
    void changePhiDichVu(ActionEvent event) throws SQLException {
        
        connect = database.connectDb();
        String changePhiDV = "update phidichvu set MaPhiDichVu = ?, PhiVeSinh = ?, PhiBaoTri = ?, PhiSHC = ?, PhiAnNinh = ?, TinhTrangPhiDichVu = ?"
                + " where MaHoGDPhiDichVu = '" + changeMaHoKhauPhiDichVu_txt.getText() + "'";
        try {
            
            Alert alert;
            
            if (changeMaHoKhauPhiDichVu_txt.getText().isEmpty() 
                    || changeMaPhiDichVu_txt.getText().isEmpty()
                    || changePhiVeSinh_txt.getText().isEmpty()
                    || changePhiBaoTri_txt.getText().isEmpty()
                    || changePhiSHC_txt.getText().isEmpty()
                    || changePhiAnNinh_txt.getText().isEmpty()
                    || changeTinhTrangPhiDichVu_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin!");
            alert.showAndWait();
            PhiDichVuShowListData();
            
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Xác nhận sửa");
                alert.setHeaderText(null);
                alert.setContentText("Bạn có chắc muốn SỬA phí dịch vụ của hộ # " + changeMaHoKhauPhiDichVu_txt.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)){
                    pst = connect.prepareStatement(changePhiDV);
                    pst.setString(1, changeMaPhiDichVu_txt.getText());
                    pst.setString(2, changePhiVeSinh_txt.getText());
                    pst.setString(3, changePhiBaoTri_txt.getText());
                    pst.setString(4, changePhiSHC_txt.getText());
                    pst.setString(5, changePhiAnNinh_txt.getText());
                    pst.setString(6, changeTinhTrangPhiDichVu_txt.getText());
                    pst.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Thông báo sửa phí");
                    alert.setHeaderText(null);
                    alert.setContentText("Sửa phí thành công!");
                    alert.showAndWait();
                    
                    // UPDATE TABLEVIEW
                    PhiDichVuShowListData();
                    //TO CLEAR THE FIELDS
                    ChangePhiDichVuClear();
                }
            }
            } catch (SQLException e){
                e.printStackTrace();
            }
    }
    
    // Thêm thông tin phi cap nhat
    @FXML
    public void addPhiDichVu(ActionEvent event) {
    String insertPhiDV = "insert into phidichvu (MaHoGDPhiDichVu,MaPhiDichVu,PhiVeSinh,PhiBaoTri,PhiSHC,PhiAnNinh,TinhTrangPhiDichVu) values(?,?,?,?,?,?,?)";

    connect = database.connectDb();

    try {
        Alert alert;

        if (addMaHoKhauPhiDichVu_txt.getText().isEmpty()
                || addMaPhiDichVu_txt.getText().isEmpty()
                || addPhiVeSinh_txt.getText().isEmpty()
                || addPhiBaoTri_txt.getText().isEmpty()
                || addPhiSHC_txt.getText().isEmpty()
                || addPhiAnNinh_txt.getText().isEmpty()
                || addTinhTrangPhiDichVu_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin");
            alert.showAndWait();
            PhiDichVuShowListData();

        } else {
            // CHECK IF EXIST
            String checkPhiDV = "select MaHoGDPhiDichVu from phidichvu where MaHoGDPhiDichVu = '"
                    + addMaHoKhauPhiDichVu_txt.getText() + "'";

            statement = connect.createStatement();
            result = statement.executeQuery(checkPhiDV);

            if (result.next()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Hộ khẩu #" + addMaHoKhauPhiDichVu_txt.getText() + "đã tồn tại!");
                alert.showAndWait();
                AddPhiDichVuClear();
            } else {
                pst = connect.prepareStatement(insertPhiDV);
                pst.setString(1, addMaHoKhauPhiDichVu_txt.getText());
                pst.setString(2, addMaPhiDichVu_txt.getText());
                pst.setString(3, addPhiVeSinh_txt.getText());
                pst.setString(4, addPhiBaoTri_txt.getText());
                pst.setString(5, addPhiSHC_txt.getText());
                pst.setString(6, addPhiAnNinh_txt.getText());
                pst.setString(7, addTinhTrangPhiDichVu_txt.getText());

                pst.executeUpdate();

                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Thông báo");
                alert.setHeaderText(null);
                alert.setContentText("Thêm phí dịch vụ thành công");
                alert.showAndWait();

                // UPDATE  TABLEVIEW
                PhiDichVuShowListData();
                // TO CLEAR THE FIELDS
                AddPhiDichVuClear();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public void AddPhiDichVuClear(){
        addMaHoKhauPhiDichVu_txt.setText("");
        addMaPhiDichVu_txt.setText("");
        addPhiVeSinh_txt.setText("");
        addPhiBaoTri_txt.setText("");
        addPhiSHC_txt.setText("");
        addPhiAnNinh_txt.setText("");
        addTinhTrangPhiDichVu_txt.setText("");
    }
    
    public void ChangePhiDichVuClear(){
        changeMaHoKhauPhiDichVu_txt.setText("");
        changeMaPhiDichVu_txt.setText("");
        changePhiVeSinh_txt.setText("");
        changePhiBaoTri_txt.setText("");
        changePhiSHC_txt.setText("");
        changePhiAnNinh_txt.setText("");
        changeTinhTrangPhiDichVu_txt.setText("");
    }

    public void PhiDichVuShowListData(){
        
        connect = database.connectDb();
        ObservableList<PhiDichVu> listPhiDV = FXCollections.observableArrayList();
        try {
            pst = connect.prepareStatement("select * from phidichvu");
            result = pst.executeQuery(); {
            while(result.next()) {
                PhiDichVu phidv = new PhiDichVu(result.getString("maHoGDPhiDichVu"), 
                result.getString("maPhiDichVu"), 
                result.getDouble("phiVeSinh"),
                result.getDouble("phiBaoTri"),
                result.getDouble("phiSHC"),
                result.getDouble("phiAnNinh"),
                result.getString("tinhTrangPhiDichVu"));
                
                listPhiDV.add(phidv);
            }
        }
            phiDichVu_table.setItems(listPhiDV);
            
            maHoGDPhiDichVu_col.setCellValueFactory(new PropertyValueFactory<>("maHoGDPhiDichVu"));
            maPhiDichVu_col.setCellValueFactory(new PropertyValueFactory<>("maPhiDichVu"));
            phiVeSinh_col.setCellValueFactory(new PropertyValueFactory<>("phiVeSinh"));
            phiBaoTri_col.setCellValueFactory(new PropertyValueFactory<>("phiBaoTri"));
            phiSHC_col.setCellValueFactory(new PropertyValueFactory<>("phiSHC"));
            phiAnNinh_col.setCellValueFactory(new PropertyValueFactory<>("phiAnNinh"));
            tinhTrangPhiDichVu_col.setCellValueFactory(new PropertyValueFactory<>("tinhTrangPhiDichVu"));  
            
        } catch (SQLException ex) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        phiDichVu_table.setRowFactory( tv -> {
            TableRow<PhiDichVu> phiDVrow = new TableRow<>();
            phiDVrow.setOnMouseClicked (event -> {
                if (event.getClickCount() == 1 && (!phiDVrow.isEmpty())){
                    myPhiDVIndex = phiDichVu_table.getSelectionModel().getSelectedIndex();
                    
                    changeMaHoKhauPhiDichVu_txt.setText(phiDichVu_table.getItems().get(myPhiDVIndex).getMaHoGDPhiDichVu());
                    changeMaPhiDichVu_txt.setText(phiDichVu_table.getItems().get(myPhiDVIndex).getMaPhiDichVu());
                    changePhiVeSinh_txt.setText(String.valueOf(phiDichVu_table.getItems().get(myPhiDVIndex).getPhiVeSinh()));
                    changePhiBaoTri_txt.setText(String.valueOf(phiDichVu_table.getItems().get(myPhiDVIndex).getPhiBaoTri()));
                    changePhiSHC_txt.setText(String.valueOf(phiDichVu_table.getItems().get(myPhiDVIndex).getPhiSHC()));
                    changePhiAnNinh_txt.setText(String.valueOf(phiDichVu_table.getItems().get(myPhiDVIndex).getPhiAnNinh()));
                    changeTinhTrangPhiDichVu_txt.setText(phiDichVu_table.getItems().get(myPhiDVIndex).getTinhTrangPhiDichVu());
                    
                }
            });
            return phiDVrow;
            
        });

    }
    
 
    //THÔNG TIN PHÍ QUẢN LÝ CHUNG CƯ 

    @FXML
    void changePhiQuanLy(ActionEvent event) throws SQLException {
        
        connect = database.connectDb();
        String changePhiQL = "update phiquanly set MaPhiQuanLy = ?, PhiVanHanh = ?, TinhTrangPhiQuanLy = ?"
                + " where MaHoGDPhiQuanLy = '" + changeMaHoKhauPhiQuanLy_txt.getText() + "'";
        try {
            
            Alert alert;
            
            if (changeMaHoKhauPhiQuanLy_txt.getText().isEmpty() 
                    || changeMaPhiQuanLy_txt.getText().isEmpty()
                    || changePhiVanHanh_txt.getText().isEmpty()
                    || changeTinhTrangPhiQuanLy_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin!");
            alert.showAndWait();
            PhiMoiShowListData();
            
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Xác nhận sửa");
                alert.setHeaderText(null);
                alert.setContentText("Bạn có chắc muốn SỬA phí quản lý của hộ # " + changeMaHoKhauPhiQuanLy_txt.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)){
                    pst = connect.prepareStatement(changePhiQL);
                    pst.setString(1, changeMaPhiQuanLy_txt.getText());
                    pst.setString(2, changePhiVanHanh_txt.getText());
                    pst.setString(3, changeTinhTrangPhiQuanLy_txt.getText());

                    pst.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Thông báo sửa phí");
                    alert.setHeaderText(null);
                    alert.setContentText("Sửa phí thành công!");
                    alert.showAndWait();
                    
                    // UPDATE TABLEVIEW
                    PhiQuanLyShowListData();
                    //TO CLEAR THE FIELDS
                    ChangePhiQuanLyClear();
                }
            }
            } catch (SQLException e){
                e.printStackTrace();
            }
    }
    
    // Thêm thông tin phi cap nhat
    @FXML
    public void addPhiQuanLy(ActionEvent event) {
    String insertPhiQL = "insert into phiquanly (MaHoGDPhiQuanLy,MaPhiQuanLy,PhiVanHanh,TinhTrangPhiQuanLy) values(?,?,?,?)";

    connect = database.connectDb();

    try {
        Alert alert;

        if (addMaHoKhauPhiQuanLy_txt.getText().isEmpty()
                || addMaPhiQuanLy_txt.getText().isEmpty()
                || addPhiVanHanh_txt.getText().isEmpty()
                || addTinhTrangPhiQuanLy_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin");
            alert.showAndWait();
            PhiMoiShowListData();

        } else {
            // CHECK IF EXIST
            String checkPhiQL = "select MaHoGDPhiQuanLy from phiquanly where MaHoGDPhiQuanLy = '"
                    + addMaHoKhauPhiQuanLy_txt.getText() + "'";

            statement = connect.createStatement();
            result = statement.executeQuery(checkPhiQL);

            if (result.next()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Hộ khẩu #" + addMaHoKhauPhiQuanLy_txt.getText() + "đã tồn tại!");
                alert.showAndWait();
                AddPhiMoiClear();
            } else {
                pst = connect.prepareStatement(insertPhiQL);
                pst.setString(1, addMaHoKhauPhiQuanLy_txt.getText());
                pst.setString(2, addMaPhiQuanLy_txt.getText());
                pst.setString(3, addPhiVanHanh_txt.getText());
                pst.setString(4, addTinhTrangPhiQuanLy_txt.getText());

                pst.executeUpdate();

                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Thông báo");
                alert.setHeaderText(null);
                alert.setContentText("Thêm phí quản lý thành công");
                alert.showAndWait();

                // UPDATE  TABLEVIEW
                PhiQuanLyShowListData();
                // TO CLEAR THE FIELDS
                AddPhiQuanLyClear();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public void AddPhiQuanLyClear(){
        addMaHoKhauPhiQuanLy_txt.setText("");
        addMaPhiQuanLy_txt.setText("");
        addPhiVanHanh_txt.setText("");
        addTinhTrangPhiQuanLy_txt.setText("");
    }
    
    public void ChangePhiQuanLyClear(){
        changeMaHoKhauPhiQuanLy_txt.setText("");
        changeMaPhiQuanLy_txt.setText("");
        changePhiVanHanh_txt.setText("");
        changeTinhTrangPhiQuanLy_txt.setText("");
    }

    public void PhiQuanLyShowListData(){
        
        connect = database.connectDb();
        ObservableList<PhiQuanLy> listPhiQuanLy = FXCollections.observableArrayList();
        try {
            pst = connect.prepareStatement("select * from phiquanly");
            result = pst.executeQuery(); {
            while(result.next()) {
                PhiQuanLy phiquanly = new PhiQuanLy(result.getString("maHoGDPhiQuanLy"), 
                result.getString("maPhiQuanLy"), 
                result.getDouble("phiVanHanh"),
                result.getString("tinhTrangPhiQuanLy"));
                
                listPhiQuanLy.add(phiquanly);
            }
        }
            phiQuanLy_table.setItems(listPhiQuanLy);
            
            maHoGDPhiQuanLy_col.setCellValueFactory(new PropertyValueFactory<>("maHoGDPhiQuanLy"));
            maPhiQuanLy_col.setCellValueFactory(new PropertyValueFactory<>("maPhiQuanLy"));
            phiVanHanh_col.setCellValueFactory(new PropertyValueFactory<>("phiVanHanh"));
            tinhTrangPhiQuanLy_col.setCellValueFactory(new PropertyValueFactory<>("tinhTrangPhiQuanLy"));  
            
        } catch (SQLException ex) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        phiQuanLy_table.setRowFactory( tv -> {
            TableRow<PhiQuanLy> phiQLrow = new TableRow<>();
            phiQLrow.setOnMouseClicked (event -> {
                if (event.getClickCount() == 1 && (!phiQLrow.isEmpty())){
                    myPhiQLIndex = phiQuanLy_table.getSelectionModel().getSelectedIndex();
                    
                    changeMaHoKhauPhiQuanLy_txt.setText(phiQuanLy_table.getItems().get(myPhiQLIndex).getMaHoGDPhiQuanLy());
                    changeMaPhiQuanLy_txt.setText(phiQuanLy_table.getItems().get(myPhiQLIndex).getMaPhiQuanLy());
                    changePhiVanHanh_txt.setText(String.valueOf(phiQuanLy_table.getItems().get(myPhiQLIndex).getPhiVanHanh()));
                    changeTinhTrangPhiQuanLy_txt.setText(phiQuanLy_table.getItems().get(myPhiQLIndex).getTinhTrangPhiQuanLy());
                    
                }
            });
            return phiQLrow;
            
        });
//        searchPhiQL_txt.textProperty().addListener((observable, oldValue, newValue) -> {
//        filterPhiMoiList(newValue);
//    });
    }
    
    //Tìm kiếm Phi Moi
    private void filterPhiQLList(String phimoisearchword) {
        connect = database.connectDb();
        ObservableList<PhiQuanLy> filteredList = FXCollections.observableArrayList();

        try {
            pst = connect.prepareStatement("select * from phiquanly");
            result = pst.executeQuery();
            while (result.next()) {
                PhiQuanLy phiquanly;
                phiquanly = new PhiQuanLy(
                        result.getString("maHoGDPhiQuanLy"),
                        result.getString("maPhiQuanLy"),
                        result.getDouble("phiVanHanh"),
                        result.getString("tinhTrangPhiMoi")
                );

                // Check if any field contains the keyword
//                if (phiquanly.getMaHoGDPhiQuanLy().toLowerCase().contains(phimoisearchword.toLowerCase())
//                        || String.valueOf(phiquanly.getPhiGuiXe()).toLowerCase().contains(phimoisearchword.toLowerCase())
//                        || String.valueOf(phimoi.getPhiDien()).toLowerCase().contains(phimoisearchword.toLowerCase())
//                        || String.valueOf(phimoi.getPhiNuoc()).toLowerCase().contains(phimoisearchword.toLowerCase())
//                        || String.valueOf(phimoi.getPhiInternet()).toLowerCase().contains(phimoisearchword.toLowerCase())
//                        || phimoi.getTinhTrangPhiMoi().toLowerCase().contains(phimoisearchword.toLowerCase())) {
//                    filteredList.add(phimoi);
//                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the SQLException appropriately, e.g., log or show an error message.
        }
    }
    
    
    // THÔNG TIN PHÍ CẬP NHẬT MỚI (VERSION 2)
    
    // Sửa đổi thông tin phi cap nhat
    @FXML
    void changePhiMoi(ActionEvent event) throws SQLException {
        
        connect = database.connectDb();
        String changePhiMoi = "update phimoi set PhiGuiXe = ?, PhiDien = ?, PhiNuoc = ?, PhiInternet = ?, TinhTrangPhiMoi = ?"
                + " where MaHoGDPhiMoi = '" + changeMaHoPhiMoi_txt.getText() + "'";
        try {
            
            Alert alert;
            
            if (changeMaHoPhiMoi_txt.getText().isEmpty() 
                    || changePhiGuiXe_txt.getText().isEmpty()
                    || changePhiDien_txt.getText().isEmpty()
                    || changePhiNuoc_txt.getText().isEmpty()
                    || changePhiInternet_txt.getText().isEmpty()
                    || changeTinhTrangPhiMoi_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin!");
            alert.showAndWait();
            PhiMoiShowListData();
            
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Xác nhận sửa");
                alert.setHeaderText(null);
                alert.setContentText("Bạn có chắc muốn SỬA phí cập nhật của hộ # " + changeMaHoPhiMoi_txt.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)){
                    pst = connect.prepareStatement(changePhiMoi);
                    pst.setString(1, changePhiGuiXe_txt.getText());
                    pst.setString(2, changePhiDien_txt.getText());
                    pst.setString(3, changePhiNuoc_txt.getText());
                    pst.setString(4, changePhiInternet_txt.getText());
                    pst.setString(5, changeTinhTrangPhiMoi_txt.getText());

                    pst.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Thông báo sửa phí");
                    alert.setHeaderText(null);
                    alert.setContentText("Sửa phí thành công!");
                    alert.showAndWait();
                    
                    // UPDATE TABLEVIEW
                    PhiMoiShowListData();
                    //TO CLEAR THE FIELDS
                    ChangePhiMoiClear();
                }
            }
            } catch (SQLException e){
                e.printStackTrace();
            }
    }
    
    // Xoa Phi cap nhat moi
    @FXML
    void deletePhiMoi(ActionEvent event) {
        connect = database.connectDb();
        PhiMoi selectedPhiMoiRow = phiMoi_table.getSelectionModel().getSelectedItem();
        
        try {
        if (selectedPhiMoiRow != null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Xác nhận xóa");
            alert.setHeaderText("");
            alert.setContentText("Bạn có muốn XÓA phí của hộ này?");

            ButtonType rs = alert.showAndWait().orElse(ButtonType.CANCEL);

            if (rs == ButtonType.OK) {
                pst = connect.prepareStatement("delete from phimoi where MaHoGDPhiMoi = ?");
                pst.setString(1, selectedPhiMoiRow.getMaHoGDPhiMoi());
                int rowsAffected = pst.executeUpdate();
                
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Thông báo");
                alert.setHeaderText(null);
                alert.setContentText("Xóa chi phí thành công");
                
                if (rowsAffected > 0) {
                    phiMoi_table.getItems().remove(selectedPhiMoiRow);
                }
                
                ChangePhiMoiClear();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText("Không có hộ nào được chọn!");
            alert.setContentText("Hãy chọn hộ muốn XÓA phí!");
            alert.showAndWait();
            PhiMoiShowListData();

        }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    // Thêm thông tin phi cap nhat
    public void addPhiMoi(ActionEvent event) {
    String insertPhiMoi = "insert into phimoi (MaHoGDPhiMoi,PhiGuiXe,PhiDien,PhiNuoc,PhiInternet,TinhTrangPhiMoi) values(?,?,?,?,?,?)";

    connect = database.connectDb();

    try {
        Alert alert;

        if (addMaHoPhiMoi_txt.getText().isEmpty()
                || addPhiGuiXe_txt.getText().isEmpty()
                || addPhiDien_txt.getText().isEmpty()
                || addPhiNuoc_txt.getText().isEmpty()
                || addPhiInternet_txt.getText().isEmpty()
                || addTinhTrangPhiMoi_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin");
            alert.showAndWait();
            PhiMoiShowListData();

        } else {
            // CHECK IF EXIST
            String checkPhiMoi = "select MaHoGDPhiMoi from phimoi where MaHoGDPhiMoi = '"
                    + addMaHoPhiMoi_txt.getText() + "'";

            statement = connect.createStatement();
            result = statement.executeQuery(checkPhiMoi);

            if (result.next()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Hộ khẩu #" + addMaHoPhiMoi_txt.getText() + "đã tồn tại!");
                alert.showAndWait();
                AddPhiMoiClear();
            } else {
                pst = connect.prepareStatement(insertPhiMoi);
                pst.setString(1, addMaHoPhiMoi_txt.getText());
                pst.setString(2, addPhiGuiXe_txt.getText());
                pst.setString(3, addPhiDien_txt.getText());
                pst.setString(4, addPhiNuoc_txt.getText());
                pst.setString(5, addPhiInternet_txt.getText());
                pst.setString(6, addTinhTrangPhiMoi_txt.getText());

                pst.executeUpdate();

                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Thông báo");
                alert.setHeaderText(null);
                alert.setContentText("Thêm chi phí thành công");
                alert.showAndWait();

                // UPDATE  TABLEVIEW
                PhiMoiShowListData();
                // TO CLEAR THE FIELDS
                AddPhiMoiClear();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public void AddPhiMoiClear(){
        addMaHoPhiMoi_txt.setText("");
        addPhiGuiXe_txt.setText("");
        addPhiDien_txt.setText("");
        addPhiNuoc_txt.setText("");
        addPhiInternet_txt.setText("");
        addTinhTrangPhiMoi_txt.setText("");
    }
    
    public void ChangePhiMoiClear(){
        changeMaHoPhiMoi_txt.setText("");
        changePhiGuiXe_txt.setText("");
        changePhiDien_txt.setText("");
        changePhiNuoc_txt.setText("");
        changePhiInternet_txt.setText("");
        changeTinhTrangPhiMoi_txt.setText("");
    }

    public void PhiMoiShowListData(){
        
        connect = database.connectDb();
        ObservableList<PhiMoi> listPhiMoi = FXCollections.observableArrayList();
        try {
            pst = connect.prepareStatement("select * from phimoi");
            result = pst.executeQuery(); {
            while(result.next()) {
                PhiMoi phimoi = new PhiMoi(result.getString("maHoGDPhiMoi"), 
                result.getDouble("phiGuiXe"), 
                result.getDouble("phiDien"),
                result.getDouble("phiNuoc"), 
                result.getDouble("phiInternet"),
                result.getString("tinhTrangPhiMoi"));
                
                listPhiMoi.add(phimoi);
            }
        }
            phiMoi_table.setItems(listPhiMoi);
            
            maHoGDPhiMoi_col.setCellValueFactory(new PropertyValueFactory<>("maHoGDPhiMoi"));
            phiGuiXe_col.setCellValueFactory(new PropertyValueFactory<>("phiGuiXe"));
            phiDien_col.setCellValueFactory(new PropertyValueFactory<>("phiDien"));
            phiNuoc_col.setCellValueFactory(new PropertyValueFactory<>("phiNuoc"));
            phiInternet_col.setCellValueFactory(new PropertyValueFactory<>("phiInternet"));
            tinhTrangPhiMoi_col.setCellValueFactory(new PropertyValueFactory<>("tinhTrangPhiMoi"));  
            
        } catch (SQLException ex) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        phiMoi_table.setRowFactory( tv -> {
            TableRow<PhiMoi> phiMoirow = new TableRow<>();
            phiMoirow.setOnMouseClicked (event -> {
                if (event.getClickCount() == 1 && (!phiMoirow.isEmpty())){
                    myPhiMoiIndex = phiMoi_table.getSelectionModel().getSelectedIndex();
                    
                    changeMaHoPhiMoi_txt.setText(phiMoi_table.getItems().get(myPhiMoiIndex).getMaHoGDPhiMoi());
                    changePhiGuiXe_txt.setText(String.valueOf(phiMoi_table.getItems().get(myPhiMoiIndex).getPhiGuiXe()));
                    changePhiDien_txt.setText(String.valueOf(phiMoi_table.getItems().get(myPhiMoiIndex).getPhiDien()));
                    changePhiNuoc_txt.setText(String.valueOf(phiMoi_table.getItems().get(myPhiMoiIndex).getPhiNuoc()));
                    changePhiInternet_txt.setText(String.valueOf(phiMoi_table.getItems().get(myPhiMoiIndex).getPhiInternet()));
                    changeTinhTrangPhiMoi_txt.setText(phiMoi_table.getItems().get(myPhiMoiIndex).getTinhTrangPhiMoi());
                    
                }
            });
            return phiMoirow;
            
        });
        searchPhiMoi_txt.textProperty().addListener((observable, oldValue, newValue) -> {
        filterPhiMoiList(newValue);
    });
    }
    
    //Tìm kiếm Phi Moi
    private void filterPhiMoiList(String phimoisearchword) {
        connect = database.connectDb();
        ObservableList<PhiMoi> filteredList = FXCollections.observableArrayList();

        try {
            pst = connect.prepareStatement("select * from phimoi");
            result = pst.executeQuery();
            while (result.next()) {
                PhiMoi phimoi;
                phimoi = new PhiMoi(
                        result.getString("maHoGDPhiMoi"),
                        result.getDouble("phiGuiXe"),
                        result.getDouble("phiDien"),
                        result.getDouble("phiNuoc"),
                        result.getDouble("phiInternet"),
                        result.getString("tinhTrangPhiMoi")
                );

                // Check if any field contains the keyword
                if (phimoi.getMaHoGDPhiMoi().toLowerCase().contains(phimoisearchword.toLowerCase())
                        || String.valueOf(phimoi.getPhiGuiXe()).toLowerCase().contains(phimoisearchword.toLowerCase())
                        || String.valueOf(phimoi.getPhiDien()).toLowerCase().contains(phimoisearchword.toLowerCase())
                        || String.valueOf(phimoi.getPhiNuoc()).toLowerCase().contains(phimoisearchword.toLowerCase())
                        || String.valueOf(phimoi.getPhiInternet()).toLowerCase().contains(phimoisearchword.toLowerCase())
                        || phimoi.getTinhTrangPhiMoi().toLowerCase().contains(phimoisearchword.toLowerCase())) {
                    filteredList.add(phimoi);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the SQLException appropriately, e.g., log or show an error message.
        }
    }

    
    // THÔNG TIN NHÂN KHẨU TỪ ĐÂY
    //////////////////////////
    // Tìm kiếm nhân khẩu
    @FXML
    void searchNhanKhau(ActionEvent event) {

    }

    // Sửa đổi thông tin nhân khẩu
    @FXML
    void changeNhanKhau(ActionEvent event) throws SQLException {
        
        connect = database.connectDb();
        String changeNhanKhau = "update nhankhau set HoTenNhanKhau = ?, SoCCCD = ?, GioiTinhNhanKhau = ?, NgaySinhNhanKhau = ?, QuanHeChuHo = ?"
                + " where MaNhanKhau = '" + changeMaNhanKhau_txt.getText() + "'";
        try {
            suaNhanKhau_form.setVisible(true);
            
            Alert alert;
            
            if (changeMaNhanKhau_txt.getText().isEmpty() 
                    || changeTenNhanKhau_txt.getText().isEmpty()
                    || changeCCCD_txt.getText().isEmpty()
                    || changeGioiTinhNhanKhau_txt.getText().isEmpty()
                    || changeNgaySinhNhanKhau_txt.getValue() == null
                    || changeQuanHeChuHo_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin!");
            alert.showAndWait();
            NhanKhauShowListData();
            
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Xác nhận sửa");
                alert.setHeaderText(null);
                alert.setContentText("Bạn có chắc muốn SỬA nhân khẩu # " + changeMaNhanKhau_txt.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)){
                    pst = connect.prepareStatement(changeNhanKhau);
                    pst.setString(1, changeTenNhanKhau_txt.getText());
                    pst.setString(2, changeCCCD_txt.getText());
                    pst.setString(3, changeGioiTinhNhanKhau_txt.getText());
                    pst.setString(4, String.valueOf(changeNgaySinhNhanKhau_txt.getValue()));
                    pst.setString(5, changeQuanHeChuHo_txt.getText());

                    pst.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Thông báo sửa nhân khẩu");
                    alert.setHeaderText(null);
                    alert.setContentText("Sửa nhân khẩu thành công!");
                    alert.showAndWait();
                    
                    // UPDATE QTV TABLEVIEW
                    NhanKhauShowListData();
                    //TO CLEAR THE FIELDS
                    ChangeNhanKhauClear();
                }
            }
            } catch (SQLException e){
                e.printStackTrace();
            }
    }
    
    // Xoa nhan khau
    @FXML
    void deleteNhanKhau(ActionEvent event) {
        connect = database.connectDb();
        NhanKhau selectedNhanKhauRow = nhanKhau_table.getSelectionModel().getSelectedItem();
        
        try {
        if (selectedNhanKhauRow != null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Xác nhận xóa");
            alert.setHeaderText("");
            alert.setContentText("Bạn có muốn XÓA nhân khẩu này?");

            ButtonType rs = alert.showAndWait().orElse(ButtonType.CANCEL);

            if (rs == ButtonType.OK) {
                pst = connect.prepareStatement("delete from nhankhau where MaNhanKhau = ?");
                pst.setString(1, selectedNhanKhauRow.getMaNhanKhau());
                int rowsAffected = pst.executeUpdate();
                
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Thông báo");
                alert.setHeaderText(null);
                alert.setContentText("Xóa nhân khẩu thành công");
                
                if (rowsAffected > 0) {
                    nhanKhau_table.getItems().remove(selectedNhanKhauRow);
                }
                
                ChangeNhanKhauClear();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText("Không có nhân khẩu nào được chọn!");
            alert.setContentText("Hãy chọn nhân khẩu muốn XÓA!");
            alert.showAndWait();
            NhanKhauShowListData();

        }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    // Thêm thông tin nhân khẩu
    public void addNhanKhau(MouseEvent event) {
    String insertNhanKhau = "insert into nhankhau (MaNhanKhau,HoTenNhanKhau,SoCCCD,GioiTinhNhanKhau,NgaySinhNhanKhau,QuanHeChuHo) values(?,?,?,?,?,?)";

    connect = database.connectDb();

    try {
        themNhanKhau_form.setVisible(true);
        Alert alert;

        if (addMaNhanKhau_txt.getText().isEmpty()
                || addTenNhanKhau_txt.getText().isEmpty()
                || addCCCD_txt.getText().isEmpty()
                || addGioiTinhNhanKhau_txt.getText().isEmpty()
                || addNgaySinhNhanKhau_txt.getValue() == null
                || addQuanHeChuHo_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin");
            alert.showAndWait();
            HoKhauShowListData();

        } else {
            // CHECK IF NhanKhau IS EXIST
            String checkNhanKhau = "select MaNhanKhau from nhankhau where MaNhanKhau = '"
                    + addMaNhanKhau_txt.getText() + "'";

            statement = connect.createStatement();
            result = statement.executeQuery(checkNhanKhau);

            if (result.next()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Nhân khẩu #" + addMaNhanKhau_txt.getText() + "đã tồn tại!");
                alert.showAndWait();
                AddHoKhauClear();
            } else {
                pst = connect.prepareStatement(insertNhanKhau);
                pst.setString(1, addMaNhanKhau_txt.getText());
                pst.setString(2, addTenNhanKhau_txt.getText());
                pst.setString(3, addCCCD_txt.getText());
                pst.setString(4, addGioiTinhNhanKhau_txt.getText());
                pst.setString(5, String.valueOf(addNgaySinhNhanKhau_txt.getValue()));
                pst.setString(6, addQuanHeChuHo_txt.getText());

                pst.executeUpdate();

                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Thông báo");
                alert.setHeaderText(null);
                alert.setContentText("Thêm nhân khẩu thành công");
                alert.showAndWait();

                // UPDATE NhanKhau TABLEVIEW
                NhanKhauShowListData();
                // TO CLEAR THE FIELDS
                AddNhanKhauClear();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    
    public void ChangeNhanKhauClear(){
        changeMaNhanKhau_txt.setText("");
        changeTenNhanKhau_txt.setText("");    
        changeCCCD_txt.setText("");
        changeGioiTinhNhanKhau_txt.setText("");
        changeNgaySinhNhanKhau_txt.setValue(null);
        changeQuanHeChuHo_txt.setText("");

    }
    
    public void AddNhanKhauClear(){
        addMaNhanKhau_txt.setText("");
        addTenNhanKhau_txt.setText("");
        addCCCD_txt.setText("");
        addGioiTinhNhanKhau_txt.setText("");
        addNgaySinhNhanKhau_txt.setValue(null);
        addQuanHeChuHo_txt.setText("");
    }
    
    //Tim kiem nhan khau
    private void filterNhanKhauList(String nksearchword) {
    connect = database.connectDb();
    ObservableList<NhanKhau> filteredList = FXCollections.observableArrayList();

    try {
        pst = connect.prepareStatement("select * from nhankhau");
        result = pst.executeQuery();
        while (result.next()) {
            NhanKhau nk = new NhanKhau(result.getString("maNhanKhau"),
                    result.getString("hoTenNhanKhau"),
                    result.getString("soCCCD"),
                    result.getString("gioiTinhNhanKhau"),                    
                    result.getDate("ngaySinhNhanKhau"),
                    result.getString("quanHeChuHo"));


            // Check if any field contains the keyword
            if (nk.getMaNhanKhau().toLowerCase().contains(nksearchword.toLowerCase())
                    || nk.getHoTenNhanKhau().toLowerCase().contains(nksearchword.toLowerCase())
                    || nk.getSoCCCD().toLowerCase().contains(nksearchword.toLowerCase())
                    || nk.getGioiTinhNhanKhau().toLowerCase().contains(nksearchword.toLowerCase())
                    || nk.getQuanHeChuHo().toLowerCase().contains(nksearchword.toLowerCase())) {
                filteredList.add(nk);
            }
        }

        nhanKhau_table.setItems(filteredList);
    } catch (SQLException ex) {
        Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    // Show NhanKhau
    public void NhanKhauShowListData(){
        
        connect = database.connectDb();
        ObservableList<NhanKhau> listNhanKhau = FXCollections.observableArrayList();
        try {
            pst = connect.prepareStatement("select * from nhankhau");
            result = pst.executeQuery(); {
            while(result.next()) {
                NhanKhau nhankhau = new NhanKhau(result.getString("maNhanKhau"), 
                result.getString("hoTenNhanKhau"), 
                result.getString("soCCCD"),
                result.getString("gioiTinhNhanKhau"),
                result.getDate("ngaySinhNhanKhau"), 
                result.getString("quanHeChuHo"));
                
                listNhanKhau.add(nhankhau);
            }
        }
            nhanKhau_table.setItems(listNhanKhau);
            
            maNhanKhau_col.setCellValueFactory(new PropertyValueFactory<>("maNhanKhau"));
            tenNhanKhau_col.setCellValueFactory(new PropertyValueFactory<>("hoTenNhanKhau"));
            cccd_col.setCellValueFactory(new PropertyValueFactory<>("soCCCD"));
            gioiTinhNhanKhau_col.setCellValueFactory(new PropertyValueFactory<>("gioiTinhNhanKhau" ));
            ngaySinhNhanKhau_col.setCellValueFactory(new PropertyValueFactory<>("ngaySinhNhanKhau"));
            quanHeChuHo_col.setCellValueFactory(new PropertyValueFactory<>("quanHeChuHo"));  
            
        } catch (SQLException ex) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        nhanKhau_table.setRowFactory( tv -> {
            TableRow<NhanKhau> NhanKhaurow = new TableRow<>();
            NhanKhaurow.setOnMouseClicked (event -> {
                if (event.getClickCount() == 1 && (!NhanKhaurow.isEmpty())){
                    myNhanKhauIndex = nhanKhau_table.getSelectionModel().getSelectedIndex();
                    
                    changeMaNhanKhau_txt.setText(nhanKhau_table.getItems().get(myNhanKhauIndex).getMaNhanKhau());
                    changeTenNhanKhau_txt.setText(nhanKhau_table.getItems().get(myNhanKhauIndex).getHoTenNhanKhau());
                    changeCCCD_txt.setText(nhanKhau_table.getItems().get(myNhanKhauIndex).getSoCCCD());
                    changeGioiTinhNhanKhau_txt.setText(nhanKhau_table.getItems().get(myNhanKhauIndex).getGioiTinhNhanKhau());
                    changeNgaySinhNhanKhau_txt.setValue(LocalDate.parse(String.valueOf(nhanKhau_table.getItems().get(myNhanKhauIndex).getNgaySinhNhanKhau())));
                    changeQuanHeChuHo_txt.setText(nhanKhau_table.getItems().get(myNhanKhauIndex).getQuanHeChuHo());

                }
            });
            return NhanKhaurow;
            
        });
        searchNhanKhau_txt.textProperty().addListener((observable, oldValue, newValue) -> {
        filterNhanKhauList(newValue);
    });
    }
         
    
    // THÔNG TIN HỘ KHẨU TỪ ĐÂY
    
    // THAY ĐỔI THÔNG TIN HỘ KHẨU
    @FXML
    void changeHoKhau(ActionEvent event) throws SQLException {
        
        connect = database.connectDb();
        String changeHoKhau = "update hokhau set TenChuHo = ?, DiaChiHoKhau = ?, DienTich = ?, ChatLuongChungCu = ?, NgaySua = ?"
                + " where MaHoKhau = '" + changeMaHoKhau_txt.getText() + "'";
        try {
            suaHoKhau_form.setVisible(true);
            
            Alert alert;
            
            if (changeMaHoKhau_txt.getText().isEmpty() 
                    || changeTenChuHo_txt.getText().isEmpty()
                    || changeDiaChiHoKhau_txt.getText().isEmpty()
                    || changeDienTich_txt.getText().isEmpty()
                    || changeChatLuongChungCu_txt.getText().isEmpty()
                    || changeNgaySuaHoKhau_txt.getValue() == null) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin!");
            alert.showAndWait();
            HoKhauShowListData();
            
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Xác nhận sửa");
                alert.setHeaderText(null);
                alert.setContentText("Bạn có chắc muốn SỬA hộ khẩu # " + changeMaHoKhau_txt.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)){
                    pst = connect.prepareStatement(changeHoKhau);
                    pst.setString(1, changeTenChuHo_txt.getText());
                    pst.setString(2, changeDiaChiHoKhau_txt.getText());
                    pst.setString(3, changeDienTich_txt.getText());
                    pst.setString(4, changeChatLuongChungCu_txt.getText());
                    pst.setString(5, String.valueOf(changeNgaySuaHoKhau_txt.getValue()));

                    pst.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Thông báo sửa hộ khẩu");
                    alert.setHeaderText(null);
                    alert.setContentText("Sửa hộ khẩu thành công!");
                    alert.showAndWait();
                    
                    // UPDATE QTV TABLEVIEW
                    HoKhauShowListData();
                    //TO CLEAR THE FIELDS
                    ChangeHoKhauClear();
                }
            }
            } catch (SQLException e){
                e.printStackTrace();
            }
    }
    
    @FXML
    void deleteHoKhau(ActionEvent event) {
        
        connect = database.connectDb();
        HoKhau selectedHoKhauRow = hoKhau_table.getSelectionModel().getSelectedItem();
        
        try {
        if (selectedHoKhauRow != null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Xác nhận xóa");
            alert.setHeaderText("");
            alert.setContentText("Bạn có muốn XÓA hộ khẩu này?");

            ButtonType rs = alert.showAndWait().orElse(ButtonType.CANCEL);

            if (rs == ButtonType.OK) {
                pst = connect.prepareStatement("delete from hokhau where MaHoKhau = ?");
                pst.setString(1, selectedHoKhauRow.getMaHoKhau());
                int rowsAffected = pst.executeUpdate();
                
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Thông báo");
                alert.setHeaderText(null);
                alert.setContentText("Xóa hộ khẩu thành công");
                
                if (rowsAffected > 0) {
                    hoKhau_table.getItems().remove(selectedHoKhauRow);
                }
                
                ChangeHoKhauClear();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText("Không có hộ khẩu nào được chọn!");
            alert.setContentText("Hãy chọn hộ khẩu muốn XÓA!");
            alert.showAndWait();
            HoKhauShowListData();

        }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    @FXML
    void addHoKhau(MouseEvent event) {
        String insertHoKhau = "insert into hokhau (MaHoKhau,TenChuHo,DiaChiHoKhau,DienTich,ChatLuongChungCu,NgayTao) values(?,?,?,?,?,?)";
        
        connect = database.connectDb();
        
        try {
            themHoKhau_form.setVisible(true);
            Alert alert;
            
            if (addMaHoKhau_txt.getText().isEmpty() 
                    || addTenChuHo_txt.getText().isEmpty()
                    || addDiaChiHoKhau_txt.getText().isEmpty()
                    || addDienTich_txt.getText().isEmpty()
                    || addChatLuongChungCu_txt.getText().isEmpty()
                    || addNgayTaoHoKhau_txt.getValue() == null){
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin");
            alert.showAndWait();
            HoKhauShowListData();
            
            } else {
                //CHECK IF HoKhau IS EXIST
                String checkHoKhau = "select MaHoKhau from hokhau where MaHoKhau = '" 
                        + addMaHoKhau_txt.getText() + "'";
                
                statement = connect.createStatement();
                result = statement.executeQuery(checkHoKhau);
                
                
                if (result.next()){
                   alert = new Alert(AlertType.ERROR);
                   alert.setTitle("Báo lỗi");
                   alert.setHeaderText(null);
                   alert.setContentText("Hộ khẩu #" + addMaHoKhau_txt.getText() + "đã tồn tại!");
                   alert.showAndWait();
                   AddHoKhauClear();
                } else {
                    pst = connect.prepareStatement(insertHoKhau);
                    pst.setString(1, addMaHoKhau_txt.getText());
                    pst.setString(2, addTenChuHo_txt.getText());
                    pst.setString(3, addDiaChiHoKhau_txt.getText());
                    pst.setString(4, addDienTich_txt.getText());
                    pst.setString(5, addChatLuongChungCu_txt.getText());
                    pst.setString(6, String.valueOf(addNgayTaoHoKhau_txt.getValue()));
                    
                    pst.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Thông báo");
                    alert.setHeaderText(null);
                    alert.setContentText("Thêm hộ khẩu thành công");
                    alert.showAndWait();
                    
                    // UPDATE QTV TABLEVIEW
                    HoKhauShowListData();
                    //TO CLEAR THE FIELDS
                    AddHoKhauClear();
                }
            }
        } catch (SQLException e){
        }

    }
    
    
    public void AddHoKhauClear(){
        addMaHoKhau_txt.setText("");
        addTenChuHo_txt.setText("");
        addDiaChiHoKhau_txt.setText("");
        addDienTich_txt.setText("");
        addChatLuongChungCu_txt.setText("");
        addNgayTaoHoKhau_txt.setValue(null);
    }
    
    public void ChangeHoKhauClear(){
        changeMaHoKhau_txt.setText("");
        changeTenChuHo_txt.setText("");
        changeDiaChiHoKhau_txt.setText("");
        changeDienTich_txt.setText("");
        changeChatLuongChungCu_txt.setText("");
        changeNgaySuaHoKhau_txt.setValue(null);
    }
    
    public void HoKhauShowListData(){
        
        connect = database.connectDb();
        ObservableList<HoKhau> listHoKhau = FXCollections.observableArrayList();
        try {
            pst = connect.prepareStatement("select * from hokhau");
            result = pst.executeQuery(); {
            while(result.next()) {
                HoKhau hokhau = new HoKhau(result.getString("maHoKhau"), 
                result.getString("tenChuHo"), 
                result.getString("diaChiHoKhau"),
                result.getDouble("dienTich"), 
                result.getString("chatLuongChungCu"),
                result.getDate("ngayTao"), 
                result.getDate("ngaySua"));
                
                listHoKhau.add(hokhau);
            }
        }
            hoKhau_table.setItems(listHoKhau);
            
            maHoKhau_col.setCellValueFactory(new PropertyValueFactory<>("maHoKhau"));
            tenChuHo_col.setCellValueFactory(new PropertyValueFactory<>("tenChuHo"));
            diaChiHoKhau_col.setCellValueFactory(new PropertyValueFactory<>("diaChiHoKhau"));
            dienTich_col.setCellValueFactory(new PropertyValueFactory<>("dienTich"));
            chatLuongChungCu_col.setCellValueFactory(new PropertyValueFactory<>("chatLuongChungCu"));
            ngayTaoHoKhau_col.setCellValueFactory(new PropertyValueFactory<>("ngayTao"));  
            ngaySuaHoKhau_col.setCellValueFactory(new PropertyValueFactory<>("ngaySua"));
            
        } catch (SQLException ex) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        hoKhau_table.setRowFactory( tv -> {
            TableRow<HoKhau> HoKhaurow = new TableRow<>();
            HoKhaurow.setOnMouseClicked (event -> {
                if (event.getClickCount() == 1 && (!HoKhaurow.isEmpty())){
                    myHoKhauIndex = hoKhau_table.getSelectionModel().getSelectedIndex();
                    
                    changeMaHoKhau_txt.setText(hoKhau_table.getItems().get(myHoKhauIndex).getMaHoKhau());
                    changeTenChuHo_txt.setText(hoKhau_table.getItems().get(myHoKhauIndex).getTenChuHo());
                    changeDiaChiHoKhau_txt.setText(hoKhau_table.getItems().get(myHoKhauIndex).getDiaChiHoKhau());
                    changeDienTich_txt.setText(String.valueOf(hoKhau_table.getItems().get(myHoKhauIndex).getDienTich()));
                    changeChatLuongChungCu_txt.setText(hoKhau_table.getItems().get(myHoKhauIndex).getChatLuongChungCu());
                    changeNgaySuaHoKhau_txt.setValue(LocalDate.parse(String.valueOf(hoKhau_table.getItems().get(myHoKhauIndex).getNgaySua())));
                    
                }
            });
            return HoKhaurow;
            
        });
    }
    
    
    // THAY ĐỔI THÔNG TIN QUẢN TRỊ VIÊN
    @FXML
    void changeQTV(ActionEvent event) throws SQLException {
        
        connect = database.connectDb();
        String changeQTV = "update quantrivien set HoTen = ?, GioiTinh = ?, NgaySinh = ?, SDT = ?, Email = ?, DiaChi = ?"
                + " where MaQTV = '" + maQTV_txt.getText() + "'";
        try {
            Alert alert;
            
            if (maQTV_txt.getText().isEmpty() 
                    || hoTenQTV_txt.getText().isEmpty()
                    || gioiTinhQTV_txt.getText().isEmpty()
                    || ngaySinhQTV_txt.getValue() == null
                    || sdtQTV_txt.getText().isEmpty()
                    || emailQTV_txt.getText().isEmpty()
                    || diaChiQTV_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin!");
            alert.showAndWait();
            QTVShowListData();
            
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Xác nhận sửa");
                alert.setHeaderText(null);
                alert.setContentText("Bạn có chắc muốn SỬA quản trị viên # " + maQTV_txt.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)){
                    pst = connect.prepareStatement(changeQTV);
                    pst.setString(1, hoTenQTV_txt.getText());
                    pst.setString(2, gioiTinhQTV_txt.getText());
                    pst.setString(3, String.valueOf(ngaySinhQTV_txt.getValue()));
                    pst.setString(4, sdtQTV_txt.getText());
                    pst.setString(5, emailQTV_txt.getText());
                    pst.setString(6, diaChiQTV_txt.getText());
                    
                    pst.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Thông báo sửa quản trị viên");
                    alert.setHeaderText(null);
                    alert.setContentText("Sửa quản trị viên thành công!");
                    alert.showAndWait();
                    
                    // UPDATE QTV TABLEVIEW
                    QTVShowListData();
                    //TO CLEAR THE FIELDS
                    QTVClear();
                }
            }
            } catch (SQLException e){
                e.printStackTrace();
            }
    }
    
    
    // XÓA QUẢN TRỊ VIÊN
    @FXML
    void deleteQTV(ActionEvent event) {
        connect = database.connectDb();
        String maQTV = maQTV_txt.getText();
        String hoTenQTV = hoTenQTV_txt.getText();        
        String ngaySinhQTV = String.valueOf(ngaySinhQTV_txt.getValue());
        String gioiTinhQTV = gioiTinhQTV_txt.getText();
        String sdtQTV = sdtQTV_txt.getText();
        String emailQTV = emailQTV_txt.getText();
        String diaChiQTV = diaChiQTV_txt.getText();
        
        try {
        if (maQTV.isEmpty() || hoTenQTV.isEmpty() || ngaySinhQTV.isEmpty() || gioiTinhQTV.isEmpty() || sdtQTV.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Xin hãy điền đầy đủ thông tin cần thiết!");
            alert.showAndWait();
        } else {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Xác nhận xóa");
                alert.setHeaderText(null);
                alert.setContentText("Bạn có chắc muốn XÓA quản trị viên # " + maQTV_txt.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {

                    pst = connect.prepareStatement("delete from quantrivien where MaQTV = ? ");
                    pst.setString(1, maQTV);
                    pst.executeUpdate();

                    pst = connect.prepareStatement("select MaQTV from quantrivien where maQTV = ?");
                    pst.setString(1, maQTV);
                    result = pst.executeQuery();

                    // IF maQTV IS EXIST THEN PROCEED TO DELETE
                    if (result.next()) {

                        pst = connect.prepareStatement("delete from quantrivien where maQTV = ?");
                        pst.setString(1, maQTV);
                        pst.executeUpdate();

                    }// IF NOT THEN NVM

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Thông báo xóa quản trị viên");
                    alert.setHeaderText(null);
                    alert.setContentText("Xóa thông tin quản trị viên thành công !");
                    alert.showAndWait();

                    // TO UPDATE quantrivien
                    QTVShowListData();
                    QTVClear();

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // THÊM QUẢN TRỊ VIÊN
    @FXML
    public void addQTV(ActionEvent event) {
        
        String insertQTV = "insert into quantrivien (MaQTV,HoTen,GioiTinh,NgaySinh,SDT,Email,DiaChi) values(?,?,?,?,?,?,?)";
        
        connect = database.connectDb();
        
        try {
            Alert alert;
            
            if (maQTV_txt.getText().isEmpty() 
                    || hoTenQTV_txt.getText().isEmpty()
                    || gioiTinhQTV_txt.getText().isEmpty()
                    || ngaySinhQTV_txt.getValue() == null
                    || sdtQTV_txt.getText().isEmpty()
                    || emailQTV_txt.getText().isEmpty()
                    || diaChiQTV_txt.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Báo lỗi");
            alert.setHeaderText((null));
            alert.setContentText("Xin hãy điền đầy đủ thông tin");
            alert.showAndWait();
            QTVShowListData();
            
            } else {
                //CHECK IF QTV IS EXIST
                String checkQTV = "select MaQTV from quantrivien where MaQTV = '" 
                        + maQTV_txt.getText() + "'";
                
                statement = connect.createStatement();
                result = statement.executeQuery(checkQTV);
                
                
                if (result.next()){
                   alert = new Alert(AlertType.ERROR);
                   alert.setTitle("Báo lỗi");
                   alert.setHeaderText(null);
                   alert.setContentText("Quản trị viên #" + maQTV_txt.getText() + "đã tồn tại!");
                   alert.showAndWait();
                   QTVClear();
                } else {
                    pst = connect.prepareStatement(insertQTV);
                    pst.setString(1, maQTV_txt.getText());
                    pst.setString(2, hoTenQTV_txt.getText());
                    pst.setString(3, gioiTinhQTV_txt.getText());
                    pst.setString(4, String.valueOf(ngaySinhQTV_txt.getValue()));
                    pst.setString(5, sdtQTV_txt.getText());
                    pst.setString(6, emailQTV_txt.getText());
                    pst.setString(7, diaChiQTV_txt.getText());
                    
                    pst.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Thông báo");
                    alert.setHeaderText(null);
                    alert.setContentText("Thêm quản trị viên thành công");
                    alert.showAndWait();
                    
                    // UPDATE QTV TABLEVIEW
                    QTVShowListData();
                    //TO CLEAR THE FIELDS
                    QTVClear();
                }
            }
        } catch (SQLException e){
        }
    }
    
    public void QTVClear(){
        maQTV_txt.setText("");
        hoTenQTV_txt.setText("");
        ngaySinhQTV_txt.setValue(null);
        gioiTinhQTV_txt.setText("");
        sdtQTV_txt.setText("");
        emailQTV_txt.setText("");
        diaChiQTV_txt.setText("");
    }
    
//    private ObservableList<QuanTriVien> addQuanTriVienListD;
    public void QTVShowListData(){
        
        connect = database.connectDb();
        ObservableList<QuanTriVien> listQTV = FXCollections.observableArrayList();
        try {
            pst = connect.prepareStatement("select * from quantrivien");
            result = pst.executeQuery(); {
            while(result.next()) {
                QuanTriVien quantrivienD = new QuanTriVien(result.getString("maQTV"), 
                result.getString("hoTen"), 
                result.getString("gioiTinh"),
                result.getDate("ngaySinh"), 
                result.getString("sdt"),
                result.getString("email"), 
                result.getString("diaChi"));
                
                listQTV.add(quantrivienD);
            }
        }
            QTV_table.setItems(listQTV);
            
            maQTV_col.setCellValueFactory(new PropertyValueFactory<>("maQTV"));
            hoTenQTV_col.setCellValueFactory(new PropertyValueFactory<>("hoTen"));
            gioiTinhQTV_col.setCellValueFactory(new PropertyValueFactory<>("gioiTinh"));
            ngaySinhQTV_col.setCellValueFactory(new PropertyValueFactory<>("ngaySinh"));
            sdtQTV_col.setCellValueFactory(new PropertyValueFactory<>("sdt"));
            emailQTV_col.setCellValueFactory(new PropertyValueFactory<>("email"));  
            diaChiQTV_col.setCellValueFactory(new PropertyValueFactory<>("diaChi"));
            
        } catch (SQLException ex) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        QTV_table.setRowFactory( tv -> {
            TableRow<QuanTriVien> QTVrow = new TableRow<>();
            QTVrow.setOnMouseClicked (event -> {
                if (event.getClickCount() == 1 && (!QTVrow.isEmpty())){
                    myQTVIndex = QTV_table.getSelectionModel().getSelectedIndex();
                    
                    maQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getMaQTV());
                    hoTenQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getHoTen());
                    gioiTinhQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getGioiTinh());
                    ngaySinhQTV_txt.setValue(LocalDate.parse(String.valueOf(QTV_table.getItems().get(myQTVIndex).getNgaySinh())));
                    sdtQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getSdt());
                    emailQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getEmail());
                    diaChiQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getDiaChi()); 
                    
                }
            });
            return QTVrow;
            
        });
        searchQTV_txt.textProperty().addListener((observable, oldValue, newValue) -> {
        filterQTVList(newValue);
    });
    }
    
    //Tìm kiếm QTV
    private void filterQTVList(String qtvsearchword) {
    connect = database.connectDb();
    ObservableList<QuanTriVien> filteredList = FXCollections.observableArrayList();

    try {
        pst = connect.prepareStatement("select * from quantrivien");
        result = pst.executeQuery();
        while (result.next()) {
            QuanTriVien quantrivienD = new QuanTriVien(result.getString("maQTV"),
                    result.getString("hoTen"),
                    result.getString("gioiTinh"),
                    result.getDate("ngaySinh"),
                    result.getString("sdt"),
                    result.getString("email"),
                    result.getString("diaChi"));

            // Check if any field contains the keyword
            if (quantrivienD.getMaQTV().toLowerCase().contains(qtvsearchword.toLowerCase())
                    || quantrivienD.getHoTen().toLowerCase().contains(qtvsearchword.toLowerCase())
                    || quantrivienD.getGioiTinh().toLowerCase().contains(qtvsearchword.toLowerCase())
                    || quantrivienD.getSdt().toLowerCase().contains(qtvsearchword.toLowerCase())
                    || quantrivienD.getEmail().toLowerCase().contains(qtvsearchword.toLowerCase())
                    || quantrivienD.getDiaChi().toLowerCase().contains(qtvsearchword.toLowerCase())) {
                filteredList.add(quantrivienD);
            }
        }

        QTV_table.setItems(filteredList);
    } catch (SQLException ex) {
        Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    //Đổi mật khẩu QTV
    @FXML
    private void handleChangePassword(ActionEvent event) {
        String account = account_txt.getText();
        String currentPassword = currentPassword_txt.getText();
        String newPassword = newPassword_txt.getText();

        if (isValidPasswordChange(account, currentPassword)) {
            changePasswordInDatabase(account, newPassword);
            showAlert("Thay đổi mật khẩu thành công!");
        } else {
            showAlert("Tài khoản hoặc mật khẩu không hợp lệ!");
        }
    }

    private boolean isValidPasswordChange(String account, String currentPassword) {
        connect = database.connectDb();
        
            String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
                preparedStatement.setString(1, account);
                preparedStatement.setString(2, currentPassword);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next(); // If there's a match, return true
                }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void changePasswordInDatabase(String account, String newPassword) {
        connect = database.connectDb(); {
            String updateQuery = "UPDATE admin SET password = ? WHERE username = ?";
            
            try (PreparedStatement preparedStatement = connect.prepareStatement(updateQuery)) {
                preparedStatement.setString(1, newPassword);
                preparedStatement.setString(2, account);
                
                int rowsAffected = preparedStatement.executeUpdate();
                
                if (rowsAffected > 0) {
                    System.out.println("Thay đổi mật khẩu thành công");
                    account_txt.setText("");
                    newPassword_txt.setText("");
                    currentPassword_txt.setText("");
                } else {
                    System.out.println("Không thể thay đổi mật khẩu do không có tài khoản phù hợp");
                }
            }
         catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately in your application
        }
    }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Password Change");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    
    
    public void switchForm(ActionEvent event){
        if(event.getSource() == trangChu_btn){
            trangChu_form.setVisible(true);
            khoanThu_form.setVisible(false);
            thongTinHoGD_form.setVisible(false);
            thongTinQTV_form.setVisible(false);
            v2Update_form.setVisible(false);
        } else if(event.getSource() == khoanThu_btn){
            trangChu_form.setVisible(false);
            khoanThu_form.setVisible(true);
            thongTinHoGD_form.setVisible(false);
            thongTinQTV_form.setVisible(false);
            v2Update_form.setVisible(false);
        } else if(event.getSource() == thongTinHoGD_btn){
            trangChu_form.setVisible(false);
            khoanThu_form.setVisible(false);
            thongTinHoGD_form.setVisible(true);
            thongTinQTV_form.setVisible(false);
            v2Update_form.setVisible(false);
        } else if(event.getSource() == thongTinQTV_btn) {
            trangChu_form.setVisible(false);
            khoanThu_form.setVisible(false);
            thongTinHoGD_form.setVisible(false);
            thongTinQTV_form.setVisible(true);
            v2Update_form.setVisible(false);
        } else if(event.getSource() == v2Update_btn) {
            trangChu_form.setVisible(false);
            khoanThu_form.setVisible(false);
            thongTinHoGD_form.setVisible(false);
            thongTinQTV_form.setVisible(false);
            v2Update_form.setVisible(true);
        }   
    }
    
    public void switchFormKhoanThu(ActionEvent event){
        if(event.getSource() == themKhoanThu_btn){
            themKhoanThu_form.setVisible(true);
            suaKhoanThu_form.setVisible(false);
            traCuuKhoanThu_form.setVisible(false);
        } else if(event.getSource() == suaKhoanThu_btn){
            themKhoanThu_form.setVisible(false);
            suaKhoanThu_form.setVisible(true);
            traCuuKhoanThu_form.setVisible(false);
        } else if(event.getSource() == traCuuKhoanThu_btn){
            themKhoanThu_form.setVisible(false);
            suaKhoanThu_form.setVisible(false);
            traCuuKhoanThu_form.setVisible(true);
        } 
    }
    
    public void switchFormTraCuuPhi(ActionEvent event){
        if(event.getSource() == traCuuPhiQuanLy_btn){
            traCuuPhiQuanLy_form.setVisible(true);
            traCuuPhiDichVu_form.setVisible(false);
            traCuuPhiKhac_form.setVisible(false);
        } else if(event.getSource() == traCuuPhiDichVu_btn){
            traCuuPhiQuanLy_form.setVisible(false);
            traCuuPhiDichVu_form.setVisible(true);
            traCuuPhiKhac_form.setVisible(false);
        } else if(event.getSource() == traCuuPhiKhac_btn){
            traCuuPhiQuanLy_form.setVisible(false);
            traCuuPhiDichVu_form.setVisible(false);
            traCuuPhiKhac_form.setVisible(true);
        }
    } 
    
    public void switchFormThemPhi(ActionEvent event){
        if(event.getSource() == themPhiQuanLy_btn){
            themPhiQuanLy_form.setVisible(true);
            themPhiDichVu_form.setVisible(false);
            themPhiKhac_form.setVisible(false);
        } else if(event.getSource() == themPhiDichVu_btn){
            themPhiQuanLy_form.setVisible(false);
            themPhiDichVu_form.setVisible(true);
            themPhiKhac_form.setVisible(false);
        } else if(event.getSource() == themPhiKhac_btn){
            themPhiQuanLy_form.setVisible(false);
            themPhiDichVu_form.setVisible(false);
            themPhiKhac_form.setVisible(true);
        }
    }
    
    public void switchFormSuaPhi(ActionEvent event){
        if(event.getSource() == suaPhiQuanLy_btn){
            suaPhiQuanLy_form.setVisible(true);
            suaPhiDichVu_form.setVisible(false);
            suaPhiKhac_form.setVisible(false);
        } else if(event.getSource() == suaPhiDichVu_btn){
            suaPhiQuanLy_form.setVisible(false);
            suaPhiDichVu_form.setVisible(true);
            suaPhiKhac_form.setVisible(false);
        } else if(event.getSource() == suaPhiKhac_btn){
            suaPhiQuanLy_form.setVisible(false);
            suaPhiDichVu_form.setVisible(false);
            suaPhiKhac_form.setVisible(true);
        }
    }
    
    public void switchFormThongTinHoGD(ActionEvent event){
        if(event.getSource() == themThongTinHoGD_btn){
            themThongTinHoGD_form.setVisible(true);
            suaThongTinHoGD_form.setVisible(false);
            traCuuThongTinHoGD_form.setVisible(false);
        } else if(event.getSource() == suaThongTinHoGD_btn){
            themThongTinHoGD_form.setVisible(false);
            suaThongTinHoGD_form.setVisible(true);
            traCuuThongTinHoGD_form.setVisible(false);
        } else if(event.getSource() == traCuuThongTinHoGD_btn){
            themThongTinHoGD_form.setVisible(false);
            suaThongTinHoGD_form.setVisible(false);
            traCuuThongTinHoGD_form.setVisible(true);
        } 
    }
    
    public void switchFormSuaHoNhanKhau(ActionEvent event){
        if(event.getSource() == suaHoKhau_btn){
            suaHoKhau_form.setVisible(true);
            suaNhanKhau_form.setVisible(false);
        } else if(event.getSource() == suaNhanKhau_btn){
            suaHoKhau_form.setVisible(false);
            suaNhanKhau_form.setVisible(true);
        }
    }    
    
    public void switchFormTraCuuHoNhanKhau(ActionEvent event){
        if(event.getSource() == traCuuHoKhau_btn){
            traCuuHoKhau_form.setVisible(true);
            traCuuNhanKhau_form.setVisible(false);
        } else if(event.getSource() == traCuuNhanKhau_btn){
            traCuuHoKhau_form.setVisible(false);
            traCuuNhanKhau_form.setVisible(true);
        }
    }    
    
    public void switchFormThemHoNhanKhau(ActionEvent event){
        if(event.getSource() == themHoKhau_btn){
            themHoKhau_form.setVisible(true);
            themNhanKhau_form.setVisible(false);
        } else if(event.getSource() == themNhanKhau_btn){
            themHoKhau_form.setVisible(false);
            themNhanKhau_form.setVisible(true);
        }
    } 
    
    public void insertFormQTV(ActionEvent event){
        if(event.getSource() == doiMatKhau_btn){
            mainQTV_form.setVisible(false);
            doiMatKhau_form.setVisible(true);
        } 
    }
    
    public void switchFormV2Update(ActionEvent event){
        if(event.getSource() == traCuuV2Update_btn){
            traCuuV2Update_form.setVisible(true);
            themV2Update_form.setVisible(false);
            suaV2Update_form.setVisible(false);
        } else if(event.getSource() == themV2Update_btn){
            traCuuV2Update_form.setVisible(false);
            themV2Update_form.setVisible(true);
            suaV2Update_form.setVisible(false);
        } else if(event.getSource() == suaV2Update_btn){
            traCuuV2Update_form.setVisible(false);
            themV2Update_form.setVisible(false);
            suaV2Update_form.setVisible(true);
        }
    }    
    
    
    private double x = 0;
    private double y = 0;
    
    //LOG_OUT
    public void logout() {
        try{
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Xác nhận");
            alert.setHeaderText(null);
            alert.setContentText("Bạn có chắc chắn muốn đăng xuất?");
            Optional<ButtonType> option = alert.showAndWait();
            
            if(option.get().equals(ButtonType.OK)){
                
                logout.getScene().getWindow().hide();
                
                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                
                root.setOnMousePressed((MouseEvent event) -> {
                    x = event.getSceneX();
                    y = event.getSceneY();
                });
        
            root.setOnMouseDragged((MouseEvent event) -> {
                stage.setX(event.getScreenX() - x);
                stage.setY(event.getScreenY() - y);
            
                stage.setOpacity(.8f);
            });
        
            root.setOnMouseReleased((MouseEvent event) -> {
                stage.setOpacity(1);
            });
        
            stage.initStyle(StageStyle.TRANSPARENT);
                
            stage.setScene(scene);
            stage.show();
            }
        }catch(IOException e){}
    }
    
    //Close SubForm
    @FXML
    private void closeAddFee(MouseEvent event) {
        themKhoanThu_form.setVisible(false);
        traCuuKhoanThu_form.setVisible(true);
    }
    
    @FXML
    private void closeChangeFee(MouseEvent event) {
        suaKhoanThu_form.setVisible(false);
        traCuuKhoanThu_form.setVisible(true);
    }
    
    @FXML
    private void closeAddInForFamily(MouseEvent event) {
        themThongTinHoGD_form.setVisible(false);
        traCuuThongTinHoGD_form.setVisible(true);
    }
    
    @FXML
    private void closeAddV2Update(MouseEvent event) {
        themV2Update_form.setVisible(false);
        traCuuV2Update_form.setVisible(true);
    }
    
    @FXML
    private void closeChangeInForFamily(MouseEvent event) {
        suaThongTinHoGD_form.setVisible(false);
        traCuuThongTinHoGD_form.setVisible(true);
    }
    
    @FXML
    private void closeChangePass(MouseEvent event) {
        doiMatKhau_form.setVisible(false);
        mainQTV_form.setVisible(true);
    }
    
    @FXML
    private void closeChangeV2Update(MouseEvent event) {
        suaV2Update_form.setVisible(false);
        traCuuV2Update_form.setVisible(true);
    }

    @FXML
    void searchMaHoGiaDinh(ActionEvent event) {

    }

    @FXML
    void deletePhi(ActionEvent event) {

    }


    @FXML
    void closeAddFee(ActionEvent event) {

    }

    @FXML
    void closeChangeFee(ActionEvent event) {

    }

    @FXML
    void closeChangeInForFamily(ActionEvent event) {

    }

    @FXML
    void closeAddInForFamily(ActionEvent event) {

    }


    @FXML
    void delete(ActionEvent event) {

    }


    @FXML
    void closeChangePass(ActionEvent event) {

    }

    
    //SHOW_ACCOUNT_NAME
    public void displayUsername(){
        String user = data.username;
        user = user.substring(0, 1).toUpperCase() + user.substring(1);
        username.setText(user);
    }
    
    //CLOSE_PROGRAM
    public void close() {
        System.exit(0);
    }
    
    //MINIMIZE_PROGRAM
    public void minimize() {
        Stage stage = (Stage)minimize.getScene().getWindow();
        stage.setIconified(true);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        displayUsername();
//        trangThaiNopTien();
        QTVShowListData();
        HoKhauShowListData();
        NhanKhauShowListData();
        PhiMoiShowListData();
        PhiQuanLyShowListData();
        PhiDichVuShowListData();
        PhiKhacShowListData();
    }
    
}
