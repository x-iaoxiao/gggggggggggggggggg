package functions3_transfer;

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

public class Transfer_recard {
	
	static public void recard(Account user,String aim,BigDecimal money,TreeMap<String,Object>map) throws IOException {

	File file =new File("D:/���е�һ���޸�/��־.txt");
	
	if(file.exists()) {}
	else file.createNewFile();
	
	
	Writer out =new OutputStreamWriter(new FileOutputStream(file));
	
	String str1="\t��"+aim+"ת�ˣ�"+money+"Ԫ\t";
	
	String str2="\t�յ�"+user.getCar_id()+"ת�ˣ�"+money+"Ԫ\t";
	
	Date date = new Date(); 
	
	map.put(user.getCar_id(), str1+date);
	
	map.put(aim, str2+date);
	
//	Date date = new Date(); 
	
//	StringBuffer stb = new StringBuffer(user.getCar_id()+str1+date+"\n"+aim+str2+date+"\n");
	
	StringBuffer stb = new StringBuffer();
	
	
	
	for(Entry<String,Object>entry:map.entrySet()) {
		
		stb.append(entry.getKey() );
		
		stb.append(",");
		
		stb.append(entry.getValue());
		
    	stb.append("\n");
		
	}
	
	
	
	
	
	
	out.write(new String(stb));
	
//	out.write(new String(stb2));
	
	out.flush();
	
	out.close();
}
}
