package �������;

import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
	String password;
	Scanner sc=new Scanner(System.in);
	password=sc.next();
	int n=password.length();
	char[] pw=password.toCharArray();
	boolean flag1=false;//Сд��ĸ
	boolean flag2=false;//����
	boolean flag3=false;//��д��ĸ
	boolean flag4=false;//�»���
	for(int i=0;i<n;i++) {
		Character pass1=new Character(pw[i]);
//		boolean flag1=false;//Сд��ĸ
//		boolean flag2=false;//��д��ĸ
//		boolean flag3=false;//����
//		boolean flag4=false;//�»���
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
//		boolean flag3=false;//��д��ĸ
		if(Character.isUpperCase(pass3))	
		{
			flag3=true;
			break;
			}
	}
	for(int p=0;p<n;p++) {
		Character pass4=new Character(pw[p]);
//		boolean flag4=false;//�»���
		if(pass4.equals('_'))	
		{
			flag4=true;
			break;
			}
	}
	if(flag1&&flag2&&flag3&&flag4) System.out.println("�ر�ȫ");
	else if((flag1&&flag2&&!flag3&&!flag4)||(flag1&&flag3&&!flag2&&!flag4)||(flag3&&flag2&&!flag1&&!flag4)||(flag4&&flag2&&!flag1&&!flag4)||(flag1&&flag4&&!flag3&&!flag2)||(flag3&&flag4&&!flag1&&!flag2))System.out.println("����ȫ");
	else if((flag1&&!flag2&&!flag3&&!flag4)||(!flag1&&flag2&&!flag3&&!flag4)||(!flag1&&!flag2&&flag3&&!flag4)||(!flag1&&!flag2&&!flag3&&flag4))System.out.println("hin����ȫ");
	else System.out.println("�Ƚϰ�ȫ");
	}
}
