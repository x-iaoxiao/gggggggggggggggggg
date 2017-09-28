package menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import basic.Account;
import functions5_Loan.C_loan;
import functions5_Loan.Test5;
import tools.Receive;
import tools.Rewrite;

//贷款菜单

public class Menu_loan {

	public static void menu_loan(Account user,ArrayList<Account>accounts,TreeMap<String,Object>map) throws IOException {
	
		C_loan loan = new C_loan();
		
		System.out.println("查询中...");
		
		System.out.println("请选择服务：1.申请贷款    2.使用贷款额度");
		
		Receive r=new Receive();
		
		if("1".equals(r.receive())) {
			
			loan.request_loan(user);
			
			//保存账户的动态信息
			
			Test5.Loan_rewrite1(user,map);
			

            //重写账户表
			
			Rewrite.rewrite(accounts);
			
		}
			
		else {
			
			loan.use_loan(user);
		
		    Test5.Loan_rewrite2(user,map);
		
            //重写账户表
		
		    Rewrite.rewrite(accounts);
		
		}
		
		System.out.println();
		
		System.out.println("请选择服务：1.继续贷款业务2.返回上一层");
		
		Receive rr=new Receive();
		
		if("1".equals(rr.receive()))
			
			{
			
			Menu_loan.menu_loan(user,accounts,map);
			
			}
		
		
}
	
}