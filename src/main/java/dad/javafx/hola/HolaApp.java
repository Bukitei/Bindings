package dad.javafx.hola;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaApp extends Application {

	private TextField text;
	private Label hello;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		text = new TextField();
		text.setPromptText("Introduce el nombre");
		text.setPrefColumnCount(10);//Veces máximas de tamaño de W mayuscula
		
		hello = new Label();
		
		VBox root = new VBox(5, text, hello);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		//Ahora los Bindings
		StringProperty saludo = new SimpleStringProperty("Hola ");
//		hello.textProperty().bind(saludo.concat(text.textProperty().concat(", ¿que pasó?")));
		hello.textProperty().bind(Bindings.concat(saludo, text.textProperty(), "!"));
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Ejemplo de Bildings");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
