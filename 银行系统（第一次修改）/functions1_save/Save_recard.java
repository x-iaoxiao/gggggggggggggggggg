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

//记录账户的动态
public class Save_recard {

	static public void recard(Account user,BigDecimal money) throws IOException {
		
		File file =new File("D:/银行第一次修改/日志.txt");
		
		if(file.exists()) {}
		else file.createNewFile();
		
		Writer out =new OutputStreamWriter(new FileOutputStream(file));
		
		String str=user.getCar_id()+",\t存入"+money+"元\t";
		
		Date date = new Date(); 
		
		out.write(str);
		
		out.flush();
		
		out.close();
	}
}
