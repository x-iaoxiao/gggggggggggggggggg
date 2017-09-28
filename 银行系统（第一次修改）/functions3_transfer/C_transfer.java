package functions3_transfer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import basic.Account;
import basic.Function;

//转账模块

public class C_transfer implements Transfer,Function{

	Account account;
	@Override
	public void transfer(Account user, String aim, ArrayList<Account> accounts, BigDecimal money) {

			boolean f=false;
			Iterator<Account> it=accounts.iterator();
			while(it.hasNext()) {
				Account temp=it.next();
				String str=temp.getCar_id();
				if(aim.equals(str))
					{
					f=true;
					account=temp;
					break;
					}
			}
			if(f)System.out.println("找到啦，正在检测金额...");
			else System.out.println("目标账户不存在！");
			if(f&&user.getBalance().compareTo(money)!=-1)System.out.println("正在转账...");
			else System.out.println("余额不足，无法为您转账。");
			if(user.getBalance().compareTo(money)!=-1&&f) {
				user.setBalance(user.getBalance().subtract(money));
				account.setBalance(account.getBalance().add(money));
				System.out.println("转账成功！");
				System.out.println("账户余额为："+user.getBalance());
			}

		}

	}


