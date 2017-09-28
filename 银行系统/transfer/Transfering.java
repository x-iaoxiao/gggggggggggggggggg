package transfer;

import java.util.ArrayList;
import java.util.Iterator;

import main.Account;

//用于实现转账功能的类
public class Transfering implements Transfer {

	Account ac;
	@Override
	public void transfer(Account user, String aim, ArrayList<Account> accounts,double money) {
		boolean f=false;
		Iterator<Account> it=accounts.iterator();
		while(it.hasNext()) {
			Account temp=it.next();
			String str=temp.getPerson().getId();
			if(aim.equals(str))
				{
				f=true;
				ac=temp;
				break;
				}
			else f=false;
		}
		if(f)System.out.println("找到啦，正在检测金额...");
		else System.out.println("目标账户不存在！");
		if(f&&user.getBalance()>money)System.out.println("正在转账...");
		else System.out.println("余额不足，无法为您转账。");
		if(user.getBalance()>money&&f) {
			user.setBalance(user.getBalance()-money);
			ac.setBalance(ac.getBalance()+money);
			System.out.println("转账成功！");
			System.out.println("账户余额为："+user.getBalance());
		}
	}

	
}
