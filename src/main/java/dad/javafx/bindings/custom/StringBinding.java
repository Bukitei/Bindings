package dad.javafx.bindings.custom;

import javafx.beans.binding.StringExpression;

public class StringBinding {

	public static TrimBinding StringMaker(StringExpression s) {
		return new TrimBinding(s);
		
	}
	
}
