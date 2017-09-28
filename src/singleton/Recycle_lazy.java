package singleton;

//¿¡∫∫ Ω

public class Recycle_lazy {

	private static Recycle_lazy lazy;
	
	private Recycle_lazy() {}
	
	public static Recycle_lazy getInstance() {
		
		if(lazy==null) {
			
			lazy=new Recycle_lazy();
		}
		
		return lazy;
	}
}
