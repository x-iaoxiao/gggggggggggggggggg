package menu;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

import functions1_save.*;
import functions2_draw.*;
import functions3_transfer.*;
import functions4_query.*;
import functions5_Loan.*;
import functions6_repay.*;
import functions7_fixed.*;
import loan.Loaning;
import tools.Receive;
import tools.Rewrite;
import basic.Account;
import save.Saving;
import show.Show_accountInformation;
import transfer.Transfering;

//���˵�

public class Menu {

	C_save save = new C_save();
	C_draw draw = new C_draw();
	C_transfer transfer = new C_transfer();
	C_query query = new C_query();
	C_Repay repay = new C_Repay();
	Fixed_addr fixed_addr = new Fixed_addr();
	Fixed_name fixed_name = new Fixed_name();
	Fixed_role fixed_role = new Fixed_role();
	Fixed_tel fixed_tel = new Fixed_tel();
			
	public void active(Account user,ArrayList<Account>accounts,TreeMap<String,Object>map) throws IOException{
		
		//�˵�����
		System.out.println();
		System.out.println();
		System.out.println("------------------��ӭ��������ϵͳ----------------");
		System.out.println("�����������ѡ������Ҫ��ȡ�ķ���");
		System.out.println("��1��ʵʱ���");
		System.out.println("��2��ȡ��");
		System.out.println("��3����ѯ");
		System.out.println("��4��ת��");
		System.out.println("��5������ҵ��");
		System.out.println("��6����������");
		System.out.println("��7�������˻�");
		System.out.println("��8���޸ĸ�����Ϣ");
		System.out.println("��9����ȫ�˳�");
		
		//ѡ��ҵ��
		
		//���ܼ���ָ��
		Receive receive=new Receive();
		
		Integer m=Integer.valueOf(receive.receive());
		
		int n=m.intValue();
		
		//����Ӽ��̽ӵ���ָ��
		switch(n) {
		
		case 1://���
			
			System.out.println("�������");
			
			Receive r1=new Receive();
			
			BigDecimal c1=BigDecimal.valueOf(Double.parseDouble(r1.receive()));
			
			save.save(user, c1);
			
			//��д�˻���
			
			Rewrite.rewrite(accounts);
			
			//�����˻��Ķ�̬��Ϣ
			
			Test.Save_rewrite(user, c1,map);
			
			break;
			
		case 2://ȡ��
			
			System.out.println("����ȡ���");
			
			Receive r2=new Receive();
			
			BigDecimal c2=BigDecimal.valueOf(Double.parseDouble(r2.receive()));
		
			draw.draw(user, c2);
			
            //��д�˻���
			
			Rewrite.rewrite(accounts);
			
			//�����˻��Ķ�̬��Ϣ
			
			Test2.Draw_rewrite(user, c2, map);
			
			break;
			
		case 3://��ѯ
			
			query.show_account(user);
			
			query.show_recently(user);
			
			break;
			
		case 4://ת��
			
			System.out.println("������Ŀ���˻���");
			
			Receive r3=new Receive();
			
			String c3=r3.receive();
			
			System.out.println("��ת�˽�");
			
			Receive r4=new Receive();
			
			BigDecimal c4=BigDecimal.valueOf(Double.parseDouble(r4.receive()));
			
			transfer.transfer(user,c3,accounts,c4);
			
            //��д�˻���
			
			Rewrite.rewrite(accounts);
			
			
			//�����˻��Ķ�̬��Ϣ

			Transfer_recard.recard(user,c3,c4,map);
			
			break;
			
		case 5://����
			
			Menu_loan.menu_loan(user, accounts, map);
			
			break;
			
		case 6://����
			
			//�����˻��Ķ�̬��Ϣ

			Repay_recard.recard(user);
			
            //��д�˻���
			
			Rewrite.rewrite(accounts);
			
			break;
			
		case 7://�����˻�
			
			break;
			
		case 8://�޸���Ϣ
			
			{
				
				Menu_fix.menu_fix(user, accounts);
			
			}
			
			break;
			
		case 9 :
			
			user=null;
			
		}
	}
}
