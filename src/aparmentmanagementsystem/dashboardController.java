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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
    
    
    String query = null;
    Connection connect;
    PreparedStatement pst;
    Statement statement;
    ResultSet result;
    QuanTriVien quantrivien = null;
    
    int myQTVIndex;
    
    
    // TÌM KIẾM QUẢN TRỊ VIÊN
//    void searchQTV() {
//        QTVShowListData();
//        ObservableList<QuanTriVien> ListQTV = FXCollections.observableArrayList();
//        
//        QTV_table.setItems(ListQTV);
//        FilteredList<QuanTriVien> filterData = new FilteredList<>(ListQTV, b -> true);
//            
//            searchQTV_txt.textProperty().addListener((observable, oldValue, newValue) -> {
//                filterData.setPredicate(quantrivien -> {
//                    if (newValue==null || newValue.isEmpty()) {
//                        return true;
//                    }
//                    String toLowerCaseFilter = newValue.toLowerCase();
//                    if(quantrivien.getMaQTV().contains(newValue)){
//                        return true;
//                    } else if(quantrivien.getHoTen().toLowerCase().contains(toLowerCaseFilter)){
//                        return true;
//                    } else if(quantrivien.getGioiTinh().toLowerCase().contains(toLowerCaseFilter)){
//                        return true;
//                    } else if(quantrivien.getSdt().toLowerCase().contains(toLowerCaseFilter)){
//                        return true;
//                    } else if(quantrivien.getEmail().toLowerCase().contains(toLowerCaseFilter)){
//                        return true;
//                    } else if(quantrivien.getDiaChi().toLowerCase().contains(toLowerCaseFilter)){
//                        return true;
//                    } else return false;
//                   
//                });
//            });
//                SortedList<QuanTriVien> sortedQTV = new SortedList<>(filterData);
//                sortedQTV.comparatorProperty().bind(QTV_table.comparatorProperty());
//                QTV_table.setItems(sortedQTV);
//            }
    
    // THAY ĐỔI THÔNG TIN QUẢN TRỊ VIÊN
    @FXML
    void changeQTV(ActionEvent event) {
        String updateData = "UPDATE quantrivien SET "
                + "MaQTV = '" + maQTV_txt.getText()
                + "', HoTen = '" + hoTenQTV_txt.getText()
                + "', GioiTinh = '" + gioiTinhQTV_txt.getText()
                + "', NgaySinh = '" + ngaySinhQTV_txt.getValue()
                + "', SDT = '" + sdtQTV_txt.getText()
                + "', Email = '" + emailQTV_txt.getText()
                + "', DiaChi = '" + diaChiQTV_txt.getText()
                + "'";

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
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {

                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE Student #" + maQTV_txt.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();
                
                    // TO UPDATE THE TABLEVIEW
                    QTVShowListData();
                    // TO CLEAR THE FIELDS
                    QTVClear();
                }
                else {
                    return;
                }
            }
        } catch (Exception e) {
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
    void searchMaHoGiaDinh(ActionEvent event) {

    }

    @FXML
    void deletePhi(ActionEvent event) {

    }

    @FXML
    void addPhiQuanLy(ActionEvent event) {

    }

    @FXML
    void closeAddFee(ActionEvent event) {

    }


    @FXML
    void addPhiDichVu(ActionEvent event) {

    }


    @FXML
    void addPhiKhac(ActionEvent event) {

    }

    @FXML
    void changePhiQuanLy(ActionEvent event) {

    }

    @FXML
    void closeChangeFee(ActionEvent event) {

    }

    @FXML
    void changePhiDichVu(ActionEvent event) {

    }

    @FXML
    void changePhiKhac(ActionEvent event) {

    }

    @FXML
    void searchNhanKhau(ActionEvent event) {

    }


    @FXML
    void changeHoKhau(ActionEvent event) {

    }

    @FXML
    void changeNhanKhau(ActionEvent event) {

    }


    @FXML
    void closeChangeInForFamily(ActionEvent event) {

    }



    @FXML
    void addHoKhau(ActionEvent event) {

    }


    @FXML
    void addNhanKhau(ActionEvent event) {

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

    }
    
}
