package functions5_Loan;

import java.math.BigDecimal;

import basic.Account;
import basic.Function;
import tools.Receive;

//ʵ�ִ���ܵ��� ������������ ����������ʹ�ô�����

public class C_loan implements Loan,Function{

	double p=0;//��ʱֵ���ڱȽ�
	
	@Override
	public void request_loan(Account user) {
			
			//������С��1000�����Ի�����1.2���Ĵ�����
			if(user.getBalance().subtract(user.getN_repay()).compareTo(BigDecimal.valueOf(1000))==-1/*&&user.getN_repay().compareTo(BigDecimal.valueOf(p))==0*/)System.out.println("�������ö�Ȳ��㣬�޷�Ϊ��������");
			
			else {
				
			
			user.setLoan_limit(user.getBalance().multiply(BigDecimal.valueOf(1.2)).add(user.getLoan_limit()));
			
			System.out.println("�����ڵĿ��ô�����Ϊ��"+user.getLoan_limit());
			
			}
			
		}
		

	
	public void use_loan(Account user) {
	
			System.out.println("�����Ƿ������������(�� Y �� N)");
			
			Receive re=new Receive();
			
			if(re.receive()=="N") {}
			
			else {
				
			System.out.println("���������������벻�������Ŀ�ʹ�ö�ȣ�");
			
			Receive rr=new Receive();
			
			String temp1=rr.receive();
			Double temp2=Double.valueOf(temp1);
			double temp=temp2.doubleValue();
			
			   if(BigDecimal.valueOf(temp).compareTo(user.getLoan_limit())==1) System.out.println("�������");
			   
			   else {
				   
				user.setUsed_limit(BigDecimal.valueOf(temp));
				user.setLoan_limit(user.getLoan_limit().subtract(BigDecimal.valueOf(temp)));
				user.setN_repay(BigDecimal.valueOf(temp).add(user.getN_repay()));   
				
			}
			
			    System.out.println("����ʹ�ö��"+user.getUsed_limit());
			    System.out.println();
			    System.out.println("�������"+user.getN_repay());
			
			}
		}
    
}
	

