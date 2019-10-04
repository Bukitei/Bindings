package dad.bindings.dimensiones;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DimensionesApp extends Application {

	private Label xLabel, yLabel, areaLabel;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		xLabel = new Label();
		yLabel = new Label();
		areaLabel = new Label();
		
		VBox root = new VBox(5, xLabel, yLabel, areaLabel);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);
		
		DoubleProperty a = new SimpleDoubleProperty();
		DoubleProperty b = new SimpleDoubleProperty();
		DoubleProperty c = new SimpleDoubleProperty();
		
		a.bind(scene.widthProperty());
		b.bind(scene.heightProperty());
		c.bind(a.multiply(b));
		
		xLabel.textProperty().bind(a.asString());
		yLabel.textProperty().bind(b.asString());
		areaLabel.textProperty().bind(c.asString());
		
		primaryStage.setTitle("Calculo Bindings");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
