package functions3_transfer;

import java.math.BigDecimal;
import java.util.ArrayList;
import basic.Account;


public interface Transfer {

	public void transfer(Account user,String aim,ArrayList<Account> accounts,BigDecimal money);
	
}
