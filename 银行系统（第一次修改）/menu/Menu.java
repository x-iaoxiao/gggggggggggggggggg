package menu;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

import functions1_save.*;
import functions2_draw.*;
import functions3_transfer.*;
import functions4_query.*;
import functions5_Loan.*;
import functions6_repay.*;
import functions7_fixed.*;
import loan.Loaning;
import tools.Receive;
import tools.Rewrite;
import basic.Account;
import save.Saving;
import show.Show_accountInformation;
import transfer.Transfering;

//主菜单

public class Menu {

	C_save save = new C_save();
	C_draw draw = new C_draw();
	C_transfer transfer = new C_transfer();
	C_query query = new C_query();
	C_Repay repay = new C_Repay();
	Fixed_addr fixed_addr = new Fixed_addr();
	Fixed_name fixed_name = new Fixed_name();
	Fixed_role fixed_role = new Fixed_role();
	Fixed_tel fixed_tel = new Fixed_tel();
			
	public void active(Account user,ArrayList<Account>accounts,TreeMap<String,Object>map) throws IOException{
		
		//菜单界面
		System.out.println();
		System.out.println();
		System.out.println("------------------欢迎进入银行系统----------------");
		System.out.println("请输入序号以选择您想要获取的服务：");
		System.out.println("【1】实时存款");
		System.out.println("【2】取款");
		System.out.println("【3】查询");
		System.out.println("【4】转账");
		System.out.println("【5】贷款业务");
		System.out.println("【6】主动还款");
		System.out.println("【7】申请账户");
		System.out.println("【8】修改个人信息");
		System.out.println("【9】安全退出");
		
		//选择业务
		
		//接受键盘指令
		Receive receive=new Receive();
		
		Integer m=Integer.valueOf(receive.receive());
		
		int n=m.intValue();
		
		//处理从键盘接到的指令
		switch(n) {
		
		case 1://存款
			
			System.out.println("输入存款金额：");
			
			Receive r1=new Receive();
			
			BigDecimal c1=BigDecimal.valueOf(Double.parseDouble(r1.receive()));
			
			save.save(user, c1);
			
			//重写账户表
			
			Rewrite.rewrite(accounts);
			
			//保存账户的动态信息
			
			Test.Save_rewrite(user, c1,map);
			
			break;
			
		case 2://取款
			
			System.out.println("输入取款金额：");
			
			Receive r2=new Receive();
			
			BigDecimal c2=BigDecimal.valueOf(Double.parseDouble(r2.receive()));
		
			draw.draw(user, c2);
			
            //重写账户表
			
			Rewrite.rewrite(accounts);
			
			//保存账户的动态信息
			
			Test2.Draw_rewrite(user, c2, map);
			
			break;
			
		case 3://查询
			
			query.show_account(user);
			
			query.show_recently(user);
			
			break;
			
		case 4://转账
			
			System.out.println("请输入目标账户：");
			
			Receive r3=new Receive();
			
			String c3=r3.receive();
			
			System.out.println("请转账金额：");
			
			Receive r4=new Receive();
			
			BigDecimal c4=BigDecimal.valueOf(Double.parseDouble(r4.receive()));
			
			transfer.transfer(user,c3,accounts,c4);
			
            //重写账户表
			
			Rewrite.rewrite(accounts);
			
			
			//保存账户的动态信息

			Transfer_recard.recard(user,c3,c4,map);
			
			break;
			
		case 5://贷款
			
			Menu_loan.menu_loan(user, accounts, map);
			
			break;
			
		case 6://还款
			
			//保存账户的动态信息

			Repay_recard.recard(user);
			
            //重写账户表
			
			Rewrite.rewrite(accounts);
			
			break;
			
		case 7://申请账户
			
			break;
			
		case 8://修改信息
			
			{
				
				Menu_fix.menu_fix(user, accounts);
			
			}
			
			break;
			
		case 9 :
			
			user=null;
			
		}
	}
}
