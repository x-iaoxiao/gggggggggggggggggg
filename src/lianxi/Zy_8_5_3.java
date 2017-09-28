package lianxi;

public class Zy_8_5_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//菱形
		for(int i=0;i<5;i++) {
		for(int j=0;j<7;j++) {
			if(i==0||i==4||j==0||j==6||i>j||j>=i+3){System.out.print("\t-");}
			else {System.out.print("\t*");}
		}
		System.out.print("\n\r");
		}
	}

}
