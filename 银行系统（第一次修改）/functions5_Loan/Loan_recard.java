package functions5_Loan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;

import basic.Account;

public class Loan_recard {
	
	static public void recard(Account user) throws IOException {
		
		File file =new File("D:/���е�һ���޸�/��־.txt");
		
		if(file.exists()) {}
		else file.createNewFile();
		
		Writer out =new OutputStreamWriter(new FileOutputStream(file));
		
		String str = user.getCar_id()+",�����"+user.getLoan_limit()+"Ԫ�Ĵ�����\t";
		
		Date date = new Date(); 
		
		StringBuffer stb = new StringBuffer(str+date+"\n");
		
		out.write(new String(stb));
		
		out.flush();
		
		out.close();
		
	}

}
