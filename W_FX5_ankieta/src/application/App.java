package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class App extends Application {
	@Override
	public void start(Stage primaryStage)throws IOException {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/application/view/AnkietaView.fxml"));
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Course choice form");

		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
