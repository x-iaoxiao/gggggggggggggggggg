package load;

import java.util.ArrayList;
import java.util.Iterator;

import main.Account;//�����˻���
import main.Receive;//����Ӽ��̽�����Ϣ��

//ʵ�ֵ�¼���ܵ���
public class Loading {

	Account account;
	public Account load(ArrayList<Account> accounts) {
		//��ʾ��Ϣ
		System.out.println("�����������˺ţ������֤�ţ�");
		//�������
		Receive recv1=new Receive();
		//���Ӽ��̽��յ�����Ϣ����
		String card=recv1.receive();
		//������յ�����Ϣ
		Object obj=(Object)accounts;
		//���ñ�־
        Boolean flag=false;
        Boolean f=false;
        //����¼�˻��Ƿ���ڣ��Բ����˻�����б���
        for(Account ac:accounts) {
        	//������Ϣ���ڿ��Ż������֤�ŷ��ش���
        	if(ac.getCar_id().equals(card)||ac.getPerson().getId().equals(card))flag=true;
        	account=ac;
        	break;
        }
        
        //���������
	    if(!flag)
	    	{
	    	System.out.println("������һ���ٵ��˺ţ��˺Ų����ڣ���������ˢ�º��������");
	    	account=null;
	    	}
	    //�˻�����
	    else {
		   for(int i=1;i<4;i++) 
		   {
		   System.out.println("���������룺");
		   Receive recv2=new Receive();
			String key=recv2.receive();
			
			if(account.getKeyword().equals(key))
				{
				System.out.println("��¼�ɹ���");
				f=true;
				break;
				}
			
			else 
				{
				System.out.println("���벻��ȷ���㻹��"+(3-i)+"�λ���������������");
				if(3-i==0) {
					System.out.println("���Ѿ�3�����ϵͳ�����Զ��˳�������");
					account=null;	
				}
				}
		    }
	       }
		return account;
}
}
