package application.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class TableController {

    @FXML
    private Label lb_exit;

    @FXML
    void systemExit(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
    	Parent parent = FXMLLoader.load(getClass().getResource("/application/view/LoginView.fxml"));
    	Scene scene = new Scene(parent);
    	stage.setScene(scene);
    	stage.setTitle("Logowanie");
    	stage.show();
    	
    	((Node)event.getSource()).getScene().getWindow().hide();

    }
    
    public void initialize() {
    	lb_exit.setText(LoginController.login +":" + LoginController.rola + "\n Dziêkujemy za zalogowanie");
    	
    }

}
