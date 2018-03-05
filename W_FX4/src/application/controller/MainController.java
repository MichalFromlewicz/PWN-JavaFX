package application.controller;

import java.util.Arrays;
import java.util.stream.Stream;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private Button btn_copy;

    @FXML
    private Button btn_paste;

    @FXML
    private Button btn_clear;
    
    private static String text;

    @FXML
    private Label lbl_upper;

    @FXML
    private Label lbl_lower;

    @FXML
    private Label lbl_capitalize;

    @FXML
    private Label lbl_reverse;

    @FXML
    private TextArea ta;

    @FXML
    void capializeAction(MouseEvent event) {
    	String t = ta.getText().trim();
    	ta.clear();
    	String[] strings = t.split(" ");
    	Arrays.stream(strings)
    	.map(string -> string.substring(0,1).toUpperCase() + string.substring(1,string.length()))
    	.forEach(string -> ta.setText(ta.getText() + " " + string));

    }

    @FXML
    void clearAction(MouseEvent event) {
    	
    	ta.clear();

    }

    @FXML
    void copyAction(MouseEvent event) {
    	if (ta.getSelectedText() !=null && !ta.getSelectedText().isEmpty()) {
    	text = ta.getSelectedText();
    	} else {
    		text = ta.getText();
    	}
    }

    @FXML
    void lowerAction(MouseEvent event) {
    	String t = ta.getText();
    	ta.setText(t.toLowerCase());

    }

    @FXML
    void pasteAction(MouseEvent event) {
    	ta.insertText(ta.getCaretPosition(), text);

    }

    @FXML
    void reverseAction(MouseEvent event) {
    	String t = ta.getText();
    	StringBuilder builder = new StringBuilder(t);
    	ta.setText(builder.reverse().toString());

    }

    @FXML
    void upperAction(MouseEvent event) {
    	String t = ta.getText();
    	ta.setText(t.toUpperCase());

    }

}
