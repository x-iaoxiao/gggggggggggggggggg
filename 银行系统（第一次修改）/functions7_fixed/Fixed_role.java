package functions7_fixed;

import basic.Account;
import basic.Function;

public class Fixed_role implements Fixed,Function{

	@Override
	public void fix(Account user, String str) {
	
		user.getPerson().setRole(str);
		
		System.out.println("修改成功！");
		
		System.out.println("修改后新的职业为："+user.getPerson().getRole());
		
	}
	
	

}
