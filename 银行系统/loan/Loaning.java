package loan;

import main.Account;
import main.Finaly_;
import main.Receive;
//ʵ�ִ���ܵ���
public class Loaning implements  Loan{

	@Override
	public void request_loan(Account user) {
		double uesd;
		if(user.getBalance()<1000)System.out.println("�������ö�Ȳ��㣬�޷�Ϊ��������");
		else {
			user.setLoan_limit(user.getBalance()*1.2);
			System.out.println("���ѳɹ�����"+user.getLoan_limit()+"Ԫ�����ȣ�");
			System.out.println("�����Ƿ���������������� Y �� N��");
			Receive re=new Receive();
			if(re.receive()=="N") {}
			else {
			System.out.println("���������������벻�������Ĵ����ȣ�");
			Receive r=new Receive();
			   if(Double.valueOf(r.receive())>user.getLoan_limit()) System.out.println("�������");
			   else {
				user.setUsed_limit(Double.valueOf(r.receive()));
				user.setLoan_limit(user.getUsed_limit()-user.getUsed_limit());
				user.setN_repay(Double.valueOf(r.receive()));   
			}
			}
		}
		System.out.println("�˻����"+user.getBalance());
	    System.out.println("������"+user.getLoan_limit());
	    System.out.println("���ö��"+user.getUsed_limit());
	    System.out.println("�������"+user.getN_repay());
//	    System.out.println(""+);
	}

}
