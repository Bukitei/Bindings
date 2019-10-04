package dad.bindings.bidireccional;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BidireccionalApp extends Application {

	private TextField texto1, texto2;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		texto1 = new TextField();
		texto2 = new TextField();
		
		VBox root = new VBox(texto1, texto2);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		//bindeo
		texto2.textProperty().bindBidirectional(texto1.textProperty());
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Bidireccional");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
