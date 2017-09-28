package lianxi;

public class Zy_8_5_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//求1-100的累加值 但要跳过个位为3的数
		int num=0;
		int i=1;
		for(;i<=100;)
		{
            int j=i%10;
            if(j==3) {i++;continue;}
            else {
            	num=num+i;
            	i++;}
		}
		System.out.println(num);
	}

}
