package 简单工厂;

public class FruitFactory {

	public static Fruit factor(String str) {
		
		if("苹果".equals(str)) return new Apple();
		else if("葡萄".equals(str)) return new Grape();
		    else return null;
		
	}
}
