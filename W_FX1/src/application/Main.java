package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	public Main() {
		System.out.println("Konstruktor");
	}
	
	@Override
	public void start(Stage primaryStage) {
		System.out.println("Start");
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("Init");
	}
	
	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
		System.out.println("Stop");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
