package lianxi;

public class Lx3_16 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//编写一个程序 找出大于200的最小质数
		int a=0;
		for(int i=200;;i++)
		{
			for(int j=2;j<i;j++) 
			{
				if(i%j==0||j==i)break;
				a=j;
			}
			if(a==i) {System.out.println(i);break;}
		}
	}

}
