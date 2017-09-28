package tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import basic.Account;
import org.apache.commons.lang3.ArrayUtils;


//ģ�⻺�棬�����ϵ���Ϣ��ȡ���ڴ��в��������Ϊ���õ��˻���Ϣ

public class GetAccounts {

	private static  GetAccounts getaccounts=new GetAccounts();
	
//	private List<Account>accounts = new ArrayList<Account>();
	
	private GetAccounts() {}//���캯��
	
	//����
	public static GetAccounts getInstace() {
		
		return getaccounts;
		
	}
	
	public List<Account> getAccounts(){
		
		List<Account>accounts = new ArrayList<Account>();
		
        //1.���ı��ĵ�������Ϣ
		
		//�Ӵ����ж�ȡ�˻���Ϣ����ÿ����Ϣ����ΪString���ͣ�������Ϣ����List list��
    	File file_account = new File("D:/���е�һ���޸�/�˻���Ϣ.txt"); 
    			
    	
    	//Reader reader = new InputStreamReader(new FileInputStream(file_account));
    	Reader reader = null;
    			
    	try {
    		  reader = new InputStreamReader(new FileInputStream(file_account));
    		} catch (FileNotFoundException e) {
    				
        		e.printStackTrace();
    		}
    			
    	//��ÿһ����Ϣ��Ϊһ��String���͵ļ�¼��������	
    			
    	BufferedReader buffer=new BufferedReader(reader);
    			
    	List<String> list=new ArrayList<String>();
    			
    	try {
    			while(buffer.ready()) {
    					
    					list.add(buffer.readLine());
    				}
    		} catch (IOException e) {
    				
    				e.printStackTrace();
    		}
	
    	
    	 //��list��ȡ��ÿһ����Ϣ������String[] str��
    	
    	Iterator<String> it= list.iterator();
    	
    	String[] str=new String[list.size()];
    	
//    	int i=0;
//    	
//    	while(it.hasNext()&&i<list.size())
//    	{
//    		
//    		str[i]=(String)it.next();
//    		
//    		i++;
//    		
//    	}
    	for(int i=0;i<list.size();i++) {
    		
    		str[i]=list.get(i);
    	}
    	
    	//��ÿһ��String���͵��������˻���Ϣ���ÿһ����Ϣ����ÿ����ֺ����Ϣ����list temp
    	
    	List<String[]> temp= new ArrayList<String[]>();
    	
//    	Iterator<String[]> it_temp=temp.iterator();
    	
    	int j=0;//��ʾÿһ����¼
    	
    	while(j<str.length) {
    		
    		String[] s= new String[15];//�����10����ÿ����¼����10����Ϣ
    		
    		//p��ʾÿ����¼��ÿһ��
    		
    		for(int p=0;p<str[j].split(",").length;p++) 
    		{
    			
    			s[p]=str[j].split(",")[p];
    			
    		}

    		temp.add(s);
    		
//    		it_temp.next();
    		
    		j++;
    		
    	}
		
    	
    	
    	//��temp�ж�ȡ��Ϣ����setXXX ����accounts
    	
//    	Iterator<String[]> it_temp=temp.iterator();
    	
//    	while(it_temp.hasNext()) {
    	
    	int f=0;
    	
    	while(f<temp.size()) {
    		
    		String[] t=temp.get(f);
    		
    		Account a=new Account();
    		
    		a.setCard_id(t[0]);
    		
    		a.setBank(t[1]);
    		
    		a.setDatedate(t[2]);
    		
    		a.setKeyword(t[3]);
    		
    		a.getPerson().setId(t[4]);
    		
    		a.getPerson().setName(t[5]);
    		
    		a.getPerson().setTel(t[6]);
    		
    		a.getPerson().setAddr(t[7]);
    		
    		a.getPerson().setRole(t[8]);
    		
    		a.setBalance(BigDecimal.valueOf(Double.valueOf(t[9])));
    		
    		a.setLoan_limit(BigDecimal.valueOf(Double.valueOf(t[10])));
    		
    		a.setUsed_limit(BigDecimal.valueOf(Double.valueOf(t[11])));
    		
    		a.setN_repay(BigDecimal.valueOf(Double.valueOf(t[12])));
    		
    		accounts.add(a);
    		
    		f++;
    	}
    	
    	return accounts;
    	
	}

	
}
