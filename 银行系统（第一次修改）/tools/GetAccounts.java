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


//模拟缓存，将盘上的信息读取到内存中并将其解析为可用的账户信息

public class GetAccounts {

	private static  GetAccounts getaccounts=new GetAccounts();
	
//	private List<Account>accounts = new ArrayList<Account>();
	
	private GetAccounts() {}//构造函数
	
	//单例
	public static GetAccounts getInstace() {
		
		return getaccounts;
		
	}
	
	public List<Account> getAccounts(){
		
		List<Account>accounts = new ArrayList<Account>();
		
        //1.从文本文档导入信息
		
		//从磁盘中读取账户信息，将每条信息保存为String类型，所有信息存入List list中
    	File file_account = new File("D:/银行第一次修改/账户信息.txt"); 
    			
    	
    	//Reader reader = new InputStreamReader(new FileInputStream(file_account));
    	Reader reader = null;
    			
    	try {
    		  reader = new InputStreamReader(new FileInputStream(file_account));
    		} catch (FileNotFoundException e) {
    				
        		e.printStackTrace();
    		}
    			
    	//将每一行信息作为一条String类型的记录保存起来	
    			
    	BufferedReader buffer=new BufferedReader(reader);
    			
    	List<String> list=new ArrayList<String>();
    			
    	try {
    			while(buffer.ready()) {
    					
    					list.add(buffer.readLine());
    				}
    		} catch (IOException e) {
    				
    				e.printStackTrace();
    		}
	
    	
    	 //从list中取出每一条信息，存入String[] str中
    	
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
    	
    	//将每一条String类型的完整的账户信息拆成每一项信息，将每条拆分后的信息存入list temp
    	
    	List<String[]> temp= new ArrayList<String[]>();
    	
//    	Iterator<String[]> it_temp=temp.iterator();
    	
    	int j=0;//表示每一条记录
    	
    	while(j<str.length) {
    		
    		String[] s= new String[15];//这里的10代表：每条记录包含10个信息
    		
    		//p表示每条记录的每一项
    		
    		for(int p=0;p<str[j].split(",").length;p++) 
    		{
    			
    			s[p]=str[j].split(",")[p];
    			
    		}

    		temp.add(s);
    		
//    		it_temp.next();
    		
    		j++;
    		
    	}
		
    	
    	
    	//从temp中读取信息，用setXXX 构造accounts
    	
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
