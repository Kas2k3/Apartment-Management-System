package aparmentmanagementsystem;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
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
    private Button themThongTinHoGD_btn;
    
    @FXML
    private Button xoaThongTinHoGD_btn;
    
    @FXML
    private Button suaThongTinHoGD_btn;
    
    @FXML
    private Button traCuuThongTinHoGD_btn;
    
    @FXML
    private Button suaThongTinHoKhau_btn;
    
    @FXML
    private Button suaThongTinNhanKhau_btn;
    
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
    private AnchorPane suaThongTinHoKhau_form;
    
    @FXML
    private AnchorPane suaThongTinNhanKhau_form;

    
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
    
    public void switchsuaHoNhanKhauForm(ActionEvent event){
        if(event.getSource() == suaThongTinHoKhau_btn){
            suaThongTinHoKhau_form.setVisible(true);
            suaThongTinNhanKhau_form.setVisible(false);
        } else if(event.getSource() == suaThongTinNhanKhau_btn){
            suaThongTinHoKhau_form.setVisible(false);
            suaThongTinNhanKhau_form.setVisible(true);
        }
    }
    
    
    private double x = 0;
    private double y = 0;
    
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
    
    public void displayUsername(){
        String user = data.username;
        user = user.substring(0, 1).toUpperCase() + user.substring(1);
        username.setText(user);
    }
    
    public void close() {
        System.exit(0);
    }
    
    public void minimize() {
        Stage stage = (Stage)minimize.getScene().getWindow();
        stage.setIconified(true);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        displayUsername();
    }
    
}
