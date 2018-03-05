package application.controller;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class FirstController {

    @FXML
    private Button btn_next;
    

    @FXML
    void goNext(MouseEvent event) throws IOException {
    	
    	Parent parent = FXMLLoader.load(getClass().getResource("/application/view/SecondView.fxml"));
    	Scene scene = new Scene(parent);
    	Main.getPrimaryStage().setScene(scene);

    }

}
