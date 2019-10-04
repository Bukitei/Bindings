package dad.javafx.bindings.custom;

import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;

public class TrimBinding extends StringBinding {

	public StringExpression s;
	
	public TrimBinding(StringExpression s) {
		super();
		this.s = s;
		bind(s);
	}
	
	
	@Override
	protected String computeValue() {
		
		String d = s.get().replace("con espacios", "sin espacios");
		
		return d.replace(" ", "");
	}

}
