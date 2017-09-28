package functions1_save;

import java.math.BigDecimal;

import basic.Account;
import basic.Function;

//存款模块

public class C_save implements Save,Function{

	@Override
	public void save(Account user, BigDecimal money) {
    
		System.out.println("正在存款....");
		
		user.setBalance(user.getBalance().add(money));
		
		System.out.println("存款成功！");
		
		System.out.println("成功存入："+money+"元。存款后余额为："+user.getBalance());
		
		
		
	}

}
