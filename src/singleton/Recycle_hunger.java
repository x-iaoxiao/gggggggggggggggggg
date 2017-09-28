package singleton;

//¶öººÊ½

public class Recycle_hunger {

	private static Recycle_hunger hunger=new Recycle_hunger();
	
	private Recycle_hunger() {}
	
	public static Recycle_hunger getInstance() {
	
		return hunger;
		
	}
}
