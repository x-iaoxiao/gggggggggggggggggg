package lianxi;

public class Zy_8_5_7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//while循环100内分别计算奇数偶数的和
		int i=1;
		int sum1=0;
		int sum2=0;
		while(i<=100)
		{
			if(i%2!=0) {sum1=sum1+i;i++;}
			else {sum2=sum2+i;i++;}
		}
		System.out.println("100以内所有奇数和为："+sum1);
		System.out.println("100以内所有偶数和为："+sum2);
		
		
		
	}

}
