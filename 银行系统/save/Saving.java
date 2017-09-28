package save;

import main.Account;

//实现存钱功能的类
public class Saving implements Save{

	@Override
	public void save(Account user, double money) {
		// TODO 自动生成的方法存根
		System.out.println("正在存款....");
		user.setBalance(user.getBalance()+money);
		System.out.println("存款成功！");
		System.out.println("成功存入："+money+"元。存款后余额为："+user.getBalance());
	}


}
