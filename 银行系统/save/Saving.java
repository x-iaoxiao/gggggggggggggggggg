package save;

import main.Account;

//ʵ�ִ�Ǯ���ܵ���
public class Saving implements Save{

	@Override
	public void save(Account user, double money) {
		// TODO �Զ����ɵķ������
		System.out.println("���ڴ��....");
		user.setBalance(user.getBalance()+money);
		System.out.println("���ɹ���");
		System.out.println("�ɹ����룺"+money+"Ԫ���������Ϊ��"+user.getBalance());
	}


}
