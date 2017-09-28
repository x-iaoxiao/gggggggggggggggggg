package main;

import java.util.ArrayList;

import draw.Drawing;
import fixed.*;
import load.Loading;
import loan.Loaning;
import save.Saving;
import show.Show_accountInformation;
import transfer.Transfering;

//bank测试程序
public class Test_bank {
	
	
	
	
	
	static public void main(String[] args) {
	//创建一个集合用来存放所有的账户信息
    ArrayList<Account> accounts=new ArrayList<Account>();
    //创建测试用户初始化银行系统
    Person p1=new Person("140121199702190001","常潇","15735104420","山西太原","学生");
    Person p2=new Person("140121199601060002","田野","15735104385","山西太原","学生");
    Person p3=new Person("140121200309070003","常越","18334777116","山西太原","学生");
    Account account1=new Account("建设银行","123456",p1,1000);
    Account account2=new Account("建设银行","123456",p2,1000);
    Account account3=new Account("建设银行","123456",p3,1000);
    accounts.add(account1);
    accounts.add(account2);
    accounts.add(account3); 
    //提示信息	
	System.out.println("请先登录：");	
	//系统登录
//	Loading load=new Loading();
//	Account user=load.load(accounts);
//	Receive r1=new Receive();
//	Integer b=Integer.valueOf(r1.receive());
//	int a=b.intValue();
	//登录成功后进入主界面
	Account user=account1;
	
	System.out.println("------------------欢迎进入银行系统----------------");
	System.out.println("请输入序号以选择您想要获取的服务：");
	
	System.out.println("【1】实时存款");
	System.out.println("【2】取款");
	System.out.println("【3】查询");
	System.out.println("【4】转账");
	System.out.println("【5】贷款申请");
	System.out.println("【6】主动还款");
	System.out.println("【7】申请账户");
	System.out.println("【8】修改个人信息");
	///////////////////////////////////////////////
	Receive r1=new Receive();
	Integer b=Integer.valueOf(r1.receive());
	int a=b.intValue();
	/////////////////////////////////////
	//菜单
	switch(a) {
	
	case 1://存款
		System.out.println("输入存款金额：");
		Saving s=new Saving();
		Receive r3=new Receive();
		double c2=Double.parseDouble(r3.receive());
		s.save(user, c2);
		break;
	case 2://取款
		System.out.println("输入取款金额：");
		Drawing d=new Drawing();
		Receive r2=new Receive();
		double c1=Double.parseDouble(r2.receive());
		d.draw(user, c1);
		break;
	case 3://查询
		Show_accountInformation so=new Show_accountInformation();
//		Receive r4=new Receive();
//		double c3=Double.parseDouble(r4.receive());
		so.show(user);
		break;
	case 4://转账
		System.out.println("请输入目标账户：");
		Transfering t=new Transfering();
		Receive r6=new Receive();
		String c5=r6.receive();
		System.out.println("请转账金额：");
		Receive r5=new Receive();
		double c4=Double.parseDouble(r5.receive());
//		Receive r6=new Receive();
//		String c5=r6.receive();
		t.transfer(user,c5,accounts,c4);
		break;
	case 5://贷款
		Loaning l=new Loaning();
//		Receive r7=new Receive();
//		double c6=Double.parseDouble(r7.receive());
		System.out.println("查询中...");
		l.request_loan(user);
		break;
	case 6://还款
		break;
	case 7://申请账户
		break;
	case 8://修改信息
		{
			System.out.println("请输入序号以选择您想要获取的服务：");
			System.out.println("【1】修改住址");
			System.out.println("【2】取款身份证信息");
			System.out.println("【3】修改名字");
			System.out.println("【4】修改职业");
			System.out.println("【5】修改电话");
			Receive r8=new Receive();
			int c7=Integer.parseInt(r8.receive());
			switch(c7) {
			case 1://改地址
				Fix_addr fa=new Fix_addr();
				System.out.println("输入新的地址：");
				Receive r9=new Receive();
				String str1=r9.receive();
				fa.fix(user, str1);
				break;
			case 2://改id
				Fix_id fi=new Fix_id();
				System.out.println("输入新的身份证号：");
				Receive r10=new Receive();
				String str2=r10.receive();
				fi.fix(user, str2);
				break;
			case 3://改名字
				Fix_name fn=new Fix_name();
				System.out.println("输入新的姓名：");
				Receive r11=new Receive();
				String str3=r11.receive();
				fn.fix(user, str3);
				break;
			case 4://改职业
				Fix_role fr=new Fix_role();
				System.out.println("请输入新的职业");
				Receive r12=new Receive();
				String str4=r12.receive();
				fr.fix(user, str4);
				break;
			case 5://改电话
				Fix_tel ft=new Fix_tel();
				System.out.println("请输入新的电话：");
				Receive r13=new Receive();
				String str5=r13.receive();
				ft.fix(user, str5);
				break;
			}
		}
	}

//	for(Account a:accounts)System.out.println(a);
	
	}
}
