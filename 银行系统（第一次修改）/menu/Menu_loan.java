package menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import basic.Account;
import functions5_Loan.C_loan;
import functions5_Loan.Test5;
import tools.Receive;
import tools.Rewrite;

//����˵�

public class Menu_loan {

	public static void menu_loan(Account user,ArrayList<Account>accounts,TreeMap<String,Object>map) throws IOException {
	
		C_loan loan = new C_loan();
		
		System.out.println("��ѯ��...");
		
		System.out.println("��ѡ�����1.�������    2.ʹ�ô�����");
		
		Receive r=new Receive();
		
		if("1".equals(r.receive())) {
			
			loan.request_loan(user);
			
			//�����˻��Ķ�̬��Ϣ
			
			Test5.Loan_rewrite1(user,map);
			

            //��д�˻���
			
			Rewrite.rewrite(accounts);
			
		}
			
		else {
			
			loan.use_loan(user);
		
		    Test5.Loan_rewrite2(user,map);
		
            //��д�˻���
		
		    Rewrite.rewrite(accounts);
		
		}
		
		System.out.println();
		
		System.out.println("��ѡ�����1.��������ҵ��2.������һ��");
		
		Receive rr=new Receive();
		
		if("1".equals(rr.receive()))
			
			{
			
			Menu_loan.menu_loan(user,accounts,map);
			
			}
		
		
}
	
}