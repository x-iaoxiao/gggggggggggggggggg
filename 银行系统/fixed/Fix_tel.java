package fixed;

import main.Account;

public class Fix_tel implements Fix{

	@Override
	public void fix(Account user, String str) {
	
		user.getPerson().setTel(str);
		System.out.println("修改成功！");
		System.out.println("修改后新的电话为："+user.getPerson().getTel());
	}

	
}
