package application.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.database.DBConnector;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField tf_login;

    @FXML
    private PasswordField pf_password;

    @FXML
    private TextField tf_pasword;

    @FXML
    private Button btn_login;

    @FXML
    private Button btn_show;
    
    
    
    static boolean flag = true;
    
    DBConnector db;
    public static String rola;
    public static String login;

    @FXML
    void buttonLogin(MouseEvent event) throws SQLException, IOException {
    	Connection connection = db.connection();
    	String sql = "SELECT rola FROM logowanie WHERE login=? and pass=?;";
    	PreparedStatement ps = connection.prepareStatement(sql);
    	ps.setString(1, tf_login.getText());
    	ps.setString(2, flag ? pf_password.getText(): tf_pasword.getText());
    	ResultSet rs = ps.executeQuery();
    	
    	if(rs.next()) {
    		rola = rs.getString("rola");
    		System.out.println(rola);
    		login = tf_login.getText();
    		
    		Stage stage = new Stage();
    		Parent parent = FXMLLoader.load(getClass().getResource("/application/view/TableView.fxml"));
    		Scene scene = new Scene(parent);
    		stage.setScene(scene);
    		stage.setTitle("Tabelka");
    		stage.show();
    		
    		((Node)event.getSource()).getScene().getWindow().hide();	
    	
    	} else {
    	
    		Alert error = new Alert(AlertType.ERROR);
    		error.setHeaderText("ERROR");
    		error.setContentText("B³êdny login lub has³o!");
    		error.setTitle("Nale¿y podac porawne dane logowania");
    		error.showAndWait();
    	}
    	
    	
    	
    }

    @FXML
    void showPass(MouseEvent event) {

    	if (flag) {
    		String pf_text = pf_password.getText();
    		pf_password.setVisible(false);
    		tf_pasword.setVisible(true);
    		tf_pasword.setText(pf_text);
    		flag=false;
    		btn_show.setText("hide");
    	} else {
    		String tf_text = tf_pasword.getText();
    		pf_password.setVisible(true);
    		tf_pasword.setVisible(false);
    		pf_password.setText(tf_text);
    		btn_show.setText("show");
    		flag = true;
    	}
    }
    
    public void initialize() {
		db = new DBConnector();
	}
    
}
