package functions1_save;

import java.math.BigDecimal;

import basic.Account;
import basic.Function;

//���ģ��

public class C_save implements Save,Function{

	@Override
	public void save(Account user, BigDecimal money) {
    
		System.out.println("���ڴ��....");
		
		user.setBalance(user.getBalance().add(money));
		
		System.out.println("���ɹ���");
		
		System.out.println("�ɹ����룺"+money+"Ԫ���������Ϊ��"+user.getBalance());
		
		
		
	}

}
