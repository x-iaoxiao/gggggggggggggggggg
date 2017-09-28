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
		
		System.out.println("�˺�:"+user.getCar_id());
		
	    System.out.println("������:"+user.getPerson());
	    
	    System.out.println("��������:"+user.getBank());
	    
	    System.out.println("����ʱ��:"+user.getDatedate());

		System.out.println("�˻����:"+user.getBalance());
		
	    System.out.println("������:"+user.getLoan_limit());
	    
	    System.out.println("�������:"+user.getN_repay());
		
	}

	public void show_recently(Account user)  {
		
		GetDiary d=GetDiary.getInstance();
		
		System.out.println(d.getDiary(user));
		
	}


}
