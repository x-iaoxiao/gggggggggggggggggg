package �򵥹���;

public class FruitFactory {

	public static Fruit factor(String str) {
		
		if("ƻ��".equals(str)) return new Apple();
		else if("����".equals(str)) return new Grape();
		    else return null;
		
	}
}
