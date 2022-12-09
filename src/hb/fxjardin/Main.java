package hb.fxjardin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/fxml/jardin.fxml"));
			VBox root = (VBox) loader.load();
		
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/resources/css/application.css").toExternalForm());

			primaryStage.setTitle("Jardin Virtuel");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
