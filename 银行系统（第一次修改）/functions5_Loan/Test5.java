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


//保存贷款业务下的操作的类

public class Test5 {

public static void Loan_rewrite1(Account user,TreeMap<String,Object>map) throws IOException {
		
		//输出流
		File file =new File("D:/银行第一次修改/日志.txt");
		
		if(file.exists()) {}
		else file.createNewFile();
		
		Writer out =new OutputStreamWriter(new FileOutputStream(file));

		//将本条记录存入map
		
		String key = user.getCar_id();
		
		StringBuffer value = new StringBuffer("\t申请到"+user.getLoan_limit()+"元贷款\t"+new Date());
		
		map.put(key, value);

		//将map中的数据按格式暂存到StringBuffer stb中
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
	
	//输出流
	File file =new File("D:/银行第一次修改/日志.txt");
	
	if(file.exists()) {}
	else file.createNewFile();
	
	Writer out =new OutputStreamWriter(new FileOutputStream(file));

	//将本条记录存入map
	
	String key = user.getCar_id();
	
	StringBuffer value = new StringBuffer("\t使用了"+user.getN_repay()+"元贷款\t"+new Date());
	
	map.put(key, value);

	//将map中的数据按格式暂存到StringBuffer stb中
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
