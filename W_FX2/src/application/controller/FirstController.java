package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class FirstController {

    @FXML
    private Button btn;

    @FXML
    void buttonClicked(MouseEvent event) {
    	System.out.println("Yuppi");

    }

}