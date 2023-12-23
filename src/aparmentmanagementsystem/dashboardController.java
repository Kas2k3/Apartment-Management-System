package aparmentmanagementsystem;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


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
    private Button khoanThu_btn;
    
    @FXML
    private Button thongTinHoGD_btn;
    
    @FXML
    private Button thongTinQTV_btn;
    
    @FXML
    private Button v2Update_btn;
    
    @FXML
    private Button themKhoanThu_btn;
    
    @FXML
    private Button xoaKhoanThu_btn;
    
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
    private Button themThongTinHoGD_btn;
    
    @FXML
    private Button xoaThongTinHoGD_btn;
    
    @FXML
    private Button suaThongTinHoGD_btn;
    
    @FXML
    private Button traCuuThongTinHoGD_btn;
    
    @FXML
    private Button themThongTinQTV_btn;
    
    @FXML
    private Button xoaThongTinQTV_btn;
    
    @FXML
    private Button suaThongTinQTV_btn;
    
    @FXML
    private Button traCuuThongTinQTV_btn;
    
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
    private Button suaThongTinQTV1_btn;
    
    @FXML
    private Button doiMatKhau_btn;
    
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
    private AnchorPane themKhoanThu_form;
    
    @FXML
    private AnchorPane xoaKhoanThu_form;
    
    @FXML
    private AnchorPane suaKhoanThu_form;
    
    @FXML
    private AnchorPane traCuuPhiQuanLy_form;
    
    @FXML
    private AnchorPane traCuuPhiDichVu_form;
    
    @FXML
    private AnchorPane traCuuPhiKhac_form;
    
    @FXML
    private AnchorPane traCuuKhoanThu_form;

    @FXML
    private AnchorPane themThongTinHoGD_form;
    
    @FXML
    private AnchorPane xoaThongTinHoGD_form;
    
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
    private AnchorPane themThongTinQTV_form;
    
    @FXML
    private AnchorPane xoaThongTinQTV_form;
    
    @FXML
    private AnchorPane suaThongTinQTV_form;
    
    @FXML
    private AnchorPane traCuuThongTinQTV_form;
    
    @FXML
    private AnchorPane suaThongTinQTV1_form;
    
    @FXML
    private AnchorPane doiMatKhau_form;

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
            xoaKhoanThu_form.setVisible(false);
            suaKhoanThu_form.setVisible(false);
            traCuuKhoanThu_form.setVisible(false);
        } else if(event.getSource() == xoaKhoanThu_btn){
            themKhoanThu_form.setVisible(false);
            xoaKhoanThu_form.setVisible(true);
            suaKhoanThu_form.setVisible(false);
            traCuuKhoanThu_form.setVisible(false);
        } else if(event.getSource() == suaKhoanThu_btn){
            themKhoanThu_form.setVisible(false);
            xoaKhoanThu_form.setVisible(false);
            suaKhoanThu_form.setVisible(true);
            traCuuKhoanThu_form.setVisible(false);
        } else if(event.getSource() == traCuuKhoanThu_btn){
            themKhoanThu_form.setVisible(false);
            xoaKhoanThu_form.setVisible(false);
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
    
    public void switchFormThongTinHoGD(ActionEvent event){
        if(event.getSource() == themThongTinHoGD_btn){
            themThongTinHoGD_form.setVisible(true);
            xoaThongTinHoGD_form.setVisible(false);
            suaThongTinHoGD_form.setVisible(false);
            traCuuThongTinHoGD_form.setVisible(false);
        } else if(event.getSource() == xoaThongTinHoGD_btn){
            themThongTinHoGD_form.setVisible(false);
            xoaThongTinHoGD_form.setVisible(true);
            suaThongTinHoGD_form.setVisible(false);
            traCuuThongTinHoGD_form.setVisible(false);
        } else if(event.getSource() == suaThongTinHoGD_btn){
            themThongTinHoGD_form.setVisible(false);
            xoaThongTinHoGD_form.setVisible(false);
            suaThongTinHoGD_form.setVisible(true);
            traCuuThongTinHoGD_form.setVisible(false);
        } else if(event.getSource() == traCuuThongTinHoGD_btn){
            themThongTinHoGD_form.setVisible(false);
            xoaThongTinHoGD_form.setVisible(false);
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
    
    public void switchFormThongTinQTV(ActionEvent event){
        if(event.getSource() == themThongTinQTV_btn){
            themThongTinQTV_form.setVisible(true);
            xoaThongTinQTV_form.setVisible(false);
            suaThongTinQTV_form.setVisible(false);
            traCuuThongTinQTV_form.setVisible(false);
        } else if(event.getSource() == xoaThongTinQTV_btn){
            themThongTinQTV_form.setVisible(false);
            xoaThongTinQTV_form.setVisible(true);
            suaThongTinQTV_form.setVisible(false);
            traCuuThongTinQTV_form.setVisible(false);
        } else if(event.getSource() == suaThongTinQTV_btn){
            themThongTinQTV_form.setVisible(false);
            xoaThongTinQTV_form.setVisible(false);
            suaThongTinQTV_form.setVisible(true);
            traCuuThongTinQTV_form.setVisible(false);
        } else if(event.getSource() == traCuuThongTinQTV_btn){
            themThongTinQTV_form.setVisible(false);
            xoaThongTinQTV_form.setVisible(false);
            suaThongTinQTV_form.setVisible(false);
            traCuuThongTinQTV_form.setVisible(true);
        } 
    }
    
    public void switchFormSuaThongTinQTV(ActionEvent event){
        if(event.getSource() == suaThongTinQTV1_btn){
            suaThongTinQTV1_form.setVisible(true);
            doiMatKhau_form.setVisible(false);
        } else if(event.getSource() == doiMatKhau_btn){
            suaThongTinQTV1_form.setVisible(false);
            doiMatKhau_form.setVisible(true);
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
        }catch(Exception e){e.printStackTrace();}
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
    }
    
}
