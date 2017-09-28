package functions7_fixed;

import basic.Account;
import basic.Function;

public class Fixed_addr implements Fixed,Function{

	@Override
	public void fix(Account user, String str) {
		
		user.getPerson().setAddr(str);
		
		System.out.println("修改成功！");
		
		System.out.println("新的地址为："+user.getPerson().getAddr());
		
	}

}
