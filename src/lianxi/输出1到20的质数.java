package lianxi;

public class 输出1到20的质数 {

	public static void main(String[] args) {
		
		
		for(int i=2;i<21;i++) {
			boolean f=true;
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
				f=false;
				break;
				
				}
			}
			
			
			if(f) System.out.println(i);
		}
	}
	}

