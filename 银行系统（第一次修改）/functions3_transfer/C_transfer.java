package functions3_transfer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import basic.Account;
import basic.Function;

//ת��ģ��

public class C_transfer implements Transfer,Function{

	Account account;
	@Override
	public void transfer(Account user, String aim, ArrayList<Account> accounts, BigDecimal money) {

			boolean f=false;
			Iterator<Account> it=accounts.iterator();
			while(it.hasNext()) {
				Account temp=it.next();
				String str=temp.getCar_id();
				if(aim.equals(str))
					{
					f=true;
					account=temp;
					break;
					}
			}
			if(f)System.out.println("�ҵ��������ڼ����...");
			else System.out.println("Ŀ���˻������ڣ�");
			if(f&&user.getBalance().compareTo(money)!=-1)System.out.println("����ת��...");
			else System.out.println("���㣬�޷�Ϊ��ת�ˡ�");
			if(user.getBalance().compareTo(money)!=-1&&f) {
				user.setBalance(user.getBalance().subtract(money));
				account.setBalance(account.getBalance().add(money));
				System.out.println("ת�˳ɹ���");
				System.out.println("�˻����Ϊ��"+user.getBalance());
			}

		}

	}


