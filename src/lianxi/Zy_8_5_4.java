package lianxi;

import java.util.Scanner;
public class Zy_8_5_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("�����룺");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=1;
		for(int i=1;i<=n;i++) {s*=i;}
		System.out.println(n+"!="+s);
	}

}
