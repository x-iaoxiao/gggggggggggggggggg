package fixed;

import main.Account;

public class Fix_addr implements Fix{

	@Override
	public void fix(Account user, String str) {

		user.getPerson().setAddr(str);
		System.out.println("修改成功！");
		System.out.println("新的 为："+user.getPerson().getAddr());
	}

}
