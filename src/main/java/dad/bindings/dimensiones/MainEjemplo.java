package dad.bindings.dimensiones;


import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class MainEjemplo {

	public static void main(String[] args) {
		
		DoubleProperty a = new SimpleDoubleProperty(4);
		DoubleProperty b = new SimpleDoubleProperty(5);
		DoubleProperty c = new SimpleDoubleProperty();
		
		//o = observar
		a.addListener((o, ov, nv) -> System.out.println("A antes valia "+ ov + " y ahora vale " + nv));
		
		c.bind(a.multiply(b));
		c.addListener((o, ov, nv) -> System.out.println("C antes valía " + ov + " y ahora vale " + nv));
		
		b.set(6);
		
		a.set(3);
		

	}

}
