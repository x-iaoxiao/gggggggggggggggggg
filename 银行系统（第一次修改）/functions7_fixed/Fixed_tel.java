package functions7_fixed;

import basic.Account;
import basic.Function;

public class Fixed_tel implements Fixed,Function{

	@Override
	public void fix(Account user, String str) {
		
		user.getPerson().setTel(str);
		
		System.out.println("�޸ĳɹ���");
		
		System.out.println("�޸ĺ��µĵ绰Ϊ��"+user.getPerson().getTel());
		
	}

	
}
