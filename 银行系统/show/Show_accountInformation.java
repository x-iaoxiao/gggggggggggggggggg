package show;

import main.Account;

public class Show_accountInformation implements Show{

	@Override
	public void show(Account user) {
		System.out.println("�˺�:"+user.getCar_id());
	    System.out.println("������:"+user.getPerson());
	    System.out.println("��������:"+user.getBank());
	    System.out.println("���ö��:"+user.getUsed_limit());
		System.out.println("�˻����:"+user.getBalance());
	    System.out.println("������:"+user.getLoan_limit());
	    System.out.println("���ö��:"+user.getUsed_limit());
	    System.out.println("�������:"+user.getN_repay());
	}

	
}
