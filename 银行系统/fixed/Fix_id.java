package fixed;

import main.Account;

public class Fix_id implements Fix{

	@Override
	public void fix(Account user, String str) {

		user.getPerson().setId(str);
		System.out.println("�޸ĳɹ���");
		System.out.println("�µ����֤��Ϊ��"+user.getPerson().getId());
	}

}
