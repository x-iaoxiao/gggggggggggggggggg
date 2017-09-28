package load;

import java.util.ArrayList;
import java.util.Iterator;

import main.Account;//导入账户类
import main.Receive;//导入从键盘接受信息类

//实现登录功能的类
public class Loading {

	Account account;
	public Account load(ArrayList<Account> accounts) {
		//提示信息
		System.out.println("请输入您的账号：（身份证号）");
		//接受语句
		Receive recv1=new Receive();
		//敬从键盘接收到的信息保存
		String card=recv1.receive();
		//处理接收到的信息
		Object obj=(Object)accounts;
		//设置标志
        Boolean flag=false;
        Boolean f=false;
        //检查登录账户是否存在，对参数账户表进行遍历
        for(Account ac:accounts) {
        	//输入信息等于卡号或者身份证号返回存在
        	if(ac.getCar_id().equals(card)||ac.getPerson().getId().equals(card))flag=true;
        	account=ac;
        	break;
        }
        
        //如果不存在
	    if(!flag)
	    	{
	    	System.out.println("输入了一个假的账号！账号不存在！！！！！刷新后继续输入");
	    	account=null;
	    	}
	    //账户存在
	    else {
		   for(int i=1;i<4;i++) 
		   {
		   System.out.println("请输入密码：");
		   Receive recv2=new Receive();
			String key=recv2.receive();
			
			if(account.getKeyword().equals(key))
				{
				System.out.println("登录成功！");
				f=true;
				break;
				}
			
			else 
				{
				System.out.println("密码不正确，你还有"+(3-i)+"次机会重新输入密码");
				if(3-i==0) {
					System.out.println("你已经3次输错，系统即将自动退出！！！");
					account=null;	
				}
				}
		    }
	       }
		return account;
}
}
