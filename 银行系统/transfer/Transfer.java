package transfer;

import java.util.ArrayList;

import main.Account;

//ת�˽ӿ�
public interface Transfer {

	public void transfer(Account user,String aim,ArrayList<Account> account,double money);

}
