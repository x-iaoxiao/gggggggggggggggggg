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
//����save�µĶ�̬��Ϣ
import tools.GetDiary;

//���ڱ��� ������Ͷ�̬ �ķ���

public class Test {

	public static void Save_rewrite(Account user,BigDecimal money,TreeMap<String,Object>map) throws IOException {
		
		//�����
		File file =new File("D:/���е�һ���޸�/��־.txt");
		
		if(file.exists()) {}
		else file.createNewFile();
		
		Writer out =new OutputStreamWriter(new FileOutputStream(file));

		//��������¼����map
		
		String key = user.getCar_id();
		
		StringBuffer value = new StringBuffer("\t����"+money+"Ԫ\t"+new Date());
		
		map.put(key, value);
		
		//��map�е����ݰ���ʽ�ݴ浽StringBuffer stb��
		StringBuffer stb=new StringBuffer();
		
		for(Entry<String,Object>entry:map.entrySet()) {
			
			stb.append(entry.getKey() );
			
			stb.append(",");
			
			stb.append(entry.getValue());
			
	    	stb.append("\n");
			
		}

		//��stb�е����ݴ�����±�
		
        out.write(stb.toString());
 
		out.flush();
	
		out.close();

 	}
	
}
