package main;

import java.util.ArrayList;

import draw.Drawing;
import fixed.*;
import load.Loading;
import loan.Loaning;
import save.Saving;
import show.Show_accountInformation;
import transfer.Transfering;

//bank���Գ���
public class Test_bank {
	
	
	
	
	
	static public void main(String[] args) {
	//����һ����������������е��˻���Ϣ
    ArrayList<Account> accounts=new ArrayList<Account>();
    //���������û���ʼ������ϵͳ
    Person p1=new Person("140121199702190001","����","15735104420","ɽ��̫ԭ","ѧ��");
    Person p2=new Person("140121199601060002","��Ұ","15735104385","ɽ��̫ԭ","ѧ��");
    Person p3=new Person("140121200309070003","��Խ","18334777116","ɽ��̫ԭ","ѧ��");
    Account account1=new Account("��������","123456",p1,1000);
    Account account2=new Account("��������","123456",p2,1000);
    Account account3=new Account("��������","123456",p3,1000);
    accounts.add(account1);
    accounts.add(account2);
    accounts.add(account3); 
    //��ʾ��Ϣ	
	System.out.println("���ȵ�¼��");	
	//ϵͳ��¼
//	Loading load=new Loading();
//	Account user=load.load(accounts);
//	Receive r1=new Receive();
//	Integer b=Integer.valueOf(r1.receive());
//	int a=b.intValue();
	//��¼�ɹ������������
	Account user=account1;
	
	System.out.println("------------------��ӭ��������ϵͳ----------------");
	System.out.println("�����������ѡ������Ҫ��ȡ�ķ���");
	
	System.out.println("��1��ʵʱ���");
	System.out.println("��2��ȡ��");
	System.out.println("��3����ѯ");
	System.out.println("��4��ת��");
	System.out.println("��5����������");
	System.out.println("��6����������");
	System.out.println("��7�������˻�");
	System.out.println("��8���޸ĸ�����Ϣ");
	///////////////////////////////////////////////
	Receive r1=new Receive();
	Integer b=Integer.valueOf(r1.receive());
	int a=b.intValue();
	/////////////////////////////////////
	//�˵�
	switch(a) {
	
	case 1://���
		System.out.println("�������");
		Saving s=new Saving();
		Receive r3=new Receive();
		double c2=Double.parseDouble(r3.receive());
		s.save(user, c2);
		break;
	case 2://ȡ��
		System.out.println("����ȡ���");
		Drawing d=new Drawing();
		Receive r2=new Receive();
		double c1=Double.parseDouble(r2.receive());
		d.draw(user, c1);
		break;
	case 3://��ѯ
		Show_accountInformation so=new Show_accountInformation();
//		Receive r4=new Receive();
//		double c3=Double.parseDouble(r4.receive());
		so.show(user);
		break;
	case 4://ת��
		System.out.println("������Ŀ���˻���");
		Transfering t=new Transfering();
		Receive r6=new Receive();
		String c5=r6.receive();
		System.out.println("��ת�˽�");
		Receive r5=new Receive();
		double c4=Double.parseDouble(r5.receive());
//		Receive r6=new Receive();
//		String c5=r6.receive();
		t.transfer(user,c5,accounts,c4);
		break;
	case 5://����
		Loaning l=new Loaning();
//		Receive r7=new Receive();
//		double c6=Double.parseDouble(r7.receive());
		System.out.println("��ѯ��...");
		l.request_loan(user);
		break;
	case 6://����
		break;
	case 7://�����˻�
		break;
	case 8://�޸���Ϣ
		{
			System.out.println("�����������ѡ������Ҫ��ȡ�ķ���");
			System.out.println("��1���޸�סַ");
			System.out.println("��2��ȡ�����֤��Ϣ");
			System.out.println("��3���޸�����");
			System.out.println("��4���޸�ְҵ");
			System.out.println("��5���޸ĵ绰");
			Receive r8=new Receive();
			int c7=Integer.parseInt(r8.receive());
			switch(c7) {
			case 1://�ĵ�ַ
				Fix_addr fa=new Fix_addr();
				System.out.println("�����µĵ�ַ��");
				Receive r9=new Receive();
				String str1=r9.receive();
				fa.fix(user, str1);
				break;
			case 2://��id
				Fix_id fi=new Fix_id();
				System.out.println("�����µ����֤�ţ�");
				Receive r10=new Receive();
				String str2=r10.receive();
				fi.fix(user, str2);
				break;
			case 3://������
				Fix_name fn=new Fix_name();
				System.out.println("�����µ�������");
				Receive r11=new Receive();
				String str3=r11.receive();
				fn.fix(user, str3);
				break;
			case 4://��ְҵ
				Fix_role fr=new Fix_role();
				System.out.println("�������µ�ְҵ");
				Receive r12=new Receive();
				String str4=r12.receive();
				fr.fix(user, str4);
				break;
			case 5://�ĵ绰
				Fix_tel ft=new Fix_tel();
				System.out.println("�������µĵ绰��");
				Receive r13=new Receive();
				String str5=r13.receive();
				ft.fix(user, str5);
				break;
			}
		}
	}

//	for(Account a:accounts)System.out.println(a);
	
	}
}
