package draw;

import java.util.Date;

import main.Account;

//ʵ��ȡǮ���ܵ���
public class Drawing implements Draw_money{

	@Override
	public void draw(Account user, double money) {
		
		if(user.getBalance()>=money)
			{
			Date date=new Date();
			user.setBalance(user.getBalance()-money);
			System.out.println(date+"\t֧����"+money+"\t�������Ϊ��"+user.getBalance());
			}
		else System.out.println("����������������������");
	}

	
}
