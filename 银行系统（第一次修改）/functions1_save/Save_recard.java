package functions1_save;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import basic.Account;

//��¼�˻��Ķ�̬
public class Save_recard {

	static public void recard(Account user,BigDecimal money) throws IOException {
		
		File file =new File("D:/���е�һ���޸�/��־.txt");
		
		if(file.exists()) {}
		else file.createNewFile();
		
		Writer out =new OutputStreamWriter(new FileOutputStream(file));
		
		String str=user.getCar_id()+",\t����"+money+"Ԫ\t";
		
		Date date = new Date(); 
		
		out.write(str);
		
		out.flush();
		
		out.close();
	}
}
