package tools;

import java.util.ArrayList;
import java.util.List;

import basic.Account;

//���ڴ��һЩ���õ����ݣ����˻���Ϣ�����ʵ�
public class Final_ {

	static final double Loan_rates=0.003;//��������
	
	static final double interest=0.0025;//��Ϣ
	
    static List<Account> accounts = new ArrayList<Account>();//�˻���Ϣ
	
	//��ȡ����
	static public double getLoan_rates() {
		return Loan_rates;
	}
	
	//��ȡ��Ϣ
	static public double interest() {
		return interest;
	}
	
	//��ȡ�˻���Ϣ
   static public List<Account> Accounts() {
    	
    	GetAccounts getaccounts=GetAccounts.getInstace();
    	
    	accounts=getaccounts.getAccounts();
    	
    	return accounts;
	}
}
