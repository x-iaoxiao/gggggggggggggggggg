package fixed;

import main.Account;

public class Fix_tel implements Fix{

	@Override
	public void fix(Account user, String str) {
	
		user.getPerson().setTel(str);
		System.out.println("�޸ĳɹ���");
		System.out.println("�޸ĺ��µĵ绰Ϊ��"+user.getPerson().getTel());
	}

	
}
