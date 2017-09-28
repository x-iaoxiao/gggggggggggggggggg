package tools;

import java.util.ArrayList;
import java.util.List;

import basic.Account;

//用于存放一些常用的数据，如账户信息、利率等
public class Final_ {

	static final double Loan_rates=0.003;//贷款利率
	
	static final double interest=0.0025;//利息
	
    static List<Account> accounts = new ArrayList<Account>();//账户信息
	
	//获取利率
	static public double getLoan_rates() {
		return Loan_rates;
	}
	
	//获取利息
	static public double interest() {
		return interest;
	}
	
	//获取账户信息
   static public List<Account> Accounts() {
    	
    	GetAccounts getaccounts=GetAccounts.getInstace();
    	
    	accounts=getaccounts.getAccounts();
    	
    	return accounts;
	}
}
