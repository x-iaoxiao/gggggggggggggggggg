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

//�Ӵ��̶�ȡ��־��Ϣ���˻���̬����ʹ�õ���ģʽ��ģ�⻺��
public class GetDiary {

	private static GetDiary getdiary = new GetDiary();
	
	private GetDiary() {}
	
	public static GetDiary getInstance() {
		
		return getdiary;
	}
	
	//�Ӵ��̶�ȡ���еĶ�̬
	public TreeMap<String,Object> getDiary() {
		
		TreeMap<String,Object> map_all=new TreeMap();
		
		//�Ӵ����ж�ȡ�˻���Ϣ����ÿ����Ϣ����ΪString���ͣ�������Ϣ����List list��
    	File file_account = new File("D:/���е�һ���޸�/��־.txt"); 
    	
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
    	
    	for(int i=0;i<list.size();i++) {
    		
    		str[i]=list.get(i);
    	}
		
    	
    	//��ÿһ��String���͵��������˻���Ϣ���ÿһ����Ϣ����ÿ����ֺ����Ϣ����list temp
    	
    	List<String[]> temp= new ArrayList<String[]>();
    	
    	int j=0;//��ʾÿһ����¼
    	
    	while(j<str.length) {
    		
    		String[] s= new String[15];//�����10����ÿ����¼����10����Ϣ
    		
    		//p��ʾÿ����¼��ÿһ��
    		
    		for(int p=0;p<str[j].split(",").length;p++) 
    		{
    			
    			s[p]=str[j].split(",")[p];
    			
    		}

    		temp.add(s);
    		
    		j++;
    		
    	}
    	
       //��temp�ж�ȡ��Ϣ����setXXX ����map_all

    	int f=0;
    	
    	while(f<temp.size()) {
    		
    		String[] t=temp.get(f);
    		
    		map_all.put(t[0],t[1]);
    		
    		f++;
    	}
//    	System.out.println(map_all);
		return map_all;
	}
	
	
	
	//�Ӵ��̶�ȡuser�Ķ�̬(�������������Ķ�̬)
    public TreeMap<String,Object> getDiary(Account user) {
		
		TreeMap<String,Object> map_user=new TreeMap();
		
		//�Ӵ����ж�ȡ�˻���Ϣ����ÿ����Ϣ����ΪString���ͣ�������Ϣ����List list��
    	File file_account = new File("D:/���е�һ���޸�/��־.txt"); 
    	
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
    	
    	for(int i=0;i<list.size();i++) {
    		
    		str[i]=list.get(i);
    	}
		
    	
    	//��ÿһ��String���͵��������˻���Ϣ���ÿһ����Ϣ����ÿ����ֺ����Ϣ����list temp
    	
    	List<String[]> temp= new ArrayList<String[]>();
    	
    	int j=0;//��ʾÿһ����¼
    	
    	while(j<str.length) {
    		
    		String[] s= new String[15];//�����10����ÿ����¼����10����Ϣ
    		
    		//p��ʾÿ����¼��ÿһ��
    		
    		for(int p=0;p<str[j].split(",").length;p++) 
    		{
    			
    			s[p]=str[j].split(",")[p];
    			
    		}

    		temp.add(s);
    		
    		j++;
    		
    	}
    	
       //��temp�ж�ȡ��Ϣ����setXXX ����map_all

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
