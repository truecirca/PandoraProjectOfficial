package circa.projectpandora.controller;
	
import java.net.URL;

import circa.projectpandora.model.GamesAvaliable;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Pandora's Box");
			
			URL theUrl = getClass().getResource("../view/projectpandoraview.fxml");
			
			BorderPane root = FXMLLoader.load(theUrl);
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception theException) {
			Alert errorAlert = new Alert(AlertType.ERROR);
			errorAlert.setContentText(theException.getMessage());
			errorAlert.show();
		}
		
		//GamesAvaliable games = new GamesAvaliable();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
