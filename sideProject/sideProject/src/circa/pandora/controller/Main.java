package circa.pandora.controller;
	
import java.io.IOException;
import java.net.URL;

import circa.pandora.model.SlayTheSpireHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			URL theURL = getClass().getResource("../view/PandoraView.fxml");
			GridPane root = FXMLLoader.load(theURL);
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
		}
	
	public static void main(String[] args) {
		launch(args);
	}
}
