package menue;

import draw.Drawing;
import loan.Loaning;
import main.Account;
import main.Receive;
import save.Saving;
import show.Show_accountInformation;
import transfer.Transfering;

public class Menue {

	
		Receive recv=new Receive();
		Integer b=Integer.valueOf(recv.receive());
		int a=b.intValue();

		
		Drawing d=new Drawing();
		
		Saving s=new Saving();
		
		Transfering t=new Transfering();
		
		Loaning l=new Loaning();
		
		Show_accountInformation sh=new Show_accountInformation();
		
		
		
		
		
	}


