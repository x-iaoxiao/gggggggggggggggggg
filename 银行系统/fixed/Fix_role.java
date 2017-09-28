package fixed;

import main.Account;

public class Fix_role implements Fix {

	@Override
	public void fix(Account user, String str) {

		user.getPerson().setRole(str);
		System.out.println("修改成功！");
		System.out.println("修改后新的职业为："+user.getPerson().getRole());
	}

}
