package functions2_draw;

import java.math.BigDecimal;
import java.util.Date;

import basic.Account;
import basic.Function;

//ȡ��ģ��

public class C_draw implements Draw,Function{

	@Override
	public void draw(Account user, BigDecimal money) {
		
		if(user.getBalance().compareTo(money)==1||user.getBalance().compareTo(money)==0)
		{
		Date date=new Date();
		user.setBalance(user.getBalance().subtract(money));
		System.out.println(date+"\t֧����"+money+"\t�������Ϊ��"+user.getBalance());
		}
	else System.out.println("����������������������");
		
	}

	
	
}
