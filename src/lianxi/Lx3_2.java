package lianxi;

import java.util.Scanner;

public class Lx3_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        //����һ���ɼ�aʹ��switch�ṹ������ĵȼ�
		//A   90-100
		//B   80-89
		//C   70-79
		//D   60-69
		//E   0-59
		Scanner sc = new Scanner(System.in);
		System.out.println("�����a��ֵ");
		int a=sc.nextInt();
		int n=a/10;
		switch(n)
		{
		case 0 :
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
			System.out.println("a="+a+",���ĵȼ�ΪE");break;
		case 6 :
			System.out.println("a="+a+",���ĵȼ�ΪD");break;
		case 7 :
			System.out.println("a="+a+",���ĵȼ�ΪC");break;
		case 8 :
			System.out.println("a="+a+",���ĵȼ�ΪB");break;
		case 9 :
		case 10 :
			System.out.println("a="+a+",���ĵȼ�ΪA");break;
			
		}
		
		
	}

}
