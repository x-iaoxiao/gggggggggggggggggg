package 工厂方法;

public class Test_c {

	public static void main(String[] args) {
		
		Product c;
		
		Factory factory=new IphoneFactory();
		
		c=factory.factory();
		
		

	}

}
