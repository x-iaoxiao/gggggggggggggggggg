package 工厂方法;

public class IphoneFactory implements Factory{

	@Override
	public Product factory() {
		
		return new Iphone();
	}

	
}
