package functions_login;

import java.util.ArrayList;
import java.util.Iterator;

import basic.Account;
import tools.Receive;

//��¼���
public class Login {

	Account account=new Account();
	
	public Account login(ArrayList<Account> accounts) {
		
		
		//��ʾ��Ϣ
		System.out.println("�����������˺�:");
		
		//�������
		Receive recv1=new Receive();
		
		//�Ӽ��̽��յ�����Ϣ����
		String card=recv1.receive();
		
		//���ñ�־
        Boolean flag=false;
        
        Boolean f=false;
        
        //����¼�˻��Ƿ���ڣ��Բ����˻�����б���
        
//        Iterator<Account> it=accounts.iterator();
//        
//        while(it.hasNext()) {
//        	
//        	if(((Account)it.next()).getCar_id().equals(card))flag=true;
//        	
//        	account=it.next();
//        	
//        	break;
//        	
//        }
        
        for(Account ac:accounts) {
        	
        	//������Ϣ���ڿ��Ż������֤�ŷ��ش���
        	if(ac.getCar_id().equals(card))
        	
        	  {
        		flag=true;
       
        	    account=ac;
        
        	    break;
        	    
        	}
        	
        }
        
//        for(int i=0;i<accounts.size();i++) {
//        	
//        	if(accounts.get(i).getCar_id().equals(card))
//        		{
//        		flag=true;
//        		break;
//        		}
//        	
//        }
        
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
