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

//���ڱ���ת�����͵Ķ�̬�ķ���

public class Test3 {

	public static void Transfer_rewrite(Account user,Account aim,BigDecimal money,TreeMap<String,Object>map) throws IOException {
	        
		//�����
		File file =new File("D:/���е�һ���޸�/��־.txt");
			
		if(file.exists()) {}
		else file.createNewFile();
			
		Writer out =new OutputStreamWriter(new FileOutputStream(file));

		//��������¼����map
			
		String key1 = user.getCar_id();
			
		StringBuffer value1 = new StringBuffer("\t��"+aim.getCar_id()+"ת��"+money+"Ԫ\t"+new Date());
			
		map.put(key1, value1);
			
		StringBuffer value2 = new StringBuffer("\t�յ�"+user.getCar_id()+"ת��"+money+"Ԫ\t"+new Date());
			
		map.put(aim.getCar_id(),value2 );

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
