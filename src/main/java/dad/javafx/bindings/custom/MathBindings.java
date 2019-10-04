package dad.javafx.bindings.custom;

import javafx.beans.binding.DoubleExpression;
import javafx.beans.property.SimpleDoubleProperty;

public class MathBindings {

	public static PowBinding pow(DoubleExpression b, DoubleExpression e) {
		
		
		return new PowBinding(b, e);
		
	}
	
	public static PowBinding pow(DoubleExpression b, Double e) {
		return new PowBinding(b, new SimpleDoubleProperty(e));
	}
	
	public static PowBinding pow(Double b, DoubleExpression e) {
		return new PowBinding(new SimpleDoubleProperty(b), e);
	}
	
	public static PowBinding pow(DoubleExpression b, int e) {
		return new PowBinding(b, new SimpleDoubleProperty(Double.valueOf(e)));
	}
	
	public static SqrtBinding SquareRoot(DoubleExpression n) {
		return new SqrtBinding(n);
	}
	
	
}
