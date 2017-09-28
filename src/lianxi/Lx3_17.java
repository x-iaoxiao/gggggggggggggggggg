package lianxi;

import java.util.Scanner;

public class Lx3_17 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入一个4位数：");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n;
		int[] a= {0,0,0,0};
		for(int i=0;i<4;i++)
		{
			if(num!=0)
			{
				a[i]=num%10;
			   num/=10;
               
			}
			System.out.println(a[i]);
		}
		for(int j=0;j<4;j++)
			{
			for(int k=0;k<3-j;k++)
			{
				a[j]*=10;
			}
			num+=a[j];//求乘方？
			}
    	System.out.println("反转后的数为："+num);
	}

}
