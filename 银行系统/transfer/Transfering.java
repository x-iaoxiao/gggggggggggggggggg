package transfer;

import java.util.ArrayList;
import java.util.Iterator;

import main.Account;

//����ʵ��ת�˹��ܵ���
public class Transfering implements Transfer {

	Account ac;
	@Override
	public void transfer(Account user, String aim, ArrayList<Account> accounts,double money) {
		boolean f=false;
		Iterator<Account> it=accounts.iterator();
		while(it.hasNext()) {
			Account temp=it.next();
			String str=temp.getPerson().getId();
			if(aim.equals(str))
				{
				f=true;
				ac=temp;
				break;
				}
			else f=false;
		}
		if(f)System.out.println("�ҵ��������ڼ����...");
		else System.out.println("Ŀ���˻������ڣ�");
		if(f&&user.getBalance()>money)System.out.println("����ת��...");
		else System.out.println("���㣬�޷�Ϊ��ת�ˡ�");
		if(user.getBalance()>money&&f) {
			user.setBalance(user.getBalance()-money);
			ac.setBalance(ac.getBalance()+money);
			System.out.println("ת�˳ɹ���");
			System.out.println("�˻����Ϊ��"+user.getBalance());
		}
	}

	
}
