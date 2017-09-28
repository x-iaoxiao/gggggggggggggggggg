package draw;

import java.util.Date;

import main.Account;

//实现取钱功能的类
public class Drawing implements Draw_money{

	@Override
	public void draw(Account user, double money) {
		
		if(user.getBalance()>=money)
			{
			Date date=new Date();
			user.setBalance(user.getBalance()-money);
			System.out.println(date+"\t支出："+money+"\t卡上余额为："+user.getBalance());
			}
		else System.out.println("卡上余额不足啦，啊哈哈哈哈");
	}

	
}
