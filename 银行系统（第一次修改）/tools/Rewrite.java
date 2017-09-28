package tools;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import basic.Account;

//在账户有操作之后，重写账户信息
public class Rewrite {
	
	public static void rewrite(ArrayList<Account>accounts) throws IOException {
		
	
		File file = new File("D:/银行第一次修改/账户信息.txt");
		
		if(file.exists()) {}
		else file.createNewFile();
		
		Writer out =new OutputStreamWriter(new FileOutputStream(file));
		
		StringBuffer stb=new StringBuffer();
		
		for(int i=0 ;i<accounts.size();i++) {
			
			stb.append(accounts.get(i).getCar_id());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getBank());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getDatedate());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getKeyword());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getPerson().getId());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getPerson().getName());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getPerson().getTel());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getPerson().getAddr());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getPerson().getRole());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getBalance());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getLoan_limit());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getUsed_limit());
			
			stb.append(",");
			
			stb.append(accounts.get(i).getN_repay());
			
			stb.append("\n");
		}
		
		out.write(stb.toString());;
		
		out.flush();
		
		out.close();
		
	}
}
