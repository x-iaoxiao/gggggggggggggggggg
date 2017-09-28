package functions1_save;
//import java.io.BufferedWriter;
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
//保存save下的动态信息
import tools.GetDiary;

//用于保存 存款类型动态 的方法

public class Test {

	public static void Save_rewrite(Account user,BigDecimal money,TreeMap<String,Object>map) throws IOException {
		
		//输出流
		File file =new File("D:/银行第一次修改/日志.txt");
		
		if(file.exists()) {}
		else file.createNewFile();
		
		Writer out =new OutputStreamWriter(new FileOutputStream(file));

		//将本条记录存入map
		
		String key = user.getCar_id();
		
		StringBuffer value = new StringBuffer("\t存入"+money+"元\t"+new Date());
		
		map.put(key, value);
		
		//将map中的数据按格式暂存到StringBuffer stb中
		StringBuffer stb=new StringBuffer();
		
		for(Entry<String,Object>entry:map.entrySet()) {
			
			stb.append(entry.getKey() );
			
			stb.append(",");
			
			stb.append(entry.getValue());
			
	    	stb.append("\n");
			
		}

		//将stb中的数据存入记事本
		
        out.write(stb.toString());
 
		out.flush();
	
		out.close();

 	}
	
}
