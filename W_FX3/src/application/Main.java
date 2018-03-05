package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/application/view/LoginView.fxml"));
		
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Logowanie");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
