package lianxi;

public class Lx4_6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
// 在一个有8个整数（18，25，7，36，13，2，89，63）的数组中
		//找出其中最大的数及其下标。
		//（知识点：数组遍历、数组元素访问） [必做题]
		int[] a= {18,25,7,36,13,2,89,63};
		int max=a[0];
		int n=a.length;
		int j=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				j=i;
			}
		}
		System.out.println("最大数为："+max+"其下标"+j);
	}

}
