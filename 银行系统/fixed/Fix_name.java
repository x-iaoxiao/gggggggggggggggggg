package fixed;

import main.Account;

public class Fix_name implements Fix{

	@Override
	public void fix(Account user, String str) {
		
		user.getPerson().setName(str);
		System.out.println("新的为姓名："+user.getPerson().getName());
	}

}
