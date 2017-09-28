package functions7_fixed;

import basic.Account;
import basic.Function;

public class Fixed_name implements Fixed,Function{

	@Override
	public void fix(Account user, String str) {
		
		user.getPerson().setName(str);
		
		System.out.println("新的姓名为："+user.getPerson().getName());
		
	}

}
