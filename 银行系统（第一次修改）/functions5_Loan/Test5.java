package functions5_Loan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Date;
import java.util.TreeMap;
import java.util.Map.Entry;

import basic.Account;


//�������ҵ���µĲ�������

public class Test5 {

public static void Loan_rewrite1(Account user,TreeMap<String,Object>map) throws IOException {
		
		//�����
		File file =new File("D:/���е�һ���޸�/��־.txt");
		
		if(file.exists()) {}
		else file.createNewFile();
		
		Writer out =new OutputStreamWriter(new FileOutputStream(file));

		//��������¼����map
		
		String key = user.getCar_id();
		
		StringBuffer value = new StringBuffer("\t���뵽"+user.getLoan_limit()+"Ԫ����\t"+new Date());
		
		map.put(key, value);

		//��map�е����ݰ���ʽ�ݴ浽StringBuffer stb��
		StringBuffer stb=new StringBuffer();
		
		for(Entry<String,Object>entry:map.entrySet()) {
			
			stb.append(entry.getKey() );
			
			stb.append(",");
			
			stb.append(entry.getValue());
			
	    	stb.append("\n");
			
		}

        out.write(stb.toString());
  
		out.flush();

		out.close();
 	}
	

public static void Loan_rewrite2(Account user,TreeMap<String,Object>map) throws IOException {
	
	//�����
	File file =new File("D:/���е�һ���޸�/��־.txt");
	
	if(file.exists()) {}
	else file.createNewFile();
	
	Writer out =new OutputStreamWriter(new FileOutputStream(file));

	//��������¼����map
	
	String key = user.getCar_id();
	
	StringBuffer value = new StringBuffer("\tʹ����"+user.getN_repay()+"Ԫ����\t"+new Date());
	
	map.put(key, value);

	//��map�е����ݰ���ʽ�ݴ浽StringBuffer stb��
	StringBuffer stb=new StringBuffer();
	
	for(Entry<String,Object>entry:map.entrySet()) {
		
		stb.append(entry.getKey() );
		
		stb.append(",");
		
		stb.append(entry.getValue());
		
    	stb.append("\n");
		
	}

    out.write(stb.toString());

	out.flush();

	out.close();
	}
	
}
