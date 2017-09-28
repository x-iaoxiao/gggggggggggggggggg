package functions2_draw;

import java.math.BigDecimal;
import java.util.Date;

import basic.Account;
import basic.Function;

//取款模块

public class C_draw implements Draw,Function{

	@Override
	public void draw(Account user, BigDecimal money) {
		
		if(user.getBalance().compareTo(money)==1||user.getBalance().compareTo(money)==0)
		{
		Date date=new Date();
		user.setBalance(user.getBalance().subtract(money));
		System.out.println(date+"\t支出："+money+"\t卡上余额为："+user.getBalance());
		}
	else System.out.println("卡上余额不足啦，啊哈哈哈哈");
		
	}

	
	
}
