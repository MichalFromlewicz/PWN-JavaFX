package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		// dodanie zasobu widoku aplikacji
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/application/view/FirstView.fxml"));
		// osadzenie zasobu na scenie
		Scene scene = new Scene(parent);
		//osadzenie sceny na stage
		primaryStage.setScene(scene);
		//dodanie tytu�u
		primaryStage.setTitle("Aplikacja nr 2");
		//ustawienie widoczno�ci aplikacji
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}