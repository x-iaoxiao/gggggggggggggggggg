package functions7_fixed;

import basic.Account;
import basic.Function;

public class Fixed_role implements Fixed,Function{

	@Override
	public void fix(Account user, String str) {
	
		user.getPerson().setRole(str);
		
		System.out.println("�޸ĳɹ���");
		
		System.out.println("�޸ĺ��µ�ְҵΪ��"+user.getPerson().getRole());
		
	}
	
	

}
