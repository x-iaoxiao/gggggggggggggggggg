package functions8_request;

import basic.Account;
import basic.Function;

public class C_request implements Request,Function{

	@Override
	public void show_UsreAccount(Account user) {
		
		System.out.println("账号:"+user.getCar_id());
	    System.out.println("持有人:"+user.getPerson());
	    System.out.println("开户银行:"+user.getBank());
	    System.out.println("已用额度:"+user.getUsed_limit());
		System.out.println("账户余额:"+user.getBalance());
	    System.out.println("贷款额度:"+user.getLoan_limit());
	    System.out.println("已用额度:"+user.getUsed_limit());
	    System.out.println("待还金额:"+user.getN_repay());
	    
	}

	@Override
	public void show_Recently(Account user) {
		// TODO 自动生成的方法存根
		
	}

	

	
	
}
