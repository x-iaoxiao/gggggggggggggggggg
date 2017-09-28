package singleton;

public class Test_single {

	public static void main(String[] args) {
		

		Recycle_hunger h1=Recycle_hunger.getInstance();
		Recycle_hunger h2=Recycle_hunger.getInstance();
		Recycle_lazy l1=Recycle_lazy.getInstance();
		System.out.println(h1==h2);

	}

}
