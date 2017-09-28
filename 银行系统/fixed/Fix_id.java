package fixed;

import main.Account;

public class Fix_id implements Fix{

	@Override
	public void fix(Account user, String str) {

		user.getPerson().setId(str);
		System.out.println("修改成功！");
		System.out.println("新的身份证号为："+user.getPerson().getId());
	}

}
