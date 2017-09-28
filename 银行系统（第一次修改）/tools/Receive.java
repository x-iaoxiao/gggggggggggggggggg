package tools;

import java.util.Scanner;

//从接盘接受信息的方法，（想要  使用单例模式）
public class Receive {

	public String receive() {
		
		String receive=new Scanner(System.in).next();
		
		return receive;
	}
}