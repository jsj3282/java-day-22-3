package ex01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("11111");
		Pane root = FXMLLoader.load(getClass().getResource("eventTest.fxml"));
		System.out.println("22222");
		Scene scene = new Scene(root);
		System.out.println("33333");
		primaryStage.setTitle("Login");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		
		launch(args);
	
	}


}
