package fixed;

import main.Account;

public class Fix_role implements Fix {

	@Override
	public void fix(Account user, String str) {

		user.getPerson().setRole(str);
		System.out.println("�޸ĳɹ���");
		System.out.println("�޸ĺ��µ�ְҵΪ��"+user.getPerson().getRole());
	}

}
