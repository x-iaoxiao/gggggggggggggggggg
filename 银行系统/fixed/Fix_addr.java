package fixed;

import main.Account;

public class Fix_addr implements Fix{

	@Override
	public void fix(Account user, String str) {

		user.getPerson().setAddr(str);
		System.out.println("�޸ĳɹ���");
		System.out.println("�µ� Ϊ��"+user.getPerson().getAddr());
	}

}
