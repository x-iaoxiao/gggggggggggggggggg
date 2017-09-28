package functions7_fixed;

import basic.Account;
import basic.Function;

public class Fixed_tel implements Fixed,Function{

	@Override
	public void fix(Account user, String str) {
		
		user.getPerson().setTel(str);
		
		System.out.println("修改成功！");
		
		System.out.println("修改后新的电话为："+user.getPerson().getTel());
		
	}

	
}
