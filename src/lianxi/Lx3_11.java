package lianxi;

import java.util.Scanner;

public class Lx3_11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        //һ����������λ��������
		//�����Ǽ�λ��
		//����ӡ��ÿһλ����
		//
		//12345
		 System.out.println("������һ����λ���ڵ�������");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
//		int g=0;
//		int s=0;
//		int b=0;
//		int q=0;
		int w=0;
		for(int i=0;i<5;i++)
		{
			if(num!=0)
			{
				w=num%10;
			    num/=10;
			    System.out.println(w);
			    count++;
			}
			else break;
//			 System.out.println("����һ��"+count+"λ��");
		}
		 System.out.println("����һ��"+count+"λ��");
	}

}
