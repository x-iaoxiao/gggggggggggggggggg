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
import java.util.TreeMap;

import basic.Account;

//从磁盘读取日志信息（账户动态），使用单例模式，模拟缓存
public class GetDiary {

	private static GetDiary getdiary = new GetDiary();
	
	private GetDiary() {}
	
	public static GetDiary getInstance() {
		
		return getdiary;
	}
	
	//从磁盘读取所有的动态
	public TreeMap<String,Object> getDiary() {
		
		TreeMap<String,Object> map_all=new TreeMap();
		
		//从磁盘中读取账户信息，将每条信息保存为String类型，所有信息存入List list中
    	File file_account = new File("D:/银行第一次修改/日志.txt"); 
    	
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
    	
    	for(int i=0;i<list.size();i++) {
    		
    		str[i]=list.get(i);
    	}
		
    	
    	//将每一条String类型的完整的账户信息拆成每一项信息，将每条拆分后的信息存入list temp
    	
    	List<String[]> temp= new ArrayList<String[]>();
    	
    	int j=0;//表示每一条记录
    	
    	while(j<str.length) {
    		
    		String[] s= new String[15];//这里的10代表：每条记录包含10个信息
    		
    		//p表示每条记录的每一项
    		
    		for(int p=0;p<str[j].split(",").length;p++) 
    		{
    			
    			s[p]=str[j].split(",")[p];
    			
    		}

    		temp.add(s);
    		
    		j++;
    		
    	}
    	
       //从temp中读取信息，用setXXX 构造map_all

    	int f=0;
    	
    	while(f<temp.size()) {
    		
    		String[] t=temp.get(f);
    		
    		map_all.put(t[0],t[1]);
    		
    		f++;
    	}
//    	System.out.println(map_all);
		return map_all;
	}
	
	
	
	//从磁盘读取user的动态(返回满足条件的动态)
    public TreeMap<String,Object> getDiary(Account user) {
		
		TreeMap<String,Object> map_user=new TreeMap();
		
		//从磁盘中读取账户信息，将每条信息保存为String类型，所有信息存入List list中
    	File file_account = new File("D:/银行第一次修改/日志.txt"); 
    	
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
    	
    	for(int i=0;i<list.size();i++) {
    		
    		str[i]=list.get(i);
    	}
		
    	
    	//将每一条String类型的完整的账户信息拆成每一项信息，将每条拆分后的信息存入list temp
    	
    	List<String[]> temp= new ArrayList<String[]>();
    	
    	int j=0;//表示每一条记录
    	
    	while(j<str.length) {
    		
    		String[] s= new String[15];//这里的10代表：每条记录包含10个信息
    		
    		//p表示每条记录的每一项
    		
    		for(int p=0;p<str[j].split(",").length;p++) 
    		{
    			
    			s[p]=str[j].split(",")[p];
    			
    		}

    		temp.add(s);
    		
    		j++;
    		
    	}
    	
       //从temp中读取信息，用setXXX 构造map_all

    	int f=0;
    	
    	while(f<temp.size()) {
    		
    		String[] t=temp.get(f);
    		
    		if(t[0].equals(user.getCar_id()))map_user.put(t[0],t[1]);
    		
    		f++;
    	}
		
//    	System.out.println(map_user);
		return map_user;
	}
}
