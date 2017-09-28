package 密码检验;

import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
	String password;
	Scanner sc=new Scanner(System.in);
	password=sc.next();
	int n=password.length();
	char[] pw=password.toCharArray();
	boolean flag1=false;//小写字母
	boolean flag2=false;//数字
	boolean flag3=false;//大写字母
	boolean flag4=false;//下划线
	for(int i=0;i<n;i++) {
		Character pass1=new Character(pw[i]);
//		boolean flag1=false;//小写字母
//		boolean flag2=false;//大写字母
//		boolean flag3=false;//数字
//		boolean flag4=false;//下划线
//		if(Character.isLowerCase(pass))	{flag1=true;continue;}
//		else if(Character.isUpperCase(pass)) {flag2=true;continue;}
//		else if(pass.equals('_')) {flag4=true;continue;}
//		else {
//			for(int j=0;j<=9;j++) {
//				if(pass.equals(j)) {flag3=true;continue;}
//			}
//		}
	
		if(Character.isLowerCase(pass1))	
		{
			flag1=true;
			break;
			}
	}
	for(int j=0;j<n;j++) {
		Character pass2=new Character(pw[j]);
		if(Character.isDigit(pass2))
		{
			flag2=true;
			break;
			}
		}
	for(int k=0;k<n;k++) {
		Character pass3=new Character(pw[k]);
//		boolean flag3=false;//大写字母
		if(Character.isUpperCase(pass3))	
		{
			flag3=true;
			break;
			}
	}
	for(int p=0;p<n;p++) {
		Character pass4=new Character(pw[p]);
//		boolean flag4=false;//下划线
		if(pass4.equals('_'))	
		{
			flag4=true;
			break;
			}
	}
	if(flag1&&flag2&&flag3&&flag4) System.out.println("特别安全");
	else if((flag1&&flag2&&!flag3&&!flag4)||(flag1&&flag3&&!flag2&&!flag4)||(flag3&&flag2&&!flag1&&!flag4)||(flag4&&flag2&&!flag1&&!flag4)||(flag1&&flag4&&!flag3&&!flag2)||(flag3&&flag4&&!flag1&&!flag2))System.out.println("不安全");
	else if((flag1&&!flag2&&!flag3&&!flag4)||(!flag1&&flag2&&!flag3&&!flag4)||(!flag1&&!flag2&&flag3&&!flag4)||(!flag1&&!flag2&&!flag3&&flag4))System.out.println("hin不安全");
	else System.out.println("比较安全");
	}
}
