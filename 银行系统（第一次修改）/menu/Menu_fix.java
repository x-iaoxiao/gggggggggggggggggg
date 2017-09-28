package menu;

import java.io.IOException;
import java.util.ArrayList;

import basic.Account;
import functions7_fixed.Fixed_addr;
import functions7_fixed.Fixed_name;
import functions7_fixed.Fixed_role;
import functions7_fixed.Fixed_tel;
import tools.Receive;
import tools.Rewrite;

//修改菜单
public class Menu_fix {

	public static void menu_fix(Account user,ArrayList<Account>accounts) throws IOException {
		
		System.out.println("请输入序号以选择您想要获取的服务：");
		System.out.println("【1】修改住址");
		System.out.println("【2】取款身份证信息");
		System.out.println("【3】修改名字");
		System.out.println("【4】修改职业");
		System.out.println("【5】修改电话");

		Receive r5=new Receive();
		
		int c5=Integer.parseInt(r5.receive());
		
		Fixed_addr fixed_addr = new Fixed_addr();
		Fixed_name fixed_name = new Fixed_name();
		Fixed_role fixed_role = new Fixed_role();
		Fixed_tel fixed_tel = new Fixed_tel();
		
		switch(c5) {
		
		case 1://改地址
			
			System.out.println("输入新的地址：");
			
			Receive r6=new Receive();
			
			String str1=r6.receive();
			
			fixed_addr.fix(user, str1);
			
			break;

		case 2://改名字
			
			System.out.println("输入新的姓名：");
			
			Receive r8=new Receive();
			
			String str3=r8.receive();
			
			fixed_name.fix(user, str3);
			
			break;
			
		case 3://改职业
			
			System.out.println("请输入新的职业");
			
			Receive r9=new Receive();
			
			String str4=r9.receive();
			
			fixed_role.fix(user, str4);
			
			break;
			
		case 4://改电话
		
			System.out.println("请输入新的电话：");
			
			Receive r10=new Receive();
			
			String str5=r10.receive();
			
			fixed_tel.fix(user, str5);
			
			break;
		}
		
		 //重写账户表
		
		Rewrite.rewrite(accounts);
		
		System.out.println();
		
		System.out.println("请选择服务：1.继续修改2.返回上一层");
		
		Receive r=new Receive();
		
		if("1".equals(r.receive()))
			
			{
			
			Menu_fix.menu_fix(user,accounts);
			
			}
	}
}
