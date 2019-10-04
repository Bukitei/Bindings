package dad.javafx.bindings.custom;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Main {

	public static void main(String[] args) {

		DoubleProperty a = new SimpleDoubleProperty(3);
		DoubleProperty b = new SimpleDoubleProperty(2);
		DoubleProperty c = new SimpleDoubleProperty();
		
		//c = a*2 + b
		
//		c.bind(new PowBinding(a, new SimpleDoubleProperty(2)).add(b));
		c.bind(MathBindings.pow(a, 2).add(b));

		System.out.println(c.get());
		
		
		
		a.set(5);
		
		System.out.println(c.get());
		
		DoubleProperty d = new SimpleDoubleProperty(16);
		
		System.out.println(MathBindings.SquareRoot(d).get());
		
		StringProperty s = new SimpleStringProperty("   Esto es un texto con espacios  ");		
		System.out.println(StringBinding.StringMaker(s).get());
	}

}
