package menu;

import java.io.IOException;
import java.util.ArrayList;

import basic.Account;
import functions7_fixed.Fixed_addr;
import functions7_fixed.Fixed_name;
import functions7_fixed.Fixed_role;
import functions7_fixed.Fixed_tel;
import tools.Receive;
import tools.Rewrite;

//�޸Ĳ˵�
public class Menu_fix {

	public static void menu_fix(Account user,ArrayList<Account>accounts) throws IOException {
		
		System.out.println("�����������ѡ������Ҫ��ȡ�ķ���");
		System.out.println("��1���޸�סַ");
		System.out.println("��2��ȡ�����֤��Ϣ");
		System.out.println("��3���޸�����");
		System.out.println("��4���޸�ְҵ");
		System.out.println("��5���޸ĵ绰");

		Receive r5=new Receive();
		
		int c5=Integer.parseInt(r5.receive());
		
		Fixed_addr fixed_addr = new Fixed_addr();
		Fixed_name fixed_name = new Fixed_name();
		Fixed_role fixed_role = new Fixed_role();
		Fixed_tel fixed_tel = new Fixed_tel();
		
		switch(c5) {
		
		case 1://�ĵ�ַ
			
			System.out.println("�����µĵ�ַ��");
			
			Receive r6=new Receive();
			
			String str1=r6.receive();
			
			fixed_addr.fix(user, str1);
			
			break;

		case 2://������
			
			System.out.println("�����µ�������");
			
			Receive r8=new Receive();
			
			String str3=r8.receive();
			
			fixed_name.fix(user, str3);
			
			break;
			
		case 3://��ְҵ
			
			System.out.println("�������µ�ְҵ");
			
			Receive r9=new Receive();
			
			String str4=r9.receive();
			
			fixed_role.fix(user, str4);
			
			break;
			
		case 4://�ĵ绰
		
			System.out.println("�������µĵ绰��");
			
			Receive r10=new Receive();
			
			String str5=r10.receive();
			
			fixed_tel.fix(user, str5);
			
			break;
		}
		
		 //��д�˻���
		
		Rewrite.rewrite(accounts);
		
		System.out.println();
		
		System.out.println("��ѡ�����1.�����޸�2.������һ��");
		
		Receive r=new Receive();
		
		if("1".equals(r.receive()))
			
			{
			
			Menu_fix.menu_fix(user,accounts);
			
			}
	}
}
