package functions4_query;

import basic.Function;
import tools.GetDiary;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import basic.Account;

public class C_query implements Query,Function{

	@Override
	public void show_account(Account user) {
		
		System.out.println("账号:"+user.getCar_id());
		
	    System.out.println("持有人:"+user.getPerson());
	    
	    System.out.println("开户银行:"+user.getBank());
	    
	    System.out.println("开户时间:"+user.getDatedate());

		System.out.println("账户余额:"+user.getBalance());
		
	    System.out.println("贷款额度:"+user.getLoan_limit());
	    
	    System.out.println("待还金额:"+user.getN_repay());
		
	}

	public void show_recently(Account user)  {
		
		GetDiary d=GetDiary.getInstance();
		
		System.out.println(d.getDiary(user));
		
	}


}
