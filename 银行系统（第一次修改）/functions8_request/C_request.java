package functions8_request;

import basic.Account;
import basic.Function;

public class C_request implements Request,Function{

	@Override
	public void show_UsreAccount(Account user) {
		
		System.out.println("�˺�:"+user.getCar_id());
	    System.out.println("������:"+user.getPerson());
	    System.out.println("��������:"+user.getBank());
	    System.out.println("���ö��:"+user.getUsed_limit());
		System.out.println("�˻����:"+user.getBalance());
	    System.out.println("������:"+user.getLoan_limit());
	    System.out.println("���ö��:"+user.getUsed_limit());
	    System.out.println("�������:"+user.getN_repay());
	    
	}

	@Override
	public void show_Recently(Account user) {
		// TODO �Զ����ɵķ������
		
	}

	

	
	
}
