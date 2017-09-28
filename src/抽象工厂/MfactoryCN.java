package ³éÏó¹¤³§;

public class MfactoryCN implements Mfactory{
	
	public Aclass factoryA() {
		
		return new AclassCN();
		
	}

	public Bclass factoryB() {
		
		return new BclassCN();
		
	}
}
