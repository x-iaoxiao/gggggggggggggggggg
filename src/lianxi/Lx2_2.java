package lianxi;

public class Lx2_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//2、给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除（知识点：变量和运算符综合应用） [必做题]
       int a=345;
       int a1=a%10;//5
       int a2=(a/10)%10;//4
       int a3=a/100;
       System.out.println("a=345,它的各位数分别为："+a3+","+a2+","+a1);
       System.out.println("各位数之和为："+(a1+a2+a3));
	}

}
