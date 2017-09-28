package loan;

import main.Account;
import main.Finaly_;
import main.Receive;
//实现贷款功能的类
public class Loaning implements  Loan{

	@Override
	public void request_loan(Account user) {
		double uesd;
		if(user.getBalance()<1000)System.out.println("您的信用额度不足，无法为您办理贷款。");
		else {
			user.setLoan_limit(user.getBalance()*1.2);
			System.out.println("您已成功申请"+user.getLoan_limit()+"元贷款额度！");
			System.out.println("请问是否现在立即贷款？（是 Y 否 N）");
			Receive re=new Receive();
			if(re.receive()=="N") {}
			else {
			System.out.println("请输入贷款金额（它必须不超过您的贷款额度）");
			Receive r=new Receive();
			   if(Double.valueOf(r.receive())>user.getLoan_limit()) System.out.println("输入错误");
			   else {
				user.setUsed_limit(Double.valueOf(r.receive()));
				user.setLoan_limit(user.getUsed_limit()-user.getUsed_limit());
				user.setN_repay(Double.valueOf(r.receive()));   
			}
			}
		}
		System.out.println("账户余额"+user.getBalance());
	    System.out.println("贷款额度"+user.getLoan_limit());
	    System.out.println("已用额度"+user.getUsed_limit());
	    System.out.println("待还金额"+user.getN_repay());
//	    System.out.println(""+);
	}

}
