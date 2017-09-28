package severse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import basic.Account;
import functions_login.Login;
import menu.Menu;
import tools.GetAccounts;
import tools.GetDiary;

//����㣬Ԥ�ȼ����˻���Ϣ�Ͷ�̬��־��������¼ģ��Ͳ˵�ģ��
public class Severse {
	
    static List<Account> accounts=new ArrayList<Account>();
    
    static TreeMap<String,Object> map=new TreeMap();
	
	 {
		
		System.out.println("���ڼ����˻���Ϣ...");
		
		//�����˻���Ϣ
		
		//1.���ı��ĵ�������Ϣ
		
		GetAccounts getaccounts=GetAccounts.getInstace();
		
		accounts=getaccounts.getAccounts();
		
		//2.�ӱ������Ϣ
		
		//������־��Ϣ

		GetDiary getdiary=GetDiary.getInstance();
		
		map=getdiary.getDiary();
		
		System.out.println("�˻���Ϣ���سɹ���");
		
		System.out.println("���ڽ�������ϵͳ...");
	}
	
	//��ҪԤ�ȼ��ص�ģ��
    public static Login login=new Login();
		
    public static Menu menu=new Menu();
		
    
    
	//�����
	public Severse() {}
	
	public void active() throws IOException{
		
		Account user=new Account();
		
		user=login.login((ArrayList<Account>)accounts);
		
		if(login==null) System.exit(0);
		
		else {
			
			System.out.println("welcome,"+user.getPerson().getName());
			
			while(true)
				
			menu.active(user,(ArrayList<Account>)accounts,map);
			
		}
		
	}
	
}
