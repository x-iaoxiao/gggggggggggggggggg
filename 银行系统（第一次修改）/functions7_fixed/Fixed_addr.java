package functions7_fixed;

import basic.Account;
import basic.Function;

public class Fixed_addr implements Fixed,Function{

	@Override
	public void fix(Account user, String str) {
		
		user.getPerson().setAddr(str);
		
		System.out.println("�޸ĳɹ���");
		
		System.out.println("�µĵ�ַΪ��"+user.getPerson().getAddr());
		
	}

}
