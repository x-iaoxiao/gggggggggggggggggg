package severse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import basic.Account;
import functions_login.Login;
import menu.Menu;
import tools.GetAccounts;
import tools.GetDiary;

//服务层，预先加载账户信息和动态日志，调动登录模块和菜单模块
public class Severse {
	
    static List<Account> accounts=new ArrayList<Account>();
    
    static TreeMap<String,Object> map=new TreeMap();
	
	 {
		
		System.out.println("正在加载账户信息...");
		
		//加载账户信息
		
		//1.从文本文档导入信息
		
		GetAccounts getaccounts=GetAccounts.getInstace();
		
		accounts=getaccounts.getAccounts();
		
		//2.从表格导入信息
		
		//加载日志信息

		GetDiary getdiary=GetDiary.getInstance();
		
		map=getdiary.getDiary();
		
		System.out.println("账户信息加载成功！");
		
		System.out.println("正在进入银行系统...");
	}
	
	//需要预先加载的模块
    public static Login login=new Login();
		
    public static Menu menu=new Menu();
		
    
    
	//服务层
	public Severse() {}
	
	public void active() throws IOException{
		
		Account user=new Account();
		
		user=login.login((ArrayList<Account>)accounts);
		
		if(login==null) System.exit(0);
		
		else {
			
			System.out.println("welcome,"+user.getPerson().getName());
			
			while(true)
				
			menu.active(user,(ArrayList<Account>)accounts,map);
			
		}
		
	}
	
}
