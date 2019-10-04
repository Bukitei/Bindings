package dad.bindings.celciustofarenhide;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class CFApp extends Application {

	private TextField celciusText;
	private Label farenheitLabel;
	
	private DoubleProperty celsius = new SimpleDoubleProperty(0);
	private DoubleProperty farenheit = new SimpleDoubleProperty(0);
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		celciusText = new TextField();
		celciusText.setPrefWidth(50);
		
		farenheitLabel = new Label();
		
		HBox root = new HBox(5, celciusText, farenheitLabel);
		root.setAlignment(Pos.CENTER);
		root.setFillHeight(false);
		
		//bindeos
		//Aplicamos Bindings para crear un objeto con valor variable
		Bindings.bindBidirectional(celciusText.textProperty(), celsius, new NumberStringConverter());
		
		farenheit.bind(celsius.multiply(9.0/5.0).add(32));
		
		farenheitLabel.textProperty().bind(farenheit.asString().concat("F"));
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Celcius a Farenhide");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
