package functions5_Loan;

import java.math.BigDecimal;

import basic.Account;
import basic.Function;
import tools.Receive;

//实现贷款功能的类 包括两个方法 ，申请贷款和使用贷款额度

public class C_loan implements Loan,Function{

	double p=0;//临时值用于比较
	
	@Override
	public void request_loan(Account user) {
			
			//卡上余额不小于1000，可以或得余额1.2倍的贷款额度
			if(user.getBalance().subtract(user.getN_repay()).compareTo(BigDecimal.valueOf(1000))==-1/*&&user.getN_repay().compareTo(BigDecimal.valueOf(p))==0*/)System.out.println("您的信用额度不足，无法为您办理贷款。");
			
			else {
				
			
			user.setLoan_limit(user.getBalance().multiply(BigDecimal.valueOf(1.2)).add(user.getLoan_limit()));
			
			System.out.println("您现在的可用贷款额度为："+user.getLoan_limit());
			
			}
			
		}
		

	
	public void use_loan(Account user) {
	
			System.out.println("请问是否现在立即贷款？(是 Y 否 N)");
			
			Receive re=new Receive();
			
			if(re.receive()=="N") {}
			
			else {
				
			System.out.println("请输入贷款金额（它必须不超过您的可使用额度）");
			
			Receive rr=new Receive();
			
			String temp1=rr.receive();
			Double temp2=Double.valueOf(temp1);
			double temp=temp2.doubleValue();
			
			   if(BigDecimal.valueOf(temp).compareTo(user.getLoan_limit())==1) System.out.println("输入错误");
			   
			   else {
				   
				user.setUsed_limit(BigDecimal.valueOf(temp));
				user.setLoan_limit(user.getLoan_limit().subtract(BigDecimal.valueOf(temp)));
				user.setN_repay(BigDecimal.valueOf(temp).add(user.getN_repay()));   
				
			}
			
			    System.out.println("本次使用额度"+user.getUsed_limit());
			    System.out.println();
			    System.out.println("待还金额"+user.getN_repay());
			
			}
		}
    
}
	

