package aparmentmanagementsystem;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private PasswordField password;

    @FXML
    private Button loginBtr;

    @FXML
    private AnchorPane main_form;

    @FXML
    private Button close;

    @FXML
    private TextField username;
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    private double x = 0;
    private double y = 0;
    
    public void login(){
        String sql = "SELECT * FROM admin WHERE username = ? and password = ?";
        
        connect = database.connectDb();
        
        try{
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, username.getText());
            prepare.setString(2, password.getText());
            
            result = prepare.executeQuery();
            
            Alert alert;
            
            if(username.getText().isEmpty() || password.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("ERROR Message");
                alert.setHeaderText(null); 
                alert.setContentText("Please fill all bank fields");
                alert.showAndWait();
            } else {
                if(result.next()) {
                    
                    data.username = username.getText();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully login!!!");
                    alert.showAndWait();
                    
                    loginBtr.getScene().getWindow().hide();
                    
                    Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                    
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    
                    root.setOnMousePressed((MouseEvent event) -> {
                        x = event.getSceneX();
                        y = event.getSceneY();
                    });
                    
                    root.setOnMouseDragged((MouseEvent event) -> {
                        stage.setX(event.getScreenX() - x);
                        stage.setY(event.getScreenY() - y);
                    });
                    
                    stage.initStyle(StageStyle.TRANSPARENT);
                    
                    stage.setScene(scene);
                    stage.show();
                            
                } else {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("ERORR Message");
                    alert.setHeaderText(null);
                    alert.setContentText("WRONG Username/Password");
                    alert.showAndWait();
                }
            }
        } catch(Exception e) {e.printStackTrace();}
    }
    
    //CLOSE THE PROGRAM
    public void close(){
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
    
        
