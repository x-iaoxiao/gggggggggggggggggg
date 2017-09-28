package 简单工厂;

public class Customer {

	public static void main(String[] args) {
		
		FruitFactory f=new FruitFactory();
		Fruit 苹果;
		苹果=f.factor("苹果");
		System.out.println(苹果);
	}

}
